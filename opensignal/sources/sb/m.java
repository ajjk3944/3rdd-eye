package sb;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, c {

    /* renamed from: g, reason: collision with root package name */
    public final j f21989g;

    /* renamed from: x, reason: collision with root package name */
    public final GestureDetector f21991x;

    /* renamed from: a, reason: collision with root package name */
    public final PointF f21987a = new PointF();

    /* renamed from: d, reason: collision with root package name */
    public final PointF f21988d = new PointF();

    /* renamed from: r, reason: collision with root package name */
    public final float f21990r = 25.0f;

    /* renamed from: y, reason: collision with root package name */
    public volatile float f21992y = 3.1415927f;

    public m(Context context, j jVar) {
        this.f21989g = jVar;
        this.f21991x = new GestureDetector(context, this);
    }

    @Override // sb.c
    public final void a(float[] fArr, float f10) {
        this.f21992y = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f21987a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f21987a.x) / this.f21990r;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f21987a;
        float f12 = (y10 - pointF.y) / this.f21990r;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d6 = this.f21992y;
        float fCos = (float) Math.cos(d6);
        float fSin = (float) Math.sin(d6);
        PointF pointF2 = this.f21988d;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = (fCos * f12) + (fSin * x10) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        j jVar = this.f21989g;
        PointF pointF3 = this.f21988d;
        synchronized (jVar) {
            float f14 = pointF3.y;
            jVar.B = f14;
            Matrix.setRotateM(jVar.f21979x, 0, -f14, (float) Math.cos(jVar.D), (float) Math.sin(jVar.D), 0.0f);
            Matrix.setRotateM(jVar.f21980y, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f21989g.G.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f21991x.onTouchEvent(motionEvent);
    }
}
