package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vk {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f17637a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f17638b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17639c;

    public vk(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f17638b = linkedHashMap;
        this.f17639c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final uk d() {
        ua.j.C.f35267k.getClass();
        return new uk(SystemClock.elapsedRealtime(), null, null);
    }

    public final void a(uk ukVar, long j, String... strArr) {
        synchronized (this.f17639c) {
            this.f17637a.add(new uk(j, strArr[0], ukVar));
        }
    }

    public final l90 b() {
        l90 l90Var;
        boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.f16237n2)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f17639c) {
            try {
                LinkedList<uk> linkedList = this.f17637a;
                for (uk ukVar : linkedList) {
                    long j = ukVar.f17224a;
                    String str = ukVar.f17225b;
                    uk ukVar2 = ukVar.f17226c;
                    if (ukVar2 != null && j > 0) {
                        long j8 = j - ukVar2.f17224a;
                        sb2.append(str);
                        sb2.append('.');
                        sb2.append(j8);
                        sb2.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(ukVar2.f17224a))) {
                                StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(ukVar2.f17224a));
                                sb3.append('+');
                                sb3.append(str);
                            } else {
                                map.put(Long.valueOf(ukVar2.f17224a), new StringBuilder(str));
                            }
                        }
                    }
                }
                linkedList.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb2.append((String) null);
                } else if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                StringBuilder sb4 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb4.append((CharSequence) entry.getValue());
                        sb4.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        ua.j jVar = ua.j.C;
                        jVar.f35267k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        jVar.f35267k.getClass();
                        sb4.append((jLongValue - SystemClock.elapsedRealtime()) + jCurrentTimeMillis);
                        sb4.append(',');
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    string = sb4.toString();
                }
                l90Var = new l90(4, sb2.toString(), string);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l90Var;
    }

    public final void c(String str, String str2) {
        com.google.android.gms.internal.consent_sdk.d dVarA;
        if (TextUtils.isEmpty(str2) || (dVarA = ua.j.C.f35265h.a()) == null) {
            return;
        }
        synchronized (this.f17639c) {
            tk tkVar = (tk) ((HashMap) dVarA.f19297c).get(str);
            if (tkVar == null) {
                tkVar = tk.f16834b;
            }
            LinkedHashMap linkedHashMap = this.f17638b;
            linkedHashMap.put(str, tkVar.a((String) linkedHashMap.get(str), str2));
        }
    }
}
