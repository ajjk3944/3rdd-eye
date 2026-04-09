package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class pl2 implements ct0 {

    /* renamed from: a, reason: collision with root package name */
    private final InstreamAdBreakEventListener f31818a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            pl2.this.f31818a.onInstreamAdBreakCompleted();
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31821c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f31821c = str;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            pl2.this.f31818a.onInstreamAdBreakError(this.f31821c);
            return C1992A.f18074a;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public c() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            pl2.this.f31818a.onInstreamAdBreakPrepared();
            return C1992A.f18074a;
        }
    }

    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public d() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            pl2.this.f31818a.onInstreamAdBreakStarted();
            return C1992A.f18074a;
        }
    }

    public pl2(InstreamAdBreakEventListener adBreakEventListener) {
        kotlin.jvm.internal.l.f(adBreakEventListener, "adBreakEventListener");
        this.f31818a = adBreakEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.ct0
    public final void onInstreamAdBreakCompleted() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.ct0
    public final void onInstreamAdBreakError(String reason) {
        kotlin.jvm.internal.l.f(reason, "reason");
        new CallbackStackTraceMarker(new b(reason));
    }

    @Override // com.yandex.mobile.ads.impl.ct0
    public final void onInstreamAdBreakPrepared() {
        new CallbackStackTraceMarker(new c());
    }

    @Override // com.yandex.mobile.ads.impl.ct0
    public final void onInstreamAdBreakStarted() {
        new CallbackStackTraceMarker(new d());
    }
}
