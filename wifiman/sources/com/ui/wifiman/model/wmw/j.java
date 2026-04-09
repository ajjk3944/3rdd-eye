package com.ui.wifiman.model.wmw;

import P7.c;
import T8.a;
import Yg.y;
import Yg.z;
import android.content.Context;
import com.ui.wifiman.model.wmw.WifimanWizard;
import com.ui.wifiman.model.wmw.b;
import com.ui.wifiman.model.wmw.d;
import com.ui.wmw.WMWizard;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.t;
import h9.C5969a;
import hg.InterfaceC6043c;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6466c;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import mc.InterfaceC6794a;

/* loaded from: classes4.dex */
public final class j implements WifimanWizard {

    /* renamed from: o, reason: collision with root package name */
    public static final b f44216o = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f44217a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6794a f44218b;

    /* renamed from: c, reason: collision with root package name */
    private final com.ui.wifiman.model.wmw.d f44219c;

    /* renamed from: d, reason: collision with root package name */
    private final b.d f44220d;

    /* renamed from: e, reason: collision with root package name */
    private final P7.a f44221e;

    /* renamed from: f, reason: collision with root package name */
    private final Fg.a f44222f;

    /* renamed from: g, reason: collision with root package name */
    private final Fg.a f44223g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f44224h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f44225i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f44226j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f44227k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f44228l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f44229m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC5912b f44230n;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final b.c f44231a;

        /* renamed from: b, reason: collision with root package name */
        private final b.c f44232b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f44233c;

        public a(b.c cVar, b.c cVar2, boolean z10) {
            this.f44231a = cVar;
            this.f44232b = cVar2;
            this.f44233c = z10;
        }

        public final b.c a() {
            return this.f44232b;
        }

        public final boolean b() {
            return this.f44233c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f44231a, aVar.f44231a) && AbstractC6492s.d(this.f44232b, aVar.f44232b) && this.f44233c == aVar.f44233c;
        }

        public int hashCode() {
            b.c cVar = this.f44231a;
            int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            b.c cVar2 = this.f44232b;
            return ((iHashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f44233c);
        }

        public String toString() {
            return "AdoptionStateChange(prev=" + this.f44231a + ", latest=" + this.f44232b + ", adoptionWasInProgressInPreviousStep=" + this.f44233c + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c implements InterfaceC6466c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f44234a = new c();

        c() {
        }

        @Override // kg.InterfaceC6466c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final boolean a(com.ui.wifiman.model.wmw.b prev, com.ui.wifiman.model.wmw.b current) {
            AbstractC6492s.i(prev, "prev");
            AbstractC6492s.i(current, "current");
            return ((current instanceof b.a) && (prev instanceof b.a)) ? AbstractC6492s.d(((b.a) current).a(), ((b.a) prev).a()) : AbstractC6492s.d(current, prev);
        }
    }

    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            boolean zBooleanValue = ((Boolean) sVar.a()).booleanValue();
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            com.ui.wifiman.model.wmw.b bVar = (com.ui.wifiman.model.wmw.b) objC;
            if (bVar instanceof b.C1528b) {
                gg.i iVarK0 = gg.i.K0(WifimanWizard.a.b.f44080a);
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if (!(bVar instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (zBooleanValue) {
                return j.this.y((b.a) bVar);
            }
            gg.i iVarK02 = gg.i.K0(new WifimanWizard.a.AbstractC1520a.c.b((b.a) bVar));
            AbstractC6492s.f(iVarK02);
            return iVarK02;
        }
    }

    static final class e implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.wmw.b f44237a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f44238b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ WifimanWizard.a f44239c;

            a(com.ui.wifiman.model.wmw.b bVar, j jVar, WifimanWizard.a aVar) {
                this.f44237a = bVar;
                this.f44238b = jVar;
                this.f44239c = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Boolean bonded) {
                AbstractC6492s.i(bonded, "bonded");
                return gg.i.A(gg.i.K0(new b.c.a(this.f44237a, 0.8f)), (!bonded.booleanValue() ? this.f44238b.v(((WifimanWizard.a.AbstractC1520a.C1521a) this.f44239c).b()) : AbstractC5912b.m()).c0());
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(y yVar) {
            AbstractC6492s.i(yVar, "<destruct>");
            com.ui.wifiman.model.wmw.b bVar = (com.ui.wifiman.model.wmw.b) yVar.a();
            WifimanWizard.a aVar = (WifimanWizard.a) yVar.c();
            C6556a c6556a = (C6556a) yVar.d();
            if (c6556a.b() != null) {
                Object objB = c6556a.b();
                AbstractC6492s.f(objB);
                gg.i iVarK0 = gg.i.K0(objB);
                AbstractC6492s.f(iVarK0);
                return iVarK0;
            }
            if (bVar instanceof b.C1528b) {
                gg.i iVarK02 = gg.i.K0(new b.c.d(bVar));
                AbstractC6492s.h(iVarK02, "just(...)");
                return iVarK02;
            }
            if (bVar instanceof b.a.C1526a) {
                gg.i iVarK03 = gg.i.K0(new b.c.AbstractC1530c.a(bVar));
                AbstractC6492s.h(iVarK03, "just(...)");
                return iVarK03;
            }
            if (!(bVar instanceof b.a.C1527b)) {
                throw new NoWhenBranchMatchedException();
            }
            if ((aVar instanceof WifimanWizard.a.c) || (aVar instanceof WifimanWizard.a.b) || (aVar instanceof WifimanWizard.a.AbstractC1520a.c.b)) {
                gg.i iVarK04 = gg.i.K0(new b.c.C1529b(bVar, 0.0f));
                AbstractC6492s.h(iVarK04, "just(...)");
                return iVarK04;
            }
            if (aVar instanceof WifimanWizard.a.AbstractC1520a.d) {
                gg.i iVarK05 = gg.i.K0(new b.c.C1529b(bVar, 0.1f));
                AbstractC6492s.h(iVarK05, "just(...)");
                return iVarK05;
            }
            if (aVar instanceof WifimanWizard.a.AbstractC1520a.b) {
                gg.i iVarK06 = gg.i.K0(new b.c.C1529b(bVar, 0.4f));
                AbstractC6492s.h(iVarK06, "just(...)");
                return iVarK06;
            }
            if (aVar instanceof WifimanWizard.a.AbstractC1520a.C1521a) {
                gg.i iVarW = j.this.A(((WifimanWizard.a.AbstractC1520a.C1521a) aVar).b()).w(new a(bVar, j.this, aVar));
                AbstractC6492s.f(iVarW);
                return iVarW;
            }
            if (!(aVar instanceof WifimanWizard.a.AbstractC1520a.c.C1522a)) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarK07 = gg.i.K0(new b.c.AbstractC1530c.C1531b(bVar, ((WifimanWizard.a.AbstractC1520a.c.C1522a) aVar).b()));
            AbstractC6492s.h(iVarK07, "just(...)");
            return iVarK07;
        }
    }

    static final class f implements kg.n {

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b.c f44241a;

            public a(b.c cVar) {
                this.f44241a = cVar;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    b.c cVar = this.f44241a;
                    if (cVar != null) {
                        oVar.onSuccess(cVar);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(a aVar) {
            AbstractC5912b abstractC5912bM;
            AbstractC6492s.i(aVar, "<destruct>");
            b.c cVarA = aVar.a();
            boolean zB = aVar.b();
            if (cVarA instanceof b.c.AbstractC1530c.C1531b) {
                abstractC5912bM = AbstractC5912b.p(j.this.w(), j.this.D((b.c.AbstractC1530c) cVarA));
            } else if (cVarA instanceof b.c.AbstractC1530c.a) {
                abstractC5912bM = zB ? j.this.D((b.c.AbstractC1530c) cVarA) : AbstractC5912b.m();
            } else {
                if (!(cVarA instanceof b.c.d) && !(cVarA instanceof b.c.C1529b) && !(cVarA instanceof b.c.a) && cVarA != null) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC5912bM = AbstractC5912b.m();
            }
            gg.n nVarC = gg.n.c(new a(cVarA));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bM.i(nVarC);
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f44242a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yg.s apply(com.ui.wifiman.model.wmw.b adoption) {
            AbstractC6492s.i(adoption, "adoption");
            if ((adoption instanceof b.C1528b) || (adoption instanceof b.a.C1526a)) {
                return z.a(Boolean.FALSE, adoption);
            }
            if (adoption instanceof b.a.C1527b) {
                return z.a(Boolean.TRUE, adoption);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f44243a = new h();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.wmw.b f44244a;

            a(com.ui.wifiman.model.wmw.b bVar) {
                this.f44244a = bVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Long it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(new b.c.AbstractC1530c.C1531b(this.f44244a, WifimanWizard.Error.AdoptionTimeout.f44063a));
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            boolean zBooleanValue = ((Boolean) sVar.a()).booleanValue();
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            com.ui.wifiman.model.wmw.b bVar = (com.ui.wifiman.model.wmw.b) objC;
            if (zBooleanValue) {
                gg.i iVarZ1 = gg.i.d2(25000L, TimeUnit.MILLISECONDS).N0(new a(bVar)).z1(new C6556a(null));
                AbstractC6492s.f(iVarZ1);
                return iVarZ1;
            }
            gg.i iVarK0 = gg.i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class i implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final i f44245a = new i();

        i() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a apply(a aVar, b.c current) {
            boolean z10;
            AbstractC6492s.i(aVar, "<destruct>");
            AbstractC6492s.i(current, "current");
            b.c cVarA = aVar.a();
            if ((cVarA instanceof b.c.C1529b) || (cVarA instanceof b.c.a)) {
                z10 = true;
            } else {
                if (!(cVarA instanceof b.c.d) && !(cVarA instanceof b.c.AbstractC1530c) && cVarA != null) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            return new a(cVarA, current, z10);
        }
    }

    /* renamed from: com.ui.wifiman.model.wmw.j$j, reason: collision with other inner class name */
    static final class C1541j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wmw.g f44246a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f44247b;

        C1541j(com.ui.wmw.g gVar, j jVar) {
            this.f44246a = gVar;
            this.f44247b = jVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(com.ui.wifiman.model.wmw.b adoption) {
            AbstractC6492s.i(adoption, "adoption");
            if (!(adoption instanceof b.a)) {
                if (adoption instanceof b.C1528b) {
                    return AbstractC5912b.D(new WifimanWizard.Error.NoDeviceAdopted("There is no adoption currently set so device can't be bonded"));
                }
                throw new NoWhenBranchMatchedException();
            }
            b.a aVar = (b.a) adoption;
            return this.f44246a.c().d(aVar.b()).g(this.f44247b.f44220d.b(new b.a.C1526a(aVar.b(), aVar.a())));
        }
    }

    public static final class k implements InterfaceC5915e {
        public k() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                j.this.f44223g.h(new C6556a(null));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class l implements kg.n {

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final a f44250a = new a();

            a() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                Z7.b.h("WMW Clearing Unbonded Device", null, 2, null);
            }
        }

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(com.ui.wifiman.model.wmw.b adoption) {
            AbstractC6492s.i(adoption, "adoption");
            if (adoption instanceof b.a.C1527b) {
                return j.this.f44220d.b(b.C1528b.f44090a).B(a.f44250a);
            }
            if ((adoption instanceof b.a.C1526a) || (adoption instanceof b.C1528b)) {
                return AbstractC5912b.m();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f44251a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(WMWizard.a it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.a f44252a;

        n(b.a aVar) {
            this.f44252a = aVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Set it) {
            Object next;
            AbstractC6492s.i(it, "it");
            b.a aVar = this.f44252a;
            Iterator it2 = it.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (AbstractC6492s.d(((d.a) next).b(), aVar.a())) {
                    break;
                }
            }
            return new C6556a(next);
        }
    }

    static final class o implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.a f44253a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f44254b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f44255a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d.a f44256b;

            a(j jVar, d.a aVar) {
                this.f44255a = jVar;
                this.f44256b = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Long it) {
                AbstractC6492s.i(it, "it");
                return this.f44255a.x(this.f44256b.b(), this.f44256b.a());
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f44257a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b.a f44258b;

            b(j jVar, b.a aVar) {
                this.f44257a = jVar;
                this.f44258b = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WifimanWizard.a.AbstractC1520a apply(WMWizard.a.AbstractC1657a it) {
                AbstractC6492s.i(it, "it");
                return this.f44257a.u(it, this.f44258b);
            }
        }

        o(b.a aVar, j jVar) {
            this.f44253a = aVar;
            this.f44254b = jVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            d.a aVar = (d.a) c6556a.a();
            if (aVar == null) {
                gg.i iVarK0 = gg.i.K0(new WifimanWizard.a.AbstractC1520a.d(this.f44253a));
                AbstractC6492s.f(iVarK0);
                return iVarK0;
            }
            gg.i iVarA = gg.i.A(gg.i.K0(new WifimanWizard.a.AbstractC1520a.b(this.f44253a, 0.0f)), gg.i.d2(500L, TimeUnit.MILLISECONDS).p0(new a(this.f44254b, aVar)).N0(new b(this.f44254b, this.f44253a)));
            AbstractC6492s.f(iVarA);
            return iVarA;
        }
    }

    static final class p implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.a f44259a;

        p(b.a aVar) {
            this.f44259a = aVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof WMWizard.Error)) {
                return gg.i.k0(error);
            }
            Z7.b.j("WMW bonded connection disconnected because of an error", error, null, 4, null);
            return gg.i.K0(new WifimanWizard.a.AbstractC1520a.c.C1522a(this.f44259a, new WifimanWizard.Error.Connection("Wizard connection failed", error)));
        }
    }

    static final class q implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final q f44260a = new q();

        q() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.R(1000L, TimeUnit.MILLISECONDS);
        }
    }

    static final class r implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final r f44261a = new r();

        r() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Object objA = sVar.a();
            AbstractC6492s.h(objA, "component1(...)");
            com.ui.wifiman.model.wmw.b bVar = (com.ui.wifiman.model.wmw.b) objA;
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            Of.a aVar = (Of.a) objC;
            boolean z10 = false;
            if ((bVar instanceof b.a.C1526a) && AbstractC6492s.d(((b.a.C1526a) bVar).b(), aVar.a())) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class s implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.c.AbstractC1530c f44263b;

        public s(b.c.AbstractC1530c abstractC1530c) {
            this.f44263b = abstractC1530c;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                j.this.f44223g.h(new C6556a(this.f44263b));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class t implements kg.n {
        t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(a.d btleState) {
            AbstractC6492s.i(btleState, "btleState");
            if (btleState instanceof a.d.C0785a) {
                gg.i iVarK0 = gg.i.K0(WifimanWizard.a.c.C1523a.f44081a);
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if (btleState instanceof a.d.C0786d) {
                gg.i iVarK02 = gg.i.K0(WifimanWizard.a.c.d.f44084a);
                AbstractC6492s.h(iVarK02, "just(...)");
                return iVarK02;
            }
            if (btleState instanceof a.d.c) {
                gg.i iVarK03 = gg.i.K0(WifimanWizard.a.c.C1524c.f44083a);
                AbstractC6492s.h(iVarK03, "just(...)");
                return iVarK03;
            }
            if (btleState instanceof a.d.b) {
                gg.i iVarK04 = gg.i.K0(WifimanWizard.a.c.b.f44082a);
                AbstractC6492s.h(iVarK04, "just(...)");
                return iVarK04;
            }
            if (btleState instanceof a.d.e) {
                return j.this.f44226j;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class u implements kg.n {
        u() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(WifimanWizard.a state) {
            AbstractC6492s.i(state, "state");
            if (state instanceof WifimanWizard.a.AbstractC1520a.C1521a) {
                gg.i iVarU0 = gg.i.K0(state).U0(j.this.f44221e.d(new c.q.a()));
                AbstractC6492s.h(iVarU0, "mergeWith(...)");
                return iVarU0;
            }
            gg.i iVarK0 = gg.i.K0(state);
            AbstractC6492s.h(iVarK0, "just(...)");
            return iVarK0;
        }
    }

    static final class v implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final v f44266a = new v();

        v() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("WMW Bonded connection processor SUBSCRIBED", null, 2, null);
        }
    }

    public j(Context context, InterfaceC6794a androidInfo, com.ui.wifiman.model.wmw.d discovery, b.d adoptionManager, P7.a analytics, T8.a btle) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(androidInfo, "androidInfo");
        AbstractC6492s.i(discovery, "discovery");
        AbstractC6492s.i(adoptionManager, "adoptionManager");
        AbstractC6492s.i(analytics, "analytics");
        AbstractC6492s.i(btle, "btle");
        this.f44217a = context;
        this.f44218b = androidInfo;
        this.f44219c = discovery;
        this.f44220d = adoptionManager;
        this.f44221e = analytics;
        Fg.a aVarK2 = Fg.a.k2(Boolean.FALSE);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f44222f = aVarK2;
        Fg.a aVarK22 = Fg.a.k2(new C6556a(null));
        AbstractC6492s.h(aVarK22, "createDefault(...)");
        this.f44223g = aVarK22;
        gg.i iVarY0 = aVarK2.W().e1().Y0(Gg.a.a(), false, 1);
        AbstractC6492s.h(iVarY0, "observeOn(...)");
        this.f44224h = iVarY0;
        gg.i iVarI2 = aVarK22.W().e1().X0(Gg.a.a()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f44225i = iVarI2;
        Ag.c cVar = Ag.c.f753a;
        gg.i iVarX = adoptionManager.a().X(c.f44234a);
        AbstractC6492s.h(iVarX, "distinctUntilChanged(...)");
        gg.i iVarI1 = cVar.a(iVarY0, iVarX).I1(new d());
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        this.f44226j = iVarI1;
        gg.i iVarI22 = btle.getState().I1(new t()).e1().X0(Gg.a.a()).p0(new u()).g0(v.f44266a).Z(new InterfaceC6464a() { // from class: qe.l
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.wmw.j.E();
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f44227k = iVarI22;
        gg.i iVarW = adoptionManager.a().N0(g.f44242a).W().I1(h.f44243a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f44228l = iVarW;
        gg.i iVarW2 = cVar.b(adoptionManager.a(), getState(), iVarW).I1(new e()).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        gg.i iVarI23 = t(iVarW2).I(new f()).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f44229m = iVarI23;
        AbstractC5912b abstractC5912bF0 = gg.s.o(new gg.u() { // from class: qe.m
            @Override // gg.u
            public final void a(t tVar) {
                com.ui.wifiman.model.wmw.j.B(this.f58657a, tVar);
            }
        }).l0(AbstractC5912b.p(getState().E0(), d().E0())).x0(1).l1().f0();
        AbstractC6492s.h(abstractC5912bF0, "ignoreElements(...)");
        this.f44230n = abstractC5912bF0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.z A(com.ui.wmw.g gVar) {
        Ag.e eVar = Ag.e.f756a;
        gg.z zVarO0 = this.f44220d.a().o0();
        AbstractC6492s.h(zVarO0, "firstOrError(...)");
        gg.z zVarO02 = gVar.c().c().o0();
        AbstractC6492s.h(zVarO02, "firstOrError(...)");
        gg.z zVarA = eVar.a(zVarO0, zVarO02).A(r.f44261a);
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(final j jVar, gg.t it) {
        AbstractC6492s.i(it, "it");
        Z7.b.h("WMW Bonded Connection Enabled", null, 2, null);
        jVar.f44222f.h(Boolean.TRUE);
        it.d(new InterfaceC6468e() { // from class: qe.n
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                com.ui.wifiman.model.wmw.j.C(this.f58658a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(j jVar) {
        Z7.b.h("WMW Bonded Connection Disabled", null, 2, null);
        jVar.f44222f.h(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b D(b.c.AbstractC1530c abstractC1530c) {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new s(abstractC1530c));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E() {
        Z7.b.h("WMW Bonded connection processor FINISHED", null, 2, null);
    }

    private final gg.i t(gg.i iVar) {
        gg.i iVarQ1 = iVar.q1(new a(null, null, false), i.f44245a);
        AbstractC6492s.h(iVarQ1, "scan(...)");
        return iVarQ1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WifimanWizard.a.AbstractC1520a u(WMWizard.a.AbstractC1657a abstractC1657a, b.a aVar) {
        if (!(abstractC1657a instanceof WMWizard.a.AbstractC1657a.b)) {
            if (abstractC1657a instanceof WMWizard.a.AbstractC1657a.AbstractC1658a) {
                return new WifimanWizard.a.AbstractC1520a.C1521a(aVar, System.currentTimeMillis(), ((WMWizard.a.AbstractC1657a.AbstractC1658a) abstractC1657a).a());
            }
            throw new NoWhenBranchMatchedException();
        }
        WMWizard.a.AbstractC1657a.b bVar = (WMWizard.a.AbstractC1657a.b) abstractC1657a;
        if (bVar instanceof WMWizard.a.AbstractC1657a.b.C1660a) {
            return new WifimanWizard.a.AbstractC1520a.b(aVar, 0.3f);
        }
        if (bVar instanceof WMWizard.a.AbstractC1657a.b.C1661b) {
            return new WifimanWizard.a.AbstractC1520a.b(aVar, 0.5f);
        }
        if (bVar instanceof WMWizard.a.AbstractC1657a.b.c) {
            return new WifimanWizard.a.AbstractC1520a.b(aVar, 0.8f);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b v(com.ui.wmw.g gVar) {
        AbstractC5912b abstractC5912bT = this.f44220d.a().o0().t(new C1541j(gVar, this));
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b w() {
        AbstractC5912b abstractC5912bT = this.f44220d.a().o0().t(new l());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i x(C5969a c5969a, C5969a c5969a2) {
        gg.i iVarW = WMWizard.f45247a.c(this.f44217a, c5969a, c5969a2).w(m.f44251a);
        AbstractC6492s.h(iVarW, "flatMapPublisher(...)");
        return iVarW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i y(b.a aVar) {
        gg.i iVarN1 = this.f44219c.a().o0().A(new n(aVar)).w(new o(aVar, this)).f1(new p(aVar)).n1(q.f44260a);
        AbstractC6492s.h(iVarN1, "repeatWhen(...)");
        return iVarN1;
    }

    private final String z() {
        return "WiFiman Wizard";
    }

    @Override // com.ui.wifiman.model.wmw.WifimanWizard
    public AbstractC5912b a() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new k());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bW = abstractC5912bR.W(Gg.a.a());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }

    @Override // com.ui.wifiman.model.wmw.WifimanWizard
    public AbstractC5912b b(C5969a c5969a) {
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(a(), c5969a == null ? this.f44220d.b(b.C1528b.f44090a) : this.f44220d.b(new b.a.C1527b(z(), c5969a)));
        AbstractC6492s.h(abstractC5912bP, "concatArray(...)");
        return abstractC5912bP;
    }

    @Override // com.ui.wifiman.model.wmw.WifimanWizard
    public AbstractC5912b c() {
        return this.f44230n;
    }

    @Override // com.ui.wifiman.model.wmw.WifimanWizard
    public gg.i d() {
        return this.f44229m;
    }

    @Override // com.ui.wifiman.model.wmw.WifimanWizard
    public gg.i e() {
        return this.f44225i;
    }

    @Override // com.ui.wifiman.model.wmw.WifimanWizard
    public gg.i getState() {
        return this.f44227k;
    }
}
