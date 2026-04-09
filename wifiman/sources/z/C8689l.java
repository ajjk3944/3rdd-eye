package z;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8689l implements D0.d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f66924a;

    /* renamed from: b, reason: collision with root package name */
    private f0 f66925b;

    public C8689l(InterfaceC6835l interfaceC6835l) {
        this.f66924a = interfaceC6835l;
    }

    @Override // D0.d
    public void Z0(D0.k kVar) {
        f0 f0Var = (f0) kVar.z(i0.b());
        if (AbstractC6492s.d(f0Var, this.f66925b)) {
            return;
        }
        this.f66925b = f0Var;
        this.f66924a.invoke(f0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8689l) && ((C8689l) obj).f66924a == this.f66924a;
    }

    public int hashCode() {
        return this.f66924a.hashCode();
    }
}
