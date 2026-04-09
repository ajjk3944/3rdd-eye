package li;

import Bh.g0;
import Uh.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: li.N, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6611N {

    /* renamed from: a, reason: collision with root package name */
    private final Wh.c f52652a;

    /* renamed from: b, reason: collision with root package name */
    private final Wh.g f52653b;

    /* renamed from: c, reason: collision with root package name */
    private final g0 f52654c;

    /* renamed from: li.N$a */
    public static final class a extends AbstractC6611N {

        /* renamed from: d, reason: collision with root package name */
        private final Uh.c f52655d;

        /* renamed from: e, reason: collision with root package name */
        private final a f52656e;

        /* renamed from: f, reason: collision with root package name */
        private final Zh.b f52657f;

        /* renamed from: g, reason: collision with root package name */
        private final c.EnumC0834c f52658g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f52659h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f52660i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uh.c classProto, Wh.c nameResolver, Wh.g typeTable, g0 g0Var, a aVar) {
            super(nameResolver, typeTable, g0Var, null);
            AbstractC6492s.i(classProto, "classProto");
            AbstractC6492s.i(nameResolver, "nameResolver");
            AbstractC6492s.i(typeTable, "typeTable");
            this.f52655d = classProto;
            this.f52656e = aVar;
            this.f52657f = AbstractC6609L.a(nameResolver, classProto.O1());
            c.EnumC0834c enumC0834c = (c.EnumC0834c) Wh.b.f23942f.d(classProto.N1());
            this.f52658g = enumC0834c == null ? c.EnumC0834c.CLASS : enumC0834c;
            Boolean boolD = Wh.b.f23943g.d(classProto.N1());
            AbstractC6492s.h(boolD, "get(...)");
            this.f52659h = boolD.booleanValue();
            Boolean boolD2 = Wh.b.f23944h.d(classProto.N1());
            AbstractC6492s.h(boolD2, "get(...)");
            this.f52660i = boolD2.booleanValue();
        }

        @Override // li.AbstractC6611N
        public Zh.c a() {
            return this.f52657f.a();
        }

        public final Zh.b e() {
            return this.f52657f;
        }

        public final Uh.c f() {
            return this.f52655d;
        }

        public final c.EnumC0834c g() {
            return this.f52658g;
        }

        public final a h() {
            return this.f52656e;
        }

        public final boolean i() {
            return this.f52659h;
        }
    }

    /* renamed from: li.N$b */
    public static final class b extends AbstractC6611N {

        /* renamed from: d, reason: collision with root package name */
        private final Zh.c f52661d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Zh.c fqName, Wh.c nameResolver, Wh.g typeTable, g0 g0Var) {
            super(nameResolver, typeTable, g0Var, null);
            AbstractC6492s.i(fqName, "fqName");
            AbstractC6492s.i(nameResolver, "nameResolver");
            AbstractC6492s.i(typeTable, "typeTable");
            this.f52661d = fqName;
        }

        @Override // li.AbstractC6611N
        public Zh.c a() {
            return this.f52661d;
        }
    }

    public /* synthetic */ AbstractC6611N(Wh.c cVar, Wh.g gVar, g0 g0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, gVar, g0Var);
    }

    public abstract Zh.c a();

    public final Wh.c b() {
        return this.f52652a;
    }

    public final g0 c() {
        return this.f52654c;
    }

    public final Wh.g d() {
        return this.f52653b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }

    private AbstractC6611N(Wh.c cVar, Wh.g gVar, g0 g0Var) {
        this.f52652a = cVar;
        this.f52653b = gVar;
        this.f52654c = g0Var;
    }
}
