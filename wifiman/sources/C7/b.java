package C7;

import Yg.J;
import Yg.m;
import Yg.n;
import Yg.u;
import Yg.v;
import Yg.z;
import Zg.AbstractC3682n;
import Zg.U;
import com.ubnt.discovery.server.lan.processing.InvalidPacketException;
import com.ubnt.discovery.server.lan.processing.parser.UnknownFieldException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import s7.C7916c;
import s7.InterfaceC7921h;
import t7.C8037a;
import t7.C8039c;
import t7.C8040d;
import t7.EnumC8038b;
import v7.C8195b;
import v7.EnumC8194a;
import y7.EnumC8621a;
import y7.n;
import y7.o;
import y7.p;
import y7.q;
import y7.r;
import y7.s;

/* loaded from: classes3.dex */
public final class b extends A7.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f2249a = 4;

    /* renamed from: b, reason: collision with root package name */
    private final int f2250b = 3;

    /* renamed from: c, reason: collision with root package name */
    private final m f2251c = n.b(C0101b.f2314a);

    /* renamed from: d, reason: collision with root package name */
    private final m f2252d = n.b(c.f2315a);

    private static abstract class a {

        /* renamed from: C7.b$a$a, reason: collision with other inner class name */
        public static final class C0082a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0082a f2253a = new C0082a();

            /* renamed from: b, reason: collision with root package name */
            private static final int f2254b = 81;

            /* renamed from: c, reason: collision with root package name */
            private static final InterfaceC6835l f2255c = C0083a.f2256a;

            /* renamed from: C7.b$a$a$a, reason: collision with other inner class name */
            static final class C0083a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0083a f2256a = new C0083a();

                C0083a() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final q.a invoke(byte[] data) {
                    AbstractC6492s.i(data, "data");
                    return new q.a(EnumC8621a.Companion.a(C8195b.f63487a.b(data, EnumC8194a.BIG_ENDIAN)));
                }
            }

            private C0082a() {
                super(null);
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return f2255c;
            }

            public int b() {
                return f2254b;
            }
        }

        /* renamed from: C7.b$a$b, reason: collision with other inner class name */
        public static abstract class AbstractC0084b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC6835l f2257a;

            /* renamed from: C7.b$a$b$a, reason: collision with other inner class name */
            public static final class C0085a extends AbstractC0084b {

                /* renamed from: b, reason: collision with root package name */
                public static final C0085a f2258b = new C0085a();

                /* renamed from: c, reason: collision with root package name */
                private static final int f2259c = 24;

                private C0085a() {
                    super(null);
                }

                public int b() {
                    return f2259c;
                }
            }

            /* renamed from: C7.b$a$b$b, reason: collision with other inner class name */
            public static final class C0086b extends AbstractC0084b {

                /* renamed from: b, reason: collision with root package name */
                public static final C0086b f2260b = new C0086b();

                /* renamed from: c, reason: collision with root package name */
                private static final int f2261c = 23;

                private C0086b() {
                    super(null);
                }

                public int b() {
                    return f2261c;
                }
            }

            /* renamed from: C7.b$a$b$c */
            static final class c extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final c f2262a = new c();

                c() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final EnumC8038b invoke(byte[] data) {
                    AbstractC6492s.i(data, "data");
                    return C7.a.f2248a.a(data);
                }
            }

            public /* synthetic */ AbstractC0084b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return this.f2257a;
            }

            private AbstractC0084b() {
                super(null);
                this.f2257a = c.f2262a;
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f2263a = new c();

            /* renamed from: b, reason: collision with root package name */
            private static final int f2264b = 13;

            /* renamed from: c, reason: collision with root package name */
            private static final InterfaceC6835l f2265c = C0087a.f2266a;

            /* renamed from: C7.b$a$c$a, reason: collision with other inner class name */
            static final class C0087a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0087a f2266a = new C0087a();

                C0087a() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final y7.m invoke(byte[] data) {
                    AbstractC6492s.i(data, "data");
                    return new y7.m(new String(data, C6510d.f52215b));
                }
            }

            private c() {
                super(null);
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return f2265c;
            }

            public int b() {
                return f2264b;
            }
        }

        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f2267a = new d();

            /* renamed from: b, reason: collision with root package name */
            private static final int f2268b = 3;

            /* renamed from: c, reason: collision with root package name */
            private static final InterfaceC6835l f2269c = C0088a.f2270a;

            /* renamed from: C7.b$a$d$a, reason: collision with other inner class name */
            static final class C0088a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0088a f2270a = new C0088a();

                C0088a() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final InterfaceC7921h invoke(byte[] data) {
                    AbstractC6492s.i(data, "data");
                    n.d dVar = y7.n.f66399g;
                    Charset charset = C6510d.f52215b;
                    y7.n nVarD = dVar.d(new String(data, charset));
                    return nVarD != null ? nVarD : new o(new String(data, charset));
                }
            }

            private d() {
                super(null);
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return f2269c;
            }

            public int b() {
                return f2268b;
            }
        }

        public static final class e extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f2271a = new e();

            /* renamed from: b, reason: collision with root package name */
            private static final int f2272b = 43;

            /* renamed from: c, reason: collision with root package name */
            private static final InterfaceC6835l f2273c = C0089a.f2274a;

            /* renamed from: C7.b$a$e$a, reason: collision with other inner class name */
            static final class C0089a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0089a f2274a = new C0089a();

                C0089a() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C8039c invoke(byte[] data) {
                    Object objC;
                    AbstractC6492s.i(data, "data");
                    e eVar = e.f2271a;
                    try {
                        u.a aVar = u.f25017b;
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(data);
                        objC = u.c(new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong()));
                    } catch (Throwable th2) {
                        u.a aVar2 = u.f25017b;
                        objC = u.c(v.a(th2));
                    }
                    if (u.l(objC)) {
                        objC = null;
                    }
                    return new C8039c((UUID) objC);
                }
            }

            private e() {
                super(null);
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return f2273c;
            }

            public int b() {
                return f2272b;
            }
        }

        public static final class f extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final f f2275a = new f();

            /* renamed from: b, reason: collision with root package name */
            private static final int f2276b = 1;

            /* renamed from: c, reason: collision with root package name */
            private static final InterfaceC6835l f2277c = C0090a.f2278a;

            /* renamed from: C7.b$a$f$a, reason: collision with other inner class name */
            static final class C0090a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0090a f2278a = new C0090a();

                C0090a() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C8040d invoke(byte[] data) {
                    AbstractC6492s.i(data, "data");
                    return new C8040d(data);
                }
            }

            private f() {
                super(null);
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return f2277c;
            }

            public int b() {
                return f2276b;
            }
        }

        public static final class g extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final g f2279a = new g();

            /* renamed from: b, reason: collision with root package name */
            private static final int f2280b = 11;

            /* renamed from: c, reason: collision with root package name */
            private static final InterfaceC6835l f2281c = C0091a.f2282a;

            /* renamed from: C7.b$a$g$a, reason: collision with other inner class name */
            static final class C0091a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0091a f2282a = new C0091a();

                C0091a() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C8037a invoke(byte[] data) {
                    AbstractC6492s.i(data, "data");
                    return new C8037a(new String(data, C6510d.f52215b));
                }
            }

            private g() {
                super(null);
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return f2281c;
            }

            public int b() {
                return f2280b;
            }
        }

        public static abstract class h extends a {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC6835l f2283a;

            /* renamed from: C7.b$a$h$a, reason: collision with other inner class name */
            public static final class C0092a extends h {

                /* renamed from: b, reason: collision with root package name */
                public static final C0092a f2284b = new C0092a();

                /* renamed from: c, reason: collision with root package name */
                private static final int f2285c = 12;

                private C0092a() {
                    super(null);
                }

                public int b() {
                    return f2285c;
                }
            }

            /* renamed from: C7.b$a$h$b, reason: collision with other inner class name */
            public static final class C0093b extends h {

                /* renamed from: b, reason: collision with root package name */
                public static final C0093b f2286b = new C0093b();

                /* renamed from: c, reason: collision with root package name */
                private static final int f2287c = 21;

                private C0093b() {
                    super(null);
                }

                public int b() {
                    return f2287c;
                }
            }

            static final class c extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final c f2288a = new c();

                c() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final t7.e invoke(byte[] data) {
                    AbstractC6492s.i(data, "data");
                    return new t7.e(new String(data, C6510d.f52215b));
                }
            }

            public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return this.f2283a;
            }

            private h() {
                super(null);
                this.f2283a = c.f2288a;
            }
        }

        public static final class i extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final i f2289a = new i();

            /* renamed from: b, reason: collision with root package name */
            private static final int f2290b = 2;

            /* renamed from: c, reason: collision with root package name */
            private static final InterfaceC6835l f2291c = C0094a.f2292a;

            /* renamed from: C7.b$a$i$a, reason: collision with other inner class name */
            static final class C0094a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0094a f2292a = new C0094a();

                C0094a() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final y7.l invoke(byte[] data) {
                    AbstractC6492s.i(data, "data");
                    return C7.a.f2248a.c(data);
                }
            }

            private i() {
                super(null);
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return f2291c;
            }

            public int b() {
                return f2290b;
            }
        }

        public static final class j extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final j f2293a = new j();

            /* renamed from: b, reason: collision with root package name */
            private static final int f2294b = 20;

            /* renamed from: c, reason: collision with root package name */
            private static final InterfaceC6835l f2295c = C0095a.f2296a;

            /* renamed from: C7.b$a$j$a, reason: collision with other inner class name */
            static final class C0095a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0095a f2296a = new C0095a();

                C0095a() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final r invoke(byte[] data) {
                    AbstractC6492s.i(data, "data");
                    return new r(new String(data, C6510d.f52215b));
                }
            }

            private j() {
                super(null);
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return f2295c;
            }

            public int b() {
                return f2294b;
            }
        }

        public static final class k extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final k f2297a = new k();

            /* renamed from: b, reason: collision with root package name */
            private static final int f2298b = 56;

            /* renamed from: c, reason: collision with root package name */
            private static final InterfaceC6835l f2299c = C0096a.f2300a;

            /* renamed from: C7.b$a$k$a, reason: collision with other inner class name */
            static final class C0096a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0096a f2300a = new C0096a();

                C0096a() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final p invoke(byte[] data) {
                    AbstractC6492s.i(data, "data");
                    return new p(C8195b.f63487a.b(data, EnumC8194a.BIG_ENDIAN) == 1);
                }
            }

            private k() {
                super(null);
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return f2299c;
            }

            public int b() {
                return f2298b;
            }
        }

        public static final class l extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final l f2301a = new l();

            /* renamed from: b, reason: collision with root package name */
            private static final int f2302b = 16;

            /* renamed from: c, reason: collision with root package name */
            private static final InterfaceC6835l f2303c = C0097a.f2304a;

            /* renamed from: C7.b$a$l$a, reason: collision with other inner class name */
            static final class C0097a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0097a f2304a = new C0097a();

                /* renamed from: C7.b$a$l$a$a, reason: collision with other inner class name */
                static final class C0098a extends AbstractC6494u implements InterfaceC6835l {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0098a f2305a = new C0098a();

                    C0098a() {
                        super(1);
                    }

                    public final CharSequence a(byte b10) {
                        String str = String.format("%02x", Byte.valueOf(b10));
                        AbstractC6492s.h(str, "format(\"%02x\", it)");
                        return str;
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return a(((Number) obj).byteValue());
                    }
                }

                C0097a() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final t7.f invoke(byte[] data) {
                    AbstractC6492s.i(data, "data");
                    return new t7.f(AbstractC3682n.D0(data, "", null, null, 0, null, C0098a.f2305a, 30, null));
                }
            }

            private l() {
                super(null);
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return f2303c;
            }

            public int b() {
                return f2302b;
            }
        }

        public static final class m extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final m f2306a = new m();

            /* renamed from: b, reason: collision with root package name */
            private static final int f2307b = 10;

            /* renamed from: c, reason: collision with root package name */
            private static final InterfaceC6835l f2308c = C0099a.f2309a;

            /* renamed from: C7.b$a$m$a, reason: collision with other inner class name */
            static final class C0099a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0099a f2309a = new C0099a();

                C0099a() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final t7.g invoke(byte[] data) {
                    AbstractC6492s.i(data, "data");
                    return new t7.g(C8195b.f63487a.b(data, EnumC8194a.BIG_ENDIAN));
                }
            }

            private m() {
                super(null);
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return f2308c;
            }

            public int b() {
                return f2307b;
            }
        }

        public static final class n extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final n f2310a = new n();

            /* renamed from: b, reason: collision with root package name */
            private static final int f2311b = 14;

            /* renamed from: c, reason: collision with root package name */
            private static final InterfaceC6835l f2312c = C0100a.f2313a;

            /* renamed from: C7.b$a$n$a, reason: collision with other inner class name */
            static final class C0100a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0100a f2313a = new C0100a();

                C0100a() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final s invoke(byte[] data) {
                    AbstractC6492s.i(data, "data");
                    return s.Companion.a(C8195b.f63487a.b(data, EnumC8194a.BIG_ENDIAN));
                }
            }

            private n() {
                super(null);
            }

            @Override // C7.b.a
            public InterfaceC6835l a() {
                return f2312c;
            }

            public int b() {
                return f2311b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract InterfaceC6835l a();

        private a() {
        }
    }

    /* renamed from: C7.b$b, reason: collision with other inner class name */
    static final class C0101b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0101b f2314a = new C0101b();

        C0101b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            a.f fVar = a.f.f2275a;
            Yg.s sVarA = z.a(Integer.valueOf(fVar.b()), fVar);
            a.i iVar = a.i.f2289a;
            Yg.s sVarA2 = z.a(Integer.valueOf(iVar.b()), iVar);
            a.d dVar = a.d.f2267a;
            Yg.s sVarA3 = z.a(Integer.valueOf(dVar.b()), dVar);
            a.m mVar = a.m.f2306a;
            Yg.s sVarA4 = z.a(Integer.valueOf(mVar.b()), mVar);
            a.k kVar = a.k.f2297a;
            Yg.s sVarA5 = z.a(Integer.valueOf(kVar.b()), kVar);
            a.g gVar = a.g.f2279a;
            Yg.s sVarA6 = z.a(Integer.valueOf(gVar.b()), gVar);
            a.h.C0092a c0092a = a.h.C0092a.f2284b;
            Yg.s sVarA7 = z.a(Integer.valueOf(c0092a.b()), c0092a);
            a.n nVar = a.n.f2310a;
            Yg.s sVarA8 = z.a(Integer.valueOf(nVar.b()), nVar);
            a.j jVar = a.j.f2293a;
            Yg.s sVarA9 = z.a(Integer.valueOf(jVar.b()), jVar);
            a.l lVar = a.l.f2301a;
            Yg.s sVarA10 = z.a(Integer.valueOf(lVar.b()), lVar);
            a.AbstractC0084b.C0085a c0085a = a.AbstractC0084b.C0085a.f2258b;
            Yg.s sVarA11 = z.a(Integer.valueOf(c0085a.b()), c0085a);
            a.c cVar = a.c.f2263a;
            Yg.s sVarA12 = z.a(Integer.valueOf(cVar.b()), cVar);
            a.e eVar = a.e.f2271a;
            Yg.s sVarA13 = z.a(Integer.valueOf(eVar.b()), eVar);
            a.C0082a c0082a = a.C0082a.f2253a;
            return U.k(sVarA, sVarA2, sVarA3, sVarA4, sVarA5, sVarA6, sVarA7, sVarA8, sVarA9, sVarA10, sVarA11, sVarA12, sVarA13, z.a(Integer.valueOf(c0082a.b()), c0082a));
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f2315a = new c();

        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            a.f fVar = a.f.f2275a;
            Yg.s sVarA = z.a(Integer.valueOf(fVar.b()), fVar);
            a.i iVar = a.i.f2289a;
            Yg.s sVarA2 = z.a(Integer.valueOf(iVar.b()), iVar);
            a.d dVar = a.d.f2267a;
            Yg.s sVarA3 = z.a(Integer.valueOf(dVar.b()), dVar);
            a.m mVar = a.m.f2306a;
            Yg.s sVarA4 = z.a(Integer.valueOf(mVar.b()), mVar);
            a.k kVar = a.k.f2297a;
            Yg.s sVarA5 = z.a(Integer.valueOf(kVar.b()), kVar);
            a.g gVar = a.g.f2279a;
            Yg.s sVarA6 = z.a(Integer.valueOf(gVar.b()), gVar);
            a.h.C0093b c0093b = a.h.C0093b.f2286b;
            Yg.s sVarA7 = z.a(Integer.valueOf(c0093b.b()), c0093b);
            a.n nVar = a.n.f2310a;
            Yg.s sVarA8 = z.a(Integer.valueOf(nVar.b()), nVar);
            a.j jVar = a.j.f2293a;
            Yg.s sVarA9 = z.a(Integer.valueOf(jVar.b()), jVar);
            a.l lVar = a.l.f2301a;
            Yg.s sVarA10 = z.a(Integer.valueOf(lVar.b()), lVar);
            a.AbstractC0084b.C0086b c0086b = a.AbstractC0084b.C0086b.f2260b;
            Yg.s sVarA11 = z.a(Integer.valueOf(c0086b.b()), c0086b);
            a.c cVar = a.c.f2263a;
            Yg.s sVarA12 = z.a(Integer.valueOf(cVar.b()), cVar);
            a.e eVar = a.e.f2271a;
            return U.k(sVarA, sVarA2, sVarA3, sVarA4, sVarA5, sVarA6, sVarA7, sVarA8, sVarA9, sVarA10, sVarA11, sVarA12, z.a(Integer.valueOf(eVar.b()), eVar));
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f2316a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list) {
            super(1);
            this.f2316a = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        public final void a(C7916c.a build) {
            C8040d next;
            AbstractC6492s.i(build, "$this$build");
            Iterator it = this.f2316a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = 0;
                    break;
                } else {
                    next = it.next();
                    if (((InterfaceC7921h) next) instanceof C8040d) {
                        break;
                    }
                }
            }
            C8040d c8040d = next instanceof C8040d ? next : null;
            if (c8040d != null) {
                build.b(c8040d.b());
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C7916c.a) obj);
            return J.f24997a;
        }
    }

    private final Map i() {
        return (Map) this.f2251c.getValue();
    }

    private final Map j() {
        return (Map) this.f2252d.getValue();
    }

    private final boolean k(int i10) {
        return i10 == 0;
    }

    private final boolean l(int i10) {
        return i10 == 6 || i10 == 8 || i10 == 9;
    }

    @Override // A7.a
    public int c() {
        return this.f2250b;
    }

    @Override // A7.a
    public int d() {
        return this.f2249a;
    }

    @Override // A7.a
    public C7916c e(List extras) {
        AbstractC6492s.i(extras, "extras");
        return C7916c.f61363c.a(new d(extras));
    }

    @Override // A7.a
    public InterfaceC7921h f(A7.c packetHeader, A7.b fieldHeader, byte[] data) {
        InterfaceC6835l interfaceC6835lA;
        InterfaceC7921h interfaceC7921h;
        InterfaceC6835l interfaceC6835lA2;
        AbstractC6492s.i(packetHeader, "packetHeader");
        AbstractC6492s.i(fieldHeader, "fieldHeader");
        AbstractC6492s.i(data, "data");
        int iB = packetHeader.b();
        if (iB == 1) {
            a aVar = (a) i().get(Integer.valueOf(fieldHeader.b()));
            if (aVar == null || (interfaceC6835lA = aVar.a()) == null || (interfaceC7921h = (InterfaceC7921h) interfaceC6835lA.invoke(data)) == null) {
                throw new UnknownFieldException(fieldHeader.b());
            }
        } else {
            if (iB != 2) {
                throw new InvalidPacketException("Parsing of " + packetHeader.b() + " not implemented");
            }
            a aVar2 = (a) j().get(Integer.valueOf(fieldHeader.b()));
            if (aVar2 == null || (interfaceC6835lA2 = aVar2.a()) == null || (interfaceC7921h = (InterfaceC7921h) interfaceC6835lA2.invoke(data)) == null) {
                throw new UnknownFieldException(fieldHeader.b());
            }
        }
        return interfaceC7921h;
    }

    @Override // A7.a
    public A7.b g(byte[] data, int i10, int i11) {
        AbstractC6492s.i(data, "data");
        return new A7.b(data[i10], C8195b.f63487a.b(AbstractC3682n.r(data, i10 + 1, i10 + 3), EnumC8194a.BIG_ENDIAN));
    }

    @Override // A7.a
    public A7.c h(byte[] data, int i10, int i11) {
        AbstractC6492s.i(data, "data");
        byte b10 = data[i10];
        byte b11 = data[i10 + 1];
        return new A7.c(b10, b10 != 1 ? b10 != 2 ? false : l(b11) : k(b11), C8195b.f63487a.b(AbstractC3682n.r(data, i10 + 2, i10 + 4), EnumC8194a.BIG_ENDIAN));
    }
}
