-- Habilitar a extensão UUID
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Inserir dados na tabela task
INSERT INTO task (id, title, description, status, score) VALUES
         (uuid_generate_v4(), 'Estudar Java', 'Estudar os conceitos básicos de Java para melhorar habilidades de programação.', 50, 5),
         (uuid_generate_v4(), 'Preparar apresentação', 'Preparar slides para a apresentação da reunião da equipe.', 10, 3),
         (uuid_generate_v4(), 'Revisar código', 'Revisar o código do projeto para otimizar o desempenho.', 70, 8);
