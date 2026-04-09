package pb;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: d, reason: collision with root package name */
    public int f20400d;

    /* renamed from: e, reason: collision with root package name */
    public int f20401e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20397a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f20398b = 65536;

    /* renamed from: f, reason: collision with root package name */
    public int f20402f = 0;

    /* renamed from: g, reason: collision with root package name */
    public a[] f20403g = new a[100];

    /* renamed from: c, reason: collision with root package name */
    public final a[] f20399c = new a[1];

    public final synchronized void a(a[] aVarArr) {
        try {
            int i10 = this.f20402f;
            int length = aVarArr.length + i10;
            a[] aVarArr2 = this.f20403g;
            if (length >= aVarArr2.length) {
                this.f20403g = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                a[] aVarArr3 = this.f20403g;
                int i11 = this.f20402f;
                this.f20402f = i11 + 1;
                aVarArr3[i11] = aVar;
            }
            this.f20401e -= aVarArr.length;
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(int i10) {
        boolean z10 = i10 < this.f20400d;
        this.f20400d = i10;
        if (z10) {
            c();
        }
    }

    public final synchronized void c() {
        int iMax = Math.max(0, qb.v.f(this.f20400d, this.f20398b) - this.f20401e);
        int i10 = this.f20402f;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill(this.f20403g, iMax, i10, (Object) null);
        this.f20402f = iMax;
    }
}
