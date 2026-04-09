package com.ui.btle.v2;

import T8.b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public interface a extends T8.b {

    /* renamed from: com.ui.btle.v2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1282a {

        /* renamed from: com.ui.btle.v2.a$a$a, reason: collision with other inner class name */
        public static final class C1283a extends AbstractC1282a implements b.d.a {

            /* renamed from: a, reason: collision with root package name */
            private final i f41113a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1283a(i session) {
                super(null);
                AbstractC6492s.i(session, "session");
                this.f41113a = session;
            }

            @Override // T8.b.d.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i a() {
                return this.f41113a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1283a) && AbstractC6492s.d(this.f41113a, ((C1283a) obj).f41113a);
            }

            public int hashCode() {
                return this.f41113a.hashCode();
            }

            public String toString() {
                return "Connected(session=" + this.f41113a + ")";
            }
        }

        /* renamed from: com.ui.btle.v2.a$a$b */
        public static abstract class b extends AbstractC1282a implements b.d.InterfaceC0788b {

            /* renamed from: com.ui.btle.v2.a$a$b$a, reason: collision with other inner class name */
            public static final class C1284a extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final C1284a f41114a = new C1284a();

                private C1284a() {
                    super(null);
                }
            }

            /* renamed from: com.ui.btle.v2.a$a$b$b, reason: collision with other inner class name */
            public static final class C1285b extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final C1285b f41115a = new C1285b();

                private C1285b() {
                    super(null);
                }
            }

            /* renamed from: com.ui.btle.v2.a$a$b$c */
            public static final class c extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final c f41116a = new c();

                private c() {
                    super(null);
                }
            }

            /* renamed from: com.ui.btle.v2.a$a$b$d */
            public static final class d extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final d f41117a = new d();

                private d() {
                    super(null);
                }
            }

            /* renamed from: com.ui.btle.v2.a$a$b$e */
            public static final class e extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final e f41118a = new e();

                private e() {
                    super(null);
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
                super(null);
            }
        }

        /* renamed from: com.ui.btle.v2.a$a$c */
        public static final class c extends AbstractC1282a implements b.d.c {

            /* renamed from: a, reason: collision with root package name */
            public static final c f41119a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC1282a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1282a() {
        }
    }

    gg.i b();
}
