package clinique.mapping;

import java.util.Date;

public class TransactionCompteCategorie {
	
	private  String transactionId;
	
	private  String operation;
	private double montant;
	private CompteCategorie compte;
	private  String etat;
	private  String statut;
	private  String operateur;
	private Date dateTransaction;
	
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getOperateur() {
		return operateur;
	}
	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}
	public CompteCategorie getCompte() {
		return compte;
	}
	public void setCompte(CompteCategorie compte) {
		this.compte = compte;
	}
	public Date getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	
	

}
