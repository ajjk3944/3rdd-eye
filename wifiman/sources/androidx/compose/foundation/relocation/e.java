package androidx.compose.foundation.relocation;

import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class e extends e.c {

    /* renamed from: n, reason: collision with root package name */
    private D.b f28403n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f28404o;

    public e(D.b bVar) {
        this.f28403n = bVar;
    }

    private final void D2() {
        D.b bVar = this.f28403n;
        if (bVar instanceof a) {
            AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((a) bVar).b().x(this);
        }
    }

    public final void E2(D.b bVar) {
        D2();
        if (bVar instanceof a) {
            ((a) bVar).b().b(this);
        }
        this.f28403n = bVar;
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return this.f28404o;
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        E2(this.f28403n);
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        D2();
    }
}
