package di;

import Bh.G;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;

/* loaded from: classes4.dex */
public final class x extends AbstractC5398g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String value) {
        super(value);
        AbstractC6492s.i(value, "value");
    }

    @Override // di.AbstractC5398g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC7346d0 a(G module) {
        AbstractC6492s.i(module, "module");
        AbstractC7346d0 abstractC7346d0W = module.q().W();
        AbstractC6492s.h(abstractC7346d0W, "getStringType(...)");
        return abstractC7346d0W;
    }

    @Override // di.AbstractC5398g
    public String toString() {
        return '\"' + ((String) b()) + '\"';
    }
}
