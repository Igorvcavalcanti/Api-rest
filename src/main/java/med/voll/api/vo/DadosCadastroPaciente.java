package med.voll.api.vo;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        String nome,
        String cpf,
        String email,
        String telefone,
        DadosEndereco endereco) {
}
