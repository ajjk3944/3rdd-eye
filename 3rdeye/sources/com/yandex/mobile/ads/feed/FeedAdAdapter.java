package com.yandex.mobile.ads.feed;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.impl.C4108f4;
import com.yandex.mobile.ads.impl.b90;
import com.yandex.mobile.ads.impl.de2;
import com.yandex.mobile.ads.impl.ia0;
import com.yandex.mobile.ads.impl.ll2;
import com.yandex.mobile.ads.impl.lt;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class FeedAdAdapter extends b90 {

    /* renamed from: g, reason: collision with root package name */
    private FeedAdEventListener f24027g;

    /* renamed from: h, reason: collision with root package name */
    private final lt f24028h;
    private final de2 i;

    /* JADX WARN: Illegal instructions before constructor call */
    public FeedAdAdapter(FeedAd feedAd) {
        l.f(feedAd, "feedAd");
        ia0 ia0VarA = feedAd.a();
        l.e(ia0VarA, "getFeedViewModel(...)");
        super(ia0VarA, null, 2, null);
        this.f24028h = new a();
        this.i = new de2();
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final lt a() {
        return this.f24028h;
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final de2 b() {
        return this.i;
    }

    public final FeedAdEventListener getEventListener() {
        return this.f24027g;
    }

    public final void setEventListener(FeedAdEventListener feedAdEventListener) {
        this.f24027g = feedAdEventListener;
    }

    public final class a implements lt {

        /* renamed from: com.yandex.mobile.ads.feed.FeedAdAdapter$a$a, reason: collision with other inner class name */
        public static final class C0398a extends m implements InterfaceC5480a<C1992A> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FeedAdAdapter f24030b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0398a(FeedAdAdapter feedAdAdapter) {
                super(0);
                this.f24030b = feedAdAdapter;
            }

            @Override // p9.InterfaceC5480a
            public final C1992A invoke() {
                FeedAdEventListener eventListener = this.f24030b.getEventListener();
                if (eventListener != null) {
                    eventListener.onAdClicked();
                }
                return C1992A.f18074a;
            }
        }

        public static final class b extends m implements InterfaceC5480a<C1992A> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FeedAdAdapter f24031b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ll2 f24032c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(FeedAdAdapter feedAdAdapter, ll2 ll2Var) {
                super(0);
                this.f24031b = feedAdAdapter;
                this.f24032c = ll2Var;
            }

            @Override // p9.InterfaceC5480a
            public final C1992A invoke() {
                FeedAdEventListener eventListener = this.f24031b.getEventListener();
                if (eventListener != null) {
                    eventListener.onImpression(this.f24032c);
                }
                return C1992A.f18074a;
            }
        }

        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void a(C4108f4 c4108f4) {
            new CallbackStackTraceMarker(new b(FeedAdAdapter.this, c4108f4 != null ? new ll2(c4108f4) : null));
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void onAdClicked() {
            new CallbackStackTraceMarker(new C0398a(FeedAdAdapter.this));
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void closeNativeAd() {
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void onLeftApplication() {
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void onReturnedToApplication() {
        }
    }
}
