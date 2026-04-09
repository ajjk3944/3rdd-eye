package X2;

import a4.p;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public final transient e f4162c;

    public c(e eVar) {
        this.f4162c = eVar;
    }

    @Override // X2.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f4162c.contains(obj);
    }

    @Override // X2.e
    public final e e() {
        return this.f4162c;
    }

    @Override // X2.e, java.util.List
    /* renamed from: f */
    public final e subList(int i, int i3) {
        e eVar = this.f4162c;
        p.y(i, i3, eVar.size());
        return eVar.subList(eVar.size() - i3, eVar.size() - i).e();
    }

    @Override // java.util.List
    public final Object get(int i) {
        e eVar = this.f4162c;
        p.w(i, eVar.size());
        return eVar.get((eVar.size() - 1) - i);
    }

    @Override // X2.e, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f4162c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // X2.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f4162c.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4162c.size();
    }
}
