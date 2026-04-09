package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public abstract class v90 {

    public static final class a extends v90 {

        /* renamed from: a, reason: collision with root package name */
        private final C4128i3 f34420a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4128i3 adRequestError) {
            super(0);
            kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
            this.f34420a = adRequestError;
        }

        public final C4128i3 a() {
            return this.f34420a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.l.b(this.f34420a, ((a) obj).f34420a);
        }

        public final int hashCode() {
            return this.f34420a.hashCode();
        }

        public final String toString() {
            return "Failure(adRequestError=" + this.f34420a + ")";
        }
    }

    public static final class b extends v90 {

        /* renamed from: a, reason: collision with root package name */
        private final tr0 f34421a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tr0 feedItem) {
            super(0);
            kotlin.jvm.internal.l.f(feedItem, "feedItem");
            this.f34421a = feedItem;
        }

        public final tr0 a() {
            return this.f34421a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.l.b(this.f34421a, ((b) obj).f34421a);
        }

        public final int hashCode() {
            return this.f34421a.hashCode();
        }

        public final String toString() {
            return "Success(feedItem=" + this.f34421a + ")";
        }
    }

    private v90() {
    }

    public /* synthetic */ v90(int i) {
        this();
    }
}
