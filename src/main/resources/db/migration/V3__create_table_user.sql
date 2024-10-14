CREATE TABLE epicuser
(
    id     UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name   VARCHAR(255),
    email  VARCHAR(255) UNIQUE NOT NULL,
    avatar VARCHAR(255),
    score  INTEGER CHECK (score >= 0)
);
