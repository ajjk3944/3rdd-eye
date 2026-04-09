package com.bytedance.sdk.openadsdk.core.cf.bly;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.core.rn;
import com.bytedance.adsdk.ugeno.core.ryl;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.bytedance.adsdk.ugeno.yu.le;
import com.bytedance.sdk.openadsdk.core.cf.ra.yu;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements ko, rn {

    /* renamed from: lh, reason: collision with root package name */
    private lh f8116lh;
    private Context ouw;
    private ryl vt;

    public ouw(Context context) {
        this.ouw = context;
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko
    public final void ouw(mwh mwhVar, ko.ouw ouwVar) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.rn
    public final void ouw(lh lhVar, MotionEvent motionEvent) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko
    public final void ouw(lh lhVar, le.ouw ouwVar) {
    }

    public final void ouw(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, yu yuVar) {
        this.vt = new ryl(this.ouw);
        ouw();
        this.vt.ouw(this);
        ryl rylVar = this.vt;
        rylVar.ouw = this;
        if (jSONObject == null || jSONObject2 == null) {
            if (yuVar != null) {
                yuVar.ouw(133, "template or data is null");
                return;
            }
            return;
        }
        try {
            lh<View> lhVarOuw = rylVar.ouw(jSONObject, jSONObject2, jSONObject3);
            this.f8116lh = lhVarOuw;
            if (lhVarOuw != null) {
                yuVar.ouw(lhVarOuw);
            } else if (yuVar != null) {
                yuVar.ouw(3000, "ugen render fail");
            }
        } catch (NoClassDefFoundError unused) {
            if (yuVar != null) {
                yuVar.ouw(138, "ugen render yoga error");
            }
        } catch (UnsatisfiedLinkError unused2) {
            if (yuVar != null) {
                yuVar.ouw(139, "ugen render yoga error");
            }
        } catch (Throwable unused3) {
            if (yuVar != null) {
                yuVar.ouw(138, "ugen render error");
            }
        }
    }

    private void ouw() {
        cf cfVar = new cf();
        cfVar.ouw = this.ouw;
        this.vt.ouw("page", cfVar);
    }
}
