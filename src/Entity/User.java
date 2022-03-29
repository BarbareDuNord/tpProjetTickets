/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author jacqu
 */
public class User
{
    private int idUser;
    private String nomUser;
    private String prenomUser;
    private String statutUser;
    
    public User(int unId, String unNom,String unPrenom,String unStatut)
    {
        idUser =unId;
        nomUser = unNom;
        prenomUser = unPrenom;
        statutUser = unStatut;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public String getStatutUser() {
        return statutUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     * @param nomUser the nomUser to set
     */
    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    /**
     * @param prenomUser the prenomUser to set
     */
    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    /**
     * @param statutUser the statutUser to set
     */
    public void setStatutUser(String statutUser) {
        this.statutUser = statutUser;
    }
}
