package com.exemple.bibliotheque.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Pret {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private Livre livre;

    private LocalDate datePret;
    private LocalDate dateRetour;

   
    public Pret() {}

    public Pret(Utilisateur utilisateur, Livre livre, LocalDate datePret, LocalDate dateRetour) {
        this.utilisateur = utilisateur;
        this.livre = livre;
        this.datePret = datePret;
        this.dateRetour = dateRetour;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }

    public Livre getLivre() { return livre; }
    public void setLivre(Livre livre) { this.livre = livre; }

    public LocalDate getDatePret() { return datePret; }
    public void setDatePret(LocalDate datePret) { this.datePret = datePret; }

    public LocalDate getDateRetour() { return dateRetour; }
    public void setDateRetour(LocalDate dateRetour) { this.dateRetour = dateRetour; }
}
