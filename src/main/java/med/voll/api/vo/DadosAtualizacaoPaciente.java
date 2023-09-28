package med.voll.api.vo;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(
    @NotNull
    Long id,
    String nome,
    String email,
    DadosEndereco endereco) {
}
