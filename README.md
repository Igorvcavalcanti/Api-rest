## 📌 API REST com Spring Boot  

Este projeto é uma API REST desenvolvida com **Spring Boot**, que gerencia informações relacionadas a médicos e pacientes.  

### 🛠 Tecnologias utilizadas  

- **Java 17**  
- **Spring Boot**  
- **Spring Data JPA**  
- **H2 Database** (banco de dados em memória)  
- **Maven**  

### 💁️️ Estrutura do projeto  

A estrutura do projeto segue a organização MVC:  

```
src/main/java/med/voll/api  
│── controller/        # Controllers da API  
│   ├── HelloController.java  
│   ├── MedicoController.java  
│   └── PacienteController.java  
│── domain/            # Entidades do domínio  
│   ├── Medico.java  
│   ├── Paciente.java  
│   └── Endereco.java  
│── repository/        # Interfaces de repositório  
│── enumeration/       # Enumerações do sistema  
│── vo/                # Value Objects  
│── ApiApplication.java # Classe principal do projeto  
```

### ▶️ Como executar  

1. **Clone o repositório:**  
   ```sh
   git clone https://github.com/seu-usuario/api-rest.git
   cd api-rest
   ```

2. **Compile o projeto:**  
   ```sh
   mvn clean install
   ```

3. **Execute a aplicação:**  
   ```sh
   mvn spring-boot:run
   ```

4. **Acesse a API:**  
   - `http://localhost:8080/hello` → Endpoint de teste  
   - `http://localhost:8080/medicos` → Gerenciamento de médicos  
   - `http://localhost:8080/pacientes` → Gerenciamento de pacientes  

### 📌 Futuras melhorias  

- Implementar autenticação com **Spring Security**  
- Adicionar **Swagger** para documentação da API  
- Persistência com **PostgreSQL**  

---  
Se precisar de ajustes ou mais informações, me avise! 🚀
