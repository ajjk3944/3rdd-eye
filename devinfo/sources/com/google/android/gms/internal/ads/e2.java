package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10668a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10669b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10670c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10671d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10672e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10673f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10674h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10675i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final rt f10676k;

    /* renamed from: l, reason: collision with root package name */
    public final v8 f10677l;

    public e2(int i4, int i10, int i11, int i12, int i13, int i14, int i15, long j, rt rtVar, v8 v8Var) {
        this.f10668a = i4;
        this.f10669b = i10;
        this.f10670c = i11;
        this.f10671d = i12;
        this.f10672e = i13;
        this.f10673f = c(i13);
        this.g = i14;
        this.f10674h = i15;
        this.f10675i = d(i15);
        this.j = j;
        this.f10676k = rtVar;
        this.f10677l = v8Var;
    }

    public static int c(int i4) {
        switch (i4) {
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

    public static int d(int i4) {
        if (i4 == 8) {
            return 1;
        }
        if (i4 == 12) {
            return 2;
        }
        if (i4 == 16) {
            return 4;
        }
        if (i4 == 20) {
            return 5;
        }
        if (i4 != 24) {
            return i4 != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f10672e;
    }

    public final mx1 b(byte[] bArr, v8 v8Var) {
        bArr[4] = -128;
        v8 v8Var2 = this.f10677l;
        if (v8Var2 != null) {
            v8Var = v8Var2.b(v8Var);
        }
        lw1 lw1Var = new lw1();
        lw1Var.e("audio/flac");
        int i4 = this.f10671d;
        if (i4 <= 0) {
            i4 = -1;
        }
        lw1Var.f13662m = i4;
        lw1Var.D = this.g;
        lw1Var.E = this.f10672e;
        lw1Var.F = bq0.y(this.f10674h, ByteOrder.LITTLE_ENDIAN);
        lw1Var.f13664o = Collections.singletonList(bArr);
        lw1Var.j = v8Var;
        return new mx1(lw1Var);
    }

    public e2(byte[] bArr, int i4) {
        hk0 hk0Var = new hk0(bArr, bArr.length);
        hk0Var.d(i4 * 8);
        this.f10668a = hk0Var.h(16);
        this.f10669b = hk0Var.h(16);
        this.f10670c = hk0Var.h(24);
        this.f10671d = hk0Var.h(24);
        int iH = hk0Var.h(20);
        this.f10672e = iH;
        this.f10673f = c(iH);
        this.g = hk0Var.h(3) + 1;
        int iH2 = hk0Var.h(5) + 1;
        this.f10674h = iH2;
        this.f10675i = d(iH2);
        this.j = hk0Var.i(36);
        this.f10676k = null;
        this.f10677l = null;
    }
}
