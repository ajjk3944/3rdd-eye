package defpackage;

import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.github.mikephil.charting.charts.LineChart;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l9 extends oe {
    public Matrix j;
    public Matrix k;
    public aa0 l;
    public aa0 m;
    public float n;
    public float o;
    public float p;
    public l60 q;
    public VelocityTracker r;
    public long s;
    public aa0 t;
    public aa0 u;
    public float v;
    public float w;

    public static float d(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    public final aa0 a(float f, float f2) {
        u61 viewPortHandler = this.i.getViewPortHandler();
        float f3 = f - viewPortHandler.b.left;
        b();
        return aa0.b(f3, -((r0.getMeasuredHeight() - f2) - (viewPortHandler.d - viewPortHandler.b.bottom)));
    }

    public final void b() {
        LineChart lineChart = this.i;
        if (this.q == null) {
            lineChart.a0.getClass();
            lineChart.b0.getClass();
        }
        l60 l60Var = this.q;
        if (l60Var != null) {
            (l60Var.d == 1 ? lineChart.a0 : lineChart.b0).getClass();
        }
    }

    public final void c(MotionEvent motionEvent) {
        this.k.set(this.j);
        aa0 aa0Var = this.l;
        aa0Var.g = motionEvent.getX();
        aa0Var.h = motionEvent.getY();
        LineChart lineChart = this.i;
        v00 v00VarB = lineChart.b(motionEvent.getX(), motionEvent.getY());
        this.q = v00VarB != null ? (l60) ((m9) lineChart.g).d(v00VarB.e) : null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        LineChart lineChart = this.i;
        lineChart.getOnChartGestureListener();
        if (lineChart.K && ((m9) lineChart.getData()).e() > 0) {
            aa0 aa0VarA = a(motionEvent.getX(), motionEvent.getY());
            float f = lineChart.O ? 1.4f : 1.0f;
            float f2 = lineChart.P ? 1.4f : 1.0f;
            float f3 = aa0VarA.g;
            float f4 = aa0VarA.h;
            u61 u61Var = lineChart.w;
            Matrix matrix = lineChart.i0;
            u61Var.getClass();
            matrix.reset();
            matrix.set(u61Var.a);
            matrix.postScale(f, f2, f3, -f4);
            u61Var.e(matrix, lineChart, false);
            lineChart.a();
            lineChart.postInvalidate();
            boolean z = lineChart.f;
            aa0.i.c(aa0VarA);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.i.getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.i.getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        v00 v00Var;
        LineChart lineChart = this.i;
        lineChart.getOnChartGestureListener();
        if (!lineChart.h) {
            return false;
        }
        v00 v00VarB = lineChart.b(motionEvent.getX(), motionEvent.getY());
        if (v00VarB == null || ((v00Var = this.g) != null && v00VarB.e == v00Var.e && v00VarB.a == v00Var.a)) {
            lineChart.c(null);
            this.g = null;
        } else {
            lineChart.c(v00VarB);
            this.g = v00VarB;
        }
        return super.onSingleTapUp(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01ec  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r18, android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
