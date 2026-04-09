package J8;

import J8.Q;
import android.app.Application;
import android.content.res.Resources;
import c9.C2097r;
import com.android.billingclient.api.ProductDetails;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import i9.InterfaceC4463a;
import java.text.MessageFormat;
import java.util.List;
import k8.G;
import va.a;

/* compiled from: PriceFormatter.kt */
/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final Application f2819a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PriceFormatter.kt */
    public static final class a {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a SHORT = new a("SHORT", 0);
        public static final a LONG = new a("LONG", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{SHORT, LONG};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(aVarArr$values);
        }

        private a(String str, int i) {
        }

        public static InterfaceC4463a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: PriceFormatter.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2820a;

        static {
            int[] iArr = new int[Q.b.values().length];
            try {
                iArr[Q.b.WEEKLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q.b.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q.b.YEARLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Q.b.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2820a = iArr;
        }
    }

    public I(Application application) {
        this.f2819a = application;
    }

    public final String a(k8.G offer, a priceFormat) {
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
        ProductDetails.PricingPhases pricingPhases;
        List<ProductDetails.PricingPhase> pricingPhaseList;
        ProductDetails.PricingPhase pricingPhase;
        String formattedPrice;
        kotlin.jvm.internal.l.f(offer, "offer");
        kotlin.jvm.internal.l.f(priceFormat, "priceFormat");
        a.b bVar = va.a.f47104a;
        bVar.o("PremiumHelper");
        bVar.a("Formatting SKU price for offer: " + offer, new Object[0]);
        if (offer instanceof G.a) {
            G.a aVar = (G.a) offer;
            if (priceFormat == a.SHORT) {
                return "$10";
            }
            aVar.getClass();
            String str = MessageFormat.format(b(Q.b(null), Q.a(null)), "$10");
            kotlin.jvm.internal.l.e(str, "format(...)");
            return str;
        }
        if (offer instanceof G.b) {
            return "";
        }
        if (!(offer instanceof G.c)) {
            throw new b9.j();
        }
        G.c cVar = (G.c) offer;
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = cVar.f43458d.getSubscriptionOfferDetails();
        if (subscriptionOfferDetails2 == null || (subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) C2097r.r0(0, subscriptionOfferDetails2)) == null || (pricingPhases = subscriptionOfferDetails.getPricingPhases()) == null || (pricingPhaseList = pricingPhases.getPricingPhaseList()) == null || (pricingPhase = (ProductDetails.PricingPhase) C2097r.w0(pricingPhaseList)) == null || (formattedPrice = pricingPhase.getFormattedPrice()) == null) {
            return "";
        }
        if (priceFormat == a.SHORT) {
            return formattedPrice;
        }
        String str2 = cVar.f43456b;
        String str3 = MessageFormat.format(b(Q.b(str2), Q.a(str2)), formattedPrice);
        kotlin.jvm.internal.l.e(str3, "format(...)");
        return str3;
    }

    public final String b(Q.b bVar, Q.a aVar) {
        Resources resources = this.f2819a.getResources();
        int i = b.f2820a[bVar.ordinal()];
        if (i == 1) {
            return resources.getStringArray(R.array.sku_weekly_prices)[aVar.ordinal()];
        }
        if (i == 2) {
            return resources.getStringArray(R.array.sku_monthly_prices)[aVar.ordinal()];
        }
        if (i == 3) {
            return resources.getStringArray(R.array.sku_yearly_prices)[aVar.ordinal()];
        }
        if (i == 4) {
            return resources.getString(R.string.sku_price_onetime);
        }
        throw new b9.j();
    }
}
