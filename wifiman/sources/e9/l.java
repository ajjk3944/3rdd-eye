package E9;

import E9.l;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import Yg.J;
import Yg.v;
import Zg.AbstractC3689v;
import Zg.Q;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6713l0;
import m0.C6733v0;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.C7043j;
import o0.C7044k;
import o0.InterfaceC7037d;
import o0.InterfaceC7039f;
import qh.AbstractC7510c;
import r.AbstractC7535j;
import r.C7517a;
import r.EnumC7520b0;
import r.G;
import r.N;
import r.T;
import r.r0;
import sh.C7974i;

/* loaded from: classes3.dex */
public abstract class l {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f4407a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7517a f4408b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7517a c7517a, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f4408b = c7517a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J t(T.b bVar) {
            bVar.d(3000);
            return J.f24997a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f4408b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f4407a;
            if (i10 == 0) {
                v.b(obj);
                C7517a c7517a = this.f4408b;
                Float fC = kotlin.coroutines.jvm.internal.b.c(1.0f);
                N nE = AbstractC7535j.e(AbstractC7535j.f(new InterfaceC6835l() { // from class: E9.k
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj2) {
                        return l.a.t((T.b) obj2);
                    }
                }), EnumC7520b0.Restart, 0L, 4, null);
                this.f4407a = 1;
                if (C7517a.f(c7517a, fC, nE, null, null, this, 12, null) == objG) {
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
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f4409a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7517a f4410b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C7517a c7517a, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f4410b = c7517a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f4410b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f4409a;
            if (i10 == 0) {
                v.b(obj);
                C7517a c7517a = this.f4410b;
                Float fC = kotlin.coroutines.jvm.internal.b.c(1.0f);
                r0 r0VarL = AbstractC7535j.l(300, 0, G.d(), 2, null);
                this.f4409a = 1;
                if (C7517a.f(c7517a, fC, r0VarL, null, null, this, 12, null) == objG) {
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
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.ui.e r29, E9.f r30, T.InterfaceC3540l r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E9.l.e(androidx.compose.ui.e, E9.f, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(long j10, C7517a c7517a, InterfaceC3551q0 interfaceC3551q0, long j11, InterfaceC7039f Canvas) throws Throwable {
        long j12;
        InterfaceC7037d interfaceC7037d;
        long j13;
        AbstractC6492s.i(Canvas, "$this$Canvas");
        float fH = (C6537m.h(Canvas.c()) / 2.0f) / 5.0f;
        float fH2 = (C6537m.h(Canvas.c()) / 2.0f) - fH;
        InterfaceC7039f.P1(Canvas, j10, Canvas.d1(Y0.h.j(5.0f)), 0L, 0.0f, C7043j.f55038a, null, 0, 108, null);
        InterfaceC7039f.P1(Canvas, j10, Canvas.d1(Y0.h.j(7.5f)), 0L, 0.0f, new C7044k(Canvas.d1(Y0.h.j(1.0f)), 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        Iterator it = new C7974i(1, 4).iterator();
        while (it.hasNext()) {
            InterfaceC7039f.P1(Canvas, j10, ((Q) it).d() * fH, 0L, 0.0f, new C7044k(Canvas.d1(Y0.h.j(1.0f)), 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        }
        float fFloatValue = ((Number) c7517a.m()).floatValue() * 360.0f;
        long jA = AbstractC6532h.a(C6531g.m(Canvas.D1()), C6531g.n(Canvas.D1()));
        InterfaceC7037d interfaceC7037dK1 = Canvas.k1();
        long jC = interfaceC7037dK1.c();
        interfaceC7037dK1.d().j();
        try {
            interfaceC7037dK1.e().i(fFloatValue, jA);
            long jA2 = AbstractC6532h.a(C6531g.m(Canvas.D1()) - fH2, C6531g.n(Canvas.D1()) - fH2);
            float f10 = fH2 * 2;
            try {
                InterfaceC7039f.B0(Canvas, AbstractC6713l0.a.i(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(C6733v0.k(j11, 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), C6733v0.g(C6733v0.k(j11, 0.01f, 0.0f, 0.0f, 0.0f, 14, null))), -fH, C6531g.n(Canvas.D1()), 0, 8, null), 180.0f, 90.0f, true, jA2, AbstractC6538n.a(f10, f10), 0.0f, null, null, 0, 960, null);
                InterfaceC7039f.w1(Canvas, j10, AbstractC6532h.a(C6531g.m(Canvas.D1()), fH), Canvas.D1(), Canvas.d1(Y0.h.j(1.0f)), 0, null, 0.0f, null, 0, 496, null);
                interfaceC7037dK1.d().r();
                interfaceC7037dK1.f(jC);
                for (E9.a aVar : (Iterable) interfaceC3551q0.getValue()) {
                    float fC = aVar.c() * 360.0f;
                    long jD1 = Canvas.D1();
                    InterfaceC7037d interfaceC7037dK12 = Canvas.k1();
                    long jC2 = interfaceC7037dK12.c();
                    interfaceC7037dK12.d().j();
                    try {
                        interfaceC7037dK12.e().i(fC, jD1);
                        long jG = C6531g.g(Canvas.D1(), 0.0f, (((C6531g.n(Canvas.D1()) - fH) - fH) * aVar.b()) + fH, 1, null);
                        float fD1 = Canvas.d1(Y0.h.j(3.5f));
                        C7517a c7517aA = aVar.a();
                        try {
                            InterfaceC7039f.P1(Canvas, j10, fD1, jG, c7517aA != null ? ((Number) c7517aA.m()).floatValue() : 0.0f, C7043j.f55038a, null, 0, 96, null);
                            interfaceC7037dK12.d().r();
                            interfaceC7037dK12.f(jC2);
                        } catch (Throwable th2) {
                            th = th2;
                            j13 = jC2;
                            interfaceC7037dK12.d().r();
                            interfaceC7037dK12.f(j13);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        j13 = jC2;
                    }
                }
                return J.f24997a;
            } catch (Throwable th4) {
                th = th4;
                interfaceC7037d = interfaceC7037dK1;
                j12 = jC;
                interfaceC7037d.d().r();
                interfaceC7037d.f(j12);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            j12 = jC;
            interfaceC7037d = interfaceC7037dK1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(androidx.compose.ui.e eVar, f fVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, fVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(InterfaceC3551q0 interfaceC3551q0, C7517a c7517a, Float f10, Float f11) {
        interfaceC3551q0.setValue(AbstractC3689v.N0((Collection) interfaceC3551q0.getValue(), new E9.a(f10 != null ? f10.floatValue() : ((Number) c7517a.m()).floatValue(), f11 != null ? f11.floatValue() : AbstractC7510c.f59421a.c(), null, 4, null)));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(InterfaceC3551q0 interfaceC3551q0) {
        interfaceC3551q0.setValue(AbstractC3689v.l());
        return J.f24997a;
    }

    public static final f j(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-193178241);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-193178241, i10, -1, "com.ui.core.ui.component.progress.rememberUiRadarDiscoveryController (UiRadarDiscovery.kt:55)");
        }
        interfaceC3540l.U(1587987433);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = new f();
            interfaceC3540l.K(objF);
        }
        f fVar = (f) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return fVar;
    }
}
