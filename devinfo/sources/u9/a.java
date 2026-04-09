package u9;

import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import w9.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public Matrix f35200e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f35201f;
    public w9.d g;

    /* renamed from: h, reason: collision with root package name */
    public w9.d f35202h;

    /* renamed from: i, reason: collision with root package name */
    public float f35203i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f35204k;

    /* renamed from: l, reason: collision with root package name */
    public o9.f f35205l;

    /* renamed from: m, reason: collision with root package name */
    public VelocityTracker f35206m;

    /* renamed from: n, reason: collision with root package name */
    public long f35207n;

    /* renamed from: o, reason: collision with root package name */
    public w9.d f35208o;

    /* renamed from: p, reason: collision with root package name */
    public w9.d f35209p;

    /* renamed from: q, reason: collision with root package name */
    public float f35210q;

    /* renamed from: r, reason: collision with root package name */
    public float f35211r;

    public static float d(MotionEvent motionEvent) {
        float x10 = motionEvent.getX(0) - motionEvent.getX(1);
        float y10 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y10 * y10) + (x10 * x10));
    }

    public final w9.d a(float f10, float f11) {
        h viewPortHandler = ((m9.a) this.f35215d).getViewPortHandler();
        float f12 = f10 - viewPortHandler.f36564b.left;
        b();
        return w9.d.b(f12, -((r0.getMeasuredHeight() - f11) - (viewPortHandler.f36566d - viewPortHandler.f36564b.bottom)));
    }

    public final void b() {
        o9.f fVar = this.f35205l;
        m9.b bVar = this.f35215d;
        if (fVar == null) {
            m9.a aVar = (m9.a) bVar;
            aVar.T.getClass();
            aVar.U.getClass();
        }
        o9.f fVar2 = this.f35205l;
        if (fVar2 != null) {
            m9.a aVar2 = (m9.a) bVar;
            (fVar2.f30444d == 1 ? aVar2.T : aVar2.U).getClass();
        }
    }

    public final void c(MotionEvent motionEvent) {
        this.f35201f.set(this.f35200e);
        w9.d dVar = this.g;
        dVar.f36546b = motionEvent.getX();
        dVar.f36547c = motionEvent.getY();
        m9.a aVar = (m9.a) this.f35215d;
        q9.b bVarC = aVar.c(motionEvent.getX(), motionEvent.getY());
        this.f35205l = bVarC != null ? (o9.f) ((o9.a) aVar.f28997b).d(bVarC.f32231e) : null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        m9.a aVar = (m9.a) this.f35215d;
        aVar.getOnChartGestureListener();
        if (aVar.G && ((o9.a) aVar.getData()).e() > 0) {
            w9.d dVarA = a(motionEvent.getX(), motionEvent.getY());
            float f10 = aVar.K ? 1.4f : 1.0f;
            float f11 = aVar.L ? 1.4f : 1.0f;
            float f12 = dVarA.f36546b;
            float f13 = dVarA.f36547c;
            h hVar = aVar.f29012s;
            Matrix matrix = aVar.f28992g0;
            hVar.getClass();
            matrix.reset();
            matrix.set(hVar.f36563a);
            matrix.postScale(f10, f11, f12, -f13);
            hVar.e(matrix, aVar, false);
            aVar.a();
            aVar.postInvalidate();
            if (aVar.f28996a) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + dVarA.f36546b + ", y: " + dVarA.f36547c);
            }
            w9.d.c(dVarA);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ((m9.a) this.f35215d).getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f10, f11);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ((m9.a) this.f35215d).getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        q9.b bVar;
        m9.b bVar2 = this.f35215d;
        m9.a aVar = (m9.a) bVar2;
        aVar.getOnChartGestureListener();
        if (!aVar.f28998c) {
            return false;
        }
        q9.b bVarC = aVar.c(motionEvent.getX(), motionEvent.getY());
        if (bVarC == null || ((bVar = this.f35213b) != null && bVarC.f32231e == bVar.f32231e && bVarC.f32227a == bVar.f32227a)) {
            bVar2.d(null);
            this.f35213b = null;
        } else {
            bVar2.d(bVarC);
            this.f35213b = bVarC;
        }
        return super.onSingleTapUp(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01f3  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r18, android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
