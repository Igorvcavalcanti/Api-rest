package med.voll.api.vo;

public record DadosCadastroPaciente(
        String nome,
        String cpf,
        String email,
        String telefone,
        DadosEndereco endereco) {
}
