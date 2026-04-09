package com.yandex.mobile.ads.impl;

import b9.C1992A;
import c9.C2092m;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeBulkAdLoadListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class lm2 implements ut {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBulkAdLoadListener f30050a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f30052c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdRequestError adRequestError) {
            super(0);
            this.f30052c = adRequestError;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            lm2.this.f30050a.onAdsFailedToLoad(this.f30052c);
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<com.yandex.mobile.ads.nativeads.e> f30054c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList arrayList) {
            super(0);
            this.f30054c = arrayList;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            lm2.this.f30050a.onAdsLoaded(this.f30054c);
            return C1992A.f18074a;
        }
    }

    public lm2(NativeBulkAdLoadListener loadListener) {
        kotlin.jvm.internal.l.f(loadListener, "loadListener");
        this.f30050a = loadListener;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void onAdsLoaded(List<? extends h61> nativeAds) {
        kotlin.jvm.internal.l.f(nativeAds, "nativeAds");
        ArrayList arrayList = new ArrayList(C2092m.T(nativeAds, 10));
        Iterator<T> it = nativeAds.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.yandex.mobile.ads.nativeads.e((h61) it.next()));
        }
        new CallbackStackTraceMarker(new b(arrayList));
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }
}
