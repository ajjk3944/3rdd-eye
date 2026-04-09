package T;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: T.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3561w {

    /* renamed from: T.w$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I0[] f21266a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f21267b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21268c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(I0[] i0Arr, InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f21266a = i0Arr;
            this.f21267b = interfaceC6839p;
            this.f21268c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            I0[] i0Arr = this.f21266a;
            AbstractC3561w.b((I0[]) Arrays.copyOf(i0Arr, i0Arr.length), this.f21267b, interfaceC3540l, L0.a(this.f21268c | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: T.w$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I0 f21269a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f21270b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21271c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(I0 i02, InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f21269a = i02;
            this.f21270b = interfaceC6839p;
            this.f21271c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3561w.a(this.f21269a, this.f21270b, interfaceC3540l, L0.a(this.f21271c | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void a(I0 i02, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1350970552);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1350970552, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:398)");
        }
        interfaceC3540lR.W(i02);
        interfaceC6839p.invoke(interfaceC3540lR, Integer.valueOf((i10 >> 3) & 14));
        interfaceC3540lR.O();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new b(i02, interfaceC6839p, i10));
        }
    }

    public static final void b(I0[] i0Arr, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1390796515);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1390796515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)");
        }
        interfaceC3540lR.B(i0Arr);
        interfaceC6839p.invoke(interfaceC3540lR, Integer.valueOf((i10 >> 3) & 14));
        interfaceC3540lR.F();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new a(i0Arr, interfaceC6839p, i10));
        }
    }

    public static final H0 c(n1 n1Var, InterfaceC6824a interfaceC6824a) {
        return new M(n1Var, interfaceC6824a);
    }

    public static /* synthetic */ H0 d(n1 n1Var, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n1Var = o1.p();
        }
        return c(n1Var, interfaceC6824a);
    }

    public static final H0 e(InterfaceC6835l interfaceC6835l) {
        return new C(interfaceC6835l);
    }

    public static final H0 f(InterfaceC6824a interfaceC6824a) {
        return new A1(interfaceC6824a);
    }
}
