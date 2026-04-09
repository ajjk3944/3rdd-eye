package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f38921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f38922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Intent intent, int i) {
        super(0);
        this.f38921a = context;
        this.f38922b = intent;
        this.f38923c = i;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        return this.f38921a.getPackageManager().resolveActivity(this.f38922b, this.f38923c);
    }
}
