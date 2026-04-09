package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h6 {

    /* renamed from: a, reason: collision with root package name */
    public final s4 f19769a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19770b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f19771c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19772d;

    public h6(s4 s4Var, String str, Object[] objArr) {
        this.f19769a = s4Var;
        this.f19770b = str;
        this.f19771c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f19772d = cCharAt;
            return;
        }
        int i4 = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f19772d = i4 | (cCharAt2 << i11);
                return;
            } else {
                i4 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final int a() {
        int i4 = this.f19772d;
        if ((i4 & 1) != 0) {
            return 1;
        }
        return (i4 & 4) == 4 ? 3 : 2;
    }
}
