package J3;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2092a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f2092a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
