package com.krishna;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

	private List fruits;
	private Set crickters;
	private Map country_capital;

	public List getFruits() {
		return fruits;
	}

	public void setFruits(List fruits) {
		this.fruits = fruits;
	}

	public Set getCrickters() {
		return crickters;
	}

	public void setCrickters(Set crickters) {
		this.crickters = crickters;
	}

	public Map getCountry_capital() {
		return country_capital;
	}

	public void setCountry_capital(Map country_capital) {
		this.country_capital = country_capital;
	}

	public void show() {

		for (Object fruit : fruits) {
			System.out.println(fruit);
		}
		for (Object cric : crickters) {
			System.out.println(cric);
		}
		Set keys = country_capital.keySet();
		for (Object key : keys) {
			System.out.println("Country =" + " " + key + " " + "Capital =" + " " + country_capital.get(key));
		}
	}
}
