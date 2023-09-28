package med.voll.api.vo;

import med.voll.api.domain.Paciente;
import med.voll.api.endereco.Endereco;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String cpf, Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(
                paciente.getId(),
                paciente.getNome(),
                paciente.getEmail(),
                paciente.getCpf(),
                paciente.getEndereco());
    }
}

