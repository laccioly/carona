package br.acme.exception;
import	java.lang.Exception;

public class RepositorioException	extends	Exception {
	
		/**
		 * 
	 	*/
		private static final long serialVersionUID = 1L;
		
		public RepositorioException(String mensagem)
		{
			super(mensagem);
		}
			
}
