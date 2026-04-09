package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ub0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f34005a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34006b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34007c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34008d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34009e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34010f;

    /* renamed from: g, reason: collision with root package name */
    public final int f34011g;

    /* renamed from: h, reason: collision with root package name */
    public final int f34012h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f34013j;

    /* renamed from: k, reason: collision with root package name */
    public final a f34014k;

    /* renamed from: l, reason: collision with root package name */
    private final yz0 f34015l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f34016a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f34017b;

        public a(long[] jArr, long[] jArr2) {
            this.f34016a = jArr;
            this.f34017b = jArr2;
        }
    }

    private ub0(int i, int i10, int i11, int i12, int i13, int i14, int i15, long j4, a aVar, yz0 yz0Var) {
        this.f34005a = i;
        this.f34006b = i10;
        this.f34007c = i11;
        this.f34008d = i12;
        this.f34009e = i13;
        this.f34010f = b(i13);
        this.f34011g = i14;
        this.f34012h = i15;
        this.i = a(i15);
        this.f34013j = j4;
        this.f34014k = aVar;
        this.f34015l = yz0Var;
    }

    private static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int b(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final ub0 a(List<dh1> list) {
        yz0 yz0Var = new yz0(list);
        yz0 yz0Var2 = this.f34015l;
        if (yz0Var2 != null) {
            yz0Var = yz0Var2.a(yz0Var);
        }
        return new ub0(this.f34005a, this.f34006b, this.f34007c, this.f34008d, this.f34009e, this.f34011g, this.f34012h, this.f34013j, this.f34014k, yz0Var);
    }

    public final ub0 b(List<String> list) {
        yz0 yz0VarA = ti2.a(list);
        yz0 yz0Var = this.f34015l;
        if (yz0Var != null) {
            yz0VarA = yz0Var.a(yz0VarA);
        }
        return new ub0(this.f34005a, this.f34006b, this.f34007c, this.f34008d, this.f34009e, this.f34011g, this.f34012h, this.f34013j, this.f34014k, yz0VarA);
    }

    public final long a() {
        long j4;
        long j10;
        int i = this.f34008d;
        if (i > 0) {
            j4 = (i + this.f34007c) / 2;
            j10 = 1;
        } else {
            int i10 = this.f34005a;
            j4 = ((((i10 != this.f34006b || i10 <= 0) ? 4096L : i10) * this.f34011g) * this.f34012h) / 8;
            j10 = 64;
        }
        return j4 + j10;
    }

    public final long b() {
        long j4 = this.f34013j;
        if (j4 == 0) {
            return -9223372036854775807L;
        }
        return (j4 * 1000000) / this.f34009e;
    }

    public final dc0 a(byte[] bArr, yz0 yz0Var) {
        bArr[4] = -128;
        int i = this.f34008d;
        if (i <= 0) {
            i = -1;
        }
        yz0 yz0Var2 = this.f34015l;
        if (yz0Var2 != null) {
            yz0Var = yz0Var2.a(yz0Var);
        }
        return new dc0.a().e("audio/flac").h(i).c(this.f34011g).l(this.f34009e).a(Collections.singletonList(bArr)).a(yz0Var).a();
    }

    public ub0(int i, byte[] bArr) {
        tf1 tf1Var = new tf1(bArr);
        tf1Var.c(i * 8);
        this.f34005a = tf1Var.b(16);
        this.f34006b = tf1Var.b(16);
        this.f34007c = tf1Var.b(24);
        this.f34008d = tf1Var.b(24);
        int iB = tf1Var.b(20);
        this.f34009e = iB;
        this.f34010f = b(iB);
        this.f34011g = tf1Var.b(3) + 1;
        int iB2 = tf1Var.b(5) + 1;
        this.f34012h = iB2;
        this.i = a(iB2);
        this.f34013j = tf1Var.g();
        this.f34014k = null;
        this.f34015l = null;
    }

    public final long a(long j4) {
        long j10 = (j4 * this.f34009e) / 1000000;
        long j11 = this.f34013j - 1;
        int i = s82.f32899a;
        return Math.max(0L, Math.min(j10, j11));
    }

    public final ub0 a(a aVar) {
        return new ub0(this.f34005a, this.f34006b, this.f34007c, this.f34008d, this.f34009e, this.f34011g, this.f34012h, this.f34013j, aVar, this.f34015l);
    }
}
