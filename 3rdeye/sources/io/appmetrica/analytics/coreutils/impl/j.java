package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f38926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f38927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Intent intent, int i) {
        super(0);
        this.f38926a = context;
        this.f38927b = intent;
        this.f38928c = i;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        return this.f38926a.getPackageManager().resolveService(this.f38927b, this.f38928c);
    }
}
