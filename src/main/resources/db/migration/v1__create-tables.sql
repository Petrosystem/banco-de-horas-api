CREATE TABLE funcionario(
    funcionario_id UUID DEFAULT gen_random_uuid() PRIMARY KEY
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    senha VARCHAR(150) NOT NULL,
    is_adm BOOLEAN NOT NULL,
    data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP

)


CREATE TABLE registro_horas(
    registro_id UUID DEFAULT gen_random_uuid() PRIMARY KEY
    horas_trabalhadas DECIMAL(5,2)
    hora_saida TIME
    data_registro TIMESTAMP
    hora_entrada TIME
    hora_extra DECIMAL(5,2)
    data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
    FOREIGN KEY (funcionario_id) REFERENCES funcionario(funcionario_id)
)


CREATE TABLE dias_de_folga(
    dias_de_folga_id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    data_folga_inicio TIMESTAMP,
    data_folga_fim TIMESTAMP,
    motivo VARCHAR(255),
    data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
    FOREIGN KEY (funcionario_id) REFERENCES funcionario(funcionario_id)


)

CREATE TABLE atestado(
    atestado_id UUID DEFAULT gen_random_uuid() PRIMARY KEY
    data_inicio TIMESTAMP
    data_fim TIMESTAMP
    motivo VARCHAR(255)
    data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
    FOREIGN KEY (funcionario_id) REFERENCES funcionario(funcionario_id)

)