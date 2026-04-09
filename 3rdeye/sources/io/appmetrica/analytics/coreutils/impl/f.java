package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f38916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f38917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, ComponentName componentName, int i) {
        super(0);
        this.f38916a = context;
        this.f38917b = componentName;
        this.f38918c = i;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        return this.f38916a.getPackageManager().getServiceInfo(this.f38917b, this.f38918c);
    }
}
