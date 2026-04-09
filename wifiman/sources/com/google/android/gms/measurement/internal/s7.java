package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.C4333e;
import com.google.android.gms.internal.measurement.C4359g7;
import com.google.android.gms.internal.measurement.C4413n2;
import com.google.android.gms.internal.measurement.C4429p2;
import com.google.android.gms.internal.measurement.C4431p4;
import com.google.android.gms.internal.measurement.C4437q2;
import com.google.android.gms.internal.measurement.C4444r2;
import com.google.android.gms.internal.measurement.C4452s2;
import com.google.android.gms.internal.measurement.C4468u2;
import com.google.android.gms.internal.measurement.C4484w2;
import com.google.android.gms.internal.measurement.C4492x2;
import com.google.android.gms.internal.measurement.C4508z2;
import com.google.android.gms.internal.measurement.InterfaceC4357g5;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
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
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class s7 extends U6 {
    s7(C4833d7 c4833d7) {
        super(c4833d7);
    }

    static C4468u2 B(C4452s2 c4452s2, String str) {
        for (C4468u2 c4468u2 : c4452s2.U()) {
            if (c4468u2.V().equals(str)) {
                return c4468u2;
            }
        }
        return null;
    }

    static InterfaceC4357g5 C(InterfaceC4357g5 interfaceC4357g5, byte[] bArr) {
        C4431p4 c4431p4A = C4431p4.a();
        return c4431p4A != null ? interfaceC4357g5.q0(bArr, c4431p4A) : interfaceC4357g5.zza(bArr);
    }

    static Object F(C4452s2 c4452s2, String str, Object obj) {
        Object objB0 = b0(c4452s2, str);
        return objB0 == null ? obj : objB0;
    }

    private static String J(boolean z10, boolean z11, boolean z12) {
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

    static List K(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 << 6) + i11;
                if (i12 < bitSet.length()) {
                    if (bitSet.get(i12)) {
                        j10 |= 1 << i11;
                    }
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    private static void N(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static void O(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                N(builder, str3, string, set);
            }
        }
    }

    static void P(C4452s2.a aVar, String str, Object obj) {
        List listN = aVar.N();
        int i10 = 0;
        while (true) {
            if (i10 >= listN.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((C4468u2) listN.get(i10)).V())) {
                break;
            } else {
                i10++;
            }
        }
        C4468u2.a aVarB = C4468u2.T().B(str);
        if (obj instanceof Long) {
            aVarB.x(((Long) obj).longValue());
        } else if (obj instanceof String) {
            aVarB.E((String) obj);
        } else if (obj instanceof Double) {
            aVarB.w(((Double) obj).doubleValue());
        }
        if (i10 >= 0) {
            aVar.x(i10, aVarB);
        } else {
            aVar.B(aVarB);
        }
    }

    private static void S(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private final void T(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.R1 r12) {
        if (r12 == null) {
            return;
        }
        S(sb2, i10);
        sb2.append("filter {\n");
        if (r12.M()) {
            W(sb2, i10, "complement", Boolean.valueOf(r12.L()));
        }
        if (r12.O()) {
            W(sb2, i10, "param_name", c().f(r12.K()));
        }
        if (r12.P()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.U1 u1J = r12.J();
            if (u1J != null) {
                S(sb2, i11);
                sb2.append("string_filter");
                sb2.append(" {\n");
                if (u1J.N()) {
                    W(sb2, i11, "match_type", u1J.F().name());
                }
                if (u1J.M()) {
                    W(sb2, i11, "expression", u1J.I());
                }
                if (u1J.L()) {
                    W(sb2, i11, "case_sensitive", Boolean.valueOf(u1J.K()));
                }
                if (u1J.j() > 0) {
                    S(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str : u1J.J()) {
                        S(sb2, i10 + 3);
                        sb2.append(str);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                S(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (r12.N()) {
            U(sb2, i10 + 1, "number_filter", r12.I());
        }
        S(sb2, i10);
        sb2.append("}\n");
    }

    private static void U(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.S1 s12) {
        if (s12 == null) {
            return;
        }
        S(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (s12.M()) {
            W(sb2, i10, "comparison_type", s12.F().name());
        }
        if (s12.O()) {
            W(sb2, i10, "match_as_float", Boolean.valueOf(s12.L()));
        }
        if (s12.N()) {
            W(sb2, i10, "comparison_value", s12.I());
        }
        if (s12.Q()) {
            W(sb2, i10, "min_comparison_value", s12.K());
        }
        if (s12.P()) {
            W(sb2, i10, "max_comparison_value", s12.J());
        }
        S(sb2, i10);
        sb2.append("}\n");
    }

    private static void V(StringBuilder sb2, int i10, String str, C4508z2 c4508z2) {
        if (c4508z2 == null) {
            return;
        }
        S(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (c4508z2.H() != 0) {
            S(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : c4508z2.U()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (c4508z2.N() != 0) {
            S(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : c4508z2.W()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (c4508z2.j() != 0) {
            S(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (C4444r2 c4444r2 : c4508z2.T()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c4444r2.L() ? Integer.valueOf(c4444r2.j()) : null);
                sb2.append(":");
                sb2.append(c4444r2.K() ? Long.valueOf(c4444r2.H()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (c4508z2.K() != 0) {
            S(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.A2 a22 : c4508z2.V()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(a22.M() ? Integer.valueOf(a22.I()) : null);
                sb2.append(": [");
                Iterator it = a22.L().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        S(sb2, 3);
        sb2.append("}\n");
    }

    private static void W(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        S(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private final void X(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4468u2 c4468u2 = (C4468u2) it.next();
            if (c4468u2 != null) {
                S(sb2, i11);
                sb2.append("param {\n");
                W(sb2, i11, "name", c4468u2.b0() ? c().f(c4468u2.V()) : null);
                W(sb2, i11, "string_value", c4468u2.c0() ? c4468u2.W() : null);
                W(sb2, i11, "int_value", c4468u2.a0() ? Long.valueOf(c4468u2.R()) : null);
                W(sb2, i11, "double_value", c4468u2.Y() ? Double.valueOf(c4468u2.F()) : null);
                if (c4468u2.P() > 0) {
                    X(sb2, i11, c4468u2.X());
                }
                S(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    static boolean Z(L l10, t7 t7Var) {
        AbstractC7901p.l(l10);
        AbstractC7901p.l(t7Var);
        return (TextUtils.isEmpty(t7Var.f36749b) && TextUtils.isEmpty(t7Var.f36763p)) ? false : true;
    }

    static boolean a0(List list, int i10) {
        if (i10 < (list.size() << 6)) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    static Object b0(C4452s2 c4452s2, String str) {
        C4468u2 c4468u2B = B(c4452s2, str);
        if (c4468u2B == null) {
            return null;
        }
        if (c4468u2B.c0()) {
            return c4468u2B.W();
        }
        if (c4468u2B.a0()) {
            return Long.valueOf(c4468u2B.R());
        }
        if (c4468u2B.Y()) {
            return Double.valueOf(c4468u2B.F());
        }
        if (c4468u2B.P() > 0) {
            return e0(c4468u2B.X());
        }
        return null;
    }

    static boolean c0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static Bundle[] e0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4468u2 c4468u2 = (C4468u2) it.next();
            if (c4468u2 != null) {
                Bundle bundle = new Bundle();
                for (C4468u2 c4468u22 : c4468u2.X()) {
                    if (c4468u22.c0()) {
                        bundle.putString(c4468u22.V(), c4468u22.W());
                    } else if (c4468u22.a0()) {
                        bundle.putLong(c4468u22.V(), c4468u22.R());
                    } else if (c4468u22.Y()) {
                        bundle.putDouble(c4468u22.V(), c4468u22.F());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static int u(C4492x2.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i10 = 0; i10 < aVar.i0(); i10++) {
            if (str.equals(aVar.S0(i10).T())) {
                return i10;
            }
        }
        return -1;
    }

    static Bundle x(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4468u2 c4468u2 = (C4468u2) it.next();
            String strV = c4468u2.V();
            if (c4468u2.Y()) {
                bundle.putDouble(strV, c4468u2.F());
            } else if (c4468u2.Z()) {
                bundle.putFloat(strV, c4468u2.M());
            } else if (c4468u2.c0()) {
                bundle.putString(strV, c4468u2.W());
            } else if (c4468u2.a0()) {
                bundle.putLong(strV, c4468u2.R());
            }
        }
        return bundle;
    }

    private final Bundle y(Map map, boolean z10) {
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
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(y((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    final C4452s2 A(I i10) {
        C4452s2.a aVarA = C4452s2.R().A(i10.f35928e);
        Iterator it = i10.f35929f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C4468u2.a aVarB = C4468u2.T().B(str);
            Object objJ = i10.f35929f.j(str);
            AbstractC7901p.l(objJ);
            Q(aVarB, objJ);
            aVarA.B(aVarB);
        }
        if (!TextUtils.isEmpty(i10.f35926c) && i10.f35929f.j("_o") == null) {
            aVarA.D((C4468u2) ((com.google.android.gms.internal.measurement.D4) C4468u2.T().B("_o").E(i10.f35926c).p()));
        }
        return (C4452s2) ((com.google.android.gms.internal.measurement.D4) aVarA.p());
    }

    final L D(C4333e c4333e) {
        Object obj;
        Bundle bundleY = y(c4333e.g(), true);
        String string = (!bundleY.containsKey("_o") || (obj = bundleY.get("_o")) == null) ? "app" : obj.toString();
        String strB = AbstractC4898l4.b(c4333e.e());
        if (strB == null) {
            strB = c4333e.e();
        }
        return new L(strB, new K(bundleY), string, c4333e.a());
    }

    final K6 E(String str, C4492x2.a aVar, C4452s2.a aVar2, String str2) {
        int iIndexOf;
        if (!com.google.android.gms.internal.measurement.U6.a() || !a().D(str, N.f36052V0)) {
            return null;
        }
        long jA = zzb().a();
        String[] strArrSplit = a().B(str, N.f36116t0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        X6 x6P = p();
        String strP = x6P.n().P(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(x6P.a().B(str, N.f36098m0));
        if (TextUtils.isEmpty(strP)) {
            builder.authority(x6P.a().B(str, N.f36101n0));
        } else {
            builder.authority(strP + "." + x6P.a().B(str, N.f36101n0));
        }
        builder.path(x6P.a().B(str, N.f36104o0));
        N(builder, "gmp_app_id", aVar.r1(), setUnmodifiableSet);
        N(builder, "gmp_version", "118003", setUnmodifiableSet);
        String strO1 = aVar.o1();
        C4893l c4893lA = a();
        C4936q2 c4936q2 = N.f36058Y0;
        if (c4893lA.D(str, c4936q2) && n().Y(str)) {
            strO1 = "";
        }
        N(builder, "app_instance_id", strO1, setUnmodifiableSet);
        N(builder, "rdid", aVar.O(), setUnmodifiableSet);
        N(builder, "bundle_id", aVar.n1(), setUnmodifiableSet);
        String strM = aVar2.M();
        String strA = AbstractC4898l4.a(strM);
        if (!TextUtils.isEmpty(strA)) {
            strM = strA;
        }
        N(builder, "app_event_name", strM, setUnmodifiableSet);
        N(builder, "app_version", String.valueOf(aVar.V()), setUnmodifiableSet);
        String strS1 = aVar.s1();
        if (a().D(str, c4936q2) && n().c0(str) && !TextUtils.isEmpty(strS1) && (iIndexOf = strS1.indexOf(".")) != -1) {
            strS1 = strS1.substring(0, iIndexOf);
        }
        N(builder, "os_version", strS1, setUnmodifiableSet);
        N(builder, "timestamp", String.valueOf(aVar2.K()), setUnmodifiableSet);
        if (aVar.S()) {
            N(builder, "lat", "1", setUnmodifiableSet);
        }
        N(builder, "privacy_sandbox_version", String.valueOf(aVar.u()), setUnmodifiableSet);
        N(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        N(builder, "trigger_uri_timestamp", String.valueOf(jA), setUnmodifiableSet);
        N(builder, "request_uuid", str2, setUnmodifiableSet);
        List<C4468u2> listN = aVar2.N();
        Bundle bundle = new Bundle();
        for (C4468u2 c4468u2 : listN) {
            String strV = c4468u2.V();
            if (c4468u2.Y()) {
                bundle.putString(strV, String.valueOf(c4468u2.F()));
            } else if (c4468u2.Z()) {
                bundle.putString(strV, String.valueOf(c4468u2.M()));
            } else if (c4468u2.c0()) {
                bundle.putString(strV, c4468u2.W());
            } else if (c4468u2.a0()) {
                bundle.putString(strV, String.valueOf(c4468u2.R()));
            }
        }
        O(builder, a().B(str, N.f36114s0).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.C2> listQ = aVar.Q();
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.C2 c22 : listQ) {
            String strT = c22.T();
            if (c22.V()) {
                bundle2.putString(strT, String.valueOf(c22.F()));
            } else if (c22.W()) {
                bundle2.putString(strT, String.valueOf(c22.K()));
            } else if (c22.Z()) {
                bundle2.putString(strT, c22.U());
            } else if (c22.X()) {
                bundle2.putString(strT, String.valueOf(c22.O()));
            }
        }
        O(builder, a().B(str, N.f36112r0).split("\\|"), bundle2, setUnmodifiableSet);
        N(builder, "dma", aVar.R() ? "1" : "0", setUnmodifiableSet);
        if (!aVar.q1().isEmpty()) {
            N(builder, "dma_cps", aVar.q1(), setUnmodifiableSet);
        }
        if (a().p(N.f36063a1) && aVar.U()) {
            C4413n2 c4413n2Y0 = aVar.y0();
            if (!c4413n2Y0.a0().isEmpty()) {
                N(builder, "dl_gclid", c4413n2Y0.a0(), setUnmodifiableSet);
            }
            if (!c4413n2Y0.Z().isEmpty()) {
                N(builder, "dl_gbraid", c4413n2Y0.Z(), setUnmodifiableSet);
            }
            if (!c4413n2Y0.W().isEmpty()) {
                N(builder, "dl_gs", c4413n2Y0.W(), setUnmodifiableSet);
            }
            if (c4413n2Y0.F() > 0) {
                N(builder, "dl_ss_ts", String.valueOf(c4413n2Y0.F()), setUnmodifiableSet);
            }
            if (!c4413n2Y0.d0().isEmpty()) {
                N(builder, "mr_gclid", c4413n2Y0.d0(), setUnmodifiableSet);
            }
            if (!c4413n2Y0.c0().isEmpty()) {
                N(builder, "mr_gbraid", c4413n2Y0.c0(), setUnmodifiableSet);
            }
            if (!c4413n2Y0.b0().isEmpty()) {
                N(builder, "mr_gs", c4413n2Y0.b0(), setUnmodifiableSet);
            }
            if (c4413n2Y0.J() > 0) {
                N(builder, "mr_click_ts", String.valueOf(c4413n2Y0.J()), setUnmodifiableSet);
            }
        }
        return new K6(builder.build().toString(), jA, 1);
    }

    final String G(com.google.android.gms.internal.measurement.Q1 q12) {
        if (q12 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (q12.S()) {
            W(sb2, 0, "filter_id", Integer.valueOf(q12.I()));
        }
        W(sb2, 0, "event_name", c().c(q12.M()));
        String strJ = J(q12.O(), q12.P(), q12.Q());
        if (!strJ.isEmpty()) {
            W(sb2, 0, "filter_type", strJ);
        }
        if (q12.R()) {
            U(sb2, 1, "event_count_filter", q12.L());
        }
        if (q12.j() > 0) {
            sb2.append("  filters {\n");
            Iterator it = q12.N().iterator();
            while (it.hasNext()) {
                T(sb2, 2, (com.google.android.gms.internal.measurement.R1) it.next());
            }
        }
        S(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    final String H(com.google.android.gms.internal.measurement.T1 t12) {
        if (t12 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (t12.N()) {
            W(sb2, 0, "filter_id", Integer.valueOf(t12.j()));
        }
        W(sb2, 0, "property_name", c().g(t12.J()));
        String strJ = J(t12.K(), t12.L(), t12.M());
        if (!strJ.isEmpty()) {
            W(sb2, 0, "filter_type", strJ);
        }
        T(sb2, 1, t12.G());
        sb2.append("}\n");
        return sb2.toString();
    }

    final String I(C4484w2 c4484w2) {
        C4429p2 c4429p2C2;
        if (c4484w2 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (c4484w2.T()) {
            W(sb2, 0, "upload_subdomain", c4484w2.Q());
        }
        if (c4484w2.S()) {
            W(sb2, 0, "sgtm_join_id", c4484w2.P());
        }
        for (C4492x2 c4492x2 : c4484w2.R()) {
            if (c4492x2 != null) {
                S(sb2, 1);
                sb2.append("bundle {\n");
                if (c4492x2.V0()) {
                    W(sb2, 1, "protocol_version", Integer.valueOf(c4492x2.B1()));
                }
                if (C4359g7.a() && a().D(c4492x2.V(), N.f36032L0) && c4492x2.Y0()) {
                    W(sb2, 1, "session_stitching_token", c4492x2.k0());
                }
                W(sb2, 1, "platform", c4492x2.i0());
                if (c4492x2.Q0()) {
                    W(sb2, 1, "gmp_version", Long.valueOf(c4492x2.o2()));
                }
                if (c4492x2.l1()) {
                    W(sb2, 1, "uploading_gmp_version", Long.valueOf(c4492x2.A2()));
                }
                if (c4492x2.O0()) {
                    W(sb2, 1, "dynamite_version", Long.valueOf(c4492x2.h2()));
                }
                if (c4492x2.H0()) {
                    W(sb2, 1, "config_version", Long.valueOf(c4492x2.Z1()));
                }
                W(sb2, 1, "gmp_app_id", c4492x2.f0());
                W(sb2, 1, "admob_app_id", c4492x2.U());
                W(sb2, 1, "app_id", c4492x2.V());
                W(sb2, 1, "app_version", c4492x2.Y());
                if (c4492x2.D0()) {
                    W(sb2, 1, "app_version_major", Integer.valueOf(c4492x2.v0()));
                }
                W(sb2, 1, "firebase_instance_id", c4492x2.e0());
                if (c4492x2.M0()) {
                    W(sb2, 1, "dev_cert_hash", Long.valueOf(c4492x2.d2()));
                }
                W(sb2, 1, "app_store", c4492x2.X());
                if (c4492x2.k1()) {
                    W(sb2, 1, "upload_timestamp_millis", Long.valueOf(c4492x2.y2()));
                }
                if (c4492x2.a1()) {
                    W(sb2, 1, "start_timestamp_millis", Long.valueOf(c4492x2.u2()));
                }
                if (c4492x2.P0()) {
                    W(sb2, 1, "end_timestamp_millis", Long.valueOf(c4492x2.l2()));
                }
                if (c4492x2.U0()) {
                    W(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c4492x2.s2()));
                }
                if (c4492x2.T0()) {
                    W(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c4492x2.q2()));
                }
                W(sb2, 1, "app_instance_id", c4492x2.W());
                W(sb2, 1, "resettable_device_id", c4492x2.j0());
                W(sb2, 1, "ds_id", c4492x2.d0());
                if (c4492x2.S0()) {
                    W(sb2, 1, "limited_ad_tracking", Boolean.valueOf(c4492x2.s0()));
                }
                W(sb2, 1, "os_version", c4492x2.h0());
                W(sb2, 1, "device_model", c4492x2.c0());
                W(sb2, 1, "user_default_language", c4492x2.l0());
                if (c4492x2.c1()) {
                    W(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(c4492x2.L1()));
                }
                if (c4492x2.G0()) {
                    W(sb2, 1, "bundle_sequential_index", Integer.valueOf(c4492x2.d1()));
                }
                if (c4492x2.L0()) {
                    W(sb2, 1, "delivery_index", Integer.valueOf(c4492x2.o1()));
                }
                if (c4492x2.X0()) {
                    W(sb2, 1, "service_upload", Boolean.valueOf(c4492x2.t0()));
                }
                W(sb2, 1, "health_monitor", c4492x2.g0());
                if (c4492x2.W0()) {
                    W(sb2, 1, "retry_counter", Integer.valueOf(c4492x2.G1()));
                }
                if (c4492x2.J0()) {
                    W(sb2, 1, "consent_signals", c4492x2.a0());
                }
                if (c4492x2.R0()) {
                    W(sb2, 1, "is_dma_region", Boolean.valueOf(c4492x2.r0()));
                }
                if (c4492x2.K0()) {
                    W(sb2, 1, "core_platform_services", c4492x2.b0());
                }
                if (c4492x2.I0()) {
                    W(sb2, 1, "consent_diagnostics", c4492x2.Z());
                }
                if (c4492x2.b1()) {
                    W(sb2, 1, "target_os_version", Long.valueOf(c4492x2.w2()));
                }
                if (com.google.android.gms.internal.measurement.U6.a() && a().D(c4492x2.V(), N.f36052V0)) {
                    W(sb2, 1, "ad_services_version", Integer.valueOf(c4492x2.j()));
                    if (c4492x2.E0() && (c4429p2C2 = c4492x2.C2()) != null) {
                        S(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        W(sb2, 2, "eligible", Boolean.valueOf(c4429p2C2.Q()));
                        W(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c4429p2C2.T()));
                        W(sb2, 2, "pre_r", Boolean.valueOf(c4429p2C2.U()));
                        W(sb2, 2, "r_extensions_too_old", Boolean.valueOf(c4429p2C2.V()));
                        W(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(c4429p2C2.O()));
                        W(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(c4429p2C2.M()));
                        W(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(c4429p2C2.S()));
                        S(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (c4492x2.u0()) {
                    C4413n2 c4413n2B2 = c4492x2.B2();
                    S(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (c4413n2B2.g0()) {
                        W(sb2, 2, "deep_link_gclid", c4413n2B2.a0());
                    }
                    if (c4413n2B2.f0()) {
                        W(sb2, 2, "deep_link_gbraid", c4413n2B2.Z());
                    }
                    if (c4413n2B2.e0()) {
                        W(sb2, 2, "deep_link_gad_source", c4413n2B2.W());
                    }
                    if (c4413n2B2.h0()) {
                        W(sb2, 2, "deep_link_session_millis", Long.valueOf(c4413n2B2.F()));
                    }
                    if (c4413n2B2.l0()) {
                        W(sb2, 2, "market_referrer_gclid", c4413n2B2.d0());
                    }
                    if (c4413n2B2.k0()) {
                        W(sb2, 2, "market_referrer_gbraid", c4413n2B2.c0());
                    }
                    if (c4413n2B2.j0()) {
                        W(sb2, 2, "market_referrer_gad_source", c4413n2B2.b0());
                    }
                    if (c4413n2B2.i0()) {
                        W(sb2, 2, "market_referrer_click_millis", Long.valueOf(c4413n2B2.J()));
                    }
                    S(sb2, 2);
                    sb2.append("}\n");
                }
                if (c4492x2.F0()) {
                    W(sb2, 1, "batching_timestamp_millis", Long.valueOf(c4492x2.V1()));
                }
                if (c4492x2.Z0()) {
                    com.google.android.gms.internal.measurement.B2 b2F2 = c4492x2.F2();
                    S(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    W(sb2, 2, "upload_type", b2F2.L().name());
                    W(sb2, 2, "client_upload_eligibility", b2F2.J().name());
                    W(sb2, 2, "service_upload_eligibility", b2F2.K().name());
                    S(sb2, 2);
                    sb2.append("}\n");
                }
                List<com.google.android.gms.internal.measurement.C2> listO0 = c4492x2.o0();
                if (listO0 != null) {
                    for (com.google.android.gms.internal.measurement.C2 c22 : listO0) {
                        if (c22 != null) {
                            S(sb2, 2);
                            sb2.append("user_property {\n");
                            W(sb2, 2, "set_timestamp_millis", c22.Y() ? Long.valueOf(c22.Q()) : null);
                            W(sb2, 2, "name", c().g(c22.T()));
                            W(sb2, 2, "string_value", c22.U());
                            W(sb2, 2, "int_value", c22.X() ? Long.valueOf(c22.O()) : null);
                            W(sb2, 2, "double_value", c22.V() ? Double.valueOf(c22.F()) : null);
                            S(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C4437q2> listM0 = c4492x2.m0();
                c4492x2.V();
                if (listM0 != null) {
                    for (C4437q2 c4437q2 : listM0) {
                        if (c4437q2 != null) {
                            S(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (c4437q2.O()) {
                                W(sb2, 2, "audience_id", Integer.valueOf(c4437q2.j()));
                            }
                            if (c4437q2.P()) {
                                W(sb2, 2, "new_audience", Boolean.valueOf(c4437q2.N()));
                            }
                            V(sb2, 2, "current_data", c4437q2.L());
                            if (c4437q2.Q()) {
                                V(sb2, 2, "previous_data", c4437q2.M());
                            }
                            S(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C4452s2> listN0 = c4492x2.n0();
                if (listN0 != null) {
                    for (C4452s2 c4452s2 : listN0) {
                        if (c4452s2 != null) {
                            S(sb2, 2);
                            sb2.append("event {\n");
                            W(sb2, 2, "name", c().c(c4452s2.T()));
                            if (c4452s2.X()) {
                                W(sb2, 2, "timestamp_millis", Long.valueOf(c4452s2.Q()));
                            }
                            if (c4452s2.W()) {
                                W(sb2, 2, "previous_timestamp_millis", Long.valueOf(c4452s2.P()));
                            }
                            if (c4452s2.V()) {
                                W(sb2, 2, "count", Integer.valueOf(c4452s2.j()));
                            }
                            if (c4452s2.N() != 0) {
                                X(sb2, 2, c4452s2.U());
                            }
                            S(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                S(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    final List L(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                zzj().H().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    zzj().H().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
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

    final Map M(Bundle bundle, boolean z10) {
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
                                arrayList.add(M((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(M((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(M((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    final void Q(C4468u2.a aVar, Object obj) {
        AbstractC7901p.l(obj);
        aVar.H().F().D().G();
        if (obj instanceof String) {
            aVar.E((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.x(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.w(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            zzj().C().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C4468u2.a aVarT = C4468u2.T();
                for (String str : bundle.keySet()) {
                    C4468u2.a aVarB = C4468u2.T().B(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        aVarB.x(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        aVarB.E((String) obj2);
                    } else if (obj2 instanceof Double) {
                        aVarB.w(((Double) obj2).doubleValue());
                    }
                    aVarT.z(aVarB);
                }
                if (aVarT.u() > 0) {
                    arrayList.add((C4468u2) ((com.google.android.gms.internal.measurement.D4) aVarT.p()));
                }
            }
        }
        aVar.A(arrayList);
    }

    final void R(C2.a aVar, Object obj) {
        AbstractC7901p.l(obj);
        aVar.E().A().u();
        if (obj instanceof String) {
            aVar.D((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.x(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.w(((Double) obj).doubleValue());
        } else {
            zzj().C().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final boolean Y(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(zzb().a() - j10) > j11;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4893l a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ F b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ D2 c() {
        return super.c();
    }

    final byte[] d0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            zzj().C().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ X2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4915n5 f() {
        return super.f();
    }

    final byte[] f0(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i10 = gZIPInputStream.read(bArr2);
                if (i10 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i10);
            }
        } catch (IOException e10) {
            zzj().C().b("Failed to ungzip content", e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ x7 g() {
        return super.g();
    }

    final List g0() throws NumberFormatException {
        Map mapE = N.e(this.f36173b.zza());
        if (mapE == null || mapE.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) N.f36074e0.a(null)).intValue();
        for (Map.Entry entry : mapE.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int i10 = Integer.parseInt((String) entry.getValue());
                    if (i10 != 0) {
                        arrayList.add(Integer.valueOf(i10));
                        if (arrayList.size() >= iIntValue) {
                            zzj().H().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e10) {
                    zzj().H().b("Experiment ID NumberFormatException", e10);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ s7 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C7 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4933q m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4873i3 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4924o6 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ X6 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.U6
    protected final boolean t() {
        return false;
    }

    final long v(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return w(str.getBytes(Charset.forName("UTF-8")));
    }

    final long w(byte[] bArr) {
        AbstractC7901p.l(bArr);
        g().j();
        MessageDigest messageDigestP0 = x7.P0();
        if (messageDigestP0 != null) {
            return x7.x(messageDigestP0.digest(bArr));
        }
        zzj().C().a("Failed to get MD5");
        return 0L;
    }

    final Parcelable z(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzj().C().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.d zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4834e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ L2 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4952s3 zzl() {
        return super.zzl();
    }
}
