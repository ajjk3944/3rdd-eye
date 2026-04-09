package J8;

import D9.InterfaceC0645g;
import b9.C1992A;
import c9.C2077A;
import c9.C2097r;
import com.android.billingclient.api.ProductDetails;
import com.singular.sdk.Singular;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import java.util.List;
import java.util.Map;
import k8.C5251a;

/* compiled from: SingularUtils.kt */
@h9.e(c = "com.zipoapps.premiumhelper.util.SingularUtils$onPurchase$1", f = "SingularUtils.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class P extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f2841l;

    /* compiled from: SingularUtils.kt */
    public static final class a<T> implements InterfaceC0645g {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f2842b = new a<>();

        @Override // D9.InterfaceC0645g
        public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
            C5251a c5251a;
            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
            ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2;
            ProductDetails.PricingPhases pricingPhases;
            List<ProductDetails.PricingPhase> pricingPhaseList;
            List<C5251a> list = ((k8.H) obj).f43460b;
            if (list != null && (c5251a = (C5251a) C2097r.q0(list)) != null) {
                ProductDetails productDetails = c5251a.f43462b;
                ProductDetails.PricingPhase pricingPhase = (productDetails == null || (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) == null || (subscriptionOfferDetails2 = (ProductDetails.SubscriptionOfferDetails) C2097r.q0(subscriptionOfferDetails)) == null || (pricingPhases = subscriptionOfferDetails2.getPricingPhases()) == null || (pricingPhaseList = pricingPhases.getPricingPhaseList()) == null) ? null : (ProductDetails.PricingPhase) C2097r.w0(pricingPhaseList);
                String priceCurrencyCode = pricingPhase != null ? pricingPhase.getPriceCurrencyCode() : null;
                Double dValueOf = (pricingPhase != null ? new Long(pricingPhase.getPriceAmountMicros()) : null) != null ? Double.valueOf(r0.longValue() / 1000000.0d) : null;
                if (dValueOf != null && priceCurrencyCode != null) {
                    Singular.revenue(priceCurrencyCode, dValueOf.doubleValue(), c5251a.f43461a, (Map<String, Object>) C2077A.m(new b9.l("premium_helper_version", "5.0.3")));
                }
            }
            return C1992A.f18074a;
        }
    }

    public P() {
        throw null;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new P(2, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((P) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f2841l;
        if (i == 0) {
            b9.n.b(obj);
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            D9.z zVar = e.a.a().f37027q.f43577j;
            InterfaceC0645g interfaceC0645g = a.f2842b;
            this.f2841l = 1;
            if (D9.C.i(zVar.f1268b, interfaceC0645g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        return C1992A.f18074a;
    }
}
