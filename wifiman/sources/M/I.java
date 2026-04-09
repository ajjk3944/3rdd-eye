package M;

import F.C2722l;
import F.Q;
import L0.S;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.t1;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.InterfaceC3923h0;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.conscrypt.PSKKeyManager;
import s.AbstractC7838K;
import s.V;
import y0.C8593n;

/* loaded from: classes.dex */
public abstract class I {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f12127a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v.i f12128b;

        /* renamed from: M.I$a$a, reason: collision with other inner class name */
        public static final class C0480a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v.i f12129a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f12130b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0480a(v.i iVar, G g10) {
                super(0);
                this.f12129a = iVar;
                this.f12130b = g10;
            }

            public final void a() {
                this.f12130b.s();
                v.j.a(this.f12129a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        public static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v.i f12131a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f12132b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(v.i iVar, G g10) {
                super(0);
                this.f12131a = iVar;
                this.f12132b = g10;
            }

            public final void a() {
                this.f12132b.o(false);
                v.j.a(this.f12131a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        public static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v.i f12133a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f12134b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(v.i iVar, G g10) {
                super(0);
                this.f12133a = iVar;
                this.f12134b = g10;
            }

            public final void a() {
                this.f12134b.T();
                v.j.a(this.f12133a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        public static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v.i f12135a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f12136b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(v.i iVar, G g10) {
                super(0);
                this.f12135a = iVar;
                this.f12136b = g10;
            }

            public final void a() {
                this.f12136b.U();
                v.j.a(this.f12135a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(G g10, v.i iVar) {
            super(1);
            this.f12127a = g10;
            this.f12128b = iVar;
        }

        public final void a(v.g gVar) {
            InterfaceC3923h0 interfaceC3923h0Y;
            boolean z10 = this.f12127a.P() instanceof R0.J;
            boolean zH = S.h(this.f12127a.O().h());
            v.i iVar = this.f12128b;
            v.g.d(gVar, new C2722l(Q.Cut), null, (zH || !this.f12127a.D() || z10) ? false : true, null, new C0480a(iVar, this.f12127a), 10, null);
            v.i iVar2 = this.f12128b;
            v.g.d(gVar, new C2722l(Q.Copy), null, (zH || z10) ? false : true, null, new b(iVar2, this.f12127a), 10, null);
            v.i iVar3 = this.f12128b;
            v.g.d(gVar, new C2722l(Q.Paste), null, this.f12127a.D() && (interfaceC3923h0Y = this.f12127a.y()) != null && interfaceC3923h0Y.c(), null, new c(iVar3, this.f12127a), 10, null);
            v.i iVar4 = this.f12128b;
            v.g.d(gVar, new C2722l(Q.SelectAll), null, S.j(this.f12127a.O().h()) != this.f12127a.O().i().length(), null, new d(iVar4, this.f12127a), 10, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v.g) obj);
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f12137a;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ G f12138a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f12139b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(G g10, InterfaceC3551q0 interfaceC3551q0) {
                super(0);
                this.f12138a = g10;
                this.f12139b = interfaceC3551q0;
            }

            public final long a() {
                return H.b(this.f12138a, b.j(this.f12139b));
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                return C6531g.d(a());
            }
        }

        /* renamed from: M.I$b$b, reason: collision with other inner class name */
        static final class C0481b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Y0.d f12140a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f12141b;

            /* renamed from: M.I$b$b$a */
            static final class a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC6824a f12142a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(InterfaceC6824a interfaceC6824a) {
                    super(1);
                    this.f12142a = interfaceC6824a;
                }

                public final long a(Y0.d dVar) {
                    return ((C6531g) this.f12142a.invoke()).v();
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return C6531g.d(a((Y0.d) obj));
                }
            }

            /* renamed from: M.I$b$b$b, reason: collision with other inner class name */
            static final class C0482b extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Y0.d f12143a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC3551q0 f12144b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0482b(Y0.d dVar, InterfaceC3551q0 interfaceC3551q0) {
                    super(1);
                    this.f12143a = dVar;
                    this.f12144b = interfaceC3551q0;
                }

                public final void a(long j10) {
                    InterfaceC3551q0 interfaceC3551q0 = this.f12144b;
                    Y0.d dVar = this.f12143a;
                    b.l(interfaceC3551q0, Y0.s.a(dVar.x1(Y0.k.h(j10)), dVar.x1(Y0.k.g(j10))));
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((Y0.k) obj).k());
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0481b(Y0.d dVar, InterfaceC3551q0 interfaceC3551q0) {
                super(1);
                this.f12140a = dVar;
                this.f12141b = interfaceC3551q0;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.e invoke(InterfaceC6824a interfaceC6824a) {
                return AbstractC7838K.e(androidx.compose.ui.e.f28771b0, new a(interfaceC6824a), (490 & 2) != 0 ? null : null, (490 & 4) != 0 ? null : new C0482b(this.f12140a, this.f12141b), (490 & 8) != 0 ? Float.NaN : 0.0f, (490 & 16) != 0 ? false : true, (490 & 32) != 0 ? Y0.k.f24532b.a() : 0L, (490 & 64) != 0 ? Y0.h.f24523b.c() : 0.0f, (490 & 128) != 0 ? Y0.h.f24523b.c() : 0.0f, (490 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0, (490 & 512) == 0 ? V.f60693a.a() : null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(G g10) {
            super(3);
            this.f12137a = g10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long j(InterfaceC3551q0 interfaceC3551q0) {
            return ((Y0.r) interfaceC3551q0.getValue()).j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC3551q0 interfaceC3551q0, long j10) {
            interfaceC3551q0.setValue(Y0.r.b(j10));
        }

        public final androidx.compose.ui.e h(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(1980580247);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1980580247, i10, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:48)");
            }
            Y0.d dVar = (Y0.d) interfaceC3540l.t(AbstractC3932k0.g());
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = t1.d(Y0.r.b(Y0.r.f24545b.a()), null, 2, null);
                interfaceC3540l.K(objF);
            }
            InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
            boolean zL = interfaceC3540l.l(this.f12137a);
            G g10 = this.f12137a;
            Object objF2 = interfaceC3540l.f();
            if (zL || objF2 == aVar.a()) {
                objF2 = new a(g10, interfaceC3551q0);
                interfaceC3540l.K(objF2);
            }
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF2;
            boolean zT = interfaceC3540l.T(dVar);
            Object objF3 = interfaceC3540l.f();
            if (zT || objF3 == aVar.a()) {
                objF3 = new C0481b(dVar, interfaceC3551q0);
                interfaceC3540l.K(objF3);
            }
            androidx.compose.ui.e eVarD = z.d(eVar, interfaceC6824a, (InterfaceC6835l) objF3);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarD;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return h((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final InterfaceC6835l a(G g10, v.i iVar) {
        return new a(g10, iVar);
    }

    public static final boolean b(C8593n c8593n) {
        return false;
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, G g10) {
        return !AbstractC7838K.d(0, 1, null) ? eVar : androidx.compose.ui.c.c(eVar, null, new b(g10), 1, null);
    }
}
