package androidx.compose.ui.focus;

import androidx.compose.ui.e;

/* loaded from: classes.dex */
final class r extends e.c implements k0.k {

    /* renamed from: n, reason: collision with root package name */
    private o f28859n;

    public r(o oVar) {
        this.f28859n = oVar;
    }

    public final o D2() {
        return this.f28859n;
    }

    public final void E2(o oVar) {
        this.f28859n = oVar;
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        super.n2();
        this.f28859n.e().b(this);
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        this.f28859n.e().x(this);
        super.o2();
    }
}
