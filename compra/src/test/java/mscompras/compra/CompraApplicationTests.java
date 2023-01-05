package mscompras.compra;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import mscompras.compra.util.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource("/application-teste.properties")
class CompraApplicationTests {

	@LocalServerPort
	private int port;

	@Test
	void deveRetornaSalvo() throws IOException {
		RestAssured.given()
				.basePath("/api/v1/pedidos")
				.port(port)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(FileUtils.readFileContent("cadastro.json"))
				.when()
				.post()
				.then()
				.statusCode(HttpStatus.OK.value());
	}
}
