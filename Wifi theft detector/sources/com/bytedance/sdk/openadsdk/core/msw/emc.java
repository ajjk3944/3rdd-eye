package com.bytedance.sdk.openadsdk.core.msw;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.settings.gbl;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
public class emc {
    private static volatile emc emc;
    private static volatile long xq;
    private static volatile boolean ypw;
    private Handler bw;
    private final Queue<C0152emc> dg = new LinkedList();
    private final gbl ycc = aa.dg();

    /* renamed from: com.bytedance.sdk.openadsdk.core.msw.emc$emc, reason: collision with other inner class name */
    public static class C0152emc {
        private final long emc;
        private final String ypw;

        private C0152emc(long j10, String str) {
            this.emc = j10;
            this.ypw = str;
        }
    }

    private emc() {
    }

    private synchronized boolean ypw(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iCuf = this.ycc.cuf();
        long jLt = this.ycc.lt();
        if (this.dg.size() <= 0 || this.dg.size() < iCuf) {
            this.dg.offer(new C0152emc(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.dg.peek().emc);
            if (jAbs <= jLt) {
                ypw(jLt - jAbs);
                return true;
            }
            this.dg.poll();
            this.dg.offer(new C0152emc(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized String xq() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0152emc c0152emc : this.dg) {
                if (map.containsKey(c0152emc.ypw)) {
                    map.put(c0152emc.ypw, Integer.valueOf(((Integer) map.get(c0152emc.ypw)).intValue() + 1));
                } else {
                    map.put(c0152emc.ypw, 1);
                }
            }
            str = "";
            int i10 = Integer.MIN_VALUE;
            for (String str2 : map.keySet()) {
                int iIntValue = ((Integer) map.get(str2)).intValue();
                if (i10 < iIntValue) {
                    str = str2;
                    i10 = iIntValue;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    public static emc emc() {
        if (emc == null) {
            synchronized (emc.class) {
                try {
                    if (emc == null) {
                        emc = new emc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public synchronized boolean emc(String str) {
        try {
            if (ypw(str)) {
                emc(true);
                emc(xq);
            } else {
                emc(false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return ypw;
    }

    private synchronized void emc(long j10) {
        try {
            if (this.bw == null) {
                this.bw = new Handler(Looper.getMainLooper());
            }
            this.bw.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.msw.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    emc.this.emc(false);
                }
            }, j10);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean ypw() {
        return ypw;
    }

    private synchronized void ypw(long j10) {
        xq = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void emc(boolean z10) {
        ypw = z10;
    }
}
