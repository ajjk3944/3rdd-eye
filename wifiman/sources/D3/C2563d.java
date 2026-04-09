package D3;

import java.util.List;

/* renamed from: D3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2563d extends AbstractC2564e {

    /* renamed from: d, reason: collision with root package name */
    final transient int f2850d;

    /* renamed from: e, reason: collision with root package name */
    final transient int f2851e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC2564e f2852f;

    C2563d(AbstractC2564e abstractC2564e, int i10, int i11) {
        this.f2852f = abstractC2564e;
        this.f2850d = i10;
        this.f2851e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        P.a(i10, this.f2851e, "index");
        return this.f2852f.get(i10 + this.f2850d);
    }

    @Override // D3.AbstractC2561b
    final int j() {
        return this.f2852f.m() + this.f2850d + this.f2851e;
    }

    @Override // D3.AbstractC2561b
    final int m() {
        return this.f2852f.m() + this.f2850d;
    }

    @Override // D3.AbstractC2561b
    final Object[] o() {
        return this.f2852f.o();
    }

    @Override // D3.AbstractC2564e
    /* renamed from: s */
    public final AbstractC2564e subList(int i10, int i11) {
        P.c(i10, i11, this.f2851e);
        int i12 = this.f2850d;
        return this.f2852f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2851e;
    }

    @Override // D3.AbstractC2564e, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
