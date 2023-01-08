O projeto é um modelo de urna eletronica aplicada no estado do Rio Grande do Sul/Brasil, 
Configurações iniciais:
    1. Insira o script de criação do banco de dados no MySQL Workbench para a criação do banco de dados junto com as tabelas e para adicionar dados prévios.
    2. Configure a porta do servidor do banco de dados para localhost:3306, se já estiver assim passe para o proximo passo.
    3. Na utilização dessa API, foi utilizado o programa XAMPP Control Pane para funcionar com um server Apache local, instale XAMPP, ou utilize um programa de servidor local.
    4. Execute o programa da urna eletronica com o Spring Boot em uma IDLE.
    5. Utilizando o programa POSTMAN para realizar requisições, é possivel:
        5.1. Mostrar a lista de candidatos elegiveis: http://localhost:9999/listarCandidatos
        5.2. Mostrar a lista de candidatos em turnos: http://localhost:9999/listarTurnos
        5.3. Mostrar a lista total de votos: http://localhost:9999/listarVotos
        5.4. Executar um comando para deletar todos os votos: http://localhost:9999/deletarVotos
        5.5. Mostrar o resultado das votações em primeiro turno: http://localhost:9999/listarVotosPrimeiroTurno
        5.6. Mostrar o resultado das votações do segundo turno: http://localhost:9999/listarVotosSegundoTurno
        5.7. Executar uma eleição completa: http://localhost:9999/iniciarVotacao
