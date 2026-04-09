package P;

import Ii.N;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.O;
import T.o1;
import T.z1;
import Yg.J;
import com.google.ar.core.ImageMetadata;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import mh.InterfaceC6839p;
import s.InterfaceC7834G;
import s.InterfaceC7835H;
import y.InterfaceC8555j;
import y.InterfaceC8556k;
import y.InterfaceC8560o;

/* loaded from: classes.dex */
public abstract class f implements InterfaceC7834G {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17888a;

    /* renamed from: b, reason: collision with root package name */
    private final float f17889b;

    /* renamed from: c, reason: collision with root package name */
    private final z1 f17890c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17891a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f17892b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC8556k f17893c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o f17894d;

        /* renamed from: P.f$a$a, reason: collision with other inner class name */
        static final class C0629a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f17895a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ N f17896b;

            C0629a(o oVar, N n10) {
                this.f17895a = oVar;
                this.f17896b = n10;
            }

            @Override // Li.InterfaceC3221h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(InterfaceC8555j interfaceC8555j, InterfaceC5380e interfaceC5380e) {
                if (interfaceC8555j instanceof InterfaceC8560o.b) {
                    this.f17895a.e((InterfaceC8560o.b) interfaceC8555j, this.f17896b);
                } else if (interfaceC8555j instanceof InterfaceC8560o.c) {
                    this.f17895a.g(((InterfaceC8560o.c) interfaceC8555j).a());
                } else if (interfaceC8555j instanceof InterfaceC8560o.a) {
                    this.f17895a.g(((InterfaceC8560o.a) interfaceC8555j).a());
                } else {
                    this.f17895a.h(interfaceC8555j, this.f17896b);
                }
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC8556k interfaceC8556k, o oVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f17893c = interfaceC8556k;
            this.f17894d = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f17893c, this.f17894d, interfaceC5380e);
            aVar.f17892b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f17891a;
            if (i10 == 0) {
                Yg.v.b(obj);
                N n10 = (N) this.f17892b;
                InterfaceC3220g interfaceC3220gB = this.f17893c.b();
                C0629a c0629a = new C0629a(this.f17894d, n10);
                this.f17891a = 1;
                if (interfaceC3220gB.b(c0629a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public /* synthetic */ f(boolean z10, float f10, z1 z1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, z1Var);
    }

    @Override // s.InterfaceC7834G
    public final InterfaceC7835H b(InterfaceC8556k interfaceC8556k, InterfaceC3540l interfaceC3540l, int i10) {
        long jB;
        interfaceC3540l.U(988743187);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(988743187, i10, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)");
        }
        r rVar = (r) interfaceC3540l.t(s.d());
        if (((C6733v0) this.f17890c.getValue()).u() != 16) {
            interfaceC3540l.U(-303571590);
            interfaceC3540l.J();
            jB = ((C6733v0) this.f17890c.getValue()).u();
        } else {
            interfaceC3540l.U(-303521246);
            jB = rVar.b(interfaceC3540l, 0);
            interfaceC3540l.J();
        }
        z1 z1VarN = o1.n(C6733v0.g(jB), interfaceC3540l, 0);
        z1 z1VarN2 = o1.n(rVar.a(interfaceC3540l, 0), interfaceC3540l, 0);
        int i11 = i10 & 14;
        o oVarC = c(interfaceC8556k, this.f17888a, this.f17889b, z1VarN, z1VarN2, interfaceC3540l, i11 | ((i10 << 12) & ImageMetadata.JPEG_GPS_COORDINATES));
        boolean zL = interfaceC3540l.l(oVarC) | (((i11 ^ 6) > 4 && interfaceC3540l.T(interfaceC8556k)) || (i10 & 6) == 4);
        Object objF = interfaceC3540l.f();
        if (zL || objF == InterfaceC3540l.f21100a.a()) {
            objF = new a(interfaceC8556k, oVarC, null);
            interfaceC3540l.K(objF);
        }
        O.e(oVarC, interfaceC8556k, (InterfaceC6839p) objF, interfaceC3540l, (i10 << 3) & 112);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return oVarC;
    }

    public abstract o c(InterfaceC8556k interfaceC8556k, boolean z10, float f10, z1 z1Var, z1 z1Var2, InterfaceC3540l interfaceC3540l, int i10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f17888a == fVar.f17888a && Y0.h.n(this.f17889b, fVar.f17889b) && AbstractC6492s.d(this.f17890c, fVar.f17890c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f17888a) * 31) + Y0.h.p(this.f17889b)) * 31) + this.f17890c.hashCode();
    }

    private f(boolean z10, float f10, z1 z1Var) {
        this.f17888a = z10;
        this.f17889b = f10;
        this.f17890c = z1Var;
    }
}
