package ht;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class w implements m0, lt.g {

    /* renamed from: a, reason: collision with root package name */
    public x f10950a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f10951b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10952c;

    public w(AbstractCollection abstractCollection) {
        br.l.e(abstractCollection, "typesToIntersect");
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f10951b = linkedHashSet;
        this.f10952c = linkedHashSet.hashCode();
    }

    public final b0 b() {
        i0.f10910d.getClass();
        return e.t(i0.f10911g, this, mq.w.f16945a, false, ic.a.j("member scope for intersection type", this.f10951b), new as.d(19, this));
    }

    public final String c(ar.k kVar) {
        br.l.e(kVar, "getProperTypeRelatedToStringify");
        return mq.o.x0(mq.o.M0(this.f10951b, new e2.u(2, kVar)), " & ", "{", "}", new as.d(20, kVar), 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return br.l.a(this.f10951b, ((w) obj).f10951b);
    }

    public final int hashCode() {
        return this.f10952c;
    }

    @Override // ht.m0
    public final or.h n() {
        or.h hVarN = ((x) this.f10951b.iterator().next()).Z().n();
        br.l.d(hVarN, "intersectedTypes.iterato…xt().constructor.builtIns");
        return hVarN;
    }

    @Override // ht.m0
    public final List o() {
        return mq.w.f16945a;
    }

    @Override // ht.m0
    public final rr.i p() {
        return null;
    }

    @Override // ht.m0
    public final Collection q() {
        return this.f10951b;
    }

    @Override // ht.m0
    public final boolean r() {
        return false;
    }

    public final String toString() {
        return c(v.f10949d);
    }
}
