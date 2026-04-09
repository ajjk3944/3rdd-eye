package q2;

import com.google.android.gms.internal.ads.C1268hc;

/* loaded from: classes.dex */
public final class Z0 extends AbstractBinderC2802A {

    /* renamed from: a, reason: collision with root package name */
    public final j2.u f23150a;

    /* renamed from: b, reason: collision with root package name */
    public final C1268hc f23151b;

    public Z0(j2.u uVar, C1268hc c1268hc) {
        this.f23150a = uVar;
        this.f23151b = c1268hc;
    }

    @Override // q2.InterfaceC2803B
    public final void V(C2852x0 c2852x0) {
        j2.u uVar = this.f23150a;
        if (uVar != null) {
            uVar.c(c2852x0.b());
        }
    }

    @Override // q2.InterfaceC2803B
    public final void z() {
        C1268hc c1268hc;
        j2.u uVar = this.f23150a;
        if (uVar == null || (c1268hc = this.f23151b) == null) {
            return;
        }
        uVar.f(c1268hc);
    }
}
