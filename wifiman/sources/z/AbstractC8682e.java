package z;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8682e {

    /* renamed from: z.e$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0.C f66861a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.q f66862b;

        /* renamed from: z.e$a$a, reason: collision with other inner class name */
        static final class C2376a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ mh.q f66863a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C8684g f66864b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2376a(mh.q qVar, C8684g c8684g) {
                super(2);
                this.f66863a = qVar;
                this.f66864b = c8684g;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1945019079, i10, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                this.f66863a.s(this.f66864b, interfaceC3540l, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C0.C c10, mh.q qVar) {
            super(2);
            this.f66861a = c10;
            this.f66862b = qVar;
        }

        public final C0.D a(C0.U u10, long j10) {
            return this.f66861a.b(u10, u10.Q1(Yg.J.f24997a, b0.c.c(-1945019079, true, new C2376a(this.f66862b, new C8684g(u10, j10, null)))), j10);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C0.U) obj, ((Y0.b) obj2).r());
        }
    }

    /* renamed from: z.e$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f66865a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0.c f66866b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f66867c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mh.q f66868d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f66869e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f66870f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, f0.c cVar, boolean z10, mh.q qVar, int i10, int i11) {
            super(2);
            this.f66865a = eVar;
            this.f66866b = cVar;
            this.f66867c = z10;
            this.f66868d = qVar;
            this.f66869e = i10;
            this.f66870f = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC8682e.a(this.f66865a, this.f66866b, this.f66867c, this.f66868d, interfaceC3540l, L0.a(this.f66869e | 1), this.f66870f);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, f0.c cVar, boolean z10, mh.q qVar, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1781813501);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(cVar) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.c(z10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.l(qVar) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (i14 != 0) {
                cVar = f0.c.f46573a.o();
            }
            if (i15 != 0) {
                z10 = false;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1781813501, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            C0.C cH = androidx.compose.foundation.layout.d.h(cVar, z10);
            boolean zT = ((i12 & 7168) == 2048) | interfaceC3540lR.T(cH);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(cH, qVar);
                interfaceC3540lR.K(objF);
            }
            androidx.compose.ui.layout.w.a(eVar, (InterfaceC6839p) objF, interfaceC3540lR, i12 & 14, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        f0.c cVar2 = cVar;
        boolean z11 = z10;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new b(eVar2, cVar2, z11, qVar, i10, i11));
        }
    }
}
