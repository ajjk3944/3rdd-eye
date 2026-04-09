package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20089a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f20090d;

    public /* synthetic */ k1(l1 l1Var, int i10) {
        this.f20089a = i10;
        this.f20090d = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20089a) {
            case 0:
                ViewParent parent = this.f20090d.f20096r.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                l1 l1Var = this.f20090d;
                l1Var.a();
                View view = l1Var.f20096r;
                if (view.isEnabled() && !view.isLongClickable() && l1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    l1Var.B = true;
                    break;
                }
                break;
        }
    }
}
