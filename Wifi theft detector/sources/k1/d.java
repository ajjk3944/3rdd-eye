package k1;

import k1.a;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class d extends a {
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // k1.a
    public Object a(a.b key) {
        p.e(key, "key");
        return b().get(key);
    }

    public final void c(a.b key, Object obj) {
        p.e(key, "key");
        b().put(key, obj);
    }

    public d(a initialExtras) {
        p.e(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    public /* synthetic */ d(a aVar, int i10, i iVar) {
        this((i10 & 1) != 0 ? a.C0426a.f21800b : aVar);
    }
}
