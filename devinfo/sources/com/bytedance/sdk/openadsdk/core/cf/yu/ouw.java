package com.bytedance.sdk.openadsdk.core.cf.yu;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.core.rn;
import com.bytedance.adsdk.ugeno.core.ryl;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.bytedance.adsdk.ugeno.yu.le;
import com.bytedance.sdk.openadsdk.core.cf.ra.yu;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements ko, rn {

    /* renamed from: lh, reason: collision with root package name */
    private final Context f8172lh;
    InterfaceC0084ouw ouw;
    rn vt;
    private lh<View> yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.cf.yu.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0084ouw {
        void ouw(mwh mwhVar);
    }

    public ouw(Context context) {
        this.f8172lh = context;
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko
    public final void ouw(lh lhVar, le.ouw ouwVar) {
    }

    public final void ouw(JSONObject jSONObject, JSONObject jSONObject2, yu yuVar) throws JSONException {
        try {
            ryl rylVar = new ryl(this.f8172lh);
            lh<View> lhVarOuw = rylVar.ouw(jSONObject);
            this.yu = lhVarOuw;
            if (lhVarOuw == null) {
                if (yuVar != null) {
                    yuVar.ouw(3000, "ugen render fail");
                    return;
                }
                return;
            }
            T t10 = lhVarOuw.fkw;
            if (t10 != 0) {
                t10.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cf.yu.ouw.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
            rylVar.ouw(this);
            rylVar.ouw = this;
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.ryl.vt());
                    jSONObject2.put("os", "Android");
                } catch (JSONException unused) {
                }
            }
            rylVar.vt(jSONObject2);
            if (yuVar != null) {
                yuVar.ouw(this.yu);
            }
        } catch (Exception e2) {
            if (yuVar != null) {
                yuVar.ouw(3000, "ugen render fail exception is" + e2.getMessage());
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.rn
    public final void ouw(lh lhVar, MotionEvent motionEvent) {
        rn rnVar = this.vt;
        if (rnVar != null) {
            rnVar.ouw(lhVar, motionEvent);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko
    public final void ouw(mwh mwhVar, ko.ouw ouwVar) {
        InterfaceC0084ouw interfaceC0084ouw;
        mwh mwhVar2;
        if (mwhVar == null) {
            return;
        }
        int i4 = mwhVar.vt;
        if ((i4 == 1 || i4 == 4) && (interfaceC0084ouw = this.ouw) != null) {
            interfaceC0084ouw.ouw(mwhVar);
        }
        if (ouwVar == null || (mwhVar2 = mwhVar.yu) == null) {
            return;
        }
        ouwVar.ouw(mwhVar2);
    }
}
