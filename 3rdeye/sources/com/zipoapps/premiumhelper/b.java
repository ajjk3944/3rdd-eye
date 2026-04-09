package com.zipoapps.premiumhelper;

import A9.E;
import A9.O;
import b9.C1992A;
import b9.n;
import com.applovin.sdk.AppLovinEventParameters;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.toto.TotoApiResponse;
import com.zipoapps.premiumhelper.toto.TotoApiResponseInfo;
import f9.InterfaceC4347e;
import h9.i;
import i8.C4461a;
import java.util.Map;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: Analytics.kt */
@h9.e(c = "com.zipoapps.premiumhelper.Analytics$onOnboarding$1", f = "Analytics.kt", l = {342}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f37001l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C4461a f37002m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C4461a c4461a, InterfaceC4347e<? super b> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f37002m = c4461a;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new b(this.f37002m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        TotoApiResponseInfo info;
        TotoApiResponseInfo info2;
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f37001l;
        if (i == 0) {
            n.b(obj);
            this.f37001l = 1;
            if (O.a(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        }
        e.f37006D.getClass();
        TotoApiResponse<Map<String, Map<String, Integer>>> lastGetConfigResponse = e.a.a().f37033w.getLastGetConfigResponse();
        C4461a c4461a = this.f37002m;
        l8.b bVar = c4461a.f38484b;
        l8.d<String> PH_MAIN_SKU = i8.d.f38525E;
        l.e(PH_MAIN_SKU, "PH_MAIN_SKU");
        b9.l lVar = new b9.l(AppLovinEventParameters.PRODUCT_IDENTIFIER, bVar.h(PH_MAIN_SKU));
        b9.l lVar2 = new b9.l("timeout", String.valueOf(c4461a.f38489g));
        Object l5 = "not available";
        b9.l lVar3 = new b9.l("toto_response_code", (lastGetConfigResponse == null || (info2 = lastGetConfigResponse.getInfo()) == null) ? "not available" : new Integer(info2.getResponseCode()));
        if (lastGetConfigResponse != null && (info = lastGetConfigResponse.getInfo()) != null) {
            l5 = new Long(info.getResponseTime());
        }
        c4461a.s("Onboarding", G0.d.a(lVar, lVar2, lVar3, new b9.l("toto_latency", l5)));
        return C1992A.f18074a;
    }
}
