package E1;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f4013a;

    /* renamed from: b, reason: collision with root package name */
    private int f4014b;

    public f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f4013a = new Object[i10];
    }

    private final boolean c(Object obj) {
        int i10 = this.f4014b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f4013a[i11] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // E1.e
    public boolean a(Object instance) {
        AbstractC6492s.i(instance, "instance");
        if (c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f4014b;
        Object[] objArr = this.f4013a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f4014b = i10 + 1;
        return true;
    }

    @Override // E1.e
    public Object b() {
        int i10 = this.f4014b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f4013a[i11];
        AbstractC6492s.g(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f4013a[i11] = null;
        this.f4014b--;
        return obj;
    }
}
