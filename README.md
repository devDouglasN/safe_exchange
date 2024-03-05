# Sobre o projeto 
## 📦 SafeExchange 
SafeExchange é uma aplicação web na qual os usuários podem cadastrar pedidos e fazer ofertas para os pedidos de outros usuários, inserindo informações como valor e data de entrega.
<br>

## 🎥  Assista ao vídeo do projeto  
### Vídeo detalhado do projeto onde cada recurso é explicado e demonstrado em ação! Veja abaixo:



https://github.com/devDouglasN/safe_exchange/assets/122110326/90905e18-f03b-4832-8baa-edef366b7af2



<br>


## 🏁 Inicializando
### Foi realizado o deploy desta aplicação na AWS. Para testá-la, clique no link abaixo:

http://54.88.105.4:8081/login 

Abaixo estão as credenciais padrão de login para acesso à aplicação:

  "Usuário": 
  ```
  usuario@test.com
  ````
  "senha": 
  ```
  123
````


## ⚡ Compilando e inicializando 
Gerar os arquivos-fonte conforme o padrão de um projeto Maven.  
`mvn clean install`

+ http://localhost:8080/home  
+ http://localhost:8080/oferta  
+ http://localhost:8080/pedido  
+ http://localhost:8080/usuario  
+ http://localhost:8080/login    

<br>

## ⚙️ Funcionalidades
+ CRUD de Ofertas;
+ CRUD de Pedidos;
+ CRUD de Usuários;
+ Cadastros de produtos;
+ Ofertas para produtos;

<br>

## 🛠️ Tecnologias

<table>
  <tr>
    <td>Java</td>
    <td>Spring Boot</td>
    <td>Spring MVC</td>
    <td>Spring DevTools</td>
    <td>Spring Security</td>
    <td>JPA</td>
    <td>Maven</td>
    <td>Bootstrap</td>
    <td>Axios</td>
    <td>MySQL</td>
  </tr>
  <tr>
     <td>17</td>
    <td>3.1.0</td>
    <td>3.1.0</td>
    <td>3.1.0</td>
    <td>3.1.0</td>
    <td>3.1.0</td>
    <td>3.9.6</td>
    <td>5.3.3</td>
    <td>1.5.0</td>
    <td>8.0</td>
  </tr>
</table>

<br>

## ⏳ Getting Started
### Se você deseja executar a aplicação localmente, siga estes passos:
+ [Baixar o ZIP do projeto](https://github.com/devDouglasN/safe_exchange/archive/refs/heads/main.zip) e abri-lo em uma IDE de sua preferência.

### OU 
- Clonar o repositório <span style="color: grey;">https://github.com/devDouglasN/safe_exchange</span>
- Rodar <span style="color: grey;">mvn clean install</span> para instalar as dependências do projeto.
- Rodar <span style="color: grey;">mvn spring-boot:run</span> para subir a aplicação.
- A aplicação estará disponível na porta <span style="color: grey;">8080</span>.
- (Para alterar a porta, modifique o <span style="color: grey;">server.port</span> no arquivo <span style="color: grey;">application.properties</span>).    
<br>

O banco de dados utilizado no projeto é o MySQL. Ele irá subir os dados automaticamente, mas não irá popular. Antes de subir, certifique-se de que o MySQL está instalado ou modifique os arquivos application.properties e pom.xml com as configurações e dependências do banco de dados de sua preferência.

Após subir a aplicação, você precisa inserir um usuário na tabela users e depois autorizá-lo, concedendo permissão e inserindo-o na tabela authorities.

SQL
```bash
INSERT INTO users (username, password, enabled)
VALUES ('nome do usuário aqui', 'senha com hash bcrypt', true);

INSERT INTO authorities (username, authority) VALUES ('nome do usuário criado no user', 'ROLE_USER');
````


É obrigatório que a senha esteja criptografada com hash bcrypt. E a role, por padrão, é ‘ROLE_USER’.
