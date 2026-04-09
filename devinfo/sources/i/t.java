package i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t extends ContentFrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v f25349i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, n.c cVar) {
        super(cVar, null);
        this.f25349i = vVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f25349i.v(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (x10 < -5 || y10 < -5 || x10 > getWidth() + 5 || y10 > getHeight() + 5) {
                v vVar = this.f25349i;
                vVar.t(vVar.B(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i4) {
        setBackgroundDrawable(jm.a.l(i4, getContext()));
    }
}
