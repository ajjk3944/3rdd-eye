package F3;

import java.util.List;

/* renamed from: F3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2791g extends AbstractC2792h {

    /* renamed from: d, reason: collision with root package name */
    final transient int f5912d;

    /* renamed from: e, reason: collision with root package name */
    final transient int f5913e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC2792h f5914f;

    C2791g(AbstractC2792h abstractC2792h, int i10, int i11) {
        this.f5914f = abstractC2792h;
        this.f5912d = i10;
        this.f5913e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC2807x.a(i10, this.f5913e, "index");
        return this.f5914f.get(i10 + this.f5912d);
    }

    @Override // F3.AbstractC2788d
    final int j() {
        return this.f5914f.m() + this.f5912d + this.f5913e;
    }

    @Override // F3.AbstractC2788d
    final int m() {
        return this.f5914f.m() + this.f5912d;
    }

    @Override // F3.AbstractC2788d
    final Object[] o() {
        return this.f5914f.o();
    }

    @Override // F3.AbstractC2792h
    /* renamed from: s */
    public final AbstractC2792h subList(int i10, int i11) {
        AbstractC2807x.c(i10, i11, this.f5913e);
        int i12 = this.f5912d;
        return this.f5914f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5913e;
    }

    @Override // F3.AbstractC2792h, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
