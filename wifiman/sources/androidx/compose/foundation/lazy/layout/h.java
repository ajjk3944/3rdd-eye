package androidx.compose.foundation.lazy.layout;

import B.InterfaceC2455t;
import B.N;
import B.O;
import B.P;
import B.Q;
import B.r;
import E0.A0;
import E0.z0;
import Yg.J;
import Zg.AbstractC3689v;
import android.os.Trace;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.ui.layout.x;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final r f28340a;

    /* renamed from: b, reason: collision with root package name */
    private final x f28341b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f28342c;

    private final class a implements d.b, O {

        /* renamed from: a, reason: collision with root package name */
        private final int f28343a;

        /* renamed from: b, reason: collision with root package name */
        private final long f28344b;

        /* renamed from: c, reason: collision with root package name */
        private final N f28345c;

        /* renamed from: d, reason: collision with root package name */
        private x.a f28346d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f28347e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f28348f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f28349g;

        /* renamed from: h, reason: collision with root package name */
        private C1050a f28350h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f28351i;

        /* renamed from: androidx.compose.foundation.lazy.layout.h$a$a, reason: collision with other inner class name */
        private final class C1050a {

            /* renamed from: a, reason: collision with root package name */
            private final List f28353a;

            /* renamed from: b, reason: collision with root package name */
            private final List[] f28354b;

            /* renamed from: c, reason: collision with root package name */
            private int f28355c;

            /* renamed from: d, reason: collision with root package name */
            private int f28356d;

            public C1050a(List list) {
                this.f28353a = list;
                this.f28354b = new List[list.size()];
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean a(P p10) {
                if (this.f28355c >= this.f28353a.size()) {
                    return false;
                }
                if (a.this.f28348f) {
                    throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.f28355c < this.f28353a.size()) {
                    try {
                        if (this.f28354b[this.f28355c] == null) {
                            if (p10.a() <= 0) {
                                Trace.endSection();
                                return true;
                            }
                            List[] listArr = this.f28354b;
                            int i10 = this.f28355c;
                            listArr[i10] = ((d) this.f28353a.get(i10)).b();
                        }
                        List list = this.f28354b[this.f28355c];
                        AbstractC6492s.f(list);
                        while (this.f28356d < list.size()) {
                            if (((O) list.get(this.f28356d)).a(p10)) {
                                Trace.endSection();
                                return true;
                            }
                            this.f28356d++;
                        }
                        this.f28356d = 0;
                        this.f28355c++;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                J j10 = J.f24997a;
                Trace.endSection();
                return false;
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f28358a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(kotlin.jvm.internal.N n10) {
                super(1);
                this.f28358a = n10;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final z0 invoke(A0 a02) {
                AbstractC6492s.g(a02, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                d dVarD2 = ((i) a02).D2();
                kotlin.jvm.internal.N n10 = this.f28358a;
                List listR = (List) n10.f51689a;
                if (listR != null) {
                    listR.add(dVarD2);
                } else {
                    listR = AbstractC3689v.r(dVarD2);
                }
                n10.f51689a = listR;
                return z0.SkipSubtreeAndContinueTraversal;
            }
        }

        public /* synthetic */ a(h hVar, int i10, long j10, N n10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, j10, n10);
        }

        private final boolean d() {
            return this.f28346d != null;
        }

        private final boolean e() {
            if (!this.f28348f) {
                int iA = ((InterfaceC2455t) h.this.f28340a.d().invoke()).a();
                int i10 = this.f28343a;
                if (i10 >= 0 && i10 < iA) {
                    return true;
                }
            }
            return false;
        }

        private final void f() {
            if (!e()) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
            }
            if (this.f28346d != null) {
                throw new IllegalArgumentException("Request was already composed!");
            }
            InterfaceC2455t interfaceC2455t = (InterfaceC2455t) h.this.f28340a.d().invoke();
            Object objB = interfaceC2455t.b(this.f28343a);
            this.f28346d = h.this.f28341b.i(objB, h.this.f28340a.b(this.f28343a, objB, interfaceC2455t.d(this.f28343a)));
        }

        private final void g(long j10) {
            if (this.f28348f) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.f28347e) {
                throw new IllegalArgumentException("Request was already measured!");
            }
            this.f28347e = true;
            x.a aVar = this.f28346d;
            if (aVar == null) {
                throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
            }
            int iC = aVar.c();
            for (int i10 = 0; i10 < iC; i10++) {
                aVar.b(i10, j10);
            }
        }

        private final C1050a h() {
            x.a aVar = this.f28346d;
            if (aVar == null) {
                throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
            }
            kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
            aVar.a("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new b(n10));
            List list = (List) n10.f51689a;
            if (list != null) {
                return new C1050a(list);
            }
            return null;
        }

        private final boolean i(P p10, long j10) {
            long jA = p10.a();
            return (this.f28351i && jA > 0) || j10 < jA;
        }

        @Override // B.O
        public boolean a(P p10) {
            if (!e()) {
                return false;
            }
            Object objD = ((InterfaceC2455t) h.this.f28340a.d().invoke()).d(this.f28343a);
            if (!d()) {
                if (!i(p10, (objD == null || !this.f28345c.f().a(objD)) ? this.f28345c.e() : this.f28345c.f().c(objD))) {
                    return true;
                }
                N n10 = this.f28345c;
                long jNanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    f();
                    J j10 = J.f24997a;
                    Trace.endSection();
                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                    if (objD != null) {
                        n10.f().p(objD, n10.d(jNanoTime2, n10.f().e(objD, 0L)));
                    }
                    n10.f914c = n10.d(jNanoTime2, n10.e());
                } finally {
                }
            }
            if (!this.f28351i) {
                if (!this.f28349g) {
                    if (p10.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.f28350h = h();
                        this.f28349g = true;
                        J j11 = J.f24997a;
                    } finally {
                    }
                }
                C1050a c1050a = this.f28350h;
                if (c1050a != null ? c1050a.a(p10) : false) {
                    return true;
                }
            }
            if (!this.f28347e && !Y0.b.p(this.f28344b)) {
                if (!i(p10, (objD == null || !this.f28345c.h().a(objD)) ? this.f28345c.g() : this.f28345c.h().c(objD))) {
                    return true;
                }
                N n11 = this.f28345c;
                long jNanoTime3 = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:measure");
                try {
                    g(this.f28344b);
                    J j12 = J.f24997a;
                    Trace.endSection();
                    long jNanoTime4 = System.nanoTime() - jNanoTime3;
                    if (objD != null) {
                        n11.h().p(objD, n11.d(jNanoTime4, n11.h().e(objD, 0L)));
                    }
                    n11.f915d = n11.d(jNanoTime4, n11.g());
                } finally {
                }
            }
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.d.b
        public void b() {
            this.f28351i = true;
        }

        @Override // androidx.compose.foundation.lazy.layout.d.b
        public void cancel() {
            if (this.f28348f) {
                return;
            }
            this.f28348f = true;
            x.a aVar = this.f28346d;
            if (aVar != null) {
                aVar.dispose();
            }
            this.f28346d = null;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + this.f28343a + ", constraints = " + ((Object) Y0.b.q(this.f28344b)) + ", isComposed = " + d() + ", isMeasured = " + this.f28347e + ", isCanceled = " + this.f28348f + " }";
        }

        private a(int i10, long j10, N n10) {
            this.f28343a = i10;
            this.f28344b = j10;
            this.f28345c = n10;
        }
    }

    public h(r rVar, x xVar, Q q10) {
        this.f28340a = rVar;
        this.f28341b = xVar;
        this.f28342c = q10;
    }

    public final O c(int i10, long j10, N n10) {
        return new a(this, i10, j10, n10, null);
    }

    public final d.b d(int i10, long j10, N n10) {
        a aVar = new a(this, i10, j10, n10, null);
        this.f28342c.a(aVar);
        return aVar;
    }
}
