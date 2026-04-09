package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ph4 {
    public static final /* synthetic */ int N = 0;
    public final byte[] A;
    public final int B;
    public final n74 C;
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
    public final String a;
    public final String b;
    public final xm3 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final wn1 k;
    public final String l;
    public final String m;
    public final int n;
    public final int o;
    public final List p;
    public final ie4 q;
    public final long r;
    public final boolean s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final float x;
    public final int y;
    public final float z;

    static {
        new ph4(new gg4());
        String str = v23.a;
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

    public ph4(gg4 gg4Var) throws MissingResourceException {
        boolean z;
        String str;
        this.a = gg4Var.a;
        String strN = v23.n(gg4Var.d);
        this.d = strN;
        if (gg4Var.c.isEmpty() && gg4Var.b != null) {
            this.c = xm3.i(new ui4(strN, gg4Var.b));
            this.b = gg4Var.b;
        } else if (!gg4Var.c.isEmpty() && gg4Var.b == null) {
            xm3 xm3Var = gg4Var.c;
            this.c = xm3Var;
            Iterator it = xm3Var.iterator();
            while (true) {
                ql3 ql3Var = (ql3) it;
                if (!ql3Var.hasNext()) {
                    str = ((ui4) xm3Var.get(0)).b;
                    break;
                }
                ui4 ui4Var = (ui4) ql3Var.next();
                if (TextUtils.equals(ui4Var.a, strN)) {
                    str = ui4Var.b;
                    break;
                }
            }
            this.b = str;
        } else if (gg4Var.c.isEmpty() && gg4Var.b == null) {
            z = true;
            zt0.b0(z);
            this.c = gg4Var.c;
            this.b = gg4Var.b;
        } else {
            for (int i = 0; i < gg4Var.c.size(); i++) {
                if (((ui4) gg4Var.c.get(i)).b.equals(gg4Var.b)) {
                    z = true;
                    break;
                }
            }
            z = false;
            zt0.b0(z);
            this.c = gg4Var.c;
            this.b = gg4Var.b;
        }
        this.e = gg4Var.e;
        this.f = gg4Var.f;
        int i2 = gg4Var.g;
        this.g = i2;
        int i3 = gg4Var.h;
        this.h = i3;
        this.i = i3 != -1 ? i3 : i2;
        this.j = gg4Var.i;
        this.k = gg4Var.j;
        this.l = gg4Var.k;
        this.m = gg4Var.l;
        this.n = gg4Var.m;
        this.o = gg4Var.n;
        List list = gg4Var.o;
        this.p = list == null ? Collections.EMPTY_LIST : list;
        ie4 ie4Var = gg4Var.p;
        this.q = ie4Var;
        this.r = gg4Var.q;
        this.s = gg4Var.r;
        this.t = gg4Var.s;
        this.u = gg4Var.t;
        this.v = gg4Var.u;
        this.w = gg4Var.v;
        this.x = gg4Var.w;
        int i4 = gg4Var.x;
        this.y = i4 == -1 ? 0 : i4;
        float f = gg4Var.y;
        this.z = f == -1.0f ? 1.0f : f;
        this.A = gg4Var.z;
        this.B = gg4Var.A;
        this.C = gg4Var.B;
        this.D = gg4Var.C;
        this.E = gg4Var.D;
        this.F = gg4Var.E;
        this.G = gg4Var.F;
        int i5 = gg4Var.G;
        this.H = i5 == -1 ? 0 : i5;
        int i6 = gg4Var.H;
        this.I = i6 != -1 ? i6 : 0;
        this.J = gg4Var.I;
        this.K = gg4Var.J;
        int i7 = gg4Var.K;
        if (i7 != 0 || ie4Var == null) {
            this.L = i7;
        } else {
            this.L = 1;
        }
    }

    public static String c(ph4 ph4Var) {
        String str;
        String string;
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(ph4Var.a);
        sb.append(", mimeType=");
        sb.append(ph4Var.m);
        String str2 = ph4Var.l;
        if (str2 != null) {
            sb.append(", container=");
            sb.append(str2);
        }
        int i3 = ph4Var.i;
        if (i3 != -1) {
            sb.append(", bitrate=");
            sb.append(i3);
        }
        String str3 = ph4Var.j;
        if (str3 != null) {
            sb.append(", codecs=");
            sb.append(str3);
        }
        ie4 ie4Var = ph4Var.q;
        if (ie4Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < ie4Var.i; i4++) {
                UUID uuid = ie4Var.f[i4].g;
                if (uuid.equals(fh3.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(fh3.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(fh3.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(fh3.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(fh3.a)) {
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
            sb.append(", drm=[");
            i30.k0(sb, linkedHashSet.iterator(), ",");
            sb.append(']');
        }
        int i5 = ph4Var.t;
        if (i5 != -1 && (i2 = ph4Var.u) != -1) {
            ex0.o(sb, ", res=", i5, "x", i2);
        }
        int i6 = ph4Var.v;
        if (i6 != -1 && (i = ph4Var.w) != -1) {
            ex0.o(sb, ", decRes=", i6, "x", i);
        }
        float f = ph4Var.z;
        int i7 = qo3.a;
        double d = f;
        if (Math.copySign((-1.0d) + d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            Object[] objArr = {Float.valueOf(f)};
            String str4 = v23.a;
            sb.append(String.format(Locale.US, "%.3f", objArr));
        }
        n74 n74Var = ph4Var.C;
        if (n74Var != null) {
            int i8 = n74Var.f;
            int i9 = n74Var.e;
            if ((i9 != -1 && i8 != -1) || n74Var.d()) {
                sb.append(", color=");
                if (n74Var.d()) {
                    String strE = n74.e(n74Var.a);
                    String strG = n74.g(n74Var.b);
                    String strF = n74.f(n74Var.c);
                    String str5 = v23.a;
                    Locale locale = Locale.US;
                    str = strE + "/" + strG + "/" + strF;
                } else {
                    str = "NA/NA/NA";
                }
                if (i9 == -1 || i8 == -1) {
                    string = "NA/NA";
                } else {
                    StringBuilder sb3 = new StringBuilder(ga1.f(i9, 1) + String.valueOf(i8).length());
                    sb3.append(i9);
                    sb3.append("/");
                    sb3.append(i8);
                    string = sb3.toString();
                }
                StringBuilder sb4 = new StringBuilder(string.length() + str.length() + 1);
                sb4.append(str);
                sb4.append("/");
                sb4.append(string);
                sb.append(sb4.toString());
            }
        }
        float f2 = ph4Var.x;
        if (f2 != -1.0f) {
            sb.append(", fps=");
            sb.append(f2);
        }
        int i10 = ph4Var.D;
        if (i10 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i10);
        }
        int i11 = ph4Var.E;
        if (i11 != -1) {
            sb.append(", channels=");
            sb.append(i11);
        }
        int i12 = ph4Var.F;
        if (i12 != -1) {
            sb.append(", sample_rate=");
            sb.append(i12);
        }
        String str6 = ph4Var.d;
        if (str6 != null) {
            sb.append(", language=");
            sb.append(str6);
        }
        xm3 xm3Var = ph4Var.c;
        if (!xm3Var.isEmpty()) {
            sb.append(", labels=[");
            i30.k0(sb, gi2.O(xm3Var, dj3.g).iterator(), ",");
            sb.append("]");
        }
        int i13 = ph4Var.e;
        if (i13 != 0) {
            sb.append(", selectionFlags=[");
            String str7 = v23.a;
            ArrayList arrayList = new ArrayList();
            if ((i13 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i13 & 2) != 0) {
                arrayList.add("forced");
            }
            i30.k0(sb, arrayList.iterator(), ",");
            sb.append("]");
        }
        int i14 = ph4Var.f;
        if (i14 != 0) {
            sb.append(", roleFlags=[");
            int i15 = i14 & 32768;
            String str8 = v23.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i14 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i14 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i14 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i14 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i14 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i14 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i14 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i14 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i14 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i14 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i14 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i14 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i14 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i14 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i14 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i15 != 0) {
                arrayList2.add("auxiliary");
            }
            i30.k0(sb, arrayList2.iterator(), ",");
            sb.append("]");
        }
        if ((i14 & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            String str9 = v23.a;
            sb.append("undefined");
        }
        return sb.toString();
    }

    public final gg4 a() {
        return new gg4(this);
    }

    public final boolean b(ph4 ph4Var) {
        List list = this.p;
        int size = list.size();
        List list2 = ph4Var.p;
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
        if (obj == null || ph4.class != obj.getClass()) {
            return false;
        }
        ph4 ph4Var = (ph4) obj;
        int i2 = this.M;
        return (i2 == 0 || (i = ph4Var.M) == 0 || i2 == i) && this.e == ph4Var.e && this.f == ph4Var.f && this.g == ph4Var.g && this.h == ph4Var.h && this.n == ph4Var.n && this.r == ph4Var.r && this.t == ph4Var.t && this.u == ph4Var.u && this.v == ph4Var.v && this.w == ph4Var.w && this.y == ph4Var.y && this.B == ph4Var.B && this.D == ph4Var.D && this.E == ph4Var.E && this.F == ph4Var.F && this.G == ph4Var.G && this.H == ph4Var.H && this.I == ph4Var.I && this.J == ph4Var.J && this.L == ph4Var.L && Float.compare(this.x, ph4Var.x) == 0 && Float.compare(this.z, ph4Var.z) == 0 && Objects.equals(this.a, ph4Var.a) && Objects.equals(this.b, ph4Var.b) && this.c.equals(ph4Var.c) && Objects.equals(this.j, ph4Var.j) && Objects.equals(this.l, ph4Var.l) && Objects.equals(this.m, ph4Var.m) && Objects.equals(this.d, ph4Var.d) && Arrays.equals(this.A, ph4Var.A) && Objects.equals(this.k, ph4Var.k) && Objects.equals(this.C, ph4Var.C) && Objects.equals(this.q, ph4Var.q) && b(ph4Var);
    }

    public final int hashCode() {
        int i = this.M;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = this.c.hashCode() + ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.d;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 961) + this.g) * 31) + this.h) * 31;
        String str4 = this.j;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        wn1 wn1Var = this.k;
        int iHashCode5 = iHashCode4 + (wn1Var == null ? 0 : wn1Var.hashCode());
        String str5 = this.l;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iFloatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.z) + ((((Float.floatToIntBits(this.x) + ((((((((((((((iHashCode6 + (this.m != null ? r1.hashCode() : 0)) * 31) + this.n) * 31) + ((int) this.r)) * 31) + this.t) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31)) * 31) + this.y) * 31)) * 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) - 1) * 31) - 1) * 31) + this.L;
        this.M = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.C);
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.l;
        int length3 = String.valueOf(str3).length();
        String str4 = this.m;
        int length4 = String.valueOf(str4).length();
        String str5 = this.j;
        int length5 = String.valueOf(str5).length();
        int i = this.i;
        int length6 = String.valueOf(i).length();
        String str6 = this.d;
        int length7 = String.valueOf(str6).length();
        int i2 = this.t;
        int length8 = String.valueOf(i2).length();
        int i3 = this.u;
        int length9 = String.valueOf(i3).length();
        float f = this.x;
        int length10 = String.valueOf(f).length();
        int length11 = strValueOf.length();
        int i4 = this.E;
        int length12 = String.valueOf(i4).length();
        int i5 = this.F;
        StringBuilder sb = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + String.valueOf(i5).length() + 2);
        ex0.q(sb, "Format(", str, ", ", str2);
        ex0.q(sb, ", ", str3, ", ", str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append("], [");
        sb.append(i4);
        return ga1.k(sb, ", ", i5, "])");
    }
}
