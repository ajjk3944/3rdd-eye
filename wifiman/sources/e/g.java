package E;

import Y0.t;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6526b;
import l0.AbstractC6536l;
import l0.AbstractC6538n;
import l0.C6533i;
import m0.Q0;

/* loaded from: classes.dex */
public final class g extends a {
    public g(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    @Override // E.a
    public Q0 e(long j10, float f10, float f11, float f12, float f13, t tVar) {
        if (f10 + f11 + f12 + f13 == 0.0f) {
            return new Q0.b(AbstractC6538n.c(j10));
        }
        C6533i c6533iC = AbstractC6538n.c(j10);
        t tVar2 = t.Ltr;
        return new Q0.c(AbstractC6536l.b(c6533iC, AbstractC6526b.b(tVar == tVar2 ? f10 : f11, 0.0f, 2, null), AbstractC6526b.b(tVar == tVar2 ? f11 : f10, 0.0f, 2, null), AbstractC6526b.b(tVar == tVar2 ? f12 : f13, 0.0f, 2, null), AbstractC6526b.b(tVar == tVar2 ? f13 : f12, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return AbstractC6492s.d(i(), gVar.i()) && AbstractC6492s.d(h(), gVar.h()) && AbstractC6492s.d(f(), gVar.f()) && AbstractC6492s.d(g(), gVar.g());
    }

    public int hashCode() {
        return (((((i().hashCode() * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    @Override // E.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public g c(b bVar, b bVar2, b bVar3, b bVar4) {
        return new g(bVar, bVar2, bVar3, bVar4);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + i() + ", topEnd = " + h() + ", bottomEnd = " + f() + ", bottomStart = " + g() + ')';
    }
}
