package androidx.media3.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class r implements i {
    public final int B;
    public final int D;
    public final String E;
    public final Metadata F;
    public final String G;
    public final String H;
    public final int I;
    public final List J;
    public final DrmInitData K;
    public final long L;
    public final int M;
    public final int N;
    public final float O;
    public final int P;
    public final float Q;
    public final byte[] R;
    public final int S;
    public final k T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final int Y;
    public final int Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f1780a;

    /* renamed from: a0, reason: collision with root package name */
    public final int f1781a0;

    /* renamed from: b0, reason: collision with root package name */
    public final int f1782b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f1783c0;

    /* renamed from: d, reason: collision with root package name */
    public final String f1784d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1785d0;

    /* renamed from: g, reason: collision with root package name */
    public final String f1786g;

    /* renamed from: r, reason: collision with root package name */
    public final int f1787r;

    /* renamed from: x, reason: collision with root package name */
    public final int f1788x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1789y;

    /* renamed from: e0, reason: collision with root package name */
    public static final r f1758e0 = new r(new q());

    /* renamed from: f0, reason: collision with root package name */
    public static final String f1759f0 = Integer.toString(0, 36);

    /* renamed from: g0, reason: collision with root package name */
    public static final String f1760g0 = Integer.toString(1, 36);

    /* renamed from: h0, reason: collision with root package name */
    public static final String f1761h0 = Integer.toString(2, 36);

    /* renamed from: i0, reason: collision with root package name */
    public static final String f1762i0 = Integer.toString(3, 36);

    /* renamed from: j0, reason: collision with root package name */
    public static final String f1763j0 = Integer.toString(4, 36);

    /* renamed from: k0, reason: collision with root package name */
    public static final String f1764k0 = Integer.toString(5, 36);

    /* renamed from: l0, reason: collision with root package name */
    public static final String f1765l0 = Integer.toString(6, 36);

    /* renamed from: m0, reason: collision with root package name */
    public static final String f1766m0 = Integer.toString(7, 36);

    /* renamed from: n0, reason: collision with root package name */
    public static final String f1767n0 = Integer.toString(8, 36);

    /* renamed from: o0, reason: collision with root package name */
    public static final String f1768o0 = Integer.toString(9, 36);

    /* renamed from: p0, reason: collision with root package name */
    public static final String f1769p0 = Integer.toString(10, 36);

    /* renamed from: q0, reason: collision with root package name */
    public static final String f1770q0 = Integer.toString(11, 36);

    /* renamed from: r0, reason: collision with root package name */
    public static final String f1771r0 = Integer.toString(12, 36);

    /* renamed from: s0, reason: collision with root package name */
    public static final String f1772s0 = Integer.toString(13, 36);

    /* renamed from: t0, reason: collision with root package name */
    public static final String f1773t0 = Integer.toString(14, 36);

    /* renamed from: u0, reason: collision with root package name */
    public static final String f1774u0 = Integer.toString(15, 36);

    /* renamed from: v0, reason: collision with root package name */
    public static final String f1775v0 = Integer.toString(16, 36);

    /* renamed from: w0, reason: collision with root package name */
    public static final String f1776w0 = Integer.toString(17, 36);

    /* renamed from: x0, reason: collision with root package name */
    public static final String f1777x0 = Integer.toString(18, 36);

    /* renamed from: y0, reason: collision with root package name */
    public static final String f1778y0 = Integer.toString(19, 36);

    /* renamed from: z0, reason: collision with root package name */
    public static final String f1779z0 = Integer.toString(20, 36);
    public static final String A0 = Integer.toString(21, 36);
    public static final String B0 = Integer.toString(22, 36);
    public static final String C0 = Integer.toString(23, 36);
    public static final String D0 = Integer.toString(24, 36);
    public static final String E0 = Integer.toString(25, 36);
    public static final String F0 = Integer.toString(26, 36);
    public static final String G0 = Integer.toString(27, 36);
    public static final String H0 = Integer.toString(28, 36);
    public static final String I0 = Integer.toString(29, 36);
    public static final String J0 = Integer.toString(30, 36);
    public static final String K0 = Integer.toString(31, 36);
    public static final ab.c L0 = new ab.c(4);

    public r(q qVar) {
        this.f1780a = qVar.f1734a;
        this.f1784d = qVar.f1735b;
        this.f1786g = a5.d0.H(qVar.f1736c);
        this.f1787r = qVar.f1737d;
        this.f1788x = qVar.f1738e;
        int i10 = qVar.f1739f;
        this.f1789y = i10;
        int i11 = qVar.f1740g;
        this.B = i11;
        this.D = i11 != -1 ? i11 : i10;
        this.E = qVar.f1741h;
        this.F = qVar.f1742i;
        this.G = qVar.j;
        this.H = qVar.k;
        this.I = qVar.f1743l;
        List list = qVar.f1744m;
        this.J = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = qVar.f1745n;
        this.K = drmInitData;
        this.L = qVar.f1746o;
        this.M = qVar.f1747p;
        this.N = qVar.f1748q;
        this.O = qVar.f1749r;
        int i12 = qVar.f1750s;
        this.P = i12 == -1 ? 0 : i12;
        float f10 = qVar.f1751t;
        this.Q = f10 == -1.0f ? 1.0f : f10;
        this.R = qVar.f1752u;
        this.S = qVar.f1753v;
        this.T = qVar.f1754w;
        this.U = qVar.f1755x;
        this.V = qVar.f1756y;
        this.W = qVar.f1757z;
        int i13 = qVar.A;
        this.X = i13 == -1 ? 0 : i13;
        int i14 = qVar.B;
        this.Y = i14 != -1 ? i14 : 0;
        this.Z = qVar.C;
        this.f1781a0 = qVar.D;
        this.f1782b0 = qVar.E;
        int i15 = qVar.F;
        if (i15 != 0 || drmInitData == null) {
            this.f1783c0 = i15;
        } else {
            this.f1783c0 = 1;
        }
    }

    public static String c(r rVar) {
        char c4;
        if (rVar == null) {
            return "null";
        }
        String str = rVar.f1784d;
        String str2 = rVar.f1786g;
        int i10 = rVar.V;
        int i11 = rVar.U;
        float f10 = rVar.O;
        int i12 = rVar.N;
        int i13 = rVar.M;
        DrmInitData drmInitData = rVar.K;
        String str3 = rVar.E;
        int i14 = rVar.D;
        int i15 = rVar.f1787r;
        int i16 = rVar.f1788x;
        StringBuilder sbT = c7.a.t("id=");
        sbT.append(rVar.f1780a);
        sbT.append(", mimeType=");
        sbT.append(rVar.H);
        int i17 = -1;
        if (i14 != -1) {
            sbT.append(", bitrate=");
            sbT.append(i14);
        }
        if (str3 != null) {
            sbT.append(", codecs=");
            sbT.append(str3);
        }
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i18 = 0; i18 < drmInitData.f1543r; i18++) {
                UUID uuid = drmInitData.f1540a[i18].f1545d;
                if (uuid.equals(j.f1702b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(j.f1703c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(j.f1705e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(j.f1704d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(j.f1701a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            c4 = ',';
            sbT.append(", drm=[");
            new hf.y(String.valueOf(','), 3).c(sbT, linkedHashSet.iterator());
            sbT.append(']');
            i17 = -1;
        } else {
            c4 = ',';
        }
        if (i13 != i17 && i12 != i17) {
            sbT.append(", res=");
            sbT.append(i13);
            sbT.append("x");
            sbT.append(i12);
        }
        if (f10 != -1.0f) {
            sbT.append(", fps=");
            sbT.append(f10);
        }
        if (i11 != -1) {
            sbT.append(", channels=");
            sbT.append(i11);
        }
        if (i10 != -1) {
            sbT.append(", sample_rate=");
            sbT.append(i10);
        }
        if (str2 != null) {
            sbT.append(", language=");
            sbT.append(str2);
        }
        if (str != null) {
            sbT.append(", label=");
            sbT.append(str);
        }
        if (i15 != 0) {
            ArrayList arrayList = new ArrayList();
            if ((i15 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i15 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i15 & 2) != 0) {
                arrayList.add("forced");
            }
            sbT.append(", selectionFlags=[");
            new hf.y(String.valueOf(c4), 3).c(sbT, arrayList.iterator());
            sbT.append("]");
        }
        if (i16 != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((i16 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i16 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i16 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i16 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i16 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i16 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i16 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i16 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i16 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i16 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i16 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i16 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i16 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i16 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i16 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sbT.append(", roleFlags=[");
            new hf.y(String.valueOf(c4), 3).c(sbT, arrayList2.iterator());
            sbT.append("]");
        }
        return sbT.toString();
    }

    public final q a() {
        q qVar = new q();
        qVar.f1734a = this.f1780a;
        qVar.f1735b = this.f1784d;
        qVar.f1736c = this.f1786g;
        qVar.f1737d = this.f1787r;
        qVar.f1738e = this.f1788x;
        qVar.f1739f = this.f1789y;
        qVar.f1740g = this.B;
        qVar.f1741h = this.E;
        qVar.f1742i = this.F;
        qVar.j = this.G;
        qVar.k = this.H;
        qVar.f1743l = this.I;
        qVar.f1744m = this.J;
        qVar.f1745n = this.K;
        qVar.f1746o = this.L;
        qVar.f1747p = this.M;
        qVar.f1748q = this.N;
        qVar.f1749r = this.O;
        qVar.f1750s = this.P;
        qVar.f1751t = this.Q;
        qVar.f1752u = this.R;
        qVar.f1753v = this.S;
        qVar.f1754w = this.T;
        qVar.f1755x = this.U;
        qVar.f1756y = this.V;
        qVar.f1757z = this.W;
        qVar.A = this.X;
        qVar.B = this.Y;
        qVar.C = this.Z;
        qVar.D = this.f1781a0;
        qVar.E = this.f1782b0;
        qVar.F = this.f1783c0;
        return qVar;
    }

    public final boolean b(r rVar) {
        List list = this.J;
        if (list.size() != rVar.J.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) rVar.J.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.common.r d(androidx.media3.common.r r22) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.r.d(androidx.media3.common.r):androidx.media3.common.r");
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            int i11 = this.f1785d0;
            if ((i11 == 0 || (i10 = rVar.f1785d0) == 0 || i11 == i10) && this.f1787r == rVar.f1787r && this.f1788x == rVar.f1788x && this.f1789y == rVar.f1789y && this.B == rVar.B && this.I == rVar.I && this.L == rVar.L && this.M == rVar.M && this.N == rVar.N && this.P == rVar.P && this.S == rVar.S && this.U == rVar.U && this.V == rVar.V && this.W == rVar.W && this.X == rVar.X && this.Y == rVar.Y && this.Z == rVar.Z && this.f1781a0 == rVar.f1781a0 && this.f1782b0 == rVar.f1782b0 && this.f1783c0 == rVar.f1783c0 && Float.compare(this.O, rVar.O) == 0 && Float.compare(this.Q, rVar.Q) == 0 && a5.d0.a(this.f1780a, rVar.f1780a) && a5.d0.a(this.f1784d, rVar.f1784d) && a5.d0.a(this.E, rVar.E) && a5.d0.a(this.G, rVar.G) && a5.d0.a(this.H, rVar.H) && a5.d0.a(this.f1786g, rVar.f1786g) && Arrays.equals(this.R, rVar.R) && a5.d0.a(this.F, rVar.F) && a5.d0.a(this.T, rVar.T) && a5.d0.a(this.K, rVar.K) && b(rVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1785d0 == 0) {
            String str = this.f1780a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f1784d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f1786g;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f1787r) * 31) + this.f1788x) * 31) + this.f1789y) * 31) + this.B) * 31;
            String str4 = this.E;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.F;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.G;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.H;
            this.f1785d0 = ((((((((((((((((((((Float.floatToIntBits(this.Q) + ((((Float.floatToIntBits(this.O) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.I) * 31) + ((int) this.L)) * 31) + this.M) * 31) + this.N) * 31)) * 31) + this.P) * 31)) * 31) + this.S) * 31) + this.U) * 31) + this.V) * 31) + this.W) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31) + this.f1781a0) * 31) + this.f1782b0) * 31) + this.f1783c0;
        }
        return this.f1785d0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f1780a);
        sb2.append(", ");
        sb2.append(this.f1784d);
        sb2.append(", ");
        sb2.append(this.G);
        sb2.append(", ");
        sb2.append(this.H);
        sb2.append(", ");
        sb2.append(this.E);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append(", ");
        sb2.append(this.f1786g);
        sb2.append(", [");
        sb2.append(this.M);
        sb2.append(", ");
        sb2.append(this.N);
        sb2.append(", ");
        sb2.append(this.O);
        sb2.append("], [");
        sb2.append(this.U);
        sb2.append(", ");
        return h0.b.i(this.V, "])", sb2);
    }
}
