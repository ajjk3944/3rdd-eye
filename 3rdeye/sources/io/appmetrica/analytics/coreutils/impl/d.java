package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f38911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38912b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str) {
        super(0);
        this.f38911a = context;
        this.f38912b = str;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        PackageManager packageManager = this.f38911a.getPackageManager();
        return AndroidUtils.isApiAchieved(30) ? SafePackageManagerHelperForR.extractPackageInstaller(packageManager, this.f38912b) : packageManager.getInstallerPackageName(this.f38912b);
    }
}
