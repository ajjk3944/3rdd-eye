package com.ubnt.usurvey.ui.signal.strength;

import gg.AbstractC5912b;
import gg.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: com.ubnt.usurvey.ui.signal.strength.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1261a {

        /* renamed from: com.ubnt.usurvey.ui.signal.strength.a$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC1262a extends AbstractC1261a {

            /* renamed from: com.ubnt.usurvey.ui.signal.strength.a$a$a$a, reason: collision with other inner class name */
            public static final class C1263a extends AbstractC1262a {

                /* renamed from: a, reason: collision with root package name */
                public static final C1263a f40854a = new C1263a();

                private C1263a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1263a);
                }

                public int hashCode() {
                    return 789668672;
                }

                public String toString() {
                    return "Connected";
                }
            }

            /* renamed from: com.ubnt.usurvey.ui.signal.strength.a$a$a$b */
            public static final class b extends AbstractC1262a {

                /* renamed from: a, reason: collision with root package name */
                public static final b f40855a = new b();

                private b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return -1816838492;
                }

                public String toString() {
                    return "Disconnected";
                }
            }

            public /* synthetic */ AbstractC1262a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC1262a() {
                super(null);
            }
        }

        /* renamed from: com.ubnt.usurvey.ui.signal.strength.a$a$b */
        public static final class b extends AbstractC1261a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40856a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 834039180;
            }

            public String toString() {
                return "Unavailable";
            }
        }

        public /* synthetic */ AbstractC1261a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1261a() {
        }
    }

    AbstractC5912b a(String str);

    i b();

    i c();

    AbstractC5912b d();

    i getState();
}
