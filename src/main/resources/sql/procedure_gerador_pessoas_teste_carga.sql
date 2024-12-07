/*
    Demanda:                KETER2024120701100712TORAH
    Objetivo:               Criar procedure para gerar massa de teste de carga para a tabela de pessoas
*/

/*
SELECT COUNT(*) AS PESSOAS FROM (
	SELECT * FROM TB_PESSOA
) AS QUANTIDADE;
*/

DELETE FROM tb_pessoa WHERE CODE IS NOT NULL;

DROP PROCEDURE IF EXISTS PROCEDURE_GERADOR_DADOS_PESSOAS;

DELIMITER $$

CREATE PROCEDURE PROCEDURE_GERADOR_DADOS_PESSOAS(IN total_registros INT)

BEGIN

    DECLARE contador INT DEFAULT 0;
    DECLARE data_nascimento DATE;

    WHILE contador < total_registros DO
        
        SET data_nascimento = DATE_SUB(CURDATE(), INTERVAL (FLOOR(RAND() * 83) + 18) YEAR);

        INSERT INTO tb_pessoa (code, ativo, data_nascimento, nome_completo, tipo_cor, tipo_estado_civil, tipo_pessoa, tipo_sanguineo, id_pais)
        VALUES (
            contador + 1,
            1,
            data_nascimento,
            UUID(),
            NULL,
            IF(RAND() < 0.5, 'CASADO', 'SOLTEIRO'),
            IF(RAND() < 0.5, 'PESSOA_FISICA', 'PESSOA_JURIDICA'),
            NULL,
            16
        );

        SET contador = contador + 1;
    END WHILE;
END$$

DELIMITER ;

CALL PROCEDURE_GERADOR_DADOS_PESSOAS(10000);
