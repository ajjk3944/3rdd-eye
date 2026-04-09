package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x2 implements x1 {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f18266l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f18267m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f18268n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f18269o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18271b;

    /* renamed from: c, reason: collision with root package name */
    public long f18272c;

    /* renamed from: d, reason: collision with root package name */
    public int f18273d;

    /* renamed from: e, reason: collision with root package name */
    public int f18274e;
    public z1 g;

    /* renamed from: h, reason: collision with root package name */
    public u2 f18276h;
    public d2 j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18278k;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f18270a = new byte[1];

    /* renamed from: f, reason: collision with root package name */
    public int f18275f = -1;

    /* renamed from: i, reason: collision with root package name */
    public u2 f18277i = new w1();

    static {
        String str = bq0.f9768a;
        Charset charset = StandardCharsets.UTF_8;
        f18268n = "#!AMR\n".getBytes(charset);
        f18269o = "#!AMR-WB\n".getBytes(charset);
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    public final boolean b(y1 y1Var) {
        y1Var.B1();
        byte[] bArr = f18268n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        y1Var.M1(0, length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f18271b = false;
            y1Var.K1(bArr.length);
            return true;
        }
        y1Var.B1();
        byte[] bArr3 = f18269o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        y1Var.M1(0, length2, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f18271b = true;
        y1Var.K1(bArr3.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) {
        return b(y1Var);
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        this.g = z1Var;
        u2 u2VarM = z1Var.m(0, 1);
        this.f18276h = u2VarM;
        this.f18277i = u2VarM;
        z1Var.i();
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        this.f18272c = 0L;
        this.f18273d = 0;
        this.f18274e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[Catch: EOFException -> 0x0100, TryCatch #0 {EOFException -> 0x0100, blocks: (B:26:0x0070, B:28:0x0085, B:42:0x00a7, B:44:0x00ac, B:43:0x00aa, B:51:0x00be, B:52:0x00e1, B:53:0x00e2, B:54:0x00ff), top: B:71:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[Catch: EOFException -> 0x0100, TryCatch #0 {EOFException -> 0x0100, blocks: (B:26:0x0070, B:28:0x0085, B:42:0x00a7, B:44:0x00ac, B:43:0x00aa, B:51:0x00be, B:52:0x00e1, B:53:0x00e2, B:54:0x00ff), top: B:71:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.y1 r19, com.google.android.gms.internal.ads.c2 r20) throws com.google.android.gms.internal.ads.ua {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x2.g(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.c2):int");
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
    }
}
