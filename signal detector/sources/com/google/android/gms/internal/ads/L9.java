package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import q2.C2841s;

/* loaded from: classes.dex */
public final class L9 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f9631a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9632b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9633c;

    public L9(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f9632b = linkedHashMap;
        this.f9633c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final J9 d() {
        p2.j.f22785C.f22797k.getClass();
        return new J9(SystemClock.elapsedRealtime(), null, null);
    }

    public final void a(J9 j9, long j6, String... strArr) {
        synchronized (this.f9633c) {
            this.f9631a.add(new J9(j6, strArr[0], j9));
        }
    }

    public final K9 b() {
        K9 k9;
        boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.f8792n2)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f9633c) {
            try {
                LinkedList<J9> linkedList = this.f9631a;
                for (J9 j9 : linkedList) {
                    long j6 = j9.f9259a;
                    String str = j9.f9260b;
                    J9 j92 = j9.f9261c;
                    if (j92 != null && j6 > 0) {
                        long j7 = j6 - j92.f9259a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j7);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(j92.f9259a))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(j92.f9259a));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                map.put(Long.valueOf(j92.f9259a), new StringBuilder(str));
                            }
                        }
                    }
                }
                linkedList.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        p2.j jVar = p2.j.f22785C;
                        jVar.f22797k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        jVar.f22797k.getClass();
                        sb3.append((jLongValue - SystemClock.elapsedRealtime()) + jCurrentTimeMillis);
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                k9 = new K9(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return k9;
    }

    public final void c(String str, String str2) {
        K4.c cVarA;
        if (TextUtils.isEmpty(str2) || (cVarA = p2.j.f22785C.f22795h.a()) == null) {
            return;
        }
        synchronized (this.f9633c) {
            I9 i9 = (I9) ((HashMap) cVarA.f2210c).get(str);
            if (i9 == null) {
                i9 = I9.f9076b;
            }
            LinkedHashMap linkedHashMap = this.f9632b;
            linkedHashMap.put(str, i9.a((String) linkedHashMap.get(str), str2));
        }
    }
}
