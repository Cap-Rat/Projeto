<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file='../../../header/v1/header-login.jsp'%>
<section>
	<div class="form-content">
		<div class="side-image">
		</div>
		<div class="side-form">
			<div class="cadastro">
				<h2>LOGIN</h2>
				<form action="">
					<h4>E-mail</h4>
					<div class="input-group">
						<div class="input-box">
							<input type="email" placeholder="Endereço de E-mail" required class="name">
							<i class="fa fa-envelope icon"></i>
						</div>
					</div>
					<h4>Senha</h4>
					<div class="input-group">
						<div class="input-box">
							<input type="password" placeholder="Senha" required class="name">
							<i class="fa fa-lock icon"></i>
						</div>
					</div>
					<h4><a id="forgot-pass" href="../pass-recover/pass-recover.jsp">Esqueceu sua senha?</a></h4>
					<h4>Não possui uma conta? <a id="h4" href="../cadastro/cadastro.jsp">Cadastre-se</a></h4>
					<div class="input-group">
						<div class="input-box">
							<br>
							<button type="submit">LOGIN</button>
						</div>
					</div>
				</form>
			</div>
	    </div>
	</div>
</section>
<%@include file='../../../footer/footer.jsp'%>