package androidx.privacysandbox.ads.adservices.topics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3578a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3579b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f3580a = "";

        /* renamed from: b, reason: collision with root package name */
        public boolean f3581b = true;

        public final b a() {
            if (this.f3580a.length() > 0) {
                return new b(this.f3580a, this.f3581b);
            }
            throw new IllegalStateException("adsSdkName must be set");
        }

        public final a b(String adsSdkName) {
            kotlin.jvm.internal.p.e(adsSdkName, "adsSdkName");
            this.f3580a = adsSdkName;
            return this;
        }

        public final a c(boolean z10) {
            this.f3581b = z10;
            return this;
        }
    }

    public b(String adsSdkName, boolean z10) {
        kotlin.jvm.internal.p.e(adsSdkName, "adsSdkName");
        this.f3578a = adsSdkName;
        this.f3579b = z10;
    }

    public final String a() {
        return this.f3578a;
    }

    public final boolean b() {
        return this.f3579b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.p.a(this.f3578a, bVar.f3578a) && this.f3579b == bVar.f3579b;
    }

    public int hashCode() {
        return (this.f3578a.hashCode() * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(this.f3579b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f3578a + ", shouldRecordObservation=" + this.f3579b;
    }
}
