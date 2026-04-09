package k8;

import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import org.json.JSONObject;

/* compiled from: Billing.kt */
/* renamed from: k8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5251a {

    /* renamed from: a, reason: collision with root package name */
    public final Purchase f43461a;

    /* renamed from: b, reason: collision with root package name */
    public final ProductDetails f43462b;

    /* renamed from: c, reason: collision with root package name */
    public final I f43463c;

    public C5251a(Purchase purchase, ProductDetails productDetails, I status) {
        kotlin.jvm.internal.l.f(purchase, "purchase");
        kotlin.jvm.internal.l.f(status, "status");
        this.f43461a = purchase;
        this.f43462b = productDetails;
        this.f43463c = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5251a)) {
            return false;
        }
        C5251a c5251a = (C5251a) obj;
        return kotlin.jvm.internal.l.b(this.f43461a, c5251a.f43461a) && kotlin.jvm.internal.l.b(this.f43462b, c5251a.f43462b) && this.f43463c == c5251a.f43463c;
    }

    public final int hashCode() {
        int iHashCode = this.f43461a.hashCode() * 31;
        ProductDetails productDetails = this.f43462b;
        return this.f43463c.hashCode() + ((iHashCode + (productDetails == null ? 0 : productDetails.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbD = j6.l.d("\nActivePurchase: ", this.f43463c.name(), "\nPurchase JSON:\n", new JSONObject(this.f43461a.getOriginalJson()).toString(4), "\nProductDetails: \n");
        sbD.append(this.f43462b);
        return sbD.toString();
    }
}
