package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.kl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4749kl implements InterfaceC4777ln {

    /* renamed from: d, reason: collision with root package name */
    public static final long f41152d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a, reason: collision with root package name */
    public final Context f41153a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f41154b;

    /* renamed from: c, reason: collision with root package name */
    public final CachedDataProvider.CachedData f41155c;

    public C4749kl(Context context) {
        long j4 = f41152d;
        this.f41155c = new CachedDataProvider.CachedData(j4, j4, "sim-info");
        this.f41153a = context;
        this.f41154b = Ga.j().i();
    }

    public final C4620fl b() {
        return new C4620fl((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f41153a, "phone", "getting SimMcc", "TelephonyManager", new C4646gl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f41153a, "phone", "getting SimMnc", "TelephonyManager", new C4672hl()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f41153a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C4723jl(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f41153a, "phone", "getting SimOperatorName", "TelephonyManager", new C4697il()));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC4777ln
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<io.appmetrica.analytics.impl.C4620fl> a() {
        /*
            r4 = this;
            monitor-enter(r4)
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r0 = r4.f41155c     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.getData()     // Catch: java.lang.Throwable -> L1a
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L66
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r1 = r4.f41155c     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.shouldUpdateData()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L66
            goto L1c
        L1a:
            r0 = move-exception
            goto L68
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            io.appmetrica.analytics.impl.Ga r1 = io.appmetrica.analytics.impl.Ga.f39501F     // Catch: java.lang.Throwable -> L1a
            io.appmetrica.analytics.impl.em r1 = r1.f39526u     // Catch: java.lang.Throwable -> L1a
            io.appmetrica.analytics.impl.cm r1 = r1.b()     // Catch: java.lang.Throwable -> L1a
            io.appmetrica.analytics.impl.G4 r1 = r1.f40652n     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.f39478d     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L61
            r1 = 23
            boolean r1 = io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(r1)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L5a
            io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor r1 = r4.f41154b     // Catch: java.lang.Throwable -> L1a
            android.content.Context r2 = r4.f41153a     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            boolean r1 = r1.hasPermission(r2, r3)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L4c
            android.content.Context r1 = r4.f41153a     // Catch: java.lang.Throwable -> L1a
            java.util.List r1 = io.appmetrica.analytics.impl.C4775ll.a(r1)     // Catch: java.lang.Throwable -> L1a
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L1a
        L4c:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L61
            io.appmetrica.analytics.impl.fl r1 = r4.b()     // Catch: java.lang.Throwable -> L1a
            r0.add(r1)     // Catch: java.lang.Throwable -> L1a
            goto L61
        L5a:
            io.appmetrica.analytics.impl.fl r1 = r4.b()     // Catch: java.lang.Throwable -> L1a
            r0.add(r1)     // Catch: java.lang.Throwable -> L1a
        L61:
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r1 = r4.f41155c     // Catch: java.lang.Throwable -> L1a
            r1.setData(r0)     // Catch: java.lang.Throwable -> L1a
        L66:
            monitor-exit(r4)
            return r0
        L68:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4749kl.a():java.util.List");
    }
}
