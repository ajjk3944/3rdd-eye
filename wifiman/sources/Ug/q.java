package ug;

import hg.InterfaceC6043c;

/* loaded from: classes4.dex */
public final class q extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final Object f63022a;

    public q(Object obj) {
        this.f63022a = obj;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        b10.c(InterfaceC6043c.n());
        b10.onSuccess(this.f63022a);
    }
}
