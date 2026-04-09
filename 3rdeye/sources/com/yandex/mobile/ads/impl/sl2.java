package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.InstreamAdListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class sl2 implements fl0 {

    /* renamed from: a, reason: collision with root package name */
    private final InstreamAdListener f33111a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33113c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f33113c = str;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            sl2.this.f33111a.onError(this.f33113c);
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public b() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            sl2.this.f33111a.onInstreamAdCompleted();
            return C1992A.f18074a;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public c() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            sl2.this.f33111a.onInstreamAdPrepared();
            return C1992A.f18074a;
        }
    }

    public sl2(InstreamAdListener instreamAdListener) {
        kotlin.jvm.internal.l.f(instreamAdListener, "instreamAdListener");
        this.f33111a = instreamAdListener;
    }

    @Override // com.yandex.mobile.ads.impl.fl0
    public final void onError(String reason) {
        kotlin.jvm.internal.l.f(reason, "reason");
        new CallbackStackTraceMarker(new a(reason));
    }

    @Override // com.yandex.mobile.ads.impl.fl0
    public final void onInstreamAdCompleted() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.fl0
    public final void onInstreamAdPrepared() {
        new CallbackStackTraceMarker(new c());
    }
}
