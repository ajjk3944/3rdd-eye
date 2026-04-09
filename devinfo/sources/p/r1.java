package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30841a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f30842b;

    public /* synthetic */ r1(s1 s1Var, int i4) {
        this.f30841a = i4;
        this.f30842b = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30841a) {
            case 0:
                ViewParent parent = this.f30842b.f30856d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                s1 s1Var = this.f30842b;
                s1Var.a();
                View view = s1Var.f30856d;
                if (view.isEnabled() && !view.isLongClickable() && s1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    s1Var.g = true;
                    break;
                }
                break;
        }
    }
}
