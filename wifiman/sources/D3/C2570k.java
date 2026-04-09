package D3;

import java.util.Objects;

/* renamed from: D3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2570k extends AbstractC2564e {

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC2564e f2862f = new C2570k(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f2863d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f2864e;

    C2570k(Object[] objArr, int i10) {
        this.f2863d = objArr;
        this.f2864e = i10;
    }

    @Override // D3.AbstractC2564e, D3.AbstractC2561b
    final int g(Object[] objArr, int i10) {
        System.arraycopy(this.f2863d, 0, objArr, 0, this.f2864e);
        return this.f2864e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        P.a(i10, this.f2864e, "index");
        Object obj = this.f2863d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // D3.AbstractC2561b
    final int j() {
        return this.f2864e;
    }

    @Override // D3.AbstractC2561b
    final int m() {
        return 0;
    }

    @Override // D3.AbstractC2561b
    final Object[] o() {
        return this.f2863d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2864e;
    }
}
