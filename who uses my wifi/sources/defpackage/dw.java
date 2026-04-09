package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dw implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ew g;

    public /* synthetic */ dw(ew ewVar, int i) {
        this.f = i;
        this.g = ewVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ViewParent parent = this.g.i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ew ewVar = this.g;
                ewVar.a();
                View view = ewVar.i;
                if (view.isEnabled() && !view.isLongClickable() && ewVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    ewVar.l = true;
                    break;
                }
                break;
        }
    }
}
