package com.bytedance.sdk.component.msw;

import A.f;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.cf;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public class dg {
    private static AtomicInteger xq = new AtomicInteger(0);
    public static final String[] emc = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final String[] ypw = {"tt_pangle", "bd_tracker"};
    private static int dg = 0;
    private static int bw = 0;

    public static class emc {
        public String dg;
        public int emc;
        public String xq;
        public String ypw;

        public emc(String str, int i, String str2, String str3) {
            this.xq = str;
            this.emc = i;
            this.dg = str2;
            this.ypw = str3;
        }

        public void emc(int i) {
            this.emc = i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ThreadModel{times=");
            sb.append(this.emc);
            sb.append(", name='");
            sb.append(this.ypw);
            sb.append("', lastStackStack='");
            return f.p(sb, this.xq, "'}");
        }

        public int emc() {
            return this.emc;
        }
    }

    public static void emc() {
        try {
            ypw();
        } catch (Throwable unused) {
        }
    }

    private static void ypw() {
        int i;
        String str;
        xq xqVarUym = ycc.uym();
        if (xqVarUym == null) {
            return;
        }
        int i3 = 1;
        int iAddAndGet = xq.addAndGet(1);
        int i6 = ycc.xq;
        if (i6 < 0 || iAddAndGet % i6 != 0 || Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        HashMap map = new HashMap();
        if (allStackTraces == null) {
            return;
        }
        boolean zEmc = cf.emc();
        int size = allStackTraces.size();
        if (size > bw) {
            bw = size;
        }
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next = it.next();
            i8 += i3;
            Thread key = next.getKey();
            StackTraceElement[] value = next.getValue();
            StringBuilder sb = new StringBuilder("\n");
            if (zEmc) {
                sb.append("Thread Name is : " + key.getName());
                sb.append("\n");
            }
            int length = value.length;
            String str2 = null;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i3;
                String string = value[i9].toString();
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                if (zEmc) {
                    sb.append(string + "\n");
                }
                if (TextUtils.isEmpty(str2)) {
                    if (emc(string, emc)) {
                        str = string;
                    } else {
                        str = string;
                        if (emc(key.getName(), ypw)) {
                        }
                    }
                    i7++;
                    str2 = str;
                }
                i9++;
                it = it2;
                i3 = i10;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
            int i11 = i3;
            if (zEmc) {
                if (TextUtils.isEmpty(str2)) {
                    i = i11;
                } else {
                    StringBuilder sbB = AbstractC2984e.b(str2, "&");
                    sbB.append(key.getName());
                    String string2 = sbB.toString();
                    emc emcVar = (emc) map.get(string2);
                    if (emcVar != null) {
                        emcVar.emc(emcVar.emc() + 1);
                        i = i11;
                    } else {
                        String string3 = sb.toString();
                        String name = key.getName();
                        i = i11;
                        emcVar = new emc(string2, i, string3, name);
                    }
                    map.put(string2, emcVar);
                }
                if (!TextUtils.isEmpty(sb.toString())) {
                    Log.e("PoolTaskStatistics", "Thread index = " + i8 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    Log.w("PoolTaskStatistics", sb.toString());
                }
            } else {
                i = i11;
            }
            i3 = i;
            it = it3;
        }
        if (i7 > dg) {
            dg = i7;
        }
        if (zEmc) {
            StringBuilder sbP = AbstractC1135f5.p(i7, "SDK current threads=", ", SDK Max threads=");
            sbP.append(dg);
            sbP.append(", Application threads = ");
            sbP.append(size);
            sbP.append(", Application max threads = ");
            sbP.append(bw);
            Log.e("PoolTaskStatistics", sbP.toString());
            Iterator it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                Log.i("PoolTaskStatistics", ((emc) ((Map.Entry) it4.next()).getValue()).toString());
            }
        }
        xqVarUym.emc(new com.bytedance.sdk.component.msw.ypw.emc(i7, dg, size, bw));
    }

    private static boolean emc(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
