package com.bytedance.sdk.component.adexpress.dynamic.bw;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.bw.ypw;
import com.bytedance.sdk.component.adexpress.ypw.sz;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class bw {
    private emc dg;
    public com.bytedance.sdk.component.adexpress.dynamic.dg.ypw emc;
    private com.bytedance.sdk.component.adexpress.dynamic.dg.msw xq;
    protected ypw ypw;

    public static class emc {
        float emc;
        float xq;
        float ypw;
    }

    public bw(double d6, int i, double d7, String str, sz szVar) {
        this.ypw = new ypw(d6, i, d7, str, szVar);
    }

    public void emc(emc emcVar) {
        this.dg = emcVar;
    }

    public void emc() {
        this.ypw.emc();
    }

    public void emc(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, float f2, float f5) {
        if (mswVar != null) {
            this.xq = mswVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar2 = this.xq;
        float fMsw = mswVar2.msw();
        float fZz = mswVar2.zz();
        float f6 = TextUtils.equals(mswVar2.ru().bw().sb(), "fixed") ? fZz : 65536.0f;
        this.ypw.emc();
        this.ypw.xq(mswVar2, fMsw, f6);
        ypw.xq xqVarEmc = this.ypw.emc(mswVar2);
        com.bytedance.sdk.component.adexpress.dynamic.dg.ypw ypwVar = new com.bytedance.sdk.component.adexpress.dynamic.dg.ypw();
        ypwVar.emc = f2;
        ypwVar.ypw = f5;
        if (xqVarEmc != null) {
            fMsw = xqVarEmc.emc;
        }
        ypwVar.xq = fMsw;
        if (xqVarEmc != null) {
            fZz = xqVarEmc.ypw;
        }
        ypwVar.dg = fZz;
        ypwVar.bw = "root";
        ypwVar.zz = 1280.0f;
        ypwVar.ycc = mswVar2;
        mswVar2.xq(f2);
        ypwVar.ycc.dg(ypwVar.ypw);
        ypwVar.ycc.bw(ypwVar.xq);
        ypwVar.ycc.ycc(ypwVar.dg);
        com.bytedance.sdk.component.adexpress.dynamic.dg.ypw ypwVarEmc = emc(ypwVar, 0.0f);
        this.emc = ypwVarEmc;
        emc(ypwVarEmc);
    }

    public void emc(com.bytedance.sdk.component.adexpress.dynamic.dg.ypw ypwVar) {
        if (ypwVar == null) {
            return;
        }
        ypwVar.ycc.ru().ypw();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.dg.ypw>> list = ypwVar.uym;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.dg.ypw> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.dg.ypw> it = list2.iterator();
                while (it.hasNext()) {
                    emc(it.next());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.dg.ypw emc(com.bytedance.sdk.component.adexpress.dynamic.dg.ypw r37, float r38) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.bw.bw.emc(com.bytedance.sdk.component.adexpress.dynamic.dg.ypw, float):com.bytedance.sdk.component.adexpress.dynamic.dg.ypw");
    }

    private com.bytedance.sdk.component.adexpress.dynamic.dg.zz emc(com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVar, ypw.xq xqVar, ypw.xq xqVar2) {
        float fPm = yccVar.pm();
        float fRgy = yccVar.rgy();
        float fIpv = yccVar.ipv();
        float fJxk = yccVar.jxk();
        boolean zCn = yccVar.cn();
        boolean zFu = yccVar.fu();
        boolean zNw = yccVar.nw();
        boolean zWbn = yccVar.wbn();
        if (!zCn) {
            if (zFu) {
                float f2 = this.dg.emc;
                fPm = ((f2 != 0.0f ? Math.min(f2, xqVar.emc) : xqVar.emc) - fIpv) - xqVar2.emc;
            } else {
                fPm = 0.0f;
            }
        }
        if (!zNw) {
            if (zWbn) {
                float f5 = this.dg.ypw;
                if (f5 == 0.0f) {
                    f5 = xqVar.ypw;
                }
                fRgy = (f5 - fJxk) - xqVar2.ypw;
            } else {
                fRgy = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.dg.zz(fPm, fRgy);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.dg.zz emc(com.bytedance.sdk.component.adexpress.dynamic.dg.ypw ypwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVar, float f2, float f5) {
        float f6;
        float f7;
        float f8 = ypwVar.emc;
        float f9 = ypwVar.ypw;
        float fPm = yccVar.pm();
        float fRgy = yccVar.rgy();
        float fIpv = yccVar.ipv();
        float fJxk = yccVar.jxk();
        boolean zCn = yccVar.cn();
        boolean zFu = yccVar.fu();
        boolean zNw = yccVar.nw();
        boolean zWbn = yccVar.wbn();
        String strXhi = yccVar.xhi();
        float f10 = ypwVar.xq;
        float f11 = ypwVar.dg;
        if (TextUtils.equals(strXhi, "0")) {
            if (zCn) {
                f8 = ypwVar.emc + fPm;
            } else if (zFu) {
                f8 = ((ypwVar.emc + f10) - fIpv) - f2;
            }
            if (zNw) {
                f7 = ypwVar.ypw;
                f9 = f7 + fRgy;
            } else if (zWbn) {
                f6 = ypwVar.ypw;
                f9 = ((f6 + f11) - fJxk) - f5;
            }
        } else if (TextUtils.equals(strXhi, "1")) {
            f8 = ypwVar.emc + ((f10 - f2) / 2.0f);
            if (zNw) {
                f7 = ypwVar.ypw;
                f9 = f7 + fRgy;
            } else if (zWbn) {
                f6 = ypwVar.ypw;
                f9 = ((f6 + f11) - fJxk) - f5;
            }
        } else if (TextUtils.equals(strXhi, "2")) {
            f9 = ypwVar.ypw + ((f11 - f5) / 2.0f);
            if (zCn) {
                f8 = ypwVar.emc + fPm;
            } else if (zFu) {
                f8 = ((ypwVar.emc + f10) - fIpv) - f2;
            }
        } else if (TextUtils.equals(strXhi, "3")) {
            f8 = ypwVar.emc + ((f10 - f2) / 2.0f);
            f9 = ((f11 - f5) / 2.0f) + ypwVar.ypw;
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.dg.zz(f8, f9);
    }
}
