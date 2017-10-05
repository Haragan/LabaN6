package com.garkin.laban6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView(this));
    }

    class DrawView extends View {

        private Paint p;
        private Rect rect;
        private RectF rectF;
        private float[] points;
        private float[] points1;
        private StringBuilder sb;

        public DrawView(Context context) {
            super(context);
            p = new Paint();
            rect = new Rect();

            rectF = new RectF(700, 100, 800, 150);
            points = new float[]{100, 50, 150, 100, 150, 200, 50, 200, 50, 100};
            points1 = new float[]{300, 200, 600, 200, 300, 300, 600, 300, 400, 100, 400, 400, 500, 100, 500, 400};

            sb = new StringBuilder();
        }

        protected void onDraw(Canvas canvas) {
//            canvas.drawARGB(80, 102, 204, 255);//Заливает канвас цветом
//
//
//            p.setColor(Color.RED); //Делает кисть красной
//            p.setStrokeWidth(10);//Делает ширину кисти 10
//            canvas.drawPoint(50, 50, p);//Рисование точки
//            canvas.drawLine(100, 100, 500, 50, p);//Рисование линии
//            canvas.drawCircle(100, 200, 50, p);//Рисование круга
//            canvas.drawRect(200, 150, 400, 200, p);//Рисование прямоугольника
//            rect.set(259, 300, 350, 500);//Установление координат для прямоугольника
//            canvas.drawRect(rect, p);//Рисование прямоугольника






//            canvas.drawARGB(80, 102, 204, 255);//Заливает канвас цветом
//            p.setColor(Color.RED);
//            p.setStrokeWidth(10);
//            canvas.drawPoints(points, p);//Рисует точки, из массива points
//            canvas.drawLines(points1, p);//Рисует точки, из массива points1
//
//            p.setColor(Color.GREEN);//Делает кисть зеленой
//            canvas.drawRoundRect(rectF, 20, 20, p);//Прямоугольник
//            rectF.offset(0, 150);//Смещаемся по Y на 150
//            canvas.drawOval(rectF, p);//Овал
//            rectF.offset(0, 150);//Смещаемся по Y
//            rectF.inset(0, -25);
//            canvas.drawArc(rectF, 90, 270, true, p);//Рисовать Дугу
//            rectF.offset(0, 150);//Смещаемся по Y
//            canvas.drawArc(rectF, 90, 270, false, p);//Рисовать Дугу
//            p.setStrokeWidth(3);//Делает ширину кисти 3
//            canvas.drawLine(150, 450, 150, 600, p);
//
//            p.setColor(Color.BLUE);//Делает кисть синей
//            p.setTextSize(30);//Делает ширину кисти 30
//            canvas.drawText("text left", 150, 500, p);//Рисуем текст по левому краю
//            p.setTextAlign(Paint.Align.CENTER);//Устанавливаем по центру краю
//            canvas.drawText("text center", 150, 520, p);
//            p.setTextAlign(Paint.Align.RIGHT);//Рисуем текст по правому краю
//            canvas.drawText("text right", 150, 550, p);








            rect = new Rect(100, 200, 200, 300);
            canvas.drawARGB(80 ,102, 204, 255);

            p.setColor(Color.BLUE);
            p.setStrokeWidth(10);

            p.setTextSize(30);//Размер текста 30
            sb.append("width = ").
                    append(canvas.getWidth()).
                    append(", height = ").
                    append(canvas.getHeight());
            canvas.drawText(sb.toString(), 100, 100, p);

            p.setStyle(Paint.Style.FILL);//При рисовании, элемент получается без обводки
            canvas.drawRect(rect, p);

            p.setStyle(Paint.Style.STROKE);//При рисовании, только обводка, пустата внутри
            rect.offset(150, 0);
            canvas.drawRect(rect, p);

            p.setStyle(Paint.Style.FILL_AND_STROKE);//При рисовании, элемент и обводка
            rect.offset(150, 0);
            canvas.drawRect(rect, p);

            float[] six = new float[]{400, 700, 480, 650, 480, 650, 560, 700,
                    560, 700, 560, 780, 560, 780, 480, 830, 480, 830, 400, 780,
                    400, 780, 400, 700}; //Массив для построение 6 угольника

            canvas.drawLines(six, p); //Рисуем 6 угольник

        }
    }
}
