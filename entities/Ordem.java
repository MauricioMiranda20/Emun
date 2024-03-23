package entities;

import java.util.Date;

import entities.enums.OrdenStatus;

public class Ordem {
	private Integer num;
	private Date moment;
	private OrdenStatus status;
	
	public Ordem(Interger num, Date moment, OrdenStatus status) {
		super();
		this.num = num;
		this.moment = moment;
		this.status = status;
	}
	public Ordem() {
	}
	

	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrdenStatus getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Ordem [num=" + num + ", moment=" + moment + ", status=" + status + "]";
	}
}
