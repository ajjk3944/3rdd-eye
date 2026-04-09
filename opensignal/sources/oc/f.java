package oc;

import ir.f0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: x, reason: collision with root package name */
    public static final f f19283x = new f(0, new Object[0]);

    /* renamed from: g, reason: collision with root package name */
    public final transient Object[] f19284g;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f19285r;

    public f(int i10, Object[] objArr) {
        this.f19284g = objArr;
        this.f19285r = i10;
    }

    @Override // oc.a
    public final Object[] a() {
        return this.f19284g;
    }

    @Override // oc.a
    public final int b() {
        return 0;
    }

    @Override // oc.a
    public final int c() {
        return this.f19285r;
    }

    @Override // oc.e, oc.a
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.f19284g;
        int i10 = this.f19285r;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        f0.b0(i10, this.f19285r);
        Object obj = this.f19284g[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19285r;
    }
}
