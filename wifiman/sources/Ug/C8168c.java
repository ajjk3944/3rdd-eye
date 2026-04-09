package ug;

import gg.D;
import ig.AbstractC6152a;
import java.util.Objects;
import lg.EnumC6593c;

/* renamed from: ug.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8168c extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final kg.q f62969a;

    public C8168c(kg.q qVar) {
        this.f62969a = qVar;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        try {
            Object obj = this.f62969a.get();
            Objects.requireNonNull(obj, "The singleSupplier returned a null SingleSource");
            ((D) obj).a(b10);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC6593c.error(th2, b10);
        }
    }
}
