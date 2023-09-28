package med.voll.api.vo;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
    @NotNull
    Long id,
    String nome,
    String email,
    DadosEndereco endereco) {
}
