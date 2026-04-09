package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C4846oe;
import io.appmetrica.analytics.impl.C5109yn;
import java.util.Currency;

/* loaded from: classes3.dex */
public class Revenue {
    public final Currency currency;
    public final String payload;
    public final long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    public static class Builder {

        /* renamed from: g, reason: collision with root package name */
        private static final C5109yn f38779g = new C5109yn(new C4846oe("revenue currency"));

        /* renamed from: a, reason: collision with root package name */
        final long f38780a;

        /* renamed from: b, reason: collision with root package name */
        final Currency f38781b;

        /* renamed from: c, reason: collision with root package name */
        Integer f38782c;

        /* renamed from: d, reason: collision with root package name */
        String f38783d;

        /* renamed from: e, reason: collision with root package name */
        String f38784e;

        /* renamed from: f, reason: collision with root package name */
        Receipt f38785f;

        public /* synthetic */ Builder(long j4, Currency currency, int i) {
            this(j4, currency);
        }

        public Revenue build() {
            return new Revenue(this, 0);
        }

        public Builder withPayload(String str) {
            this.f38784e = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f38783d = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f38782c = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f38785f = receipt;
            return this;
        }

        private Builder(long j4, Currency currency) {
            f38779g.a(currency);
            this.f38780a = j4;
            this.f38781b = currency;
        }
    }

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            private String f38786a;

            /* renamed from: b, reason: collision with root package name */
            private String f38787b;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Receipt build() {
                return new Receipt(this, 0);
            }

            public Builder withData(String str) {
                this.f38786a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f38787b = str;
                return this;
            }

            private Builder() {
            }
        }

        public /* synthetic */ Receipt(Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f38786a;
            this.signature = builder.f38787b;
        }
    }

    public /* synthetic */ Revenue(Builder builder, int i) {
        this(builder);
    }

    public static Builder newBuilder(long j4, Currency currency) {
        return new Builder(j4, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f38780a;
        this.currency = builder.f38781b;
        this.quantity = builder.f38782c;
        this.productID = builder.f38783d;
        this.payload = builder.f38784e;
        this.receipt = builder.f38785f;
    }
}
