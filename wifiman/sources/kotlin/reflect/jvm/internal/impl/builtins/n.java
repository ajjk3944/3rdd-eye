package kotlin.reflect.jvm.internal.impl.builtins;

import Bh.AbstractC2514y;
import Bh.G;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.L;
import Bh.l0;
import Zg.AbstractC3689v;
import ii.InterfaceC6164k;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import pi.C7360k0;
import pi.S;
import pi.V;
import pi.r0;
import vi.AbstractC8233a;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final L f51758a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f51759b;

    /* renamed from: c, reason: collision with root package name */
    private final a f51760c;

    /* renamed from: d, reason: collision with root package name */
    private final a f51761d;

    /* renamed from: e, reason: collision with root package name */
    private final a f51762e;

    /* renamed from: f, reason: collision with root package name */
    private final a f51763f;

    /* renamed from: g, reason: collision with root package name */
    private final a f51764g;

    /* renamed from: h, reason: collision with root package name */
    private final a f51765h;

    /* renamed from: i, reason: collision with root package name */
    private final a f51766i;

    /* renamed from: j, reason: collision with root package name */
    private final a f51767j;

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ th.l[] f51757l = {O.h(new F(O.b(n.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.h(new F(O.b(n.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.h(new F(O.b(n.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.h(new F(O.b(n.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.h(new F(O.b(n.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.h(new F(O.b(n.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.h(new F(O.b(n.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.h(new F(O.b(n.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* renamed from: k, reason: collision with root package name */
    public static final b f51756k = new b(null);

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f51768a;

        public a(int i10) {
            this.f51768a = i10;
        }

        public final InterfaceC2495e a(n types, th.l property) {
            AbstractC6492s.i(types, "types");
            AbstractC6492s.i(property, "property");
            return types.c(AbstractC8233a.a(property.getName()), this.f51768a);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final S a(G module) {
            AbstractC6492s.i(module, "module");
            InterfaceC2495e interfaceC2495eB = AbstractC2514y.b(module, o.a.f51889w0);
            if (interfaceC2495eB == null) {
                return null;
            }
            r0 r0VarJ = r0.f58162b.j();
            List parameters = interfaceC2495eB.k().getParameters();
            AbstractC6492s.h(parameters, "getParameters(...)");
            Object objR0 = AbstractC3689v.R0(parameters);
            AbstractC6492s.h(objR0, "single(...)");
            return V.h(r0VarJ, interfaceC2495eB, AbstractC3689v.e(new C7360k0((l0) objR0)));
        }

        private b() {
        }
    }

    public n(G module, L notFoundClasses) {
        AbstractC6492s.i(module, "module");
        AbstractC6492s.i(notFoundClasses, "notFoundClasses");
        this.f51758a = notFoundClasses;
        this.f51759b = Yg.n.a(Yg.q.PUBLICATION, new m(module));
        this.f51760c = new a(1);
        this.f51761d = new a(1);
        this.f51762e = new a(1);
        this.f51763f = new a(2);
        this.f51764g = new a(3);
        this.f51765h = new a(1);
        this.f51766i = new a(2);
        this.f51767j = new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2495e c(String str, int i10) {
        Zh.f fVarH = Zh.f.h(str);
        AbstractC6492s.h(fVarH, "identifier(...)");
        InterfaceC2498h interfaceC2498hG = e().g(fVarH, Ih.d.FROM_REFLECTION);
        InterfaceC2495e interfaceC2495e = interfaceC2498hG instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hG : null;
        return interfaceC2495e == null ? this.f51758a.d(new Zh.b(o.f51800x, fVarH), AbstractC3689v.e(Integer.valueOf(i10))) : interfaceC2495e;
    }

    private final InterfaceC6164k e() {
        return (InterfaceC6164k) this.f51759b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6164k f(G g10) {
        return g10.y(o.f51800x).r();
    }

    public final InterfaceC2495e d() {
        return this.f51760c.a(this, f51757l[0]);
    }
}
