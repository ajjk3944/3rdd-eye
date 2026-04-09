package androidx.lifecycle;

import p.C5437b;

/* compiled from: MutableLiveData.java */
/* loaded from: classes.dex */
public class E<T> extends C<T> {
    public final void k(T t10) {
        boolean z10;
        synchronized (this.f16023a) {
            z10 = this.f16028f == C.f16022k;
            this.f16028f = t10;
        }
        if (z10) {
            C5437b.i0().j0(this.f16031j);
        }
    }
}
