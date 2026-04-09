package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.ICommonParams;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private String f5252a = null;

    /* renamed from: b, reason: collision with root package name */
    private int f5253b = -1;

    public static com.apm.insight.nativecrash.b a(Context context) {
        return new com.apm.insight.nativecrash.b(context, new ICommonParams() { // from class: com.apm.insight.runtime.g.1
            @Override // com.apm.insight.ICommonParams
            public final Map<String, Object> getCommonParams() {
                return new HashMap();
            }

            @Override // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }
        });
    }

    public final boolean b() {
        return this.f5252a != null;
    }

    public final void a(String str) {
        this.f5252a = str;
        o.a().a(str);
    }

    public final String a() {
        if (!TextUtils.isEmpty(this.f5252a) && !MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(this.f5252a)) {
            return this.f5252a;
        }
        String strD = com.apm.insight.e.a().d();
        this.f5252a = strD;
        if (!TextUtils.isEmpty(strD) && !MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(this.f5252a)) {
            return this.f5252a;
        }
        String strB = o.a().b();
        this.f5252a = strB;
        return strB;
    }
}
