package kb;

import aj.AbstractC3868b;
import kotlin.jvm.internal.AbstractC6492s;
import ub.C8156c;

/* loaded from: classes3.dex */
public final class t extends m {
    @Override // kb.p
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public SimpleResponseHeader g(String headerString) {
        AbstractC6492s.i(headerString, "headerString");
        AbstractC3868b abstractC3868bD = C8156c.f62925a.d();
        abstractC3868bD.a();
        return (SimpleResponseHeader) abstractC3868bD.b(SimpleResponseHeader.INSTANCE.serializer(), headerString);
    }
}
