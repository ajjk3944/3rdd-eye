package Q;

import q5.i;
import x.C2981b;

/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3165a;

    /* renamed from: b, reason: collision with root package name */
    public int f3166b;

    public c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3165a = new Object[i];
    }

    public void a(C2981b c2981b) {
        int i = this.f3166b;
        Object[] objArr = this.f3165a;
        if (i < objArr.length) {
            objArr[i] = c2981b;
            this.f3166b = i + 1;
        }
    }

    @Override // Q.b
    public boolean d(Object obj) {
        Object[] objArr;
        boolean z6;
        i.e(obj, "instance");
        int i = this.f3166b;
        int i3 = 0;
        while (true) {
            objArr = this.f3165a;
            if (i3 >= i) {
                z6 = false;
                break;
            }
            if (objArr[i3] == obj) {
                z6 = true;
                break;
            }
            i3++;
        }
        if (z6) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i6 = this.f3166b;
        if (i6 >= objArr.length) {
            return false;
        }
        objArr[i6] = obj;
        this.f3166b = i6 + 1;
        return true;
    }

    @Override // Q.b
    public Object h() {
        int i = this.f3166b;
        if (i <= 0) {
            return null;
        }
        int i3 = i - 1;
        Object[] objArr = this.f3165a;
        Object obj = objArr[i3];
        i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i3] = null;
        this.f3166b--;
        return obj;
    }

    public c() {
        this.f3165a = new Object[256];
    }
}
