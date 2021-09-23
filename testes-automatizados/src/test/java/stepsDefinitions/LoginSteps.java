package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import java.awt.peer.LabelPeer;
import java.sql.DriverManager;

import org.openqa.selenium.By;

import io.cucumber.java.pt.*;
import pageObjects.LoginPage;

import static utils.Utils.*;

public class LoginSteps {
	
	LoginPage lp = new LoginPage();	 
	
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
	    lp.informarCampoUsuario(usuario);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	    lp.informarCampoSenha(senha);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
	    lp.acionarBotaoLogin();
	}

	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() {
	    assertEquals("invalid user", driver.findElement(By.id("spanMessage")).getText());
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {		
	    assertEquals("Welcome Paul", driver.findElement(By.id("welcome")).getText());
	}

}
