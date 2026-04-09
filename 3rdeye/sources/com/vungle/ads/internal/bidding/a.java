package com.vungle.ads.internal.bidding;

import E.u;
import R9.AbstractC1564a;
import R9.C1568e;
import R9.t;
import a6.C1657f;
import a6.C1662k;
import a6.C1663l;
import android.content.Context;
import b9.C1992A;
import b9.C2001h;
import b9.InterfaceC2000g;
import com.vungle.ads.C4055m;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.f;
import com.vungle.ads.internal.util.b;
import com.vungle.ads.internal.util.i;
import com.vungle.ads.internal.util.k;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.x;
import p9.InterfaceC5480a;
import p9.l;

/* compiled from: BidTokenEncoder.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final b Companion = new b(null);
    public static final int TOKEN_VERSION = 6;
    private final Context context;
    private long enterBackgroundTime;
    private final AbstractC1564a json;
    private int ordinalView;

    /* compiled from: BidTokenEncoder.kt */
    /* renamed from: com.vungle.ads.internal.bidding.a$a, reason: collision with other inner class name */
    public static final class C0371a extends b.c {
        public C0371a() {
        }

        @Override // com.vungle.ads.internal.util.b.c
        public void onPause() {
            super.onPause();
            a.this.onPause$vungle_ads_release();
        }

        @Override // com.vungle.ads.internal.util.b.c
        public void onResume() {
            super.onResume();
            a.this.onResume$vungle_ads_release();
        }
    }

    /* compiled from: BidTokenEncoder.kt */
    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class c extends m implements InterfaceC5480a<com.vungle.ads.internal.network.g> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.g, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.network.g invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.g.class);
        }
    }

    /* compiled from: BidTokenEncoder.kt */
    public static final class d extends m implements l<C1568e, C1992A> {
        public static final d INSTANCE = new d();

        public d() {
            super(1);
        }

        @Override // p9.l
        public /* bridge */ /* synthetic */ C1992A invoke(C1568e c1568e) {
            invoke2(c1568e);
            return C1992A.f18074a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C1568e Json) {
            kotlin.jvm.internal.l.f(Json, "$this$Json");
            Json.f11793c = true;
            Json.f11791a = true;
            Json.f11792b = false;
        }
    }

    public a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.context = context;
        this.json = t.a(d.INSTANCE);
        com.vungle.ads.internal.util.b.Companion.addLifecycleListener(new C0371a());
    }

    /* renamed from: constructV6Token$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.g m33constructV6Token$lambda0(InterfaceC2000g<com.vungle.ads.internal.network.g> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    private final String generateBidToken() {
        try {
            String strConstructV6Token$vungle_ads_release = constructV6Token$vungle_ads_release();
            k.a aVar = k.Companion;
            aVar.d("BidTokenEncoder", "BidToken: " + strConstructV6Token$vungle_ads_release);
            String strConvertForSending = i.INSTANCE.convertForSending(strConstructV6Token$vungle_ads_release);
            aVar.d("BidTokenEncoder", "After conversion: 6:" + strConvertForSending);
            return "6:" + strConvertForSending;
        } catch (Exception e4) {
            C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 116, "Fail to gzip bidtoken " + e4.getLocalizedMessage(), (String) null, (String) null, (String) null, 28, (Object) null);
            return null;
        }
    }

    public final String constructV6Token$vungle_ads_release() throws IllegalStateException {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        C1657f c1657fRequestBody = m33constructV6Token$lambda0(C2001h.a(b9.i.SYNCHRONIZED, new c(this.context))).requestBody(!r1.signalsDisabled(), f.INSTANCE.fpdEnabled());
        C1663l c1663l = new C1663l(c1657fRequestBody.getDevice(), c1657fRequestBody.getUser(), c1657fRequestBody.getExt(), new C1662k(com.vungle.ads.internal.network.g.Companion.getHeaderUa()), this.ordinalView);
        AbstractC1564a abstractC1564a = this.json;
        return abstractC1564a.b(u.L(abstractC1564a.f11782b, x.b(C1663l.class)), c1663l);
    }

    public final String encode() {
        this.ordinalView++;
        return generateBidToken();
    }

    public final long getEnterBackgroundTime$vungle_ads_release() {
        return this.enterBackgroundTime;
    }

    public final int getOrdinalView$vungle_ads_release() {
        return this.ordinalView;
    }

    public final void onPause$vungle_ads_release() {
        this.enterBackgroundTime = System.currentTimeMillis();
    }

    public final void onResume$vungle_ads_release() {
        if (this.enterBackgroundTime == 0) {
            k.Companion.d("BidTokenEncoder", "BidTokenEncoder#onResume skipped");
            return;
        }
        if (System.currentTimeMillis() > this.enterBackgroundTime + f.INSTANCE.getSessionTimeout()) {
            this.ordinalView = 0;
            this.enterBackgroundTime = 0L;
        }
    }

    public final void setEnterBackgroundTime$vungle_ads_release(long j4) {
        this.enterBackgroundTime = j4;
    }

    public final void setOrdinalView$vungle_ads_release(int i) {
        this.ordinalView = i;
    }

    public static /* synthetic */ void getEnterBackgroundTime$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    public static /* synthetic */ void getOrdinalView$vungle_ads_release$annotations() {
    }
}
