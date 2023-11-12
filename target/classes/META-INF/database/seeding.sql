--carga enderecos
INSERT INTO tb_enderecos (logradouro, complemento, numero, bairro, cep, cidade, estado) VALUES ('Rua Das Camelias', 'casa', '189', 'Esperanca', '95840-000', 'Triunfo', 'Rio Grande do Sul');
INSERT INTO tb_enderecos (logradouro, complemento, numero, bairro, cep, cidade, estado) VALUES ('Av. Protásio Alves', 'APTO 1203', '8500', 'Chacará das Pedras', '93310-000', 'Porto Alegre', 'Rio Grande do Sul');
--carga clientes
INSERT INTO tb_clientes (nome, cpf, email, celular, telefone, id_endereco) VALUES ('Joao Silva', '12345678900', 'teste1@gmail.com', '51999998888', '51999998888', 1);
INSERT INTO tb_clientes (nome, cpf, email, celular, telefone, id_endereco) VALUES ('Paulo Santos', '12345678923', 'teste2@gmail.com', '51999998886', '51999998886', 2);
INSERT INTO tb_clientes (nome, cpf, email, celular, telefone, id_endereco) VALUES ('Mario Souza', '12345878923', 'teste3@gmail.com', '51999998886', '51999998886', 1);
--carga Modelos
INSERT INTO tb_modelos (modelo) VALUES ('Sedan');
INSERT INTO tb_modelos (modelo) VALUES ('Hatch');
INSERT INTO tb_modelos (modelo) VALUES ('Mini Van');
--carga marcas
INSERT INTO tb_marcas (marca) VALUES ('GM');
INSERT INTO tb_marcas (marca) VALUES ('FIAT');
INSERT INTO tb_marcas (marca) VALUES ('FORD');
INSERT INTO tb_marcas (marca) VALUES ('CITROEN');
--carga empresa
INSERT INTO tb_empresas (razao_social, nome_fantasia, cnpj, telefone, email, id_endereco) VALUES ('Empresa Teste 01', 'Locadora 01', '09.000.100/0001-34', '51-3456-0987', 'locadora@locadora.com', 2);

--carga veiculo

--INSERT INTO tb_veiculos (renanvan, palca, ano_fabricacao, chassi, cor, modelo_fabricacao, data_compra, id_modelo, id_marca, id_empresa) VALUES ('098732452542', 'JBC-0A90', '2023', 'affda09832ewrj87', 'prata', '2023/01/02 13:00:09', 1, 2, 1);

INSERT INTO tb_veiculos(id_empresa, id_marca, id_modelo, ano_fabricacao, chassi, cor, data_compra, modelo_fabricacao, palca, renanvan) VALUES (1, 2, 1, '2023', 'ew0987jkii', 'prata', '2023/01/03 14:00:00', '2024', 'JCA-8I90', '0987600');
--carga funcionarios
INSERT INTO tb_funcionarios(matricula, data_admissao, id_endereco, email, nome) VALUES ('09', '2022/09/09', 1, 'pedro@locadora.com', 'Pedro Silva');
INSERT INTO tb_funcionarios(matricula, data_admissao, id_endereco, email, nome) VALUES ('10', '2022/08/09', 1, 'joao@locadora.com', 'Joao Santos');

--carga locacao
INSERT INTO tb_locacoes (diaria, km_final, km_inicial, data_entrada, data_saida, id_cliente, id_funcionario, id_veiculo) VALUES(2, 100.00, 200.00, '2023/09/10 08:00:00', '2023/11/10 18:00:00', 1, 1, 1);
















