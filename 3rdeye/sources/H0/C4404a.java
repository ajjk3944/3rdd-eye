package h0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.l;

/* compiled from: ZoomGestureDetector.kt */
/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4404a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4405b f38153b;

    public C4404a(C4405b c4405b) {
        this.f38153b = c4405b;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e4) {
        l.f(e4, "e");
        e4.getX();
        this.f38153b.getClass();
        e4.getY();
        return true;
    }
}
