package Materias;

import estudio.Curso;

public class Ciencias extends Curso {

	public class Anatomia extends Ciencias {

	}

	public class Biologia extends Ciencias {

	}

	public class Quimica extends Ciencias {

		public class quimicaInOrganica extends Ciencias.Quimica {

		}

		public class quimicaOrganica extends Ciencias.Quimica {

		}

	}

}
