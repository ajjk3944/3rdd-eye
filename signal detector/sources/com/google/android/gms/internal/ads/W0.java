package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class W0 implements InterfaceC1992v0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f12124l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f12125m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f12126n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f12127o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12129b;

    /* renamed from: c, reason: collision with root package name */
    public long f12130c;

    /* renamed from: d, reason: collision with root package name */
    public int f12131d;

    /* renamed from: e, reason: collision with root package name */
    public int f12132e;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC2100x0 f12134g;

    /* renamed from: h, reason: collision with root package name */
    public T0 f12135h;

    /* renamed from: j, reason: collision with root package name */
    public B0 f12136j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12137k;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f12128a = new byte[1];

    /* renamed from: f, reason: collision with root package name */
    public int f12133f = -1;
    public T0 i = new C1938u0();

    static {
        String str = Vt.f12096a;
        Charset charset = StandardCharsets.UTF_8;
        f12126n = "#!AMR\n".getBytes(charset);
        f12127o = "#!AMR-WB\n".getBytes(charset);
    }

    public final boolean a(InterfaceC2046w0 interfaceC2046w0) {
        interfaceC2046w0.i();
        byte[] bArr = f12126n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        interfaceC2046w0.v(0, length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f12129b = false;
            interfaceC2046w0.t(bArr.length);
            return true;
        }
        interfaceC2046w0.i();
        byte[] bArr3 = f12127o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        interfaceC2046w0.v(0, length2, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f12129b = true;
        interfaceC2046w0.t(bArr3.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) {
        return a(interfaceC2046w0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final List c() {
        JB jb = LB.f9635b;
        return C1197gC.f14227e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void e(InterfaceC2100x0 interfaceC2100x0) {
        this.f12134g = interfaceC2100x0;
        T0 t0X = interfaceC2100x0.x(0, 1);
        this.f12135h = t0X;
        this.i = t0X;
        interfaceC2100x0.u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        this.f12130c = 0L;
        this.f12131d = 0;
        this.f12132e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[Catch: EOFException -> 0x0100, TryCatch #0 {EOFException -> 0x0100, blocks: (B:26:0x0070, B:28:0x0085, B:42:0x00a7, B:44:0x00ac, B:43:0x00aa, B:51:0x00be, B:52:0x00e1, B:53:0x00e2, B:54:0x00ff), top: B:71:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[Catch: EOFException -> 0x0100, TryCatch #0 {EOFException -> 0x0100, blocks: (B:26:0x0070, B:28:0x0085, B:42:0x00a7, B:44:0x00ac, B:43:0x00aa, B:51:0x00be, B:52:0x00e1, B:53:0x00e2, B:54:0x00ff), top: B:71:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC2046w0 r19, com.google.android.gms.internal.ads.A0 r20) throws com.google.android.gms.internal.ads.P4 {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.W0.g(com.google.android.gms.internal.ads.w0, com.google.android.gms.internal.ads.A0):int");
    }
}
