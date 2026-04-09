package com.yandex.mobile.ads.impl;

import N7.C1154e9;

/* loaded from: classes3.dex */
public abstract class hq {

    public static final class a extends hq {

        /* renamed from: a, reason: collision with root package name */
        private final String f28328a;

        public a(String str) {
            super(0);
            this.f28328a = str;
        }

        public final String a() {
            return this.f28328a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.l.b(this.f28328a, ((a) obj).f28328a);
        }

        public final int hashCode() {
            String str = this.f28328a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C1154e9.i("AdditionalConsent(value=", this.f28328a, ")");
        }
    }

    public static final class b extends hq {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f28329a;

        public b(boolean z10) {
            super(0);
            this.f28329a = z10;
        }

        public final boolean a() {
            return this.f28329a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f28329a == ((b) obj).f28329a;
        }

        public final int hashCode() {
            return this.f28329a ? 1231 : 1237;
        }

        public final String toString() {
            return "CmpPresent(value=" + this.f28329a + ")";
        }
    }

    public static final class c extends hq {

        /* renamed from: a, reason: collision with root package name */
        private final String f28330a;

        public c(String str) {
            super(0);
            this.f28330a = str;
        }

        public final String a() {
            return this.f28330a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.l.b(this.f28330a, ((c) obj).f28330a);
        }

        public final int hashCode() {
            String str = this.f28330a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C1154e9.i("ConsentString(value=", this.f28330a, ")");
        }
    }

    public static final class d extends hq {

        /* renamed from: a, reason: collision with root package name */
        private final String f28331a;

        public d(String str) {
            super(0);
            this.f28331a = str;
        }

        public final String a() {
            return this.f28331a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.l.b(this.f28331a, ((d) obj).f28331a);
        }

        public final int hashCode() {
            String str = this.f28331a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C1154e9.i("Gdpr(value=", this.f28331a, ")");
        }
    }

    public static final class e extends hq {

        /* renamed from: a, reason: collision with root package name */
        private final String f28332a;

        public e(String str) {
            super(0);
            this.f28332a = str;
        }

        public final String a() {
            return this.f28332a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.l.b(this.f28332a, ((e) obj).f28332a);
        }

        public final int hashCode() {
            String str = this.f28332a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C1154e9.i("PurposeConsents(value=", this.f28332a, ")");
        }
    }

    public static final class f extends hq {

        /* renamed from: a, reason: collision with root package name */
        private final String f28333a;

        public f(String str) {
            super(0);
            this.f28333a = str;
        }

        public final String a() {
            return this.f28333a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && kotlin.jvm.internal.l.b(this.f28333a, ((f) obj).f28333a);
        }

        public final int hashCode() {
            String str = this.f28333a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C1154e9.i("VendorConsents(value=", this.f28333a, ")");
        }
    }

    private hq() {
    }

    public /* synthetic */ hq(int i) {
        this();
    }
}
