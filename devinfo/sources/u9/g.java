package u9;

import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: e, reason: collision with root package name */
    public w9.d f35218e;

    /* renamed from: f, reason: collision with root package name */
    public float f35219f;
    public ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public long f35220h;

    /* renamed from: i, reason: collision with root package name */
    public float f35221i;

    public final void a(float f10, float f11) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        ArrayList arrayList = this.g;
        float fJ = ((m9.c) this.f35215d).j(f10, f11);
        f fVar = new f();
        fVar.f35216a = jCurrentAnimationTimeMillis;
        fVar.f35217b = fJ;
        arrayList.add(fVar);
        for (int size = arrayList.size(); size - 2 > 0 && jCurrentAnimationTimeMillis - ((f) arrayList.get(0)).f35216a > 1000; size--) {
            arrayList.remove(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ((m9.c) this.f35215d).getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        q9.b bVar;
        m9.b bVar2 = this.f35215d;
        m9.c cVar = (m9.c) bVar2;
        cVar.getOnChartGestureListener();
        if (!cVar.f28998c) {
            return false;
        }
        q9.b bVarC = cVar.c(motionEvent.getX(), motionEvent.getY());
        if (bVarC == null || ((bVar = this.f35213b) != null && bVarC.f32231e == bVar.f32231e && bVarC.f32227a == bVar.f32227a)) {
            bVar2.d(null);
            this.f35213b = null;
            return true;
        }
        bVar2.d(bVarC);
        this.f35213b = bVarC;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
