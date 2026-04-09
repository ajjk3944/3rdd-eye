package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15321b;

    public /* synthetic */ qe(int i4, Object obj) {
        this.f15320a = i4;
        this.f15321b = obj;
    }

    private final Object a() throws GeneralSecurityException, IOException {
        List listAsList;
        byte[] byteArray;
        s91 s91VarQ;
        av0 av0VarZ;
        ByteArrayOutputStream byteArrayOutputStream;
        ll0 ll0Var = (ll0) this.f15321b;
        pk pkVar = sk.N7;
        va.s sVar = va.s.f36163e;
        String strEncodeToString = null;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            hq0 hq0Var = ll0Var.f13527b;
            if (ll0Var.f13528c != 2) {
                String strX = u6.t.x(hq0Var.f11944d);
                if (((Boolean) sVar.f36166c.a(sk.P7)).booleanValue()) {
                    listAsList = Arrays.asList(((String) sVar.f36166c.a(sk.Q7)).split(","));
                } else {
                    listAsList = Arrays.asList(((String) sVar.f36166c.a(sk.O7)).split(","));
                }
                if (listAsList.contains(u6.t.v(strX))) {
                    try {
                        kd1 kd1Var = kd1.f13140b;
                        synchronized (kd1Var) {
                            HashMap map = kd1Var.f13141a;
                            if (!map.containsKey("AES128_GCM")) {
                                throw new GeneralSecurityException("Name AES128_GCM does not exist");
                            }
                            s91VarQ = (s91) map.get("AES128_GCM");
                        }
                        if (s91VarQ == null) {
                            try {
                                s91VarQ = yr1.q(((qh1) ((ce1) md1.f13875b.h(null)).f10095c).b());
                            } catch (GeneralSecurityException e2) {
                                throw new ac.m("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e2);
                            }
                        }
                        av0VarZ = av0.z(s91VarQ);
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                        } catch (IOException unused) {
                            throw new GeneralSecurityException("Serialize keyset failed");
                        }
                    } catch (GeneralSecurityException e10) {
                        ya.a0.m("Failed to generate key".concat(e10.toString()));
                        ua.j.C.f35265h.f("CryptoUtils.generateKey", e10);
                        byteArray = new byte[0];
                    }
                    try {
                        av0VarZ.i().c(byteArrayOutputStream);
                        byteArrayOutputStream.close();
                        byteArray = byteArrayOutputStream.toByteArray();
                        strEncodeToString = Base64.encodeToString(byteArray, 11);
                    } catch (Throwable th2) {
                        byteArrayOutputStream.close();
                        throw th2;
                    }
                }
            }
        }
        return new ml0(strEncodeToString, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object b() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f15321b
            com.google.android.gms.internal.ads.xl0 r0 = (com.google.android.gms.internal.ads.xl0) r0
            java.lang.Object r0 = r0.f18422c
            r1 = r0
            com.google.android.gms.internal.ads.ff0 r1 = (com.google.android.gms.internal.ads.ff0) r1
            com.google.android.gms.internal.ads.ym0 r2 = new com.google.android.gms.internal.ads.ym0
            monitor-enter(r1)
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.f16155ha     // Catch: java.lang.Throwable -> L48
            va.s r3 = va.s.f36163e     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.rk r4 = r3.f36166c     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r4.a(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L48
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L58
            boolean r0 = r1.g()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L25
            goto L58
        L25:
            long r4 = r1.f11143q     // Catch: java.lang.Throwable -> L48
            ua.j r0 = ua.j.C     // Catch: java.lang.Throwable -> L48
            tb.a r0 = r0.f35267k     // Catch: java.lang.Throwable -> L48
            r0.getClass()     // Catch: java.lang.Throwable -> L48
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L48
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L4a
            java.lang.String r0 = "{}"
            r1.f11141o = r0     // Catch: java.lang.Throwable -> L48
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.f11143q = r4     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = ""
            monitor-exit(r1)
            goto L5b
        L48:
            r0 = move-exception
            goto L8a
        L4a:
            java.lang.String r0 = r1.f11141o     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = "{}"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L58
            java.lang.String r0 = r1.f11141o     // Catch: java.lang.Throwable -> L48
            monitor-exit(r1)
            goto L5b
        L58:
            java.lang.String r0 = ""
            monitor-exit(r1)
        L5b:
            boolean r4 = r1.c()
            ua.j r5 = ua.j.C
            t5.p r5 = r5.f35271o
            boolean r5 = r5.n()
            org.json.JSONObject r6 = r1.f11142p
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L6f
            r6 = r8
            goto L70
        L6f:
            r6 = r7
        L70:
            long r9 = r1.f11149w
            com.google.android.gms.internal.ads.pk r1 = com.google.android.gms.internal.ads.sk.Ca
            com.google.android.gms.internal.ads.rk r3 = r3.f36166c
            java.lang.Object r1 = r3.a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r11 = r1.longValue()
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 >= 0) goto L85
            r7 = r8
        L85:
            r3 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L8a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qe.b():java.lang.Object");
    }

    private final Object c() {
        HashMap map;
        be0 be0Var = (be0) ((xl0) this.f15321b).f18422c;
        synchronized (be0Var) {
            map = new HashMap();
            if (((Boolean) va.s.f36163e.f36166c.a(sk.G8)).booleanValue()) {
                be0Var.b();
                for (Map.Entry entry : be0Var.f9656a.entrySet()) {
                    map.put((ae0) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
                }
            }
        }
        return new cn0(map, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[Catch: IOException -> 0x0038, TryCatch #0 {IOException -> 0x0038, blocks: (B:3:0x0005, B:5:0x0020, B:7:0x0032, B:12:0x003d, B:17:0x0063, B:18:0x0087, B:20:0x0099, B:22:0x00af, B:24:0x00b8, B:29:0x00da, B:31:0x00f8, B:33:0x011c, B:34:0x0121, B:42:0x013b, B:40:0x0137, B:27:0x00ca, B:15:0x0051, B:35:0x0122, B:36:0x0130), top: B:46:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da A[Catch: IOException -> 0x0038, TryCatch #0 {IOException -> 0x0038, blocks: (B:3:0x0005, B:5:0x0020, B:7:0x0032, B:12:0x003d, B:17:0x0063, B:18:0x0087, B:20:0x0099, B:22:0x00af, B:24:0x00b8, B:29:0x00da, B:31:0x00f8, B:33:0x011c, B:34:0x0121, B:42:0x013b, B:40:0x0137, B:27:0x00ca, B:15:0x0051, B:35:0x0122, B:36:0x0130), top: B:46:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object d() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qe.d():java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x035d  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() throws com.google.android.gms.internal.ads.kq0 {
        /*
            Method dump skipped, instructions count: 1738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qe.call():java.lang.Object");
    }
}
