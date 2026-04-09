package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;

/* loaded from: classes3.dex */
public final class SinglePermissionStrategy implements PermissionResolutionStrategy {

    /* renamed from: a, reason: collision with root package name */
    private final PermissionExtractor f38960a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38961b;

    public SinglePermissionStrategy(PermissionExtractor permissionExtractor, String str) {
        this.f38960a = permissionExtractor;
        this.f38961b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(Context context) {
        return this.f38960a.hasPermission(context, this.f38961b);
    }
}
