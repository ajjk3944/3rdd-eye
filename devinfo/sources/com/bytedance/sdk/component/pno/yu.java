package com.bytedance.sdk.component.pno;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.ko;
import d.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {

    /* renamed from: lh, reason: collision with root package name */
    private static AtomicInteger f7620lh = new AtomicInteger(0);
    public static final String[] ouw = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final String[] vt = {"tt_pangle", "bd_tracker"};
    private static int yu = 0;
    private static int fkw = 0;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {

        /* renamed from: lh, reason: collision with root package name */
        public String f7621lh;
        public int ouw = 1;
        public String vt;
        public String yu;

        public ouw(String str, String str2, String str3) {
            this.f7621lh = str;
            this.yu = str2;
            this.vt = str3;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ThreadModel{times=");
            sb2.append(this.ouw);
            sb2.append(", name='");
            sb2.append(this.vt);
            sb2.append("', lastStackStack='");
            return h.w(sb2, this.f7621lh, "'}");
        }
    }

    private static boolean ouw(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void ouw() {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        String str;
        String str2 = "\n";
        try {
            lh lhVarFkw = le.fkw();
            if (lhVarFkw != null) {
                int i4 = 1;
                int iAddAndGet = f7620lh.addAndGet(1);
                int i10 = le.f7608lh;
                if (i10 >= 0 && iAddAndGet % i10 == 0 && Looper.getMainLooper() != Looper.myLooper()) {
                    Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                    HashMap map = new HashMap();
                    if (allStackTraces != null) {
                        boolean zOuw = ko.ouw();
                        int size = allStackTraces.size();
                        if (size > fkw) {
                            fkw = size;
                        }
                        Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = allStackTraces.entrySet().iterator();
                        int i11 = 0;
                        int i12 = 0;
                        while (it2.hasNext()) {
                            Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                            i12 += i4;
                            Thread key = next.getKey();
                            StackTraceElement[] value = next.getValue();
                            StringBuilder sb2 = new StringBuilder(str2);
                            if (zOuw) {
                                sb2.append("Thread Name is : " + key.getName());
                                sb2.append(str2);
                            }
                            int length = value.length;
                            String str3 = null;
                            int i13 = i4;
                            int i14 = 0;
                            while (i14 < length) {
                                String string = value[i14].toString();
                                if (zOuw) {
                                    it = it2;
                                    sb2.append(string + str2);
                                } else {
                                    it = it2;
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    if (ouw(string, ouw)) {
                                        str = str2;
                                    } else {
                                        str = str2;
                                        if (ouw(key.getName(), vt)) {
                                        }
                                    }
                                    i11++;
                                    str3 = string;
                                } else {
                                    str = str2;
                                }
                                i14++;
                                it2 = it;
                                str2 = str;
                            }
                            String str4 = str2;
                            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it2;
                            if (zOuw) {
                                if (!TextUtils.isEmpty(str3)) {
                                    String str5 = str3 + "&" + key.getName();
                                    ouw ouwVar = (ouw) map.get(str5);
                                    if (ouwVar != null) {
                                        ouwVar.ouw++;
                                    } else {
                                        ouwVar = new ouw(str5, sb2.toString(), key.getName());
                                    }
                                    map.put(str5, ouwVar);
                                }
                                if (!TextUtils.isEmpty(sb2.toString())) {
                                    Log.e("PoolTaskStatistics", "Thread index = " + i12 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                                    Log.w("PoolTaskStatistics", sb2.toString());
                                }
                            }
                            i4 = i13;
                            it2 = it3;
                            str2 = str4;
                        }
                        if (i11 > yu) {
                            yu = i11;
                        }
                        if (zOuw) {
                            Log.e("PoolTaskStatistics", "SDK current threads=" + i11 + ", SDK Max threads=" + yu + ", Application threads = " + size + ", Application max threads = " + fkw);
                            Iterator it4 = map.entrySet().iterator();
                            while (it4.hasNext()) {
                                Log.i("PoolTaskStatistics", ((ouw) ((Map.Entry) it4.next()).getValue()).toString());
                            }
                        }
                        lhVarFkw.ouw(new com.bytedance.sdk.component.pno.vt.ouw(i11, yu, size, fkw));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
