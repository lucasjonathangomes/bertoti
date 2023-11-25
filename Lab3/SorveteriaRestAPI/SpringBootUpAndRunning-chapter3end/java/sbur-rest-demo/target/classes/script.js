$(document).ready(function(){
    $("#btn").click(function(){
        var url="http://localhost:8080/icecream";
        $.getJSON(url, function(data){
            var itens = [];
            $.each(data, function(i){
                itens.push("<tr><td>"+ this.sabor +"</td>"
                            +"<td>" + this.marca +"</td>"
                            +"<td>" + this.tipo +"</td>"
                            +"<td>" + this.preco +"</td></tr>"
                );
            });

            // Limpar a tabela antes de adicionar novos itens
            $("#elementos").empty();
            $("#elementos").append(itens);
        });
    });

    $("#btnpreco").click(function(){
        var url="http://localhost:8080/icecream/preco";
        $.getJSON(url, function(data){
            var itens = [];
            $.each(data, function(i){
                itens.push("<tr><td>"+ this.sabor +"</td>"
                            +"<td>" + this.marca +"</td>"
                            +"<td>" + this.tipo +"</td>"
                            +"<td>" + this.preco +"</td></tr>"
                );
            });

            // Limpar a tabela antes de adicionar novos itens
            $("#elementos").empty();
            $("#elementos").append(itens);
        });
    });

    $("#btnclear").click(function(){
            // Limpar a tabela antes de adicionar novos itens
            $("#elementos").empty();
         });
       
    $("#btncad").click(function(){
            var url="http://localhost:8080/icecream";
             var sabor = $("#saborselect option:selected").text();
             var tipo = $("#tiposelect option:selected").text();
             var marca = $("#marcaselect option:selected").text();
             var preco = $("#precoinput").val();
            console.log(sabor,tipo,marca,preco);

            fetch(url, {
                method: "POST",
                body: JSON.stringify({sabor: sabor, tipo: tipo, marca: marca, preco: preco})

            })
            .then(response => response.json())
            .then(response => console.log(response))
            .catch(error => console.log(error))
    });


});     


