package di;

import Bh.G;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;

/* renamed from: di.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5401j extends AbstractC5398g {
    public C5401j(double d10) {
        super(Double.valueOf(d10));
    }

    @Override // di.AbstractC5398g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC7346d0 a(G module) {
        AbstractC6492s.i(module, "module");
        AbstractC7346d0 abstractC7346d0Z = module.q().z();
        AbstractC6492s.h(abstractC7346d0Z, "getDoubleType(...)");
        return abstractC7346d0Z;
    }

    @Override // di.AbstractC5398g
    public String toString() {
        return ((Number) b()).doubleValue() + ".toDouble()";
    }
}
