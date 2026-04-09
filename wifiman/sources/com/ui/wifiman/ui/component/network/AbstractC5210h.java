package com.ui.wifiman.ui.component.network;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.ui.wifiman.ui.component.network.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5210h {

    /* renamed from: com.ui.wifiman.ui.component.network.h$a */
    public static final class a extends AbstractC5210h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f44495a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1466634212;
        }

        public String toString() {
            return "Connected";
        }
    }

    /* renamed from: com.ui.wifiman.ui.component.network.h$b */
    public static abstract class b extends AbstractC5210h {

        /* renamed from: com.ui.wifiman.ui.component.network.h$b$a */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f44496a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1683871847;
            }

            public String toString() {
                return "LTR";
            }
        }

        /* renamed from: com.ui.wifiman.ui.component.network.h$b$b, reason: collision with other inner class name */
        public static final class C1557b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1557b f44497a = new C1557b();

            private C1557b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1557b);
            }

            public int hashCode() {
                return -1683866087;
            }

            public String toString() {
                return "RTL";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC5210h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC5210h() {
    }
}
