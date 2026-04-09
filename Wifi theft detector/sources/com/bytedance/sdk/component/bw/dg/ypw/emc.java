package com.bytedance.sdk.component.bw.dg.ypw;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.bw.yzg;

/* loaded from: classes.dex */
public class emc<T> implements ycc {
    @Override // com.bytedance.sdk.component.bw.dg.ypw.ycc
    public boolean emc(com.bytedance.sdk.component.bw.dg.xq.xq xqVar, yzg yzgVar, com.bytedance.sdk.component.bw.dg.xq.emc emcVar) {
        Bitmap bitmapEmc;
        String strRu = xqVar.ru();
        xqVar.emc();
        com.bytedance.sdk.component.bw.ypw ypwVarSba = xqVar.sba();
        com.bytedance.sdk.component.bw.dg.xq.ycc yccVarAa = xqVar.aa();
        if (ypwVarSba == null || yccVarAa == null || !ypwVarSba.bw() || !emc(xqVar) || (bitmapEmc = yccVarAa.emc(ypwVarSba).emc(strRu)) == null) {
            return true;
        }
        xqVar.emc();
        emcVar.emc(new com.bytedance.sdk.component.bw.dg.xq.dg().emc(xqVar, bitmapEmc, null, false));
        return false;
    }

    private boolean emc(com.bytedance.sdk.component.bw.dg.xq.xq xqVar) {
        int iSup = xqVar.sup();
        return iSup == 1 || iSup == 2;
    }

    @Override // com.bytedance.sdk.component.bw.dg.ypw.ycc
    public String emc() {
        return "bitmap_cache";
    }
}
