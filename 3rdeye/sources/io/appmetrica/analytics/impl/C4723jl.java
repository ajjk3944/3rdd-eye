package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.jl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4723jl implements FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4749kl f41121a;

    public C4723jl(C4749kl c4749kl) {
        this.f41121a = c4749kl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, I.a
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C4749kl c4749kl = this.f41121a;
        if (c4749kl.f41154b.hasPermission(c4749kl.f41153a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
