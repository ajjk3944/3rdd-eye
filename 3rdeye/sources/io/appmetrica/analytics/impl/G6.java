package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class G6 {

    /* renamed from: a, reason: collision with root package name */
    public final C4971ta f39482a;

    /* renamed from: b, reason: collision with root package name */
    public final C5092y6 f39483b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f39484c;

    /* renamed from: d, reason: collision with root package name */
    public final C4945sa f39485d;

    public G6(Context context) {
        this(context, new C4971ta(), new C5092y6(), C4945sa.a(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(io.appmetrica.analytics.impl.Gh r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f39484c
            java.io.File r0 = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getCrashesDirectory(r0)
            io.appmetrica.analytics.impl.y6 r1 = r6.f39483b
            r1.getClass()
            if (r0 != 0) goto Lf
            goto Laf
        Lf:
            boolean r1 = r0.exists()
            if (r1 == 0) goto L27
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L1c
            goto L2d
        L1c:
            boolean r1 = r0.delete()
            if (r1 == 0) goto Laf
            boolean r1 = r0.mkdir()
            goto L2b
        L27:
            boolean r1 = r0.mkdir()
        L2b:
            if (r1 == 0) goto Laf
        L2d:
            io.appmetrica.analytics.impl.Qh r1 = r7.f39537e
            io.appmetrica.analytics.impl.Nf r1 = r1.f40683a
            android.content.ContentValues r2 = r1.f39902a
            java.lang.String r3 = "PROCESS_CFG_PROCESS_ID"
            java.lang.Integer r2 = r2.getAsInteger(r3)
            android.content.ContentValues r1 = r1.f39902a
            java.lang.String r3 = "PROCESS_CFG_PROCESS_SESSION_ID"
            java.lang.String r1 = r1.getAsString(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "-"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            io.appmetrica.analytics.impl.sa r2 = r6.f39485d
            io.appmetrica.analytics.impl.P9 r2 = r2.b(r1)
            java.util.concurrent.locks.ReentrantLock r3 = r2.f39967a     // Catch: java.lang.Throwable -> La3
            r3.lock()     // Catch: java.lang.Throwable -> La3
            io.appmetrica.analytics.impl.ra r3 = r2.f39968b     // Catch: java.lang.Throwable -> La3
            r3.a()     // Catch: java.lang.Throwable -> La3
            io.appmetrica.analytics.impl.ta r3 = r6.f39482a     // Catch: java.lang.Throwable -> La3
            r3.getClass()     // Catch: java.lang.Throwable -> La3
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> La3
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> La3
            java.io.PrintWriter r0 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> La3
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> La3
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La3
            r5.<init>(r3)     // Catch: java.lang.Throwable -> La3
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La3
            r0.<init>(r4)     // Catch: java.lang.Throwable -> La3
            io.appmetrica.analytics.impl.Cb r3 = new io.appmetrica.analytics.impl.Cb     // Catch: java.lang.Throwable -> La4
            io.appmetrica.analytics.impl.i6 r4 = r7.f39533a     // Catch: java.lang.Throwable -> La4
            io.appmetrica.analytics.impl.Qh r5 = r7.f39537e     // Catch: java.lang.Throwable -> La4
            java.util.HashMap r7 = r7.f39536d     // Catch: java.lang.Throwable -> La4
            r3.<init>(r4, r5, r7)     // Catch: java.lang.Throwable -> La4
            java.lang.String r7 = r3.k()     // Catch: java.lang.Throwable -> La4
            r0.write(r7)     // Catch: java.lang.Throwable -> La4
            io.appmetrica.analytics.impl.AbstractC4623fo.a(r0)
            r2.c()
            io.appmetrica.analytics.impl.sa r7 = r6.f39485d
            monitor-enter(r7)
            java.util.HashMap r0 = r7.f41634b     // Catch: java.lang.Throwable -> La0
            r0.remove(r1)     // Catch: java.lang.Throwable -> La0
            monitor-exit(r7)
            return
        La0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        La3:
            r0 = 0
        La4:
            io.appmetrica.analytics.impl.AbstractC4623fo.a(r0)
            r2.c()
            io.appmetrica.analytics.impl.sa r7 = r6.f39485d
            r7.a(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.G6.a(io.appmetrica.analytics.impl.Gh):void");
    }

    public G6(Context context, C4971ta c4971ta, C5092y6 c5092y6, C4945sa c4945sa) {
        this.f39484c = context;
        this.f39482a = c4971ta;
        this.f39483b = c5092y6;
        this.f39485d = c4945sa;
    }
}
