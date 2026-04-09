package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class zx0 implements z70 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f36771a;

    /* renamed from: b, reason: collision with root package name */
    private final zw1 f36772b;

    public /* synthetic */ zx0(C4072a3 c4072a3) {
        this(c4072a3, new zw1());
    }

    @Override // com.yandex.mobile.ads.impl.z70
    public Map<String, Object> a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h7 h7VarA = this.f36771a.a();
        if (h7VarA != null) {
            Map<String, String> mapH = h7VarA.h();
            if (mapH != null) {
                linkedHashMap.putAll(mapH);
            }
            String strB = h7VarA.b();
            if (strB != null) {
                linkedHashMap.put("age", strB);
            }
            List<String> listD = h7VarA.d();
            if (listD != null) {
                linkedHashMap.put("context_tags", listD);
            }
            String strE = h7VarA.e();
            if (strE != null) {
                linkedHashMap.put("gender", strE);
            }
            Boolean boolE = ew1.a.a().e();
            if (boolE != null) {
                linkedHashMap.put("age_restricted_user", boolE);
            }
            du1 du1VarA = ew1.a.a().a(context);
            Boolean boolU0 = du1VarA != null ? du1VarA.u0() : null;
            if (boolU0 != null) {
                linkedHashMap.put("user_consent", boolU0);
            }
        }
        ec ecVarA = this.f36771a.e().a();
        boolean zB = this.f36772b.b(context);
        if (ecVarA != null) {
            boolean zB2 = ecVarA.b();
            String strA = ecVarA.a();
            if (!zB && !zB2 && strA != null) {
                linkedHashMap.put("google_aid", strA);
            }
        }
        linkedHashMap.put("gms_available", Boolean.valueOf(this.f36771a.k().c()));
        linkedHashMap.put("sdk_version", "7.14.0");
        return linkedHashMap;
    }

    public zx0(C4072a3 adConfiguration, zw1 sensitiveModeChecker) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
        this.f36771a = adConfiguration;
        this.f36772b = sensitiveModeChecker;
    }

    @Override // com.yandex.mobile.ads.impl.z70
    public final Map<String, String> a(zy0 mediationNetwork) {
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        return mediationNetwork.i();
    }

    public final C4072a3 a() {
        return this.f36771a;
    }
}
