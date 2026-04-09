package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f38924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38925b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str) {
        super(0);
        this.f38924a = context;
        this.f38925b = str;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        PackageManager packageManager = this.f38924a.getPackageManager();
        return AndroidUtils.isApiAchieved(33) ? PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.f38925b) : packageManager.resolveContentProvider(this.f38925b, 128);
    }
}
