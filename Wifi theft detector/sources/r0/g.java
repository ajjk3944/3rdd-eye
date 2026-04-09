package r0;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f24136a;

    /* renamed from: b, reason: collision with root package name */
    public int f24137b;

    public g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f24136a = new Object[i10];
    }

    @Override // r0.f
    public boolean a(Object instance) {
        p.e(instance, "instance");
        if (c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f24137b;
        Object[] objArr = this.f24136a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f24137b = i10 + 1;
        return true;
    }

    @Override // r0.f
    public Object b() {
        int i10 = this.f24137b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f24136a[i11];
        p.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f24136a[i11] = null;
        this.f24137b--;
        return obj;
    }

    public final boolean c(Object obj) {
        int i10 = this.f24137b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24136a[i11] == obj) {
                return true;
            }
        }
        return false;
    }
}
