package Y2;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class I extends F {

    /* renamed from: e, reason: collision with root package name */
    public static final I f4265e = new I(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f4266c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f4267d;

    public I(int i, Object[] objArr) {
        this.f4266c = objArr;
        this.f4267d = i;
    }

    @Override // Y2.F, Y2.C
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f4266c;
        int i = this.f4267d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // Y2.C
    public final int b() {
        return this.f4267d;
    }

    @Override // Y2.C
    public final int c() {
        return 0;
    }

    @Override // Y2.C
    public final Object[] d() {
        return this.f4266c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        A.b(i, this.f4267d);
        Object obj = this.f4266c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4267d;
    }
}
