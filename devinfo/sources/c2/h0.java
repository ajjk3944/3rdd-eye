package c2;

import android.view.MotionEvent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f2619a = new StackTraceElement[0];

    public static final boolean a(p pVar) {
        return !pVar.f2664h && pVar.f2661d;
    }

    public static final boolean b(p pVar) {
        return (pVar.b() || !pVar.f2664h || pVar.f2661d) ? false : true;
    }

    public static final boolean c(p pVar) {
        return pVar.f2664h && !pVar.f2661d;
    }

    public static final boolean d(long j, long j8) {
        return j == j8;
    }

    public static final boolean e(p pVar, long j, long j8) {
        int i4 = pVar.f2665i == 1 ? 1 : 0;
        long j9 = pVar.f2660c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        float f10 = i4;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j8 >> 32)) * f10;
        float f11 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j8 & 4294967295L)) * f10;
        return (fIntBitsToFloat > f11) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long f(p pVar, boolean z3) {
        long jG = o1.b.g(pVar.f2660c, pVar.g);
        if (z3 || !pVar.b()) {
            return jG;
        }
        return 0L;
    }

    public static final void g(j jVar, long j, mk.c cVar, boolean z3) {
        MotionEvent motionEventA = jVar.a();
        if (motionEventA == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventA.getAction();
        if (z3) {
            motionEventA.setAction(3);
        }
        int i4 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i4), -Float.intBitsToFloat(i10));
        cVar.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i4), Float.intBitsToFloat(i10));
        motionEventA.setAction(action);
    }

    public static String h(long j) {
        return "PointerId(value=" + j + ')';
    }
}
