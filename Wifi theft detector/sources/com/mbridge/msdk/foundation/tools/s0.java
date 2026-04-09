package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15499a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15500b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f15501c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f15502d;

    /* renamed from: e, reason: collision with root package name */
    public volatile JSONObject f15503e;

    /* renamed from: f, reason: collision with root package name */
    private String f15504f;

    /* renamed from: g, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Boolean> f15505g;

    /* renamed from: h, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Integer> f15506h;

    /* renamed from: i, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, String> f15507i;

    /* renamed from: j, reason: collision with root package name */
    private volatile com.mbridge.msdk.setting.g f15508j;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final s0 f15509a = new s0();
    }

    public static s0 a() {
        return b.f15509a;
    }

    private static Integer b(String str, ConcurrentHashMap<String, Integer> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String c(String str, ConcurrentHashMap<String, String> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private ConcurrentHashMap<String, String> d() {
        synchronized (this.f15500b) {
            try {
                if (this.f15507i == null) {
                    this.f15507i = new ConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f15507i;
    }

    private boolean e() {
        return this.f15508j.E() == 1;
    }

    private s0() {
        this.f15499a = new Object();
        this.f15500b = new Object();
        this.f15501c = new Object();
        this.f15502d = new Object();
    }

    private int a(String str, String str2, int i10) {
        if (!a(true)) {
            try {
                String strOptString = this.f15503e.optString(str, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    String strA = k0.a(strOptString);
                    if (!TextUtils.isEmpty(strA)) {
                        return new JSONObject(strA).optInt(str2, i10);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return i10;
    }

    private ConcurrentHashMap<String, Integer> c() {
        synchronized (this.f15499a) {
            try {
                if (this.f15506h == null) {
                    this.f15506h = new ConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f15506h;
    }

    public int b(String str, int i10) {
        Integer numValueOf;
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMapC = c();
        Integer numB = b(str, concurrentHashMapC);
        if (numB != null) {
            return numB.intValue();
        }
        try {
            numValueOf = Integer.valueOf(a(str, i10));
        } catch (Exception unused) {
            numValueOf = Integer.valueOf(i10);
        }
        concurrentHashMapC.put(str, numValueOf);
        return numValueOf.intValue();
    }

    private int a(String str, int i10) {
        if (!a(true)) {
            try {
                return this.f15503e.optInt(str, i10);
            } catch (Exception unused) {
            }
        }
        return i10;
    }

    public String b(String str, String str2, boolean z10) {
        String strA;
        String strC;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        ConcurrentHashMap<String, String> concurrentHashMapD = d();
        if (z10 && (strC = c(str, concurrentHashMapD)) != null) {
            return strC;
        }
        try {
            strA = a(str, str2, z10);
        } catch (Exception unused) {
            strA = str2;
        }
        concurrentHashMapD.put(str, strA);
        return strA;
    }

    private String a(String str, String str2, boolean z10) {
        if (!a(z10)) {
            try {
                return this.f15503e.optString(str, str2);
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public boolean a(String str, boolean z10) {
        try {
            return b(str, z10, true);
        } catch (Exception unused) {
            return z10;
        }
    }

    private static Boolean a(String str, ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean a(String str, boolean z10, boolean z11) {
        if (!a(z11)) {
            try {
                return this.f15503e.optInt(str, z10 ? 1 : 0) != 0;
            } catch (Exception unused) {
            }
        }
        return z10;
    }

    public int b(String str, String str2, int i10) {
        Integer numValueOf;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String str3 = str + "_" + str2;
                ConcurrentHashMap<String, Integer> concurrentHashMapC = c();
                Integer numB = b(str3, concurrentHashMapC);
                if (numB != null) {
                    return numB.intValue();
                }
                try {
                    numValueOf = Integer.valueOf(a(str, str2, i10));
                } catch (Exception unused) {
                    numValueOf = Integer.valueOf(i10);
                }
                concurrentHashMapC.put(str3, numValueOf);
                return numValueOf.intValue();
            }
            return b(str2, i10);
        } catch (Exception unused2) {
            return i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[Catch: all -> 0x0010, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:21:0x0046, B:23:0x004a, B:24:0x0052, B:12:0x0012, B:14:0x001a, B:16:0x002a, B:17:0x0036, B:20:0x0044), top: B:35:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(boolean r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f15502d
            monitor-enter(r0)
            com.mbridge.msdk.setting.g r1 = r2.f15508j     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            boolean r1 = r2.e()     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            if (r3 != 0) goto L46
            goto L12
        L10:
            r3 = move-exception
            goto L60
        L12:
            java.lang.String r3 = r2.f15504f     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            if (r3 == 0) goto L36
            com.mbridge.msdk.foundation.controller.c r3 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            java.lang.String r3 = r3.b()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            r2.f15504f = r3     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            if (r3 == 0) goto L36
            com.mbridge.msdk.foundation.buffer.sharedperference.a r3 = com.mbridge.msdk.foundation.buffer.sharedperference.a.b()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            java.lang.String r1 = "app_id"
            java.lang.String r3 = r3.a(r1)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            r2.f15504f = r3     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
        L36:
            com.mbridge.msdk.setting.h r3 = com.mbridge.msdk.setting.h.b()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            java.lang.String r1 = r2.f15504f     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            com.mbridge.msdk.setting.g r3 = r3.b(r1)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            r2.f15508j = r3     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            goto L46
        L43:
            r3 = 0
            r2.f15508j = r3     // Catch: java.lang.Throwable -> L10
        L46:
            com.mbridge.msdk.setting.g r3 = r2.f15508j     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L52
            com.mbridge.msdk.setting.g r3 = r2.f15508j     // Catch: java.lang.Throwable -> L10
            org.json.JSONObject r3 = r3.n0()     // Catch: java.lang.Throwable -> L10
            r2.f15503e = r3     // Catch: java.lang.Throwable -> L10
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            com.mbridge.msdk.setting.g r3 = r2.f15508j
            if (r3 == 0) goto L5e
            org.json.JSONObject r3 = r2.f15503e
            if (r3 != 0) goto L5c
            goto L5e
        L5c:
            r3 = 0
            goto L5f
        L5e:
            r3 = 1
        L5f:
            return r3
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.s0.a(boolean):boolean");
    }

    public boolean b(String str, boolean z10, boolean z11) {
        Boolean boolValueOf;
        Boolean boolA;
        if (TextUtils.isEmpty(str)) {
            return z10;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMapB = b();
        if (z11 && (boolA = a(str, concurrentHashMapB)) != null) {
            return boolA.booleanValue();
        }
        try {
            boolValueOf = Boolean.valueOf(a(str, z10, z11));
        } catch (Exception unused) {
            boolValueOf = Boolean.valueOf(z10);
        }
        concurrentHashMapB.put(str, boolValueOf);
        return boolValueOf.booleanValue();
    }

    private ConcurrentHashMap<String, Boolean> b() {
        synchronized (this.f15501c) {
            try {
                if (this.f15505g == null) {
                    this.f15505g = new ConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f15505g;
    }
}
