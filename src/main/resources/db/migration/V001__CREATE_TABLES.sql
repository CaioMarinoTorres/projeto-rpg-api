-- Sequências para as tabelas

CREATE SEQUENCE IF NOT EXISTS tb_personagem_seq
    INCREMENT BY 1
    MINVALUE 1
    START WITH 1
    CACHE 1
    NO CYCLE;

-- Tabelas

DROP TABLE IF EXISTS tb_personagem;
CREATE TABLE tb_personagem
(
    id_personagem BIGINT DEFAULT nextval('tb_personagem_seq'::regclass) NOT NULL,
    nome          VARCHAR(50)                                           NOT NULL,
    nivel         INTEGER                                               NOT NULL,
    id_raca       BIGINT                                                NOT NULL,

    CONSTRAINT pk_tb_personagem PRIMARY KEY (id_personagem),
    CONSTRAINT fk_tb_personagem_0 FOREING KEY (id_raca) REFERENCES tb_raca (id_raca)
)
