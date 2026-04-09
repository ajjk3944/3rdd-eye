package H6;

import K6.C0756t;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: DivGestureListener.kt */
/* renamed from: H6.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0684v extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2254b;

    /* renamed from: c, reason: collision with root package name */
    public C0756t f2255c;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.m f2256d;

    public C0684v(boolean z10) {
        this.f2254b = z10;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.m, p9.a] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e4) {
        kotlin.jvm.internal.l.f(e4, "e");
        ?? r22 = this.f2256d;
        if (r22 == 0) {
            return false;
        }
        r22.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e4) {
        kotlin.jvm.internal.l.f(e4, "e");
        if (this.f2254b) {
            return false;
        }
        return (this.f2256d == null && this.f2255c == null) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e4) {
        C0756t c0756t;
        kotlin.jvm.internal.l.f(e4, "e");
        if (this.f2256d == null || (c0756t = this.f2255c) == null) {
            return false;
        }
        c0756t.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e4) {
        C0756t c0756t;
        kotlin.jvm.internal.l.f(e4, "e");
        if (this.f2256d != null || (c0756t = this.f2255c) == null) {
            return false;
        }
        c0756t.invoke();
        return true;
    }
}
