package com.bytedance.sdk.component.ycc.emc.ypw.xq;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.ycc.emc.bw;
import com.bytedance.sdk.component.ycc.emc.emc.dg;
import com.bytedance.sdk.component.ycc.emc.msw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq extends HandlerThread implements Handler.Callback {
    private static int aa = 10;
    private static int yzg = 200;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.ycc.emc.dg.emc> bw;
    private final AtomicInteger cf;
    private com.bytedance.sdk.component.ycc.emc.ypw.xq dg;
    protected dg emc;
    private final long gbl;
    private volatile long msw;
    private final List<com.bytedance.sdk.component.ycc.emc.dg.emc> qh;
    private final long ru;
    private long sba;
    private final int sra;
    private final AtomicInteger sup;
    private volatile Handler sz;
    private final int ul;
    private volatile long uym;
    private final AtomicInteger vk;
    private final Object xq;
    private volatile int ycc;
    private final int ylm;
    private volatile boolean ypw;
    private final AtomicInteger zz;

    public xq(PriorityBlockingQueue<com.bytedance.sdk.component.ycc.emc.dg.emc> priorityBlockingQueue) {
        super("csj_log");
        this.ypw = true;
        this.xq = new Object();
        this.uym = 0L;
        this.msw = 0L;
        this.zz = new AtomicInteger(0);
        this.ru = 5000L;
        this.gbl = 5000000000L;
        this.sup = new AtomicInteger(0);
        this.qh = new ArrayList();
        this.cf = new AtomicInteger(0);
        this.vk = new AtomicInteger(0);
        this.sba = 60000L;
        this.ul = 1;
        this.ylm = 2;
        this.sra = 3;
        this.bw = priorityBlockingQueue;
        this.emc = new com.bytedance.sdk.component.ycc.emc.emc.ypw();
        if (com.bytedance.sdk.component.ycc.emc.ypw.ypw()) {
            return;
        }
        long jQh = msw.uym().vk().qh();
        if (jQh > 0) {
            this.sba = jQh;
        }
    }

    private void bw() {
        while (emc()) {
            try {
                com.bytedance.sdk.component.ycc.emc.ypw.emc.emc emcVar = com.bytedance.sdk.component.ycc.emc.ypw.dg.dg;
                com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(emcVar.msw(), 1);
                com.bytedance.sdk.component.ycc.emc.dg.emc emcVarPoll = this.bw.poll(this.sba, TimeUnit.MILLISECONDS);
                int size = this.bw.size();
                if (emcVarPoll instanceof com.bytedance.sdk.component.ycc.emc.dg.ypw) {
                    emc(emcVarPoll, size);
                } else if (emcVarPoll == null) {
                    int iIncrementAndGet = this.zz.incrementAndGet();
                    com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(emcVar.xxg(), 1);
                    if (dg(iIncrementAndGet)) {
                        ycc();
                        return;
                    } else if (iIncrementAndGet < 4) {
                        this.ycc = 1;
                        ypw((com.bytedance.sdk.component.ycc.emc.dg.emc) null);
                    }
                } else {
                    emc(emcVarPoll);
                    ypw(emcVarPoll);
                }
            } catch (Throwable th) {
                th.getMessage();
                com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.tp(), 1);
            }
        }
    }

    private void dg() {
        if (!isAlive()) {
            com.bytedance.sdk.component.ycc.emc.ypw.dg.emc.dg();
        } else {
            if (emc()) {
                return;
            }
            xq(6);
        }
    }

    private boolean msw() {
        if (com.bytedance.sdk.component.ycc.emc.ypw.dg.emc.ypw) {
            return this.ycc == 4 || this.ycc == 7 || this.ycc == 6 || this.ycc == 5 || this.ycc == 2;
        }
        return false;
    }

    private void ru() {
        long jNanoTime;
        com.bytedance.sdk.component.ycc.emc.ypw.dg dgVar;
        if (this.sz.hasMessages(11)) {
            zz();
        } else {
            bw(1);
        }
        com.bytedance.sdk.component.ycc.emc.ypw.emc.emc emcVar = com.bytedance.sdk.component.ycc.emc.ypw.dg.dg;
        com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(emcVar.ypw(), 1);
        if (this.ycc == 2) {
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(emcVar.uym(), 1);
            synchronized (this.xq) {
                try {
                    try {
                        long jNanoTime2 = System.nanoTime();
                        this.xq.wait(5000L);
                        jNanoTime = System.nanoTime() - jNanoTime2;
                        dgVar = com.bytedance.sdk.component.ycc.emc.ypw.dg.emc;
                        if (!dgVar.ypw) {
                            boolean z6 = dgVar.xq;
                        }
                    } catch (InterruptedException e6) {
                        e6.getMessage();
                    }
                    if (jNanoTime < 5000000000L && 5000000000L - jNanoTime >= 50000000) {
                        if (!dgVar.ypw && !dgVar.xq) {
                            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(emcVar.mxo(), 1);
                            xq(2);
                            return;
                        }
                        com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(emcVar.gbl(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(emcVar.ru(), 1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void uym() throws JSONException {
        if (this.bw.size() >= 100) {
            for (int i = 0; i < 100; i++) {
                com.bytedance.sdk.component.ycc.emc.dg.emc emcVarPoll = this.bw.poll();
                if (!(emcVarPoll instanceof com.bytedance.sdk.component.ycc.emc.dg.ypw) && emcVarPoll != null) {
                    emc(emcVarPoll);
                }
            }
        }
    }

    private void xq() {
        dg();
        com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.iyl(), 1);
        xq(1);
    }

    private void ycc() {
        com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.sra(), 1);
        emc(false);
        com.bytedance.sdk.component.ycc.emc.ypw.dg.emc.xq();
    }

    private void zz() {
        try {
            if (this.bw.size() == 0 && this.sz.hasMessages(11) && emc()) {
                emc(false);
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        try {
        } catch (Throwable th) {
            th.getMessage();
        }
        if (i == 1) {
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.zz(), 1);
            ypw();
            emc(true);
            bw();
        } else {
            if (i != 2 && i != 3) {
                if (i == 11) {
                    ArrayList arrayList = new ArrayList(this.qh);
                    this.qh.clear();
                    emc((List<com.bytedance.sdk.component.ycc.emc.dg.emc>) arrayList, false, "timeout_dispatch");
                    ru();
                }
                return true;
            }
            xq();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.sz = new Handler(getLooper(), this);
        com.bytedance.sdk.component.ycc.emc.ypw.dg.emc.emc(this.sz);
        this.sz.sendEmptyMessage(1);
    }

    public static void ypw(int i) {
        yzg = i;
    }

    private void ypw() {
        long jAa = msw.uym().aa();
        if (jAa <= 0) {
            return;
        }
        this.emc.emc(Integer.MAX_VALUE, jAa);
    }

    public static void emc(int i) {
        aa = i;
    }

    public void xq(int i) {
        try {
            boolean zEmc = emc(i, com.bytedance.sdk.component.ycc.emc.ypw.dg.emc.ypw);
            if (i != 6 && !zEmc) {
                return;
            }
            com.bytedance.sdk.component.ycc.emc.dg.ypw ypwVar = new com.bytedance.sdk.component.ycc.emc.dg.ypw();
            ypwVar.ypw(i);
            this.bw.add(ypwVar);
            bw(3);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private boolean dg(int i) {
        if (i < 4 || this.sup.get() != 0) {
            return false;
        }
        com.bytedance.sdk.component.ycc.emc.ypw.dg dgVar = com.bytedance.sdk.component.ycc.emc.ypw.dg.emc;
        return (dgVar.ypw || dgVar.xq) ? false : true;
    }

    private void ypw(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar) {
        List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc;
        if (com.bytedance.sdk.component.ycc.emc.xq.emc.ypw() && msw.uym().emc()) {
            return;
        }
        int i = 0;
        if (msw()) {
            com.bytedance.sdk.component.ycc.emc.xq.emc.emc(this.ycc);
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.sup(), 1);
            if (this.bw.size() != 0) {
                return;
            }
            if (!this.sz.hasMessages(2)) {
                com.bytedance.sdk.component.ycc.emc.ypw.dg.emc.ypw = false;
                this.msw = 0L;
                this.uym = 0L;
                this.cf.set(0);
                this.vk.set(0);
            } else {
                emc(false);
                return;
            }
        }
        do {
            boolean zEmc = emc(this.ycc, com.bytedance.sdk.component.ycc.emc.ypw.dg.emc.ypw);
            com.bytedance.sdk.component.ycc.emc.xq.emc.emc(zEmc, this.ycc, emcVar);
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.sz(), 1);
            if (zEmc && (listEmc = this.emc.emc(this.ycc, -1, null)) != null) {
                listEmc.size();
                emc(listEmc);
            } else {
                zz();
            }
            i++;
            if (!zEmc) {
                return;
            }
        } while (i <= 6);
    }

    public void emc(boolean z6) {
        this.ypw = z6;
    }

    public boolean emc() {
        return this.ypw;
    }

    public boolean emc(int i, boolean z6) {
        bw bwVarVk = msw.uym().vk();
        if (bwVarVk == null || !bwVarVk.emc(msw.uym().ycc())) {
            return false;
        }
        return this.emc.emc(i, z6);
    }

    public void emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar, boolean z6) {
        if (emcVar == null) {
            return;
        }
        emcVar.dg();
        if (z6) {
            if (this.sz != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(emcVar);
                emc((List<com.bytedance.sdk.component.ycc.emc.dg.emc>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.bw.add(emcVar);
        bw(2);
    }

    private void bw(int i) {
        if (!emc()) {
            if (this.sz == null) {
                return;
            }
            com.bytedance.sdk.component.ycc.emc.ypw.emc.emc emcVar = com.bytedance.sdk.component.ycc.emc.ypw.dg.dg;
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(emcVar.xq(), 1);
            if (this.sz.hasMessages(1)) {
                return;
            }
            if (i == 1) {
                com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(emcVar.ycc(), 1);
            } else if (i == 2) {
                com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(emcVar.dg(), 1);
            } else if (i == 3) {
                com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(emcVar.bw(), 1);
            }
            this.sz.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.emc(), 1);
    }

    private void emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar, int i) throws JSONException {
        this.zz.set(0);
        if (i == 0) {
            this.ycc = ((com.bytedance.sdk.component.ycc.emc.dg.ypw) emcVar).gbl();
            if (this.ycc != 6) {
                com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.wo(), 1);
                ypw(emcVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.ycc.emc.dg.ypw ypwVar = (com.bytedance.sdk.component.ycc.emc.dg.ypw) emcVar;
        if (ypwVar.gbl() == 1) {
            this.ycc = 1;
            ypw(emcVar);
        } else if (ypwVar.gbl() == 2) {
            uym();
            this.ycc = 2;
            ypw(emcVar);
        }
    }

    private void ypw(List<com.bytedance.sdk.component.ycc.emc.dg.emc> list) {
        this.qh.addAll(list);
        this.qh.size();
        bw bwVarVk = msw.uym().vk();
        if (bwVarVk != null && bwVarVk.sup() != null) {
            aa = bwVarVk.sup().ypw();
        }
        if (this.qh.size() >= aa) {
            if (this.sz.hasMessages(11)) {
                this.sz.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.qh);
            this.qh.clear();
            emc((List<com.bytedance.sdk.component.ycc.emc.dg.emc>) arrayList, false, "max_size_dispatch");
            ru();
            return;
        }
        if (this.bw.size() == 0) {
            emc(false);
            if (this.sz.hasMessages(11)) {
                this.sz.removeMessages(11);
            }
            if (this.sz.hasMessages(1)) {
                this.sz.removeMessages(1);
            }
            long jEmc = yzg;
            if (bwVarVk != null && bwVarVk.sup() != null) {
                jEmc = bwVarVk.sup().emc();
            }
            this.sz.sendEmptyMessageDelayed(11, jEmc);
            return;
        }
        this.qh.size();
    }

    private void emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar) throws JSONException {
        this.zz.set(0);
        com.bytedance.sdk.component.ycc.emc.ypw.dg dgVar = com.bytedance.sdk.component.ycc.emc.ypw.dg.emc;
        if (dgVar.ypw) {
            this.ycc = 5;
        } else if (dgVar.xq) {
            this.ycc = 7;
        } else {
            this.ycc = 4;
        }
        com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.wad(), 1);
        this.emc.emc(emcVar, this.ycc);
        com.bytedance.sdk.component.ycc.emc.xq.emc.uym(emcVar);
    }

    private void emc(List<com.bytedance.sdk.component.ycc.emc.dg.emc> list, String str) {
        emc(str);
        emc(list, false, str);
        ru();
    }

    private void emc(List<com.bytedance.sdk.component.ycc.emc.dg.emc> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.ycc.emc.xq.emc.emc(list, this.bw.size());
            if (list.size() <= 1 && !com.bytedance.sdk.component.ycc.emc.xq.emc.xq()) {
                com.bytedance.sdk.component.ycc.emc.dg.emc emcVar = list.get(0);
                if (emcVar != null) {
                    if (emcVar.bw() == 1) {
                        emc(list, "highPriority");
                        return;
                    }
                    if (emcVar.dg() == 0 && emcVar.bw() == 2) {
                        if (emcVar.ypw() == 3) {
                            emc(list, "version_v3");
                            return;
                        } else {
                            ypw(list);
                            return;
                        }
                    }
                    if (emcVar.dg() == 1) {
                        emc(list, "stats");
                        return;
                    } else if (emcVar.dg() == 3) {
                        emc(list, "adType_v3");
                        return;
                    } else {
                        if (emcVar.dg() == 2) {
                            emc(list, "other");
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            emc(list, "batchRead");
            return;
        }
        zz();
    }

    private void ypw(List<com.bytedance.sdk.component.ycc.emc.dg.emc> list, final boolean z6, final long j6) {
        this.sup.incrementAndGet();
        com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.nw(), 1);
        try {
            HashMap map = new HashMap();
            Iterator<com.bytedance.sdk.component.ycc.emc.dg.emc> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.ycc.emc.dg.emc next = it.next();
                int iRu = next == null ? 0 : next.ru();
                if (map.get(Integer.valueOf(iRu)) == null) {
                    map.put(Integer.valueOf(iRu), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(iRu))).add(next);
            }
            for (Integer num : map.keySet()) {
                if (num.intValue() != 0 && msw.uym().xq() != null && msw.uym().xq().get(num) != null) {
                    msw.uym().xq().get(num).emc(list, new com.bytedance.sdk.component.ycc.emc.ypw.ypw() { // from class: com.bytedance.sdk.component.ycc.emc.ypw.xq.xq.3
                        @Override // com.bytedance.sdk.component.ycc.emc.ypw.ypw
                        public void emc(List<emc> list2) {
                            try {
                                xq.this.sup.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    emc emcVar = list2.get(i);
                                    if (emcVar != null) {
                                        xq.this.emc(z6, emcVar.emc(), emcVar.ypw(), j6);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                } else {
                    this.dg.emc(list, new com.bytedance.sdk.component.ycc.emc.ypw.ypw() { // from class: com.bytedance.sdk.component.ycc.emc.ypw.xq.xq.2
                        @Override // com.bytedance.sdk.component.ycc.emc.ypw.ypw
                        public void emc(List<emc> list2) {
                            try {
                                xq.this.sup.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    emc emcVar = list2.get(i);
                                    if (emcVar != null) {
                                        xq.this.emc(z6, emcVar.emc(), emcVar.ypw(), j6);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        } catch (Exception e6) {
            e6.getMessage();
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.tp(), 1);
            this.sup.decrementAndGet();
        }
    }

    private void emc(String str) {
        if (this.sz.hasMessages(11)) {
            this.sz.removeMessages(11);
        }
        if (this.qh.size() != 0) {
            ArrayList arrayList = new ArrayList(this.qh);
            this.qh.clear();
            emc((List<com.bytedance.sdk.component.ycc.emc.dg.emc>) arrayList, false, "before_".concat(String.valueOf(str)));
            ru();
            arrayList.size();
        }
    }

    private void emc(List<com.bytedance.sdk.component.ycc.emc.dg.emc> list, boolean z6, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.ycc.emc.xq.emc.emc(list, this.ycc, str);
        com.bytedance.sdk.component.ycc.emc.ypw.xq xqVarMsw = msw.uym().msw();
        this.dg = xqVarMsw;
        if (xqVarMsw != null) {
            ypw(list, z6, jCurrentTimeMillis);
        } else {
            emc(list, z6, jCurrentTimeMillis);
        }
    }

    private void emc(final List<com.bytedance.sdk.component.ycc.emc.dg.emc> list, final boolean z6, final long j6) {
        bw bwVarVk = msw.uym().vk();
        if (bwVarVk != null) {
            Executor executorBw = bwVarVk.bw();
            if (list.get(0).bw() == 1) {
                executorBw = bwVarVk.dg();
            }
            if (executorBw == null) {
                return;
            }
            this.sup.incrementAndGet();
            executorBw.execute(new com.bytedance.sdk.component.ycc.emc.bw.bw("csj_log_upload") { // from class: com.bytedance.sdk.component.ycc.emc.ypw.xq.xq.1
                @Override // java.lang.Runnable
                public void run() {
                    xq xqVar = xq.this;
                    xqVar.emc((List<com.bytedance.sdk.component.ycc.emc.dg.emc>) list, z6, j6, xqVar.ycc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(List<com.bytedance.sdk.component.ycc.emc.dg.emc> list, boolean z6, long j6, int i) {
        xq xqVar;
        Throwable th;
        ypw ypwVarEmc;
        ypw ypwVar;
        try {
            com.bytedance.sdk.component.ycc.emc.dg.emc emcVar = list.get(0);
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.nw(), 1);
            try {
                if (emcVar.dg() == 0) {
                    ypwVarEmc = msw.bw().emc(list);
                    emc(ypwVarEmc, list);
                    if (ypwVarEmc != null) {
                        com.bytedance.sdk.component.ycc.emc.xq.emc.emc(list, ypwVarEmc.dg);
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONArray jSONArray = new JSONArray();
                        Iterator<com.bytedance.sdk.component.ycc.emc.dg.emc> it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next().uym());
                        }
                        jSONObject.put("stats_list", jSONArray);
                    } catch (Exception e6) {
                        e6.getMessage();
                    }
                    ypwVarEmc = msw.bw().emc(jSONObject);
                }
                ypwVar = ypwVarEmc;
                this.sup.decrementAndGet();
                xqVar = this;
            } catch (Throwable th2) {
                th = th2;
                xqVar = this;
                th.getMessage();
                com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.tp(), 1);
                xqVar.sup.decrementAndGet();
            }
        } catch (Throwable th3) {
            th = th3;
            xqVar = this;
        }
        try {
            xqVar.emc(z6, ypwVar, list, j6);
        } catch (Throwable th4) {
            th = th4;
            th = th;
            th.getMessage();
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.tp(), 1);
            xqVar.sup.decrementAndGet();
        }
    }

    private void emc(ypw ypwVar, List<com.bytedance.sdk.component.ycc.emc.dg.emc> list) {
        if (ypwVar == null || !ypwVar.emc) {
            return;
        }
        List<Object> listEmc = com.bytedance.sdk.component.ycc.emc.ypw.emc();
        if (list == null || listEmc == null || listEmc.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.ycc.emc.dg.emc emcVar : list) {
            if (emcVar.bw() == 1) {
                com.bytedance.sdk.component.ycc.emc.xq.emc.emc(emcVar);
                com.bytedance.sdk.component.ycc.emc.xq.emc.bw(emcVar);
                Iterator<Object> it = listEmc.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(boolean z6, ypw ypwVar, List<com.bytedance.sdk.component.ycc.emc.dg.emc> list, long j6) {
        if (z6 || ypwVar == null) {
            return;
        }
        int i = ypwVar.ypw;
        int i3 = -2;
        if (ypwVar.bw) {
            i = -1;
        } else if (i < 0) {
            i = -2;
        }
        if (i == 510 || i == 511) {
            i = -2;
        }
        if (ypwVar.emc || ((i < 500 || i >= 509) && i <= 513)) {
            i3 = i;
        }
        if (list != null) {
            list.size();
            this.sup.get();
        }
        emc(i3, list, j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006a A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(int r6, java.util.List<com.bytedance.sdk.component.ycc.emc.dg.emc> r7, long r8) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ycc.emc.ypw.xq.xq.emc(int, java.util.List, long):void");
    }

    public void emc(int i, long j6) {
        if (this.sz == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        if (i == 2) {
            this.sz.sendMessageDelayed(messageObtain, (((this.cf.incrementAndGet() - 1) % 4) + 1) * j6);
        } else if (i == 3) {
            this.sz.sendMessageDelayed(messageObtain, (((this.vk.incrementAndGet() - 1) % 4) + 1) * j6);
        }
    }
}
