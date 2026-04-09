package com.google.common.collect;

/* loaded from: classes3.dex */
final class K extends r {

    /* renamed from: h, reason: collision with root package name */
    private static final Object[] f38338h;

    /* renamed from: i, reason: collision with root package name */
    static final K f38339i;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f38340c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f38341d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f38342e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f38343f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f38344g;

    static {
        Object[] objArr = new Object[0];
        f38338h = objArr;
        f38339i = new K(objArr, 0, objArr, 0, 0);
    }

    K(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f38340c = objArr;
        this.f38341d = i10;
        this.f38342e = objArr2;
        this.f38343f = i11;
        this.f38344g = i12;
    }

    @Override // com.google.common.collect.r
    AbstractC5069o J() {
        return AbstractC5069o.y(this.f38340c, this.f38344g);
    }

    @Override // com.google.common.collect.r
    boolean S() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return v().iterator();
    }

    @Override // com.google.common.collect.AbstractC5068n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f38342e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = AbstractC5067m.c(obj);
        while (true) {
            int i10 = iC & this.f38343f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i10 + 1;
        }
    }

    @Override // com.google.common.collect.AbstractC5068n
    int g(Object[] objArr, int i10) {
        System.arraycopy(this.f38340c, 0, objArr, i10, this.f38344g);
        return i10 + this.f38344g;
    }

    @Override // com.google.common.collect.r, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f38341d;
    }

    @Override // com.google.common.collect.AbstractC5068n
    Object[] j() {
        return this.f38340c;
    }

    @Override // com.google.common.collect.AbstractC5068n
    int m() {
        return this.f38344g;
    }

    @Override // com.google.common.collect.AbstractC5068n
    int o() {
        return 0;
    }

    @Override // com.google.common.collect.AbstractC5068n
    boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f38344g;
    }
}
