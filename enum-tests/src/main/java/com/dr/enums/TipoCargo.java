package com.dr.enums;

import java.math.BigDecimal;

public enum TipoCargo {
	GERENTE {
		@Override
		public BigDecimal bonificacaoColaborador(BigDecimal salario) {
			return salario.multiply(new BigDecimal("0.1"));
		}
	},
	SUPERVISOR {
		@Override
		public BigDecimal bonificacaoColaborador(BigDecimal salario) {
			return salario.multiply(new BigDecimal(0.2));
		}
	},
	AJUDANTE {
		@Override
		public BigDecimal bonificacaoColaborador(BigDecimal salario) {
			return salario.multiply(new BigDecimal(0.5f));
		}
	},
	DEV {
		@Override
		public BigDecimal bonificacaoColaborador(BigDecimal salario) {
			return salario.multiply(new BigDecimal(2L));
		}
	};

	/* metodo abstrato recebe o salario do colaborador parametro */
	public abstract BigDecimal bonificacaoColaborador(BigDecimal salario);
}
