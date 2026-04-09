package E3;

import java.util.List;

/* loaded from: classes.dex */
final class j extends k {

    /* renamed from: c, reason: collision with root package name */
    final transient int f4027c;

    /* renamed from: d, reason: collision with root package name */
    final transient int f4028d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f4029e;

    j(k kVar, int i10, int i11) {
        this.f4029e = kVar;
        this.f4027c = i10;
        this.f4028d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        e.a(i10, this.f4028d, "index");
        return this.f4029e.get(i10 + this.f4027c);
    }

    @Override // E3.h
    final int j() {
        return this.f4029e.m() + this.f4027c + this.f4028d;
    }

    @Override // E3.h
    final int m() {
        return this.f4029e.m() + this.f4027c;
    }

    @Override // E3.h
    final Object[] o() {
        return this.f4029e.o();
    }

    @Override // E3.k
    /* renamed from: s */
    public final k subList(int i10, int i11) {
        e.c(i10, i11, this.f4028d);
        k kVar = this.f4029e;
        int i12 = this.f4027c;
        return kVar.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4028d;
    }

    @Override // E3.k, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
