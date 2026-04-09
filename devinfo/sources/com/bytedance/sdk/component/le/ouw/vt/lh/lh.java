package com.bytedance.sdk.component.le.ouw.vt.lh;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.le.ouw.fkw;
import com.bytedance.sdk.component.le.ouw.ouw.yu;
import com.bytedance.sdk.component.le.ouw.pno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends HandlerThread implements Handler.Callback {

    /* renamed from: th, reason: collision with root package name */
    private static int f7557th = 200;
    private static int zih = 10;
    private volatile long bly;

    /* renamed from: cf, reason: collision with root package name */
    private final long f7558cf;
    private final Object fkw;

    /* renamed from: jg, reason: collision with root package name */
    private final List<com.bytedance.sdk.component.le.ouw.yu.ouw> f7559jg;
    private final AtomicInteger ko;

    /* renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.le.ouw.vt.lh f7560le;

    /* renamed from: lh, reason: collision with root package name */
    public final PriorityBlockingQueue<com.bytedance.sdk.component.le.ouw.yu.ouw> f7561lh;
    private final AtomicInteger mwh;
    public volatile boolean ouw;
    private volatile long pno;
    private final int qbp;
    private volatile int ra;
    private final AtomicInteger rn;
    private final long ryl;
    private final AtomicInteger tlj;
    private long vm;
    private final int vpp;
    protected yu vt;
    public volatile Handler yu;
    private final int zin;

    public lh(PriorityBlockingQueue<com.bytedance.sdk.component.le.ouw.yu.ouw> priorityBlockingQueue) {
        super("csj_log");
        this.ouw = true;
        this.fkw = new Object();
        this.pno = 0L;
        this.bly = 0L;
        this.tlj = new AtomicInteger(0);
        this.f7558cf = 5000L;
        this.ryl = 5000000000L;
        this.mwh = new AtomicInteger(0);
        this.f7559jg = new ArrayList();
        this.ko = new AtomicInteger(0);
        this.rn = new AtomicInteger(0);
        this.vm = 60000L;
        this.qbp = 1;
        this.zin = 2;
        this.vpp = 3;
        this.f7561lh = priorityBlockingQueue;
        this.vt = new com.bytedance.sdk.component.le.ouw.ouw.vt();
        if (com.bytedance.sdk.component.le.ouw.vt.vt()) {
            return;
        }
        long jPno = pno.vt().bly.pno();
        if (jPno > 0) {
            this.vm = jPno;
        }
    }

    private void fkw() {
        long jNanoTime;
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar;
        if (this.yu.hasMessages(11)) {
            yu();
        } else {
            yu(1);
        }
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        fkw fkwVar = pno.vt().bly;
        if (this.ra == 2) {
            fkw fkwVar2 = pno.vt().bly;
            synchronized (this.fkw) {
                try {
                    try {
                        long jNanoTime2 = System.nanoTime();
                        this.fkw.wait(5000L);
                        jNanoTime = System.nanoTime() - jNanoTime2;
                        yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                        if (!yuVar.f7580lh) {
                            boolean z3 = yuVar.yu;
                        }
                        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                    } catch (InterruptedException e2) {
                        e2.getMessage();
                        com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                        e2.printStackTrace();
                    }
                    if (jNanoTime < 5000000000L && 5000000000L - jNanoTime >= 50000000) {
                        if (!yuVar.f7580lh && !yuVar.yu) {
                            com.bytedance.sdk.component.le.ouw.lh.vt.vt();
                            fkw fkwVar3 = pno.vt().bly;
                            lh(2);
                            return;
                        }
                        fkw fkwVar4 = pno.vt().bly;
                        com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                        return;
                    }
                    com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                    fkw fkwVar5 = pno.vt().bly;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void yu() {
        try {
            if (this.f7561lh.size() != 0 || !this.yu.hasMessages(11) || !this.ouw) {
                com.bytedance.sdk.component.le.ouw.lh.vt.yu();
            } else {
                this.ouw = false;
                com.bytedance.sdk.component.le.ouw.lh.vt.yu();
            }
        } catch (Exception e2) {
            e2.getMessage();
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        try {
            if (i4 == 1) {
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                fkw fkwVar = pno.vt().bly;
                long jFkw = pno.vt().fkw();
                if (jFkw > 0) {
                    this.vt.ouw(Integer.MAX_VALUE, jFkw);
                }
                this.ouw = true;
                ouw();
            } else if (i4 == 2 || i4 == 3) {
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                if (!isAlive()) {
                    com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                    com.bytedance.sdk.component.le.ouw.vt.yu.ouw.vt();
                } else if (!this.ouw) {
                    com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                    lh(6);
                }
                com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                fkw fkwVar2 = pno.vt().bly;
                lh(1);
            } else if (i4 == 11) {
                com.bytedance.sdk.component.le.ouw.lh.vt.yu();
                ArrayList arrayList = new ArrayList(this.f7559jg);
                this.f7559jg.clear();
                ouw((List<com.bytedance.sdk.component.le.ouw.yu.ouw>) arrayList, false);
                fkw();
            }
        } catch (Throwable th2) {
            th2.getMessage();
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
        }
        return true;
    }

    public final void lh(int i4) {
        try {
            boolean zOuw = ouw(i4, com.bytedance.sdk.component.le.ouw.vt.yu.ouw.f7580lh);
            com.bytedance.sdk.component.le.ouw.lh.vt.vt();
            if (i4 != 6 && !zOuw) {
                return;
            }
            com.bytedance.sdk.component.le.ouw.yu.vt vtVar = new com.bytedance.sdk.component.le.ouw.yu.vt();
            vtVar.ouw = i4;
            this.f7561lh.add(vtVar);
            yu(3);
        } catch (Throwable th2) {
            th2.getMessage();
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
        }
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.yu = new Handler(getLooper(), this);
        com.bytedance.sdk.component.le.ouw.vt.yu.ouw.tlj = this.yu;
        this.yu.sendEmptyMessage(1);
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
    }

    public static void vt(int i4) {
        f7557th = i4;
        "applog_interval=".concat(String.valueOf(i4));
        com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
    }

    public static void ouw(int i4) {
        zih = i4;
        "config size=".concat(String.valueOf(i4));
        com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
    }

    private boolean vt() {
        if (com.bytedance.sdk.component.le.ouw.vt.yu.ouw.f7580lh) {
            return this.ra == 4 || this.ra == 7 || this.ra == 6 || this.ra == 5 || this.ra == 2;
        }
        return false;
    }

    private boolean ouw(int i4, boolean z3) {
        fkw fkwVar = pno.vt().bly;
        if (fkwVar != null && fkwVar.ouw(pno.vt().ouw)) {
            return this.vt.ouw(i4, z3);
        }
        com.bytedance.sdk.component.le.ouw.lh.vt.lh();
        return false;
    }

    private void vt(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
        this.f7559jg.addAll(list);
        this.f7559jg.size();
        com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
        fkw fkwVar = pno.vt().bly;
        if (fkwVar != null && fkwVar.le() != null) {
            zih = fkwVar.le().vt();
        }
        if (this.f7559jg.size() >= zih) {
            if (this.yu.hasMessages(11)) {
                this.yu.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.f7559jg);
            this.f7559jg.clear();
            ouw((List<com.bytedance.sdk.component.le.ouw.yu.ouw>) arrayList, false);
            fkw();
            com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
            return;
        }
        if (this.f7561lh.size() == 0) {
            this.ouw = false;
            if (this.yu.hasMessages(11)) {
                this.yu.removeMessages(11);
            }
            if (this.yu.hasMessages(1)) {
                this.yu.removeMessages(1);
            }
            long jOuw = f7557th;
            if (fkwVar != null && fkwVar.le() != null) {
                jOuw = fkwVar.le().ouw();
            }
            this.yu.sendEmptyMessageDelayed(11, jOuw);
            "batch applog report delay ( time )".concat(String.valueOf(jOuw));
            com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
            return;
        }
        this.f7559jg.size();
        com.bytedance.sdk.component.le.ouw.lh.vt.yu();
    }

    public final void yu(int i4) {
        if (!this.ouw) {
            if (this.yu == null) {
                return;
            }
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            fkw fkwVar = pno.vt().bly;
            if (this.yu.hasMessages(1)) {
                return;
            }
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                fkw fkwVar2 = pno.vt().bly;
            }
            this.yu.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        fkw fkwVar3 = pno.vt().bly;
    }

    private void lh() {
        com.bytedance.sdk.component.le.ouw.lh.ouw.lh();
        int i4 = 0;
        if (vt()) {
            com.bytedance.sdk.component.le.ouw.lh.ouw.ouw(this.ra);
            com.bytedance.sdk.component.le.ouw.lh.vt.vt();
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            fkw fkwVar = pno.vt().bly;
            if (this.f7561lh.size() != 0) {
                return;
            }
            if (!this.yu.hasMessages(2)) {
                com.bytedance.sdk.component.le.ouw.vt.yu.ouw.f7580lh = false;
                this.bly = 0L;
                this.pno = 0L;
                this.ko.set(0);
                this.rn.set(0);
            } else {
                this.ouw = false;
                return;
            }
        }
        do {
            boolean zOuw = ouw(this.ra, com.bytedance.sdk.component.le.ouw.vt.yu.ouw.f7580lh);
            com.bytedance.sdk.component.le.ouw.lh.ouw.pno();
            fkw fkwVar2 = pno.vt().bly;
            if (zOuw) {
                List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw = this.vt.ouw(this.ra, -1, null);
                if (listOuw != null) {
                    listOuw.size();
                    com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
                    ouw(listOuw);
                } else {
                    com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
                    yu();
                }
            } else {
                yu();
            }
            i4++;
            com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
            if (!zOuw) {
                return;
            }
        } while (i4 <= 6);
    }

    private void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar) {
        this.tlj.set(0);
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        if (yuVar.f7580lh) {
            this.ra = 5;
        } else if (yuVar.yu) {
            this.ra = 7;
        } else {
            this.ra = 4;
        }
        fkw fkwVar = pno.vt().bly;
        this.vt.ouw(ouwVar, this.ra);
        com.bytedance.sdk.component.le.ouw.lh.ouw.vt();
    }

    private void ouw(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
        if (list.size() != 0) {
            this.f7561lh.size();
            com.bytedance.sdk.component.le.ouw.lh.ouw.ouw();
            if (list.size() <= 1) {
                com.bytedance.sdk.component.le.ouw.lh.ouw.yu();
                com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar = list.get(0);
                if (ouwVar != null) {
                    if (ouwVar.fkw() == 1) {
                        ouw(list, "highPriority");
                        com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
                        return;
                    }
                    if (ouwVar.yu() == 0 && ouwVar.fkw() == 2) {
                        if (ouwVar.vt() == 3) {
                            ouw(list, "version_v3");
                            return;
                        } else {
                            vt(list);
                            return;
                        }
                    }
                    if (ouwVar.yu() == 1) {
                        com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
                        ouw(list, "stats");
                        return;
                    } else if (ouwVar.yu() == 3) {
                        ouw(list, "adType_v3");
                        return;
                    } else if (ouwVar.yu() == 2) {
                        com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
                        ouw(list, "other");
                        return;
                    } else {
                        com.bytedance.sdk.component.le.ouw.lh.vt.yu();
                        return;
                    }
                }
                com.bytedance.sdk.component.le.ouw.lh.vt.yu();
                return;
            }
            com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
            ouw(list, "batchRead");
            return;
        }
        yu();
        com.bytedance.sdk.component.le.ouw.lh.vt.yu();
    }

    private void vt(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list, final boolean z3, final long j) {
        this.mwh.incrementAndGet();
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        fkw fkwVar = pno.vt().bly;
        try {
            HashMap map = new HashMap();
            Iterator<com.bytedance.sdk.component.le.ouw.yu.ouw> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.le.ouw.yu.ouw next = it.next();
                int iPno = next == null ? 0 : next.pno();
                if (map.get(Integer.valueOf(iPno)) == null) {
                    map.put(Integer.valueOf(iPno), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(iPno))).add(next);
            }
            for (Integer num : map.keySet()) {
                if (num.intValue() != 0 && pno.vt().f7553cf != null && pno.vt().f7553cf.get(num) != null) {
                    pno.vt().f7553cf.get(num).ouw(list, new com.bytedance.sdk.component.le.ouw.vt.vt() { // from class: com.bytedance.sdk.component.le.ouw.vt.lh.lh.3
                        @Override // com.bytedance.sdk.component.le.ouw.vt.vt
                        public final void ouw(List<ouw> list2) {
                            try {
                                lh.this.mwh.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    ouw ouwVar = list2.get(i4);
                                    if (ouwVar != null) {
                                        lh.this.ouw(z3, ouwVar.ouw, ouwVar.vt);
                                    }
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    });
                } else {
                    this.f7560le.ouw(list, new com.bytedance.sdk.component.le.ouw.vt.vt() { // from class: com.bytedance.sdk.component.le.ouw.vt.lh.lh.2
                        @Override // com.bytedance.sdk.component.le.ouw.vt.vt
                        public final void ouw(List<ouw> list2) {
                            try {
                                lh.this.mwh.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    ouw ouwVar = list2.get(i4);
                                    if (ouwVar != null) {
                                        lh.this.ouw(z3, ouwVar.ouw, ouwVar.vt);
                                    }
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    });
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            fkw fkwVar2 = pno.vt().bly;
            this.mwh.decrementAndGet();
        }
    }

    public final void ouw(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list, boolean z3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.le.ouw.lh.ouw.ra();
        com.bytedance.sdk.component.le.ouw.vt.lh lhVar = pno.vt().tlj;
        this.f7560le = lhVar;
        if (lhVar != null) {
            vt(list, z3, jCurrentTimeMillis);
        } else {
            ouw(list, z3, jCurrentTimeMillis);
        }
    }

    private void ouw(final List<com.bytedance.sdk.component.le.ouw.yu.ouw> list, final boolean z3, final long j) {
        fkw fkwVar = pno.vt().bly;
        if (fkwVar != null) {
            Executor executorVt = fkwVar.vt();
            if (list.get(0).fkw() == 1) {
                executorVt = fkwVar.ouw();
            }
            if (executorVt == null) {
                return;
            }
            this.mwh.incrementAndGet();
            executorVt.execute(new com.bytedance.sdk.component.le.ouw.fkw.fkw("csj_log_upload") { // from class: com.bytedance.sdk.component.le.ouw.vt.lh.lh.1
                @Override // java.lang.Runnable
                public final void run() {
                    lh lhVar = lh.this;
                    List list2 = list;
                    boolean z10 = z3;
                    int unused = lhVar.ra;
                    lh.ouw(lhVar, list2, z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:27:0x003d, B:30:0x0043, B:79:0x0129, B:81:0x012d, B:82:0x0135, B:38:0x0063, B:40:0x0074, B:41:0x0077, B:45:0x007c, B:47:0x0089, B:48:0x008c, B:50:0x008e, B:52:0x009f, B:53:0x00a4, B:54:0x00a9, B:56:0x00af, B:58:0x00b3, B:60:0x00bf, B:61:0x00c4, B:63:0x00cc, B:64:0x00d1, B:65:0x00ee, B:67:0x00fc, B:68:0x00ff, B:70:0x0101, B:72:0x010e, B:73:0x0111, B:75:0x0113, B:77:0x0121, B:78:0x0126, B:89:0x0147), top: B:94:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:27:0x003d, B:30:0x0043, B:79:0x0129, B:81:0x012d, B:82:0x0135, B:38:0x0063, B:40:0x0074, B:41:0x0077, B:45:0x007c, B:47:0x0089, B:48:0x008c, B:50:0x008e, B:52:0x009f, B:53:0x00a4, B:54:0x00a9, B:56:0x00af, B:58:0x00b3, B:60:0x00bf, B:61:0x00c4, B:63:0x00cc, B:64:0x00d1, B:65:0x00ee, B:67:0x00fc, B:68:0x00ff, B:70:0x0101, B:72:0x010e, B:73:0x0111, B:75:0x0113, B:77:0x0121, B:78:0x0126, B:89:0x0147), top: B:94:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ouw(boolean r9, com.bytedance.sdk.component.le.ouw.vt.lh.vt r10, java.util.List<com.bytedance.sdk.component.le.ouw.yu.ouw> r11) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.le.ouw.vt.lh.lh.ouw(boolean, com.bytedance.sdk.component.le.ouw.vt.lh.vt, java.util.List):void");
    }

    private void ouw(int i4, long j) {
        if (this.yu == null) {
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i4;
        if (i4 == 2) {
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
            this.yu.sendMessageDelayed(messageObtain, (((this.ko.incrementAndGet() - 1) % 4) + 1) * j);
        } else {
            if (i4 == 3) {
                int iIncrementAndGet = this.rn.incrementAndGet();
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                this.yu.sendMessageDelayed(messageObtain, (((iIncrementAndGet - 1) % 4) + 1) * j);
                return;
            }
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
        }
    }

    private void ouw() {
        while (this.ouw) {
            try {
                com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                fkw fkwVar = pno.vt().bly;
                com.bytedance.sdk.component.le.ouw.yu.ouw ouwVarPoll = this.f7561lh.poll(this.vm, TimeUnit.MILLISECONDS);
                int size = this.f7561lh.size();
                "poll size:".concat(String.valueOf(size));
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                if (ouwVarPoll instanceof com.bytedance.sdk.component.le.ouw.yu.vt) {
                    this.tlj.set(0);
                    com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                    if (size == 0) {
                        this.ra = ((com.bytedance.sdk.component.le.ouw.yu.vt) ouwVarPoll).ouw;
                        if (this.ra != 6) {
                            fkw fkwVar2 = pno.vt().bly;
                            lh();
                        }
                    } else if (((com.bytedance.sdk.component.le.ouw.yu.vt) ouwVarPoll).ouw == 1) {
                        this.ra = 1;
                        lh();
                    } else if (((com.bytedance.sdk.component.le.ouw.yu.vt) ouwVarPoll).ouw == 2) {
                        "before size:".concat(String.valueOf(size));
                        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                        if (this.f7561lh.size() >= 100) {
                            for (int i4 = 0; i4 < 100; i4++) {
                                com.bytedance.sdk.component.le.ouw.yu.ouw ouwVarPoll2 = this.f7561lh.poll();
                                if (ouwVarPoll2 instanceof com.bytedance.sdk.component.le.ouw.yu.vt) {
                                    com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                                } else if (ouwVarPoll2 != null) {
                                    ouw(ouwVarPoll2);
                                } else {
                                    com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                                }
                            }
                        }
                        "after size :".concat(String.valueOf(size));
                        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                        this.ra = 2;
                        lh();
                    }
                } else if (ouwVarPoll == null) {
                    int iIncrementAndGet = this.tlj.incrementAndGet();
                    fkw fkwVar3 = pno.vt().bly;
                    if (iIncrementAndGet >= 4 && this.mwh.get() == 0) {
                        com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                        if (!yuVar2.f7580lh && !yuVar2.yu) {
                            fkw fkwVar4 = pno.vt().bly;
                            this.ouw = false;
                            yuVar2.ouw();
                            com.bytedance.sdk.component.le.ouw.lh.vt.vt();
                            return;
                        }
                    }
                    if (iIncrementAndGet < 4) {
                        "timeoutCount:".concat(String.valueOf(iIncrementAndGet));
                        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                        this.ra = 1;
                        lh();
                    }
                } else {
                    ouw(ouwVarPoll);
                    lh();
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                th2.getMessage();
                com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                com.bytedance.sdk.component.le.ouw.vt.yu yuVar3 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                fkw fkwVar5 = pno.vt().bly;
            }
        }
    }

    private void ouw(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list, String str) {
        if (this.yu.hasMessages(11)) {
            this.yu.removeMessages(11);
            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        }
        if (this.f7559jg.size() != 0) {
            ArrayList arrayList = new ArrayList(this.f7559jg);
            this.f7559jg.clear();
            "before_".concat(String.valueOf(str));
            ouw((List<com.bytedance.sdk.component.le.ouw.yu.ouw>) arrayList, false);
            fkw();
            arrayList.size();
            try {
                fkw fkwVar = pno.vt().bly;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            " delayList is empty ：".concat(String.valueOf(str));
            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        }
        ouw(list, false);
        fkw();
    }

    public static /* synthetic */ void ouw(lh lhVar, List list, boolean z3) {
        vt vtVarVt;
        List<Object> listOuw;
        try {
            com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar = (com.bytedance.sdk.component.le.ouw.yu.ouw) list.get(0);
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            fkw fkwVar = pno.vt().bly;
            if (ouwVar.yu() == 0) {
                vtVarVt = pno.ouw().ouw();
                if (vtVarVt != null && vtVarVt.ouw && (listOuw = com.bytedance.sdk.component.le.ouw.vt.ouw()) != null && listOuw.size() != 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar2 = (com.bytedance.sdk.component.le.ouw.yu.ouw) it.next();
                        if (ouwVar2.fkw() == 1) {
                            com.bytedance.sdk.component.le.ouw.lh.ouw.ouw(ouwVar2);
                            com.bytedance.sdk.component.le.ouw.lh.ouw.vt(ouwVar2);
                            Iterator<Object> it2 = listOuw.iterator();
                            while (it2.hasNext()) {
                                it2.next();
                            }
                        }
                    }
                }
                if (vtVarVt != null) {
                    com.bytedance.sdk.component.le.ouw.lh.ouw.cf();
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        jSONArray.put(((com.bytedance.sdk.component.le.ouw.yu.ouw) it3.next()).ra());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e2) {
                    e2.getMessage();
                    com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                }
                vtVarVt = pno.ouw().vt();
            }
            lhVar.mwh.decrementAndGet();
            lhVar.ouw(z3, vtVarVt, (List<com.bytedance.sdk.component.le.ouw.yu.ouw>) list);
        } catch (Throwable th2) {
            th2.getMessage();
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            fkw fkwVar2 = pno.vt().bly;
            lhVar.mwh.decrementAndGet();
        }
    }
}
