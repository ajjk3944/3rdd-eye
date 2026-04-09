package k8;

import com.android.billingclient.api.ProductDetails;

/* compiled from: Billing.kt */
/* loaded from: classes3.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public final String f43454a;

    /* compiled from: Billing.kt */
    public static final class a extends G {
        @Override // k8.G
        public final String a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return B4.f.c(new StringBuilder("Debug(sku="), null, ", skuType=subs, price=$10)");
        }
    }

    /* compiled from: Billing.kt */
    public static final class b extends G {

        /* renamed from: b, reason: collision with root package name */
        public final String f43455b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String sku) {
            super(sku);
            kotlin.jvm.internal.l.f(sku, "sku");
            this.f43455b = sku;
        }

        @Override // k8.G
        public final String a() {
            return this.f43455b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.l.b(this.f43455b, ((b) obj).f43455b);
        }

        public final int hashCode() {
            return this.f43455b.hashCode();
        }

        public final String toString() {
            return B4.f.c(new StringBuilder("Failure(sku="), this.f43455b, ")");
        }
    }

    /* compiled from: Billing.kt */
    public static final class c extends G {

        /* renamed from: b, reason: collision with root package name */
        public final String f43456b;

        /* renamed from: c, reason: collision with root package name */
        public final String f43457c;

        /* renamed from: d, reason: collision with root package name */
        public final ProductDetails f43458d;

        public c(String str, String str2, ProductDetails productDetails) {
            super(str);
            this.f43456b = str;
            this.f43457c = str2;
            this.f43458d = productDetails;
        }

        @Override // k8.G
        public final String a() {
            return this.f43456b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.l.b(this.f43456b, cVar.f43456b) && kotlin.jvm.internal.l.b(this.f43457c, cVar.f43457c) && kotlin.jvm.internal.l.b(this.f43458d, cVar.f43458d);
        }

        public final int hashCode() {
            return this.f43458d.hashCode() + B4.g.n(this.f43456b.hashCode() * 31, 31, this.f43457c);
        }

        public final String toString() {
            return "Real(sku=" + this.f43456b + ", skuType=" + this.f43457c + ", productDetails=" + this.f43458d + ")";
        }
    }

    public G(String str) {
        this.f43454a = str;
    }

    public String a() {
        return this.f43454a;
    }
}
