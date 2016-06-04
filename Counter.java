//Реализовать класс Counter, описывающий цифровой счетчик. Одним из полей этого класса будет переменная с ограниченным диапазоном,
// значение которой сбрасывается, если её целочисленное значение достигает определённого максимума (например, переменная current может
// принимать значения в диапазоне от 0 до 99999). В качестве реального примера такого счётчика представьте счётчик километража в автомобиле,
// или же домашний счётчик по учёту расхода воды или электроэнергии. Обязательные поля: текущее значение счётчика, максимальное значение диапазона,
// минимальное значение диапазона, шаг прироста. Обязательные методы: конструктор по умолчанию, несколько видов конструкторов с параметрами, увеличение
// текущего значения счётчика на 1, увеличение значения на заданную величину (шаг прироста), сброс (обнуление) счётчика, установка минимального и максимального значений.

public class Counter {

    int current;
    int max;
    int min;
    int step;

    public Counter(int current, int max, int min, int step) {
        this.current = current;
        this.max = max;
        this.min = min;
        this.step = step;
    }

    public Counter(int current) {
        this.current = current;
    }

    public Counter(int current, int max, int min) {
        this.current = current;
        this.max = max;
        this.min = min;
    }

    public Counter() {
        this.current = 0;
        this.max = 0;
        this.min = 0;
        this.step = 0;
    }

    public void increaseCounter(){
        if (this.current < this.max)
            this.current++;
        else
            this.nullCounter();
    }

    public void increaseCounterByStep(){
    if (this.current + step <= max)
        this.current += this.step;
        else
        this.nullCounter();
    }

    public void nullCounter(){
        current = 0;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }
}

