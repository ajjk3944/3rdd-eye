package ug;

import ig.AbstractC6152a;
import lg.EnumC6593c;
import zg.AbstractC8755h;

/* loaded from: classes4.dex */
public final class j extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final kg.q f62997a;

    public j(kg.q qVar) {
        this.f62997a = qVar;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        try {
            th = (Throwable) AbstractC8755h.c(this.f62997a.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th2) {
            th = th2;
            AbstractC6152a.b(th);
        }
        EnumC6593c.error(th, b10);
    }
}
