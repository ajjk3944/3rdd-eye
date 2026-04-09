package kotlin.reflect.jvm.internal.impl.renderer;

import Bh.EnumC2496f;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2499i;
import Bh.InterfaceC2503m;
import Bh.k0;
import Bh.s0;
import Yg.J;
import Zg.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.renderer.InterfaceC6500b;
import mh.InterfaceC6835l;
import pi.B0;
import pi.S;

/* loaded from: classes4.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f52061a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f52062b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f52063c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f52064d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f52065e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f52066f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f52067g;

    /* renamed from: h, reason: collision with root package name */
    public static final n f52068h;

    /* renamed from: i, reason: collision with root package name */
    public static final n f52069i;

    /* renamed from: j, reason: collision with root package name */
    public static final n f52070j;

    /* renamed from: k, reason: collision with root package name */
    public static final n f52071k;

    /* renamed from: l, reason: collision with root package name */
    public static final n f52072l;

    public static final class a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.n$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1926a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f52073a;

            static {
                int[] iArr = new int[EnumC2496f.values().length];
                try {
                    iArr[EnumC2496f.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC2496f.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC2496f.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC2496f.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC2496f.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC2496f.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f52073a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InterfaceC2499i classifier) {
            AbstractC6492s.i(classifier, "classifier");
            if (classifier instanceof k0) {
                return "typealias";
            }
            if (!(classifier instanceof InterfaceC2495e)) {
                throw new AssertionError("Unexpected classifier: " + classifier);
            }
            InterfaceC2495e interfaceC2495e = (InterfaceC2495e) classifier;
            if (interfaceC2495e.z()) {
                return "companion object";
            }
            switch (C1926a.f52073a[interfaceC2495e.h().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final n b(InterfaceC6835l changeOptions) {
            AbstractC6492s.i(changeOptions, "changeOptions");
            z zVar = new z();
            changeOptions.invoke(zVar);
            zVar.q0();
            return new u(zVar);
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f52074a = new a();

            private a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.n.b
            public void a(s0 parameter, int i10, int i11, StringBuilder builder) {
                AbstractC6492s.i(parameter, "parameter");
                AbstractC6492s.i(builder, "builder");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.n.b
            public void b(s0 parameter, int i10, int i11, StringBuilder builder) {
                AbstractC6492s.i(parameter, "parameter");
                AbstractC6492s.i(builder, "builder");
                if (i10 != i11 - 1) {
                    builder.append(", ");
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.n.b
            public void c(int i10, StringBuilder builder) {
                AbstractC6492s.i(builder, "builder");
                builder.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.n.b
            public void d(int i10, StringBuilder builder) {
                AbstractC6492s.i(builder, "builder");
                builder.append(")");
            }
        }

        void a(s0 s0Var, int i10, int i11, StringBuilder sb2);

        void b(s0 s0Var, int i10, int i11, StringBuilder sb2);

        void c(int i10, StringBuilder sb2);

        void d(int i10, StringBuilder sb2);
    }

    static {
        a aVar = new a(null);
        f52061a = aVar;
        f52062b = aVar.b(C6501c.f52050a);
        f52063c = aVar.b(C6503e.f52052a);
        f52064d = aVar.b(C6504f.f52053a);
        f52065e = aVar.b(C6505g.f52054a);
        f52066f = aVar.b(h.f52055a);
        f52067g = aVar.b(i.f52056a);
        f52068h = aVar.b(j.f52057a);
        f52069i = aVar.b(k.f52058a);
        f52070j = aVar.b(l.f52059a);
        f52071k = aVar.b(m.f52060a);
        f52072l = aVar.b(C6502d.f52051a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J A(w withOptions) {
        AbstractC6492s.i(withOptions, "$this$withOptions");
        withOptions.f(false);
        withOptions.d(d0.e());
        withOptions.h(InterfaceC6500b.C1925b.f52048a);
        withOptions.r(true);
        withOptions.e(D.NONE);
        withOptions.l(true);
        withOptions.k(true);
        withOptions.i(true);
        withOptions.c(true);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J B(w withOptions) {
        AbstractC6492s.i(withOptions, "$this$withOptions");
        withOptions.h(InterfaceC6500b.C1925b.f52048a);
        withOptions.e(D.ONLY_NON_SYNTHESIZED);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J C(w withOptions) {
        AbstractC6492s.i(withOptions, "$this$withOptions");
        withOptions.d(d0.e());
        return J.f24997a;
    }

    public static /* synthetic */ String Q(n nVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        return nVar.P(cVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J s(w withOptions) {
        AbstractC6492s.i(withOptions, "$this$withOptions");
        withOptions.f(false);
        withOptions.d(d0.e());
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J t(w withOptions) {
        AbstractC6492s.i(withOptions, "$this$withOptions");
        withOptions.f(false);
        withOptions.d(d0.e());
        withOptions.i(true);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J u(w withOptions) {
        AbstractC6492s.i(withOptions, "$this$withOptions");
        withOptions.f(false);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J v(w withOptions) {
        AbstractC6492s.i(withOptions, "$this$withOptions");
        withOptions.d(d0.e());
        withOptions.h(InterfaceC6500b.C1925b.f52048a);
        withOptions.e(D.ONLY_NON_SYNTHESIZED);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J w(w withOptions) {
        AbstractC6492s.i(withOptions, "$this$withOptions");
        withOptions.j(true);
        withOptions.h(InterfaceC6500b.a.f52047a);
        withOptions.d(v.ALL);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J x(w withOptions) {
        AbstractC6492s.i(withOptions, "$this$withOptions");
        withOptions.d(v.ALL_EXCEPT_ANNOTATIONS);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J y(w withOptions) {
        AbstractC6492s.i(withOptions, "$this$withOptions");
        withOptions.d(v.ALL);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J z(w withOptions) {
        AbstractC6492s.i(withOptions, "$this$withOptions");
        withOptions.m(F.HTML);
        withOptions.d(v.ALL);
        return J.f24997a;
    }

    public abstract String O(InterfaceC2503m interfaceC2503m);

    public abstract String P(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar);

    public abstract String R(String str, String str2, kotlin.reflect.jvm.internal.impl.builtins.i iVar);

    public abstract String S(Zh.d dVar);

    public abstract String T(Zh.f fVar, boolean z10);

    public abstract String U(S s10);

    public abstract String V(B0 b02);

    public final n W(InterfaceC6835l changeOptions) {
        AbstractC6492s.i(changeOptions, "changeOptions");
        AbstractC6492s.g(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        z zVarU = ((u) this).K0().u();
        changeOptions.invoke(zVarU);
        zVarU.q0();
        return new u(zVarU);
    }
}
