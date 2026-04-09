package zc;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.g5;
import com.google.android.gms.internal.measurement.g6;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.v5;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class m0 extends k3 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f27007x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(p3 p3Var, int i10) {
        super(p3Var);
        this.f27007x = i10;
    }

    public static final com.google.android.gms.internal.measurement.c3 A1(com.google.android.gms.internal.measurement.z2 z2Var, String str) {
        for (com.google.android.gms.internal.measurement.c3 c3Var : z2Var.p()) {
            if (c3Var.q().equals(str)) {
                return c3Var;
            }
        }
        return null;
    }

    public static final Serializable B1(com.google.android.gms.internal.measurement.z2 z2Var, String str) {
        com.google.android.gms.internal.measurement.c3 c3VarA1 = A1(z2Var, str);
        if (c3VarA1 == null) {
            return null;
        }
        return H1(c3VarA1);
    }

    public static final void E1(int i10, StringBuilder sb2) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    public static final void F1(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String G1(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable H1(com.google.android.gms.internal.measurement.c3 c3Var) {
        if (c3Var.r()) {
            return c3Var.s();
        }
        if (c3Var.t()) {
            return Long.valueOf(c3Var.u());
        }
        if (c3Var.x()) {
            return Double.valueOf(c3Var.y());
        }
        if (c3Var.A() > 0) {
            return h2((n5) c3Var.z());
        }
        return null;
    }

    public static final void I1(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                F1(builder, str3, string, set);
            }
        }
    }

    public static final void J1(StringBuilder sb2, String str, com.google.android.gms.internal.measurement.k3 k3Var) {
        if (k3Var == null) {
            return;
        }
        E1(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (k3Var.s() != 0) {
            E1(4, sb2);
            sb2.append("results: ");
            int i10 = 0;
            for (Long l10 : k3Var.r()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i10 = i11;
            }
            sb2.append('\n');
        }
        if (k3Var.q() != 0) {
            E1(4, sb2);
            sb2.append("status: ");
            int i12 = 0;
            for (Long l11 : k3Var.p()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i12 = i13;
            }
            sb2.append('\n');
        }
        if (k3Var.u() != 0) {
            E1(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (com.google.android.gms.internal.measurement.x2 x2Var : k3Var.t()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                sb2.append(x2Var.p() ? Integer.valueOf(x2Var.q()) : null);
                sb2.append(":");
                sb2.append(x2Var.r() ? Long.valueOf(x2Var.s()) : null);
                i14 = i15;
            }
            sb2.append("}\n");
        }
        if (k3Var.w() != 0) {
            E1(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (com.google.android.gms.internal.measurement.m3 m3Var : k3Var.v()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb2.append(", ");
                }
                sb2.append(m3Var.p() ? Integer.valueOf(m3Var.q()) : null);
                sb2.append(": [");
                Iterator it = m3Var.r().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i18 = i19;
                }
                sb2.append("]");
                i16 = i17;
            }
            sb2.append("}\n");
        }
        E1(3, sb2);
        sb2.append("}\n");
    }

    public static final void K1(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        E1(i10 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void L1(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.r1 r1Var) {
        if (r1Var == null) {
            return;
        }
        E1(i10, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (r1Var.p()) {
            int iZ = r1Var.z();
            K1(sb2, i10, "comparison_type", iZ != 1 ? iZ != 2 ? iZ != 3 ? iZ != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (r1Var.q()) {
            K1(sb2, i10, "match_as_float", Boolean.valueOf(r1Var.r()));
        }
        if (r1Var.s()) {
            K1(sb2, i10, "comparison_value", r1Var.t());
        }
        if (r1Var.u()) {
            K1(sb2, i10, "min_comparison_value", r1Var.v());
        }
        if (r1Var.w()) {
            K1(sb2, i10, "max_comparison_value", r1Var.x());
        }
        E1(i10, sb2);
        sb2.append("}\n");
    }

    public static boolean Y1(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean Z1(m5 m5Var, int i10) {
        if (i10 < ((v5) m5Var).f5236g * 64) {
            return ((1 << (i10 % 64)) & ((Long) ((v5) m5Var).get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList a2(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static g5 f2(g5 g5Var, byte[] bArr) throws q5 {
        a5 a5VarZ;
        a5 a5Var = a5.f4906a;
        if (a5Var == null) {
            synchronized (a5.class) {
                try {
                    a5VarZ = a5.f4906a;
                    if (a5VarZ == null) {
                        g6 g6Var = g6.f5043c;
                        a5VarZ = e5.Z();
                        a5.f4906a = a5VarZ;
                    }
                } finally {
                }
            }
            a5Var = a5VarZ;
        }
        if (a5Var != null) {
            g5Var.getClass();
            g5Var.g(bArr, bArr.length, a5Var);
            return g5Var;
        }
        g5Var.getClass();
        int length = bArr.length;
        a5 a5Var2 = a5.f4906a;
        g6 g6Var2 = g6.f5043c;
        g5Var.g(bArr, length, a5.f4907b);
        return g5Var;
    }

    public static int g2(com.google.android.gms.internal.measurement.g3 g3Var, String str) {
        for (int i10 = 0; i10 < ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).V1(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).W1(i10).r())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle[] h2(n5 n5Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = n5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.c3 c3Var = (com.google.android.gms.internal.measurement.c3) it.next();
            if (c3Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.c3 c3Var2 : c3Var.z()) {
                    if (c3Var2.r()) {
                        bundle.putString(c3Var2.q(), c3Var2.s());
                    } else if (c3Var2.t()) {
                        bundle.putLong(c3Var2.q(), c3Var2.u());
                    } else if (c3Var2.x()) {
                        bundle.putDouble(c3Var2.q(), c3Var2.y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap i2(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(i2((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(i2((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(i2((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static zzbg w1(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleX1 = x1(bVar.f4914c, true);
        String string = (!bundleX1.containsKey("_o") || (obj = bundleX1.get("_o")) == null) ? "app" : obj.toString();
        String strG = p1.g(bVar.f4912a, p1.f27075a, p1.f27077c);
        if (strG == null) {
            strG = bVar.f4912a;
        }
        return new zzbg(strG, new zzbe(bundleX1), string, bVar.f4913b);
    }

    public static Bundle x1(Map map, boolean z10) {
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
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(x1((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void y1(com.google.android.gms.internal.measurement.y2 y2Var, String str, Long l10) {
        List listH = y2Var.h();
        int i10 = 0;
        while (true) {
            if (i10 >= listH.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.c3) listH.get(i10)).q())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.b3 b3VarB = com.google.android.gms.internal.measurement.c3.B();
        b3VarB.h(str);
        b3VarB.j(l10.longValue());
        if (i10 < 0) {
            y2Var.l(b3VarB);
        } else {
            y2Var.b();
            ((com.google.android.gms.internal.measurement.z2) y2Var.f5042d).A(i10, (com.google.android.gms.internal.measurement.c3) b3VarB.e());
        }
    }

    public static final Bundle z1(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.c3 c3Var = (com.google.android.gms.internal.measurement.c3) it.next();
            String strQ = c3Var.q();
            if (c3Var.x()) {
                bundle.putDouble(strQ, c3Var.y());
            } else if (c3Var.v()) {
                bundle.putFloat(strQ, c3Var.w());
            } else if (c3Var.r()) {
                bundle.putString(strQ, c3Var.s());
            } else if (c3Var.t()) {
                bundle.putLong(strQ, c3Var.u());
            }
        }
        return bundle;
    }

    public void C1(StringBuilder sb2, int i10, n5 n5Var) {
        if (n5Var == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = n5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.c3 c3Var = (com.google.android.gms.internal.measurement.c3) it.next();
            if (c3Var != null) {
                E1(i11, sb2);
                sb2.append("param {\n");
                K1(sb2, i11, "name", c3Var.p() ? ((c1) this.f1504d).F.b(c3Var.q()) : null);
                K1(sb2, i11, "string_value", c3Var.r() ? c3Var.s() : null);
                K1(sb2, i11, "int_value", c3Var.t() ? Long.valueOf(c3Var.u()) : null);
                K1(sb2, i11, "double_value", c3Var.x() ? Double.valueOf(c3Var.y()) : null);
                if (c3Var.A() > 0) {
                    C1(sb2, i11, (n5) c3Var.z());
                }
                E1(i11, sb2);
                sb2.append("}\n");
            }
        }
    }

    public void D1(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.o1 o1Var) {
        String str;
        if (o1Var == null) {
            return;
        }
        E1(i10, sb2);
        sb2.append("filter {\n");
        if (o1Var.t()) {
            K1(sb2, i10, "complement", Boolean.valueOf(o1Var.u()));
        }
        if (o1Var.v()) {
            K1(sb2, i10, "param_name", ((c1) this.f1504d).F.b(o1Var.w()));
        }
        if (o1Var.p()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.u1 u1VarQ = o1Var.q();
            if (u1VarQ != null) {
                E1(i11, sb2);
                sb2.append("string_filter {\n");
                if (u1VarQ.p()) {
                    switch (u1VarQ.x()) {
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
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            str = "PARTIAL";
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    K1(sb2, i11, "match_type", str);
                }
                if (u1VarQ.q()) {
                    K1(sb2, i11, "expression", u1VarQ.r());
                }
                if (u1VarQ.s()) {
                    K1(sb2, i11, "case_sensitive", Boolean.valueOf(u1VarQ.t()));
                }
                if (u1VarQ.v() > 0) {
                    E1(i10 + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : u1VarQ.u()) {
                        E1(i10 + 3, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                E1(i11, sb2);
                sb2.append("}\n");
            }
        }
        if (o1Var.r()) {
            L1(sb2, i10 + 1, "number_filter", o1Var.s());
        }
        E1(i10, sb2);
        sb2.append("}\n");
    }

    public boolean M1() {
        t1();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((c1) this.f1504d).f26884a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void Q1(com.google.android.gms.internal.measurement.q3 q3Var, Object obj) {
        cc.s.h(obj);
        q3Var.b();
        ((com.google.android.gms.internal.measurement.r3) q3Var.f5042d).E();
        q3Var.b();
        ((com.google.android.gms.internal.measurement.r3) q3Var.f5042d).G();
        q3Var.b();
        ((com.google.android.gms.internal.measurement.r3) q3Var.f5042d).I();
        if (obj instanceof String) {
            q3Var.b();
            ((com.google.android.gms.internal.measurement.r3) q3Var.f5042d).D((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            q3Var.b();
            ((com.google.android.gms.internal.measurement.r3) q3Var.f5042d).F(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            q3Var.b();
            ((com.google.android.gms.internal.measurement.r3) q3Var.f5042d).H(dDoubleValue);
        } else {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.B.c(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void R1(String str, l3 l3Var, com.google.android.gms.internal.measurement.f3 f3Var, k0 k0Var) {
        String str2;
        String str3 = l3Var.f26999a;
        c1 c1Var = (c1) this.f1504d;
        s1();
        t1();
        try {
            URL url = new URI(str3).toURL();
            this.f26981g.g0();
            byte[] bArrA = f3Var.a();
            a1 a1Var = c1Var.B;
            c1.g(a1Var);
            Map map = l3Var.f27000b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                a1Var.E1(new l0(this, str2, url, bArrA, map, k0Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                j0 j0Var = c1Var.f26889y;
                c1.g(j0Var);
                j0Var.B.d(j0.A1(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    public void S1(com.google.android.gms.internal.measurement.b3 b3Var, Object obj) {
        b3Var.b();
        ((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).E();
        b3Var.b();
        ((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).G();
        b3Var.b();
        ((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).I();
        b3Var.b();
        ((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).L();
        if (obj instanceof String) {
            b3Var.i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            b3Var.j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            b3Var.b();
            ((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).H(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.B.c(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.b3 b3VarB = com.google.android.gms.internal.measurement.c3.B();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.b3 b3VarB2 = com.google.android.gms.internal.measurement.c3.B();
                    b3VarB2.h(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        b3VarB2.j(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        b3VarB2.i((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        b3VarB2.b();
                        ((com.google.android.gms.internal.measurement.c3) b3VarB2.f5042d).H(dDoubleValue2);
                    }
                    b3VarB.b();
                    ((com.google.android.gms.internal.measurement.c3) b3VarB.f5042d).J((com.google.android.gms.internal.measurement.c3) b3VarB2.e());
                }
                if (((com.google.android.gms.internal.measurement.c3) b3VarB.f5042d).A() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.c3) b3VarB.e());
                }
            }
        }
        b3Var.b();
        ((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).K(arrayList);
    }

    public zzoh T1(String str, com.google.android.gms.internal.measurement.g3 g3Var, com.google.android.gms.internal.measurement.y2 y2Var, String str2) {
        int iIndexOf;
        q8.a();
        c1 c1Var = (c1) this.f1504d;
        f fVar = c1Var.f26887r;
        if (!fVar.C1(str, u.P0)) {
            return null;
        }
        c1Var.G.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = fVar.y1(str, u.f27211u0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        p3 p3Var = this.f26981g;
        m3 m3Var = p3Var.F;
        w0 w0Var = p3Var.f27091a;
        w0 w0Var2 = m3Var.f26981g.f27091a;
        p3.Q(w0Var2);
        String strF1 = w0Var2.F1(str);
        Uri.Builder builder = new Uri.Builder();
        f fVar2 = ((c1) m3Var.f1504d).f26887r;
        builder.scheme(fVar2.y1(str, u.f27197n0));
        if (TextUtils.isEmpty(strF1)) {
            builder.authority(fVar2.y1(str, u.f27199o0));
        } else {
            String strY1 = fVar2.y1(str, u.f27199o0);
            StringBuilder sb2 = new StringBuilder(c7.a.d(1, strF1) + String.valueOf(strY1).length());
            sb2.append(strF1);
            sb2.append(".");
            sb2.append(strY1);
            builder.authority(sb2.toString());
        }
        builder.path(fVar2.y1(str, u.f27201p0));
        F1(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).E(), setUnmodifiableSet);
        fVar.x1();
        F1(builder, "gmp_version", String.valueOf(133005L), setUnmodifiableSet);
        String strY = ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).y();
        t tVar = u.S0;
        if (fVar.C1(str, tVar)) {
            p3.Q(w0Var);
            if (w0Var.L1(str)) {
                strY = "";
            }
        }
        F1(builder, "app_instance_id", strY, setUnmodifiableSet);
        F1(builder, "rdid", ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).v(), setUnmodifiableSet);
        F1(builder, "bundle_id", g3Var.o(), setUnmodifiableSet);
        String strN = y2Var.n();
        String strG = p1.g(strN, p1.f27077c, p1.f27075a);
        if (true != TextUtils.isEmpty(strG)) {
            strN = strG;
        }
        F1(builder, "app_event_name", strN, setUnmodifiableSet);
        F1(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).K()), setUnmodifiableSet);
        String strI2 = ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).i2();
        if (fVar.C1(str, tVar)) {
            p3.Q(w0Var);
            if (w0Var.K1(str) && !TextUtils.isEmpty(strI2) && (iIndexOf = strI2.indexOf(".")) != -1) {
                strI2 = strI2.substring(0, iIndexOf);
            }
        }
        F1(builder, "os_version", strI2, setUnmodifiableSet);
        F1(builder, "timestamp", String.valueOf(y2Var.o()), setUnmodifiableSet);
        if (((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).x()) {
            F1(builder, "lat", "1", setUnmodifiableSet);
        }
        F1(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).G0()), setUnmodifiableSet);
        F1(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        F1(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        F1(builder, "request_uuid", str2, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.c3> listH = y2Var.h();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.c3 c3Var : listH) {
            String strQ = c3Var.q();
            if (c3Var.x()) {
                bundle.putString(strQ, String.valueOf(c3Var.y()));
            } else if (c3Var.v()) {
                bundle.putString(strQ, String.valueOf(c3Var.w()));
            } else if (c3Var.r()) {
                bundle.putString(strQ, c3Var.s());
            } else if (c3Var.t()) {
                bundle.putString(strQ, String.valueOf(c3Var.u()));
            }
        }
        I1(builder, fVar.y1(str, u.f27209t0).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.r3> listUnmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).U1());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.r3 r3Var : listUnmodifiableList) {
            String strR = r3Var.r();
            if (r3Var.y()) {
                bundle2.putString(strR, String.valueOf(r3Var.z()));
            } else if (r3Var.w()) {
                bundle2.putString(strR, String.valueOf(r3Var.x()));
            } else if (r3Var.s()) {
                bundle2.putString(strR, r3Var.t());
            } else if (r3Var.u()) {
                bundle2.putString(strR, String.valueOf(r3Var.v()));
            }
        }
        I1(builder, fVar.y1(str, u.f27207s0).split("\\|"), bundle2, setUnmodifiableSet);
        F1(builder, "dma", true != ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).D0() ? "0" : "1", setUnmodifiableSet);
        if (!((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).F0().isEmpty()) {
            F1(builder, "dma_cps", ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).F0(), setUnmodifiableSet);
        }
        if (((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).L0()) {
            com.google.android.gms.internal.measurement.m2 m2VarM0 = ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).M0();
            if (!m2VarM0.z().isEmpty()) {
                F1(builder, "dl_gclid", m2VarM0.z(), setUnmodifiableSet);
            }
            if (!m2VarM0.B().isEmpty()) {
                F1(builder, "dl_gbraid", m2VarM0.B(), setUnmodifiableSet);
            }
            if (!m2VarM0.D().isEmpty()) {
                F1(builder, "dl_gs", m2VarM0.D(), setUnmodifiableSet);
            }
            if (m2VarM0.F() > 0) {
                F1(builder, "dl_ss_ts", String.valueOf(m2VarM0.F()), setUnmodifiableSet);
            }
            if (!m2VarM0.H().isEmpty()) {
                F1(builder, "mr_gclid", m2VarM0.H(), setUnmodifiableSet);
            }
            if (!m2VarM0.J().isEmpty()) {
                F1(builder, "mr_gbraid", m2VarM0.J(), setUnmodifiableSet);
            }
            if (!m2VarM0.L().isEmpty()) {
                F1(builder, "mr_gs", m2VarM0.L(), setUnmodifiableSet);
            }
            if (m2VarM0.N() > 0) {
                F1(builder, "mr_click_ts", String.valueOf(m2VarM0.N()), setUnmodifiableSet);
            }
        }
        return new zzoh(builder.build().toString(), 1, jCurrentTimeMillis);
    }

    public com.google.android.gms.internal.measurement.z2 U1(bb.k kVar) {
        com.google.android.gms.internal.measurement.y2 y2VarZ = com.google.android.gms.internal.measurement.z2.z();
        long j = kVar.f2534c;
        y2VarZ.b();
        ((com.google.android.gms.internal.measurement.z2) y2VarZ.f5042d).H(j);
        zzbe zzbeVar = (zzbe) kVar.f2538g;
        Objects.requireNonNull(zzbeVar);
        Bundle bundle = zzbeVar.f5404a;
        for (String str : bundle.keySet()) {
            com.google.android.gms.internal.measurement.b3 b3VarB = com.google.android.gms.internal.measurement.c3.B();
            b3VarB.h(str);
            Object obj = bundle.get(str);
            cc.s.h(obj);
            S1(b3VarB, obj);
            y2VarZ.l(b3VarB);
        }
        String str2 = (String) kVar.f2537f;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            com.google.android.gms.internal.measurement.b3 b3VarB2 = com.google.android.gms.internal.measurement.c3.B();
            b3VarB2.h("_o");
            b3VarB2.i(str2);
            y2VarZ.k((com.google.android.gms.internal.measurement.c3) b3VarB2.e());
        }
        return (com.google.android.gms.internal.measurement.z2) y2VarZ.e();
    }

    public String V1(com.google.android.gms.internal.measurement.f3 f3Var) {
        com.google.android.gms.internal.measurement.p2 p2VarI0;
        StringBuilder sbT = c7.a.t("\nbatch {\n");
        if (f3Var.u()) {
            K1(sbT, 0, "upload_subdomain", f3Var.v());
        }
        if (f3Var.s()) {
            K1(sbT, 0, "sgtm_join_id", f3Var.t());
        }
        for (com.google.android.gms.internal.measurement.h3 h3Var : f3Var.p()) {
            if (h3Var != null) {
                E1(1, sbT);
                sbT.append("bundle {\n");
                if (h3Var.P()) {
                    K1(sbT, 1, "protocol_version", Integer.valueOf(h3Var.P0()));
                }
                c1 c1Var = (c1) this.f1504d;
                f fVar = c1Var.f26887r;
                f0 f0Var = c1Var.F;
                if (fVar.C1(h3Var.p(), u.M0) && h3Var.v0()) {
                    K1(sbT, 1, "session_stitching_token", h3Var.w0());
                }
                K1(sbT, 1, "platform", h3Var.h2());
                if (h3Var.r()) {
                    K1(sbT, 1, "gmp_version", Long.valueOf(h3Var.s()));
                }
                if (h3Var.t()) {
                    K1(sbT, 1, "uploading_gmp_version", Long.valueOf(h3Var.u()));
                }
                if (h3Var.r0()) {
                    K1(sbT, 1, "dynamite_version", Long.valueOf(h3Var.s0()));
                }
                if (h3Var.L()) {
                    K1(sbT, 1, "config_version", Long.valueOf(h3Var.M()));
                }
                K1(sbT, 1, "gmp_app_id", h3Var.E());
                K1(sbT, 1, "app_id", h3Var.p());
                K1(sbT, 1, "app_version", h3Var.q());
                if (h3Var.J()) {
                    K1(sbT, 1, "app_version_major", Integer.valueOf(h3Var.K()));
                }
                K1(sbT, 1, "firebase_instance_id", h3Var.I());
                if (h3Var.z()) {
                    K1(sbT, 1, "dev_cert_hash", Long.valueOf(h3Var.A()));
                }
                K1(sbT, 1, "app_store", h3Var.n2());
                if (h3Var.X1()) {
                    K1(sbT, 1, "upload_timestamp_millis", Long.valueOf(h3Var.Y1()));
                }
                if (h3Var.Z1()) {
                    K1(sbT, 1, "start_timestamp_millis", Long.valueOf(h3Var.a2()));
                }
                if (h3Var.b2()) {
                    K1(sbT, 1, "end_timestamp_millis", Long.valueOf(h3Var.c2()));
                }
                if (h3Var.d2()) {
                    K1(sbT, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(h3Var.e2()));
                }
                if (h3Var.f2()) {
                    K1(sbT, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(h3Var.g2()));
                }
                K1(sbT, 1, "app_instance_id", h3Var.y());
                K1(sbT, 1, "resettable_device_id", h3Var.v());
                K1(sbT, 1, "ds_id", h3Var.O());
                if (h3Var.w()) {
                    K1(sbT, 1, "limited_ad_tracking", Boolean.valueOf(h3Var.x()));
                }
                K1(sbT, 1, "os_version", h3Var.i2());
                K1(sbT, 1, "device_model", h3Var.j2());
                K1(sbT, 1, "user_default_language", h3Var.k2());
                if (h3Var.l2()) {
                    K1(sbT, 1, "time_zone_offset_minutes", Integer.valueOf(h3Var.m2()));
                }
                if (h3Var.B()) {
                    K1(sbT, 1, "bundle_sequential_index", Integer.valueOf(h3Var.C()));
                }
                if (h3Var.J0()) {
                    K1(sbT, 1, "delivery_index", Integer.valueOf(h3Var.K0()));
                }
                if (h3Var.F()) {
                    K1(sbT, 1, "service_upload", Boolean.valueOf(h3Var.G()));
                }
                K1(sbT, 1, "health_monitor", h3Var.D());
                if (h3Var.p0()) {
                    K1(sbT, 1, "retry_counter", Integer.valueOf(h3Var.q0()));
                }
                if (h3Var.t0()) {
                    K1(sbT, 1, "consent_signals", h3Var.u0());
                }
                if (h3Var.C0()) {
                    K1(sbT, 1, "is_dma_region", Boolean.valueOf(h3Var.D0()));
                }
                if (h3Var.E0()) {
                    K1(sbT, 1, "core_platform_services", h3Var.F0());
                }
                if (h3Var.A0()) {
                    K1(sbT, 1, "consent_diagnostics", h3Var.B0());
                }
                if (h3Var.x0()) {
                    K1(sbT, 1, "target_os_version", Long.valueOf(h3Var.y0()));
                }
                q8.a();
                if (c1Var.f26887r.C1(h3Var.p(), u.P0)) {
                    K1(sbT, 1, "ad_services_version", Integer.valueOf(h3Var.G0()));
                    if (h3Var.H0() && (p2VarI0 = h3Var.I0()) != null) {
                        E1(2, sbT);
                        sbT.append("attribution_eligibility_status {\n");
                        K1(sbT, 2, "eligible", Boolean.valueOf(p2VarI0.p()));
                        K1(sbT, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(p2VarI0.q()));
                        K1(sbT, 2, "pre_r", Boolean.valueOf(p2VarI0.r()));
                        K1(sbT, 2, "r_extensions_too_old", Boolean.valueOf(p2VarI0.s()));
                        K1(sbT, 2, "adservices_extension_too_old", Boolean.valueOf(p2VarI0.t()));
                        K1(sbT, 2, "ad_storage_not_allowed", Boolean.valueOf(p2VarI0.u()));
                        K1(sbT, 2, "measurement_manager_disabled", Boolean.valueOf(p2VarI0.v()));
                        E1(2, sbT);
                        sbT.append("}\n");
                    }
                }
                if (h3Var.L0()) {
                    com.google.android.gms.internal.measurement.m2 m2VarM0 = h3Var.M0();
                    E1(2, sbT);
                    sbT.append("ad_campaign_info {\n");
                    if (m2VarM0.y()) {
                        K1(sbT, 2, "deep_link_gclid", m2VarM0.z());
                    }
                    if (m2VarM0.A()) {
                        K1(sbT, 2, "deep_link_gbraid", m2VarM0.B());
                    }
                    if (m2VarM0.C()) {
                        K1(sbT, 2, "deep_link_gad_source", m2VarM0.D());
                    }
                    if (m2VarM0.E()) {
                        K1(sbT, 2, "deep_link_session_millis", Long.valueOf(m2VarM0.F()));
                    }
                    if (m2VarM0.G()) {
                        K1(sbT, 2, "market_referrer_gclid", m2VarM0.H());
                    }
                    if (m2VarM0.I()) {
                        K1(sbT, 2, "market_referrer_gbraid", m2VarM0.J());
                    }
                    if (m2VarM0.K()) {
                        K1(sbT, 2, "market_referrer_gad_source", m2VarM0.L());
                    }
                    if (m2VarM0.M()) {
                        K1(sbT, 2, "market_referrer_click_millis", Long.valueOf(m2VarM0.N()));
                    }
                    E1(2, sbT);
                    sbT.append("}\n");
                }
                if (h3Var.Q()) {
                    K1(sbT, 1, "batching_timestamp_millis", Long.valueOf(h3Var.R()));
                }
                if (h3Var.N0()) {
                    com.google.android.gms.internal.measurement.p3 p3VarO0 = h3Var.O0();
                    E1(2, sbT);
                    sbT.append("sgtm_diagnostics {\n");
                    int iT = p3VarO0.t();
                    K1(sbT, 2, "upload_type", iT != 1 ? iT != 2 ? iT != 3 ? iT != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    K1(sbT, 2, "client_upload_eligibility", p3VarO0.p().name());
                    int iU = p3VarO0.u();
                    K1(sbT, 2, "service_upload_eligibility", iU != 1 ? iU != 2 ? iU != 3 ? iU != 4 ? iU != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    E1(2, sbT);
                    sbT.append("}\n");
                }
                if (h3Var.S()) {
                    com.google.android.gms.internal.measurement.v2 v2VarT = h3Var.T();
                    E1(2, sbT);
                    sbT.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.u2 u2Var : v2VarT.p()) {
                        E1(3, sbT);
                        sbT.append("limited_data_modes {\n");
                        int iQ = u2Var.q();
                        K1(sbT, 3, "type", iQ != 1 ? iQ != 2 ? iQ != 3 ? iQ != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iR = u2Var.r();
                        K1(sbT, 3, "mode", iR != 1 ? iR != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        E1(3, sbT);
                        sbT.append("}\n");
                    }
                    E1(2, sbT);
                    sbT.append("}\n");
                }
                n5<com.google.android.gms.internal.measurement.r3> n5VarU1 = h3Var.U1();
                if (n5VarU1 != null) {
                    for (com.google.android.gms.internal.measurement.r3 r3Var : n5VarU1) {
                        if (r3Var != null) {
                            E1(2, sbT);
                            sbT.append("user_property {\n");
                            K1(sbT, 2, "set_timestamp_millis", r3Var.p() ? Long.valueOf(r3Var.q()) : null);
                            K1(sbT, 2, "name", f0Var.c(r3Var.r()));
                            K1(sbT, 2, "string_value", r3Var.t());
                            K1(sbT, 2, "int_value", r3Var.u() ? Long.valueOf(r3Var.v()) : null);
                            K1(sbT, 2, "double_value", r3Var.y() ? Double.valueOf(r3Var.z()) : null);
                            E1(2, sbT);
                            sbT.append("}\n");
                        }
                    }
                }
                n5<com.google.android.gms.internal.measurement.r2> n5VarH = h3Var.H();
                if (n5VarH != null) {
                    for (com.google.android.gms.internal.measurement.r2 r2Var : n5VarH) {
                        if (r2Var != null) {
                            E1(2, sbT);
                            sbT.append("audience_membership {\n");
                            if (r2Var.p()) {
                                K1(sbT, 2, "audience_id", Integer.valueOf(r2Var.q()));
                            }
                            if (r2Var.u()) {
                                K1(sbT, 2, "new_audience", Boolean.valueOf(r2Var.v()));
                            }
                            J1(sbT, "current_data", r2Var.r());
                            if (r2Var.s()) {
                                J1(sbT, "previous_data", r2Var.t());
                            }
                            E1(2, sbT);
                            sbT.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.z2> listP1 = h3Var.P1();
                if (listP1 != null) {
                    for (com.google.android.gms.internal.measurement.z2 z2Var : listP1) {
                        if (z2Var != null) {
                            E1(2, sbT);
                            sbT.append("event {\n");
                            K1(sbT, 2, "name", f0Var.a(z2Var.s()));
                            if (z2Var.t()) {
                                K1(sbT, 2, "timestamp_millis", Long.valueOf(z2Var.u()));
                            }
                            if (z2Var.v()) {
                                K1(sbT, 2, "previous_timestamp_millis", Long.valueOf(z2Var.w()));
                            }
                            if (z2Var.x()) {
                                K1(sbT, 2, "count", Integer.valueOf(z2Var.y()));
                            }
                            if (z2Var.q() != 0) {
                                C1(sbT, 2, (n5) z2Var.p());
                            }
                            E1(2, sbT);
                            sbT.append("}\n");
                        }
                    }
                }
                E1(1, sbT);
                sbT.append("}\n");
            }
        }
        sbT.append("} // End-of-batch\n");
        return sbT.toString();
    }

    public String W1(com.google.android.gms.internal.measurement.t1 t1Var) {
        StringBuilder sbT = c7.a.t("\nproperty_filter {\n");
        if (t1Var.p()) {
            K1(sbT, 0, "filter_id", Integer.valueOf(t1Var.q()));
        }
        K1(sbT, 0, "property_name", ((c1) this.f1504d).F.c(t1Var.r()));
        String strG1 = G1(t1Var.t(), t1Var.u(), t1Var.w());
        if (!strG1.isEmpty()) {
            K1(sbT, 0, "filter_type", strG1);
        }
        D1(sbT, 1, t1Var.s());
        sbT.append("}\n");
        return sbT.toString();
    }

    public Parcelable X1(byte[] bArr, Parcelable.Creator creator) {
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
            } catch (dc.a unused) {
                j0 j0Var = ((c1) this.f1504d).f26889y;
                c1.g(j0Var);
                j0Var.B.b("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    public List b2(m5 m5Var, List list) {
        int i10;
        c1 c1Var = (c1) this.f1504d;
        ArrayList arrayList = new ArrayList(m5Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                j0 j0Var = c1Var.f26889y;
                c1.g(j0Var);
                j0Var.F.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    j0 j0Var2 = c1Var.f26889y;
                    c1.g(j0Var2);
                    j0Var2.F.d(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public boolean c2(long j, long j7) {
        if (j == 0 || j7 <= 0) {
            return true;
        }
        ((c1) this.f1504d).G.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j7;
    }

    public long d2(byte[] bArr) {
        cc.s.h(bArr);
        c1 c1Var = (c1) this.f1504d;
        s3 s3Var = c1Var.E;
        c1.e(s3Var);
        s3Var.s1();
        MessageDigest messageDigestJ1 = s3.J1();
        if (messageDigestJ1 != null) {
            return s3.K1(messageDigestJ1.digest(bArr));
        }
        j0 j0Var = c1Var.f26889y;
        c1.g(j0Var);
        j0Var.B.b("Failed to get MD5");
        return 0L;
    }

    public byte[] e2(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.B.c(e4, "Failed to gzip content");
            throw e4;
        }
    }

    @Override // zc.k3
    public final void v1() {
        int i10 = this.f27007x;
    }

    private final void N1() {
    }

    private final void O1() {
    }

    private final void P1() {
    }
}
