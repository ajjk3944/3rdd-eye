package com.bytedance.sdk.openadsdk.core.gbl.zz;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.gbl;
import com.bytedance.adsdk.ugeno.core.sup;
import com.bytedance.adsdk.ugeno.core.sz;
import com.bytedance.adsdk.ugeno.core.vk;
import com.bytedance.adsdk.ugeno.dg.ycc;
import com.bytedance.adsdk.ugeno.ypw.xq;
import com.bytedance.sdk.openadsdk.core.gbl.uym.dg;
import com.bytedance.sdk.openadsdk.utils.iyl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc implements cf, vk {
    private Context emc;
    private xq xq;
    private sup ypw;

    public emc(Context context) {
        this.emc = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, dg dgVar) {
        this.ypw = new sup(this.emc);
        emc();
        this.ypw.emc((cf) this);
        this.ypw.emc((vk) this);
        if (jSONObject == null || jSONObject2 == null) {
            if (dgVar != null) {
                dgVar.emc(133, "template or data is null");
                return;
            }
            return;
        }
        try {
            xq<View> xqVarEmc = this.ypw.emc(jSONObject, jSONObject2, jSONObject3);
            this.xq = xqVarEmc;
            if (xqVarEmc != null) {
                dgVar.emc(xqVarEmc);
            } else if (dgVar != null) {
                dgVar.emc(3000, "ugen render fail");
            }
        } catch (NoClassDefFoundError unused) {
            if (dgVar != null) {
                dgVar.emc(138, "ugen render yoga error");
            }
        } catch (UnsatisfiedLinkError unused2) {
            if (dgVar != null) {
                dgVar.emc(139, "ugen render yoga error");
            }
        } catch (Throwable unused3) {
            if (dgVar != null) {
                dgVar.emc(138, "ugen render error");
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.cf
    public void emc(sz szVar, cf.ypw ypwVar, cf.emc emcVar) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.vk
    public void emc(xq xqVar, MotionEvent motionEvent) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.cf
    public void emc(xq xqVar, String str, ycc.emc emcVar) {
    }

    public void emc(final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final dg dgVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ypw(jSONObject, jSONObject2, jSONObject3, dgVar);
        } else {
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbl.zz.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    emc.this.ypw(jSONObject, jSONObject2, jSONObject3, dgVar);
                }
            });
        }
    }

    private void emc() {
        gbl gblVar = new gbl();
        gblVar.emc(this.emc);
        this.ypw.emc("page", gblVar);
    }
}
