
		package agenda;

		import java.util.List;

		public class testaLista {

			public static void main(String[] args) {
				ContatoDAO dao = new ContatoDAO();
				List<Contato> contatos = dao.getLista();
				for(Contato contato : contatos) {
					System.out.println("Código: " + contato.getId());
					System.out.println("Nome: " + contato.getNome());
					System.out.println("EndereÃ§o: " + contato.getEndereco());
					System.out.println("E-mail: " + contato.getEmail());
					System.out.println("Data de Nascimento: " 
										+ contato.getDataNascimento().getTime()+"\n");
				}
			}

		}

