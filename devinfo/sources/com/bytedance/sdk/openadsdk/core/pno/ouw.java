package com.bytedance.sdk.openadsdk.core.pno;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {

    /* renamed from: lh, reason: collision with root package name */
    private static volatile long f8379lh;
    private static volatile ouw ouw;
    private static volatile boolean vt;
    private Handler fkw;
    private final Queue<C0094ouw> yu = new LinkedList();

    /* renamed from: le, reason: collision with root package name */
    private final cf f8380le = zih.yu();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.pno.ouw$ouw, reason: collision with other inner class name */
    public static class C0094ouw {
        final long ouw;
        final String vt;

        public /* synthetic */ C0094ouw(long j, String str, byte b10) {
            this(j, str);
        }

        private C0094ouw(long j, String str) {
            this.ouw = j;
            this.vt = str;
        }
    }

    private ouw() {
    }

    private synchronized boolean vt(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iOuw = this.f8380le.pno.ouw(AppLovinMediationProvider.MAX, 50);
        long jOuw = this.f8380le.pno.ouw("duration", 10000L);
        byte b10 = 0;
        if (this.yu.size() <= 0 || this.yu.size() < iOuw) {
            this.yu.offer(new C0094ouw(jCurrentTimeMillis, str, b10));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.yu.peek().ouw);
            if (jAbs <= jOuw) {
                vt(jOuw - jAbs);
                return true;
            }
            this.yu.poll();
            this.yu.offer(new C0094ouw(jCurrentTimeMillis, str, b10));
        }
        return false;
    }

    public final synchronized String lh() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0094ouw c0094ouw : this.yu) {
                if (map.containsKey(c0094ouw.vt)) {
                    String str2 = c0094ouw.vt;
                    map.put(str2, Integer.valueOf(((Integer) map.get(str2)).intValue() + 1));
                } else {
                    map.put(c0094ouw.vt, 1);
                }
            }
            str = "";
            int i4 = LinearLayoutManager.INVALID_OFFSET;
            for (String str3 : map.keySet()) {
                int iIntValue = ((Integer) map.get(str3)).intValue();
                if (i4 < iIntValue) {
                    str = str3;
                    i4 = iIntValue;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return str;
    }

    public static ouw ouw() {
        if (ouw == null) {
            synchronized (ouw.class) {
                try {
                    if (ouw == null) {
                        ouw = new ouw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }

    public final synchronized boolean ouw(String str) {
        try {
            if (vt(str)) {
                ouw(true);
                ouw(f8379lh);
            } else {
                ouw(false);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return vt;
    }

    private synchronized void ouw(long j) {
        try {
            if (this.fkw == null) {
                this.fkw = new Handler(Looper.getMainLooper());
            }
            this.fkw.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.pno.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    ouw.this.ouw(false);
                }
            }, j);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean vt() {
        return vt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ouw(boolean z3) {
        vt = z3;
    }

    private synchronized void vt(long j) {
        f8379lh = j;
    }
}
