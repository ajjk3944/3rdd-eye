package r5;

import a5.d0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: c, reason: collision with root package name */
    public int f21234c;

    /* renamed from: d, reason: collision with root package name */
    public int f21235d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21232a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f21233b = 65536;

    /* renamed from: e, reason: collision with root package name */
    public int f21236e = 0;

    /* renamed from: f, reason: collision with root package name */
    public a[] f21237f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f21234c;
        this.f21234c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int iMax = Math.max(0, d0.f(this.f21234c, this.f21233b) - this.f21235d);
        int i10 = this.f21236e;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill(this.f21237f, iMax, i10, (Object) null);
        this.f21236e = iMax;
    }
}
