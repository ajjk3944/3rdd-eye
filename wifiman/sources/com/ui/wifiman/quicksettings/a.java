package com.ui.wifiman.quicksettings;

import android.content.Context;
import gg.AbstractC5912b;
import gg.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import te.AbstractC8083a;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.ui.wifiman.quicksettings.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1542a {

        /* renamed from: com.ui.wifiman.quicksettings.a$a$a, reason: collision with other inner class name */
        public static final class C1543a extends AbstractC1542a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1543a f44289a = new C1543a();

            /* renamed from: b, reason: collision with root package name */
            private static final int f44290b = AbstractC8083a.f62102b;

            private C1543a() {
                super(null);
            }

            @Override // com.ui.wifiman.quicksettings.a.AbstractC1542a
            public int a() {
                return f44290b;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1543a);
            }

            public int hashCode() {
                return -1232057108;
            }

            public String toString() {
                return "Active";
            }
        }

        /* renamed from: com.ui.wifiman.quicksettings.a$a$b */
        public static abstract class b extends AbstractC1542a {

            /* renamed from: com.ui.wifiman.quicksettings.a$a$b$a, reason: collision with other inner class name */
            public static final class C1544a extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final C1544a f44291a = new C1544a();

                /* renamed from: b, reason: collision with root package name */
                private static final int f44292b = AbstractC8083a.f62103c;

                private C1544a() {
                    super(null);
                }

                @Override // com.ui.wifiman.quicksettings.a.AbstractC1542a
                public int a() {
                    return f44292b;
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1544a);
                }

                public int hashCode() {
                    return 1826029864;
                }

                public String toString() {
                    return "Connecting";
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
                super(null);
            }
        }

        /* renamed from: com.ui.wifiman.quicksettings.a$a$c */
        public static final class c extends AbstractC1542a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f44293a = new c();

            /* renamed from: b, reason: collision with root package name */
            private static final int f44294b = AbstractC8083a.f62101a;

            private c() {
                super(null);
            }

            @Override // com.ui.wifiman.quicksettings.a.AbstractC1542a
            public int a() {
                return f44294b;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -2126367503;
            }

            public String toString() {
                return "InActive";
            }
        }

        /* renamed from: com.ui.wifiman.quicksettings.a$a$d */
        public static final class d extends AbstractC1542a {

            /* renamed from: a, reason: collision with root package name */
            private final int f44295a;

            public d(int i10) {
                super(null);
                this.f44295a = i10;
            }

            @Override // com.ui.wifiman.quicksettings.a.AbstractC1542a
            public int a() {
                return this.f44295a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f44295a == ((d) obj).f44295a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f44295a);
            }

            public String toString() {
                return "Unavailable(messageId=" + this.f44295a + ")";
            }
        }

        public /* synthetic */ AbstractC1542a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int a();

        private AbstractC1542a() {
        }
    }

    AbstractC5912b a(Context context);

    i b();

    AbstractC5912b c(boolean z10);

    i getState();
}
