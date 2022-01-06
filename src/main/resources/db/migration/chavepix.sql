CREATE TABLE chavepix(
    Id INTEGER PRIMARY KEY,
    NomeCliente VARCHAR(100), -- nome cliente
    ChavePix VARCHAR(100), --chave piz do cliente 34911112222
    TipoChave VARCHAR(50), -- tipo chave (telefone
    StatusChave BIT, --ativa ou nao
    Banco VARCHAR(50), -- banco
    Agencia INTEGER,
    Conta INTEGER,
    DataCriacao TIMESTAMP, --data criação
    DataAlteracao TIMESTAMP,
    MotivoAlteracao VARCHAR (250)
);
