package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import b9.C1992A;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f38929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f38930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38931c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i, int i10) {
        super(0);
        this.f38929a = context;
        this.f38930b = componentName;
        this.f38931c = i;
        this.f38932d = i10;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        this.f38929a.getPackageManager().setComponentEnabledSetting(this.f38930b, this.f38931c, this.f38932d);
        return C1992A.f18074a;
    }
}
