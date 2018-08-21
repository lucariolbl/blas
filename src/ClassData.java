import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassData {
    private int ano, mes, dia;

    public ClassData (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public ClassData (){
        this.dia = 2;
        this.mes = 2;
        this.ano = 2012;
    }

    public int getDia(){ return dia;}

    public int getMes(){ return mes;}

    public int getAno(){ return ano;}

    public void setDia(int dia) {this.dia = dia;}

    public void setMes(int mes) {this.mes = mes;}

    public void setAno(int ano) {this.ano = ano;}

    public boolean eAnoBisexto(){
        boolean eBisexto;
        eBisexto = this.ano % 4 == 0;
        return eBisexto;
    }

    public void proximoDia() {
        if(this.mes == 2) {
            if(eAnoBisexto()) {
                if(this.dia == 29) {
                    this.dia = 1;
                    this.mes = this.mes + 1;
                } else {
                    this.dia = this.dia +1;
                }
            } else {
                if(this.dia == 28) {
                    this.dia = 1;
                    this.mes = this.mes + 1;
                } else {
                    this.dia = this.dia + 1;
                }
            }
        }
        if(this.mes == 12) {
            if(this.dia == 31) {
                this.dia = 1;
                this.mes = 1;
                this.ano = this.ano + 1;
            } else {
                this.dia = this.dia + 1;
            }
        } else {
            if(this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10) {
                if(this.dia == 31) {
                    this.dia = 1;
                    this.mes = this.mes +1;
                } else {
                    this.dia = this.dia + 1;
                }
            } else {
                if(this.dia == 30) {
                    this.dia = 1;
                    this.mes = this.mes +1;
                } else {
                    this.dia = this.dia +1;
                }
            }
        }
    }

    public void adicionarDias(int dias) {
        for(int i= 0; i < dias; i++) {
            proximoDia();
        }
    }

    public int diasNoMes() {

        int dias;
        if(this.dia == 2) {
            if(eAnoBisexto()) {
                dias = 29;
            } else {
                dias = 28;
            }
        } else {
            if(this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
                dias = 31;
            } else {
                dias = 30;
            }
        }

        return dias;
    }

    public String diaDaSemana() {
        String dia;
        String input_date = this.dia + "/" + this.mes + "/" + this.ano;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(input_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DateFormat dayFormat = new SimpleDateFormat("EEEE");
        dia = dayFormat.format(date);
        return dia;
    }
}
