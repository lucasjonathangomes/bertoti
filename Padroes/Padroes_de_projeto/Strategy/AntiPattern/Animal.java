package AntiPattern;

public class Animal {
        private Nutricao nutricao;
        private Especie especie;
        public void setNutricao(Nutricao nutricao){
            this.nutricao=nutricao;
        }
        public void setEspecie(Especie especie){
            this.especie=especie;
        }

        public Nutricao getNutricao() {
            return nutricao;
        }

        public Especie getEspecie() {
            return especie;
        }
}
