package com.bytedance.sdk.openadsdk.core.gbl.dg;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.sup;
import com.bytedance.adsdk.ugeno.core.sz;
import com.bytedance.adsdk.ugeno.core.vk;
import com.bytedance.adsdk.ugeno.dg.ycc;
import com.bytedance.adsdk.ugeno.ypw.xq;
import com.bytedance.sdk.openadsdk.core.gbl.uym.dg;
import com.bytedance.sdk.openadsdk.utils.iyl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc implements cf, vk {
    private vk dg;
    private final Context emc;
    private InterfaceC0056emc xq;
    private xq<View> ypw;

    /* renamed from: com.bytedance.sdk.openadsdk.core.gbl.dg.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0056emc {
        void emc(sz szVar);
    }

    public emc(Context context) {
        this.emc = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(JSONObject jSONObject, JSONObject jSONObject2, dg dgVar) throws JSONException {
        try {
            sup supVar = new sup(this.emc);
            xq<View> xqVarEmc = supVar.emc(jSONObject);
            this.ypw = xqVarEmc;
            if (xqVarEmc == null) {
                if (dgVar != null) {
                    dgVar.emc(3000, "ugen render fail");
                    return;
                }
                return;
            }
            View viewGbl = xqVarEmc.gbl();
            if (viewGbl != null) {
                viewGbl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.gbl.dg.emc.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            supVar.emc((cf) this);
            supVar.emc((vk) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.sup.ypw());
                    jSONObject2.put("os", "Android");
                } catch (JSONException unused) {
                }
            }
            supVar.ypw(jSONObject2);
            if (dgVar != null) {
                dgVar.emc(this.ypw);
            }
        } catch (Exception e6) {
            if (dgVar != null) {
                dgVar.emc(3000, "ugen render fail exception is" + e6.getMessage());
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.cf
    public void emc(xq xqVar, String str, ycc.emc emcVar) {
    }

    public void emc(final JSONObject jSONObject, final JSONObject jSONObject2, final dg dgVar) throws JSONException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ypw(jSONObject, jSONObject2, dgVar);
        } else {
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbl.dg.emc.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    emc.this.ypw(jSONObject, jSONObject2, dgVar);
                }
            });
        }
    }

    public void emc(InterfaceC0056emc interfaceC0056emc) {
        this.xq = interfaceC0056emc;
    }

    public void emc(vk vkVar) {
        this.dg = vkVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.cf
    public void emc(sz szVar, cf.ypw ypwVar, cf.emc emcVar) {
        InterfaceC0056emc interfaceC0056emc;
        if (szVar == null) {
            return;
        }
        if ((szVar.ypw() == 1 || szVar.ypw() == 4) && (interfaceC0056emc = this.xq) != null) {
            interfaceC0056emc.emc(szVar);
        }
        if (ypwVar == null || szVar.dg() == null) {
            return;
        }
        ypwVar.emc(szVar.dg());
    }

    @Override // com.bytedance.adsdk.ugeno.core.vk
    public void emc(xq xqVar, MotionEvent motionEvent) {
        vk vkVar = this.dg;
        if (vkVar != null) {
            vkVar.emc(xqVar, motionEvent);
        }
    }
}
