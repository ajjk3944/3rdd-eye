package X2;

import a4.p;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final f f4167e = new f(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f4168c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f4169d;

    public f(int i, Object[] objArr) {
        this.f4168c = objArr;
        this.f4169d = i;
    }

    @Override // X2.a
    public final Object[] a() {
        return this.f4168c;
    }

    @Override // X2.a
    public final int b() {
        return 0;
    }

    @Override // X2.a
    public final int c() {
        return this.f4169d;
    }

    @Override // X2.e, X2.a
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.f4168c;
        int i = this.f4169d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        p.w(i, this.f4169d);
        Object obj = this.f4168c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4169d;
    }
}
