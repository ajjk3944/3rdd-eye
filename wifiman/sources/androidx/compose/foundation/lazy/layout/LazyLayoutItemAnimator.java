package androidx.compose.foundation.lazy.layout;

import B.A;
import B.AbstractC2453q;
import B.C2445i;
import B.z;
import E0.AbstractC2640s;
import E0.V;
import E0.r;
import Ii.N;
import Y0.n;
import Y0.o;
import Y0.s;
import Yg.J;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import androidx.compose.ui.e;
import ch.AbstractC4260a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import m0.InterfaceC6671H0;
import mh.InterfaceC6824a;
import o.C7009H;
import o.I;
import o.S;
import o.U;
import o0.InterfaceC7036c;
import org.snmp4j.util.SnmpConfigurator;
import p0.AbstractC7184e;
import p0.C7182c;

/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator {

    /* renamed from: b, reason: collision with root package name */
    private androidx.compose.foundation.lazy.layout.c f28232b;

    /* renamed from: c, reason: collision with root package name */
    private int f28233c;

    /* renamed from: j, reason: collision with root package name */
    private r f28240j;

    /* renamed from: a, reason: collision with root package name */
    private final C7009H f28231a = S.d();

    /* renamed from: d, reason: collision with root package name */
    private final I f28234d = U.a();

    /* renamed from: e, reason: collision with root package name */
    private final List f28235e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List f28236f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List f28237g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f28238h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final List f28239i = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private final androidx.compose.ui.e f28241k = new DisplayingDisappearingItemsElement(this);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "LE0/V;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "d", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsElement extends V {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LazyLayoutItemAnimator animator;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        @Override // E0.V
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a getNode() {
            return new a(this.animator);
        }

        @Override // E0.V
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(a node) {
            node.D2(this.animator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && AbstractC6492s.d(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }
    }

    private static final class a extends e.c implements r {

        /* renamed from: n, reason: collision with root package name */
        private LazyLayoutItemAnimator f28243n;

        public a(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.f28243n = lazyLayoutItemAnimator;
        }

        public final void D2(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            if (AbstractC6492s.d(this.f28243n, lazyLayoutItemAnimator) || !h1().k2()) {
                return;
            }
            this.f28243n.o();
            lazyLayoutItemAnimator.f28240j = this;
            this.f28243n = lazyLayoutItemAnimator;
        }

        @Override // E0.r
        public void J(InterfaceC7036c interfaceC7036c) {
            List list = this.f28243n.f28239i;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.foundation.lazy.layout.b bVar = (androidx.compose.foundation.lazy.layout.b) list.get(i10);
                C7182c c7182cP = bVar.p();
                if (c7182cP != null) {
                    float fH = n.h(bVar.o());
                    float fH2 = fH - n.h(c7182cP.w());
                    float fI = n.i(bVar.o()) - n.i(c7182cP.w());
                    interfaceC7036c.k1().e().c(fH2, fI);
                    try {
                        AbstractC7184e.a(interfaceC7036c, c7182cP);
                    } finally {
                        interfaceC7036c.k1().e().c(-fH2, -fI);
                    }
                }
            }
            interfaceC7036c.X1();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f28243n, ((a) obj).f28243n);
        }

        public int hashCode() {
            return this.f28243n.hashCode();
        }

        @Override // androidx.compose.ui.e.c
        public void n2() {
            this.f28243n.f28240j = this;
        }

        @Override // androidx.compose.ui.e.c
        public void o2() {
            this.f28243n.o();
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.f28243n + ')';
        }
    }

    private final class b {

        /* renamed from: b, reason: collision with root package name */
        private Y0.b f28245b;

        /* renamed from: c, reason: collision with root package name */
        private int f28246c;

        /* renamed from: d, reason: collision with root package name */
        private int f28247d;

        /* renamed from: f, reason: collision with root package name */
        private int f28249f;

        /* renamed from: g, reason: collision with root package name */
        private int f28250g;

        /* renamed from: a, reason: collision with root package name */
        private androidx.compose.foundation.lazy.layout.b[] f28244a = AbstractC2453q.f994a;

        /* renamed from: e, reason: collision with root package name */
        private int f28248e = 1;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LazyLayoutItemAnimator f28252a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
                super(0);
                this.f28252a = lazyLayoutItemAnimator;
            }

            public final void a() {
                r rVar = this.f28252a.f28240j;
                if (rVar != null) {
                    AbstractC2640s.a(rVar);
                }
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        public b() {
        }

        private final boolean h() {
            for (androidx.compose.foundation.lazy.layout.b bVar : this.f28244a) {
                if (bVar != null && bVar.x()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void l(b bVar, z zVar, N n10, InterfaceC6671H0 interfaceC6671H0, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 32) != 0) {
                i12 = LazyLayoutItemAnimator.this.f(zVar);
            }
            bVar.k(zVar, n10, interfaceC6671H0, i10, i11, i12);
        }

        public final androidx.compose.foundation.lazy.layout.b[] a() {
            return this.f28244a;
        }

        public final Y0.b b() {
            return this.f28245b;
        }

        public final int c() {
            return this.f28246c;
        }

        public final int d() {
            return this.f28247d;
        }

        public final int e() {
            return this.f28250g;
        }

        public final int f() {
            return this.f28249f;
        }

        public final int g() {
            return this.f28248e;
        }

        public final void i(int i10) {
            this.f28247d = i10;
        }

        public final void j(int i10) {
            this.f28248e = i10;
        }

        public final void k(z zVar, N n10, InterfaceC6671H0 interfaceC6671H0, int i10, int i11, int i12) {
            if (!h()) {
                this.f28249f = i10;
                this.f28250g = i11;
            }
            int length = this.f28244a.length;
            for (int iC = zVar.c(); iC < length; iC++) {
                androidx.compose.foundation.lazy.layout.b bVar = this.f28244a[iC];
                if (bVar != null) {
                    bVar.y();
                }
            }
            if (this.f28244a.length != zVar.c()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.f28244a, zVar.c());
                AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
                this.f28244a = (androidx.compose.foundation.lazy.layout.b[]) objArrCopyOf;
            }
            this.f28245b = Y0.b.a(zVar.d());
            this.f28246c = i12;
            this.f28247d = zVar.k();
            this.f28248e = zVar.g();
            int iC2 = zVar.c();
            LazyLayoutItemAnimator lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i13 = 0; i13 < iC2; i13++) {
                C2445i c2445iC = AbstractC2453q.c(zVar.h(i13));
                if (c2445iC == null) {
                    androidx.compose.foundation.lazy.layout.b bVar2 = this.f28244a[i13];
                    if (bVar2 != null) {
                        bVar2.y();
                    }
                    this.f28244a[i13] = null;
                } else {
                    androidx.compose.foundation.lazy.layout.b bVar3 = this.f28244a[i13];
                    if (bVar3 == null) {
                        bVar3 = new androidx.compose.foundation.lazy.layout.b(n10, interfaceC6671H0, new a(lazyLayoutItemAnimator));
                        this.f28244a[i13] = bVar3;
                    }
                    bVar3.C(c2445iC.D2());
                    bVar3.I(c2445iC.F2());
                    bVar3.D(c2445iC.E2());
                }
            }
        }
    }

    public static final class c implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f28253a;

        public c(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f28253a = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(Integer.valueOf(this.f28253a.c(((z) obj).getKey())), Integer.valueOf(this.f28253a.c(((z) obj2).getKey())));
        }
    }

    public static final class d implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f28254a;

        public d(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f28254a = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(Integer.valueOf(this.f28254a.c(((z) obj).getKey())), Integer.valueOf(this.f28254a.c(((z) obj2).getKey())));
        }
    }

    public static final class e implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f28255a;

        public e(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f28255a = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(Integer.valueOf(this.f28255a.c(((z) obj2).getKey())), Integer.valueOf(this.f28255a.c(((z) obj).getKey())));
        }
    }

    public static final class f implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f28256a;

        public f(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f28256a = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(Integer.valueOf(this.f28256a.c(((z) obj2).getKey())), Integer.valueOf(this.f28256a.c(((z) obj).getKey())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f(z zVar) {
        long j10 = zVar.j(0);
        return !zVar.i() ? n.i(j10) : n.h(j10);
    }

    private final boolean g(z zVar) {
        int iC = zVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (AbstractC2453q.c(zVar.h(i10)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int h(z zVar) {
        long j10 = zVar.j(0);
        return zVar.i() ? n.i(j10) : n.h(j10);
    }

    private final void k(z zVar, int i10, b bVar) {
        int i11 = 0;
        long j10 = zVar.j(0);
        long jE = zVar.i() ? n.e(j10, 0, i10, 1, null) : n.e(j10, i10, 0, 2, null);
        androidx.compose.foundation.lazy.layout.b[] bVarArrA = bVar.a();
        int length = bVarArrA.length;
        int i12 = 0;
        while (i11 < length) {
            androidx.compose.foundation.lazy.layout.b bVar2 = bVarArrA[i11];
            int i13 = i12 + 1;
            if (bVar2 != null) {
                bVar2.J(n.l(jE, n.k(zVar.j(i12), j10)));
            }
            i11++;
            i12 = i13;
        }
    }

    static /* synthetic */ void l(LazyLayoutItemAnimator lazyLayoutItemAnimator, z zVar, int i10, b bVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            Object objC = lazyLayoutItemAnimator.f28231a.c(zVar.getKey());
            AbstractC6492s.f(objC);
            bVar = (b) objC;
        }
        lazyLayoutItemAnimator.k(zVar, i10, bVar);
    }

    private final void n(Object obj) {
        androidx.compose.foundation.lazy.layout.b[] bVarArrA;
        b bVar = (b) this.f28231a.p(obj);
        if (bVar == null || (bVarArrA = bVar.a()) == null) {
            return;
        }
        for (androidx.compose.foundation.lazy.layout.b bVar2 : bVarArrA) {
            if (bVar2 != null) {
                bVar2.y();
            }
        }
    }

    private final void p(z zVar, boolean z10) {
        Object objC = this.f28231a.c(zVar.getKey());
        AbstractC6492s.f(objC);
        androidx.compose.foundation.lazy.layout.b[] bVarArrA = ((b) objC).a();
        int length = bVarArrA.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            androidx.compose.foundation.lazy.layout.b bVar = bVarArrA[i10];
            int i12 = i11 + 1;
            if (bVar != null) {
                long j10 = zVar.j(i11);
                long jS = bVar.s();
                if (!n.g(jS, androidx.compose.foundation.lazy.layout.b.f28264s.a()) && !n.g(jS, j10)) {
                    bVar.m(n.k(j10, jS), z10);
                }
                bVar.J(j10);
            }
            i10++;
            i11 = i12;
        }
    }

    static /* synthetic */ void q(LazyLayoutItemAnimator lazyLayoutItemAnimator, z zVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lazyLayoutItemAnimator.p(zVar, z10);
    }

    private final int r(int[] iArr, z zVar) {
        int iK = zVar.k();
        int iG = zVar.g() + iK;
        int iMax = 0;
        while (iK < iG) {
            int iF = iArr[iK] + zVar.f();
            iArr[iK] = iF;
            iMax = Math.max(iMax, iF);
            iK++;
        }
        return iMax;
    }

    public final androidx.compose.foundation.lazy.layout.b e(Object obj, int i10) {
        androidx.compose.foundation.lazy.layout.b[] bVarArrA;
        b bVar = (b) this.f28231a.c(obj);
        if (bVar == null || (bVarArrA = bVar.a()) == null) {
            return null;
        }
        return bVarArrA[i10];
    }

    public final long i() {
        long jA = Y0.r.f24545b.a();
        List list = this.f28239i;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.foundation.lazy.layout.b bVar = (androidx.compose.foundation.lazy.layout.b) list.get(i10);
            C7182c c7182cP = bVar.p();
            if (c7182cP != null) {
                jA = s.a(Math.max(Y0.r.g(jA), n.h(bVar.s()) + Y0.r.g(c7182cP.v())), Math.max(Y0.r.f(jA), n.i(bVar.s()) + Y0.r.f(c7182cP.v())));
            }
        }
        return jA;
    }

    public final androidx.compose.ui.e j() {
        return this.f28241k;
    }

    public final void m(int i10, int i11, int i12, List list, androidx.compose.foundation.lazy.layout.c cVar, A a10, boolean z10, boolean z11, int i13, boolean z12, int i14, int i15, N n10, InterfaceC6671H0 interfaceC6671H0) {
        androidx.compose.foundation.lazy.layout.c cVar2;
        androidx.compose.foundation.lazy.layout.c cVar3;
        int[] iArr;
        int i16;
        int i17;
        androidx.compose.foundation.lazy.layout.c cVar4;
        int[] iArr2;
        long[] jArr;
        Object[] objArr;
        int i18;
        long[] jArr2;
        Object[] objArr2;
        int[] iArr3;
        androidx.compose.foundation.lazy.layout.b[] bVarArr;
        int i19;
        androidx.compose.foundation.lazy.layout.b[] bVarArr2;
        int i20;
        int i21;
        androidx.compose.foundation.lazy.layout.c cVar5;
        int i22;
        androidx.compose.foundation.lazy.layout.c cVar6;
        int i23;
        long[] jArr3;
        Object[] objArr3;
        int i24;
        long[] jArr4;
        Object[] objArr4;
        List list2 = list;
        int i25 = i13;
        androidx.compose.foundation.lazy.layout.c cVar7 = this.f28232b;
        this.f28232b = cVar;
        int size = list.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size) {
                if (this.f28231a.f()) {
                    o();
                    return;
                }
            } else if (g((z) list2.get(i26))) {
                break;
            } else {
                i26++;
            }
        }
        int i27 = this.f28233c;
        z zVar = (z) AbstractC3689v.s0(list);
        this.f28233c = zVar != null ? zVar.getIndex() : 0;
        long jA = z10 ? o.a(0, i10) : o.a(i10, 0);
        boolean z13 = z11 || !z12;
        C7009H c7009h = this.f28231a;
        Object[] objArr5 = c7009h.f54922b;
        long[] jArr5 = c7009h.f54921a;
        int length = jArr5.length - 2;
        boolean z14 = z13;
        if (length >= 0) {
            int i28 = 0;
            while (true) {
                long j10 = jArr5[i28];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i29 = 8 - ((~(i28 - length)) >>> 31);
                    int i30 = 0;
                    while (i30 < i29) {
                        if ((j10 & 255) < 128) {
                            jArr4 = jArr5;
                            objArr4 = objArr5;
                            this.f28234d.h(objArr5[(i28 << 3) + i30]);
                        } else {
                            jArr4 = jArr5;
                            objArr4 = objArr5;
                        }
                        j10 >>= 8;
                        i30++;
                        objArr5 = objArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    objArr3 = objArr5;
                    i24 = 1;
                    if (i29 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    objArr3 = objArr5;
                    i24 = 1;
                }
                if (i28 == length) {
                    break;
                }
                i28 += i24;
                objArr5 = objArr3;
                jArr5 = jArr3;
            }
        }
        int size2 = list.size();
        int i31 = 0;
        while (i31 < size2) {
            z zVar2 = (z) list2.get(i31);
            this.f28234d.x(zVar2.getKey());
            if (g(zVar2)) {
                b bVar = (b) this.f28231a.c(zVar2.getKey());
                int iC = cVar7 != null ? cVar7.c(zVar2.getKey()) : -1;
                boolean z15 = iC == -1 && cVar7 != null;
                if (bVar == null) {
                    b bVar2 = new b();
                    b.l(bVar2, zVar2, n10, interfaceC6671H0, i14, i15, 0, 32, null);
                    this.f28231a.s(zVar2.getKey(), bVar2);
                    if (zVar2.getIndex() == iC || iC == -1) {
                        long j11 = zVar2.j(0);
                        k(zVar2, zVar2.i() ? n.i(j11) : n.h(j11), bVar2);
                        if (z15) {
                            androidx.compose.foundation.lazy.layout.b[] bVarArrA = bVar2.a();
                            for (androidx.compose.foundation.lazy.layout.b bVar3 : bVarArrA) {
                                if (bVar3 != null) {
                                    bVar3.k();
                                    J j12 = J.f24997a;
                                }
                            }
                        }
                    } else if (iC < i27) {
                        this.f28235e.add(zVar2);
                    } else {
                        this.f28236f.add(zVar2);
                    }
                } else if (z14) {
                    b.l(bVar, zVar2, n10, interfaceC6671H0, i14, i15, 0, 32, null);
                    androidx.compose.foundation.lazy.layout.b[] bVarArrA2 = bVar.a();
                    int i32 = 0;
                    for (int length2 = bVarArrA2.length; i32 < length2; length2 = i23) {
                        int i33 = size2;
                        androidx.compose.foundation.lazy.layout.b bVar4 = bVarArrA2[i32];
                        if (bVar4 != null) {
                            cVar6 = cVar7;
                            i23 = length2;
                            if (!n.g(bVar4.s(), androidx.compose.foundation.lazy.layout.b.f28264s.a())) {
                                bVar4.J(n.l(bVar4.s(), jA));
                            }
                        } else {
                            cVar6 = cVar7;
                            i23 = length2;
                        }
                        i32++;
                        size2 = i33;
                        cVar7 = cVar6;
                    }
                    i21 = size2;
                    cVar5 = cVar7;
                    if (z15) {
                        for (androidx.compose.foundation.lazy.layout.b bVar5 : bVar.a()) {
                            if (bVar5 != null) {
                                if (bVar5.v()) {
                                    this.f28239i.remove(bVar5);
                                    r rVar = this.f28240j;
                                    if (rVar != null) {
                                        AbstractC2640s.a(rVar);
                                        J j13 = J.f24997a;
                                    }
                                }
                                bVar5.k();
                            }
                        }
                    }
                    i22 = 1;
                    q(this, zVar2, false, 2, null);
                }
                i21 = size2;
                cVar5 = cVar7;
                i22 = 1;
            } else {
                i21 = size2;
                cVar5 = cVar7;
                i22 = 1;
                n(zVar2.getKey());
            }
            i31 += i22;
            list2 = list;
            size2 = i21;
            cVar7 = cVar5;
        }
        androidx.compose.foundation.lazy.layout.c cVar8 = cVar7;
        int i34 = 0;
        int[] iArr4 = new int[i25];
        int i35 = 0;
        while (i35 < i25) {
            iArr4[i35] = i34;
            i35++;
            i34 = 0;
        }
        if (!z14 || cVar8 == null) {
            cVar2 = cVar8;
        } else {
            if (this.f28235e.isEmpty()) {
                cVar2 = cVar8;
            } else {
                List list3 = this.f28235e;
                if (list3.size() > 1) {
                    cVar2 = cVar8;
                    AbstractC3689v.B(list3, new e(cVar2));
                } else {
                    cVar2 = cVar8;
                }
                List list4 = this.f28235e;
                int size3 = list4.size();
                for (int i36 = 0; i36 < size3; i36++) {
                    z zVar3 = (z) list4.get(i36);
                    l(this, zVar3, i14 - r(iArr4, zVar3), null, 4, null);
                    q(this, zVar3, false, 2, null);
                }
                AbstractC3682n.w(iArr4, 0, 0, 0, 6, null);
            }
            if (!this.f28236f.isEmpty()) {
                List list5 = this.f28236f;
                if (list5.size() > 1) {
                    AbstractC3689v.B(list5, new c(cVar2));
                }
                List list6 = this.f28236f;
                int size4 = list6.size();
                for (int i37 = 0; i37 < size4; i37++) {
                    z zVar4 = (z) list6.get(i37);
                    l(this, zVar4, (i15 + r(iArr4, zVar4)) - zVar4.f(), null, 4, null);
                    q(this, zVar4, false, 2, null);
                }
                AbstractC3682n.w(iArr4, 0, 0, 0, 6, null);
            }
        }
        I i38 = this.f28234d;
        Object[] objArr6 = i38.f54929b;
        long[] jArr6 = i38.f54928a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i39 = 0;
            while (true) {
                long j14 = jArr6[i39];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i40 = 8 - ((~(i39 - length3)) >>> 31);
                    int i41 = 0;
                    while (i41 < i40) {
                        if ((j14 & 255) < 128) {
                            Object obj = objArr6[(i39 << 3) + i41];
                            Object objC = this.f28231a.c(obj);
                            AbstractC6492s.f(objC);
                            b bVar6 = (b) objC;
                            int iC2 = cVar.c(obj);
                            jArr2 = jArr6;
                            bVar6.j(Math.min(i25, bVar6.g()));
                            objArr2 = objArr6;
                            bVar6.i(Math.min(i25 - bVar6.g(), bVar6.d()));
                            if (iC2 == -1) {
                                androidx.compose.foundation.lazy.layout.b[] bVarArrA3 = bVar6.a();
                                int length4 = bVarArrA3.length;
                                int i42 = 0;
                                int i43 = 0;
                                boolean z16 = false;
                                while (i42 < length4) {
                                    androidx.compose.foundation.lazy.layout.b bVar7 = bVarArrA3[i42];
                                    int i44 = i43 + 1;
                                    if (bVar7 != null) {
                                        if (bVar7.v()) {
                                            bVarArr2 = bVarArrA3;
                                        } else if (bVar7.u()) {
                                            bVar7.y();
                                            bVar6.a()[i43] = null;
                                            bVarArr2 = bVarArrA3;
                                            this.f28239i.remove(bVar7);
                                            r rVar2 = this.f28240j;
                                            if (rVar2 != null) {
                                                AbstractC2640s.a(rVar2);
                                                J j15 = J.f24997a;
                                            }
                                        } else {
                                            bVarArr2 = bVarArrA3;
                                            if (bVar7.p() != null) {
                                                bVar7.l();
                                            }
                                            if (bVar7.v()) {
                                                this.f28239i.add(bVar7);
                                                r rVar3 = this.f28240j;
                                                if (rVar3 != null) {
                                                    AbstractC2640s.a(rVar3);
                                                    J j16 = J.f24997a;
                                                }
                                            } else {
                                                bVar7.y();
                                                bVar6.a()[i43] = null;
                                                i20 = 1;
                                                i42 += i20;
                                                i43 = i44;
                                                bVarArrA3 = bVarArr2;
                                            }
                                        }
                                        i20 = 1;
                                        z16 = true;
                                        i42 += i20;
                                        i43 = i44;
                                        bVarArrA3 = bVarArr2;
                                    } else {
                                        bVarArr2 = bVarArrA3;
                                    }
                                    i20 = 1;
                                    i42 += i20;
                                    i43 = i44;
                                    bVarArrA3 = bVarArr2;
                                }
                                if (!z16) {
                                    n(obj);
                                }
                            } else {
                                Y0.b bVarB = bVar6.b();
                                AbstractC6492s.f(bVarB);
                                z zVarA = a10.a(iC2, bVar6.d(), bVar6.g(), bVarB.r());
                                zVarA.e(true);
                                androidx.compose.foundation.lazy.layout.b[] bVarArrA4 = bVar6.a();
                                int length5 = bVarArrA4.length;
                                iArr3 = iArr4;
                                int i45 = 0;
                                while (true) {
                                    if (i45 < length5) {
                                        androidx.compose.foundation.lazy.layout.b bVar8 = bVarArrA4[i45];
                                        int i46 = length5;
                                        if (bVar8 != null) {
                                            boolean zW = bVar8.w();
                                            bVarArr = bVarArrA4;
                                            i19 = 1;
                                            if (zW) {
                                                break;
                                            }
                                        } else {
                                            bVarArr = bVarArrA4;
                                            i19 = 1;
                                        }
                                        i45 += i19;
                                        bVarArrA4 = bVarArr;
                                        length5 = i46;
                                    } else if (cVar2 == null || iC2 != cVar2.c(obj)) {
                                        break;
                                    } else {
                                        n(obj);
                                    }
                                }
                                bVar6.k(zVarA, n10, interfaceC6671H0, i14, i15, bVar6.c());
                                if (iC2 < this.f28233c) {
                                    this.f28237g.add(zVarA);
                                } else {
                                    this.f28238h.add(zVarA);
                                }
                                j14 >>= 8;
                                i41++;
                                objArr6 = objArr2;
                                i25 = i13;
                                jArr6 = jArr2;
                                iArr4 = iArr3;
                            }
                        } else {
                            jArr2 = jArr6;
                            objArr2 = objArr6;
                        }
                        iArr3 = iArr4;
                        j14 >>= 8;
                        i41++;
                        objArr6 = objArr2;
                        i25 = i13;
                        jArr6 = jArr2;
                        iArr4 = iArr3;
                    }
                    cVar3 = cVar;
                    jArr = jArr6;
                    objArr = objArr6;
                    iArr = iArr4;
                    i18 = 1;
                    if (i40 != 8) {
                        break;
                    }
                } else {
                    cVar3 = cVar;
                    jArr = jArr6;
                    objArr = objArr6;
                    iArr = iArr4;
                    i18 = 1;
                }
                if (i39 == length3) {
                    break;
                }
                i39 += i18;
                objArr6 = objArr;
                i25 = i13;
                jArr6 = jArr;
                iArr4 = iArr;
            }
        } else {
            cVar3 = cVar;
            iArr = iArr4;
        }
        if (this.f28237g.isEmpty()) {
            i16 = i11;
            i17 = i12;
            cVar4 = cVar3;
            iArr2 = iArr;
        } else {
            List list7 = this.f28237g;
            if (list7.size() > 1) {
                AbstractC3689v.B(list7, new f(cVar3));
            }
            List list8 = this.f28237g;
            int size5 = list8.size();
            int i47 = 0;
            while (i47 < size5) {
                z zVar5 = (z) list8.get(i47);
                Object objC2 = this.f28231a.c(zVar5.getKey());
                AbstractC6492s.f(objC2);
                b bVar9 = (b) objC2;
                int[] iArr5 = iArr;
                zVar5.l((z11 ? h((z) AbstractC3689v.q0(list)) : bVar9.f()) - r(iArr5, zVar5), bVar9.c(), i11, i12);
                if (z14) {
                    p(zVar5, true);
                }
                i47++;
                iArr = iArr5;
            }
            i16 = i11;
            i17 = i12;
            iArr2 = iArr;
            cVar4 = cVar3;
            AbstractC3682n.w(iArr2, 0, 0, 0, 6, null);
        }
        if (!this.f28238h.isEmpty()) {
            List list9 = this.f28238h;
            if (list9.size() > 1) {
                AbstractC3689v.B(list9, new d(cVar4));
            }
            List list10 = this.f28238h;
            int size6 = list10.size();
            for (int i48 = 0; i48 < size6; i48++) {
                z zVar6 = (z) list10.get(i48);
                Object objC3 = this.f28231a.c(zVar6.getKey());
                AbstractC6492s.f(objC3);
                b bVar10 = (b) objC3;
                zVar6.l((z11 ? h((z) AbstractC3689v.B0(list)) : bVar10.e() - zVar6.f()) + r(iArr2, zVar6), bVar10.c(), i16, i17);
                if (z14) {
                    p(zVar6, true);
                }
            }
        }
        List list11 = this.f28237g;
        AbstractC3689v.X(list11);
        J j17 = J.f24997a;
        list.addAll(0, list11);
        list.addAll(this.f28238h);
        this.f28235e.clear();
        this.f28236f.clear();
        this.f28237g.clear();
        this.f28238h.clear();
        this.f28234d.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r14 = this;
            o.H r0 = r14.f28231a
            boolean r0 = r0.g()
            if (r0 == 0) goto L63
            o.H r0 = r14.f28231a
            java.lang.Object[] r1 = r0.f54923c
            long[] r0 = r0.f54921a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5e
            r3 = 0
            r4 = r3
        L15:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L59
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2f:
            if (r9 >= r7) goto L57
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L53
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r10
            androidx.compose.foundation.lazy.layout.b[] r10 = r10.a()
            int r11 = r10.length
            r12 = r3
        L47:
            if (r12 >= r11) goto L53
            r13 = r10[r12]
            if (r13 == 0) goto L50
            r13.y()
        L50:
            int r12 = r12 + 1
            goto L47
        L53:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2f
        L57:
            if (r7 != r8) goto L5e
        L59:
            if (r4 == r2) goto L5e
            int r4 = r4 + 1
            goto L15
        L5e:
            o.H r0 = r14.f28231a
            r0.i()
        L63:
            androidx.compose.foundation.lazy.layout.c$a r0 = androidx.compose.foundation.lazy.layout.c.f28315a
            r14.f28232b = r0
            r0 = -1
            r14.f28233c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.o():void");
    }
}
