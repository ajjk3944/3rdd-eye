package io.appmetrica.analytics.impl;

import android.content.Context;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class S extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f40079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Qi f40080b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t10, Qi qi) {
        super(0);
        this.f40079a = t10;
        this.f40080b = qi;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        T t10 = this.f40079a;
        M m10 = t10.f40142h;
        Context context = t10.f40135a;
        Qi qi = this.f40080b;
        m10.getClass();
        return M.a(new L(m10, context, qi));
    }
}
