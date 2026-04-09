package pr;

import at.m;
import at.n;
import gt.l;
import ht.d1;
import ht.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lq.b0;
import mq.p;
import mq.w;
import or.o;
import rr.f0;
import rr.s0;
import rr.z;
import ur.o0;

/* loaded from: classes.dex */
public final class d extends ur.b {
    public static final qs.b H = new qs.b(o.j, qs.g.e("Function"));
    public static final qs.b I = new qs.b(o.f19720h, qs.g.e("KFunction"));
    public final g B;
    public final int D;
    public final c E;
    public final i F;
    public final List G;

    /* renamed from: x, reason: collision with root package name */
    public final l f20626x;

    /* renamed from: y, reason: collision with root package name */
    public final f0 f20627y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, et.c cVar, g gVar, int i10) {
        super(lVar, gVar.numberedClassName(i10));
        br.l.e(cVar, "containingDeclaration");
        this.f20626x = lVar;
        this.f20627y = cVar;
        this.B = gVar;
        this.D = i10;
        this.E = new c(this);
        this.F = new i(lVar, this);
        ArrayList arrayList = new ArrayList();
        hr.d dVar = new hr.d(1, i10, 1);
        ArrayList arrayList2 = new ArrayList(p.a0(dVar, 10));
        Iterator it = dVar.iterator();
        while (true) {
            hr.c cVar2 = (hr.c) it;
            if (!cVar2.f10868g) {
                arrayList.add(o0.y1(this, d1.OUT_VARIANCE, qs.g.e("R"), arrayList.size(), this.f20626x));
                this.G = mq.o.Q0(arrayList);
                return;
            }
            int iNextInt = cVar2.nextInt();
            arrayList.add(o0.y1(this, d1.IN_VARIANCE, qs.g.e("P" + iNextInt), arrayList.size(), this.f20626x));
            arrayList2.add(b0.f15562a);
        }
    }

    @Override // rr.f
    public final s0 B0() {
        return null;
    }

    @Override // rr.f
    public final boolean D() {
        return false;
    }

    @Override // ur.z
    public final n H(jt.f fVar) {
        return this.F;
    }

    @Override // rr.f
    public final /* bridge */ /* synthetic */ Collection I() {
        return w.f16945a;
    }

    @Override // rr.x
    public final boolean I0() {
        return false;
    }

    @Override // rr.x
    public final boolean M() {
        return false;
    }

    @Override // rr.f
    public final boolean P0() {
        return false;
    }

    @Override // rr.f
    public final /* bridge */ /* synthetic */ ur.j R() {
        return null;
    }

    @Override // rr.f
    public final /* bridge */ /* synthetic */ n S() {
        return m.f2303b;
    }

    @Override // rr.f, rr.o, rr.x
    public final as.p c() {
        as.p pVar = rr.p.f21701e;
        br.l.d(pVar, "PUBLIC");
        return pVar;
    }

    @Override // rr.f
    public final rr.g f() {
        return rr.g.INTERFACE;
    }

    @Override // rr.f
    public final boolean g() {
        return false;
    }

    @Override // sr.a
    public final sr.h getAnnotations() {
        return sr.g.f22217a;
    }

    @Override // rr.m
    public final rr.o0 h() {
        return rr.o0.f21696s;
    }

    @Override // rr.f, rr.x
    public final z j() {
        return z.ABSTRACT;
    }

    @Override // rr.f
    public final boolean k() {
        return false;
    }

    @Override // rr.j
    public final boolean m() {
        return false;
    }

    @Override // rr.l
    public final rr.l o() {
        return this.f20627y;
    }

    @Override // rr.f, rr.j
    public final List s() {
        return this.G;
    }

    public final String toString() {
        String strB = getName().b();
        br.l.d(strB, "name.asString()");
        return strB;
    }

    @Override // rr.x
    public final boolean u() {
        return false;
    }

    @Override // rr.i
    public final m0 v() {
        return this.E;
    }

    @Override // rr.f
    public final boolean w() {
        return false;
    }

    @Override // rr.f
    public final /* bridge */ /* synthetic */ Collection z() {
        return w.f16945a;
    }
}
