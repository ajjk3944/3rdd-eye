package com.bytedance.sdk.component.bw.bw;

/* loaded from: classes.dex */
public class gbl extends emc {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // com.bytedance.sdk.component.bw.bw.zz
    public void emc(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        com.bytedance.sdk.component.bw.xq.xq xqVar2;
        final com.bytedance.sdk.component.bw.xq.ycc yccVarSba = xqVar.sba();
        com.bytedance.sdk.component.bw.dg dgVarDg = yccVarSba.dg();
        xqVar.emc(false);
        try {
            com.bytedance.sdk.component.bw.ycc yccVarEmc = dgVarDg.emc(new com.bytedance.sdk.component.bw.ypw.ypw(xqVar.emc(), xqVar.sz(), xqVar.qh(), xqVar.ylm()));
            int iYpw = yccVarEmc.ypw();
            xqVar.emc(yccVarEmc.emc());
            xqVar2 = 200;
            try {
                if (yccVarEmc.ypw() != 200) {
                    String.valueOf(yccVarEmc);
                    Object objXq = yccVarEmc.xq();
                    emc(iYpw, yccVarEmc.dg(), objXq instanceof Throwable ? (Throwable) objXq : null, xqVar);
                    return;
                }
                final byte[] bArr = (byte[]) yccVarEmc.xq();
                xqVar.emc(new ypw(bArr, yccVarEmc));
                final String strZz = xqVar.zz();
                final com.bytedance.sdk.component.bw.ypw ypwVarYzg = xqVar.yzg();
                if (ypwVarYzg.bw()) {
                    yccVarSba.ypw(xqVar.yzg()).emc(strZz, bArr);
                }
                final com.bytedance.sdk.component.bw.xq.xq xqVar3 = xqVar;
                try {
                    yccVarSba.uym().submit(new Runnable() { // from class: com.bytedance.sdk.component.bw.bw.gbl.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (ypwVarYzg.uym()) {
                                yccVarSba.xq(xqVar3.yzg()).emc(strZz, bArr);
                            }
                        }
                    });
                } catch (Throwable th) {
                    th = th;
                    xqVar2 = xqVar3;
                    emc(1004, "net request failed!", th, xqVar2);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            xqVar2 = xqVar;
        }
    }

    private void emc(int i10, String str, Throwable th, com.bytedance.sdk.component.bw.xq.xq xqVar) {
        xqVar.emc(new msw(i10, str, th));
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public String emc() {
        return "net_request";
    }
}
