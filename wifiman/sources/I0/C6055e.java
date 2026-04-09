package i0;

import E0.A0;
import E0.AbstractC2633k;
import E0.B0;
import E0.z0;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.N;
import mh.InterfaceC6835l;

/* renamed from: i0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6055e extends e.c implements A0, InterfaceC6054d {

    /* renamed from: r, reason: collision with root package name */
    public static final a f48759r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f48760s = 8;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC6835l f48761n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f48762o = a.C1807a.f48765a;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC6054d f48763p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC6057g f48764q;

    /* renamed from: i0.e$a */
    public static final class a {

        /* renamed from: i0.e$a$a, reason: collision with other inner class name */
        private static final class C1807a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1807a f48765a = new C1807a();

            private C1807a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: i0.e$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6052b f48766a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6055e f48767b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ J f48768c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6052b c6052b, C6055e c6055e, J j10) {
            super(1);
            this.f48766a = c6052b;
            this.f48767b = c6055e;
            this.f48768c = j10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(C6055e c6055e) {
            if (!c6055e.k2()) {
                return z0.SkipSubtreeAndContinueTraversal;
            }
            if (!(c6055e.f48764q == null)) {
                B0.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            c6055e.f48764q = (InterfaceC6057g) c6055e.f48761n.invoke(this.f48766a);
            boolean z10 = c6055e.f48764q != null;
            if (z10) {
                AbstractC2633k.n(this.f48767b).getDragAndDropManager().b(c6055e);
            }
            J j10 = this.f48768c;
            j10.f51685a = j10.f51685a || z10;
            return z0.ContinueTraversal;
        }
    }

    /* renamed from: i0.e$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6052b f48769a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C6052b c6052b) {
            super(1);
            this.f48769a = c6052b;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(C6055e c6055e) {
            if (!c6055e.h1().k2()) {
                return z0.SkipSubtreeAndContinueTraversal;
            }
            InterfaceC6057g interfaceC6057g = c6055e.f48764q;
            if (interfaceC6057g != null) {
                interfaceC6057g.y0(this.f48769a);
            }
            c6055e.f48764q = null;
            c6055e.f48763p = null;
            return z0.ContinueTraversal;
        }
    }

    /* renamed from: i0.e$d */
    public static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f48770a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6055e f48771b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6052b f48772c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(N n10, C6055e c6055e, C6052b c6052b) {
            super(1);
            this.f48770a = n10;
            this.f48771b = c6055e;
            this.f48772c = c6052b;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(A0 a02) {
            C6055e c6055e = (C6055e) a02;
            if (!AbstractC2633k.n(this.f48771b).getDragAndDropManager().a(c6055e) || !AbstractC6056f.e(c6055e, AbstractC6059i.a(this.f48772c))) {
                return z0.ContinueTraversal;
            }
            this.f48770a.f51689a = a02;
            return z0.CancelTraversal;
        }
    }

    public C6055e(InterfaceC6835l interfaceC6835l) {
        this.f48761n = interfaceC6835l;
    }

    public boolean D2(C6052b c6052b) {
        J j10 = new J();
        AbstractC6056f.g(this, new b(c6052b, this, j10));
        return j10.f51685a;
    }

    @Override // i0.InterfaceC6057g
    public void G0(C6052b c6052b) {
        A0 a02;
        InterfaceC6054d interfaceC6054d;
        InterfaceC6054d interfaceC6054d2 = this.f48763p;
        if (interfaceC6054d2 == null || !AbstractC6056f.e(interfaceC6054d2, AbstractC6059i.a(c6052b))) {
            if (h1().k2()) {
                N n10 = new N();
                B0.f(this, new d(n10, this, c6052b));
                a02 = (A0) n10.f51689a;
            } else {
                a02 = null;
            }
            interfaceC6054d = (InterfaceC6054d) a02;
        } else {
            interfaceC6054d = interfaceC6054d2;
        }
        if (interfaceC6054d != null && interfaceC6054d2 == null) {
            AbstractC6056f.f(interfaceC6054d, c6052b);
            InterfaceC6057g interfaceC6057g = this.f48764q;
            if (interfaceC6057g != null) {
                interfaceC6057g.z1(c6052b);
            }
        } else if (interfaceC6054d == null && interfaceC6054d2 != null) {
            InterfaceC6057g interfaceC6057g2 = this.f48764q;
            if (interfaceC6057g2 != null) {
                AbstractC6056f.f(interfaceC6057g2, c6052b);
            }
            interfaceC6054d2.z1(c6052b);
        } else if (!AbstractC6492s.d(interfaceC6054d, interfaceC6054d2)) {
            if (interfaceC6054d != null) {
                AbstractC6056f.f(interfaceC6054d, c6052b);
            }
            if (interfaceC6054d2 != null) {
                interfaceC6054d2.z1(c6052b);
            }
        } else if (interfaceC6054d != null) {
            interfaceC6054d.G0(c6052b);
        } else {
            InterfaceC6057g interfaceC6057g3 = this.f48764q;
            if (interfaceC6057g3 != null) {
                interfaceC6057g3.G0(c6052b);
            }
        }
        this.f48763p = interfaceC6054d;
    }

    @Override // i0.InterfaceC6057g
    public void R1(C6052b c6052b) {
        InterfaceC6057g interfaceC6057g = this.f48764q;
        if (interfaceC6057g != null) {
            interfaceC6057g.R1(c6052b);
            return;
        }
        InterfaceC6054d interfaceC6054d = this.f48763p;
        if (interfaceC6054d != null) {
            interfaceC6054d.R1(c6052b);
        }
    }

    @Override // i0.InterfaceC6057g
    public void T(C6052b c6052b) {
        InterfaceC6057g interfaceC6057g = this.f48764q;
        if (interfaceC6057g != null) {
            interfaceC6057g.T(c6052b);
            return;
        }
        InterfaceC6054d interfaceC6054d = this.f48763p;
        if (interfaceC6054d != null) {
            interfaceC6054d.T(c6052b);
        }
    }

    @Override // E0.A0
    public Object W() {
        return this.f48762o;
    }

    @Override // i0.InterfaceC6057g
    public boolean c1(C6052b c6052b) {
        InterfaceC6054d interfaceC6054d = this.f48763p;
        if (interfaceC6054d != null) {
            return interfaceC6054d.c1(c6052b);
        }
        InterfaceC6057g interfaceC6057g = this.f48764q;
        if (interfaceC6057g != null) {
            return interfaceC6057g.c1(c6052b);
        }
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        this.f48764q = null;
        this.f48763p = null;
    }

    @Override // i0.InterfaceC6057g
    public void y0(C6052b c6052b) {
        AbstractC6056f.g(this, new c(c6052b));
    }

    @Override // i0.InterfaceC6057g
    public void z1(C6052b c6052b) {
        InterfaceC6057g interfaceC6057g = this.f48764q;
        if (interfaceC6057g != null) {
            interfaceC6057g.z1(c6052b);
        }
        InterfaceC6054d interfaceC6054d = this.f48763p;
        if (interfaceC6054d != null) {
            interfaceC6054d.z1(c6052b);
        }
        this.f48763p = null;
    }
}
