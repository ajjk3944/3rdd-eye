package A;

import B.InterfaceC2444h;
import Yg.J;
import Zg.AbstractC3689v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class f implements InterfaceC2444h {

    /* renamed from: a, reason: collision with root package name */
    private final B f85a;

    public f(B b10) {
        this.f85a = b10;
    }

    private final int h(q qVar) {
        List listJ = qVar.j();
        int size = listJ.size();
        int iA = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iA += ((l) listJ.get(i10)).a();
        }
        return (iA / listJ.size()) + qVar.i();
    }

    @Override // B.InterfaceC2444h
    public int a() {
        return this.f85a.w().h();
    }

    @Override // B.InterfaceC2444h
    public void b(w.v vVar, int i10, int i11) {
        this.f85a.N(i10, i11, true);
    }

    @Override // B.InterfaceC2444h
    public int c() {
        l lVar = (l) AbstractC3689v.D0(this.f85a.w().j());
        if (lVar != null) {
            return lVar.getIndex();
        }
        return 0;
    }

    @Override // B.InterfaceC2444h
    public Object d(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objB = w.y.b(this.f85a, null, interfaceC6839p, interfaceC5380e, 1, null);
        return objB == AbstractC5467b.g() ? objB : J.f24997a;
    }

    @Override // B.InterfaceC2444h
    public int e() {
        return this.f85a.s();
    }

    @Override // B.InterfaceC2444h
    public float f(int i10) {
        Object obj;
        q qVarW = this.f85a.w();
        if (qVarW.j().isEmpty()) {
            return 0.0f;
        }
        List listJ = qVarW.j();
        int size = listJ.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = listJ.get(i11);
            if (((l) obj).getIndex() == i10) {
                break;
            }
            i11++;
        }
        return ((l) obj) == null ? (h(qVarW) * (i10 - g())) - e() : r4.b();
    }

    @Override // B.InterfaceC2444h
    public int g() {
        return this.f85a.r();
    }
}
