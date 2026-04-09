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
import q2.C2841s;
import t2.AbstractC2907C;

/* loaded from: classes.dex */
public final /* synthetic */ class J6 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9258b;

    public /* synthetic */ J6(int i, Object obj) {
        this.f9257a = i;
        this.f9258b = obj;
    }

    private final Object a() throws GeneralSecurityException, IOException {
        List listAsList;
        byte[] byteArray;
        AbstractC1089eE abstractC1089eER;
        Nr nr = (Nr) this.f9258b;
        E9 e9 = H9.N7;
        C2841s c2841s = C2841s.f23267e;
        String strEncodeToString = null;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            C0960bu c0960bu = nr.f10083b;
            if (nr.f10084c != 2) {
                String strB = I5.b.B(c0960bu.f13482d);
                if (((Boolean) c2841s.f23270c.a(H9.P7)).booleanValue()) {
                    listAsList = Arrays.asList(((String) c2841s.f23270c.a(H9.Q7)).split(","));
                } else {
                    listAsList = Arrays.asList(((String) c2841s.f23270c.a(H9.O7)).split(","));
                }
                if (listAsList.contains(I5.b.A(strB))) {
                    try {
                        XF xf = XF.f12406b;
                        synchronized (xf) {
                            HashMap map = xf.f12407a;
                            if (!map.containsKey("AES128_GCM")) {
                                throw new GeneralSecurityException("Name AES128_GCM does not exist");
                            }
                            abstractC1089eER = (AbstractC1089eE) map.get("AES128_GCM");
                        }
                        if (abstractC1089eER == null) {
                            try {
                                abstractC1089eER = C1476lN.r(((C1685pG) ZF.f12810b.h(null)).f16155b.b());
                            } catch (GeneralSecurityException e6) {
                                throw new J0.c("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e6);
                            }
                        }
                        C2041vw c2041vwZ = C2041vw.z(abstractC1089eER);
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                c2041vwZ.g().c(byteArrayOutputStream);
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                            } catch (Throwable th) {
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } catch (IOException unused) {
                            throw new GeneralSecurityException("Serialize keyset failed");
                        }
                    } catch (GeneralSecurityException e7) {
                        AbstractC2907C.m("Failed to generate key".concat(e7.toString()));
                        p2.j.f22785C.f22795h.f("CryptoUtils.generateKey", e7);
                        byteArray = new byte[0];
                    }
                    strEncodeToString = Base64.encodeToString(byteArray, 11);
                }
            }
        }
        return new Or(strEncodeToString, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object b() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f9258b
            com.google.android.gms.internal.ads.Yr r0 = (com.google.android.gms.internal.ads.Yr) r0
            java.lang.Object r0 = r0.f12716c
            r1 = r0
            com.google.android.gms.internal.ads.Jo r1 = (com.google.android.gms.internal.ads.C0581Jo) r1
            com.google.android.gms.internal.ads.ws r2 = new com.google.android.gms.internal.ads.ws
            monitor-enter(r1)
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.fa     // Catch: java.lang.Throwable -> L48
            q2.s r3 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.G9 r4 = r3.f23270c     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r4.a(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L48
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L58
            boolean r0 = r1.g()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L25
            goto L58
        L25:
            long r4 = r1.f9364q     // Catch: java.lang.Throwable -> L48
            p2.j r0 = p2.j.f22785C     // Catch: java.lang.Throwable -> L48
            Q2.a r0 = r0.f22797k     // Catch: java.lang.Throwable -> L48
            r0.getClass()     // Catch: java.lang.Throwable -> L48
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L48
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L4a
            java.lang.String r0 = "{}"
            r1.f9362o = r0     // Catch: java.lang.Throwable -> L48
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.f9364q = r4     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = ""
            monitor-exit(r1)
            goto L5b
        L48:
            r0 = move-exception
            goto L8a
        L4a:
            java.lang.String r0 = r1.f9362o     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = "{}"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L58
            java.lang.String r0 = r1.f9362o     // Catch: java.lang.Throwable -> L48
            monitor-exit(r1)
            goto L5b
        L58:
            java.lang.String r0 = ""
            monitor-exit(r1)
        L5b:
            boolean r4 = r1.c()
            p2.j r5 = p2.j.f22785C
            t2.l r5 = r5.f22801o
            boolean r5 = r5.g()
            org.json.JSONObject r6 = r1.f9363p
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L6f
            r6 = r8
            goto L70
        L6f:
            r6 = r7
        L70:
            long r9 = r1.f9370w
            com.google.android.gms.internal.ads.E9 r1 = com.google.android.gms.internal.ads.H9.Aa
            com.google.android.gms.internal.ads.G9 r3 = r3.f23270c
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.J6.b():java.lang.Object");
    }

    private final Object c() {
        HashMap map;
        C1280ho c1280ho = (C1280ho) ((Yr) this.f9258b).f12716c;
        synchronized (c1280ho) {
            map = new HashMap();
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.G8)).booleanValue()) {
                c1280ho.b();
                for (Map.Entry entry : c1280ho.f14586a.entrySet()) {
                    map.put((C1226go) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
                }
            }
        }
        return new C2253zs(map, 0);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.J6.d():java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0243 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0272  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:279:0x06e1 -> B:281:0x06ed). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() throws com.google.android.gms.internal.ads.C1123eu {
        /*
            Method dump skipped, instructions count: 2412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.J6.call():java.lang.Object");
    }
}
