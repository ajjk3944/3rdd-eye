package oc;

import ir.f0;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: g, reason: collision with root package name */
    public final transient e f19278g;

    public c(e eVar) {
        this.f19278g = eVar;
    }

    @Override // oc.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f19278g.contains(obj);
    }

    @Override // oc.e
    public final e e() {
        return this.f19278g;
    }

    @Override // oc.e, java.util.List
    /* renamed from: g */
    public final e subList(int i10, int i11) {
        e eVar = this.f19278g;
        f0.c0(i10, i11, eVar.size());
        return eVar.subList(eVar.size() - i11, eVar.size() - i10).e();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        e eVar = this.f19278g;
        f0.b0(i10, eVar.size());
        return eVar.get((eVar.size() - 1) - i10);
    }

    @Override // oc.e, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f19278g.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // oc.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f19278g.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19278g.size();
    }
}
