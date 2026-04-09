package Zi;

import Zg.AbstractC3689v;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Zi.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3723o0 extends Z0 {
    protected abstract String f0(String str, String str2);

    protected String g0(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return descriptor.f(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z0
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final String a0(Xi.f fVar, int i10) {
        AbstractC6492s.i(fVar, "<this>");
        return i0(g0(fVar, i10));
    }

    protected final String i0(String nestedName) {
        AbstractC6492s.i(nestedName, "nestedName");
        String str = (String) Z();
        if (str == null) {
            str = "";
        }
        return f0(str, nestedName);
    }

    protected final String j0() {
        return b0().isEmpty() ? "$" : AbstractC3689v.z0(b0(), ".", "$.", null, 0, null, null, 60, null);
    }
}
