package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class be0 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f9656a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x0001, B:8:0x001a, B:10:0x001f, B:12:0x0028, B:13:0x002d, B:15:0x0031, B:16:0x0036, B:17:0x0045, B:18:0x0046, B:20:0x0055, B:22:0x005b, B:24:0x0064, B:28:0x006c, B:30:0x0071, B:32:0x007a, B:33:0x007f, B:35:0x0083, B:36:0x0088, B:37:0x0097, B:38:0x0098, B:44:0x00a8, B:48:0x00d6, B:50:0x00e0, B:51:0x00e8, B:52:0x00ef, B:54:0x00f5, B:55:0x00f9, B:57:0x010e, B:58:0x0117, B:60:0x011d, B:62:0x012b, B:64:0x0131, B:65:0x0143, B:67:0x0149, B:69:0x015b, B:71:0x0163, B:75:0x0174, B:77:0x017c, B:79:0x0182, B:81:0x018b, B:82:0x0194, B:45:0x00b7, B:46:0x00c6), top: B:89:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(long r8, long r10, int r12) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.be0.a(long, long, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r9 = this;
            ua.j r0 = ua.j.C
            tb.a r0 = r0.f35267k
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            j$.util.concurrent.ConcurrentHashMap r2 = r9.f9656a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La5
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.ads.ae0 r4 = (com.google.android.gms.internal.ads.ae0) r4
            java.lang.Object r3 = r3.getValue()
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            int r4 = r4.f9313b
            r5 = 0
            if (r4 == 0) goto L3c
            r7 = 1
            if (r4 == r7) goto L60
            r7 = 2
            if (r4 == r7) goto L4f
            r7 = 3
            if (r4 == r7) goto L3e
        L3c:
            r7 = r5
            goto L70
        L3e:
            com.google.android.gms.internal.ads.pk r4 = com.google.android.gms.internal.ads.sk.L8
            va.s r7 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r7 = r7.f36166c
            java.lang.Object r4 = r7.a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L70
        L4f:
            com.google.android.gms.internal.ads.pk r4 = com.google.android.gms.internal.ads.sk.K8
            va.s r7 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r7 = r7.f36166c
            java.lang.Object r4 = r7.a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L70
        L60:
            com.google.android.gms.internal.ads.pk r4 = com.google.android.gms.internal.ads.sk.J8
            va.s r7 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r7 = r7.f36166c
            java.lang.Object r4 = r7.a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
        L70:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L78
            r2.remove()
            r7 = r5
        L78:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L15
            java.util.Iterator r4 = r3.iterator()
        L80:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r4.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = r0 - r5
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L9a
            r4.remove()
            goto L80
        L9a:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L15
            r2.remove()
            goto L15
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.be0.b():void");
    }
}
