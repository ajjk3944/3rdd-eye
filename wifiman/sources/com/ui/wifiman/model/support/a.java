package com.ui.wifiman.model.support;

import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld.C6574a;
import md.C6796a;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.ui.wifiman.model.support.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1437a {

        /* renamed from: com.ui.wifiman.model.support.a$a$a, reason: collision with other inner class name */
        public static final class C1438a extends AbstractC1437a {

            /* renamed from: a, reason: collision with root package name */
            private final C6796a f43179a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1438a(C6796a settings) {
                super(null);
                AbstractC6492s.i(settings, "settings");
                this.f43179a = settings;
            }

            public final C6796a b() {
                return this.f43179a;
            }
        }

        /* renamed from: com.ui.wifiman.model.support.a$a$b */
        public static final class b extends AbstractC1437a {

            /* renamed from: a, reason: collision with root package name */
            private final Set f43180a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Set table) {
                super(null);
                AbstractC6492s.i(table, "table");
                this.f43180a = table;
            }

            public final Set b() {
                return this.f43180a;
            }
        }

        /* renamed from: com.ui.wifiman.model.support.a$a$c */
        public static final class c extends AbstractC1437a {

            /* renamed from: a, reason: collision with root package name */
            private final C6574a f43181a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C6574a session) {
                super(null);
                AbstractC6492s.i(session, "session");
                this.f43181a = session;
            }

            public final C6574a b() {
                return this.f43181a;
            }
        }

        /* renamed from: com.ui.wifiman.model.support.a$a$d */
        public static final class d extends AbstractC1437a {

            /* renamed from: a, reason: collision with root package name */
            private final Zc.e f43182a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Zc.e connection) {
                super(null);
                AbstractC6492s.i(connection, "connection");
                this.f43182a = connection;
            }

            public final Zc.e b() {
                return this.f43182a;
            }
        }

        public /* synthetic */ AbstractC1437a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            String name = getClass().getName();
            AbstractC6492s.h(name, "getName(...)");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!AbstractC6492s.d(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            AbstractC6492s.g(obj, "null cannot be cast to non-null type com.ui.wifiman.model.support.SupportFileDataCollector.SupportData");
            return AbstractC6492s.d(a(), ((AbstractC1437a) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        private AbstractC1437a() {
        }
    }

    void b(AbstractC1437a abstractC1437a);
}
