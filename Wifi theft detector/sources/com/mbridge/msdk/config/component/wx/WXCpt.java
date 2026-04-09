package com.mbridge.msdk.config.component.wx;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.m0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class WXCpt extends a {

    /* renamed from: h, reason: collision with root package name */
    final String f13792h = "400001";

    /* renamed from: i, reason: collision with root package name */
    final String f13793i = "400002";

    /* renamed from: j, reason: collision with root package name */
    final String f13794j = "400003";

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.wx.model.a f13795k;

    private void a(Context context, String str, String str2, String str3, String str4) {
        String message;
        int i10 = 0;
        boolean z10 = m0.F() == 1;
        boolean z11 = m0.D(context) == 1;
        if (!z10 || !z11) {
            a(0, "400002", "Wechat environment error.");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = str4;
            }
            Object objD = m0.d(str);
            Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
            Object objNewInstance = cls.newInstance();
            cls.getField("userName").set(objNewInstance, str2);
            cls.getField(MBridgeConstans.DYNAMIC_VIEW_WX_PATH).set(objNewInstance, str3);
            cls.getField("miniprogramType").set(objNewInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
            Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(objD, objNewInstance);
            message = "";
            i10 = 1;
        } catch (Throwable th) {
            message = th.getMessage();
        }
        a(i10, i10 != 0 ? "" : "400003", i10 == 0 ? message : "");
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f13092f = "907001";
        Object obj = map.get(c.a("144"));
        if (!(obj instanceof Map)) {
            a(0, "400001", "WXInfo is empty");
            return;
        }
        this.f13795k = new com.mbridge.msdk.config.component.wx.model.a((Map) obj);
        if (e() != null) {
            this.f13795k.a(e().getContext());
        } else {
            this.f13795k.a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.wx.model.a aVar = this.f13795k;
        if (aVar != null) {
            a(aVar.b(), this.f13795k.e(), this.f13795k.c(), this.f13795k.d(), this.f13795k.a());
        }
    }

    private void a(int i10, String str, String str2) {
        HashMap map = new HashMap();
        map.put(c.a("500"), String.valueOf(i10));
        if (i10 == 0) {
            map.put(c.a("code"), str);
            map.put(c.a("reason"), str2);
        }
        a(a("907002", map));
    }
}
