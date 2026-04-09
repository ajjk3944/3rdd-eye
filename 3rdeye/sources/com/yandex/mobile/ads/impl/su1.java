package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public interface su1 {

    public static final class a implements su1 {

        /* renamed from: a, reason: collision with root package name */
        private final fi2 f33246a;

        /* renamed from: b, reason: collision with root package name */
        private final er f33247b;

        public a(fi2 error, er configurationSource) {
            kotlin.jvm.internal.l.f(error, "error");
            kotlin.jvm.internal.l.f(configurationSource, "configurationSource");
            this.f33246a = error;
            this.f33247b = configurationSource;
        }

        public final er a() {
            return this.f33247b;
        }

        public final fi2 b() {
            return this.f33246a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f33246a, aVar.f33246a) && this.f33247b == aVar.f33247b;
        }

        public final int hashCode() {
            return this.f33247b.hashCode() + (this.f33246a.hashCode() * 31);
        }

        public final String toString() {
            return "Failure(error=" + this.f33246a + ", configurationSource=" + this.f33247b + ")";
        }
    }

    public static final class b implements su1 {

        /* renamed from: a, reason: collision with root package name */
        private final du1 f33248a;

        /* renamed from: b, reason: collision with root package name */
        private final er f33249b;

        public b(du1 sdkConfiguration, er configurationSource) {
            kotlin.jvm.internal.l.f(sdkConfiguration, "sdkConfiguration");
            kotlin.jvm.internal.l.f(configurationSource, "configurationSource");
            this.f33248a = sdkConfiguration;
            this.f33249b = configurationSource;
        }

        public final er a() {
            return this.f33249b;
        }

        public final du1 b() {
            return this.f33248a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.l.b(this.f33248a, bVar.f33248a) && this.f33249b == bVar.f33249b;
        }

        public final int hashCode() {
            return this.f33249b.hashCode() + (this.f33248a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(sdkConfiguration=" + this.f33248a + ", configurationSource=" + this.f33249b + ")";
        }
    }
}
