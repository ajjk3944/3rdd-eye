package com.bytedance.sdk.component.bw.dg.ypw;

import com.bytedance.sdk.component.bw.sba;
import com.bytedance.sdk.component.bw.yzg;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class xq implements ycc {
    private void ypw(final com.bytedance.sdk.component.bw.ypw ypwVar, final com.bytedance.sdk.component.bw.dg.xq.ycc yccVar, final String str, final byte[] bArr) {
        if (ypwVar == null || !ypwVar.uym()) {
            return;
        }
        yccVar.msw().submit(new Runnable() { // from class: com.bytedance.sdk.component.bw.dg.ypw.xq.1
            @Override // java.lang.Runnable
            public void run() {
                yccVar.xq(ypwVar).emc(str, bArr);
            }
        });
    }

    @Override // com.bytedance.sdk.component.bw.dg.ypw.ycc
    public boolean emc(com.bytedance.sdk.component.bw.dg.xq.xq xqVar, yzg yzgVar, com.bytedance.sdk.component.bw.dg.xq.emc emcVar) {
        com.bytedance.sdk.component.bw.ypw ypwVarSba = xqVar.sba();
        com.bytedance.sdk.component.bw.dg.xq.ycc yccVarAa = xqVar.aa();
        if (ypwVarSba != null && yccVarAa != null) {
            if (ypwVarSba.ycc()) {
                if (yzgVar != null) {
                    yzgVar.emc("data_cache", xqVar);
                }
                sba sbaVarYpw = yccVarAa.ypw(ypwVarSba);
                bArrEmc = sbaVarYpw != null ? sbaVarYpw.emc(xqVar.zz()) : null;
                if (yzgVar != null) {
                    yzgVar.ypw("data_cache", xqVar);
                }
                xqVar.zz();
                xqVar.emc();
            }
            if (ypwVarSba.uym() && bArrEmc == null) {
                if (yzgVar != null) {
                    yzgVar.emc("disk_cache", xqVar);
                }
                byte[] bArrEmc = emc(ypwVarSba, yccVarAa, xqVar.zz());
                if (bArrEmc != null) {
                    emc(xqVar.sba(), yccVarAa, xqVar.zz(), bArrEmc);
                }
                if (yzgVar != null) {
                    yzgVar.ypw("disk_cache", xqVar);
                }
                xqVar.zz();
                xqVar.emc();
                bArrEmc = bArrEmc;
            }
        }
        if (yccVarAa != null && bArrEmc == null) {
            if (yzgVar != null) {
                yzgVar.emc("net_request", xqVar);
            }
            bArrEmc = emc(yccVarAa, xqVar, emcVar);
            xqVar.zz();
            xqVar.emc();
            if (yzgVar != null) {
                yzgVar.ypw("net_request", xqVar);
            }
        }
        if (bArrEmc != null) {
            xqVar.emc(bArrEmc);
            return true;
        }
        xqVar.zz();
        xqVar.emc();
        return false;
    }

    @Override // com.bytedance.sdk.component.bw.dg.ypw.ycc
    public String emc() {
        return "data_intercept";
    }

    private byte[] emc(com.bytedance.sdk.component.bw.dg.xq.ycc yccVar, com.bytedance.sdk.component.bw.dg.xq.xq xqVar, com.bytedance.sdk.component.bw.dg.xq.emc emcVar) {
        com.bytedance.sdk.component.bw.dg dgVarDg = yccVar.dg();
        xqVar.emc(false);
        try {
            com.bytedance.sdk.component.bw.ycc yccVarEmc = dgVarDg.emc(new com.bytedance.sdk.component.bw.ypw.ypw(xqVar.emc(), false, false, xqVar.yzg()));
            if (yccVarEmc == null) {
                emcVar.emc(1004, "call is empty", new Exception("call is empty"));
                return null;
            }
            int iYpw = yccVarEmc.ypw();
            if (iYpw == 200) {
                byte[] bArr = (byte[]) yccVarEmc.xq();
                if (bArr == null) {
                    emcVar.emc(iYpw, yccVarEmc.dg(), new Exception("net data is empty"));
                    return null;
                }
                emc(xqVar.sba(), yccVar, xqVar.zz(), bArr);
                ypw(xqVar.sba(), yccVar, xqVar.zz(), bArr);
                return bArr;
            }
            Object objXq = yccVarEmc.xq();
            emcVar.emc(iYpw, yccVarEmc.dg(), objXq instanceof Throwable ? (Throwable) objXq : null);
            return null;
        } catch (Throwable th) {
            emcVar.emc(1004, "net request failed!", th);
            return null;
        }
    }

    private byte[] emc(com.bytedance.sdk.component.bw.ypw ypwVar, com.bytedance.sdk.component.bw.dg.xq.ycc yccVar, String str) {
        yccVar.xq(ypwVar);
        Collection<com.bytedance.sdk.component.bw.xq> collectionXq = yccVar.xq();
        if (collectionXq == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.bw.xq> it = collectionXq.iterator();
        while (it.hasNext()) {
            byte[] bArrEmc = it.next().emc((com.bytedance.sdk.component.bw.xq) str);
            if (bArrEmc != null) {
                return bArrEmc;
            }
        }
        return null;
    }

    private void emc(com.bytedance.sdk.component.bw.ypw ypwVar, com.bytedance.sdk.component.bw.dg.xq.ycc yccVar, String str, byte[] bArr) {
        if (ypwVar == null || !ypwVar.ycc()) {
            return;
        }
        yccVar.ypw(ypwVar).emc(str, bArr);
    }
}
