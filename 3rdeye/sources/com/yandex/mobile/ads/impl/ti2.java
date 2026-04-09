package com.yandex.mobile.ads.impl;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ti2 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f33626a;

        public a(String[] strArr) {
            this.f33626a = strArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f33627a;

        public b(boolean z10) {
            this.f33627a = z10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f33628a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33629b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33630c;

        /* renamed from: d, reason: collision with root package name */
        public final int f33631d;

        /* renamed from: e, reason: collision with root package name */
        public final int f33632e;

        /* renamed from: f, reason: collision with root package name */
        public final int f33633f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f33634g;

        public c(int i, int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
            this.f33628a = i;
            this.f33629b = i10;
            this.f33630c = i11;
            this.f33631d = i12;
            this.f33632e = i13;
            this.f33633f = i14;
            this.f33634g = bArr;
        }
    }

    public static a a(uf1 uf1Var, boolean z10, boolean z11) throws yf1 {
        if (z10) {
            a(3, uf1Var, false);
        }
        uf1Var.a((int) uf1Var.n(), fo.f27410c);
        long jN = uf1Var.n();
        String[] strArr = new String[(int) jN];
        for (int i = 0; i < jN; i++) {
            strArr[i] = uf1Var.a((int) uf1Var.n(), fo.f27410c);
        }
        if (z11 && (uf1Var.t() & 1) == 0) {
            throw yf1.a("framing bit expected to be set", (Exception) null);
        }
        return new a(strArr);
    }

    public static c a(uf1 uf1Var) throws yf1 {
        a(1, uf1Var, false);
        int iK = uf1Var.k();
        if (iK >= 0) {
            int iT = uf1Var.t();
            int iK2 = uf1Var.k();
            if (iK2 >= 0) {
                int iK3 = uf1Var.k();
                int i = iK3 <= 0 ? -1 : iK3;
                int iK4 = uf1Var.k();
                int i10 = iK4 <= 0 ? -1 : iK4;
                uf1Var.k();
                int iT2 = uf1Var.t();
                int iPow = (int) Math.pow(2.0d, iT2 & 15);
                int iPow2 = (int) Math.pow(2.0d, (iT2 & 240) >> 4);
                uf1Var.t();
                return new c(iT, iK2, i, i10, iPow, iPow2, Arrays.copyOf(uf1Var.c(), uf1Var.e()));
            }
            throw new IllegalStateException(fe.a("Top bit not zero: ", iK2));
        }
        throw new IllegalStateException(fe.a("Top bit not zero: ", iK));
    }

    public static boolean a(int i, uf1 uf1Var, boolean z10) throws yf1 {
        if (uf1Var.a() < 7) {
            if (z10) {
                return false;
            }
            throw yf1.a("too short header: " + uf1Var.a(), (Exception) null);
        }
        if (uf1Var.t() != i) {
            if (z10) {
                return false;
            }
            throw yf1.a("expected header type " + Integer.toHexString(i), (Exception) null);
        }
        if (uf1Var.t() == 118 && uf1Var.t() == 111 && uf1Var.t() == 114 && uf1Var.t() == 98 && uf1Var.t() == 105 && uf1Var.t() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw yf1.a("expected characters 'vorbis'", (Exception) null);
    }

    public static yz0 a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int i10 = s82.f32899a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                rs0.d("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    uf1 uf1Var = new uf1(Base64.decode(strArrSplit[1], 0));
                    int iH = uf1Var.h();
                    String strA = uf1Var.a(uf1Var.h(), fo.f27408a);
                    String strA2 = uf1Var.a(uf1Var.h(), fo.f27410c);
                    int iH2 = uf1Var.h();
                    int iH3 = uf1Var.h();
                    int iH4 = uf1Var.h();
                    int iH5 = uf1Var.h();
                    int iH6 = uf1Var.h();
                    byte[] bArr = new byte[iH6];
                    uf1Var.a(bArr, 0, iH6);
                    arrayList.add(new dh1(iH, strA, strA2, iH2, iH3, iH4, iH5, bArr));
                } catch (RuntimeException e4) {
                    rs0.b("VorbisUtil", "Failed to parse vorbis picture", e4);
                }
            } else {
                arrayList.add(new ri2(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new yz0(arrayList);
    }
}
