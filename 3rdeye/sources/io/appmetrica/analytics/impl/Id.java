package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes3.dex */
public final class Id {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39629a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4559db f39630b;

    /* renamed from: c, reason: collision with root package name */
    public final P9 f39631c;

    /* renamed from: d, reason: collision with root package name */
    public final Me f39632d;

    /* renamed from: e, reason: collision with root package name */
    public final C4726jo f39633e;

    /* renamed from: f, reason: collision with root package name */
    public volatile IdentifiersResult f39634f;

    public Id(Context context, InterfaceC4559db interfaceC4559db) {
        this(context, interfaceC4559db, Jd.a(context), new Me(context), new C4726jo());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:10:0x0019, B:12:0x0029, B:14:0x002f, B:17:0x003d, B:19:0x0056, B:20:0x0064, B:22:0x006f), top: B:34:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.internal.IdentifiersResult a() {
        /*
            r5 = this;
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r5.f39634f
            if (r0 == 0) goto L18
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r1 = r0.status
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK
            if (r1 != r2) goto L18
            io.appmetrica.analytics.impl.jo r1 = r5.f39633e
            java.lang.String r2 = r0.id
            r1.getClass()
            boolean r1 = io.appmetrica.analytics.impl.C4726jo.a(r2)
            if (r1 == 0) goto L18
            return r0
        L18:
            r1 = 0
            io.appmetrica.analytics.impl.P9 r2 = r5.f39631c     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.locks.ReentrantLock r3 = r2.f39967a     // Catch: java.lang.Throwable -> L79
            r3.lock()     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.ra r2 = r2.f39968b     // Catch: java.lang.Throwable -> L79
            r2.a()     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r5.f39634f     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L3d
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = r0.status     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r3 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK     // Catch: java.lang.Throwable -> L79
            if (r2 != r3) goto L3d
            io.appmetrica.analytics.impl.jo r2 = r5.f39633e     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r0.id     // Catch: java.lang.Throwable -> L79
            r2.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r2 = io.appmetrica.analytics.impl.C4726jo.a(r3)     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L3d
            goto L79
        L3d:
            io.appmetrica.analytics.impl.Me r2 = r5.f39632d     // Catch: java.lang.Throwable -> L79
            android.content.Context r2 = r2.f39863a     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "uuid.dat"
            java.io.File r2 = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromSdkStorage(r2, r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = io.appmetrica.analytics.impl.AbstractC4533cb.a(r2)     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.jo r3 = r5.f39633e     // Catch: java.lang.Throwable -> L79
            r3.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r3 = io.appmetrica.analytics.impl.C4726jo.a(r2)     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L64
            io.appmetrica.analytics.impl.db r2 = r5.f39630b     // Catch: java.lang.Throwable -> L79
            android.content.Context r3 = r5.f39629a     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.Me r3 = r5.f39632d     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r3.a(r2)     // Catch: java.lang.Throwable -> L79
        L64:
            io.appmetrica.analytics.impl.jo r3 = r5.f39633e     // Catch: java.lang.Throwable -> L79
            r3.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r3 = io.appmetrica.analytics.impl.C4726jo.a(r2)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L79
            io.appmetrica.analytics.internal.IdentifiersResult r3 = new io.appmetrica.analytics.internal.IdentifiersResult     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r4 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK     // Catch: java.lang.Throwable -> L79
            r3.<init>(r2, r4, r1)     // Catch: java.lang.Throwable -> L79
            r5.f39634f = r3     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = r3
        L79:
            io.appmetrica.analytics.impl.P9 r2 = r5.f39631c
            io.appmetrica.analytics.impl.ra r3 = r2.f39968b
            r3.b()
            java.util.concurrent.locks.ReentrantLock r2 = r2.f39967a
            r2.unlock()
            if (r0 == 0) goto L88
            goto L91
        L88:
            io.appmetrica.analytics.internal.IdentifiersResult r0 = new io.appmetrica.analytics.internal.IdentifiersResult
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN
            java.lang.String r3 = "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)"
            r0.<init>(r1, r2, r3)
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Id.a():io.appmetrica.analytics.internal.IdentifiersResult");
    }

    public Id(Context context, InterfaceC4559db interfaceC4559db, P9 p92, Me me, C4726jo c4726jo) {
        this.f39629a = context;
        this.f39630b = interfaceC4559db;
        this.f39631c = p92;
        this.f39632d = me;
        this.f39633e = c4726jo;
        try {
            p92.a();
            me.a();
            p92.b();
        } catch (Throwable unused) {
            this.f39631c.b();
        }
    }
}
