package d4;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f21975a;

    /* renamed from: b, reason: collision with root package name */
    public int f21976b;

    public d(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f21975a = new Object[i4];
    }

    public void a(i3.b bVar) {
        int i4 = this.f21976b;
        Object[] objArr = this.f21975a;
        if (i4 < objArr.length) {
            objArr[i4] = bVar;
            this.f21976b = i4 + 1;
        }
    }

    @Override // d4.c
    public boolean i(Object obj) {
        Object[] objArr;
        boolean z3;
        k.e(obj, "instance");
        int i4 = this.f21976b;
        int i10 = 0;
        while (true) {
            objArr = this.f21975a;
            if (i10 >= i4) {
                z3 = false;
                break;
            }
            if (objArr[i10] == obj) {
                z3 = true;
                break;
            }
            i10++;
        }
        if (z3) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i11 = this.f21976b;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = obj;
        this.f21976b = i11 + 1;
        return true;
    }

    @Override // d4.c
    public Object k() {
        int i4 = this.f21976b;
        if (i4 <= 0) {
            return null;
        }
        int i10 = i4 - 1;
        Object[] objArr = this.f21975a;
        Object obj = objArr[i10];
        k.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f21976b--;
        return obj;
    }

    public d() {
        this.f21975a = new Object[256];
    }
}
