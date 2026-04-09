package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dv1 {

    /* renamed from: d, reason: collision with root package name */
    public static final dv1 f10555d;

    /* renamed from: a, reason: collision with root package name */
    public final int f10556a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10557b;

    /* renamed from: c, reason: collision with root package name */
    public final e51 f10558c;

    static {
        dv1 dv1Var;
        if (Build.VERSION.SDK_INT >= 33) {
            d51 d51Var = new d51(4);
            for (int i4 = 1; i4 <= 10; i4++) {
                d51Var.f(Integer.valueOf(bq0.b(i4)));
            }
            dv1Var = new dv1(2, d51Var.h());
        } else {
            dv1Var = new dv1(2, 10);
        }
        f10555d = dv1Var;
    }

    public dv1(int i4, int i10) {
        this.f10556a = i4;
        this.f10557b = i10;
        this.f10558c = null;
    }

    public final int a(int i4, p50 p50Var) {
        if (this.f10558c != null) {
            return this.f10557b;
        }
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f10556a;
        if (i10 < 29) {
            Object obj = ev1.f10891e.get(Integer.valueOf(i11));
            return ((Integer) (obj != null ? obj : 0)).intValue();
        }
        for (int i12 = 10; i12 > 0; i12--) {
            int iB = bq0.b(i12);
            if (iB != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i4).setChannelMask(iB).build(), p50Var.a())) {
                return i12;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv1)) {
            return false;
        }
        dv1 dv1Var = (dv1) obj;
        return this.f10556a == dv1Var.f10556a && this.f10557b == dv1Var.f10557b && Objects.equals(this.f10558c, dv1Var.f10558c);
    }

    public final int hashCode() {
        e51 e51Var = this.f10558c;
        return (((this.f10556a * 31) + this.f10557b) * 31) + (e51Var == null ? 0 : e51Var.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f10558c);
        int i4 = this.f10556a;
        int length = String.valueOf(i4).length();
        int i10 = this.f10557b;
        StringBuilder sb2 = new StringBuilder(length + 38 + String.valueOf(i10).length() + 15 + strValueOf.length() + 1);
        r5.c.q(i4, i10, "AudioProfile[format=", ", maxChannelCount=", sb2);
        return r5.c.m(sb2, ", channelMasks=", strValueOf, "]");
    }

    public dv1(int i4, Set set) {
        this.f10556a = i4;
        e51 e51VarM = e51.m(set);
        this.f10558c = e51VarM;
        h61 h61VarA = e51VarM.a();
        int iMax = 0;
        while (h61VarA.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) h61VarA.next()).intValue()));
        }
        this.f10557b = iMax;
    }
}
