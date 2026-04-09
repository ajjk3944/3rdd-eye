package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f38903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f38904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ComponentName componentName, int i) {
        super(0);
        this.f38903a = context;
        this.f38904b = componentName;
        this.f38905c = i;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        return this.f38903a.getPackageManager().getActivityInfo(this.f38904b, this.f38905c);
    }
}
