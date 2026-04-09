package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f20173a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20174b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f20175c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20176d;

    public k2(b1 b1Var, String str, Object[] objArr) {
        this.f20173a = b1Var;
        this.f20174b = str;
        this.f20175c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f20176d = cCharAt;
            return;
        }
        int i4 = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f20176d = i4 | (cCharAt2 << i11);
                return;
            } else {
                i4 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final int a() {
        int i4 = this.f20176d;
        if ((i4 & 1) != 0) {
            return 1;
        }
        return (i4 & 4) == 4 ? 3 : 2;
    }
}
