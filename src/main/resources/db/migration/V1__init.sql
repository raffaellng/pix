CREATE TABLE chavepix(
    Id int NOT NULL auto_increment,
    NomeCliente VARCHAR(100) DEFAULT NULL, -- nome cliente
    ChavePix VARCHAR(100) DEFAULT NULL, -- chave piz do cliente 34911112222
    TipoChave VARCHAR(50) DEFAULT NULL, -- tipo chave (telefone
    StatusChave BIT DEFAULT TRUE, -- ativa ou nao
    Banco VARCHAR(50) DEFAULT NULL, -- banco
    Agencia INTEGER DEFAULT NULL,
    Conta INTEGER DEFAULT NULL,
    DataCriacao DATETIME DEFAULT NULL, -- data criação
    DataAlteracao DATETIME DEFAULT NULL,
    MotivoAlteracao VARCHAR(250) DEFAULT NULL,
    PRIMARY KEY (Id)
);
