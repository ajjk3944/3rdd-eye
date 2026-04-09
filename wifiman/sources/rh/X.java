package Rh;

import Rh.f0;
import gi.EnumC5923e;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    private static final C3480h f19881a = new C3480h(EnumC3483k.NULLABLE, null, false, false, 8, null);

    /* renamed from: b, reason: collision with root package name */
    private static final C3480h f19882b;

    /* renamed from: c, reason: collision with root package name */
    private static final C3480h f19883c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f19884d;

    static {
        EnumC3483k enumC3483k = EnumC3483k.NOT_NULL;
        f19882b = new C3480h(enumC3483k, null, false, false, 8, null);
        f19883c = new C3480h(enumC3483k, null, true, false, 8, null);
        Sh.F f10 = Sh.F.f20704a;
        String strH = f10.h("Object");
        String strG = f10.g("Predicate");
        String strG2 = f10.g("Function");
        String strG3 = f10.g("Consumer");
        String strG4 = f10.g("BiFunction");
        String strG5 = f10.g("BiConsumer");
        String strG6 = f10.g("UnaryOperator");
        String strI = f10.i("stream/Stream");
        String strI2 = f10.i("Optional");
        f0 f0Var = new f0();
        f0.a.b(new f0.a(f0Var, f10.i("Iterator")), "forEachRemaining", null, new C3485m(strG3), 2, null);
        f0.a.b(new f0.a(f0Var, f10.h("Iterable")), "spliterator", null, new C3495x(f10), 2, null);
        f0.a aVar = new f0.a(f0Var, f10.i("Collection"));
        f0.a.b(aVar, "removeIf", null, new I(strG), 2, null);
        f0.a.b(aVar, "stream", null, new P(strI), 2, null);
        f0.a.b(aVar, "parallelStream", null, new Q(strI), 2, null);
        f0.a aVar2 = new f0.a(f0Var, f10.i("List"));
        f0.a.b(aVar2, "replaceAll", null, new S(strG6), 2, null);
        aVar2.a("addFirst", "2.1", new T(strH));
        aVar2.a("addLast", "2.1", new U(strH));
        aVar2.a("removeFirst", "2.1", new V(strH));
        aVar2.a("removeLast", "2.1", new W(strH));
        f0.a aVar3 = new f0.a(f0Var, f10.i("LinkedList"));
        aVar3.a("addFirst", "2.1", new C3486n(strH));
        aVar3.a("addLast", "2.1", new C3487o(strH));
        aVar3.a("removeFirst", "2.1", new C3488p(strH));
        aVar3.a("removeLast", "2.1", new C3489q(strH));
        f0.a aVar4 = new f0.a(f0Var, f10.i("Map"));
        f0.a.b(aVar4, "forEach", null, new r(strG5), 2, null);
        f0.a.b(aVar4, "putIfAbsent", null, new C3490s(strH), 2, null);
        f0.a.b(aVar4, "replace", null, new C3491t(strH), 2, null);
        f0.a.b(aVar4, "replace", null, new C3492u(strH), 2, null);
        f0.a.b(aVar4, "replaceAll", null, new C3493v(strG4), 2, null);
        f0.a.b(aVar4, "compute", null, new C3494w(strH, strG4), 2, null);
        f0.a.b(aVar4, "computeIfAbsent", null, new C3496y(strH, strG2), 2, null);
        f0.a.b(aVar4, "computeIfPresent", null, new C3497z(strH, strG4), 2, null);
        f0.a.b(aVar4, "merge", null, new A(strH, strG4), 2, null);
        f0.a aVar5 = new f0.a(f0Var, strI2);
        f0.a.b(aVar5, "empty", null, new B(strI2), 2, null);
        f0.a.b(aVar5, "of", null, new C(strH, strI2), 2, null);
        f0.a.b(aVar5, "ofNullable", null, new D(strH, strI2), 2, null);
        f0.a.b(aVar5, "get", null, new E(strH), 2, null);
        f0.a.b(aVar5, "ifPresent", null, new F(strG3), 2, null);
        f0.a.b(new f0.a(f0Var, f10.h("ref/Reference")), "get", null, new G(strH), 2, null);
        f0.a.b(new f0.a(f0Var, strG), "test", null, new H(strH), 2, null);
        f0.a.b(new f0.a(f0Var, f10.g("BiPredicate")), "test", null, new J(strH), 2, null);
        f0.a.b(new f0.a(f0Var, strG3), "accept", null, new K(strH), 2, null);
        f0.a.b(new f0.a(f0Var, strG5), "accept", null, new L(strH), 2, null);
        f0.a.b(new f0.a(f0Var, strG2), "apply", null, new M(strH), 2, null);
        f0.a.b(new f0.a(f0Var, strG4), "apply", null, new N(strH), 2, null);
        f0.a.b(new f0.a(f0Var, f10.g("Supplier")), "get", null, new O(strH), 2, null);
        f19884d = f0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J A(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.b(str, f19882b);
        function.c(EnumC5923e.BOOLEAN);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J B(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h);
        function.b(str, c3480h);
        function.c(EnumC5923e.BOOLEAN);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J C(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.b(str, f19882b);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J D(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h);
        function.b(str, c3480h);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J E(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h);
        function.d(str, c3480h);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J F(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h);
        function.b(str, c3480h);
        function.d(str, c3480h);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J G(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.d(str, f19882b);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J H(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h, c3480h);
        function.c(EnumC5923e.BOOLEAN);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J I(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.d(str, c3480h, c3480h);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J J(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.d(str, c3480h, c3480h);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J a(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h, c3480h);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J b(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.b(str, f19882b);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.d(str, f19882b);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.d(str, f19882b);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h, c3480h);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.b(str, f19882b);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.b(str, f19882b);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J h(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.b(str, f19882b);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.d(str, f19882b);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J j(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.d(str, f19882b);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J k(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h, c3480h, c3480h);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J l(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h);
        function.b(str, c3480h);
        function.d(str, f19881a);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J m(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h);
        function.b(str, c3480h);
        function.d(str, f19881a);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J n(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h);
        function.b(str, c3480h);
        function.b(str, c3480h);
        function.c(EnumC5923e.BOOLEAN);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J o(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h, c3480h, c3480h, c3480h);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J p(String str, String str2, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h);
        C3480h c3480h2 = f19881a;
        function.b(str2, c3480h, c3480h, c3480h2, c3480h2);
        function.d(str, c3480h2);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J q(String str, String str2, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h);
        function.b(str2, c3480h, c3480h, c3480h);
        function.d(str, c3480h);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J r(String str, String str2, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h);
        C3480h c3480h2 = f19883c;
        C3480h c3480h3 = f19881a;
        function.b(str2, c3480h, c3480h, c3480h2, c3480h3);
        function.d(str, c3480h3);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J s(String str, String str2, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19882b;
        function.b(str, c3480h);
        C3480h c3480h2 = f19883c;
        function.b(str, c3480h2);
        C3480h c3480h3 = f19881a;
        function.b(str2, c3480h, c3480h2, c3480h2, c3480h3);
        function.d(str, c3480h3);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J t(Sh.F f10, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        String strI = f10.i("Spliterator");
        C3480h c3480h = f19882b;
        function.d(strI, c3480h, c3480h);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J u(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.d(str, f19882b, f19883c);
        return Yg.J.f24997a;
    }

    public static final Map u0() {
        return f19884d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J v(String str, String str2, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        C3480h c3480h = f19883c;
        function.b(str, c3480h);
        function.d(str2, f19882b, c3480h);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J w(String str, String str2, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.b(str, f19881a);
        function.d(str2, f19882b, f19883c);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J x(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.d(str, f19883c);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J y(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.b(str, f19882b, f19883c);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J z(String str, f0.a.C0723a function) {
        AbstractC6492s.i(function, "$this$function");
        function.d(str, f19881a);
        return Yg.J.f24997a;
    }
}
