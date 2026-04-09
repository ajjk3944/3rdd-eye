package y1;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class r extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25767d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f25768g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(AndroidComposeView androidComposeView, int i10) {
        super(0);
        this.f25767d = i10;
        this.f25768g = androidComposeView;
    }

    @Override // ar.a
    public final Object c() {
        int actionMasked;
        switch (this.f25767d) {
            case 0:
                AndroidComposeView androidComposeView = this.f25768g;
                MotionEvent motionEvent = androidComposeView.M0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    androidComposeView.N0 = SystemClock.uptimeMillis();
                    androidComposeView.post(androidComposeView.S0);
                }
                return lq.b0.f15562a;
            default:
                return this.f25768g.get_viewTreeOwners();
        }
    }
}
