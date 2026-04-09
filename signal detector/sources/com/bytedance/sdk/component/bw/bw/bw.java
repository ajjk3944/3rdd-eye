package com.bytedance.sdk.component.bw.bw;

import android.graphics.Bitmap;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* loaded from: classes.dex */
public class bw extends emc {
    private byte[] emc;
    private com.bytedance.sdk.component.bw.ycc ypw;

    public bw(byte[] bArr, com.bytedance.sdk.component.bw.ycc yccVar) {
        this.emc = bArr;
        this.ypw = yccVar;
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public void emc(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        com.bytedance.sdk.component.bw.xq.ycc yccVarSba = xqVar.sba();
        com.bytedance.sdk.component.bw.xq.ypw.emc emcVarEmc = yccVarSba.emc(xqVar);
        try {
            xqVar.ylm();
            Bitmap bitmapEmc = emcVarEmc.emc(this.emc);
            if (bitmapEmc == null) {
                emc(BackupConstant.SCENE_BACKUP_RENDER_FAIL, "decode failed bitmap null", null, xqVar);
                return;
            }
            xqVar.emc(new sz(bitmapEmc, this.ypw, false));
            yccVarSba.emc(xqVar.yzg()).emc(xqVar.ru(), bitmapEmc);
        } catch (Throwable th) {
            emc(BackupConstant.SCENE_BACKUP_RENDER_FAIL, "decode failed:" + th.getMessage(), th, xqVar);
        }
    }

    private void emc(int i, String str, Throwable th, com.bytedance.sdk.component.bw.xq.xq xqVar) {
        if (this.ypw == null) {
            xqVar.emc(new gbl());
        } else {
            xqVar.emc(new msw(i, str, th));
        }
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public String emc() {
        return "decode";
    }
}
