package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* loaded from: classes3.dex */
public final class Q9 implements IExecutionPolicy {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumSet f40011c = EnumSet.of(Re.OFFLINE);

    /* renamed from: a, reason: collision with root package name */
    public final I5 f40012a = new I5();

    /* renamed from: b, reason: collision with root package name */
    public final Context f40013b;

    public Q9(Context context) {
        this.f40013b = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        I5 i52 = this.f40012a;
        Context context = this.f40013b;
        i52.getClass();
        SafePackageManager safePackageManager = Se.f40106a;
        return !f40011c.contains((Re) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", Re.UNDEFINED, new Qe()));
    }
}
