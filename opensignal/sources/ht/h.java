package ht;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f10905a;

    /* renamed from: b, reason: collision with root package name */
    public final gt.d f10906b;

    public h(gt.o oVar) {
        br.l.e(oVar, "storageManager");
        this.f10906b = new gt.d((gt.l) oVar, new g(0, this), new as.d(18, this));
    }

    public abstract Collection b();

    public abstract x c();

    public abstract rr.p0 d();

    @Override // ht.m0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final List q() {
        return ((f) this.f10906b.c()).f10898b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m0) && obj.hashCode() == hashCode()) {
            m0 m0Var = (m0) obj;
            if (m0Var.o().size() == o().size()) {
                rr.i iVarP = p();
                rr.i iVarP2 = m0Var.p();
                if (iVarP2 == null || kt.k.f(iVarP) || ts.d.o(iVarP) || kt.k.f(iVarP2) || ts.d.o(iVarP2)) {
                    return false;
                }
                return f(iVarP2);
            }
        }
        return false;
    }

    public abstract boolean f(rr.i iVar);

    public final int hashCode() {
        int i10 = this.f10905a;
        if (i10 != 0) {
            return i10;
        }
        rr.i iVarP = p();
        int iIdentityHashCode = (kt.k.f(iVarP) || ts.d.o(iVarP)) ? System.identityHashCode(this) : ts.d.g(iVarP).f21030a.hashCode();
        this.f10905a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    public List g(List list) {
        return list;
    }
}
