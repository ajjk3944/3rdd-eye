package K0;

import kotlin.jvm.internal.l;

/* compiled from: Pools.kt */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2942a;

    /* renamed from: b, reason: collision with root package name */
    public int f2943b;

    public d(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2942a = new Object[i];
    }

    public Object a() {
        int i = this.f2943b;
        if (i <= 0) {
            return null;
        }
        int i10 = i - 1;
        Object[] objArr = this.f2942a;
        Object obj = objArr[i10];
        l.d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f2943b--;
        return obj;
    }

    public void b(p0.b bVar) {
        int i = this.f2943b;
        Object[] objArr = this.f2942a;
        if (i < objArr.length) {
            objArr[i] = bVar;
            this.f2943b = i + 1;
        }
    }

    public boolean c(Object instance) {
        Object[] objArr;
        boolean z10;
        l.f(instance, "instance");
        int i = this.f2943b;
        int i10 = 0;
        while (true) {
            objArr = this.f2942a;
            if (i10 >= i) {
                z10 = false;
                break;
            }
            if (objArr[i10] == instance) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i11 = this.f2943b;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = instance;
        this.f2943b = i11 + 1;
        return true;
    }

    public d() {
        this.f2942a = new Object[256];
    }
}
