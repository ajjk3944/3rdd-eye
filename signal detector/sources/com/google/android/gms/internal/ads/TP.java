package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.UUID;
import o4.AbstractC2763b;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class TP {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f11373N = 0;

    /* renamed from: A, reason: collision with root package name */
    public final byte[] f11374A;

    /* renamed from: B, reason: collision with root package name */
    public final int f11375B;

    /* renamed from: C, reason: collision with root package name */
    public final HK f11376C;

    /* renamed from: D, reason: collision with root package name */
    public final int f11377D;

    /* renamed from: E, reason: collision with root package name */
    public final int f11378E;

    /* renamed from: F, reason: collision with root package name */
    public final int f11379F;

    /* renamed from: G, reason: collision with root package name */
    public final int f11380G;

    /* renamed from: H, reason: collision with root package name */
    public final int f11381H;

    /* renamed from: I, reason: collision with root package name */
    public final int f11382I;

    /* renamed from: J, reason: collision with root package name */
    public final int f11383J;

    /* renamed from: K, reason: collision with root package name */
    public final int f11384K;

    /* renamed from: L, reason: collision with root package name */
    public final int f11385L;
    public int M;

    /* renamed from: a, reason: collision with root package name */
    public final String f11386a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11387b;

    /* renamed from: c, reason: collision with root package name */
    public final LB f11388c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11389d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11390e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11391f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11392g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11393h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11394j;

    /* renamed from: k, reason: collision with root package name */
    public final U3 f11395k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11396l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11397m;

    /* renamed from: n, reason: collision with root package name */
    public final int f11398n;

    /* renamed from: o, reason: collision with root package name */
    public final int f11399o;

    /* renamed from: p, reason: collision with root package name */
    public final List f11400p;

    /* renamed from: q, reason: collision with root package name */
    public final SO f11401q;

    /* renamed from: r, reason: collision with root package name */
    public final long f11402r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f11403s;

    /* renamed from: t, reason: collision with root package name */
    public final int f11404t;

    /* renamed from: u, reason: collision with root package name */
    public final int f11405u;

    /* renamed from: v, reason: collision with root package name */
    public final int f11406v;

    /* renamed from: w, reason: collision with root package name */
    public final int f11407w;

    /* renamed from: x, reason: collision with root package name */
    public final float f11408x;

    /* renamed from: y, reason: collision with root package name */
    public final int f11409y;

    /* renamed from: z, reason: collision with root package name */
    public final float f11410z;

    static {
        new TP(new C1855sP());
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
    }

    public TP(C1855sP c1855sP) throws MissingResourceException {
        boolean z6;
        String str;
        this.f11386a = c1855sP.f16722a;
        String strO = Vt.o(c1855sP.f16725d);
        this.f11389d = strO;
        if (c1855sP.f16724c.isEmpty() && c1855sP.f16723b != null) {
            this.f11388c = LB.i(new C2126xQ(strO, c1855sP.f16723b));
            this.f11387b = c1855sP.f16723b;
        } else if (!c1855sP.f16724c.isEmpty() && c1855sP.f16723b == null) {
            LB lb = c1855sP.f16724c;
            this.f11388c = lb;
            Iterator it = lb.iterator();
            while (true) {
                AbstractC1141fB abstractC1141fB = (AbstractC1141fB) it;
                if (!abstractC1141fB.hasNext()) {
                    str = ((C2126xQ) lb.get(0)).f17591b;
                    break;
                }
                C2126xQ c2126xQ = (C2126xQ) abstractC1141fB.next();
                if (TextUtils.equals(c2126xQ.f17590a, strO)) {
                    str = c2126xQ.f17591b;
                    break;
                }
            }
            this.f11387b = str;
        } else if (c1855sP.f16724c.isEmpty() && c1855sP.f16723b == null) {
            z6 = true;
            AbstractC0582Jp.h0(z6);
            this.f11388c = c1855sP.f16724c;
            this.f11387b = c1855sP.f16723b;
        } else {
            for (int i = 0; i < c1855sP.f16724c.size(); i++) {
                if (((C2126xQ) c1855sP.f16724c.get(i)).f17591b.equals(c1855sP.f16723b)) {
                    z6 = true;
                    break;
                }
            }
            z6 = false;
            AbstractC0582Jp.h0(z6);
            this.f11388c = c1855sP.f16724c;
            this.f11387b = c1855sP.f16723b;
        }
        this.f11390e = c1855sP.f16726e;
        this.f11391f = c1855sP.f16727f;
        int i3 = c1855sP.f16728g;
        this.f11392g = i3;
        int i6 = c1855sP.f16729h;
        this.f11393h = i6;
        this.i = i6 != -1 ? i6 : i3;
        this.f11394j = c1855sP.i;
        this.f11395k = c1855sP.f16730j;
        this.f11396l = c1855sP.f16731k;
        this.f11397m = c1855sP.f16732l;
        this.f11398n = c1855sP.f16733m;
        this.f11399o = c1855sP.f16734n;
        List list = c1855sP.f16735o;
        this.f11400p = list == null ? Collections.EMPTY_LIST : list;
        SO so = c1855sP.f16736p;
        this.f11401q = so;
        this.f11402r = c1855sP.f16737q;
        this.f11403s = c1855sP.f16738r;
        this.f11404t = c1855sP.f16739s;
        this.f11405u = c1855sP.f16740t;
        this.f11406v = c1855sP.f16741u;
        this.f11407w = c1855sP.f16742v;
        this.f11408x = c1855sP.f16743w;
        int i7 = c1855sP.f16744x;
        this.f11409y = i7 == -1 ? 0 : i7;
        float f2 = c1855sP.f16745y;
        this.f11410z = f2 == -1.0f ? 1.0f : f2;
        this.f11374A = c1855sP.f16746z;
        this.f11375B = c1855sP.f16711A;
        this.f11376C = c1855sP.f16712B;
        this.f11377D = c1855sP.f16713C;
        this.f11378E = c1855sP.f16714D;
        this.f11379F = c1855sP.f16715E;
        this.f11380G = c1855sP.f16716F;
        int i8 = c1855sP.f16717G;
        this.f11381H = i8 == -1 ? 0 : i8;
        int i9 = c1855sP.f16718H;
        this.f11382I = i9 != -1 ? i9 : 0;
        this.f11383J = c1855sP.f16719I;
        this.f11384K = c1855sP.f16720J;
        int i10 = c1855sP.f16721K;
        if (i10 != 0 || so == null) {
            this.f11385L = i10;
        } else {
            this.f11385L = 1;
        }
    }

    public static String c(TP tp) {
        String str;
        String string;
        int i;
        int i3;
        StringBuilder sbA = AbstractC2984e.a("id=");
        sbA.append(tp.f11386a);
        sbA.append(", mimeType=");
        sbA.append(tp.f11397m);
        String str2 = tp.f11396l;
        if (str2 != null) {
            sbA.append(", container=");
            sbA.append(str2);
        }
        int i6 = tp.i;
        if (i6 != -1) {
            sbA.append(", bitrate=");
            sbA.append(i6);
        }
        String str3 = tp.f11394j;
        if (str3 != null) {
            sbA.append(", codecs=");
            sbA.append(str3);
        }
        SO so = tp.f11401q;
        if (so != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i7 = 0; i7 < so.f11182d; i7++) {
                UUID uuid = so.f11179a[i7].f8113b;
                if (uuid.equals(Hx.f9024b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(Hx.f9025c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(Hx.f9027e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(Hx.f9026d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(Hx.f9023a)) {
                    linkedHashSet.add("universal");
                } else {
                    String string2 = uuid.toString();
                    StringBuilder sb = new StringBuilder(string2.length() + 10);
                    sb.append("unknown (");
                    sb.append(string2);
                    sb.append(")");
                    linkedHashSet.add(sb.toString());
                }
            }
            sbA.append(", drm=[");
            AbstractC1984ut.y(sbA, linkedHashSet.iterator(), ",");
            sbA.append(']');
        }
        int i8 = tp.f11404t;
        if (i8 != -1 && (i3 = tp.f11405u) != -1) {
            AbstractC2763b.h(sbA, ", res=", i8, "x", i3);
        }
        int i9 = tp.f11406v;
        if (i9 != -1 && (i = tp.f11407w) != -1) {
            AbstractC2763b.h(sbA, ", decRes=", i9, "x", i);
        }
        float f2 = tp.f11410z;
        int i10 = HC.f8874a;
        double d6 = f2;
        if (Math.copySign((-1.0d) + d6, 1.0d) > 0.001d && d6 != 1.0d && (!Double.isNaN(d6) || !Double.isNaN(1.0d))) {
            sbA.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str4 = Vt.f12096a;
            sbA.append(String.format(Locale.US, "%.3f", objArr));
        }
        HK hk = tp.f11376C;
        if (hk != null) {
            int i11 = hk.f8899f;
            int i12 = hk.f8898e;
            if ((i12 != -1 && i11 != -1) || hk.d()) {
                sbA.append(", color=");
                if (hk.d()) {
                    String strE = HK.e(hk.f8894a);
                    String strG = HK.g(hk.f8895b);
                    String strF = HK.f(hk.f8896c);
                    String str5 = Vt.f12096a;
                    Locale locale = Locale.US;
                    str = strE + "/" + strG + "/" + strF;
                } else {
                    str = "NA/NA/NA";
                }
                if (i12 == -1 || i11 == -1) {
                    string = "NA/NA";
                } else {
                    StringBuilder sb2 = new StringBuilder(AbstractC2763b.a(i12, 1) + String.valueOf(i11).length());
                    sb2.append(i12);
                    sb2.append("/");
                    sb2.append(i11);
                    string = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder(string.length() + str.length() + 1);
                sb3.append(str);
                sb3.append("/");
                sb3.append(string);
                sbA.append(sb3.toString());
            }
        }
        float f5 = tp.f11408x;
        if (f5 != -1.0f) {
            sbA.append(", fps=");
            sbA.append(f5);
        }
        int i13 = tp.f11377D;
        if (i13 != -1) {
            sbA.append(", maxSubLayers=");
            sbA.append(i13);
        }
        int i14 = tp.f11378E;
        if (i14 != -1) {
            sbA.append(", channels=");
            sbA.append(i14);
        }
        int i15 = tp.f11379F;
        if (i15 != -1) {
            sbA.append(", sample_rate=");
            sbA.append(i15);
        }
        String str6 = tp.f11389d;
        if (str6 != null) {
            sbA.append(", language=");
            sbA.append(str6);
        }
        LB lb = tp.f11388c;
        if (!lb.isEmpty()) {
            sbA.append(", labels=[");
            AbstractC1984ut.y(sbA, AbstractC0582Jp.G(lb, Oz.f10289d).iterator(), ",");
            sbA.append("]");
        }
        int i16 = tp.f11390e;
        if (i16 != 0) {
            sbA.append(", selectionFlags=[");
            String str7 = Vt.f12096a;
            ArrayList arrayList = new ArrayList();
            if ((i16 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i16 & 2) != 0) {
                arrayList.add("forced");
            }
            AbstractC1984ut.y(sbA, arrayList.iterator(), ",");
            sbA.append("]");
        }
        int i17 = tp.f11391f;
        if (i17 != 0) {
            sbA.append(", roleFlags=[");
            int i18 = i17 & 32768;
            String str8 = Vt.f12096a;
            ArrayList arrayList2 = new ArrayList();
            if ((i17 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i17 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i17 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i17 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i17 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i17 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i17 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i17 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i17 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i17 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i17 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i17 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i17 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i17 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i17 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i18 != 0) {
                arrayList2.add("auxiliary");
            }
            AbstractC1984ut.y(sbA, arrayList2.iterator(), ",");
            sbA.append("]");
        }
        if ((i17 & 32768) != 0) {
            sbA.append(", auxiliaryTrackType=");
            String str9 = Vt.f12096a;
            sbA.append("undefined");
        }
        return sbA.toString();
    }

    public final C1855sP a() {
        return new C1855sP(this);
    }

    public final boolean b(TP tp) {
        List list = this.f11400p;
        int size = list.size();
        List list2 = tp.f11400p;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || TP.class != obj.getClass()) {
            return false;
        }
        TP tp = (TP) obj;
        int i3 = this.M;
        return (i3 == 0 || (i = tp.M) == 0 || i3 == i) && this.f11390e == tp.f11390e && this.f11391f == tp.f11391f && this.f11392g == tp.f11392g && this.f11393h == tp.f11393h && this.f11398n == tp.f11398n && this.f11402r == tp.f11402r && this.f11404t == tp.f11404t && this.f11405u == tp.f11405u && this.f11406v == tp.f11406v && this.f11407w == tp.f11407w && this.f11409y == tp.f11409y && this.f11375B == tp.f11375B && this.f11377D == tp.f11377D && this.f11378E == tp.f11378E && this.f11379F == tp.f11379F && this.f11380G == tp.f11380G && this.f11381H == tp.f11381H && this.f11382I == tp.f11382I && this.f11383J == tp.f11383J && this.f11385L == tp.f11385L && Float.compare(this.f11408x, tp.f11408x) == 0 && Float.compare(this.f11410z, tp.f11410z) == 0 && Objects.equals(this.f11386a, tp.f11386a) && Objects.equals(this.f11387b, tp.f11387b) && this.f11388c.equals(tp.f11388c) && Objects.equals(this.f11394j, tp.f11394j) && Objects.equals(this.f11396l, tp.f11396l) && Objects.equals(this.f11397m, tp.f11397m) && Objects.equals(this.f11389d, tp.f11389d) && Arrays.equals(this.f11374A, tp.f11374A) && Objects.equals(this.f11395k, tp.f11395k) && Objects.equals(this.f11376C, tp.f11376C) && Objects.equals(this.f11401q, tp.f11401q) && b(tp);
    }

    public final int hashCode() {
        int i = this.M;
        if (i != 0) {
            return i;
        }
        String str = this.f11386a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f11387b;
        int iHashCode2 = this.f11388c.hashCode() + ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.f11389d;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f11390e) * 31) + this.f11391f) * 961) + this.f11392g) * 31) + this.f11393h) * 31;
        String str4 = this.f11394j;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        U3 u32 = this.f11395k;
        int iHashCode5 = iHashCode4 + (u32 == null ? 0 : u32.hashCode());
        String str5 = this.f11396l;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iFloatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.f11410z) + ((((Float.floatToIntBits(this.f11408x) + ((((((((((((((iHashCode6 + (this.f11397m != null ? r1.hashCode() : 0)) * 31) + this.f11398n) * 31) + ((int) this.f11402r)) * 31) + this.f11404t) * 31) + this.f11405u) * 31) + this.f11406v) * 31) + this.f11407w) * 31)) * 31) + this.f11409y) * 31)) * 31) + this.f11375B) * 31) + this.f11377D) * 31) + this.f11378E) * 31) + this.f11379F) * 31) + this.f11380G) * 31) + this.f11381H) * 31) + this.f11382I) * 31) + this.f11383J) * 31) - 1) * 31) - 1) * 31) + this.f11385L;
        this.M = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11376C);
        String str = this.f11386a;
        int length = String.valueOf(str).length();
        String str2 = this.f11387b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f11396l;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f11397m;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f11394j;
        int length5 = String.valueOf(str5).length();
        int i = this.i;
        int length6 = String.valueOf(i).length();
        String str6 = this.f11389d;
        int length7 = String.valueOf(str6).length();
        int i3 = this.f11404t;
        int length8 = String.valueOf(i3).length();
        int i6 = this.f11405u;
        int length9 = String.valueOf(i6).length();
        float f2 = this.f11408x;
        int length10 = String.valueOf(f2).length();
        int length11 = strValueOf.length();
        int i7 = this.f11378E;
        int length12 = String.valueOf(i7).length();
        int i8 = this.f11379F;
        StringBuilder sb = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + String.valueOf(i8).length() + 2);
        A.f.w(sb, "Format(", str, ", ", str2);
        A.f.w(sb, ", ", str3, ", ", str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i3);
        sb.append(", ");
        sb.append(i6);
        sb.append(", ");
        sb.append(f2);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append("], [");
        sb.append(i7);
        return A.f.n(sb, ", ", i8, "])");
    }
}
