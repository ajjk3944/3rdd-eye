package com.ui.core.ui.sso;

import Q9.j;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class a implements j.b {

    /* renamed from: com.ui.core.ui.sso.a$a, reason: collision with other inner class name */
    public static final class C1314a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1314a f41411a = new C1314a();

        /* renamed from: b, reason: collision with root package name */
        private static final String f41412b = "login";

        private C1314a() {
            super(null);
        }

        @Override // Q9.j.b
        public String a() {
            return f41412b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1314a);
        }

        public int hashCode() {
            return -2133341864;
        }

        public String toString() {
            return "Login";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f41413a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final String f41414b = "mfa";

        private b() {
            super(null);
        }

        @Override // Q9.j.b
        public String a() {
            return f41414b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1074843753;
        }

        public String toString() {
            return "Mfa";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f41415a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final String f41416b = "register";

        private c() {
            super(null);
        }

        @Override // Q9.j.b
        public String a() {
            return f41416b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -174302636;
        }

        public String toString() {
            return "Register";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f41417a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final String f41418b = "password";

        private d() {
            super(null);
        }

        @Override // Q9.j.b
        public String a() {
            return f41418b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -1506281479;
        }

        public String toString() {
            return "ResetPassword";
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f41419a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final String f41420b = "trusted-device";

        private e() {
            super(null);
        }

        @Override // Q9.j.b
        public String a() {
            return f41420b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1078117660;
        }

        public String toString() {
            return "TrustedDevice";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
