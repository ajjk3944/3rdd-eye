package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.InitializationListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class ml2 implements ws {

    /* renamed from: a, reason: collision with root package name */
    private final InitializationListener f30436a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            ml2.this.f30436a.onInitializationCompleted();
            return C1992A.f18074a;
        }
    }

    public ml2(InitializationListener initializationListener) {
        kotlin.jvm.internal.l.f(initializationListener, "initializationListener");
        this.f30436a = initializationListener;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ml2) && kotlin.jvm.internal.l.b(((ml2) obj).f30436a, this.f30436a);
    }

    public final int hashCode() {
        return this.f30436a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void onInitializationCompleted() {
        new CallbackStackTraceMarker(new a());
    }
}
