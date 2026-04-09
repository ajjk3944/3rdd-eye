package C3;

import java.util.List;

/* loaded from: classes.dex */
final class E extends F {

    /* renamed from: c, reason: collision with root package name */
    final transient int f2203c;

    /* renamed from: d, reason: collision with root package name */
    final transient int f2204d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ F f2205e;

    E(F f10, int i10, int i11) {
        this.f2205e = f10;
        this.f2203c = i10;
        this.f2204d = i11;
    }

    @Override // C3.C
    final Object[] g() {
        return this.f2205e.g();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z.a(i10, this.f2204d, "index");
        return this.f2205e.get(i10 + this.f2203c);
    }

    @Override // C3.C
    final int j() {
        return this.f2205e.j() + this.f2203c;
    }

    @Override // C3.C
    final int m() {
        return this.f2205e.j() + this.f2203c + this.f2204d;
    }

    @Override // C3.C
    final boolean s() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2204d;
    }

    @Override // C3.F, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // C3.F
    /* renamed from: y */
    public final F subList(int i10, int i11) {
        z.c(i10, i11, this.f2204d);
        int i12 = this.f2203c;
        return this.f2205e.subList(i10 + i12, i11 + i12);
    }
}
