package org.kodein.di;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.kodein.di.c;
import org.kodein.type.q;
import org.snmp4j.util.SnmpConfigurator;
import rj.AbstractC7726l2;
import uj.q;

/* loaded from: classes4.dex */
public interface DI extends org.kodein.di.c {

    /* renamed from: e1, reason: collision with root package name */
    public static final c f56898e1 = c.f56900a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lorg/kodein/di/DI$DependencyLoopException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "kodein-di"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DependencyLoopException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DependencyLoopException(String message) {
            super(message);
            AbstractC6492s.i(message, "message");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lorg/kodein/di/DI$NoResultException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "kodein-di"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NoResultException extends RuntimeException {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR#\u0010\u0004\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lorg/kodein/di/DI$NotFoundException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lorg/kodein/di/DI$e;", "key", "", "message", "<init>", "(Lorg/kodein/di/DI$e;Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lorg/kodein/di/DI$e;", "getKey", "()Lorg/kodein/di/DI$e;", "kodein-di"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotFoundException extends RuntimeException {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final e key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotFoundException(e key, String message) {
            super(message);
            AbstractC6492s.i(key, "key");
            AbstractC6492s.i(message, "message");
            this.key = key;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lorg/kodein/di/DI$OverridingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "kodein-di"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OverridingException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverridingException(String message) {
            super(message);
            AbstractC6492s.i(message, "message");
        }
    }

    public interface a {

        /* renamed from: org.kodein.di.DI$a$a, reason: collision with other inner class name */
        public interface InterfaceC2015a extends a {
            q c();
        }

        org.kodein.type.q b();

        boolean e();
    }

    public interface b extends a, a.InterfaceC2015a {

        public static final class a {
            public static /* synthetic */ void a(b bVar, g gVar, boolean z10, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: import");
                }
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                bVar.a(gVar, z10);
            }
        }

        /* renamed from: org.kodein.di.DI$b$b, reason: collision with other inner class name */
        public interface InterfaceC2016b {
            void a(uj.e eVar);
        }

        void a(g gVar, boolean z10);

        InterfaceC2016b d(org.kodein.type.q qVar, Object obj, Boolean bool);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ c f56900a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static boolean f56901b;

        /* renamed from: c, reason: collision with root package name */
        private static boolean f56902c;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f56903a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f56904b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z10, InterfaceC6835l interfaceC6835l) {
                super(0);
                this.f56903a = z10;
                this.f56904b = interfaceC6835l;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DI invoke() {
                return new vj.e(this.f56903a, this.f56904b);
            }
        }

        private c() {
        }

        public static /* synthetic */ j d(c cVar, boolean z10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return cVar.c(z10, interfaceC6835l);
        }

        public final boolean a() {
            return f56902c;
        }

        public final boolean b() {
            return f56901b;
        }

        public final j c(boolean z10, InterfaceC6835l init) {
            AbstractC6492s.i(init, "init");
            return new j(new a(z10, init));
        }
    }

    public static final class d {
        public static DI a(DI di2) {
            return di2;
        }

        public static org.kodein.di.f b(DI di2) {
            return c.a.a(di2);
        }

        public static AbstractC7726l2 c(DI di2) {
            c.a.b(di2);
            return null;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final org.kodein.type.q f56905a;

        /* renamed from: b, reason: collision with root package name */
        private final org.kodein.type.q f56906b;

        /* renamed from: c, reason: collision with root package name */
        private final org.kodein.type.q f56907c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f56908d;

        /* renamed from: e, reason: collision with root package name */
        private int f56909e;

        /* synthetic */ class a extends C6490p implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f56910a = new a();

            a() {
                super(1, org.kodein.type.q.class, "simpleDispString", "simpleDispString()Ljava/lang/String;", 0);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(org.kodein.type.q p02) {
                AbstractC6492s.i(p02, "p0");
                return p02.i();
            }
        }

        /* synthetic */ class b extends C6490p implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f56911a = new b();

            b() {
                super(1, org.kodein.type.q.class, "qualifiedDispString", "qualifiedDispString()Ljava/lang/String;", 0);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(org.kodein.type.q p02) {
                AbstractC6492s.i(p02, "p0");
                return p02.h();
            }
        }

        public e(org.kodein.type.q contextType, org.kodein.type.q argType, org.kodein.type.q type, Object obj) {
            AbstractC6492s.i(contextType, "contextType");
            AbstractC6492s.i(argType, "argType");
            AbstractC6492s.i(type, "type");
            this.f56905a = contextType;
            this.f56906b = argType;
            this.f56907c = type;
            this.f56908d = obj;
        }

        private final void a(StringBuilder sb2, InterfaceC6835l interfaceC6835l) {
            if (this.f56908d != null) {
                sb2.append(" tagged \"" + this.f56908d + '\"');
            }
            org.kodein.type.q qVar = this.f56905a;
            q.a aVar = org.kodein.type.q.f56966a;
            if (!AbstractC6492s.d(qVar, aVar.a())) {
                sb2.append(" on context " + ((String) interfaceC6835l.invoke(this.f56905a)));
            }
            if (AbstractC6492s.d(this.f56906b, aVar.b())) {
                return;
            }
            sb2.append(", with argument " + ((String) interfaceC6835l.invoke(this.f56906b)));
        }

        public static /* synthetic */ e c(e eVar, org.kodein.type.q qVar, org.kodein.type.q qVar2, org.kodein.type.q qVar3, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                qVar = eVar.f56905a;
            }
            if ((i10 & 2) != 0) {
                qVar2 = eVar.f56906b;
            }
            if ((i10 & 4) != 0) {
                qVar3 = eVar.f56907c;
            }
            if ((i10 & 8) != 0) {
                obj = eVar.f56908d;
            }
            return eVar.b(qVar, qVar2, qVar3, obj);
        }

        public final e b(org.kodein.type.q contextType, org.kodein.type.q argType, org.kodein.type.q type, Object obj) {
            AbstractC6492s.i(contextType, "contextType");
            AbstractC6492s.i(argType, "argType");
            AbstractC6492s.i(type, "type");
            return new e(contextType, argType, type, obj);
        }

        public final org.kodein.type.q d() {
            return this.f56906b;
        }

        public final String e() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bind<" + this.f56907c.i() + '>');
            if (this.f56908d != null) {
                sb2.append("(tag = \"" + this.f56908d + "\")");
            }
            String string = sb2.toString();
            AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC6492s.d(this.f56905a, eVar.f56905a) && AbstractC6492s.d(this.f56906b, eVar.f56906b) && AbstractC6492s.d(this.f56907c, eVar.f56907c) && AbstractC6492s.d(this.f56908d, eVar.f56908d);
        }

        public final String f() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bind<" + this.f56907c.h() + '>');
            if (this.f56908d != null) {
                sb2.append("(tag = \"" + this.f56908d + "\")");
            }
            String string = sb2.toString();
            AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final org.kodein.type.q g() {
            return this.f56905a;
        }

        public final String h() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f56907c.i());
            a(sb2, a.f56910a);
            String string = sb2.toString();
            AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public int hashCode() {
            if (this.f56909e == 0) {
                int iHashCode = this.f56905a.hashCode();
                this.f56909e = iHashCode;
                this.f56909e = (iHashCode * 31) + this.f56906b.hashCode();
                int iHashCode2 = this.f56907c.hashCode();
                this.f56909e = iHashCode2 * 29;
                int i10 = iHashCode2 * 667;
                Object obj = this.f56908d;
                this.f56909e = i10 + (obj != null ? obj.hashCode() : 0);
            }
            return this.f56909e;
        }

        public final String i() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f56907c.h());
            a(sb2, b.f56911a);
            String string = sb2.toString();
            AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final String j() {
            return "(context: " + this.f56905a.i() + ", arg: " + this.f56906b.i() + ", type: " + this.f56907c.i() + ", tag: " + this.f56908d + ')';
        }

        public final Object k() {
            return this.f56908d;
        }

        public final org.kodein.type.q l() {
            return this.f56907c;
        }

        public String toString() {
            return h();
        }
    }

    public interface f extends b {
    }

    org.kodein.di.e y();

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f56912a;

        /* renamed from: b, reason: collision with root package name */
        private final String f56913b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC6835l f56914c;

        /* renamed from: d, reason: collision with root package name */
        private String f56915d;

        public g(boolean z10, String prefix, InterfaceC6835l init) {
            AbstractC6492s.i(prefix, "prefix");
            AbstractC6492s.i(init, "init");
            this.f56912a = z10;
            this.f56913b = prefix;
            this.f56914c = init;
        }

        public final boolean a() {
            return this.f56912a;
        }

        public final InterfaceC6835l b() {
            return this.f56914c;
        }

        public final String c() {
            String str = this.f56915d;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("module must have a name.");
        }

        public final String d() {
            return this.f56913b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f56912a == gVar.f56912a && AbstractC6492s.d(this.f56913b, gVar.f56913b) && AbstractC6492s.d(this.f56914c, gVar.f56914c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z10 = this.f56912a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            return (((r02 * 31) + this.f56913b.hashCode()) * 31) + this.f56914c.hashCode();
        }

        public String toString() {
            return "Module(allowSilentOverride=" + this.f56912a + ", prefix=" + this.f56913b + ", init=" + this.f56914c + ')';
        }

        public /* synthetic */ g(String str, boolean z10, String str2, InterfaceC6835l interfaceC6835l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? "" : str2, interfaceC6835l);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public g(String name, boolean z10, String prefix, InterfaceC6835l init) {
            this(z10, prefix, init);
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(prefix, "prefix");
            AbstractC6492s.i(init, "init");
            this.f56915d = name;
        }
    }
}
