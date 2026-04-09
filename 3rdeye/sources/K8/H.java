package k8;

import com.android.billingclient.api.BillingResult;
import java.util.List;

/* compiled from: Billing.kt */
/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final BillingResult f43459a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C5251a> f43460b;

    public H(BillingResult billingResult) {
        this.f43459a = billingResult;
        this.f43460b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return kotlin.jvm.internal.l.b(this.f43459a, h10.f43459a) && kotlin.jvm.internal.l.b(this.f43460b, h10.f43460b);
    }

    public final int hashCode() {
        int iHashCode = this.f43459a.hashCode() * 31;
        List<C5251a> list = this.f43460b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "PurchaseResult(billingResult=" + this.f43459a + ", purchases=" + this.f43460b + ")";
    }

    public H(BillingResult billingResult, List<C5251a> list) {
        this.f43459a = billingResult;
        this.f43460b = list;
    }
}
