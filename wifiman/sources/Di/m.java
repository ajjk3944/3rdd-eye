package di;

import Bh.G;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;

/* loaded from: classes4.dex */
public final class m extends AbstractC5398g {
    public m(float f10) {
        super(Float.valueOf(f10));
    }

    @Override // di.AbstractC5398g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC7346d0 a(G module) {
        AbstractC6492s.i(module, "module");
        AbstractC7346d0 abstractC7346d0B = module.q().B();
        AbstractC6492s.h(abstractC7346d0B, "getFloatType(...)");
        return abstractC7346d0B;
    }

    @Override // di.AbstractC5398g
    public String toString() {
        return ((Number) b()).floatValue() + ".toFloat()";
    }
}
