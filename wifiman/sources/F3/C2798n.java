package F3;

import java.util.Objects;

/* renamed from: F3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2798n extends AbstractC2792h {

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC2792h f5927f = new C2798n(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f5928d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f5929e;

    C2798n(Object[] objArr, int i10) {
        this.f5928d = objArr;
        this.f5929e = i10;
    }

    @Override // F3.AbstractC2792h, F3.AbstractC2788d
    final int g(Object[] objArr, int i10) {
        System.arraycopy(this.f5928d, 0, objArr, 0, this.f5929e);
        return this.f5929e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC2807x.a(i10, this.f5929e, "index");
        Object obj = this.f5928d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // F3.AbstractC2788d
    final int j() {
        return this.f5929e;
    }

    @Override // F3.AbstractC2788d
    final int m() {
        return 0;
    }

    @Override // F3.AbstractC2788d
    final Object[] o() {
        return this.f5928d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5929e;
    }
}
