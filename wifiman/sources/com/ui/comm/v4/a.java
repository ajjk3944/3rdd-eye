package com.ui.comm.v4;

import com.ui.binme.BinaryMessage;
import e9.InterfaceC5429a;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class a implements InterfaceC5429a {

    /* renamed from: a, reason: collision with root package name */
    private BinaryMessage.b f41281a;

    /* renamed from: b, reason: collision with root package name */
    private BinaryMessage.b f41282b;

    /* renamed from: com.ui.comm.v4.a$a, reason: collision with other inner class name */
    public static final class C1303a extends a {

        /* renamed from: c, reason: collision with root package name */
        private final com.ui.comm.v4.b f41283c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1303a(com.ui.comm.v4.b body) {
            super(null);
            AbstractC6492s.i(body, "body");
            this.f41283c = body;
        }

        @Override // com.ui.comm.v4.a
        public com.ui.comm.v4.b a() {
            return this.f41283c;
        }
    }

    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        private final int f41284c;

        /* renamed from: d, reason: collision with root package name */
        private final com.ui.comm.v4.b f41285d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, com.ui.comm.v4.b body) {
            super(null);
            AbstractC6492s.i(body, "body");
            this.f41284c = i10;
            this.f41285d = body;
        }

        @Override // com.ui.comm.v4.a
        public com.ui.comm.v4.b a() {
            return this.f41285d;
        }

        public final int f() {
            return this.f41284c;
        }
    }

    public static abstract class c extends a {

        /* renamed from: com.ui.comm.v4.a$c$a, reason: collision with other inner class name */
        public static final class C1304a extends c {

            /* renamed from: c, reason: collision with root package name */
            private final d f41286c;

            /* renamed from: d, reason: collision with root package name */
            private final com.ui.comm.v4.b f41287d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1304a(d desc, com.ui.comm.v4.b body) {
                super(null);
                AbstractC6492s.i(desc, "desc");
                AbstractC6492s.i(body, "body");
                this.f41286c = desc;
                this.f41287d = body;
            }

            @Override // com.ui.comm.v4.a
            public com.ui.comm.v4.b a() {
                return this.f41287d;
            }

            @Override // com.ui.comm.v4.a.c
            public d f() {
                return this.f41286c;
            }
        }

        public static final class b extends c {

            /* renamed from: c, reason: collision with root package name */
            private final d f41288c;

            /* renamed from: d, reason: collision with root package name */
            private final com.ui.comm.v4.b f41289d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d desc, com.ui.comm.v4.b body) {
                super(null);
                AbstractC6492s.i(desc, "desc");
                AbstractC6492s.i(body, "body");
                this.f41288c = desc;
                this.f41289d = body;
            }

            @Override // com.ui.comm.v4.a
            public com.ui.comm.v4.b a() {
                return this.f41289d;
            }

            @Override // com.ui.comm.v4.a.c
            public d f() {
                return this.f41288c;
            }
        }

        /* renamed from: com.ui.comm.v4.a$c$c, reason: collision with other inner class name */
        public static final class C1305c extends c {

            /* renamed from: c, reason: collision with root package name */
            private final d f41290c;

            /* renamed from: d, reason: collision with root package name */
            private final com.ui.comm.v4.b f41291d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1305c(d desc, com.ui.comm.v4.b body) {
                super(null);
                AbstractC6492s.i(desc, "desc");
                AbstractC6492s.i(body, "body");
                this.f41290c = desc;
                this.f41291d = body;
            }

            @Override // com.ui.comm.v4.a
            public com.ui.comm.v4.b a() {
                return this.f41291d;
            }

            @Override // com.ui.comm.v4.a.c
            public d f() {
                return this.f41290c;
            }
        }

        public static final class d extends c {

            /* renamed from: c, reason: collision with root package name */
            private final d f41292c;

            /* renamed from: d, reason: collision with root package name */
            private final com.ui.comm.v4.b f41293d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(d desc, com.ui.comm.v4.b body) {
                super(null);
                AbstractC6492s.i(desc, "desc");
                AbstractC6492s.i(body, "body");
                this.f41292c = desc;
                this.f41293d = body;
            }

            @Override // com.ui.comm.v4.a
            public com.ui.comm.v4.b a() {
                return this.f41293d;
            }

            @Override // com.ui.comm.v4.a.c
            public d f() {
                return this.f41292c;
            }
        }

        public static final class e extends c {

            /* renamed from: c, reason: collision with root package name */
            private final d f41294c;

            /* renamed from: d, reason: collision with root package name */
            private final com.ui.comm.v4.b f41295d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(d desc, com.ui.comm.v4.b body) {
                super(null);
                AbstractC6492s.i(desc, "desc");
                AbstractC6492s.i(body, "body");
                this.f41294c = desc;
                this.f41295d = body;
            }

            @Override // com.ui.comm.v4.a
            public com.ui.comm.v4.b a() {
                return this.f41295d;
            }

            @Override // com.ui.comm.v4.a.c
            public d f() {
                return this.f41294c;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract d f();

        private c() {
            super(null);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f41296a;

        /* renamed from: b, reason: collision with root package name */
        private final String f41297b;

        public d(int i10, String str) {
            this.f41296a = i10;
            this.f41297b = str;
        }

        public final int a() {
            return this.f41296a;
        }

        public final String b() {
            return this.f41297b;
        }

        public String toString() {
            return "Error [" + this.f41296a + "] - " + this.f41297b;
        }
    }

    public static final class e extends a {

        /* renamed from: c, reason: collision with root package name */
        private final String f41298c;

        /* renamed from: d, reason: collision with root package name */
        private final com.ui.comm.v4.b f41299d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String name, com.ui.comm.v4.b body) {
            super(null);
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(body, "body");
            this.f41298c = name;
            this.f41299d = body;
        }

        @Override // com.ui.comm.v4.a
        public com.ui.comm.v4.b a() {
            return this.f41299d;
        }

        public final String f() {
            return this.f41298c;
        }
    }

    public static final class f extends a {

        /* renamed from: c, reason: collision with root package name */
        private final String f41300c;

        /* renamed from: d, reason: collision with root package name */
        private final String f41301d;

        /* renamed from: e, reason: collision with root package name */
        private final Map f41302e;

        /* renamed from: f, reason: collision with root package name */
        private final com.ui.comm.v4.b f41303f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String method, String path, Map headers, com.ui.comm.v4.b body) {
            super(null);
            AbstractC6492s.i(method, "method");
            AbstractC6492s.i(path, "path");
            AbstractC6492s.i(headers, "headers");
            AbstractC6492s.i(body, "body");
            this.f41300c = method;
            this.f41301d = path;
            this.f41302e = headers;
            this.f41303f = body;
        }

        @Override // com.ui.comm.v4.a
        public com.ui.comm.v4.b a() {
            return this.f41303f;
        }

        public final Map f() {
            return this.f41302e;
        }

        public final String g() {
            return this.f41300c;
        }

        public final String h() {
            return this.f41301d;
        }
    }

    public static final class g extends a {

        /* renamed from: c, reason: collision with root package name */
        private final int f41304c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f41305d;

        /* renamed from: e, reason: collision with root package name */
        private final com.ui.comm.v4.b f41306e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, Map headers, com.ui.comm.v4.b body) {
            super(null);
            AbstractC6492s.i(headers, "headers");
            AbstractC6492s.i(body, "body");
            this.f41304c = i10;
            this.f41305d = headers;
            this.f41306e = body;
        }

        @Override // com.ui.comm.v4.a
        public com.ui.comm.v4.b a() {
            return this.f41306e;
        }

        public final Map f() {
            return this.f41305d;
        }

        public final int g() {
            return this.f41304c;
        }
    }

    public static final class h extends a {

        /* renamed from: c, reason: collision with root package name */
        private final EnumC1306a f41307c;

        /* renamed from: d, reason: collision with root package name */
        private final com.ui.comm.v4.b f41308d;

        /* renamed from: com.ui.comm.v4.a$h$a, reason: collision with other inner class name */
        public enum EnumC1306a {
            SILLY,
            DEBUG,
            VERBOSE,
            INFO,
            WARN,
            ERROR,
            CRITICAL
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(EnumC1306a level, com.ui.comm.v4.b body) {
            super(null);
            AbstractC6492s.i(level, "level");
            AbstractC6492s.i(body, "body");
            this.f41307c = level;
            this.f41308d = body;
        }

        @Override // com.ui.comm.v4.a
        public com.ui.comm.v4.b a() {
            return this.f41308d;
        }

        public final EnumC1306a f() {
            return this.f41307c;
        }
    }

    public static final class i extends a {

        /* renamed from: c, reason: collision with root package name */
        private final String f41309c;

        /* renamed from: d, reason: collision with root package name */
        private final com.ui.comm.v4.b f41310d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String action, com.ui.comm.v4.b body) {
            super(null);
            AbstractC6492s.i(action, "action");
            AbstractC6492s.i(body, "body");
            this.f41309c = action;
            this.f41310d = body;
        }

        @Override // com.ui.comm.v4.a
        public com.ui.comm.v4.b a() {
            return this.f41310d;
        }

        public final String f() {
            return this.f41309c;
        }
    }

    public static abstract class j extends a {

        /* renamed from: com.ui.comm.v4.a$j$a, reason: collision with other inner class name */
        public static final class C1307a extends j {

            /* renamed from: c, reason: collision with root package name */
            private final d f41311c;

            /* renamed from: d, reason: collision with root package name */
            private final com.ui.comm.v4.b f41312d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1307a(d error, com.ui.comm.v4.b body) {
                super(null);
                AbstractC6492s.i(error, "error");
                AbstractC6492s.i(body, "body");
                this.f41311c = error;
                this.f41312d = body;
            }

            @Override // com.ui.comm.v4.a
            public com.ui.comm.v4.b a() {
                return this.f41312d;
            }

            public final d f() {
                return this.f41311c;
            }
        }

        public static final class b extends j {

            /* renamed from: c, reason: collision with root package name */
            private final com.ui.comm.v4.b f41313c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(com.ui.comm.v4.b body) {
                super(null);
                AbstractC6492s.i(body, "body");
                this.f41313c = body;
            }

            @Override // com.ui.comm.v4.a
            public com.ui.comm.v4.b a() {
                return this.f41313c;
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
            super(null);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract com.ui.comm.v4.b a();

    public final BinaryMessage.b b() {
        return this.f41282b;
    }

    public final BinaryMessage.b c() {
        return this.f41281a;
    }

    public final void d(BinaryMessage.b bVar) {
        this.f41282b = bVar;
    }

    public final void e(BinaryMessage.b bVar) {
        this.f41281a = bVar;
    }

    public String toString() {
        if (this instanceof i) {
            return "Request (action:" + ((i) this).f() + ")";
        }
        if (this instanceof j.b) {
            return "Response (SUCCESS)";
        }
        if (this instanceof j.C1307a) {
            return "Response (FAILED) " + ((j.C1307a) this).f() + "]";
        }
        if (this instanceof f) {
            f fVar = (f) this;
            return "HTTP Request (" + fVar.g() + " '" + fVar.h() + "')";
        }
        if (this instanceof g) {
            return "HTTP Response (" + ((g) this).g() + ")";
        }
        if (this instanceof h) {
            return "Log (level: " + ((h) this).f() + ")";
        }
        if (this instanceof e) {
            return " Event (" + ((e) this).f() + " )";
        }
        if (this instanceof c) {
            return "Error (" + ((c) this).f() + ")";
        }
        if (this instanceof C1303a) {
            return "Cmd";
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        return "CmdResult (exit code: " + ((b) this).f() + ")";
    }

    private a() {
    }
}
