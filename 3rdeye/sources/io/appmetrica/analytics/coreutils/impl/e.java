package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f38913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, int i) {
        super(0);
        this.f38913a = context;
        this.f38914b = str;
        this.f38915c = i;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        return this.f38913a.getPackageManager().getPackageInfo(this.f38914b, this.f38915c);
    }
}
