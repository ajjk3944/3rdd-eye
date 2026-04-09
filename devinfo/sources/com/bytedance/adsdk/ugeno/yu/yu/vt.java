package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends lh implements com.bytedance.adsdk.ugeno.ouw.vt {

    /* renamed from: cf, reason: collision with root package name */
    private String f7024cf;

    public vt(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        com.bytedance.adsdk.ugeno.vt.lh lhVarVt;
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVarCf;
        Map<String, String> map = this.fkw;
        if (map != null && map.size() > 0) {
            String str = this.fkw.get("name");
            this.f7024cf = this.fkw.get("state");
            if (!TextUtils.isEmpty(str) && (lhVarVt = com.bytedance.adsdk.ugeno.vt.lh.vt(this.vt)) != null && (ouwVarCf = lhVarVt.pno(str).cf(str)) != null) {
                ouwVarCf.f6914lh = this;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt
    public final void vt() {
        com.bytedance.adsdk.ugeno.yu.cf cfVar;
        if ((TextUtils.equals(this.f7024cf, "complete") || TextUtils.isEmpty(this.f7024cf)) && (cfVar = this.ouw) != null) {
            cfVar.ouw(this.f7018le, this.f7019lh.vt);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt
    public final void ouw() {
        com.bytedance.adsdk.ugeno.yu.cf cfVar;
        if ((TextUtils.equals(this.f7024cf, "start") || TextUtils.isEmpty(this.f7024cf)) && (cfVar = this.ouw) != null) {
            cfVar.ouw(this.f7018le, this.f7019lh.vt);
        }
    }
}
