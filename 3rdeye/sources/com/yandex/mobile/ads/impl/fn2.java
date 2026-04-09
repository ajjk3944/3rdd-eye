package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.VideoEventListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class fn2 implements eu {

    /* renamed from: a, reason: collision with root package name */
    private final VideoEventListener f27406a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            fn2.this.f27406a.onVideoComplete();
            return C1992A.f18074a;
        }
    }

    public fn2(VideoEventListener videoEventListener) {
        kotlin.jvm.internal.l.f(videoEventListener, "videoEventListener");
        this.f27406a = videoEventListener;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fn2) && kotlin.jvm.internal.l.b(((fn2) obj).f27406a, this.f27406a);
    }

    public final int hashCode() {
        return this.f27406a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.eu
    public final void onVideoComplete() {
        new CallbackStackTraceMarker(new a());
    }
}
