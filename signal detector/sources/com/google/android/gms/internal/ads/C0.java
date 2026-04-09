package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7479a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7480b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7481c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7482d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7483e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7484f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7485g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7486h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7487j;

    /* renamed from: k, reason: collision with root package name */
    public final C0697Ql f7488k;

    /* renamed from: l, reason: collision with root package name */
    public final U3 f7489l;

    public C0(int i, int i3, int i6, int i7, int i8, int i9, int i10, long j6, C0697Ql c0697Ql, U3 u32) {
        this.f7479a = i;
        this.f7480b = i3;
        this.f7481c = i6;
        this.f7482d = i7;
        this.f7483e = i8;
        this.f7484f = c(i8);
        this.f7485g = i9;
        this.f7486h = i10;
        this.i = d(i10);
        this.f7487j = j6;
        this.f7488k = c0697Ql;
        this.f7489l = u32;
    }

    public static int c(int i) {
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

    public static int d(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long a() {
        long j6 = this.f7487j;
        if (j6 == 0) {
            return -9223372036854775807L;
        }
        return (j6 * 1000000) / this.f7483e;
    }

    public final TP b(byte[] bArr, U3 u32) {
        bArr[4] = -128;
        U3 u33 = this.f7489l;
        if (u33 != null) {
            u32 = u33.b(u32);
        }
        C1855sP c1855sP = new C1855sP();
        c1855sP.e("audio/flac");
        int i = this.f7482d;
        if (i <= 0) {
            i = -1;
        }
        c1855sP.f16733m = i;
        c1855sP.f16714D = this.f7485g;
        c1855sP.f16715E = this.f7483e;
        c1855sP.f16716F = Vt.y(this.f7486h, ByteOrder.LITTLE_ENDIAN);
        c1855sP.f16735o = Collections.singletonList(bArr);
        c1855sP.f16730j = u32;
        return new TP(c1855sP);
    }

    public C0(byte[] bArr, int i) {
        C1443kr c1443kr = new C1443kr(bArr, bArr.length);
        c1443kr.d(i * 8);
        this.f7479a = c1443kr.h(16);
        this.f7480b = c1443kr.h(16);
        this.f7481c = c1443kr.h(24);
        this.f7482d = c1443kr.h(24);
        int iH = c1443kr.h(20);
        this.f7483e = iH;
        this.f7484f = c(iH);
        this.f7485g = c1443kr.h(3) + 1;
        int iH2 = c1443kr.h(5) + 1;
        this.f7486h = iH2;
        this.i = d(iH2);
        this.f7487j = c1443kr.i(36);
        this.f7488k = null;
        this.f7489l = null;
    }
}
