package com.bytedance.sdk.component.fkw.fkw;

import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.TTAdConstant;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf extends ouw {
    private static void ouw(int i4, String str, Throwable th2, com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        lhVar.ouw(new pno(i4, str, th2));
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "net_request";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(final com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        com.bytedance.sdk.component.fkw.lh.lh lhVar2;
        final com.bytedance.sdk.component.fkw.lh.le leVar = lhVar.jqy;
        if (leVar.fkw == null) {
            com.bytedance.sdk.component.fkw.yu yuVarYu = leVar.vt.yu();
            if (yuVarYu == null) {
                yuVarYu = new com.bytedance.sdk.component.fkw.vt.ouw();
            }
            leVar.fkw = yuVarYu;
        }
        com.bytedance.sdk.component.fkw.yu yuVar = leVar.fkw;
        lhVar.qbp = false;
        try {
            com.bytedance.sdk.component.fkw.le leVarOuw = yuVar.ouw(new com.bytedance.sdk.component.fkw.vt.vt(lhVar.ouw, lhVar.mwh, lhVar.f7454jg, lhVar.f7452cd));
            int iVt = leVarOuw.vt();
            lhVar.zin = leVarOuw.ouw();
            lhVar2 = 200;
            try {
                if (leVarOuw.vt() == 200) {
                    final byte[] bArr = (byte[]) leVarOuw.lh();
                    lhVar.ouw(new vt(bArr, leVarOuw));
                    final String str = lhVar.f7456lh;
                    final com.bytedance.sdk.component.fkw.vt vtVar = lhVar.tc;
                    if (vtVar.fkw()) {
                        leVar.ouw(lhVar.tc).ouw(str, bArr);
                    }
                    leVar.vt().submit(new Runnable() { // from class: com.bytedance.sdk.component.fkw.fkw.cf.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (vtVar.ra()) {
                                leVar.vt(lhVar.tc).ouw(str, bArr);
                            }
                        }
                    });
                    return;
                }
                ko.lh(String.valueOf(leVarOuw));
                Object objLh = leVarOuw.lh();
                ouw(iVt, leVarOuw.yu(), objLh instanceof Throwable ? (Throwable) objLh : null, lhVar);
            } catch (Throwable th2) {
                th = th2;
                ouw(TTAdConstant.IMAGE_MODE_CAROUSEL_IMG, "net request failed!", th, lhVar2);
            }
        } catch (Throwable th3) {
            th = th3;
            lhVar2 = lhVar;
        }
    }
}
