package io.appmetrica.analytics.impl;

import android.content.Context;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class P extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f39949a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(T t10) {
        super(0);
        this.f39949a = t10;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        T t10 = this.f39949a;
        M m10 = t10.f40140f;
        Context context = t10.f40135a;
        m10.getClass();
        return M.a(new K(m10, context));
    }
}
