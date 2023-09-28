package med.voll.api.vo;

import med.voll.api.domain.Paciente;

public record DadosListagemPaciente(
        Long id,
        String nome,
        String email,
        String cpf
) {

    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());

    }
}
