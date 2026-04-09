package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    public final s4 f5079a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5080b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f5081c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5082d;

    public i6(s4 s4Var, String str, Object[] objArr) {
        this.f5079a = s4Var;
        this.f5080b = str;
        this.f5081c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f5082d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f5082d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final int a() {
        int i10 = this.f5082d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
