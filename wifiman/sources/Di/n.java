package di;

import Bh.G;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;

/* loaded from: classes4.dex */
public final class n extends r {
    public n(int i10) {
        super(Integer.valueOf(i10));
    }

    @Override // di.AbstractC5398g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC7346d0 a(G module) {
        AbstractC6492s.i(module, "module");
        AbstractC7346d0 abstractC7346d0D = module.q().D();
        AbstractC6492s.h(abstractC7346d0D, "getIntType(...)");
        return abstractC7346d0D;
    }
}
