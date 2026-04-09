package vr;

import br.l;
import nq.f;
import rr.a1;
import rr.b1;
import rr.e1;
import rr.w0;
import rr.z0;

/* loaded from: classes.dex */
public final class b extends n.a {

    /* renamed from: r, reason: collision with root package name */
    public static final b f23950r = new b("protected_and_package", true);

    @Override // n.a
    public final Integer a(n.a aVar) {
        l.e(aVar, "visibility");
        if (equals(aVar)) {
            return 0;
        }
        if (aVar == w0.f21723r) {
            return null;
        }
        f fVar = e1.f21687a;
        return (aVar == z0.f21726r || aVar == a1.f21675r) ? 1 : -1;
    }

    @Override // n.a
    public final String d() {
        return "protected/*protected and package*/";
    }

    @Override // n.a
    public final n.a k() {
        return b1.f21677r;
    }
}
