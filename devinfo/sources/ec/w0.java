package ec;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.f5;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.u5;
import com.google.android.gms.internal.measurement.z4;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w0 extends b4 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23107e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(g4 g4Var, int i4) {
        super(g4Var);
        this.f23107e = i4;
    }

    public static u F(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleG = G(bVar.f19617c, true);
        String string = (!bundleG.containsKey("_o") || (obj = bundleG.get("_o")) == null) ? "app" : obj.toString();
        String strG = b2.g(bVar.f19615a, b2.f22578a, b2.f22580c);
        if (strG == null) {
            strG = bVar.f19615a;
        }
        return new u(strG, new t(bundleG), string, bVar.f19616b);
    }

    public static Bundle G(Map map, boolean z3) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z3) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(G((Map) arrayList.get(i4), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void H(com.google.android.gms.internal.measurement.a3 a3Var, String str, Long l10) {
        List listI = a3Var.i();
        int i4 = 0;
        while (true) {
            if (i4 >= listI.size()) {
                i4 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.e3) listI.get(i4)).q())) {
                break;
            } else {
                i4++;
            }
        }
        com.google.android.gms.internal.measurement.d3 d3VarB = com.google.android.gms.internal.measurement.e3.B();
        d3VarB.i(str);
        d3VarB.k(l10.longValue());
        if (i4 < 0) {
            a3Var.m(d3VarB);
        } else {
            a3Var.b();
            ((com.google.android.gms.internal.measurement.b3) a3Var.f19740b).A(i4, (com.google.android.gms.internal.measurement.e3) d3VarB.f());
        }
    }

    public static final Bundle I(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) it.next();
            String strQ = e3Var.q();
            if (e3Var.x()) {
                bundle.putDouble(strQ, e3Var.y());
            } else if (e3Var.v()) {
                bundle.putFloat(strQ, e3Var.w());
            } else if (e3Var.r()) {
                bundle.putString(strQ, e3Var.s());
            } else if (e3Var.t()) {
                bundle.putLong(strQ, e3Var.u());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.e3 J(com.google.android.gms.internal.measurement.b3 b3Var, String str) {
        for (com.google.android.gms.internal.measurement.e3 e3Var : b3Var.p()) {
            if (e3Var.q().equals(str)) {
                return e3Var;
            }
        }
        return null;
    }

    public static final Serializable K(com.google.android.gms.internal.measurement.b3 b3Var, String str) {
        com.google.android.gms.internal.measurement.e3 e3VarJ = J(b3Var, str);
        if (e3VarJ == null) {
            return null;
        }
        return Q(e3VarJ);
    }

    public static final void N(int i4, StringBuilder sb2) {
        for (int i10 = 0; i10 < i4; i10++) {
            sb2.append("  ");
        }
    }

    public static final void O(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String P(boolean z3, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        if (z3) {
            sb2.append("Dynamic ");
        }
        if (z10) {
            sb2.append("Sequence ");
        }
        if (z11) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable Q(com.google.android.gms.internal.measurement.e3 e3Var) {
        if (e3Var.r()) {
            return e3Var.s();
        }
        if (e3Var.t()) {
            return Long.valueOf(e3Var.u());
        }
        if (e3Var.x()) {
            return Double.valueOf(e3Var.y());
        }
        if (e3Var.A() > 0) {
            return q0((m5) e3Var.z());
        }
        return null;
    }

    public static final void R(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                O(builder, str3, string, set);
            }
        }
    }

    public static final void S(StringBuilder sb2, String str, com.google.android.gms.internal.measurement.m3 m3Var) {
        if (m3Var == null) {
            return;
        }
        N(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (m3Var.s() != 0) {
            N(4, sb2);
            sb2.append("results: ");
            int i4 = 0;
            for (Long l10 : m3Var.r()) {
                int i10 = i4 + 1;
                if (i4 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i4 = i10;
            }
            sb2.append('\n');
        }
        if (m3Var.q() != 0) {
            N(4, sb2);
            sb2.append("status: ");
            int i11 = 0;
            for (Long l11 : m3Var.p()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (m3Var.u() != 0) {
            N(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (com.google.android.gms.internal.measurement.z2 z2Var : m3Var.t()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(z2Var.p() ? Integer.valueOf(z2Var.q()) : null);
                sb2.append(":");
                sb2.append(z2Var.r() ? Long.valueOf(z2Var.s()) : null);
                i13 = i14;
            }
            sb2.append("}\n");
        }
        if (m3Var.w() != 0) {
            N(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.o3 o3Var : m3Var.v()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(o3Var.p() ? Integer.valueOf(o3Var.q()) : null);
                sb2.append(": [");
                Iterator it = o3Var.r().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i17 = i18;
                }
                sb2.append("]");
                i15 = i16;
            }
            sb2.append("}\n");
        }
        N(3, sb2);
        sb2.append("}\n");
    }

    public static final void T(StringBuilder sb2, int i4, String str, Object obj) {
        if (obj == null) {
            return;
        }
        N(i4 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void U(StringBuilder sb2, int i4, String str, com.google.android.gms.internal.measurement.t1 t1Var) {
        if (t1Var == null) {
            return;
        }
        N(i4, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (t1Var.p()) {
            int iZ = t1Var.z();
            T(sb2, i4, "comparison_type", iZ != 1 ? iZ != 2 ? iZ != 3 ? iZ != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (t1Var.q()) {
            T(sb2, i4, "match_as_float", Boolean.valueOf(t1Var.r()));
        }
        if (t1Var.s()) {
            T(sb2, i4, "comparison_value", t1Var.t());
        }
        if (t1Var.u()) {
            T(sb2, i4, "min_comparison_value", t1Var.v());
        }
        if (t1Var.w()) {
            T(sb2, i4, "max_comparison_value", t1Var.x());
        }
        N(i4, sb2);
        sb2.append("}\n");
    }

    public static boolean h0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean i0(l5 l5Var, int i4) {
        if (i4 < ((u5) l5Var).f19951c * 64) {
            return ((1 << (i4 % 64)) & ((Long) ((u5) l5Var).get(i4 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList j0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            long j = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i4 * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static f5 o0(f5 f5Var, byte[] bArr) throws p5 {
        z4 z4VarB;
        z4 z4Var = z4.f20065a;
        if (z4Var == null) {
            synchronized (z4.class) {
                try {
                    z4VarB = z4.f20065a;
                    if (z4VarB == null) {
                        f6 f6Var = f6.f19741c;
                        z4VarB = d5.B();
                        z4.f20065a = z4VarB;
                    }
                } finally {
                }
            }
            z4Var = z4VarB;
        }
        if (z4Var != null) {
            f5Var.getClass();
            f5Var.h(bArr, bArr.length, z4Var);
            return f5Var;
        }
        f5Var.getClass();
        int length = bArr.length;
        z4 z4Var2 = z4.f20065a;
        f6 f6Var2 = f6.f19741c;
        f5Var.h(bArr, length, z4.f20066b);
        return f5Var;
    }

    public static int p0(com.google.android.gms.internal.measurement.i3 i3Var, String str) {
        for (int i4 = 0; i4 < ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).V1(); i4++) {
            if (str.equals(((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).W1(i4).r())) {
                return i4;
            }
        }
        return -1;
    }

    public static Bundle[] q0(m5 m5Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) it.next();
            if (e3Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.e3 e3Var2 : e3Var.z()) {
                    if (e3Var2.r()) {
                        bundle.putString(e3Var2.q(), e3Var2.s());
                    } else if (e3Var2.t()) {
                        bundle.putLong(e3Var2.q(), e3Var2.u());
                    } else if (e3Var2.x()) {
                        bundle.putDouble(e3Var2.q(), e3Var2.y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap r0(Bundle bundle, boolean z3) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z10 = obj instanceof Parcelable[];
            if (z10 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z3) {
                    ArrayList arrayList = new ArrayList();
                    if (z10) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(r0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            Object obj2 = arrayList2.get(i4);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(r0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(r0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    @Override // ec.b4
    public final void E() {
        int i4 = this.f23107e;
    }

    public void L(StringBuilder sb2, int i4, m5 m5Var) {
        if (m5Var == null) {
            return;
        }
        int i10 = i4 + 1;
        Iterator it = m5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) it.next();
            if (e3Var != null) {
                N(i10, sb2);
                sb2.append("param {\n");
                T(sb2, i10, "name", e3Var.p() ? ((o1) this.f218b).j.b(e3Var.q()) : null);
                T(sb2, i10, "string_value", e3Var.r() ? e3Var.s() : null);
                T(sb2, i10, "int_value", e3Var.t() ? Long.valueOf(e3Var.u()) : null);
                T(sb2, i10, "double_value", e3Var.x() ? Double.valueOf(e3Var.y()) : null);
                if (e3Var.A() > 0) {
                    L(sb2, i10, (m5) e3Var.z());
                }
                N(i10, sb2);
                sb2.append("}\n");
            }
        }
    }

    public void M(StringBuilder sb2, int i4, com.google.android.gms.internal.measurement.q1 q1Var) {
        String str;
        if (q1Var == null) {
            return;
        }
        N(i4, sb2);
        sb2.append("filter {\n");
        if (q1Var.t()) {
            T(sb2, i4, "complement", Boolean.valueOf(q1Var.u()));
        }
        if (q1Var.v()) {
            T(sb2, i4, "param_name", ((o1) this.f218b).j.b(q1Var.w()));
        }
        if (q1Var.p()) {
            int i10 = i4 + 1;
            com.google.android.gms.internal.measurement.w1 w1VarQ = q1Var.q();
            if (w1VarQ != null) {
                N(i10, sb2);
                sb2.append("string_filter {\n");
                if (w1VarQ.p()) {
                    switch (w1VarQ.x()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    T(sb2, i10, "match_type", str);
                }
                if (w1VarQ.q()) {
                    T(sb2, i10, "expression", w1VarQ.r());
                }
                if (w1VarQ.s()) {
                    T(sb2, i10, "case_sensitive", Boolean.valueOf(w1VarQ.t()));
                }
                if (w1VarQ.v() > 0) {
                    N(i4 + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : w1VarQ.u()) {
                        N(i4 + 3, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                N(i10, sb2);
                sb2.append("}\n");
            }
        }
        if (q1Var.r()) {
            U(sb2, i4 + 1, "number_filter", q1Var.s());
        }
        N(i4, sb2);
        sb2.append("}\n");
    }

    public boolean V() {
        C();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((o1) this.f218b).f22949a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void Z(com.google.android.gms.internal.measurement.r3 r3Var, Object obj) {
        pb.y.h(obj);
        r3Var.b();
        ((com.google.android.gms.internal.measurement.s3) r3Var.f19740b).E();
        r3Var.b();
        ((com.google.android.gms.internal.measurement.s3) r3Var.f19740b).G();
        r3Var.b();
        ((com.google.android.gms.internal.measurement.s3) r3Var.f19740b).I();
        if (obj instanceof String) {
            r3Var.b();
            ((com.google.android.gms.internal.measurement.s3) r3Var.f19740b).D((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            r3Var.b();
            ((com.google.android.gms.internal.measurement.s3) r3Var.f19740b).F(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            r3Var.b();
            ((com.google.android.gms.internal.measurement.s3) r3Var.f19740b).H(dDoubleValue);
        } else {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.g.e(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void a0(String str, c4 c4Var, com.google.android.gms.internal.measurement.h3 h3Var, u0 u0Var) {
        String str2;
        String str3 = c4Var.f22609a;
        o1 o1Var = (o1) this.f218b;
        B();
        C();
        try {
            URL url = new URI(str3).toURL();
            this.f23175c.j0();
            byte[] bArrA = h3Var.a();
            l1 l1Var = o1Var.g;
            o1.m(l1Var);
            Map map = c4Var.f22610b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                l1Var.N(new v0(this, str2, url, bArrA, map, u0Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                s0 s0Var = o1Var.f22954f;
                o1.m(s0Var);
                s0Var.g.f(s0.J(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    public void b0(com.google.android.gms.internal.measurement.d3 d3Var, Object obj) {
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).E();
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).G();
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).I();
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).L();
        if (obj instanceof String) {
            d3Var.j((String) obj);
            return;
        }
        if (obj instanceof Long) {
            d3Var.k(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            d3Var.b();
            ((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).H(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.g.e(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.d3 d3VarB = com.google.android.gms.internal.measurement.e3.B();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.d3 d3VarB2 = com.google.android.gms.internal.measurement.e3.B();
                    d3VarB2.i(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        d3VarB2.k(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        d3VarB2.j((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        d3VarB2.b();
                        ((com.google.android.gms.internal.measurement.e3) d3VarB2.f19740b).H(dDoubleValue2);
                    }
                    d3VarB.b();
                    ((com.google.android.gms.internal.measurement.e3) d3VarB.f19740b).J((com.google.android.gms.internal.measurement.e3) d3VarB2.f());
                }
                if (((com.google.android.gms.internal.measurement.e3) d3VarB.f19740b).A() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.e3) d3VarB.f());
                }
            }
        }
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).K(arrayList);
    }

    public v3 c0(String str, com.google.android.gms.internal.measurement.i3 i3Var, com.google.android.gms.internal.measurement.a3 a3Var, String str2) {
        int iIndexOf;
        p8.a();
        o1 o1Var = (o1) this.f218b;
        g gVar = o1Var.f22952d;
        if (!gVar.L(str, d0.Q0)) {
            return null;
        }
        o1Var.f22957k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = gVar.H(str, d0.f22669v0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        g4 g4Var = this.f23175c;
        d4 d4Var = g4Var.j;
        h1 h1Var = g4Var.f22731a;
        h1 h1Var2 = d4Var.f23175c.f22731a;
        g4.U(h1Var2);
        String strO = h1Var2.O(str);
        Uri.Builder builder = new Uri.Builder();
        g gVar2 = ((o1) d4Var.f218b).f22952d;
        builder.scheme(gVar2.H(str, d0.f22655o0));
        if (TextUtils.isEmpty(strO)) {
            builder.authority(gVar2.H(str, d0.f22657p0));
        } else {
            String strH = gVar2.H(str, d0.f22657p0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strO).length() + 1 + String.valueOf(strH).length());
            sb2.append(strO);
            sb2.append(".");
            sb2.append(strH);
            builder.authority(sb2.toString());
        }
        builder.path(gVar2.H(str, d0.f22659q0));
        O(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).E(), setUnmodifiableSet);
        gVar.G();
        O(builder, "gmp_version", String.valueOf(133005L), setUnmodifiableSet);
        String strY = ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).y();
        c0 c0Var = d0.T0;
        if (gVar.L(str, c0Var)) {
            g4.U(h1Var);
            if (h1Var.U(str)) {
                strY = "";
            }
        }
        O(builder, "app_instance_id", strY, setUnmodifiableSet);
        O(builder, "rdid", ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).v(), setUnmodifiableSet);
        O(builder, "bundle_id", i3Var.p(), setUnmodifiableSet);
        String strO2 = a3Var.o();
        String strG = b2.g(strO2, b2.f22580c, b2.f22578a);
        if (true != TextUtils.isEmpty(strG)) {
            strO2 = strG;
        }
        O(builder, "app_event_name", strO2, setUnmodifiableSet);
        O(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).K()), setUnmodifiableSet);
        String strI2 = ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).i2();
        if (gVar.L(str, c0Var)) {
            g4.U(h1Var);
            if (h1Var.T(str) && !TextUtils.isEmpty(strI2) && (iIndexOf = strI2.indexOf(".")) != -1) {
                strI2 = strI2.substring(0, iIndexOf);
            }
        }
        O(builder, "os_version", strI2, setUnmodifiableSet);
        O(builder, "timestamp", String.valueOf(a3Var.p()), setUnmodifiableSet);
        if (((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).x()) {
            O(builder, "lat", "1", setUnmodifiableSet);
        }
        O(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).G0()), setUnmodifiableSet);
        O(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        O(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        O(builder, "request_uuid", str2, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.e3> listI = a3Var.i();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.e3 e3Var : listI) {
            String strQ = e3Var.q();
            if (e3Var.x()) {
                bundle.putString(strQ, String.valueOf(e3Var.y()));
            } else if (e3Var.v()) {
                bundle.putString(strQ, String.valueOf(e3Var.w()));
            } else if (e3Var.r()) {
                bundle.putString(strQ, e3Var.s());
            } else if (e3Var.t()) {
                bundle.putString(strQ, String.valueOf(e3Var.u()));
            }
        }
        R(builder, gVar.H(str, d0.f22667u0).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.s3> listUnmodifiableList = DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).U1());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.s3 s3Var : listUnmodifiableList) {
            String strR = s3Var.r();
            if (s3Var.y()) {
                bundle2.putString(strR, String.valueOf(s3Var.z()));
            } else if (s3Var.w()) {
                bundle2.putString(strR, String.valueOf(s3Var.x()));
            } else if (s3Var.s()) {
                bundle2.putString(strR, s3Var.t());
            } else if (s3Var.u()) {
                bundle2.putString(strR, String.valueOf(s3Var.v()));
            }
        }
        R(builder, gVar.H(str, d0.f22665t0).split("\\|"), bundle2, setUnmodifiableSet);
        O(builder, "dma", true != ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).D0() ? "0" : "1", setUnmodifiableSet);
        if (!((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).F0().isEmpty()) {
            O(builder, "dma_cps", ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).F0(), setUnmodifiableSet);
        }
        if (((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).L0()) {
            com.google.android.gms.internal.measurement.o2 o2VarM0 = ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).M0();
            if (!o2VarM0.z().isEmpty()) {
                O(builder, "dl_gclid", o2VarM0.z(), setUnmodifiableSet);
            }
            if (!o2VarM0.B().isEmpty()) {
                O(builder, "dl_gbraid", o2VarM0.B(), setUnmodifiableSet);
            }
            if (!o2VarM0.D().isEmpty()) {
                O(builder, "dl_gs", o2VarM0.D(), setUnmodifiableSet);
            }
            if (o2VarM0.F() > 0) {
                O(builder, "dl_ss_ts", String.valueOf(o2VarM0.F()), setUnmodifiableSet);
            }
            if (!o2VarM0.H().isEmpty()) {
                O(builder, "mr_gclid", o2VarM0.H(), setUnmodifiableSet);
            }
            if (!o2VarM0.J().isEmpty()) {
                O(builder, "mr_gbraid", o2VarM0.J(), setUnmodifiableSet);
            }
            if (!o2VarM0.L().isEmpty()) {
                O(builder, "mr_gs", o2VarM0.L(), setUnmodifiableSet);
            }
            if (o2VarM0.N() > 0) {
                O(builder, "mr_click_ts", String.valueOf(o2VarM0.N()), setUnmodifiableSet);
            }
        }
        return new v3(1, jCurrentTimeMillis, builder.build().toString());
    }

    public com.google.android.gms.internal.measurement.b3 d0(q qVar) {
        com.google.android.gms.internal.measurement.a3 a3VarZ = com.google.android.gms.internal.measurement.b3.z();
        long j = qVar.f22996c;
        a3VarZ.b();
        ((com.google.android.gms.internal.measurement.b3) a3VarZ.f19740b).H(j);
        t tVar = (t) qVar.g;
        Objects.requireNonNull(tVar);
        Bundle bundle = tVar.f23067a;
        for (String str : bundle.keySet()) {
            com.google.android.gms.internal.measurement.d3 d3VarB = com.google.android.gms.internal.measurement.e3.B();
            d3VarB.i(str);
            Object obj = bundle.get(str);
            pb.y.h(obj);
            b0(d3VarB, obj);
            a3VarZ.m(d3VarB);
        }
        String str2 = (String) qVar.f22999f;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            com.google.android.gms.internal.measurement.d3 d3VarB2 = com.google.android.gms.internal.measurement.e3.B();
            d3VarB2.i("_o");
            d3VarB2.j(str2);
            a3VarZ.l((com.google.android.gms.internal.measurement.e3) d3VarB2.f());
        }
        return (com.google.android.gms.internal.measurement.b3) a3VarZ.f();
    }

    public String e0(com.google.android.gms.internal.measurement.h3 h3Var) {
        com.google.android.gms.internal.measurement.r2 r2VarI0;
        StringBuilder sbZ = d.h.z("\nbatch {\n");
        if (h3Var.u()) {
            T(sbZ, 0, "upload_subdomain", h3Var.v());
        }
        if (h3Var.s()) {
            T(sbZ, 0, "sgtm_join_id", h3Var.t());
        }
        for (com.google.android.gms.internal.measurement.j3 j3Var : h3Var.p()) {
            if (j3Var != null) {
                N(1, sbZ);
                sbZ.append("bundle {\n");
                if (j3Var.P()) {
                    T(sbZ, 1, "protocol_version", Integer.valueOf(j3Var.P0()));
                }
                o1 o1Var = (o1) this.f218b;
                g gVar = o1Var.f22952d;
                o0 o0Var = o1Var.j;
                if (gVar.L(j3Var.p(), d0.N0) && j3Var.v0()) {
                    T(sbZ, 1, "session_stitching_token", j3Var.w0());
                }
                T(sbZ, 1, "platform", j3Var.h2());
                if (j3Var.r()) {
                    T(sbZ, 1, "gmp_version", Long.valueOf(j3Var.s()));
                }
                if (j3Var.t()) {
                    T(sbZ, 1, "uploading_gmp_version", Long.valueOf(j3Var.u()));
                }
                if (j3Var.r0()) {
                    T(sbZ, 1, "dynamite_version", Long.valueOf(j3Var.s0()));
                }
                if (j3Var.L()) {
                    T(sbZ, 1, "config_version", Long.valueOf(j3Var.M()));
                }
                T(sbZ, 1, "gmp_app_id", j3Var.E());
                T(sbZ, 1, "app_id", j3Var.p());
                T(sbZ, 1, "app_version", j3Var.q());
                if (j3Var.J()) {
                    T(sbZ, 1, "app_version_major", Integer.valueOf(j3Var.K()));
                }
                T(sbZ, 1, "firebase_instance_id", j3Var.I());
                if (j3Var.z()) {
                    T(sbZ, 1, "dev_cert_hash", Long.valueOf(j3Var.A()));
                }
                T(sbZ, 1, "app_store", j3Var.n2());
                if (j3Var.X1()) {
                    T(sbZ, 1, "upload_timestamp_millis", Long.valueOf(j3Var.Y1()));
                }
                if (j3Var.Z1()) {
                    T(sbZ, 1, "start_timestamp_millis", Long.valueOf(j3Var.a2()));
                }
                if (j3Var.b2()) {
                    T(sbZ, 1, "end_timestamp_millis", Long.valueOf(j3Var.c2()));
                }
                if (j3Var.d2()) {
                    T(sbZ, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(j3Var.e2()));
                }
                if (j3Var.f2()) {
                    T(sbZ, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(j3Var.g2()));
                }
                T(sbZ, 1, "app_instance_id", j3Var.y());
                T(sbZ, 1, "resettable_device_id", j3Var.v());
                T(sbZ, 1, "ds_id", j3Var.O());
                if (j3Var.w()) {
                    T(sbZ, 1, "limited_ad_tracking", Boolean.valueOf(j3Var.x()));
                }
                T(sbZ, 1, "os_version", j3Var.i2());
                T(sbZ, 1, "device_model", j3Var.j2());
                T(sbZ, 1, "user_default_language", j3Var.k2());
                if (j3Var.l2()) {
                    T(sbZ, 1, "time_zone_offset_minutes", Integer.valueOf(j3Var.m2()));
                }
                if (j3Var.B()) {
                    T(sbZ, 1, "bundle_sequential_index", Integer.valueOf(j3Var.C()));
                }
                if (j3Var.J0()) {
                    T(sbZ, 1, "delivery_index", Integer.valueOf(j3Var.K0()));
                }
                if (j3Var.F()) {
                    T(sbZ, 1, "service_upload", Boolean.valueOf(j3Var.G()));
                }
                T(sbZ, 1, "health_monitor", j3Var.D());
                if (j3Var.p0()) {
                    T(sbZ, 1, "retry_counter", Integer.valueOf(j3Var.q0()));
                }
                if (j3Var.t0()) {
                    T(sbZ, 1, "consent_signals", j3Var.u0());
                }
                if (j3Var.C0()) {
                    T(sbZ, 1, "is_dma_region", Boolean.valueOf(j3Var.D0()));
                }
                if (j3Var.E0()) {
                    T(sbZ, 1, "core_platform_services", j3Var.F0());
                }
                if (j3Var.A0()) {
                    T(sbZ, 1, "consent_diagnostics", j3Var.B0());
                }
                if (j3Var.x0()) {
                    T(sbZ, 1, "target_os_version", Long.valueOf(j3Var.y0()));
                }
                p8.a();
                if (o1Var.f22952d.L(j3Var.p(), d0.Q0)) {
                    T(sbZ, 1, "ad_services_version", Integer.valueOf(j3Var.G0()));
                    if (j3Var.H0() && (r2VarI0 = j3Var.I0()) != null) {
                        N(2, sbZ);
                        sbZ.append("attribution_eligibility_status {\n");
                        T(sbZ, 2, "eligible", Boolean.valueOf(r2VarI0.p()));
                        T(sbZ, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(r2VarI0.q()));
                        T(sbZ, 2, "pre_r", Boolean.valueOf(r2VarI0.r()));
                        T(sbZ, 2, "r_extensions_too_old", Boolean.valueOf(r2VarI0.s()));
                        T(sbZ, 2, "adservices_extension_too_old", Boolean.valueOf(r2VarI0.t()));
                        T(sbZ, 2, "ad_storage_not_allowed", Boolean.valueOf(r2VarI0.u()));
                        T(sbZ, 2, "measurement_manager_disabled", Boolean.valueOf(r2VarI0.v()));
                        N(2, sbZ);
                        sbZ.append("}\n");
                    }
                }
                if (j3Var.L0()) {
                    com.google.android.gms.internal.measurement.o2 o2VarM0 = j3Var.M0();
                    N(2, sbZ);
                    sbZ.append("ad_campaign_info {\n");
                    if (o2VarM0.y()) {
                        T(sbZ, 2, "deep_link_gclid", o2VarM0.z());
                    }
                    if (o2VarM0.A()) {
                        T(sbZ, 2, "deep_link_gbraid", o2VarM0.B());
                    }
                    if (o2VarM0.C()) {
                        T(sbZ, 2, "deep_link_gad_source", o2VarM0.D());
                    }
                    if (o2VarM0.E()) {
                        T(sbZ, 2, "deep_link_session_millis", Long.valueOf(o2VarM0.F()));
                    }
                    if (o2VarM0.G()) {
                        T(sbZ, 2, "market_referrer_gclid", o2VarM0.H());
                    }
                    if (o2VarM0.I()) {
                        T(sbZ, 2, "market_referrer_gbraid", o2VarM0.J());
                    }
                    if (o2VarM0.K()) {
                        T(sbZ, 2, "market_referrer_gad_source", o2VarM0.L());
                    }
                    if (o2VarM0.M()) {
                        T(sbZ, 2, "market_referrer_click_millis", Long.valueOf(o2VarM0.N()));
                    }
                    N(2, sbZ);
                    sbZ.append("}\n");
                }
                if (j3Var.Q()) {
                    T(sbZ, 1, "batching_timestamp_millis", Long.valueOf(j3Var.R()));
                }
                if (j3Var.N0()) {
                    com.google.android.gms.internal.measurement.q3 q3VarO0 = j3Var.O0();
                    N(2, sbZ);
                    sbZ.append("sgtm_diagnostics {\n");
                    int iT = q3VarO0.t();
                    T(sbZ, 2, "upload_type", iT != 1 ? iT != 2 ? iT != 3 ? iT != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    T(sbZ, 2, "client_upload_eligibility", d7.z(q3VarO0.p()));
                    int iU = q3VarO0.u();
                    T(sbZ, 2, "service_upload_eligibility", iU != 1 ? iU != 2 ? iU != 3 ? iU != 4 ? iU != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    N(2, sbZ);
                    sbZ.append("}\n");
                }
                if (j3Var.S()) {
                    com.google.android.gms.internal.measurement.x2 x2VarT = j3Var.T();
                    N(2, sbZ);
                    sbZ.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.w2 w2Var : x2VarT.p()) {
                        N(3, sbZ);
                        sbZ.append("limited_data_modes {\n");
                        int iQ = w2Var.q();
                        T(sbZ, 3, "type", iQ != 1 ? iQ != 2 ? iQ != 3 ? iQ != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iR = w2Var.r();
                        T(sbZ, 3, "mode", iR != 1 ? iR != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        N(3, sbZ);
                        sbZ.append("}\n");
                    }
                    N(2, sbZ);
                    sbZ.append("}\n");
                }
                m5<com.google.android.gms.internal.measurement.s3> m5VarU1 = j3Var.U1();
                if (m5VarU1 != null) {
                    for (com.google.android.gms.internal.measurement.s3 s3Var : m5VarU1) {
                        if (s3Var != null) {
                            N(2, sbZ);
                            sbZ.append("user_property {\n");
                            T(sbZ, 2, "set_timestamp_millis", s3Var.p() ? Long.valueOf(s3Var.q()) : null);
                            T(sbZ, 2, "name", o0Var.c(s3Var.r()));
                            T(sbZ, 2, "string_value", s3Var.t());
                            T(sbZ, 2, "int_value", s3Var.u() ? Long.valueOf(s3Var.v()) : null);
                            T(sbZ, 2, "double_value", s3Var.y() ? Double.valueOf(s3Var.z()) : null);
                            N(2, sbZ);
                            sbZ.append("}\n");
                        }
                    }
                }
                m5<com.google.android.gms.internal.measurement.t2> m5VarH = j3Var.H();
                if (m5VarH != null) {
                    for (com.google.android.gms.internal.measurement.t2 t2Var : m5VarH) {
                        if (t2Var != null) {
                            N(2, sbZ);
                            sbZ.append("audience_membership {\n");
                            if (t2Var.p()) {
                                T(sbZ, 2, "audience_id", Integer.valueOf(t2Var.q()));
                            }
                            if (t2Var.u()) {
                                T(sbZ, 2, "new_audience", Boolean.valueOf(t2Var.v()));
                            }
                            S(sbZ, "current_data", t2Var.r());
                            if (t2Var.s()) {
                                S(sbZ, "previous_data", t2Var.t());
                            }
                            N(2, sbZ);
                            sbZ.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.b3> listP1 = j3Var.P1();
                if (listP1 != null) {
                    for (com.google.android.gms.internal.measurement.b3 b3Var : listP1) {
                        if (b3Var != null) {
                            N(2, sbZ);
                            sbZ.append("event {\n");
                            T(sbZ, 2, "name", o0Var.a(b3Var.s()));
                            if (b3Var.t()) {
                                T(sbZ, 2, "timestamp_millis", Long.valueOf(b3Var.u()));
                            }
                            if (b3Var.v()) {
                                T(sbZ, 2, "previous_timestamp_millis", Long.valueOf(b3Var.w()));
                            }
                            if (b3Var.x()) {
                                T(sbZ, 2, "count", Integer.valueOf(b3Var.y()));
                            }
                            if (b3Var.q() != 0) {
                                L(sbZ, 2, (m5) b3Var.p());
                            }
                            N(2, sbZ);
                            sbZ.append("}\n");
                        }
                    }
                }
                N(1, sbZ);
                sbZ.append("}\n");
            }
        }
        sbZ.append("} // End-of-batch\n");
        return sbZ.toString();
    }

    public String f0(com.google.android.gms.internal.measurement.v1 v1Var) {
        StringBuilder sbZ = d.h.z("\nproperty_filter {\n");
        if (v1Var.p()) {
            T(sbZ, 0, "filter_id", Integer.valueOf(v1Var.q()));
        }
        T(sbZ, 0, "property_name", ((o1) this.f218b).j.c(v1Var.r()));
        String strP = P(v1Var.t(), v1Var.u(), v1Var.w());
        if (!strP.isEmpty()) {
            T(sbZ, 0, "filter_type", strP);
        }
        M(sbZ, 1, v1Var.s());
        sbZ.append("}\n");
        return sbZ.toString();
    }

    public Parcelable g0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (qb.b unused) {
                s0 s0Var = ((o1) this.f218b).f22954f;
                o1.m(s0Var);
                s0Var.g.d("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    public List k0(l5 l5Var, List list) {
        int i4;
        o1 o1Var = (o1) this.f218b;
        ArrayList arrayList = new ArrayList(l5Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                s0 s0Var = o1Var.f22954f;
                o1.m(s0Var);
                s0Var.j.e(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    s0 s0Var2 = o1Var.f22954f;
                    o1.m(s0Var2);
                    s0Var2.j.f(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i4 = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i4);
    }

    public boolean l0(long j, long j8) {
        if (j == 0 || j8 <= 0) {
            return true;
        }
        ((o1) this.f218b).f22957k.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j8;
    }

    public long m0(byte[] bArr) throws NoSuchAlgorithmException {
        pb.y.h(bArr);
        o1 o1Var = (o1) this.f218b;
        l4 l4Var = o1Var.f22956i;
        o1.k(l4Var);
        l4Var.B();
        MessageDigest messageDigestS = l4.S();
        if (messageDigestS != null) {
            return l4.T(messageDigestS.digest(bArr));
        }
        s0 s0Var = o1Var.f22954f;
        o1.m(s0Var);
        s0Var.g.d("Failed to get MD5");
        return 0L;
    }

    public byte[] n0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.g.e(e2, "Failed to gzip content");
            throw e2;
        }
    }

    private final void W() {
    }

    private final void X() {
    }

    private final void Y() {
    }
}
