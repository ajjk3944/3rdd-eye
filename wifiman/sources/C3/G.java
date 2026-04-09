package C3;

import java.util.Objects;

/* loaded from: classes.dex */
final class G extends F {

    /* renamed from: e, reason: collision with root package name */
    static final F f2207e = new G(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f2208c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f2209d;

    G(Object[] objArr, int i10) {
        this.f2208c = objArr;
        this.f2209d = i10;
    }

    @Override // C3.C
    final Object[] g() {
        return this.f2208c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z.a(i10, this.f2209d, "index");
        Object obj = this.f2208c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // C3.C
    final int j() {
        return 0;
    }

    @Override // C3.C
    final int m() {
        return this.f2209d;
    }

    @Override // C3.C
    final boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2209d;
    }

    @Override // C3.F, C3.C
    final int v(Object[] objArr, int i10) {
        System.arraycopy(this.f2208c, 0, objArr, 0, this.f2209d);
        return this.f2209d;
    }
}
