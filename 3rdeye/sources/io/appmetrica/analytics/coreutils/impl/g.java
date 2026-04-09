package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f38919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38920b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str) {
        super(0);
        this.f38919a = context;
        this.f38920b = str;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        return Boolean.valueOf(this.f38919a.getPackageManager().hasSystemFeature(this.f38920b));
    }
}
