# Java: aplicando a Orientação a Objetos

- Aprender os conceitos da Orientação a Objetos utilizando o Java
- Modelar abstrações da aplicação via classes, atributos e métodos
- Utilizar herança como mecanismo de reaproveitamento de código
- Aplicar polimorfismo para tornar o código do projeto flexível
- Consolidar o conhecimento através de um desafio no final do curso

# Desafio:

Implementar uma aplicação para cadastrar nossas músicas e podcasts preferidos, modelando as classes utilizando os conceitos de orientação a objetos: abstração, herança, encapsulamento e polimorfismo.

## 🔨 Objetivos:

- Criar uma classe **Audio** com os atributos (titulo, totalReproducoes, totalCurtidas e classificacao).
- Utilizar encapsulamento, deixando os atributos privados e criando os *getters* e *setters* para acessar e modificar os atributos.
- Criar dois métodos sem retorno: curte() e reproduz(), que irão incrementar as variáveis totalCurtidas e totalReproducoes, respectivamente.
- Organizar o código em pacotes.
- Criar uma classe **Musica** estendendo de Audio, com os atributos adicionais **album**, **cantor** e **genero**.
- Criar uma classe **Podcast** estendendo de Audio, com os atributos adicionais **apresentador** e **descricao**.
- Criar uma classe Principal e instancie um objeto do tipo Musica e outro do tipo Podcast, preenchendo seus atributos;
- Criar um loop para chamar os métodos curte() e reproduz() a fim de simular um número grande de reproduções e curtidas.
- Fazer uma sobrescrita do método *getClassificacao* na classe Musica, definindo que se a mesma tiver mais de 2000 **reproduções** a classificação será 10 e para valores inferiores a classificação será 8.
- Fazer uma sobrescrita do método *getClassificacao* na classe Podcast, definindo que se o mesmo tiver mais de 500 **curtidas** a classificação será 10 e para valores inferiores, a classificação será 7.
- Criar uma classe chamada **MusicasPreferidas** ou apenas **Preferencias**, com um método sem retorno (void) chamado *inclui*, que receberá como parâmetro um Audio.
- No método inclui, trabalharemos o polimorfismo, onde iremos utilizar o *getClassificacao* (de acordo com a subclasse que for passada aqui como parâmetro) para exibir alguma mensagem. Para classificação igual ou superior a 9, iremos imprimir no terminal uma mensagem e se for inferior, imprimiremos uma outra mensagem.
- Finalizar instanciando um objeto do tipo **MusicasPreferidas** ou **Preferencias** e incluindo a música e podcast instanciados anteriormente.


<p></p>

Exemplo/Sugestão de mensagem a exibir para classificação superior e inferior a 9. 

<p></p>


![mensagem](https://user-images.githubusercontent.com/66698429/225436483-20234ade-8dbd-4136-99be-d255fe20e5a4.PNG)
