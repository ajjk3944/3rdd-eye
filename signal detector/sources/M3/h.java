package M3;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.common.ul;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2850b;

    public /* synthetic */ h(int i, Object obj) {
        this.f2849a = i;
        this.f2850b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f2849a) {
            case 0:
                k kVar = (k) this.f2850b;
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - kVar.f2862o;
                    if (jUptimeMillis < 0 || jUptimeMillis > 300) {
                        kVar.f2860m = false;
                    }
                    kVar.u();
                    kVar.f2860m = true;
                    kVar.f2862o = SystemClock.uptimeMillis();
                }
                return false;
            default:
                return ((ul) this.f2850b).emc(view, motionEvent);
        }
    }
}
