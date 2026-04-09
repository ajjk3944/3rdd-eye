package ab;

import a5.d0;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.b1;
import androidx.media3.common.c0;
import androidx.media3.common.e0;
import androidx.media3.common.f0;
import androidx.media3.common.f1;
import androidx.media3.common.g0;
import androidx.media3.common.l0;
import androidx.media3.common.q;
import androidx.media3.common.q0;
import androidx.media3.common.r;
import androidx.media3.common.t;
import androidx.media3.common.v;
import androidx.media3.common.v0;
import androidx.media3.common.w;
import androidx.media3.common.w0;
import androidx.media3.common.x;
import androidx.media3.common.y0;
import androidx.media3.common.z;
import androidx.media3.common.z0;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.d1;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import h9.r2;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import oe.h0;
import oe.u0;
import u3.h1;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements androidx.media3.common.h, eg.a, bf.f, qb.h, u3.n, ne.h, a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288a;

    public /* synthetic */ c(int i10) {
        this.f288a = i10;
    }

    @Override // qb.h, a5.j
    public void a(Object obj) {
        switch (this.f288a) {
            case 24:
                ((d1) obj).onPlayerError(new com.google.android.exoplayer2.n(2, new bf.n("Player release timed out."), 1003));
                break;
            case 25:
                ((d1) obj).onSeekProcessed();
                break;
            case 26:
            case 27:
            default:
                ((q0) obj).onSeekProcessed();
                break;
            case 28:
                ((q0) obj).onPlayerError(new d5.f(2, new bf.n("Player release timed out."), 1003));
                break;
        }
    }

    @Override // ne.h
    public Object apply(Object obj) {
        return new DefaultAnalyticsCollector((a5.b) obj);
    }

    @Override // u3.n
    public h1 c0(View view, h1 h1Var) {
        br.l.e(view, "v");
        k3.d dVarF = h1Var.f23176a.f(135);
        br.l.d(dVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(dVarF.f14014a, dVarF.f14015b, dVarF.f14016c, dVarF.f14017d);
            view.setLayoutParams(layoutParams);
        }
        return h1.f23175b;
    }

    @Override // androidx.media3.common.h
    public androidx.media3.common.i d(Bundle bundle) {
        androidx.media3.common.a[] aVarArr;
        Bundle bundle2;
        Bundle bundle3;
        u0 u0VarP;
        int i10 = 0;
        switch (this.f288a) {
            case 1:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(androidx.media3.common.b.D);
                if (parcelableArrayList == null) {
                    aVarArr = new androidx.media3.common.a[0];
                } else {
                    androidx.media3.common.a[] aVarArr2 = new androidx.media3.common.a[parcelableArrayList.size()];
                    for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                        aVarArr2[i11] = (androidx.media3.common.a) androidx.media3.common.a.M.d((Bundle) parcelableArrayList.get(i11));
                    }
                    aVarArr = aVarArr2;
                }
                return new androidx.media3.common.b(aVarArr, bundle.getLong(androidx.media3.common.b.E, 0L), bundle.getLong(androidx.media3.common.b.F, -9223372036854775807L), bundle.getInt(androidx.media3.common.b.G, 0));
            case 2:
                long j = bundle.getLong(androidx.media3.common.a.E);
                int i12 = bundle.getInt(androidx.media3.common.a.F);
                int i13 = bundle.getInt(androidx.media3.common.a.L);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(androidx.media3.common.a.G);
                int[] intArray = bundle.getIntArray(androidx.media3.common.a.H);
                long[] longArray = bundle.getLongArray(androidx.media3.common.a.I);
                long j7 = bundle.getLong(androidx.media3.common.a.J);
                boolean z10 = bundle.getBoolean(androidx.media3.common.a.K);
                int[] iArr = intArray;
                if (iArr == null) {
                    iArr = new int[0];
                }
                Uri[] uriArr = parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]);
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new androidx.media3.common.a(j, i12, i13, iArr, uriArr, longArray, j7, z10);
            case 3:
                return new androidx.media3.common.k(bundle.getInt(androidx.media3.common.k.f1708y, -1), bundle.getInt(androidx.media3.common.k.B, -1), bundle.getInt(androidx.media3.common.k.D, -1), bundle.getByteArray(androidx.media3.common.k.E));
            case 4:
                r rVar = r.f1758e0;
                q qVar = new q();
                if (bundle != null) {
                    ClassLoader classLoader = a5.a.class.getClassLoader();
                    int i14 = d0.f105a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(r.f1759f0);
                String str = rVar.f1780a;
                if (string == null) {
                    string = str;
                }
                qVar.f1734a = string;
                String string2 = bundle.getString(r.f1760g0);
                String str2 = rVar.f1784d;
                if (string2 == null) {
                    string2 = str2;
                }
                qVar.f1735b = string2;
                String string3 = bundle.getString(r.f1761h0);
                String str3 = rVar.f1786g;
                if (string3 == null) {
                    string3 = str3;
                }
                qVar.f1736c = string3;
                qVar.f1737d = bundle.getInt(r.f1762i0, rVar.f1787r);
                qVar.f1738e = bundle.getInt(r.f1763j0, rVar.f1788x);
                qVar.f1739f = bundle.getInt(r.f1764k0, rVar.f1789y);
                qVar.f1740g = bundle.getInt(r.f1765l0, rVar.B);
                String string4 = bundle.getString(r.f1766m0);
                String str4 = rVar.E;
                if (string4 == null) {
                    string4 = str4;
                }
                qVar.f1741h = string4;
                Metadata metadata = (Metadata) bundle.getParcelable(r.f1767n0);
                Metadata metadata2 = rVar.F;
                if (metadata == null) {
                    metadata = metadata2;
                }
                qVar.f1742i = metadata;
                String string5 = bundle.getString(r.f1768o0);
                String str5 = rVar.G;
                if (string5 == null) {
                    string5 = str5;
                }
                qVar.j = string5;
                String string6 = bundle.getString(r.f1769p0);
                String str6 = rVar.H;
                if (string6 == null) {
                    string6 = str6;
                }
                qVar.k = string6;
                qVar.f1743l = bundle.getInt(r.f1770q0, rVar.I);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(r.f1771r0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        qVar.f1744m = arrayList;
                        qVar.f1745n = (DrmInitData) bundle.getParcelable(r.f1772s0);
                        qVar.f1746o = bundle.getLong(r.f1773t0, rVar.L);
                        qVar.f1747p = bundle.getInt(r.f1774u0, rVar.M);
                        qVar.f1748q = bundle.getInt(r.f1775v0, rVar.N);
                        qVar.f1749r = bundle.getFloat(r.f1776w0, rVar.O);
                        qVar.f1750s = bundle.getInt(r.f1777x0, rVar.P);
                        qVar.f1751t = bundle.getFloat(r.f1778y0, rVar.Q);
                        qVar.f1752u = bundle.getByteArray(r.f1779z0);
                        qVar.f1753v = bundle.getInt(r.A0, rVar.S);
                        Bundle bundle4 = bundle.getBundle(r.B0);
                        if (bundle4 != null) {
                            qVar.f1754w = (androidx.media3.common.k) androidx.media3.common.k.F.d(bundle4);
                        }
                        qVar.f1755x = bundle.getInt(r.C0, rVar.U);
                        qVar.f1756y = bundle.getInt(r.D0, rVar.V);
                        qVar.f1757z = bundle.getInt(r.E0, rVar.W);
                        qVar.A = bundle.getInt(r.F0, rVar.X);
                        qVar.B = bundle.getInt(r.G0, rVar.Y);
                        qVar.C = bundle.getInt(r.H0, rVar.Z);
                        qVar.D = bundle.getInt(r.J0, rVar.f1781a0);
                        qVar.E = bundle.getInt(r.K0, rVar.f1782b0);
                        qVar.F = bundle.getInt(r.I0, rVar.f1783c0);
                        return new r(qVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                a5.a.e(bundle.getInt(androidx.media3.common.u0.f1801a, -1) == 0);
                return bundle.getBoolean(t.f1796x, false) ? new t(bundle.getBoolean(t.f1797y, false)) : new t();
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                String string7 = bundle.getString(e0.D, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(e0.E);
                z zVar = bundle5 == null ? z.f1833y : (z) z.H.d(bundle5);
                Bundle bundle6 = bundle.getBundle(e0.F);
                g0 g0Var = bundle6 == null ? g0.f1655e0 : (g0) g0.M0.d(bundle6);
                Bundle bundle7 = bundle.getBundle(e0.G);
                x xVar = bundle7 == null ? x.I : (x) w.H.d(bundle7);
                Bundle bundle8 = bundle.getBundle(e0.H);
                return new e0(string7, xVar, null, zVar, g0Var, bundle8 == null ? c0.f1577g : (c0) c0.B.d(bundle8));
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                v vVar = new v();
                String str7 = w.B;
                x xVar2 = w.f1812y;
                long j10 = bundle.getLong(str7, xVar2.f1813a);
                a5.a.e(j10 >= 0);
                vVar.f1803a = j10;
                long j11 = bundle.getLong(w.D, xVar2.f1814d);
                if (j11 != Long.MIN_VALUE && j11 < 0) {
                    z = false;
                }
                a5.a.e(z);
                vVar.f1804b = j11;
                vVar.f1805c = bundle.getBoolean(w.E, xVar2.f1815g);
                vVar.f1806d = bundle.getBoolean(w.F, xVar2.f1816r);
                vVar.f1807e = bundle.getBoolean(w.G, xVar2.f1817x);
                return new x(vVar);
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new z(bundle.getLong(z.B, -9223372036854775807L), bundle.getLong(z.D, -9223372036854775807L), bundle.getLong(z.E, -9223372036854775807L), bundle.getFloat(z.F, -3.4028235E38f), bundle.getFloat(z.G, -3.4028235E38f));
            case 9:
                bm.d dVar = new bm.d(6);
                dVar.f2826d = (Uri) bundle.getParcelable(c0.f1578r);
                dVar.f2827g = bundle.getString(c0.f1579x);
                dVar.f2828r = bundle.getBundle(c0.f1580y);
                return new c0(dVar);
            case 10:
                f0 f0Var = new f0();
                f0Var.f1625a = bundle.getCharSequence(g0.f1656f0);
                f0Var.f1626b = bundle.getCharSequence(g0.f1657g0);
                f0Var.f1627c = bundle.getCharSequence(g0.f1658h0);
                f0Var.f1628d = bundle.getCharSequence(g0.f1659i0);
                f0Var.f1629e = bundle.getCharSequence(g0.f1660j0);
                f0Var.f1630f = bundle.getCharSequence(g0.f1661k0);
                f0Var.f1631g = bundle.getCharSequence(g0.f1662l0);
                byte[] byteArray2 = bundle.getByteArray(g0.f1665o0);
                String str8 = g0.H0;
                Integer numValueOf = bundle.containsKey(str8) ? Integer.valueOf(bundle.getInt(str8)) : null;
                f0Var.j = byteArray2 != null ? (byte[]) byteArray2.clone() : null;
                f0Var.k = numValueOf;
                f0Var.f1634l = (Uri) bundle.getParcelable(g0.f1666p0);
                f0Var.f1646x = bundle.getCharSequence(g0.A0);
                f0Var.f1647y = bundle.getCharSequence(g0.B0);
                f0Var.f1648z = bundle.getCharSequence(g0.C0);
                f0Var.C = bundle.getCharSequence(g0.F0);
                f0Var.D = bundle.getCharSequence(g0.G0);
                f0Var.E = bundle.getCharSequence(g0.I0);
                f0Var.G = bundle.getBundle(g0.L0);
                String str9 = g0.f1663m0;
                if (bundle.containsKey(str9) && (bundle3 = bundle.getBundle(str9)) != null) {
                    f0Var.f1632h = (androidx.media3.common.u0) androidx.media3.common.u0.f1802d.d(bundle3);
                }
                String str10 = g0.f1664n0;
                if (bundle.containsKey(str10) && (bundle2 = bundle.getBundle(str10)) != null) {
                    f0Var.f1633i = (androidx.media3.common.u0) androidx.media3.common.u0.f1802d.d(bundle2);
                }
                String str11 = g0.f1667q0;
                if (bundle.containsKey(str11)) {
                    f0Var.f1635m = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = g0.f1668r0;
                if (bundle.containsKey(str12)) {
                    f0Var.f1636n = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = g0.f1669s0;
                if (bundle.containsKey(str13)) {
                    f0Var.f1637o = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = g0.K0;
                if (bundle.containsKey(str14)) {
                    f0Var.f1638p = Boolean.valueOf(bundle.getBoolean(str14));
                }
                String str15 = g0.f1670t0;
                if (bundle.containsKey(str15)) {
                    f0Var.f1639q = Boolean.valueOf(bundle.getBoolean(str15));
                }
                String str16 = g0.f1671u0;
                if (bundle.containsKey(str16)) {
                    f0Var.f1640r = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = g0.f1672v0;
                if (bundle.containsKey(str17)) {
                    f0Var.f1641s = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = g0.f1673w0;
                if (bundle.containsKey(str18)) {
                    f0Var.f1642t = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = g0.f1674x0;
                if (bundle.containsKey(str19)) {
                    f0Var.f1643u = Integer.valueOf(bundle.getInt(str19));
                }
                String str20 = g0.f1675y0;
                if (bundle.containsKey(str20)) {
                    f0Var.f1644v = Integer.valueOf(bundle.getInt(str20));
                }
                String str21 = g0.f1676z0;
                if (bundle.containsKey(str21)) {
                    f0Var.f1645w = Integer.valueOf(bundle.getInt(str21));
                }
                String str22 = g0.D0;
                if (bundle.containsKey(str22)) {
                    f0Var.A = Integer.valueOf(bundle.getInt(str22));
                }
                String str23 = g0.E0;
                if (bundle.containsKey(str23)) {
                    f0Var.B = Integer.valueOf(bundle.getInt(str23));
                }
                String str24 = g0.J0;
                if (bundle.containsKey(str24)) {
                    f0Var.F = Integer.valueOf(bundle.getInt(str24));
                }
                return new g0(f0Var);
            case 11:
                a5.a.e(bundle.getInt(androidx.media3.common.u0.f1801a, -1) == 1);
                float f10 = bundle.getFloat(l0.f1716r, -1.0f);
                return f10 == -1.0f ? new l0() : new l0(f10);
            case 12:
                int i15 = bundle.getInt(androidx.media3.common.u0.f1801a, -1);
                if (i15 == 0) {
                    return (androidx.media3.common.u0) t.B.d(bundle);
                }
                if (i15 == 1) {
                    return (androidx.media3.common.u0) l0.f1717x.d(bundle);
                }
                if (i15 == 2) {
                    return (androidx.media3.common.u0) v0.B.d(bundle);
                }
                if (i15 == 3) {
                    return (androidx.media3.common.u0) w0.B.d(bundle);
                }
                throw new IllegalArgumentException(h0.b.h(i15, "Unknown RatingType: "));
            case 13:
                a5.a.e(bundle.getInt(androidx.media3.common.u0.f1801a, -1) == 2);
                int i16 = bundle.getInt(v0.f1808x, 5);
                float f11 = bundle.getFloat(v0.f1809y, -1.0f);
                return f11 == -1.0f ? new v0(i16) : new v0(i16, f11);
            case 14:
                a5.a.e(bundle.getInt(androidx.media3.common.u0.f1801a, -1) == 3);
                return bundle.getBoolean(w0.f1818x, false) ? new w0(bundle.getBoolean(w0.f1819y, false)) : new w0();
            case 15:
                int i17 = bundle.getInt(y0.D, 0);
                long j12 = bundle.getLong(y0.E, -9223372036854775807L);
                long j13 = bundle.getLong(y0.F, 0L);
                boolean z11 = bundle.getBoolean(y0.G, false);
                Bundle bundle9 = bundle.getBundle(y0.H);
                androidx.media3.common.b bVar = bundle9 != null ? (androidx.media3.common.b) androidx.media3.common.b.H.d(bundle9) : androidx.media3.common.b.f1565y;
                y0 y0Var = new y0();
                y0Var.h(null, null, i17, j12, j13, bVar, z11);
                return y0Var;
            case 16:
                Bundle bundle10 = bundle.getBundle(z0.Q);
                e0 e0Var = bundle10 != null ? (e0) e0.I.d(bundle10) : e0.B;
                long j14 = bundle.getLong(z0.R, -9223372036854775807L);
                long j15 = bundle.getLong(z0.S, -9223372036854775807L);
                long j16 = bundle.getLong(z0.T, -9223372036854775807L);
                boolean z12 = bundle.getBoolean(z0.U, false);
                boolean z13 = bundle.getBoolean(z0.V, false);
                Bundle bundle11 = bundle.getBundle(z0.W);
                z zVar2 = bundle11 != null ? (z) z.H.d(bundle11) : null;
                boolean z14 = bundle.getBoolean(z0.X, false);
                long j17 = bundle.getLong(z0.Y, 0L);
                long j18 = bundle.getLong(z0.Z, -9223372036854775807L);
                int i18 = bundle.getInt(z0.f1839a0, 0);
                int i19 = bundle.getInt(z0.f1840b0, 0);
                long j19 = bundle.getLong(z0.f1841c0, 0L);
                z0 z0Var = new z0();
                z0Var.b(z0.O, e0Var, null, j14, j15, j16, z12, z13, zVar2, j17, j18, i18, i19, j19);
                z0Var.H = z14;
                return z0Var;
            case 17:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(b1.f1571y);
                if (parcelableArrayList3 == null) {
                    oe.f0 f0Var2 = h0.f19336d;
                    u0VarP = u0.f19383x;
                } else {
                    u0VarP = a5.a.p(r.L0, parcelableArrayList3);
                }
                return new b1(bundle.getString(b1.B, ""), (r[]) u0VarP.toArray(new r[0]));
            default:
                c cVar = b1.D;
                Bundle bundle12 = bundle.getBundle(f1.f1649y);
                bundle12.getClass();
                b1 b1Var = (b1) cVar.d(bundle12);
                int[] intArray2 = bundle.getIntArray(f1.B);
                int i20 = b1Var.f1572a;
                int[] iArr2 = new int[i20];
                if (intArray2 == null) {
                    intArray2 = iArr2;
                }
                boolean[] booleanArray = bundle.getBooleanArray(f1.D);
                boolean[] zArr = new boolean[i20];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new f1(b1Var, bundle.getBoolean(f1.E, false), intArray2, booleanArray);
        }
    }

    @Override // bf.f
    public Object f(r2 r2Var) {
        switch (this.f288a) {
            case 20:
                return (ScheduledExecutorService) ExecutorsRegistrar.f5810a.get();
            case 21:
                return (ScheduledExecutorService) ExecutorsRegistrar.f5812c.get();
            case 22:
                return (ScheduledExecutorService) ExecutorsRegistrar.f5811b.get();
            default:
                bf.q qVar = ExecutorsRegistrar.f5810a;
                return cf.n.INSTANCE;
        }
    }

    @Override // eg.a
    public void k(eg.b bVar) {
    }
}
