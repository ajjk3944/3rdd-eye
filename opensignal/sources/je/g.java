package je;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13623a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13624d;

    public /* synthetic */ g(int i10, Object obj) {
        this.f13623a = i10;
        this.f13624d = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f13623a) {
            case 0:
                j jVar = (j) this.f13624d;
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - jVar.f13636o;
                    if (jUptimeMillis < 0 || jUptimeMillis > 300) {
                        jVar.f13634m = false;
                    }
                    jVar.t();
                    jVar.f13634m = true;
                    jVar.f13636o = SystemClock.uptimeMillis();
                    break;
                }
                break;
            default:
                EditText editText = (EditText) this.f13624d;
                br.l.e(editText, "$this_allowInnerScrolling");
                boolean z10 = editText.canScrollVertically(-1) || editText.canScrollVertically(1);
                boolean z11 = motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3;
                ViewParent parent = editText.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(z10 && !z11);
                    break;
                }
                break;
        }
        return false;
    }
}
