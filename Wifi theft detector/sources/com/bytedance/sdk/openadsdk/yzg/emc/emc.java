package com.bytedance.sdk.openadsdk.yzg.emc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.bw.gbl;
import com.bytedance.sdk.component.bw.msw;
import com.bytedance.sdk.component.bw.ru;
import com.bytedance.sdk.component.bw.vk;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.ru.dg;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes.dex */
public class emc {

    /* renamed from: com.bytedance.sdk.openadsdk.yzg.emc.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0191emc {
        void emc(int i10, String str, Throwable th);

        void emc(String str, ypw ypwVar);
    }

    public void emc(com.bytedance.sdk.openadsdk.yzg.emc emcVar, final InterfaceC0191emc interfaceC0191emc, int i10, int i11, ImageView.ScaleType scaleType, String str, final int i12, rie rieVar) {
        ru ruVarEmc = dg.emc(emcVar.emc).emc(emcVar.ypw).emc(i10).ypw(i11).bw(vw.bw(aa.emc())).dg(vw.xq(aa.emc())).ypw(str).emc(scaleType).emc(!TextUtils.isEmpty(str));
        if (i12 <= 0 || Build.VERSION.SDK_INT < 26) {
            ruVarEmc.xq(1);
        } else {
            ruVarEmc.xq(2).emc(new msw() { // from class: com.bytedance.sdk.openadsdk.yzg.emc.emc.1
                @Override // com.bytedance.sdk.component.bw.msw
                public Bitmap emc(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.dg.emc.emc(aa.emc(), bitmap, i12);
                }
            });
        }
        ruVarEmc.emc(new com.bytedance.sdk.openadsdk.ru.ypw(rieVar, emcVar.emc, new vk() { // from class: com.bytedance.sdk.openadsdk.yzg.emc.emc.2
            @Override // com.bytedance.sdk.component.bw.vk
            public void emc(gbl gblVar) {
                emc.this.emc(gblVar, interfaceC0191emc);
            }

            @Override // com.bytedance.sdk.component.bw.vk
            public void emc(int i13, String str2, Throwable th) {
                emc.this.emc(i13, str2, th, interfaceC0191emc);
            }
        }));
    }

    public void emc(gbl gblVar, InterfaceC0191emc interfaceC0191emc) {
        if (interfaceC0191emc != null) {
            Object objYpw = gblVar.ypw();
            int iEmc = emc(gblVar);
            if (objYpw instanceof Drawable) {
                interfaceC0191emc.emc(gblVar.emc(), new ypw((Drawable) objYpw, iEmc));
                return;
            }
            if (objYpw instanceof byte[]) {
                interfaceC0191emc.emc(gblVar.emc(), new ypw((byte[]) objYpw, iEmc));
                return;
            }
            if (objYpw instanceof Bitmap) {
                interfaceC0191emc.emc(gblVar.emc(), new ypw((Bitmap) objYpw, gblVar.xq() instanceof Bitmap ? (Bitmap) gblVar.xq() : null, iEmc));
            } else {
                interfaceC0191emc.emc(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int emc(gbl gblVar) {
        Object obj;
        Map<String, String> mapDg = gblVar.dg();
        if (mapDg == null || (obj = mapDg.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    public void emc(int i10, String str, Throwable th, InterfaceC0191emc interfaceC0191emc) {
        if (interfaceC0191emc != null) {
            interfaceC0191emc.emc(i10, str, th);
        }
    }
}
