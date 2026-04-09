package g4;

import j4.AbstractC2590w;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public class l extends AbstractC2590w {

    /* renamed from: a, reason: collision with root package name */
    public z f20230a = null;

    @Override // g4.z
    public final Object b(C2762a c2762a) {
        z zVar = this.f20230a;
        if (zVar != null) {
            return zVar.b(c2762a);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) {
        z zVar = this.f20230a;
        if (zVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        zVar.c(c2764c, obj);
    }

    @Override // j4.AbstractC2590w
    public final z d() {
        z zVar = this.f20230a;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
