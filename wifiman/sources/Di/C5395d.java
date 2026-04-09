package di;

import Bh.G;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;

/* renamed from: di.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5395d extends r {
    public C5395d(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // di.AbstractC5398g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC7346d0 a(G module) {
        AbstractC6492s.i(module, "module");
        AbstractC7346d0 abstractC7346d0T = module.q().t();
        AbstractC6492s.h(abstractC7346d0T, "getByteType(...)");
        return abstractC7346d0T;
    }

    @Override // di.AbstractC5398g
    public String toString() {
        return ((Number) b()).intValue() + ".toByte()";
    }
}
