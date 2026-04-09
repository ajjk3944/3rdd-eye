package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mx1 {
    public static final /* synthetic */ int N = 0;
    public final byte[] A;
    public final int B;
    public final sm1 C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public int M;

    /* renamed from: a, reason: collision with root package name */
    public final String f14042a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14043b;

    /* renamed from: c, reason: collision with root package name */
    public final x41 f14044c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14045d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14046e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14047f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14048h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14049i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final v8 f14050k;

    /* renamed from: l, reason: collision with root package name */
    public final String f14051l;

    /* renamed from: m, reason: collision with root package name */
    public final String f14052m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14053n;

    /* renamed from: o, reason: collision with root package name */
    public final int f14054o;

    /* renamed from: p, reason: collision with root package name */
    public final List f14055p;

    /* renamed from: q, reason: collision with root package name */
    public final iv1 f14056q;

    /* renamed from: r, reason: collision with root package name */
    public final long f14057r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f14058s;

    /* renamed from: t, reason: collision with root package name */
    public final int f14059t;

    /* renamed from: u, reason: collision with root package name */
    public final int f14060u;

    /* renamed from: v, reason: collision with root package name */
    public final int f14061v;

    /* renamed from: w, reason: collision with root package name */
    public final int f14062w;

    /* renamed from: x, reason: collision with root package name */
    public final float f14063x;

    /* renamed from: y, reason: collision with root package name */
    public final int f14064y;

    /* renamed from: z, reason: collision with root package name */
    public final float f14065z;

    static {
        new mx1(new lw1());
        String str = bq0.f9768a;
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

    public mx1(lw1 lw1Var) throws MissingResourceException {
        boolean z3;
        String str;
        this.f14042a = lw1Var.f13652a;
        String strO = bq0.o(lw1Var.f13655d);
        this.f14045d = strO;
        if (lw1Var.f13654c.isEmpty() && lw1Var.f13653b != null) {
            this.f14044c = x41.l(new ry1(strO, lw1Var.f13653b));
            this.f14043b = lw1Var.f13653b;
        } else if (!lw1Var.f13654c.isEmpty() && lw1Var.f13653b == null) {
            x41 x41Var = lw1Var.f13654c;
            this.f14044c = x41Var;
            Iterator it = x41Var.iterator();
            while (true) {
                r31 r31Var = (r31) it;
                if (!r31Var.hasNext()) {
                    str = ((ry1) x41Var.get(0)).f15791b;
                    break;
                }
                ry1 ry1Var = (ry1) r31Var.next();
                if (TextUtils.equals(ry1Var.f15790a, strO)) {
                    str = ry1Var.f15791b;
                    break;
                }
            }
            this.f14043b = str;
        } else if (lw1Var.f13654c.isEmpty() && lw1Var.f13653b == null) {
            z3 = true;
            mq0.c0(z3);
            this.f14044c = lw1Var.f13654c;
            this.f14043b = lw1Var.f13653b;
        } else {
            for (int i4 = 0; i4 < lw1Var.f13654c.size(); i4++) {
                if (((ry1) lw1Var.f13654c.get(i4)).f15791b.equals(lw1Var.f13653b)) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
            mq0.c0(z3);
            this.f14044c = lw1Var.f13654c;
            this.f14043b = lw1Var.f13653b;
        }
        this.f14046e = lw1Var.f13656e;
        this.f14047f = lw1Var.f13657f;
        int i10 = lw1Var.g;
        this.g = i10;
        int i11 = lw1Var.f13658h;
        this.f14048h = i11;
        this.f14049i = i11 != -1 ? i11 : i10;
        this.j = lw1Var.f13659i;
        this.f14050k = lw1Var.j;
        this.f14051l = lw1Var.f13660k;
        this.f14052m = lw1Var.f13661l;
        this.f14053n = lw1Var.f13662m;
        this.f14054o = lw1Var.f13663n;
        List list = lw1Var.f13664o;
        this.f14055p = list == null ? Collections.EMPTY_LIST : list;
        iv1 iv1Var = lw1Var.f13665p;
        this.f14056q = iv1Var;
        this.f14057r = lw1Var.f13666q;
        this.f14058s = lw1Var.f13667r;
        this.f14059t = lw1Var.f13668s;
        this.f14060u = lw1Var.f13669t;
        this.f14061v = lw1Var.f13670u;
        this.f14062w = lw1Var.f13671v;
        this.f14063x = lw1Var.f13672w;
        int i12 = lw1Var.f13673x;
        this.f14064y = i12 == -1 ? 0 : i12;
        float f10 = lw1Var.f13674y;
        this.f14065z = f10 == -1.0f ? 1.0f : f10;
        this.A = lw1Var.f13675z;
        this.B = lw1Var.A;
        this.C = lw1Var.B;
        this.D = lw1Var.C;
        this.E = lw1Var.D;
        this.F = lw1Var.E;
        this.G = lw1Var.F;
        int i13 = lw1Var.G;
        this.H = i13 == -1 ? 0 : i13;
        int i14 = lw1Var.H;
        this.I = i14 != -1 ? i14 : 0;
        this.J = lw1Var.I;
        this.K = lw1Var.J;
        int i15 = lw1Var.K;
        if (i15 != 0 || iv1Var == null) {
            this.L = i15;
        } else {
            this.L = 1;
        }
    }

    public static String c(mx1 mx1Var) {
        String str;
        String string;
        int i4;
        int i10;
        StringBuilder sbZ = d.h.z("id=");
        sbZ.append(mx1Var.f14042a);
        sbZ.append(", mimeType=");
        sbZ.append(mx1Var.f14052m);
        String str2 = mx1Var.f14051l;
        if (str2 != null) {
            sbZ.append(", container=");
            sbZ.append(str2);
        }
        int i11 = mx1Var.f14049i;
        if (i11 != -1) {
            sbZ.append(", bitrate=");
            sbZ.append(i11);
        }
        String str3 = mx1Var.j;
        if (str3 != null) {
            sbZ.append(", codecs=");
            sbZ.append(str3);
        }
        iv1 iv1Var = mx1Var.f14056q;
        if (iv1Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < iv1Var.f12496d; i12++) {
                UUID uuid = iv1Var.f12493a[i12].f17722b;
                if (uuid.equals(fx0.f11281b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(fx0.f11282c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(fx0.f11284e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(fx0.f11283d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(fx0.f11280a)) {
                    linkedHashSet.add("universal");
                } else {
                    String string2 = uuid.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 10);
                    sb2.append("unknown (");
                    sb2.append(string2);
                    sb2.append(")");
                    linkedHashSet.add(sb2.toString());
                }
            }
            sbZ.append(", drm=[");
            yo0.y(sbZ, linkedHashSet.iterator(), ",");
            sbZ.append(']');
        }
        int i13 = mx1Var.f14059t;
        if (i13 != -1 && (i10 = mx1Var.f14060u) != -1) {
            r5.c.q(i13, i10, ", res=", "x", sbZ);
        }
        int i14 = mx1Var.f14061v;
        if (i14 != -1 && (i4 = mx1Var.f14062w) != -1) {
            r5.c.q(i14, i4, ", decRes=", "x", sbZ);
        }
        float f10 = mx1Var.f14065z;
        int i15 = v61.f17538a;
        double d10 = f10;
        if (Math.copySign((-1.0d) + d10, 1.0d) > 0.001d && d10 != 1.0d && (!Double.isNaN(d10) || !Double.isNaN(1.0d))) {
            sbZ.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            String str4 = bq0.f9768a;
            sbZ.append(String.format(Locale.US, "%.3f", objArr));
        }
        sm1 sm1Var = mx1Var.C;
        if (sm1Var != null) {
            int i16 = sm1Var.f16485f;
            int i17 = sm1Var.f16484e;
            if ((i17 != -1 && i16 != -1) || sm1Var.d()) {
                sbZ.append(", color=");
                if (sm1Var.d()) {
                    String strE = sm1.e(sm1Var.f16480a);
                    String strG = sm1.g(sm1Var.f16481b);
                    String strF = sm1.f(sm1Var.f16482c);
                    String str5 = bq0.f9768a;
                    Locale locale = Locale.US;
                    str = strE + "/" + strG + "/" + strF;
                } else {
                    str = "NA/NA/NA";
                }
                if (i17 == -1 || i16 == -1) {
                    string = "NA/NA";
                } else {
                    StringBuilder sb3 = new StringBuilder(r5.c.e(i17, 1) + String.valueOf(i16).length());
                    sb3.append(i17);
                    sb3.append("/");
                    sb3.append(i16);
                    string = sb3.toString();
                }
                StringBuilder sb4 = new StringBuilder(string.length() + str.length() + 1);
                sb4.append(str);
                sb4.append("/");
                sb4.append(string);
                sbZ.append(sb4.toString());
            }
        }
        float f11 = mx1Var.f14063x;
        if (f11 != -1.0f) {
            sbZ.append(", fps=");
            sbZ.append(f11);
        }
        int i18 = mx1Var.D;
        if (i18 != -1) {
            sbZ.append(", maxSubLayers=");
            sbZ.append(i18);
        }
        int i19 = mx1Var.E;
        if (i19 != -1) {
            sbZ.append(", channels=");
            sbZ.append(i19);
        }
        int i20 = mx1Var.F;
        if (i20 != -1) {
            sbZ.append(", sample_rate=");
            sbZ.append(i20);
        }
        String str6 = mx1Var.f14045d;
        if (str6 != null) {
            sbZ.append(", language=");
            sbZ.append(str6);
        }
        x41 x41Var = mx1Var.f14044c;
        if (!x41Var.isEmpty()) {
            sbZ.append(", labels=[");
            yo0.y(sbZ, mq0.F(x41Var, b11.f9546d).iterator(), ",");
            sbZ.append("]");
        }
        int i21 = mx1Var.f14046e;
        if (i21 != 0) {
            sbZ.append(", selectionFlags=[");
            String str7 = bq0.f9768a;
            ArrayList arrayList = new ArrayList();
            if ((i21 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i21 & 2) != 0) {
                arrayList.add("forced");
            }
            yo0.y(sbZ, arrayList.iterator(), ",");
            sbZ.append("]");
        }
        int i22 = mx1Var.f14047f;
        if (i22 != 0) {
            sbZ.append(", roleFlags=[");
            int i23 = i22 & 32768;
            String str8 = bq0.f9768a;
            ArrayList arrayList2 = new ArrayList();
            if ((i22 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i22 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i22 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i22 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i22 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i22 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i22 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i22 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i22 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i22 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i22 & Segment.SHARE_MINIMUM) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i22 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i22 & Buffer.SEGMENTING_THRESHOLD) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i22 & Segment.SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i22 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            if (i23 != 0) {
                arrayList2.add("auxiliary");
            }
            yo0.y(sbZ, arrayList2.iterator(), ",");
            sbZ.append("]");
        }
        if ((i22 & 32768) != 0) {
            sbZ.append(", auxiliaryTrackType=");
            String str9 = bq0.f9768a;
            sbZ.append("undefined");
        }
        return sbZ.toString();
    }

    public final lw1 a() {
        return new lw1(this);
    }

    public final boolean b(mx1 mx1Var) {
        List list = this.f14055p;
        int size = list.size();
        List list2 = mx1Var.f14055p;
        if (size != list2.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!Arrays.equals((byte[]) list.get(i4), (byte[]) list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i4;
        if (this == obj) {
            return true;
        }
        if (obj == null || mx1.class != obj.getClass()) {
            return false;
        }
        mx1 mx1Var = (mx1) obj;
        int i10 = this.M;
        return (i10 == 0 || (i4 = mx1Var.M) == 0 || i10 == i4) && this.f14046e == mx1Var.f14046e && this.f14047f == mx1Var.f14047f && this.g == mx1Var.g && this.f14048h == mx1Var.f14048h && this.f14053n == mx1Var.f14053n && this.f14057r == mx1Var.f14057r && this.f14059t == mx1Var.f14059t && this.f14060u == mx1Var.f14060u && this.f14061v == mx1Var.f14061v && this.f14062w == mx1Var.f14062w && this.f14064y == mx1Var.f14064y && this.B == mx1Var.B && this.D == mx1Var.D && this.E == mx1Var.E && this.F == mx1Var.F && this.G == mx1Var.G && this.H == mx1Var.H && this.I == mx1Var.I && this.J == mx1Var.J && this.L == mx1Var.L && Float.compare(this.f14063x, mx1Var.f14063x) == 0 && Float.compare(this.f14065z, mx1Var.f14065z) == 0 && Objects.equals(this.f14042a, mx1Var.f14042a) && Objects.equals(this.f14043b, mx1Var.f14043b) && this.f14044c.equals(mx1Var.f14044c) && Objects.equals(this.j, mx1Var.j) && Objects.equals(this.f14051l, mx1Var.f14051l) && Objects.equals(this.f14052m, mx1Var.f14052m) && Objects.equals(this.f14045d, mx1Var.f14045d) && Arrays.equals(this.A, mx1Var.A) && Objects.equals(this.f14050k, mx1Var.f14050k) && Objects.equals(this.C, mx1Var.C) && Objects.equals(this.f14056q, mx1Var.f14056q) && b(mx1Var);
    }

    public final int hashCode() {
        int i4 = this.M;
        if (i4 != 0) {
            return i4;
        }
        String str = this.f14042a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f14043b;
        int iHashCode2 = this.f14044c.hashCode() + ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.f14045d;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f14046e) * 31) + this.f14047f) * 961) + this.g) * 31) + this.f14048h) * 31;
        String str4 = this.j;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        v8 v8Var = this.f14050k;
        int iHashCode5 = iHashCode4 + (v8Var == null ? 0 : v8Var.hashCode());
        String str5 = this.f14051l;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iD = ((((((((((((((((((((r5.c.d(this.f14065z, (r5.c.d(this.f14063x, (((((((((((((iHashCode6 + (this.f14052m != null ? r1.hashCode() : 0)) * 31) + this.f14053n) * 31) + ((int) this.f14057r)) * 31) + this.f14059t) * 31) + this.f14060u) * 31) + this.f14061v) * 31) + this.f14062w) * 31, 31) + this.f14064y) * 31, 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) - 1) * 31) - 1) * 31) + this.L;
        this.M = iD;
        return iD;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.C);
        String str = this.f14042a;
        int length = String.valueOf(str).length();
        String str2 = this.f14043b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f14051l;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f14052m;
        int length4 = String.valueOf(str4).length();
        String str5 = this.j;
        int length5 = String.valueOf(str5).length();
        int i4 = this.f14049i;
        int length6 = String.valueOf(i4).length();
        String str6 = this.f14045d;
        int length7 = String.valueOf(str6).length();
        int i10 = this.f14059t;
        int length8 = String.valueOf(i10).length();
        int i11 = this.f14060u;
        int length9 = String.valueOf(i11).length();
        float f10 = this.f14063x;
        int length10 = String.valueOf(f10).length();
        int length11 = strValueOf.length();
        int i12 = this.E;
        int length12 = String.valueOf(i12).length();
        int i13 = this.F;
        StringBuilder sb2 = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + String.valueOf(i13).length() + 2);
        je.u.B(sb2, "Format(", str, ", ", str2);
        je.u.B(sb2, ", ", str3, ", ", str4);
        sb2.append(", ");
        sb2.append(str5);
        sb2.append(", ");
        sb2.append(i4);
        sb2.append(", ");
        sb2.append(str6);
        sb2.append(", [");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(f10);
        sb2.append(", ");
        sb2.append(strValueOf);
        sb2.append("], [");
        sb2.append(i12);
        return je.u.v(sb2, ", ", i13, "])");
    }
}
