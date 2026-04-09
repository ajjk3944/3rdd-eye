package K6;

import android.view.MotionEvent;
import android.view.View;
import g6.C4393a;
import p4.C5457g;

/* compiled from: R8$$SyntheticClass */
/* renamed from: K6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0710b implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3386c;

    public /* synthetic */ ViewOnTouchListenerC0710b(Object obj, int i) {
        this.f3385b = i;
        this.f3386c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f3385b) {
            case 0:
                return ((Boolean) ((C0716d) this.f3386c).invoke(view, motionEvent)).booleanValue();
            case 1:
                return C4393a.m139bindListeners$lambda0((C4393a) this.f3386c, view, motionEvent);
            default:
                C5457g c5457g = (C5457g) this.f3386c;
                c5457g.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c5457g.f45144o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c5457g.f45142m = false;
                    }
                    c5457g.u();
                    c5457g.f45142m = true;
                    c5457g.f45144o = System.currentTimeMillis();
                }
                return false;
        }
    }
}
