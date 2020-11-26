package com.igorunip.myapplication;

import android.app.Application;

public class GlobalClass extends Application {

    private String name;
    private String email;
    private String saldo;
    private String saldoReal;
    private String login;



    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSaldoReal() {
        return saldoReal;
    }

    public void setSaldoReal(String saldoReal){
        this.saldoReal = saldoReal;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getAno() {return anoIgor="1998";}



    // Dados Igor ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private String loginIgor;
    private String senhaIgor;
    private String cpfIgor;
    private String anoIgor;
    private String RuaIgor;
    private String UFIgor;
    private String ComplementoIgor;
    private String CEPIgor;
    private String EstadoIgor;
    private String EmailIgor;
    private String DDDResidencialIgor;
    private String DDDcelularIgor;
    private String ResidencialIgor;
    private String celularIgor;

    public String getLoginIgor() {return loginIgor="admin";}

  /*  public String getSenhaIgor() {return senhaIgor;}

     public void setSenhaIgor(String senhaIgor){
        this.senhaIgor = senhaIgor;
    }
*/


    public String getAnoIgor() {return anoIgor="1998";}

    public String getCpfIgor() {return anoIgor="46632914810";}


    public String getUFIgor() {return UFIgor;}

    public void setUFIgor(String UFIgor) { this.UFIgor = UFIgor; }

    public String getComplementoIgor() {return ComplementoIgor;}

    public void setComplementoIgor(String ComplementoIgor) { this.ComplementoIgor = ComplementoIgor; }

    public String getCEPIgor() {return CEPIgor;}

    public void setCEPIgor(String CEPIgor) { this.CEPIgor = CEPIgor; }

    public String getRuaIgor() {return RuaIgor;}

    public void setRuaIgor(String RuaIgor) { this.RuaIgor = RuaIgor; }

    public String getEstadoIgor() {return EstadoIgor;}

    public void setEstadoIgor(String EstadoIgor) { this.EstadoIgor = EstadoIgor; }

    public String getEmailIgor() {return EmailIgor;}

    public void setEmailIgor(String EmailIgor) { this.EmailIgor = EmailIgor; }


    public String getDDDResidencialIgor() {return DDDResidencialIgor;}

    public void setDDDResidencialIgor(String DDDResidencialIgor) { this.DDDResidencialIgor = DDDResidencialIgor; }

    public String getDDDcelularIgor() {return DDDcelularIgor;}

    public void setDDDcelularIgor(String DDDcelularIgor) { this.DDDcelularIgor = DDDcelularIgor; }

    public String getcelularIgor() {return celularIgor;}

    public void setcelularIgor(String celularIgor) { this.celularIgor = celularIgor; }

    public String getResidencialIgor() {return ResidencialIgor;}

    public void setResidencialIgor(String ResidencialIgor) { this.ResidencialIgor = ResidencialIgor; }
    
    



}
