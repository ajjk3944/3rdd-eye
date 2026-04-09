package p;

import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 extends s1 {
    public final /* synthetic */ k0 j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f30689k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, k0 k0Var) {
        super(appCompatSpinner2);
        this.f30689k = appCompatSpinner;
        this.j = k0Var;
    }

    @Override // p.s1
    public final o.c0 b() {
        return this.j;
    }

    @Override // p.s1
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.f30689k;
        if (appCompatSpinner.getInternalPopup().a()) {
            return true;
        }
        appCompatSpinner.f773f.m(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
