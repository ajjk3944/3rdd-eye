package com.ui.wifiman.model.ubiquiti.console;

import com.ui.wifiman.model.ubiquiti.cloud.UnifiCloudClient;
import gg.i;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface b {

    public static abstract class a {

        /* renamed from: com.ui.wifiman.model.ubiquiti.console.b$a$a, reason: collision with other inner class name */
        public static final class C1495a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final UnifiCloudClient.Error f43708a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1495a(UnifiCloudClient.Error cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.f43708a = cause;
            }

            public final UnifiCloudClient.Error a() {
                return this.f43708a;
            }
        }

        /* renamed from: com.ui.wifiman.model.ubiquiti.console.b$a$b, reason: collision with other inner class name */
        public static final class C1496b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1496b f43709a = new C1496b();

            private C1496b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1496b);
            }

            public int hashCode() {
                return -200991368;
            }

            public String toString() {
                return "Idle";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f43710a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -571584234;
            }

            public String toString() {
                return "InProgress";
            }
        }

        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f43711a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 214093791;
            }

            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    i a();

    i b();

    i c();
}
