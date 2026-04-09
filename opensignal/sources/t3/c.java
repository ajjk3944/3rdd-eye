package t3;

import br.l;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f22397a;

    /* renamed from: b, reason: collision with root package name */
    public int f22398b;

    public c(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f22397a = new Object[i10];
    }

    public Object a() {
        int i10 = this.f22398b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f22397a;
        Object obj = objArr[i11];
        l.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f22398b--;
        return obj;
    }

    public void b(x2.b bVar) {
        int i10 = this.f22398b;
        Object[] objArr = this.f22397a;
        if (i10 < objArr.length) {
            objArr[i10] = bVar;
            this.f22398b = i10 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z10;
        l.e(obj, "instance");
        int i10 = this.f22398b;
        int i11 = 0;
        while (true) {
            objArr = this.f22397a;
            if (i11 >= i10) {
                z10 = false;
                break;
            }
            if (objArr[i11] == obj) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i12 = this.f22398b;
        if (i12 >= objArr.length) {
            return false;
        }
        objArr[i12] = obj;
        this.f22398b = i12 + 1;
        return true;
    }

    public c() {
        this.f22397a = new Object[256];
    }
}
