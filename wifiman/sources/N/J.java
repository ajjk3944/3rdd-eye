package N;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes.dex */
public final class J implements androidx.compose.ui.window.q {

    /* renamed from: a, reason: collision with root package name */
    private final long f13754a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0.d f13755b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6839p f13756c;

    public /* synthetic */ J(long j10, Y0.d dVar, InterfaceC6839p interfaceC6839p, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, dVar, interfaceC6839p);
    }

    @Override // androidx.compose.ui.window.q
    public long a(Y0.p pVar, long j10, Y0.t tVar, long j11) {
        InterfaceC8780j interfaceC8780jS;
        Object obj;
        Object next;
        int iX1 = this.f13755b.x1(AbstractC3327j0.j());
        int iX12 = this.f13755b.x1(Y0.j.e(this.f13754a));
        Y0.t tVar2 = Y0.t.Ltr;
        int i10 = iX12 * (tVar == tVar2 ? 1 : -1);
        int iX13 = this.f13755b.x1(Y0.j.f(this.f13754a));
        int iF = pVar.f() + i10;
        int iG = (pVar.g() - Y0.r.g(j11)) + i10;
        int iG2 = Y0.r.g(j10) - Y0.r.g(j11);
        if (tVar == tVar2) {
            Integer numValueOf = Integer.valueOf(iF);
            Integer numValueOf2 = Integer.valueOf(iG);
            if (pVar.f() < 0) {
                iG2 = 0;
            }
            interfaceC8780jS = AbstractC8783m.s(numValueOf, numValueOf2, Integer.valueOf(iG2));
        } else {
            Integer numValueOf3 = Integer.valueOf(iG);
            Integer numValueOf4 = Integer.valueOf(iF);
            if (pVar.g() <= Y0.r.g(j10)) {
                iG2 = 0;
            }
            interfaceC8780jS = AbstractC8783m.s(numValueOf3, numValueOf4, Integer.valueOf(iG2));
        }
        Iterator it = interfaceC8780jS.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue = ((Number) next).intValue();
            if (iIntValue >= 0 && iIntValue + Y0.r.g(j11) <= Y0.r.g(j10)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            iG = num.intValue();
        }
        int iMax = Math.max(pVar.d() + iX13, iX1);
        int iH = (pVar.h() - Y0.r.f(j11)) + iX13;
        Iterator it2 = AbstractC8783m.s(Integer.valueOf(iMax), Integer.valueOf(iH), Integer.valueOf((pVar.h() - (Y0.r.f(j11) / 2)) + iX13), Integer.valueOf((Y0.r.f(j10) - Y0.r.f(j11)) - iX1)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            int iIntValue2 = ((Number) next2).intValue();
            if (iIntValue2 >= iX1 && iIntValue2 + Y0.r.f(j11) <= Y0.r.f(j10) - iX1) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iH = num2.intValue();
        }
        this.f13756c.invoke(pVar, new Y0.p(iG, iH, Y0.r.g(j11) + iG, Y0.r.f(j11) + iH));
        return Y0.o.a(iG, iH);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        return Y0.j.d(this.f13754a, j10.f13754a) && AbstractC6492s.d(this.f13755b, j10.f13755b) && AbstractC6492s.d(this.f13756c, j10.f13756c);
    }

    public int hashCode() {
        return (((Y0.j.g(this.f13754a) * 31) + this.f13755b.hashCode()) * 31) + this.f13756c.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) Y0.j.h(this.f13754a)) + ", density=" + this.f13755b + ", onPositionCalculated=" + this.f13756c + ')';
    }

    private J(long j10, Y0.d dVar, InterfaceC6839p interfaceC6839p) {
        this.f13754a = j10;
        this.f13755b = dVar;
        this.f13756c = interfaceC6839p;
    }
}
