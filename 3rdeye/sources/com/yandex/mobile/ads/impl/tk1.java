package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public abstract class tk1 {

    public static final class a extends tk1 {

        /* renamed from: a, reason: collision with root package name */
        private final C4128i3 f33659a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4128i3 adRequestError) {
            super(0);
            kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
            this.f33659a = adRequestError;
        }

        public final C4128i3 a() {
            return this.f33659a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.l.b(this.f33659a, ((a) obj).f33659a);
        }

        public final int hashCode() {
            return this.f33659a.hashCode();
        }

        public final String toString() {
            return "Failure(adRequestError=" + this.f33659a + ")";
        }
    }

    public static final class b extends tk1 {

        /* renamed from: a, reason: collision with root package name */
        private final i90 f33660a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i90 feedItem) {
            super(0);
            kotlin.jvm.internal.l.f(feedItem, "feedItem");
            this.f33660a = feedItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.l.b(this.f33660a, ((b) obj).f33660a);
        }

        public final int hashCode() {
            return this.f33660a.hashCode();
        }

        public final String toString() {
            return "Success(feedItem=" + this.f33660a + ")";
        }
    }

    private tk1() {
    }

    public /* synthetic */ tk1(int i) {
        this();
    }
}
