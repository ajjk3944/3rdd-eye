package jj;

import A.B;
import A.C;
import Ii.N;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import T.A;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.O;
import Y0.t;
import Yg.J;
import Yg.v;
import androidx.compose.ui.platform.AbstractC3932k0;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class h {

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f50942a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f50943b;

        /* renamed from: jj.h$a$a, reason: collision with other inner class name */
        static final class C1886a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f50944a;

            C1886a(g gVar) {
                this.f50944a = gVar;
            }

            @Override // Li.InterfaceC3221h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(List list, InterfaceC5380e interfaceC5380e) {
                this.f50944a.J(0, 0);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f50943b = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f50943b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f50942a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC3220g interfaceC3220gQ = this.f50943b.Q();
                C1886a c1886a = new C1886a(this.f50943b);
                this.f50942a = 1;
                if (interfaceC3220gQ.b(c1886a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        float f50945a;

        /* renamed from: b, reason: collision with root package name */
        int f50946b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B f50947c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f50948d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f50949e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B b10, boolean z10, g gVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f50947c = b10;
            this.f50948d = z10;
            this.f50949e = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f50947c, this.f50948d, this.f50949e, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:7:0x0013). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r7.f50946b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                float r1 = r7.f50945a
                Yg.v.b(r8)
            L13:
                r8 = r1
                goto L4d
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                float r1 = r7.f50945a
                Yg.v.b(r8)
                goto L61
            L23:
                Yg.v.b(r8)
                A.B r8 = r7.f50947c
                A.q r8 = r8.w()
                boolean r8 = r8.a()
                r1 = r8 ^ 1
                boolean r4 = r7.f50948d
                if (r4 == 0) goto L45
                A.B r4 = r7.f50947c
                A.q r4 = r4.w()
                w.q r4 = r4.e()
                w.q r5 = w.q.Vertical
                if (r4 == r5) goto L45
                goto L46
            L45:
                r8 = r1
            L46:
                if (r8 == 0) goto L4b
                r8 = 1065353216(0x3f800000, float:1.0)
                goto L4d
            L4b:
                r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            L4d:
                jj.g r1 = r7.f50949e
                Ki.g r1 = r1.B()
                r7.f50945a = r8
                r7.f50946b = r3
                java.lang.Object r1 = r1.c(r7)
                if (r1 != r0) goto L5e
                return r0
            L5e:
                r6 = r1
                r1 = r8
                r8 = r6
            L61:
                java.lang.Number r8 = (java.lang.Number) r8
                float r8 = r8.floatValue()
                A.B r4 = r7.f50947c
                float r8 = r8 * r1
                r7.f50945a = r1
                r7.f50946b = r2
                java.lang.Object r8 = w.u.b(r4, r8, r7)
                if (r8 != r0) goto L13
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: jj.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final g a(InterfaceC6839p onMove, B b10, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, float f10, InterfaceC6350b interfaceC6350b, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        AbstractC6492s.i(onMove, "onMove");
        interfaceC3540l.e(-818037716);
        B bC = (i11 & 2) != 0 ? C.c(0, 0, interfaceC3540l, 0, 3) : b10;
        InterfaceC6839p interfaceC6839p3 = (i11 & 4) != 0 ? null : interfaceC6839p;
        InterfaceC6839p interfaceC6839p4 = (i11 & 8) != 0 ? null : interfaceC6839p2;
        float fJ = (i11 & 16) != 0 ? Y0.h.j(20) : f10;
        InterfaceC6350b jVar = (i11 & 32) != 0 ? new j(0.0f, 1, null) : interfaceC6350b;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-818037716, i10, -1, "org.burnoutcrew.reorderable.rememberReorderableLazyListState (ReorderableLazyListState.kt:36)");
        }
        float fD1 = ((Y0.d) interfaceC3540l.t(AbstractC3932k0.g())).d1(fJ);
        interfaceC3540l.e(773894976);
        interfaceC3540l.e(-492369756);
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            Object a10 = new A(O.i(C5385j.f46088a, interfaceC3540l));
            interfaceC3540l.K(a10);
            objF = a10;
        }
        interfaceC3540l.P();
        N nA = ((A) objF).a();
        interfaceC3540l.P();
        interfaceC3540l.e(1157296644);
        boolean zT = interfaceC3540l.T(bC);
        Object objF2 = interfaceC3540l.f();
        if (zT || objF2 == aVar.a()) {
            Object gVar = new g(bC, nA, fD1, onMove, interfaceC6839p3, interfaceC6839p4, jVar);
            interfaceC3540l.K(gVar);
            objF2 = gVar;
        }
        interfaceC3540l.P();
        g gVar2 = (g) objF2;
        boolean z10 = interfaceC3540l.t(AbstractC3932k0.m()) == t.Rtl;
        interfaceC3540l.e(1157296644);
        boolean zT2 = interfaceC3540l.T(gVar2);
        Object objF3 = interfaceC3540l.f();
        if (zT2 || objF3 == aVar.a()) {
            objF3 = new a(gVar2, null);
            interfaceC3540l.K(objF3);
        }
        interfaceC3540l.P();
        O.f(gVar2, (InterfaceC6839p) objF3, interfaceC3540l, 64);
        Object objValueOf = Boolean.valueOf(z10);
        interfaceC3540l.e(1618982084);
        boolean zT3 = interfaceC3540l.T(objValueOf) | interfaceC3540l.T(bC) | interfaceC3540l.T(gVar2);
        Object objF4 = interfaceC3540l.f();
        if (zT3 || objF4 == aVar.a()) {
            objF4 = new b(bC, z10, gVar2, null);
            interfaceC3540l.K(objF4);
        }
        interfaceC3540l.P();
        O.f(gVar2, (InterfaceC6839p) objF4, interfaceC3540l, 64);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return gVar2;
    }
}
