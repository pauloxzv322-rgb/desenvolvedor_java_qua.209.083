const form = document.getElementById('form');


const exibirDados = () => {
    let nome = document.getElementById('#nome').value;
    let email = document.getElementById('#email').value;
    let nascimento = document.getElementById('#nascimento').value;
    let telefone = document.getElementById('#telefone').value;
    let cpf = document.getElementById('#cpf').value;
    let cep = document.getElementById('#cep').value;
    let estado = document.getElementById('#estado').value;
  

    document.querySelector('nameresult').innerText = nome;
    document.querySelector('emailresult').innerText = email;
    document.querySelector('nascimentoresult').innerText = nascimento;
    document.querySelector('telefoneresult').innerText = telefone;
    document.querySelector('cpfresult').innerText = cpf;
    document.querySelector('cepresult').innerText = cep;
    document.querySelector('estadoresult').innerText = estado;
 
   form.requestFullscreen();
}

form.addEventListener('submit', function(event) {
    event.exibirDados('');});