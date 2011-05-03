package at.jku.ce;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	//main-Methode
	public static void main(String[] args) {

		Set<DomainObject> objectSet = new HashSet<DomainObject>();

		objectSet.add(new DomainObject("Helga"));
		objectSet.add(new DomainObject("Walter"));
		objectSet.add(new DomainObject("Hannah"));
		objectSet.add(new DomainObject("Paul"));
		objectSet.add(new DomainObject("Claudia"));
		objectSet.add(new DomainObject("Pascal"));
		objectSet.add(new DomainObject("Mario"));
		objectSet.add(new DomainObject("Gitti"));

		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.id);
		}

	}

}
