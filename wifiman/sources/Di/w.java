package di;

import Bh.G;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;

/* loaded from: classes4.dex */
public final class w extends r {
    public w(short s10) {
        super(Short.valueOf(s10));
    }

    @Override // di.AbstractC5398g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC7346d0 a(G module) {
        AbstractC6492s.i(module, "module");
        AbstractC7346d0 abstractC7346d0T = module.q().T();
        AbstractC6492s.h(abstractC7346d0T, "getShortType(...)");
        return abstractC7346d0T;
    }

    @Override // di.AbstractC5398g
    public String toString() {
        return ((Number) b()).intValue() + ".toShort()";
    }
}
