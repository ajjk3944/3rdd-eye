package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public abstract class z90 {

    public static final class a extends z90 {

        /* renamed from: a, reason: collision with root package name */
        private final C4128i3 f36251a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4128i3 adFetchRequestError) {
            super(0);
            kotlin.jvm.internal.l.f(adFetchRequestError, "adFetchRequestError");
            this.f36251a = adFetchRequestError;
        }

        public final C4128i3 a() {
            return this.f36251a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.l.b(this.f36251a, ((a) obj).f36251a);
        }

        public final int hashCode() {
            return this.f36251a.hashCode();
        }

        public final String toString() {
            return "Failed(adFetchRequestError=" + this.f36251a + ")";
        }
    }

    public static final class b extends z90 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36252a = new b();

        private b() {
            super(0);
        }
    }

    public static final class c extends z90 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f36253a = new c();

        private c() {
            super(0);
        }
    }

    public static final class d extends z90 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f36254a = new d();

        private d() {
            super(0);
        }
    }

    private z90() {
    }

    public /* synthetic */ z90(int i) {
        this();
    }
}
