package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: o.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2735r0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC2737s0 f22625b;

    public /* synthetic */ RunnableC2735r0(AbstractViewOnTouchListenerC2737s0 abstractViewOnTouchListenerC2737s0, int i) {
        this.f22624a = i;
        this.f22625b = abstractViewOnTouchListenerC2737s0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22624a) {
            case 0:
                ViewParent parent = this.f22625b.f22630d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC2737s0 abstractViewOnTouchListenerC2737s0 = this.f22625b;
                abstractViewOnTouchListenerC2737s0.a();
                View view = abstractViewOnTouchListenerC2737s0.f22630d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC2737s0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC2737s0.f22633g = true;
                    break;
                }
                break;
        }
    }
}
