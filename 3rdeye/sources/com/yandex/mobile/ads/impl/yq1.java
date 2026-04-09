package com.yandex.mobile.ads.impl;

import c9.C2092m;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yq1 {

    /* renamed from: a, reason: collision with root package name */
    private final er1 f35959a;

    /* renamed from: b, reason: collision with root package name */
    private final s61 f35960b;

    public /* synthetic */ yq1() {
        this(new er1(), new s61());
    }

    public final jp1 a(a8 a8Var, C4072a3 adConfiguration, p61 p61Var) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        jp1 jp1VarA = a(a8Var, adConfiguration);
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        if (p61Var != null) {
            List<String> listA = this.f35960b.a(p61Var);
            if (!listA.isEmpty()) {
                jp1Var.a(listA, "image_sizes");
            }
            this.f35960b.getClass();
            List<w31> listE = p61Var.e();
            ArrayList arrayList = new ArrayList(C2092m.T(listE, 10));
            Iterator<T> it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(((w31) it.next()).g().a());
            }
            if (!arrayList.isEmpty()) {
                jp1Var.a(arrayList, "native_ad_types");
            }
            this.f35960b.getClass();
            List<w31> listE2 = p61Var.e();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = listE2.iterator();
            while (it2.hasNext()) {
                String strA = ((w31) it2.next()).a();
                if (strA != null) {
                    arrayList2.add(strA);
                }
            }
            if (!arrayList2.isEmpty()) {
                jp1Var.a(arrayList2, "ad_ids");
            }
        }
        return kp1.a(jp1VarA, jp1Var);
    }

    public final jp1 b(a8<?> a8Var, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        jp1 jp1VarA = a(a8Var, adConfiguration);
        jp1VarA.b(a8Var != null ? a8Var.d() : null, "ad_id");
        return jp1VarA;
    }

    public yq1(er1 responseTypeProvider, s61 nativeAdResponseDataProvider) {
        kotlin.jvm.internal.l.f(responseTypeProvider, "responseTypeProvider");
        kotlin.jvm.internal.l.f(nativeAdResponseDataProvider, "nativeAdResponseDataProvider");
        this.f35959a = responseTypeProvider;
        this.f35960b = nativeAdResponseDataProvider;
    }

    public final jp1 a(a8<?> a8Var, p61 p61Var, C4072a3 adConfiguration, w31 w31Var) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(w31Var, "native");
        jp1 jp1VarA = a(a8Var, adConfiguration);
        if (p61Var != null) {
            List<String> listA = this.f35960b.a(p61Var);
            if (!listA.isEmpty()) {
                jp1VarA.a(listA, "image_sizes");
            }
        }
        jp1VarA.b(w31Var.a(), "ad_id");
        return jp1VarA;
    }

    private final jp1 a(a8<?> a8Var, C4072a3 c4072a3) {
        String strC;
        String strC2;
        String strB;
        String str;
        Map<String, ? extends Object> mapS;
        ns nsVarN;
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        if (a8Var == null || !a8Var.O()) {
            jp1Var.b(a8Var != null ? a8Var.o() : null, "ad_type_format");
            jp1Var.b(a8Var != null ? a8Var.H() : null, "product_type");
        }
        if (a8Var == null || (strC = a8Var.p()) == null) {
            strC = c4072a3.c();
        }
        jp1Var.b(strC, "block_id");
        if (a8Var == null || (strC2 = a8Var.p()) == null) {
            strC2 = c4072a3.c();
        }
        jp1Var.b(strC2, Constants.ADMON_AD_UNIT_ID);
        jp1Var.b(a8Var != null ? a8Var.m() : null, "ad_source");
        if (a8Var == null || (nsVarN = a8Var.n()) == null || (strB = nsVarN.b()) == null) {
            strB = c4072a3.b().b();
        }
        jp1Var.b(strB, Constants.ADMON_AD_TYPE);
        jp1Var.a(a8Var != null ? a8Var.w() : null, "design");
        jp1Var.a(a8Var != null ? a8Var.b() : null);
        jp1Var.a(a8Var != null ? a8Var.L() : null, "server_log_id");
        this.f35959a.getClass();
        if ((a8Var != null ? a8Var.D() : null) != null) {
            str = "mediation";
        } else {
            if ((a8Var != null ? a8Var.I() : null) != null) {
                str = "ad";
            } else {
                str = "empty";
            }
        }
        jp1Var.b(str, "response_type");
        if (a8Var != null && (mapS = a8Var.s()) != null) {
            jp1Var.a(mapS);
        }
        jp1Var.a(a8Var != null ? a8Var.a() : null);
        return jp1Var;
    }
}
