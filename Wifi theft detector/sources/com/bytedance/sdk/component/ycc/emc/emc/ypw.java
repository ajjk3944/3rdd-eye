package com.bytedance.sdk.component.ycc.emc.emc;

import com.bytedance.sdk.component.ycc.emc.msw;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class ypw extends emc {
    private final dg emc;
    private final Queue<String> xq;
    private final xq ypw;

    public ypw() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.xq = concurrentLinkedQueue;
        this.emc = new ycc(concurrentLinkedQueue);
        this.ypw = new xq();
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public synchronized void emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar, int i10) {
        dg dgVar;
        if (i10 != 5) {
            try {
                if (msw.uym().vk().emc(msw.uym().ycc()) && (dgVar = this.emc) != null && emcVar != null) {
                    dgVar.emc(emcVar, i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xq xqVar = this.ypw;
        if (xqVar != null && emcVar != null) {
            xqVar.emc(emcVar, i10);
        }
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public synchronized void emc(int i10, List<com.bytedance.sdk.component.ycc.emc.dg.emc> list) {
        try {
            Iterator<com.bytedance.sdk.component.ycc.emc.dg.emc> it = list.iterator();
            while (it.hasNext()) {
                this.xq.remove(it.next().xq());
            }
            dg dgVar = this.emc;
            if (dgVar != null) {
                dgVar.emc(i10, list);
            }
            xq xqVar = this.ypw;
            if (xqVar != null) {
                xqVar.emc(i10, list);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x0010, B:64:0x0148, B:67:0x014f, B:68:0x0153, B:70:0x0159, B:74:0x016b, B:11:0x0019, B:13:0x002b, B:15:0x0031, B:16:0x003d, B:18:0x0043, B:21:0x0054, B:22:0x005f, B:24:0x0065, B:26:0x0072, B:28:0x0084, B:29:0x008c, B:30:0x0090, B:32:0x0096, B:33:0x00a4, B:34:0x00af, B:36:0x00b5, B:37:0x00c3, B:38:0x00c8, B:40:0x00d1, B:42:0x00d7, B:43:0x00da, B:45:0x00e2, B:47:0x00e8, B:48:0x00f1, B:50:0x00f7, B:51:0x0105, B:53:0x010e, B:55:0x0114, B:57:0x0122, B:58:0x0126, B:59:0x0131, B:61:0x0137), top: B:79:0x0001 }] */
    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.bytedance.sdk.component.ycc.emc.dg.emc> emc(int r9, int r10, java.util.List<java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ycc.emc.emc.ypw.emc(int, int, java.util.List):java.util.List");
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public synchronized boolean emc(int i10, boolean z10) {
        if (this.emc.emc(i10, z10)) {
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.lt(), 1);
            return true;
        }
        if ((i10 != 1 && i10 != 2) || !this.ypw.emc(i10, z10)) {
            return false;
        }
        com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.cuf(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public void emc(int i10, long j10) {
        this.ypw.emc(i10, j10);
        this.emc.emc(i10, j10);
    }
}
