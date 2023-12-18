INSERT INTO t_produto (cd_produto, nm_produto, vl_produto,dt_validade
) VALUES (SEQ_PRODUTO.NEXTVAL, 'Maça', 7, to_date('14/08/2017','dd/mm/yyyy'));
    
UPDATE t_produto
SET VL_PRODUTO = 8
WHERE CD_PRODUTO =1;

SELECT cd_produto, nm_produto, vl_produto, dt_validade FROM t_produto;
    
DELETE FROM t_produto WHERE cd_produto = 1;
    