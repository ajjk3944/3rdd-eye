package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class hl2 implements us {

    /* renamed from: a, reason: collision with root package name */
    private final BidderTokenLoadListener f28261a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28263c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f28263c = str;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            hl2.this.f28261a.onBidderTokenLoaded(this.f28263c);
            return C1992A.f18074a;
        }
    }

    public hl2(BidderTokenLoadListener bidderTokenLoadListener) {
        kotlin.jvm.internal.l.f(bidderTokenLoadListener, "bidderTokenLoadListener");
        this.f28261a = bidderTokenLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.us
    public final void onBidderTokenLoaded(String bidderToken) {
        kotlin.jvm.internal.l.f(bidderToken, "bidderToken");
        new CallbackStackTraceMarker(new a(bidderToken));
    }

    @Override // com.yandex.mobile.ads.impl.us
    public final void a() {
        new CallbackStackTraceMarker(new gl2(this));
    }
}
