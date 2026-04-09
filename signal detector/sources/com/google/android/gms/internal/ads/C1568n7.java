package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.n7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1568n7 extends AbstractCallableC1676p7 {

    /* renamed from: h, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0919b7 f15745h;
    public final long i;

    public C1568n7(X6 x6, S5 s5, int i, ViewOnAttachStateChangeListenerC0919b7 viewOnAttachStateChangeListenerC0919b7) {
        super(x6, "X3d3ekEggpPfZcTTuZPSKX+MUCnQGNsbyccHnkW7iVTfczCTjKoxcgVjpAE8Uhyz", "I4rncSeVGoKv0gEJ8Xd0rq9G0kL2Ky2ley3iuTG83Dg=", s5, i, 53);
        this.f15745h = viewOnAttachStateChangeListenerC0919b7;
        if (viewOnAttachStateChangeListenerC0919b7 != null) {
            if (viewOnAttachStateChangeListenerC0919b7.f13323l <= -2) {
                WeakReference weakReference = viewOnAttachStateChangeListenerC0919b7.f13320h;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    viewOnAttachStateChangeListenerC0919b7.f13323l = -3L;
                }
            }
            this.i = viewOnAttachStateChangeListenerC0919b7.f13323l;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1676p7
    public final void a() {
        if (this.f15745h != null) {
            long jLongValue = ((Long) this.f16134e.invoke(null, Long.valueOf(this.i))).longValue();
            S5 s5 = this.f16133d;
            s5.b();
            ((C1136f6) s5.f13551b).S(jLongValue);
        }
    }
}
