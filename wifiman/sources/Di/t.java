package di;

import Bh.G;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;

/* loaded from: classes4.dex */
public final class t extends r {
    public t(long j10) {
        super(Long.valueOf(j10));
    }

    @Override // di.AbstractC5398g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC7346d0 a(G module) {
        AbstractC6492s.i(module, "module");
        AbstractC7346d0 abstractC7346d0F = module.q().F();
        AbstractC6492s.h(abstractC7346d0F, "getLongType(...)");
        return abstractC7346d0F;
    }

    @Override // di.AbstractC5398g
    public String toString() {
        return ((Number) b()).longValue() + ".toLong()";
    }
}
