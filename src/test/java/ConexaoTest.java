import com.mycompany.userapp.Conexao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConexaoTest {

    @Test
    void testeConexaoSucesso() {
        try {
            assertNotNull(Conexao.conectar());
        } catch (Exception e) {
            fail("Deveria conectar com sucesso");
        }
    }

    @Test
    void testeConexaoFalha() {
        assertThrows(Exception.class, () -> {
            java.sql.DriverManager.getConnection(
                "jdbc:mysql://localhost:9999/db_usuario",
                "root",
                "root"
            );
        });
    }
}