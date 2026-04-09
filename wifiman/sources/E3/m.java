package E3;

/* loaded from: classes.dex */
final class m extends k {

    /* renamed from: e, reason: collision with root package name */
    static final k f4031e = new m(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f4032c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f4033d;

    m(Object[] objArr, int i10) {
        this.f4032c = objArr;
        this.f4033d = i10;
    }

    @Override // E3.k, E3.h
    final int g(Object[] objArr, int i10) {
        System.arraycopy(this.f4032c, 0, objArr, 0, this.f4033d);
        return this.f4033d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        e.a(i10, this.f4033d, "index");
        Object obj = this.f4032c[i10];
        obj.getClass();
        return obj;
    }

    @Override // E3.h
    final int j() {
        return this.f4033d;
    }

    @Override // E3.h
    final int m() {
        return 0;
    }

    @Override // E3.h
    final Object[] o() {
        return this.f4032c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4033d;
    }
}
