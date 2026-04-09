package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rf1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final vq2 k;
    public final wn1 l;

    public rf1(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, vq2 vq2Var, wn1 wn1Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = c(i5);
        this.g = i6;
        this.h = i7;
        this.i = d(i7);
        this.j = j;
        this.k = vq2Var;
        this.l = wn1Var;
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
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final ph4 b(byte[] bArr, wn1 wn1Var) {
        bArr[4] = -128;
        wn1 wn1Var2 = this.l;
        if (wn1Var2 != null) {
            wn1Var = wn1Var2.b(wn1Var);
        }
        gg4 gg4Var = new gg4();
        gg4Var.e("audio/flac");
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        gg4Var.m = i;
        gg4Var.D = this.g;
        gg4Var.E = this.e;
        gg4Var.F = v23.y(this.h, ByteOrder.LITTLE_ENDIAN);
        gg4Var.o = Collections.singletonList(bArr);
        gg4Var.j = wn1Var;
        return new ph4(gg4Var);
    }

    public rf1(int i, byte[] bArr) {
        lg1 lg1Var = new lg1(bArr.length, bArr);
        lg1Var.l(i * 8);
        this.a = lg1Var.r(16);
        this.b = lg1Var.r(16);
        this.c = lg1Var.r(24);
        this.d = lg1Var.r(24);
        int iR = lg1Var.r(20);
        this.e = iR;
        this.f = c(iR);
        this.g = lg1Var.r(3) + 1;
        int iR2 = lg1Var.r(5) + 1;
        this.h = iR2;
        this.i = d(iR2);
        this.j = lg1Var.t(36);
        this.k = null;
        this.l = null;
    }
}
