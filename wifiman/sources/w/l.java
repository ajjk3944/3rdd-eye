package w;

import Ii.N;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.o1;
import T.z1;
import Yg.J;
import androidx.compose.foundation.gestures.DraggableElement;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6835l;
import y.InterfaceC8558m;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final mh.q f63982a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final mh.q f63983b = new b(null);

    static final class a extends kotlin.coroutines.jvm.internal.l implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        int f63984a;

        a(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f63984a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            return J.f24997a;
        }

        public final Object n(N n10, long j10, InterfaceC5380e interfaceC5380e) {
            return new a(interfaceC5380e).invokeSuspend(J.f24997a);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return n((N) obj, ((C6531g) obj2).v(), (InterfaceC5380e) obj3);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        int f63985a;

        b(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f63985a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            return J.f24997a;
        }

        public final Object n(N n10, float f10, InterfaceC5380e interfaceC5380e) {
            return new b(interfaceC5380e).invokeSuspend(J.f24997a);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return n((N) obj, ((Number) obj2).floatValue(), (InterfaceC5380e) obj3);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f63986a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z1 z1Var) {
            super(1);
            this.f63986a = z1Var;
        }

        public final void a(float f10) {
            ((InterfaceC6835l) this.f63986a.getValue()).invoke(Float.valueOf(f10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return J.f24997a;
        }
    }

    public static final m a(InterfaceC6835l interfaceC6835l) {
        return new C8246g(interfaceC6835l);
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, m mVar, q qVar, boolean z10, InterfaceC8558m interfaceC8558m, boolean z11, mh.q qVar2, mh.q qVar3, boolean z12) {
        return eVar.b0(new DraggableElement(mVar, qVar, z10, interfaceC8558m, z11, qVar2, qVar3, z12));
    }

    public static final m i(InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-183245213, i10, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:135)");
        }
        z1 z1VarN = o1.n(interfaceC6835l, interfaceC3540l, i10 & 14);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = a(new c(z1VarN));
            interfaceC3540l.K(objF);
        }
        m mVar = (m) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(long j10, q qVar) {
        return qVar == q.Vertical ? C6531g.n(j10) : C6531g.m(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(long j10, q qVar) {
        return qVar == q.Vertical ? Y0.y.i(j10) : Y0.y.h(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        return Y0.z.a(Float.isNaN(Y0.y.h(j10)) ? 0.0f : Y0.y.h(j10), Float.isNaN(Y0.y.i(j10)) ? 0.0f : Y0.y.i(j10));
    }
}
