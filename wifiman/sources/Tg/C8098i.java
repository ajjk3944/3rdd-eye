package tg;

import ig.AbstractC6152a;
import java.util.Objects;
import lg.EnumC6593c;

/* renamed from: tg.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8098i extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final kg.q f62412a;

    public C8098i(kg.q qVar) {
        this.f62412a = qVar;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        try {
            Object obj = this.f62412a.get();
            Objects.requireNonNull(obj, "The supplier returned a null ObservableSource");
            ((gg.v) obj).d(xVar);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC6593c.error(th2, xVar);
        }
    }
}
