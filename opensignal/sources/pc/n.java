package pc;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: x, reason: collision with root package name */
    public static final n f20458x = new n(0, new Object[0]);

    /* renamed from: g, reason: collision with root package name */
    public final transient Object[] f20459g;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f20460r;

    public n(int i10, Object[] objArr) {
        this.f20459g = objArr;
        this.f20460r = i10;
    }

    @Override // pc.j
    public final Object[] a() {
        return this.f20459g;
    }

    @Override // pc.j
    public final int b() {
        return 0;
    }

    @Override // pc.j
    public final int c() {
        return this.f20460r;
    }

    @Override // pc.j
    public final boolean d() {
        return false;
    }

    @Override // pc.m, pc.j
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f20459g;
        int i10 = this.f20460r;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        io.sentry.config.a.l0(i10, this.f20460r);
        Object obj = this.f20459g[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20460r;
    }
}
