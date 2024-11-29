// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

/************************************************************/
package Nicoli.IngDelSw.model;
import java.time.LocalDate;

/**
 * 
 */
public abstract class Visit {
	/**
	 * 
	 */
	public int patient_id;
	/**
	 * 
	 */
	public int treatment_id;
	/**
	 * 
	 */
	public int medic_id;
	/**
	 * 
	 */
	public LocalDate date;
	/**
	 * 
	 */
	public int localization_id;
	/**
	 * 
	 */
	public String notes;
	/**
	 * 
	 */
	public int visit_id;
	/**
	 * 
	 */
	public Localization[] localization;
	/**
	 * 
	 */
	public Photos[] photos;

	/**
	 * 
	 */
	public void treatment() {
	}

	/**
	 * 
	 */
	public void localization() {
	}

	/**
	 * 
	 */
	public void photos() {
	}
}
