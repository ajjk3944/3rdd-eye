package com.ui.wifiman.ui.teleport;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.ui.wifiman.ui.teleport.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5249b {

    /* renamed from: com.ui.wifiman.ui.teleport.b$a */
    public static abstract class a extends AbstractC5249b {

        /* renamed from: com.ui.wifiman.ui.teleport.b$a$a, reason: collision with other inner class name */
        public static final class C1632a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1632a f45003a = new C1632a();

            private C1632a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1632a);
            }

            public int hashCode() {
                return 1735836961;
            }

            public String toString() {
                return "NCAApiUnavailable";
            }
        }

        /* renamed from: com.ui.wifiman.ui.teleport.b$a$b, reason: collision with other inner class name */
        public static final class C1633b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1633b f45004a = new C1633b();

            private C1633b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1633b);
            }

            public int hashCode() {
                return -1966213131;
            }

            public String toString() {
                return "NoConsolesAndNoSSO";
            }
        }

        /* renamed from: com.ui.wifiman.ui.teleport.b$a$c */
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f45005a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1328061399;
            }

            public String toString() {
                return "NoHosts";
            }
        }

        /* renamed from: com.ui.wifiman.ui.teleport.b$a$d */
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f45006a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -757638390;
            }

            public String toString() {
                return "NoNetworkConnection";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    /* renamed from: com.ui.wifiman.ui.teleport.b$b, reason: collision with other inner class name */
    public static final class C1634b extends AbstractC5249b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1634b f45007a = new C1634b();

        private C1634b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1634b);
        }

        public int hashCode() {
            return -1763636580;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.ui.wifiman.ui.teleport.b$c */
    public static final class c extends AbstractC5249b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f45008a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1147910920;
        }

        public String toString() {
            return "Tunnel";
        }
    }

    public /* synthetic */ AbstractC5249b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC5249b() {
    }
}
