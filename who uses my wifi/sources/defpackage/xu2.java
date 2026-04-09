package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xu2 {
    public final HashMap a = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(java.lang.String r6, defpackage.u83 r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.HashMap r0 = r5.a     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            wu2 r0 = new wu2     // Catch: java.lang.Throwable -> L4e
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L20
        L12:
            w62 r2 = r7.a     // Catch: java.lang.Throwable -> L19
            i82 r2 = r2.H()     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r2 = move-exception
            n83 r3 = new n83     // Catch: defpackage.n83 -> L10 java.lang.Throwable -> L4e
            r3.<init>(r2)     // Catch: defpackage.n83 -> L10 java.lang.Throwable -> L4e
            throw r3     // Catch: defpackage.n83 -> L10 java.lang.Throwable -> L4e
        L20:
            if (r7 != 0) goto L23
            goto L31
        L23:
            w62 r3 = r7.a     // Catch: java.lang.Throwable -> L2a
            i82 r1 = r3.Z2()     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r3 = move-exception
            n83 r4 = new n83     // Catch: defpackage.n83 -> L31 java.lang.Throwable -> L4e
            r4.<init>(r3)     // Catch: defpackage.n83 -> L31 java.lang.Throwable -> L4e
            throw r4     // Catch: defpackage.n83 -> L31 java.lang.Throwable -> L4e
        L31:
            iz1 r3 = defpackage.mz1.fa     // Catch: java.lang.Throwable -> L4e
            tw1 r4 = defpackage.tw1.e     // Catch: java.lang.Throwable -> L4e
            kz1 r4 = r4.c     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L4e
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L4e
            r4 = 1
            if (r3 != 0) goto L45
            goto L50
        L45:
            r3 = 0
            if (r7 != 0) goto L4a
        L48:
            r4 = r3
            goto L50
        L4a:
            r7.a()     // Catch: defpackage.n83 -> L48 java.lang.Throwable -> L4e
            goto L50
        L4e:
            r6 = move-exception
            goto L5a
        L50:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L4e
            java.util.HashMap r7 = r5.a     // Catch: java.lang.Throwable -> L4e
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r5)
            return
        L5a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xu2.a(java.lang.String, u83):void");
    }

    public final synchronized wu2 b(String str) {
        return (wu2) this.a.get(str);
    }
}
