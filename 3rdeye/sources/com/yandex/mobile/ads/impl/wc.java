package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wc implements u70 {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f34879q;

    /* renamed from: t, reason: collision with root package name */
    private static final int f34882t;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34885c;

    /* renamed from: d, reason: collision with root package name */
    private long f34886d;

    /* renamed from: e, reason: collision with root package name */
    private int f34887e;

    /* renamed from: f, reason: collision with root package name */
    private int f34888f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34889g;

    /* renamed from: h, reason: collision with root package name */
    private long f34890h;

    /* renamed from: j, reason: collision with root package name */
    private int f34891j;

    /* renamed from: k, reason: collision with root package name */
    private long f34892k;

    /* renamed from: l, reason: collision with root package name */
    private w70 f34893l;

    /* renamed from: m, reason: collision with root package name */
    private n52 f34894m;

    /* renamed from: n, reason: collision with root package name */
    private tw1 f34895n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f34896o;

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f34878p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f34880r = s82.c("#!AMR\n");

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f34881s = s82.c("#!AMR-WB\n");

    /* renamed from: b, reason: collision with root package name */
    private final int f34884b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f34883a = new byte[1];
    private int i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f34879q = iArr;
        f34882t = iArr[8];
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f34893l = w70Var;
        this.f34894m = w70Var.a(0, 1);
        w70Var.a();
    }

    private int a(rz rzVar) throws IOException {
        boolean z10;
        rzVar.c();
        rzVar.b(this.f34883a, 0, 1, false);
        byte b10 = this.f34883a[0];
        if ((b10 & 131) > 0) {
            throw yf1.a("Invalid padding bits for frame header " + ((int) b10), (Exception) null);
        }
        int i = (b10 >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z10 = this.f34885c) && (i < 10 || i > 13)) || (!z10 && (i < 12 || i > 14)))) {
            return z10 ? f34879q[i] : f34878p[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f34885c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw yf1.a(sb.toString(), (Exception) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    @Override // com.yandex.mobile.ads.impl.u70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.yandex.mobile.ads.impl.v70 r20, com.yandex.mobile.ads.impl.jj1 r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wc.a(com.yandex.mobile.ads.impl.v70, com.yandex.mobile.ads.impl.jj1):int");
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        this.f34886d = 0L;
        this.f34887e = 0;
        this.f34888f = 0;
        if (j4 != 0) {
            tw1 tw1Var = this.f34895n;
            if (tw1Var instanceof qr) {
                this.f34892k = ((qr) tw1Var).c(j4);
                return;
            }
        }
        this.f34892k = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        rz rzVar = (rz) v70Var;
        byte[] bArr = f34880r;
        rzVar.c();
        byte[] bArr2 = new byte[bArr.length];
        rzVar.b(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f34885c = false;
            rzVar.a(bArr.length);
            return true;
        }
        byte[] bArr3 = f34881s;
        rzVar.c();
        byte[] bArr4 = new byte[bArr3.length];
        rzVar.b(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f34885c = true;
        rzVar.a(bArr3.length);
        return true;
    }

    private static u70[] a() {
        return new u70[]{new wc()};
    }
}
