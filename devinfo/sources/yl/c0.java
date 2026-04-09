package yl;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f37673a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f37674b = new int[10];

    public final int a() {
        return (this.f37673a & 16) != 0 ? this.f37674b[4] : Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public final void b(c0 c0Var) {
        nk.k.e(c0Var, "other");
        for (int i4 = 0; i4 < 10; i4++) {
            if (((1 << i4) & c0Var.f37673a) != 0) {
                c(i4, c0Var.f37674b[i4]);
            }
        }
    }

    public final void c(int i4, int i10) {
        if (i4 >= 0) {
            int[] iArr = this.f37674b;
            if (i4 >= iArr.length) {
                return;
            }
            this.f37673a = (1 << i4) | this.f37673a;
            iArr[i4] = i10;
        }
    }
}
