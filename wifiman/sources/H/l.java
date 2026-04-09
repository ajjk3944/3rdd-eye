package H;

import H.f;
import H.p;
import I.I;
import L0.S;
import L0.T;
import T.InterfaceC3551q0;
import T.t1;
import Zg.AbstractC3689v;
import androidx.compose.runtime.snapshots.g;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final p f7557a;

    /* renamed from: b, reason: collision with root package name */
    private I f7558b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f7559c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3551q0 f7560d;

    /* renamed from: e, reason: collision with root package name */
    private final r f7561e;

    /* renamed from: f, reason: collision with root package name */
    private final V.b f7562f;

    public interface a {
        void a(h hVar, h hVar2, boolean z10);
    }

    public static final class b implements InterfaceC4182k {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7563a = new b();

        private b() {
        }

        @Override // c0.InterfaceC4182k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public l a(Object obj) {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            AbstractC6492s.g(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            AbstractC6492s.g(obj4, "null cannot be cast to non-null type kotlin.Int");
            long jB = T.b(iIntValue, ((Integer) obj4).intValue());
            p.a.C0303a c0303a = p.a.C0303a.f7579a;
            AbstractC6492s.f(obj5);
            p pVarC = c0303a.a(obj5);
            AbstractC6492s.f(pVarC);
            return new l(str, jB, pVarC, (DefaultConstructorMarker) null);
        }

        @Override // c0.InterfaceC4182k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object b(InterfaceC4184m interfaceC4184m, l lVar) {
            return AbstractC3689v.o(lVar.i().toString(), Integer.valueOf(S.n(lVar.h())), Integer.valueOf(S.i(lVar.h())), p.a.C0303a.f7579a.b(interfaceC4184m, lVar.j()));
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7564a;

        static {
            int[] iArr = new int[K.c.values().length];
            try {
                iArr[K.c.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[K.c.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[K.c.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7564a = iArr;
        }
    }

    public /* synthetic */ l(String str, long j10, p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(H.b bVar, boolean z10, K.c cVar) {
        f fVar;
        h hVarL = l();
        if (this.f7558b.f().a() == 0 && S.g(hVarL.f(), this.f7558b.m())) {
            if (AbstractC6492s.d(hVarL.c(), this.f7558b.g()) && AbstractC6492s.d(hVarL.d(), this.f7558b.k())) {
                return;
            }
            t(l(), new h(this.f7558b.toString(), this.f7558b.m(), this.f7558b.g(), this.f7558b.k(), null), z10);
            return;
        }
        h hVar = new h(this.f7558b.toString(), this.f7558b.m(), this.f7558b.g(), this.f7558b.k(), null);
        if (bVar == null) {
            t(hVarL, hVar, z10);
            n(hVarL, hVar, this.f7558b.f(), cVar);
            return;
        }
        f fVar2 = new f(hVar, this.f7558b.f(), hVarL, null, 8, null);
        bVar.a(fVar2);
        boolean zX = t.x(fVar2.a(), hVar);
        boolean z11 = !zX;
        boolean zG = S.g(fVar2.e(), hVar.f());
        boolean z12 = !zG;
        if (zX && zG) {
            fVar = fVar2;
            t(hVarL, f.m(fVar2, 0L, hVar.c(), 1, null), z10);
        } else {
            fVar = fVar2;
            s(fVar, null, z11, z12);
        }
        n(hVarL, l(), fVar.c(), cVar);
    }

    private final boolean m() {
        return ((Boolean) this.f7559c.getValue()).booleanValue();
    }

    private final void n(h hVar, h hVar2, f.a aVar, K.c cVar) {
        int i10 = c.f7564a[cVar.ordinal()];
        if (i10 == 1) {
            this.f7557a.c();
        } else if (i10 == 2) {
            q.c(this.f7557a, hVar, hVar2, aVar, true);
        } else {
            if (i10 != 3) {
                return;
            }
            q.c(this.f7557a, hVar, hVar2, aVar, false);
        }
    }

    private final void p(boolean z10) {
        this.f7559c.setValue(Boolean.valueOf(z10));
    }

    private final void q(h hVar) {
        this.f7560d.setValue(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(h hVar, h hVar2, boolean z10) {
        q(hVar2);
        f();
        V.b bVar = this.f7562f;
        int iO = bVar.o();
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            int i10 = 0;
            do {
                ((a) objArrM[i10]).a(hVar, hVar2, z10);
                i10++;
            } while (i10 < iO);
        }
    }

    public final void c(a aVar) {
        this.f7562f.b(aVar);
    }

    public final void d(f fVar) {
        boolean z10 = fVar.c().a() > 0;
        boolean zG = true ^ S.g(fVar.e(), this.f7558b.m());
        if (z10) {
            this.f7557a.c();
        }
        s(fVar, null, z10, zG);
    }

    public final void f() {
        p(false);
    }

    public final I g() {
        return this.f7558b;
    }

    public final long h() {
        return l().f();
    }

    public final CharSequence i() {
        return l().g();
    }

    public final p j() {
        return this.f7557a;
    }

    public final r k() {
        return this.f7561e;
    }

    public final h l() {
        return (h) this.f7560d.getValue();
    }

    public final void o(a aVar) {
        this.f7562f.x(aVar);
    }

    public final f r() {
        g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
        androidx.compose.runtime.snapshots.g gVarD = aVar.d();
        InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
        try {
            if (m()) {
                throw new IllegalStateException("TextFieldState does not support concurrent or nested editing.");
            }
            p(true);
            return new f(l(), null, null, null, 14, null);
        } finally {
            aVar.m(gVarD, gVarF, interfaceC6835lH);
        }
    }

    public final void s(f fVar, S s10, boolean z10, boolean z11) {
        String string = this.f7558b.toString();
        h hVar = new h(string, this.f7558b.m(), this.f7558b.g(), null, 8, null);
        boolean zD = AbstractC6492s.d(s10, this.f7558b.g());
        if (z10) {
            this.f7558b = new I(fVar.toString(), fVar.e(), (DefaultConstructorMarker) null);
        } else if (z11) {
            this.f7558b.u(S.n(fVar.e()), S.i(fVar.e()));
        }
        if (s10 == null || S.h(s10.r())) {
            this.f7558b.c();
        } else {
            this.f7558b.r(S.l(s10.r()), S.k(s10.r()));
        }
        if (z10 || (!z11 && !zD)) {
            this.f7558b.c();
        }
        if (z10) {
            string = fVar.toString();
        }
        t(hVar, new h(string, this.f7558b.m(), this.f7558b.g(), null, 8, null), true);
    }

    public String toString() {
        g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
        androidx.compose.runtime.snapshots.g gVarD = aVar.d();
        InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
        try {
            return "TextFieldState(selection=" + ((Object) S.q(h())) + ", text=\"" + ((Object) i()) + "\")";
        } finally {
            aVar.m(gVarD, gVarF, interfaceC6835lH);
        }
    }

    public /* synthetic */ l(String str, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10);
    }

    private l(String str, long j10, p pVar) {
        this.f7557a = pVar;
        this.f7558b = new I(str, T.c(j10, 0, str.length()), (DefaultConstructorMarker) null);
        this.f7559c = t1.d(Boolean.FALSE, null, 2, null);
        this.f7560d = t1.d(new h(str, j10, null, null, 12, null), null, 2, null);
        this.f7561e = new r(this);
        this.f7562f = new V.b(new a[16], 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(String str, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i10 & 1) != 0 ? "" : str;
        this(str, (i10 & 2) != 0 ? T.a(str.length()) : j10, (DefaultConstructorMarker) null);
    }

    private l(String str, long j10) {
        this(str, j10, new p(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), (DefaultConstructorMarker) null);
    }
}
