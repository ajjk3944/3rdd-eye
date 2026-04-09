package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f38906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38907b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, int i) {
        super(0);
        this.f38906a = context;
        this.f38907b = str;
        this.f38908c = i;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        return this.f38906a.getPackageManager().getApplicationInfo(this.f38907b, this.f38908c);
    }
}
