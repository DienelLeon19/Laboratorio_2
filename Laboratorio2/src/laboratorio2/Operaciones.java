package laboratorio2;

    public class Operaciones 
    {
        private float Elemento1, Elemento2;
        public Operaciones() {  }

        public Operaciones(float Elemento1, float Elemento2) {
            this.Elemento1 = Elemento1;
            this.Elemento2 = Elemento2;}
    
        public float getElemento1() 
            {return Elemento1;}
        public float getElemento2()
            {return Elemento2;}
        public void setElemento1(float Elemento1) 
            {this.Elemento1 = Elemento1;}
        public void setElemento2(float Elemento2) 
            {this.Elemento2 = Elemento2;}
    
        public float Suma()
            {return this.Elemento1+this.Elemento2;}
        public float Resta()
            {return this.Elemento1-this.Elemento2;}
        public float Multriplicacion()
            {return this.Elemento1*this.Elemento2;}
        public float Division()
            {return this.Elemento1/this.Elemento2;}
        
    }
