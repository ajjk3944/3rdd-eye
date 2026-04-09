package z;

import C0.InterfaceC2534n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o.C7019j;
import z.AbstractC8697u;
import z.r;

/* renamed from: z.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8698v {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8697u.a f66980a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66981b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66982c;

    /* renamed from: d, reason: collision with root package name */
    private int f66983d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f66984e;

    /* renamed from: f, reason: collision with root package name */
    private C0.B f66985f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.compose.ui.layout.t f66986g;

    /* renamed from: h, reason: collision with root package name */
    private C0.B f66987h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.compose.ui.layout.t f66988i;

    /* renamed from: j, reason: collision with root package name */
    private C7019j f66989j;

    /* renamed from: k, reason: collision with root package name */
    private C7019j f66990k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC6839p f66991l;

    /* renamed from: z.v$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66992a;

        static {
            int[] iArr = new int[AbstractC8697u.a.values().length];
            try {
                iArr[AbstractC8697u.a.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC8697u.a.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC8697u.a.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC8697u.a.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f66992a = iArr;
        }
    }

    /* renamed from: z.v$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8700x f66994b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC8700x interfaceC8700x) {
            super(1);
            this.f66994b = interfaceC8700x;
        }

        public final void a(androidx.compose.ui.layout.t tVar) {
            int iH;
            int iK;
            if (tVar != null) {
                InterfaceC8700x interfaceC8700x = this.f66994b;
                iH = interfaceC8700x.h(tVar);
                iK = interfaceC8700x.k(tVar);
            } else {
                iH = 0;
                iK = 0;
            }
            C8698v.this.f66989j = C7019j.a(C7019j.b(iH, iK));
            C8698v.this.f66986g = tVar;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.layout.t) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: z.v$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8700x f66996b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC8700x interfaceC8700x) {
            super(1);
            this.f66996b = interfaceC8700x;
        }

        public final void a(androidx.compose.ui.layout.t tVar) {
            int iH;
            int iK;
            if (tVar != null) {
                InterfaceC8700x interfaceC8700x = this.f66996b;
                iH = interfaceC8700x.h(tVar);
                iK = interfaceC8700x.k(tVar);
            } else {
                iH = 0;
                iK = 0;
            }
            C8698v.this.f66990k = C7019j.a(C7019j.b(iH, iK));
            C8698v.this.f66988i = tVar;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.layout.t) obj);
            return Yg.J.f24997a;
        }
    }

    public C8698v(AbstractC8697u.a aVar, int i10, int i11) {
        this.f66980a = aVar;
        this.f66981b = i10;
        this.f66982c = i11;
    }

    public final r.a e(boolean z10, int i10, int i11) {
        C0.B b10;
        C7019j c7019j;
        androidx.compose.ui.layout.t tVar;
        C0.B b11;
        androidx.compose.ui.layout.t tVar2;
        int i12 = a.f66992a[this.f66980a.ordinal()];
        if (i12 == 1 || i12 == 2) {
            return null;
        }
        if (i12 != 3 && i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (z10) {
            InterfaceC6839p interfaceC6839p = this.f66991l;
            if (interfaceC6839p == null || (b10 = (C0.B) interfaceC6839p.invoke(Boolean.TRUE, Integer.valueOf(h()))) == null) {
                b10 = this.f66985f;
            }
            c7019j = this.f66989j;
            if (this.f66991l == null) {
                tVar = this.f66986g;
                b11 = b10;
                tVar2 = tVar;
            }
            b11 = b10;
            tVar2 = null;
        } else {
            if (i10 < this.f66981b - 1 || i11 < this.f66982c) {
                b10 = null;
            } else {
                InterfaceC6839p interfaceC6839p2 = this.f66991l;
                if (interfaceC6839p2 == null || (b10 = (C0.B) interfaceC6839p2.invoke(Boolean.FALSE, Integer.valueOf(h()))) == null) {
                    b10 = this.f66987h;
                }
            }
            c7019j = this.f66990k;
            if (this.f66991l == null) {
                tVar = this.f66988i;
                b11 = b10;
                tVar2 = tVar;
            }
            b11 = b10;
            tVar2 = null;
        }
        if (b11 == null) {
            return null;
        }
        AbstractC6492s.f(c7019j);
        return new r.a(b11, tVar2, c7019j.i(), false, 8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8698v)) {
            return false;
        }
        C8698v c8698v = (C8698v) obj;
        return this.f66980a == c8698v.f66980a && this.f66981b == c8698v.f66981b && this.f66982c == c8698v.f66982c;
    }

    public final C7019j f(boolean z10, int i10, int i11) {
        int i12 = a.f66992a[this.f66980a.ordinal()];
        if (i12 == 1 || i12 == 2) {
            return null;
        }
        if (i12 == 3) {
            if (z10) {
                return this.f66989j;
            }
            return null;
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (z10) {
            return this.f66989j;
        }
        if (i10 + 1 < this.f66981b || i11 < this.f66982c) {
            return null;
        }
        return this.f66990k;
    }

    public final int g() {
        return this.f66981b;
    }

    public final int h() {
        int i10 = this.f66983d;
        if (i10 != -1) {
            return i10;
        }
        throw new IllegalStateException("Accessing noOfItemsShown before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.");
    }

    public int hashCode() {
        return (((this.f66980a.hashCode() * 31) + Integer.hashCode(this.f66981b)) * 31) + Integer.hashCode(this.f66982c);
    }

    public final AbstractC8697u.a i() {
        return this.f66980a;
    }

    public final void j(int i10) {
        this.f66984e = i10;
    }

    public final void k(int i10) {
        this.f66983d = i10;
    }

    public final void l(InterfaceC2534n interfaceC2534n, InterfaceC2534n interfaceC2534n2, boolean z10, long j10) {
        long jC = M.c(j10, z10 ? K.Horizontal : K.Vertical);
        if (interfaceC2534n != null) {
            int i10 = AbstractC8696t.i(interfaceC2534n, z10, Y0.b.k(jC));
            this.f66989j = C7019j.a(C7019j.b(i10, AbstractC8696t.f(interfaceC2534n, z10, i10)));
            this.f66985f = interfaceC2534n instanceof C0.B ? (C0.B) interfaceC2534n : null;
            this.f66986g = null;
        }
        if (interfaceC2534n2 != null) {
            int i11 = AbstractC8696t.i(interfaceC2534n2, z10, Y0.b.k(jC));
            this.f66990k = C7019j.a(C7019j.b(i11, AbstractC8696t.f(interfaceC2534n2, z10, i11)));
            this.f66987h = interfaceC2534n2 instanceof C0.B ? (C0.B) interfaceC2534n2 : null;
            this.f66988i = null;
        }
    }

    public final void m(InterfaceC8700x interfaceC8700x, C0.B b10, C0.B b11, long j10) {
        K k10 = interfaceC8700x.j() ? K.Horizontal : K.Vertical;
        long jF = M.f(M.e(M.c(j10, k10), 0, 0, 0, 0, 10, null), k10);
        if (b10 != null) {
            AbstractC8696t.k(b10, interfaceC8700x, jF, new b(interfaceC8700x));
            this.f66985f = b10;
        }
        if (b11 != null) {
            AbstractC8696t.k(b11, interfaceC8700x, jF, new c(interfaceC8700x));
            this.f66987h = b11;
        }
    }

    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.f66980a + ", minLinesToShowCollapse=" + this.f66981b + ", minCrossAxisSizeToShowCollapse=" + this.f66982c + ')';
    }
}
