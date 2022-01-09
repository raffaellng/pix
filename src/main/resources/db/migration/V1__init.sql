CREATE TABLE chavepix(
    id int NOT NULL auto_increment,
    nome_cliente VARCHAR(100) DEFAULT NULL, -- nome cliente
    chave_pix VARCHAR(100) DEFAULT NULL, -- chave piz do cliente 34911112222
    tipo_chave VARCHAR(50) DEFAULT NULL, -- tipo chave (telefone
    status_chave BIT DEFAULT TRUE, -- ativa ou nao
    banco VARCHAR(50) DEFAULT NULL, -- banco
    agencia INTEGER DEFAULT NULL,
    conta INTEGER DEFAULT NULL,
    data_criacao DATETIME DEFAULT NULL, -- data criação
    data_alteracao DATETIME DEFAULT NULL,
    motivo_alteracao VARCHAR(250) DEFAULT NULL,
    PRIMARY KEY (id)
);
