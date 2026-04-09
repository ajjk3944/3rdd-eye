package androidx.compose.ui;

import E0.AbstractC2624c0;
import E0.AbstractC2633k;
import E0.InterfaceC2632j;
import E0.j0;
import Ii.A0;
import Ii.InterfaceC3091y0;
import Ii.N;
import Ii.O;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public interface e {

    /* renamed from: b0, reason: collision with root package name */
    public static final a f28771b0 = a.f28772a;

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f28772a = new a();

        private a() {
        }

        @Override // androidx.compose.ui.e
        public Object L(Object obj, InterfaceC6839p interfaceC6839p) {
            return obj;
        }

        @Override // androidx.compose.ui.e
        public e b0(e eVar) {
            return eVar;
        }

        @Override // androidx.compose.ui.e
        public boolean s(InterfaceC6835l interfaceC6835l) {
            return true;
        }

        public String toString() {
            return "Modifier";
        }
    }

    public interface b extends e {
        @Override // androidx.compose.ui.e
        default Object L(Object obj, InterfaceC6839p interfaceC6839p) {
            return interfaceC6839p.invoke(obj, this);
        }

        @Override // androidx.compose.ui.e
        default boolean s(InterfaceC6835l interfaceC6835l) {
            return ((Boolean) interfaceC6835l.invoke(this)).booleanValue();
        }
    }

    public static abstract class c implements InterfaceC2632j {

        /* renamed from: b, reason: collision with root package name */
        private N f28774b;

        /* renamed from: c, reason: collision with root package name */
        private int f28775c;

        /* renamed from: e, reason: collision with root package name */
        private c f28777e;

        /* renamed from: f, reason: collision with root package name */
        private c f28778f;

        /* renamed from: g, reason: collision with root package name */
        private j0 f28779g;

        /* renamed from: h, reason: collision with root package name */
        private AbstractC2624c0 f28780h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f28781i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f28782j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f28783k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f28784l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f28785m;

        /* renamed from: a, reason: collision with root package name */
        private c f28773a = this;

        /* renamed from: d, reason: collision with root package name */
        private int f28776d = -1;

        public final void A2(boolean z10) {
            this.f28782j = z10;
        }

        public final void B2(InterfaceC6824a interfaceC6824a) {
            AbstractC2633k.n(this).k(interfaceC6824a);
        }

        public void C2(AbstractC2624c0 abstractC2624c0) {
            this.f28780h = abstractC2624c0;
        }

        public final int a2() {
            return this.f28776d;
        }

        public final c b2() {
            return this.f28778f;
        }

        public final AbstractC2624c0 c2() {
            return this.f28780h;
        }

        public final N d2() {
            N n10 = this.f28774b;
            if (n10 != null) {
                return n10;
            }
            N nA = O.a(AbstractC2633k.n(this).getCoroutineContext().plus(A0.a((InterfaceC3091y0) AbstractC2633k.n(this).getCoroutineContext().get(InterfaceC3091y0.f9363O))));
            this.f28774b = nA;
            return nA;
        }

        public final boolean e2() {
            return this.f28781i;
        }

        public final int f2() {
            return this.f28775c;
        }

        public final j0 g2() {
            return this.f28779g;
        }

        @Override // E0.InterfaceC2632j
        public final c h1() {
            return this.f28773a;
        }

        public final c h2() {
            return this.f28777e;
        }

        public boolean i2() {
            return true;
        }

        public final boolean j2() {
            return this.f28782j;
        }

        public final boolean k2() {
            return this.f28785m;
        }

        public void l2() {
            if (this.f28785m) {
                B0.a.b("node attached multiple times");
            }
            if (!(this.f28780h != null)) {
                B0.a.b("attach invoked on a node without a coordinator");
            }
            this.f28785m = true;
            this.f28783k = true;
        }

        public void m2() {
            if (!this.f28785m) {
                B0.a.b("Cannot detach a node that is not attached");
            }
            if (this.f28783k) {
                B0.a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.f28784l) {
                B0.a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.f28785m = false;
            N n10 = this.f28774b;
            if (n10 != null) {
                O.d(n10, new ModifierNodeDetachedCancellationException());
                this.f28774b = null;
            }
        }

        public void n2() {
        }

        public void o2() {
        }

        public void p2() {
        }

        public void q2() {
            if (!this.f28785m) {
                B0.a.b("reset() called on an unattached node");
            }
            p2();
        }

        public void r2() {
            if (!this.f28785m) {
                B0.a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.f28783k) {
                B0.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.f28783k = false;
            n2();
            this.f28784l = true;
        }

        public void s2() {
            if (!this.f28785m) {
                B0.a.b("node detached multiple times");
            }
            if (!(this.f28780h != null)) {
                B0.a.b("detach invoked on a node without a coordinator");
            }
            if (!this.f28784l) {
                B0.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.f28784l = false;
            o2();
        }

        public final void t2(int i10) {
            this.f28776d = i10;
        }

        public void u2(c cVar) {
            this.f28773a = cVar;
        }

        public final void v2(c cVar) {
            this.f28778f = cVar;
        }

        public final void w2(boolean z10) {
            this.f28781i = z10;
        }

        public final void x2(int i10) {
            this.f28775c = i10;
        }

        public final void y2(j0 j0Var) {
            this.f28779g = j0Var;
        }

        public final void z2(c cVar) {
            this.f28777e = cVar;
        }
    }

    Object L(Object obj, InterfaceC6839p interfaceC6839p);

    default e b0(e eVar) {
        return eVar == f28771b0 ? this : new androidx.compose.ui.a(this, eVar);
    }

    boolean s(InterfaceC6835l interfaceC6835l);
}
