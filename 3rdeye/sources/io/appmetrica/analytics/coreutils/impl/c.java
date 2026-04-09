package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafePackageManager f38909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f38910b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SafePackageManager safePackageManager, Context context) {
        super(0);
        this.f38909a = safePackageManager;
        this.f38910b = context;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        SafePackageManager safePackageManager = this.f38909a;
        Context context = this.f38910b;
        ApplicationInfo applicationInfo = safePackageManager.getApplicationInfo(context, context.getPackageName(), 128);
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }
}
