/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

/**
 *
 * @author ALPC
 */
public class Carro {

    private int velocidade = 0;
    private boolean ligado;
  
    private String motor;

    public boolean acelera() {

        if (getVelocidade() > 120 && getMotor().equals("1.0")) {
            return false;
        }
        if (getVelocidade() > 160 && getMotor().equals("1.6")) {
            return false;
        }
        if (getVelocidade() > 180 && getMotor().equals("1.8")) {
            return false;
        }
        if (!isLigado()) {
            return false;
        }

        velocidade += 5;
        return true;
    }

    public void freia() {
        //operador ternário
        //velocidade é menor que 10? Se sim velocidade recebe 0, se não diminui 10 do valor.

        velocidade = getVelocidade() < 10 ? 0 : -10;

//outra opção
//       if(velocidade < 10)
//           velocidade=0;
//       else
//        velocidade-=10;
    }

    public void ligar() {
        setLigado(true);
    }

    public boolean desligar() {
        if (getVelocidade() > 0) {
            return false;
        }
        setLigado(false);
        return true;
    }

     /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * @return the ligado
     */
    public boolean isLigado() {
        return ligado;
    }

    /**
     * @param ligado the ligado to set
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
