package vr;

import br.l;
import nq.f;
import rr.a1;
import rr.b1;
import rr.e1;
import rr.z0;

/* loaded from: classes.dex */
public final class a extends n.a {

    /* renamed from: r, reason: collision with root package name */
    public static final a f23949r = new a("package", false);

    @Override // n.a
    public final Integer a(n.a aVar) {
        l.e(aVar, "visibility");
        if (this == aVar) {
            return 0;
        }
        f fVar = e1.f21687a;
        return (aVar == z0.f21726r || aVar == a1.f21675r) ? 1 : -1;
    }

    @Override // n.a
    public final String d() {
        return "public/*package*/";
    }

    @Override // n.a
    public final n.a k() {
        return b1.f21677r;
    }
}
