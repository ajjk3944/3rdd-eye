package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public interface gv1 {

    public static final class a implements gv1 {

        /* renamed from: a, reason: collision with root package name */
        private final C4128i3 f28004a;

        public a(C4128i3 error) {
            kotlin.jvm.internal.l.f(error, "error");
            this.f28004a = error;
        }

        public final C4128i3 a() {
            return this.f28004a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.l.b(this.f28004a, ((a) obj).f28004a);
        }

        public final int hashCode() {
            return this.f28004a.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.f28004a + ")";
        }
    }

    public static final class b implements gv1 {

        /* renamed from: a, reason: collision with root package name */
        private final cc f28005a;

        /* renamed from: b, reason: collision with root package name */
        private final j50 f28006b;

        public b(cc advertisingConfiguration, j50 environmentConfiguration) {
            kotlin.jvm.internal.l.f(advertisingConfiguration, "advertisingConfiguration");
            kotlin.jvm.internal.l.f(environmentConfiguration, "environmentConfiguration");
            this.f28005a = advertisingConfiguration;
            this.f28006b = environmentConfiguration;
        }

        public final cc a() {
            return this.f28005a;
        }

        public final j50 b() {
            return this.f28006b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.l.b(this.f28005a, bVar.f28005a) && kotlin.jvm.internal.l.b(this.f28006b, bVar.f28006b);
        }

        public final int hashCode() {
            return this.f28006b.hashCode() + (this.f28005a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(advertisingConfiguration=" + this.f28005a + ", environmentConfiguration=" + this.f28006b + ")";
        }
    }
}
