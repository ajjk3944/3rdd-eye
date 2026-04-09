package com.bytedance.sdk.openadsdk.core.msw;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.LinearLayoutManager;
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
    private final Queue<C0067emc> dg = new LinkedList();
    private final gbl ycc = aa.dg();

    /* renamed from: com.bytedance.sdk.openadsdk.core.msw.emc$emc, reason: collision with other inner class name */
    public static class C0067emc {
        private final long emc;
        private final String ypw;

        private C0067emc(long j6, String str) {
            this.emc = j6;
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
            this.dg.offer(new C0067emc(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.dg.peek().emc);
            if (jAbs <= jLt) {
                ypw(jLt - jAbs);
                return true;
            }
            this.dg.poll();
            this.dg.offer(new C0067emc(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized String xq() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0067emc c0067emc : this.dg) {
                if (map.containsKey(c0067emc.ypw)) {
                    map.put(c0067emc.ypw, Integer.valueOf(((Integer) map.get(c0067emc.ypw)).intValue() + 1));
                } else {
                    map.put(c0067emc.ypw, 1);
                }
            }
            str = "";
            int i = LinearLayoutManager.INVALID_OFFSET;
            for (String str2 : map.keySet()) {
                int iIntValue = ((Integer) map.get(str2)).intValue();
                if (i < iIntValue) {
                    str = str2;
                    i = iIntValue;
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

    private synchronized void emc(long j6) {
        try {
            if (this.bw == null) {
                this.bw = new Handler(Looper.getMainLooper());
            }
            this.bw.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.msw.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    emc.this.emc(false);
                }
            }, j6);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean ypw() {
        return ypw;
    }

    private synchronized void ypw(long j6) {
        xq = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void emc(boolean z6) {
        ypw = z6;
    }
}
