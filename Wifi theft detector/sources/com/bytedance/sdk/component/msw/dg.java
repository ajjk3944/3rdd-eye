package com.bytedance.sdk.component.msw;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.cf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

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

        public emc(String str, int i10, String str2, String str3) {
            this.xq = str;
            this.emc = i10;
            this.dg = str2;
            this.ypw = str3;
        }

        public void emc(int i10) {
            this.emc = i10;
        }

        public String toString() {
            return "ThreadModel{times=" + this.emc + ", name='" + this.ypw + "', lastStackStack='" + this.xq + "'}";
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
        int i10;
        String str;
        xq xqVarUym = ycc.uym();
        if (xqVarUym == null) {
            return;
        }
        int i11 = 1;
        int iAddAndGet = xq.addAndGet(1);
        int i12 = ycc.xq;
        if (i12 < 0 || iAddAndGet % i12 != 0 || Looper.getMainLooper() == Looper.myLooper()) {
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
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next = it.next();
            i14 += i11;
            Thread key = next.getKey();
            StackTraceElement[] value = next.getValue();
            StringBuilder sb = new StringBuilder("\n");
            if (zEmc) {
                sb.append("Thread Name is : " + key.getName());
                sb.append("\n");
            }
            int length = value.length;
            String str2 = null;
            int i15 = 0;
            while (i15 < length) {
                int i16 = i11;
                String string = value[i15].toString();
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
                    i13++;
                    str2 = str;
                }
                i15++;
                it = it2;
                i11 = i16;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
            int i17 = i11;
            if (zEmc) {
                if (TextUtils.isEmpty(str2)) {
                    i10 = i17;
                } else {
                    String str3 = str2 + "&" + key.getName();
                    emc emcVar = (emc) map.get(str3);
                    if (emcVar != null) {
                        emcVar.emc(emcVar.emc() + 1);
                        i10 = i17;
                    } else {
                        String string2 = sb.toString();
                        String name = key.getName();
                        i10 = i17;
                        emcVar = new emc(str3, i10, string2, name);
                    }
                    map.put(str3, emcVar);
                }
                if (!TextUtils.isEmpty(sb.toString())) {
                    Log.e("PoolTaskStatistics", "Thread index = " + i14 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    Log.w("PoolTaskStatistics", sb.toString());
                }
            } else {
                i10 = i17;
            }
            i11 = i10;
            it = it3;
        }
        if (i13 > dg) {
            dg = i13;
        }
        if (zEmc) {
            Log.e("PoolTaskStatistics", "SDK current threads=" + i13 + ", SDK Max threads=" + dg + ", Application threads = " + size + ", Application max threads = " + bw);
            Iterator it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                Log.i("PoolTaskStatistics", ((emc) ((Map.Entry) it4.next()).getValue()).toString());
            }
        }
        xqVarUym.emc(new com.bytedance.sdk.component.msw.ypw.emc(i13, dg, size, bw));
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
