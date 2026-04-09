package k8;

import D9.InterfaceC0645g;
import b9.C1992A;
import b9.C1998e;
import c9.C2097r;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.applovin.sdk.AppLovinEventParameters;
import f9.InterfaceC4347e;
import g0.C4356c;
import i8.C4461a;
import io.appmetrica.analytics.impl.Oo;
import java.util.List;
import k8.G;
import va.a;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$observePurchases$1", f = "Billing.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class s extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f43565l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f43566m;

    /* compiled from: Billing.kt */
    public static final class a<T> implements InterfaceC0645g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f43567b;

        public a(t tVar) {
            this.f43567b = tVar;
        }

        @Override // D9.InterfaceC0645g
        public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
            C5251a c5251a;
            Purchase purchase;
            H h10 = (H) obj;
            boolean zI = F.i(h10.f43459a);
            t tVar = this.f43567b;
            if (zI) {
                List<C5251a> list = h10.f43460b;
                String orderId = (list == null || (c5251a = (C5251a) C2097r.w0(list)) == null || (purchase = c5251a.f43461a) == null) ? null : purchase.getOrderId();
                a.b bVar = va.a.f47104a;
                G.c cVar = tVar.f43580m;
                bVar.a(Oo.f("[Billing] Purchase success: sku:", cVar != null ? cVar.f43456b : null, ", orderId:", orderId), new Object[0]);
                G.c cVar2 = tVar.f43580m;
                String str = cVar2 != null ? cVar2.f43456b : null;
                C4461a c4461a = tVar.f43572d;
                b9.l lVar = new b9.l("offer", c4461a.f38490h);
                if (str == null) {
                    str = "";
                }
                c4461a.s("Purchase_success", G0.d.a(lVar, new b9.l(AppLovinEventParameters.PRODUCT_IDENTIFIER, str), new b9.l("orderId", orderId != null ? orderId : "")));
            } else {
                a.b bVar2 = va.a.f47104a;
                BillingResult billingResult = h10.f43459a;
                bVar2.c(C4356c.h(billingResult.getResponseCode(), "[Billing] Purchase failed: "), new Object[0]);
                C4461a c4461a2 = tVar.f43572d;
                G.c cVar3 = tVar.f43580m;
                String str2 = cVar3 != null ? cVar3.f43456b : null;
                int responseCode = billingResult.getResponseCode();
                String debugMessage = billingResult.getDebugMessage();
                b9.l lVar2 = new b9.l("offer", c4461a2.f38490h);
                if (str2 == null) {
                    str2 = "";
                }
                c4461a2.s("Purchase_failed", G0.d.a(lVar2, new b9.l(AppLovinEventParameters.PRODUCT_IDENTIFIER, str2), new b9.l("error_code", Integer.valueOf(responseCode)), new b9.l("error_message", debugMessage != null ? debugMessage : "")));
            }
            tVar.f43580m = null;
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, InterfaceC4347e<? super s> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f43566m = tVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new s(this.f43566m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((s) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f43565l;
        if (i == 0) {
            b9.n.b(obj);
            t tVar = this.f43566m;
            D9.C c10 = tVar.i;
            a aVar2 = new a(tVar);
            this.f43565l = 1;
            c10.getClass();
            if (D9.C.i(c10, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        throw new C1998e();
    }
}
