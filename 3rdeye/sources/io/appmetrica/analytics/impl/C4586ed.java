package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4586ed implements InterfaceC4777ln {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40807a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f40808b;

    /* renamed from: c, reason: collision with root package name */
    public final CellularNetworkTypeExtractor f40809c;

    /* renamed from: d, reason: collision with root package name */
    public final CachedDataProvider.CachedData f40810d;

    public C4586ed(Context context) {
        this.f40807a = context;
        this.f40808b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(Ga.j().i(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f40809c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f40810d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4777ln
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized C4561dd a() {
        C4561dd c4561dd;
        try {
            c4561dd = (C4561dd) this.f40810d.getData();
            if (c4561dd == null || this.f40810d.shouldUpdateData()) {
                c4561dd = new C4561dd(this.f40808b.hasNecessaryPermissions(this.f40807a) ? this.f40809c.getNetworkType() : "unknown");
                this.f40810d.setData(c4561dd);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c4561dd;
    }
}
