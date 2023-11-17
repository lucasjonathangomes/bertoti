$(document).ready(function(){
    $("#btn").click(function(){
        var url="http://localhost:8080/icecream";
        $.getJSON(url, function(data){

            var itens = [];
            $.each(data, function(i){
                itens.push("<tr><td>"+ this.sabor + "</td>"
                            +"<td>" + this.marca +"</td>"
                            +"<td>" + this.preco +"</td></tr>"
                );

            });
            console.log(itens);
            
            $("#tabela").append(itens);

        });


    });



});