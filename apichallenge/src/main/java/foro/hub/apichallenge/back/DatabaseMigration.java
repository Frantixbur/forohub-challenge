package foro.hub.apichallenge.back;
import org.flywaydb.core.Flyway;
public class DatabaseMigration {
    public static void main(String[] args) {
        // Configurar la URL de la base de datos, usuario y contraseña
        String jdbcUrl = "jdbc:mysql://localhost:3306/myforohub";
        String username = "root";
        String password = "Servidor.45";
        // Crear el objeto Flyway y configurar la conexión a la base de datos
        Flyway flyway = Flyway.configure()
                .dataSource(jdbcUrl, username, password)
                .load();
        // Reparar el historial de migraciones
        flyway.repair();
        // Ejecutar las migraciones
        flyway.migrate();
        System.out.println("Migración completada.");
    }
}
