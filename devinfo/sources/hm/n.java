package hm;

import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n extends zj.e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final h[] f25192a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f25193b;

    public n(h[] hVarArr, int[] iArr) {
        this.f25192a = hVarArr;
        this.f25193b = iArr;
    }

    @Override // zj.a, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return super.contains((h) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        return this.f25192a[i4];
    }

    @Override // zj.a
    public final int getSize() {
        return this.f25192a.length;
    }

    @Override // zj.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return super.indexOf((h) obj);
        }
        return -1;
    }

    @Override // zj.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return super.lastIndexOf((h) obj);
        }
        return -1;
    }
}
