package Bh;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f1810a = new v0();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f1811b;

    /* renamed from: c, reason: collision with root package name */
    private static final h f1812c;

    public static final class a extends w0 {

        /* renamed from: c, reason: collision with root package name */
        public static final a f1813c = new a();

        private a() {
            super("inherited", false);
        }
    }

    public static final class b extends w0 {

        /* renamed from: c, reason: collision with root package name */
        public static final b f1814c = new b();

        private b() {
            super("internal", false);
        }
    }

    public static final class c extends w0 {

        /* renamed from: c, reason: collision with root package name */
        public static final c f1815c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    public static final class d extends w0 {

        /* renamed from: c, reason: collision with root package name */
        public static final d f1816c = new d();

        private d() {
            super("local", false);
        }
    }

    public static final class e extends w0 {

        /* renamed from: c, reason: collision with root package name */
        public static final e f1817c = new e();

        private e() {
            super("private", false);
        }
    }

    public static final class f extends w0 {

        /* renamed from: c, reason: collision with root package name */
        public static final f f1818c = new f();

        private f() {
            super("private_to_this", false);
        }

        @Override // Bh.w0
        public String b() {
            return "private/*private to this*/";
        }
    }

    public static final class g extends w0 {

        /* renamed from: c, reason: collision with root package name */
        public static final g f1819c = new g();

        private g() {
            super("protected", true);
        }
    }

    public static final class h extends w0 {

        /* renamed from: c, reason: collision with root package name */
        public static final h f1820c = new h();

        private h() {
            super("public", true);
        }
    }

    public static final class i extends w0 {

        /* renamed from: c, reason: collision with root package name */
        public static final i f1821c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map mapC = Zg.U.c();
        mapC.put(f.f1818c, 0);
        mapC.put(e.f1817c, 0);
        mapC.put(b.f1814c, 1);
        mapC.put(g.f1819c, 1);
        h hVar = h.f1820c;
        mapC.put(hVar, 2);
        f1811b = Zg.U.b(mapC);
        f1812c = hVar;
    }

    private v0() {
    }

    public final Integer a(w0 first, w0 second) {
        AbstractC6492s.i(first, "first");
        AbstractC6492s.i(second, "second");
        if (first == second) {
            return 0;
        }
        Map map = f1811b;
        Integer num = (Integer) map.get(first);
        Integer num2 = (Integer) map.get(second);
        if (num == null || num2 == null || AbstractC6492s.d(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(w0 visibility) {
        AbstractC6492s.i(visibility, "visibility");
        return visibility == e.f1817c || visibility == f.f1818c;
    }
}
