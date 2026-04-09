package f2;

import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.N;
import Li.P;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.C3681m;
import Zg.U;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4015m;
import androidx.lifecycle.InterfaceC4016n;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.Q;
import c.AbstractC4137F;
import f2.AbstractC5498D;
import f2.C5512k;
import f2.o;
import f2.r;
import f2.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC6477c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.V;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: H, reason: collision with root package name */
    public static final a f46755H = new a(null);

    /* renamed from: I, reason: collision with root package name */
    private static boolean f46756I = true;

    /* renamed from: A, reason: collision with root package name */
    private InterfaceC6835l f46757A;

    /* renamed from: B, reason: collision with root package name */
    private final Map f46758B;

    /* renamed from: C, reason: collision with root package name */
    private int f46759C;

    /* renamed from: D, reason: collision with root package name */
    private final List f46760D;

    /* renamed from: E, reason: collision with root package name */
    private final Yg.m f46761E;

    /* renamed from: F, reason: collision with root package name */
    private final Li.y f46762F;

    /* renamed from: G, reason: collision with root package name */
    private final InterfaceC3220g f46763G;

    /* renamed from: a, reason: collision with root package name */
    private final Context f46764a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f46765b;

    /* renamed from: c, reason: collision with root package name */
    private x f46766c;

    /* renamed from: d, reason: collision with root package name */
    private t f46767d;

    /* renamed from: e, reason: collision with root package name */
    private Bundle f46768e;

    /* renamed from: f, reason: collision with root package name */
    private Parcelable[] f46769f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f46770g;

    /* renamed from: h, reason: collision with root package name */
    private final C3681m f46771h;

    /* renamed from: i, reason: collision with root package name */
    private final Li.z f46772i;

    /* renamed from: j, reason: collision with root package name */
    private final N f46773j;

    /* renamed from: k, reason: collision with root package name */
    private final Li.z f46774k;

    /* renamed from: l, reason: collision with root package name */
    private final N f46775l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f46776m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f46777n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f46778o;

    /* renamed from: p, reason: collision with root package name */
    private final Map f46779p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC4017o f46780q;

    /* renamed from: r, reason: collision with root package name */
    private f2.o f46781r;

    /* renamed from: s, reason: collision with root package name */
    private final CopyOnWriteArrayList f46782s;

    /* renamed from: t, reason: collision with root package name */
    private AbstractC4013k.b f46783t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC4016n f46784u;

    /* renamed from: v, reason: collision with root package name */
    private final AbstractC4137F f46785v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f46786w;

    /* renamed from: x, reason: collision with root package name */
    private C5499E f46787x;

    /* renamed from: y, reason: collision with root package name */
    private final Map f46788y;

    /* renamed from: z, reason: collision with root package name */
    private InterfaceC6835l f46789z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b extends AbstractC5500F {

        /* renamed from: g, reason: collision with root package name */
        private final AbstractC5498D f46790g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ n f46791h;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5512k f46793b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f46794c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5512k c5512k, boolean z10) {
                super(0);
                this.f46793b = c5512k;
                this.f46794c = z10;
            }

            public final void a() {
                b.super.g(this.f46793b, this.f46794c);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        public b(n nVar, AbstractC5498D navigator) {
            AbstractC6492s.i(navigator, "navigator");
            this.f46791h = nVar;
            this.f46790g = navigator;
        }

        @Override // f2.AbstractC5500F
        public C5512k a(r destination, Bundle bundle) {
            AbstractC6492s.i(destination, "destination");
            return C5512k.a.b(C5512k.f46731o, this.f46791h.E(), destination, bundle, this.f46791h.J(), this.f46791h.f46781r, null, null, 96, null);
        }

        @Override // f2.AbstractC5500F
        public void e(C5512k entry) {
            f2.o oVar;
            AbstractC6492s.i(entry, "entry");
            boolean zD = AbstractC6492s.d(this.f46791h.f46758B.get(entry), Boolean.TRUE);
            super.e(entry);
            this.f46791h.f46758B.remove(entry);
            if (this.f46791h.f46771h.contains(entry)) {
                if (d()) {
                    return;
                }
                this.f46791h.v0();
                this.f46791h.f46772i.j(AbstractC3689v.l1(this.f46791h.f46771h));
                this.f46791h.f46774k.j(this.f46791h.m0());
                return;
            }
            this.f46791h.u0(entry);
            if (entry.O().b().isAtLeast(AbstractC4013k.b.CREATED)) {
                entry.p(AbstractC4013k.b.DESTROYED);
            }
            C3681m c3681m = this.f46791h.f46771h;
            if (c3681m == null || !c3681m.isEmpty()) {
                Iterator<E> it = c3681m.iterator();
                while (it.hasNext()) {
                    if (AbstractC6492s.d(((C5512k) it.next()).i(), entry.i())) {
                        break;
                    }
                }
                if (!zD && (oVar = this.f46791h.f46781r) != null) {
                    oVar.Y(entry.i());
                }
            } else if (!zD) {
                oVar.Y(entry.i());
            }
            this.f46791h.v0();
            this.f46791h.f46774k.j(this.f46791h.m0());
        }

        @Override // f2.AbstractC5500F
        public void g(C5512k popUpTo, boolean z10) throws Resources.NotFoundException {
            AbstractC6492s.i(popUpTo, "popUpTo");
            AbstractC5498D abstractC5498DE = this.f46791h.f46787x.e(popUpTo.f().u());
            this.f46791h.f46758B.put(popUpTo, Boolean.valueOf(z10));
            if (!AbstractC6492s.d(abstractC5498DE, this.f46790g)) {
                Object obj = this.f46791h.f46788y.get(abstractC5498DE);
                AbstractC6492s.f(obj);
                ((b) obj).g(popUpTo, z10);
            } else {
                InterfaceC6835l interfaceC6835l = this.f46791h.f46757A;
                if (interfaceC6835l == null) {
                    this.f46791h.e0(popUpTo, new a(popUpTo, z10));
                } else {
                    interfaceC6835l.invoke(popUpTo);
                    super.g(popUpTo, z10);
                }
            }
        }

        @Override // f2.AbstractC5500F
        public void h(C5512k popUpTo, boolean z10) {
            AbstractC6492s.i(popUpTo, "popUpTo");
            super.h(popUpTo, z10);
        }

        @Override // f2.AbstractC5500F
        public void i(C5512k entry) {
            AbstractC6492s.i(entry, "entry");
            super.i(entry);
            if (!this.f46791h.f46771h.contains(entry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            entry.p(AbstractC4013k.b.STARTED);
        }

        @Override // f2.AbstractC5500F
        public void j(C5512k backStackEntry) {
            AbstractC6492s.i(backStackEntry, "backStackEntry");
            AbstractC5498D abstractC5498DE = this.f46791h.f46787x.e(backStackEntry.f().u());
            if (!AbstractC6492s.d(abstractC5498DE, this.f46790g)) {
                Object obj = this.f46791h.f46788y.get(abstractC5498DE);
                if (obj != null) {
                    ((b) obj).j(backStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.f().u() + " should already be created").toString());
            }
            InterfaceC6835l interfaceC6835l = this.f46791h.f46789z;
            if (interfaceC6835l != null) {
                interfaceC6835l.invoke(backStackEntry);
                n(backStackEntry);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + backStackEntry.f() + " outside of the call to navigate(). ");
        }

        public final void n(C5512k backStackEntry) {
            AbstractC6492s.i(backStackEntry, "backStackEntry");
            super.j(backStackEntry);
        }
    }

    public interface c {
        void a(n nVar, r rVar, Bundle bundle);
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final d f46795a = new d();

        d() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f46796a = new e();

        e() {
            super(1);
        }

        public final void a(z navOptions) {
            AbstractC6492s.i(navOptions, "$this$navOptions");
            navOptions.j(true);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z) obj);
            return J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f46797a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f46798b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f46799c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f46800d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3681m f46801e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(kotlin.jvm.internal.J j10, kotlin.jvm.internal.J j11, n nVar, boolean z10, C3681m c3681m) {
            super(1);
            this.f46797a = j10;
            this.f46798b = j11;
            this.f46799c = nVar;
            this.f46800d = z10;
            this.f46801e = c3681m;
        }

        public final void a(C5512k entry) {
            AbstractC6492s.i(entry, "entry");
            this.f46797a.f51685a = true;
            this.f46798b.f51685a = true;
            this.f46799c.k0(entry, this.f46800d, this.f46801e);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5512k) obj);
            return J.f24997a;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final g f46802a = new g();

        g() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke(r destination) {
            AbstractC6492s.i(destination, "destination");
            t tVarV = destination.v();
            if (tVarV == null || tVarV.V() != destination.s()) {
                return null;
            }
            return destination.v();
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {
        h() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(r destination) {
            AbstractC6492s.i(destination, "destination");
            return Boolean.valueOf(!n.this.f46778o.containsKey(Integer.valueOf(destination.s())));
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final i f46804a = new i();

        i() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke(r destination) {
            AbstractC6492s.i(destination, "destination");
            t tVarV = destination.v();
            if (tVarV == null || tVarV.V() != destination.s()) {
                return null;
            }
            return destination.v();
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6835l {
        j() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(r destination) {
            AbstractC6492s.i(destination, "destination");
            return Boolean.valueOf(!n.this.f46778o.containsKey(Integer.valueOf(destination.s())));
        }
    }

    static final class k extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f46806a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f46807b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L f46808c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n f46809d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Bundle f46810e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(kotlin.jvm.internal.J j10, List list, L l10, n nVar, Bundle bundle) {
            super(1);
            this.f46806a = j10;
            this.f46807b = list;
            this.f46808c = l10;
            this.f46809d = nVar;
            this.f46810e = bundle;
        }

        public final void a(C5512k entry) {
            List listL;
            AbstractC6492s.i(entry, "entry");
            this.f46806a.f51685a = true;
            int iIndexOf = this.f46807b.indexOf(entry);
            if (iIndexOf != -1) {
                int i10 = iIndexOf + 1;
                listL = this.f46807b.subList(this.f46808c.f51687a, i10);
                this.f46808c.f51687a = i10;
            } else {
                listL = AbstractC3689v.l();
            }
            this.f46809d.p(entry.f(), this.f46810e, entry, listL);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5512k) obj);
            return J.f24997a;
        }
    }

    static final class l extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f46811a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f46812b;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f46813a = new a();

            a() {
                super(1);
            }

            public final void a(C5503b anim) {
                AbstractC6492s.i(anim, "$this$anim");
                anim.e(0);
                anim.f(0);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5503b) obj);
                return J.f24997a;
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f46814a = new b();

            b() {
                super(1);
            }

            public final void a(C5501G popUpTo) {
                AbstractC6492s.i(popUpTo, "$this$popUpTo");
                popUpTo.d(true);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5501G) obj);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(r rVar, n nVar) {
            super(1);
            this.f46811a = rVar;
            this.f46812b = nVar;
        }

        public final void a(z navOptions) {
            AbstractC6492s.i(navOptions, "$this$navOptions");
            navOptions.a(a.f46813a);
            r rVar = this.f46811a;
            if (rVar instanceof t) {
                InterfaceC8780j<r> interfaceC8780jC = r.f46869k.c(rVar);
                n nVar = this.f46812b;
                for (r rVar2 : interfaceC8780jC) {
                    r rVarG = nVar.G();
                    if (AbstractC6492s.d(rVar2, rVarG != null ? rVarG.v() : null)) {
                        return;
                    }
                }
                if (n.f46756I) {
                    navOptions.c(t.f46899q.b(this.f46812b.I()).s(), b.f46814a);
                }
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z) obj);
            return J.f24997a;
        }
    }

    static final class m extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final m f46815a = new m();

        m() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(r it) {
            AbstractC6492s.i(it, "it");
            return Integer.valueOf(it.s());
        }
    }

    /* renamed from: f2.n$n, reason: collision with other inner class name */
    static final class C1754n extends AbstractC6494u implements InterfaceC6824a {
        C1754n() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x invoke() {
            x xVar = n.this.f46766c;
            return xVar == null ? new x(n.this.E(), n.this.f46787x) : xVar;
        }
    }

    static final class o extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f46817a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f46818b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f46819c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bundle f46820d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(kotlin.jvm.internal.J j10, n nVar, r rVar, Bundle bundle) {
            super(1);
            this.f46817a = j10;
            this.f46818b = nVar;
            this.f46819c = rVar;
            this.f46820d = bundle;
        }

        public final void a(C5512k it) {
            AbstractC6492s.i(it, "it");
            this.f46817a.f51685a = true;
            n.q(this.f46818b, this.f46819c, this.f46820d, it, null, 8, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5512k) obj);
            return J.f24997a;
        }
    }

    public static final class p extends AbstractC4137F {
        p() {
            super(false);
        }

        @Override // c.AbstractC4137F
        public void d() {
            n.this.Z();
        }
    }

    static final class q extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f46822a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str) {
            super(1);
            this.f46822a = str;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(AbstractC6492s.d(str, this.f46822a));
        }
    }

    public n(Context context) {
        Object next;
        AbstractC6492s.i(context, "context");
        this.f46764a = context;
        Iterator it = AbstractC8783m.n(context, d.f46795a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f46765b = (Activity) next;
        this.f46771h = new C3681m();
        Li.z zVarA = P.a(AbstractC3689v.l());
        this.f46772i = zVarA;
        this.f46773j = AbstractC3222i.b(zVarA);
        Li.z zVarA2 = P.a(AbstractC3689v.l());
        this.f46774k = zVarA2;
        this.f46775l = AbstractC3222i.b(zVarA2);
        this.f46776m = new LinkedHashMap();
        this.f46777n = new LinkedHashMap();
        this.f46778o = new LinkedHashMap();
        this.f46779p = new LinkedHashMap();
        this.f46782s = new CopyOnWriteArrayList();
        this.f46783t = AbstractC4013k.b.INITIALIZED;
        this.f46784u = new InterfaceC4015m() { // from class: f2.m
            @Override // androidx.lifecycle.InterfaceC4015m
            public final void j(InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar) {
                n.R(this.f46754a, interfaceC4017o, aVar);
            }
        };
        this.f46785v = new p();
        this.f46786w = true;
        this.f46787x = new C5499E();
        this.f46788y = new LinkedHashMap();
        this.f46758B = new LinkedHashMap();
        C5499E c5499e = this.f46787x;
        c5499e.b(new v(c5499e));
        this.f46787x.b(new C5502a(this.f46764a));
        this.f46760D = new ArrayList();
        this.f46761E = Yg.n.b(new C1754n());
        Li.y yVarB = Li.F.b(1, 0, Ki.a.DROP_OLDEST, 2, null);
        this.f46762F = yVarB;
        this.f46763G = AbstractC3222i.a(yVarB);
    }

    public static /* synthetic */ r A(n nVar, r rVar, int i10, boolean z10, r rVar2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        }
        if ((i11 & 4) != 0) {
            rVar2 = null;
        }
        return nVar.z(rVar, i10, z10, rVar2);
    }

    private final String B(int[] iArr) {
        t tVar;
        t tVar2 = this.f46767d;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            r rVarN = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = iArr[i10];
            if (i10 == 0) {
                t tVar3 = this.f46767d;
                AbstractC6492s.f(tVar3);
                if (tVar3.s() == i11) {
                    rVarN = this.f46767d;
                }
            } else {
                AbstractC6492s.f(tVar2);
                rVarN = tVar2.N(i11);
            }
            if (rVarN == null) {
                return r.f46869k.b(this.f46764a, i11);
            }
            if (i10 != iArr.length - 1 && (rVarN instanceof t)) {
                while (true) {
                    tVar = (t) rVarN;
                    AbstractC6492s.f(tVar);
                    if (!(tVar.N(tVar.V()) instanceof t)) {
                        break;
                    }
                    rVarN = tVar.N(tVar.V());
                }
                tVar2 = tVar;
            }
            i10++;
        }
    }

    private final String C(Object obj) {
        r rVarA = A(this, I(), h2.c.b(Vi.w.d(O.b(obj.getClass()))), true, null, 4, null);
        if (rVarA == null) {
            throw new IllegalArgumentException(("Destination with route " + O.b(obj.getClass()).v() + " cannot be found in navigation graph " + this.f46767d).toString());
        }
        Map mapK = rVarA.k();
        LinkedHashMap linkedHashMap = new LinkedHashMap(U.d(mapK.size()));
        for (Map.Entry entry : mapK.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C5509h) entry.getValue()).a());
        }
        return h2.c.c(obj, linkedHashMap);
    }

    private final int H() {
        C3681m c3681m = this.f46771h;
        int i10 = 0;
        if (c3681m == null || !c3681m.isEmpty()) {
            Iterator<E> it = c3681m.iterator();
            while (it.hasNext()) {
                if (!(((C5512k) it.next()).f() instanceof t) && (i10 = i10 + 1) < 0) {
                    AbstractC3689v.u();
                }
            }
        }
        return i10;
    }

    private final t M(C3681m c3681m) {
        r rVarF;
        C5512k c5512k = (C5512k) c3681m.T();
        if (c5512k == null || (rVarF = c5512k.f()) == null) {
            rVarF = this.f46767d;
            AbstractC6492s.f(rVarF);
        }
        if (rVarF instanceof t) {
            return (t) rVarF;
        }
        t tVarV = rVarF.v();
        AbstractC6492s.f(tVarV);
        return tVarV;
    }

    private final List P(C3681m c3681m) throws Resources.NotFoundException {
        r rVarI;
        ArrayList arrayList = new ArrayList();
        C5512k c5512k = (C5512k) this.f46771h.T();
        if (c5512k == null || (rVarI = c5512k.f()) == null) {
            rVarI = I();
        }
        if (c3681m != null) {
            Iterator<E> it = c3681m.iterator();
            while (it.hasNext()) {
                C5513l c5513l = (C5513l) it.next();
                r rVarA = A(this, rVarI, c5513l.a(), true, null, 4, null);
                if (rVarA == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + r.f46869k.b(this.f46764a, c5513l.a()) + " cannot be found from the current destination " + rVarI).toString());
                }
                arrayList.add(c5513l.c(this.f46764a, rVarA, J(), this.f46781r));
                rVarI = rVarA;
            }
        }
        return arrayList;
    }

    private final boolean Q(r rVar, Bundle bundle) {
        int iNextIndex;
        r rVarF;
        C5512k c5512kF = F();
        C3681m c3681m = this.f46771h;
        ListIterator<E> listIterator = c3681m.listIterator(c3681m.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((C5512k) listIterator.previous()).f() == rVar) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        if (rVar instanceof t) {
            List listZ = AbstractC8783m.Z(AbstractC8783m.N(t.f46899q.a((t) rVar), m.f46815a));
            if (this.f46771h.size() - iNextIndex != listZ.size()) {
                return false;
            }
            C3681m c3681m2 = this.f46771h;
            List listSubList = c3681m2.subList(iNextIndex, c3681m2.size());
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(listSubList, 10));
            Iterator it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C5512k) it.next()).f().s()));
            }
            if (!AbstractC6492s.d(arrayList, listZ)) {
                return false;
            }
        } else if (c5512kF == null || (rVarF = c5512kF.f()) == null || rVar.s() != rVarF.s()) {
            return false;
        }
        C3681m<C5512k> c3681m3 = new C3681m();
        while (AbstractC3689v.n(this.f46771h) >= iNextIndex) {
            C5512k c5512k = (C5512k) AbstractC3689v.N(this.f46771h);
            u0(c5512k);
            c3681m3.addFirst(new C5512k(c5512k, c5512k.f().g(bundle)));
        }
        for (C5512k c5512k2 : c3681m3) {
            t tVarV = c5512k2.f().v();
            if (tVarV != null) {
                S(c5512k2, D(tVarV.s()));
            }
            this.f46771h.add(c5512k2);
        }
        for (C5512k c5512k3 : c3681m3) {
            this.f46787x.e(c5512k3.f().u()).g(c5512k3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(n this$0, InterfaceC4017o interfaceC4017o, AbstractC4013k.a event) {
        AbstractC6492s.i(this$0, "this$0");
        AbstractC6492s.i(interfaceC4017o, "<anonymous parameter 0>");
        AbstractC6492s.i(event, "event");
        this$0.f46783t = event.getTargetState();
        if (this$0.f46767d != null) {
            Iterator it = AbstractC3689v.l1(this$0.f46771h).iterator();
            while (it.hasNext()) {
                ((C5512k) it.next()).l(event);
            }
        }
    }

    private final void S(C5512k c5512k, C5512k c5512k2) {
        this.f46776m.put(c5512k, c5512k2);
        if (this.f46777n.get(c5512k2) == null) {
            this.f46777n.put(c5512k2, new AtomicInteger(0));
        }
        Object obj = this.f46777n.get(c5512k2);
        AbstractC6492s.f(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    private final void T(r rVar, Bundle bundle, y yVar, AbstractC5498D.a aVar) throws Resources.NotFoundException {
        boolean z10;
        boolean z11;
        boolean zG0;
        Iterator it = this.f46788y.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).l(true);
        }
        kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
        if (yVar == null) {
            z10 = false;
        } else {
            if (yVar.f() != null) {
                String strF = yVar.f();
                AbstractC6492s.f(strF);
                zG0 = i0(strF, yVar.i(), yVar.k());
            } else if (yVar.g() != null) {
                th.d dVarG = yVar.g();
                AbstractC6492s.f(dVarG);
                zG0 = g0(h2.c.b(Vi.w.d(dVarG)), yVar.i(), yVar.k());
            } else if (yVar.h() != null) {
                Object objH = yVar.h();
                AbstractC6492s.f(objH);
                zG0 = h0(objH, yVar.i(), yVar.k());
            } else {
                if (yVar.e() != -1) {
                    zG0 = g0(yVar.e(), yVar.i(), yVar.k());
                }
                z10 = false;
            }
            z10 = zG0;
        }
        Bundle bundleG = rVar.g(bundle);
        if (yVar != null && yVar.l() && this.f46778o.containsKey(Integer.valueOf(rVar.s()))) {
            j10.f51685a = o0(rVar.s(), bundleG, yVar, aVar);
            z11 = false;
        } else {
            z11 = yVar != null && yVar.j() && Q(rVar, bundle);
            if (!z11) {
                X(this.f46787x.e(rVar.u()), AbstractC3689v.e(C5512k.a.b(C5512k.f46731o, this.f46764a, rVar, bundleG, J(), this.f46781r, null, null, 96, null)), yVar, aVar, new o(j10, this, rVar, bundleG));
            }
        }
        w0();
        Iterator it2 = this.f46788y.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).l(false);
        }
        if (z10 || j10.f51685a || z11) {
            t();
        } else {
            v0();
        }
    }

    public static /* synthetic */ void W(n nVar, String str, y yVar, AbstractC5498D.a aVar, int i10, Object obj) throws Resources.NotFoundException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i10 & 2) != 0) {
            yVar = null;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        nVar.U(str, yVar, aVar);
    }

    private final void X(AbstractC5498D abstractC5498D, List list, y yVar, AbstractC5498D.a aVar, InterfaceC6835l interfaceC6835l) {
        this.f46789z = interfaceC6835l;
        abstractC5498D.e(list, yVar, aVar);
        this.f46789z = null;
    }

    private final void Y(Bundle bundle) throws Resources.NotFoundException {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f46768e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String name = it.next();
                C5499E c5499e = this.f46787x;
                AbstractC6492s.h(name, "name");
                AbstractC5498D abstractC5498DE = c5499e.e(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    abstractC5498DE.h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f46769f;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                AbstractC6492s.g(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                C5513l c5513l = (C5513l) parcelable;
                r rVarY = y(this, c5513l.a(), null, 2, null);
                if (rVarY == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + r.f46869k.b(this.f46764a, c5513l.a()) + " cannot be found from the current destination " + G());
                }
                C5512k c5512kC = c5513l.c(this.f46764a, rVarY, J(), this.f46781r);
                AbstractC5498D abstractC5498DE2 = this.f46787x.e(rVarY.u());
                Map map = this.f46788y;
                Object bVar = map.get(abstractC5498DE2);
                if (bVar == null) {
                    bVar = new b(this, abstractC5498DE2);
                    map.put(abstractC5498DE2, bVar);
                }
                this.f46771h.add(c5512kC);
                ((b) bVar).n(c5512kC);
                t tVarV = c5512kC.f().v();
                if (tVarV != null) {
                    S(c5512kC, D(tVarV.s()));
                }
            }
            w0();
            this.f46769f = null;
        }
        Collection collectionValues = this.f46787x.f().values();
        ArrayList<AbstractC5498D> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((AbstractC5498D) obj).c()) {
                arrayList.add(obj);
            }
        }
        for (AbstractC5498D abstractC5498D : arrayList) {
            Map map2 = this.f46788y;
            Object bVar2 = map2.get(abstractC5498D);
            if (bVar2 == null) {
                bVar2 = new b(this, abstractC5498D);
                map2.put(abstractC5498D, bVar2);
            }
            abstractC5498D.f((b) bVar2);
        }
        if (this.f46767d == null || !this.f46771h.isEmpty()) {
            t();
            return;
        }
        if (!this.f46770g && (activity = this.f46765b) != null) {
            AbstractC6492s.f(activity);
            if (O(activity.getIntent())) {
                return;
            }
        }
        t tVar = this.f46767d;
        AbstractC6492s.f(tVar);
        T(tVar, bundle, null, null);
    }

    public static /* synthetic */ boolean d0(n nVar, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return nVar.c0(str, z10, z11);
    }

    private final void f0(AbstractC5498D abstractC5498D, C5512k c5512k, boolean z10, InterfaceC6835l interfaceC6835l) {
        this.f46757A = interfaceC6835l;
        abstractC5498D.j(c5512k, z10);
        this.f46757A = null;
    }

    private final boolean g0(int i10, boolean z10, boolean z11) throws Resources.NotFoundException {
        r rVarF;
        if (this.f46771h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC3689v.P0(this.f46771h).iterator();
        while (true) {
            if (!it.hasNext()) {
                rVarF = null;
                break;
            }
            rVarF = ((C5512k) it.next()).f();
            AbstractC5498D abstractC5498DE = this.f46787x.e(rVarF.u());
            if (z10 || rVarF.s() != i10) {
                arrayList.add(abstractC5498DE);
            }
            if (rVarF.s() == i10) {
                break;
            }
        }
        if (rVarF != null) {
            return v(arrayList, rVarF, z10, z11);
        }
        Log.i("NavController", "Ignoring popBackStack to destination " + r.f46869k.b(this.f46764a, i10) + " as it was not found on the current back stack");
        return false;
    }

    private final boolean h0(Object obj, boolean z10, boolean z11) {
        return i0(C(obj), z10, z11);
    }

    private final boolean i0(String str, boolean z10, boolean z11) {
        Object objPrevious;
        if (this.f46771h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        C3681m c3681m = this.f46771h;
        ListIterator<E> listIterator = c3681m.listIterator(c3681m.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C5512k c5512k = (C5512k) objPrevious;
            boolean zY = c5512k.f().y(str, c5512k.d());
            if (z10 || !zY) {
                arrayList.add(this.f46787x.e(c5512k.f().u()));
            }
            if (zY) {
                break;
            }
        }
        C5512k c5512k2 = (C5512k) objPrevious;
        r rVarF = c5512k2 != null ? c5512k2.f() : null;
        if (rVarF != null) {
            return v(arrayList, rVarF, z10, z11);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    static /* synthetic */ boolean j0(n nVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return nVar.g0(i10, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(C5512k c5512k, boolean z10, C3681m c3681m) {
        f2.o oVar;
        N nC;
        Set set;
        C5512k c5512k2 = (C5512k) this.f46771h.last();
        if (!AbstractC6492s.d(c5512k2, c5512k)) {
            throw new IllegalStateException(("Attempted to pop " + c5512k.f() + ", which is not the top of the back stack (" + c5512k2.f() + ')').toString());
        }
        AbstractC3689v.N(this.f46771h);
        b bVar = (b) this.f46788y.get(K().e(c5512k2.f().u()));
        boolean z11 = true;
        if ((bVar == null || (nC = bVar.c()) == null || (set = (Set) nC.getValue()) == null || !set.contains(c5512k2)) && !this.f46777n.containsKey(c5512k2)) {
            z11 = false;
        }
        AbstractC4013k.b bVarB = c5512k2.O().b();
        AbstractC4013k.b bVar2 = AbstractC4013k.b.CREATED;
        if (bVarB.isAtLeast(bVar2)) {
            if (z10) {
                c5512k2.p(bVar2);
                c3681m.addFirst(new C5513l(c5512k2));
            }
            if (z11) {
                c5512k2.p(bVar2);
            } else {
                c5512k2.p(AbstractC4013k.b.DESTROYED);
                u0(c5512k2);
            }
        }
        if (z10 || z11 || (oVar = this.f46781r) == null) {
            return;
        }
        oVar.Y(c5512k2.i());
    }

    static /* synthetic */ void l0(n nVar, C5512k c5512k, boolean z10, C3681m c3681m, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            c3681m = new C3681m();
        }
        nVar.k0(c5512k, z10, c3681m);
    }

    private final boolean o0(int i10, Bundle bundle, y yVar, AbstractC5498D.a aVar) {
        if (!this.f46778o.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        String str = (String) this.f46778o.get(Integer.valueOf(i10));
        AbstractC3689v.I(this.f46778o.values(), new q(str));
        return w(P((C3681m) V.d(this.f46779p).remove(str)), bundle, yVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(r rVar, Bundle bundle, C5512k c5512k, List list) {
        C3681m<C5512k> c3681m;
        r rVarF;
        List list2;
        C5512k c5512k2;
        Bundle bundle2;
        Object objPrevious;
        t tVar;
        Object objPrevious2;
        List list3;
        Bundle bundle3;
        Bundle bundle4 = bundle;
        C5512k c5512k3 = c5512k;
        List list4 = list;
        r rVarF2 = c5512k.f();
        if (!(rVarF2 instanceof InterfaceC5505d)) {
            while (!this.f46771h.isEmpty() && (((C5512k) this.f46771h.last()).f() instanceof InterfaceC5505d) && j0(this, ((C5512k) this.f46771h.last()).f().s(), true, false, 4, null)) {
            }
        }
        C3681m c3681m2 = new C3681m();
        Object obj = null;
        if (rVar instanceof t) {
            r rVar2 = rVarF2;
            while (true) {
                AbstractC6492s.f(rVar2);
                t tVarV = rVar2.v();
                if (tVarV != null) {
                    ListIterator listIterator = list4.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (AbstractC6492s.d(((C5512k) objPrevious2).f(), tVarV)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    C5512k c5512kB = (C5512k) objPrevious2;
                    if (c5512kB == null) {
                        rVarF = rVarF2;
                        list3 = list4;
                        bundle3 = bundle4;
                        c5512k2 = c5512k3;
                        c5512kB = C5512k.a.b(C5512k.f46731o, this.f46764a, tVarV, bundle, J(), this.f46781r, null, null, 96, null);
                    } else {
                        rVarF = rVarF2;
                        list3 = list4;
                        c5512k2 = c5512k3;
                        bundle3 = bundle4;
                    }
                    c3681m2.addFirst(c5512kB);
                    if (this.f46771h.isEmpty() || ((C5512k) this.f46771h.last()).f() != tVarV) {
                        list2 = list3;
                        bundle2 = bundle3;
                        tVar = tVarV;
                        c3681m = c3681m2;
                    } else {
                        list2 = list3;
                        bundle2 = bundle3;
                        tVar = tVarV;
                        c3681m = c3681m2;
                        l0(this, (C5512k) this.f46771h.last(), false, null, 6, null);
                    }
                } else {
                    tVar = tVarV;
                    c3681m = c3681m2;
                    rVarF = rVarF2;
                    list2 = list4;
                    c5512k2 = c5512k3;
                    bundle2 = bundle4;
                }
                if (tVar == null || tVar == rVar) {
                    break;
                }
                c5512k3 = c5512k2;
                c3681m2 = c3681m;
                rVar2 = tVar;
                bundle4 = bundle2;
                list4 = list2;
                rVarF2 = rVarF;
            }
        } else {
            c3681m = c3681m2;
            rVarF = rVarF2;
            list2 = list4;
            c5512k2 = c5512k3;
            bundle2 = bundle4;
        }
        r rVarF3 = c3681m.isEmpty() ? rVarF : ((C5512k) c3681m.first()).f();
        while (rVarF3 != null && x(rVarF3.s(), rVarF3) != rVarF3) {
            rVarF3 = rVarF3.v();
            if (rVarF3 != null) {
                Bundle bundle5 = (bundle2 == null || !bundle.isEmpty()) ? bundle2 : null;
                ListIterator listIterator2 = list2.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (AbstractC6492s.d(((C5512k) objPrevious).f(), rVarF3)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                C5512k c5512kB2 = (C5512k) objPrevious;
                if (c5512kB2 == null) {
                    c5512kB2 = C5512k.a.b(C5512k.f46731o, this.f46764a, rVarF3, rVarF3.g(bundle5), J(), this.f46781r, null, null, 96, null);
                }
                c3681m.addFirst(c5512kB2);
            }
        }
        if (!c3681m.isEmpty()) {
            rVarF = ((C5512k) c3681m.first()).f();
        }
        while (!this.f46771h.isEmpty() && (((C5512k) this.f46771h.last()).f() instanceof t)) {
            r rVarF4 = ((C5512k) this.f46771h.last()).f();
            AbstractC6492s.g(rVarF4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((t) rVarF4).T().f(rVarF.s()) != null) {
                break;
            } else {
                l0(this, (C5512k) this.f46771h.last(), false, null, 6, null);
            }
        }
        C5512k c5512k4 = (C5512k) this.f46771h.J();
        if (c5512k4 == null) {
            c5512k4 = (C5512k) c3681m.J();
        }
        if (!AbstractC6492s.d(c5512k4 != null ? c5512k4.f() : null, this.f46767d)) {
            ListIterator listIterator3 = list2.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                r rVarF5 = ((C5512k) objPrevious3).f();
                t tVar2 = this.f46767d;
                AbstractC6492s.f(tVar2);
                if (AbstractC6492s.d(rVarF5, tVar2)) {
                    obj = objPrevious3;
                    break;
                }
            }
            C5512k c5512kB3 = (C5512k) obj;
            if (c5512kB3 == null) {
                C5512k.a aVar = C5512k.f46731o;
                Context context = this.f46764a;
                t tVar3 = this.f46767d;
                AbstractC6492s.f(tVar3);
                t tVar4 = this.f46767d;
                AbstractC6492s.f(tVar4);
                c5512kB3 = C5512k.a.b(aVar, context, tVar3, tVar4.g(bundle2), J(), this.f46781r, null, null, 96, null);
            }
            c3681m.addFirst(c5512kB3);
        }
        for (C5512k c5512k5 : c3681m) {
            Object obj2 = this.f46788y.get(this.f46787x.e(c5512k5.f().u()));
            if (obj2 == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + rVar.u() + " should already be created").toString());
            }
            ((b) obj2).n(c5512k5);
        }
        this.f46771h.addAll(c3681m);
        this.f46771h.add(c5512k2);
        for (C5512k c5512k6 : AbstractC3689v.N0(c3681m, c5512k2)) {
            t tVarV2 = c5512k6.f().v();
            if (tVarV2 != null) {
                S(c5512k6, D(tVarV2.s()));
            }
        }
    }

    static /* synthetic */ void q(n nVar, r rVar, Bundle bundle, C5512k c5512k, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i10 & 8) != 0) {
            list = AbstractC3689v.l();
        }
        nVar.p(rVar, bundle, c5512k, list);
    }

    private final boolean s(int i10) {
        Iterator it = this.f46788y.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).l(true);
        }
        boolean zO0 = o0(i10, null, AbstractC5495A.a(e.f46796a), null);
        Iterator it2 = this.f46788y.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).l(false);
        }
        return zO0 && g0(i10, true, false);
    }

    private final boolean t() {
        while (!this.f46771h.isEmpty() && (((C5512k) this.f46771h.last()).f() instanceof t)) {
            l0(this, (C5512k) this.f46771h.last(), false, null, 6, null);
        }
        C5512k c5512k = (C5512k) this.f46771h.T();
        if (c5512k != null) {
            this.f46760D.add(c5512k);
        }
        this.f46759C++;
        v0();
        int i10 = this.f46759C - 1;
        this.f46759C = i10;
        if (i10 == 0) {
            List<C5512k> listL1 = AbstractC3689v.l1(this.f46760D);
            this.f46760D.clear();
            for (C5512k c5512k2 : listL1) {
                Iterator it = this.f46782s.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(this, c5512k2.f(), c5512k2.d());
                }
                this.f46762F.j(c5512k2);
            }
            this.f46772i.j(AbstractC3689v.l1(this.f46771h));
            this.f46774k.j(m0());
        }
        return c5512k != null;
    }

    private final boolean v(List list, r rVar, boolean z10, boolean z11) {
        kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
        C3681m c3681m = new C3681m();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5498D abstractC5498D = (AbstractC5498D) it.next();
            kotlin.jvm.internal.J j11 = new kotlin.jvm.internal.J();
            f0(abstractC5498D, (C5512k) this.f46771h.last(), z11, new f(j11, j10, this, z11, c3681m));
            if (!j11.f51685a) {
                break;
            }
        }
        if (z11) {
            if (!z10) {
                for (r rVar2 : AbstractC8783m.W(AbstractC8783m.n(rVar, g.f46802a), new h())) {
                    Map map = this.f46778o;
                    Integer numValueOf = Integer.valueOf(rVar2.s());
                    C5513l c5513l = (C5513l) c3681m.J();
                    map.put(numValueOf, c5513l != null ? c5513l.b() : null);
                }
            }
            if (!c3681m.isEmpty()) {
                C5513l c5513l2 = (C5513l) c3681m.first();
                Iterator it2 = AbstractC8783m.W(AbstractC8783m.n(y(this, c5513l2.a(), null, 2, null), i.f46804a), new j()).iterator();
                while (it2.hasNext()) {
                    this.f46778o.put(Integer.valueOf(((r) it2.next()).s()), c5513l2.b());
                }
                if (this.f46778o.values().contains(c5513l2.b())) {
                    this.f46779p.put(c5513l2.b(), c3681m);
                }
            }
        }
        w0();
        return j10.f51685a;
    }

    private final boolean w(List list, Bundle bundle, y yVar, AbstractC5498D.a aVar) {
        C5512k c5512k;
        r rVarF;
        ArrayList<List> arrayList = new ArrayList();
        ArrayList<C5512k> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((C5512k) obj).f() instanceof t)) {
                arrayList2.add(obj);
            }
        }
        for (C5512k c5512k2 : arrayList2) {
            List list2 = (List) AbstractC3689v.D0(arrayList);
            if (AbstractC6492s.d((list2 == null || (c5512k = (C5512k) AbstractC3689v.B0(list2)) == null || (rVarF = c5512k.f()) == null) ? null : rVarF.u(), c5512k2.f().u())) {
                list2.add(c5512k2);
            } else {
                arrayList.add(AbstractC3689v.r(c5512k2));
            }
        }
        kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
        for (List list3 : arrayList) {
            X(this.f46787x.e(((C5512k) AbstractC3689v.q0(list3)).f().u()), list3, yVar, aVar, new k(j10, list, new L(), this, bundle));
        }
        return j10.f51685a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w0() {
        /*
            r3 = this;
            c.F r0 = r3.f46785v
            boolean r1 = r3.f46786w
            if (r1 == 0) goto Le
            int r1 = r3.H()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.j(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.n.w0():void");
    }

    public static /* synthetic */ r y(n nVar, int i10, r rVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i11 & 2) != 0) {
            rVar = null;
        }
        return nVar.x(i10, rVar);
    }

    public C5512k D(int i10) {
        Object objPrevious;
        C3681m c3681m = this.f46771h;
        ListIterator<E> listIterator = c3681m.listIterator(c3681m.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((C5512k) objPrevious).f().s() == i10) {
                break;
            }
        }
        C5512k c5512k = (C5512k) objPrevious;
        if (c5512k != null) {
            return c5512k;
        }
        throw new IllegalArgumentException(("No destination with ID " + i10 + " is on the NavController's back stack. The current destination is " + G()).toString());
    }

    public final Context E() {
        return this.f46764a;
    }

    public C5512k F() {
        return (C5512k) this.f46771h.T();
    }

    public r G() {
        C5512k c5512kF = F();
        if (c5512kF != null) {
            return c5512kF.f();
        }
        return null;
    }

    public t I() {
        t tVar = this.f46767d;
        if (tVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        AbstractC6492s.g(tVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return tVar;
    }

    public final AbstractC4013k.b J() {
        return this.f46780q == null ? AbstractC4013k.b.CREATED : this.f46783t;
    }

    public C5499E K() {
        return this.f46787x;
    }

    public C5512k L() {
        Object next;
        Iterator it = AbstractC3689v.P0(this.f46771h).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = AbstractC8783m.g(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!(((C5512k) next).f() instanceof t)) {
                break;
            }
        }
        return (C5512k) next;
    }

    public final N N() {
        return this.f46775l;
    }

    public boolean O(Intent intent) throws Resources.NotFoundException {
        int[] intArray;
        t tVarM;
        r.b bVarX;
        r rVarN;
        t tVar;
        Bundle bundle;
        int i10 = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
            } catch (Exception e10) {
                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e10);
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if ((intArray == null || intArray.length == 0) && (bVarX = (tVarM = M(this.f46771h)).X(new f2.q(intent), true, true, tVarM)) != null) {
            r rVarB = bVarX.b();
            int[] iArrJ = r.j(rVarB, null, 1, null);
            Bundle bundleG = rVarB.g(bVarX.c());
            if (bundleG != null) {
                bundle2.putAll(bundleG);
            }
            intArray = iArrJ;
            parcelableArrayList = null;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strB = B(intArray);
        if (strB != null) {
            Log.i("NavController", "Could not find destination " + strB + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i11 = 0; i11 < length; i11++) {
            Bundle bundle4 = new Bundle();
            bundle4.putAll(bundle2);
            if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i11)) != null) {
                bundle4.putAll(bundle);
            }
            bundleArr[i11] = bundle4;
        }
        int flags = intent.getFlags();
        int i12 = 268435456 & flags;
        if (i12 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            s1.u uVarE = s1.u.i(this.f46764a).e(intent);
            AbstractC6492s.h(uVarE, "create(context).addNextI…ntWithParentStack(intent)");
            uVarE.m();
            Activity activity = this.f46765b;
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i12 != 0) {
            if (!this.f46771h.isEmpty()) {
                t tVar2 = this.f46767d;
                AbstractC6492s.f(tVar2);
                j0(this, tVar2.s(), true, false, 4, null);
            }
            while (i10 < intArray.length) {
                int i13 = intArray[i10];
                int i14 = i10 + 1;
                Bundle bundle5 = bundleArr[i10];
                r rVarY = y(this, i13, null, 2, null);
                if (rVarY == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + r.f46869k.b(this.f46764a, i13) + " cannot be found from the current destination " + G());
                }
                T(rVarY, bundle5, AbstractC5495A.a(new l(rVarY, this)), null);
                i10 = i14;
            }
            this.f46770g = true;
            return true;
        }
        t tVar3 = this.f46767d;
        int length2 = intArray.length;
        for (int i15 = 0; i15 < length2; i15++) {
            int i16 = intArray[i15];
            Bundle bundle6 = bundleArr[i15];
            if (i15 == 0) {
                rVarN = this.f46767d;
            } else {
                AbstractC6492s.f(tVar3);
                rVarN = tVar3.N(i16);
            }
            if (rVarN == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + r.f46869k.b(this.f46764a, i16) + " cannot be found in graph " + tVar3);
            }
            if (i15 == intArray.length - 1) {
                y.a aVar = new y.a();
                t tVar4 = this.f46767d;
                AbstractC6492s.f(tVar4);
                T(rVarN, bundle6, y.a.k(aVar, tVar4.s(), true, false, 4, null).b(0).c(0).a(), null);
            } else if (rVarN instanceof t) {
                while (true) {
                    tVar = (t) rVarN;
                    AbstractC6492s.f(tVar);
                    if (!(tVar.N(tVar.V()) instanceof t)) {
                        break;
                    }
                    rVarN = tVar.N(tVar.V());
                }
                tVar3 = tVar;
            }
        }
        this.f46770g = true;
        return true;
    }

    public final void U(String route, y yVar, AbstractC5498D.a aVar) throws Resources.NotFoundException {
        AbstractC6492s.i(route, "route");
        if (this.f46767d == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        t tVarM = M(this.f46771h);
        r.b bVarY = tVarM.Y(route, true, true, tVarM);
        if (bVarY == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + route + " cannot be found in the navigation graph " + this.f46767d);
        }
        r rVarB = bVarY.b();
        Bundle bundleG = rVarB.g(bVarY.c());
        if (bundleG == null) {
            bundleG = new Bundle();
        }
        r rVarB2 = bVarY.b();
        Intent intent = new Intent();
        Uri uri = Uri.parse(r.f46869k.a(rVarB.w()));
        AbstractC6492s.e(uri, "Uri.parse(this)");
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleG.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        T(rVarB2, bundleG, yVar, aVar);
    }

    public final void V(String route, InterfaceC6835l builder) throws Resources.NotFoundException {
        AbstractC6492s.i(route, "route");
        AbstractC6492s.i(builder, "builder");
        W(this, route, AbstractC5495A.a(builder), null, 4, null);
    }

    public boolean Z() {
        if (this.f46771h.isEmpty()) {
            return false;
        }
        r rVarG = G();
        AbstractC6492s.f(rVarG);
        return a0(rVarG.s(), true);
    }

    public boolean a0(int i10, boolean z10) {
        return b0(i10, z10, false);
    }

    public boolean b0(int i10, boolean z10, boolean z11) {
        return g0(i10, z10, z11) && t();
    }

    public final boolean c0(String route, boolean z10, boolean z11) {
        AbstractC6492s.i(route, "route");
        return i0(route, z10, z11) && t();
    }

    public final void e0(C5512k popUpTo, InterfaceC6824a onComplete) throws Resources.NotFoundException {
        AbstractC6492s.i(popUpTo, "popUpTo");
        AbstractC6492s.i(onComplete, "onComplete");
        int iIndexOf = this.f46771h.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != this.f46771h.size()) {
            g0(((C5512k) this.f46771h.get(i10)).f().s(), true, false);
        }
        l0(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        w0();
        t();
    }

    public final List m0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f46788y.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((b) it.next()).c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C5512k c5512k = (C5512k) obj;
                if (!arrayList.contains(c5512k) && !c5512k.j().isAtLeast(AbstractC4013k.b.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            AbstractC3689v.C(arrayList, arrayList2);
        }
        C3681m c3681m = this.f46771h;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : c3681m) {
            C5512k c5512k2 = (C5512k) obj2;
            if (!arrayList.contains(c5512k2) && c5512k2.j().isAtLeast(AbstractC4013k.b.STARTED)) {
                arrayList3.add(obj2);
            }
        }
        AbstractC3689v.C(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((C5512k) obj3).f() instanceof t)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public void n0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f46764a.getClassLoader());
        this.f46768e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f46769f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.f46779p.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                this.f46778o.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                i10++;
                i11++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id2 : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + id2);
                if (parcelableArray != null) {
                    Map map = this.f46779p;
                    AbstractC6492s.h(id2, "id");
                    C3681m c3681m = new C3681m(parcelableArray.length);
                    Iterator itA = AbstractC6477c.a(parcelableArray);
                    while (itA.hasNext()) {
                        Parcelable parcelable = (Parcelable) itA.next();
                        AbstractC6492s.g(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        c3681m.add((C5513l) parcelable);
                    }
                    map.put(id2, c3681m);
                }
            }
        }
        this.f46770g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public Bundle p0() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f46787x.f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleI = ((AbstractC5498D) entry.getValue()).i();
            if (bundleI != null) {
                arrayList.add(str);
                bundle2.putBundle(str, bundleI);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.f46771h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f46771h.size()];
            Iterator<E> it = this.f46771h.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new C5513l((C5512k) it.next());
                i10++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.f46778o.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f46778o.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i11 = 0;
            for (Map.Entry entry2 : this.f46778o.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i11] = iIntValue;
                arrayList2.add(str2);
                i11++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.f46779p.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : this.f46779p.entrySet()) {
                String str3 = (String) entry3.getKey();
                C3681m c3681m = (C3681m) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[c3681m.size()];
                int i12 = 0;
                for (Object obj : c3681m) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC3689v.v();
                    }
                    parcelableArr2[i12] = (C5513l) obj;
                    i12 = i13;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str3, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f46770g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f46770g);
        }
        return bundle;
    }

    public void q0(t graph) throws Resources.NotFoundException {
        AbstractC6492s.i(graph, "graph");
        r0(graph, null);
    }

    public void r(c listener) {
        AbstractC6492s.i(listener, "listener");
        this.f46782s.add(listener);
        if (this.f46771h.isEmpty()) {
            return;
        }
        C5512k c5512k = (C5512k) this.f46771h.last();
        listener.a(this, c5512k.f(), c5512k.d());
    }

    public void r0(t graph, Bundle bundle) throws Resources.NotFoundException {
        AbstractC6492s.i(graph, "graph");
        if (!this.f46771h.isEmpty() && J() == AbstractC4013k.b.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        if (!AbstractC6492s.d(this.f46767d, graph)) {
            t tVar = this.f46767d;
            if (tVar != null) {
                for (Integer id2 : new ArrayList(this.f46778o.keySet())) {
                    AbstractC6492s.h(id2, "id");
                    s(id2.intValue());
                }
                j0(this, tVar.s(), true, false, 4, null);
            }
            this.f46767d = graph;
            Y(bundle);
            return;
        }
        int iP = graph.T().p();
        for (int i10 = 0; i10 < iP; i10++) {
            r rVar = (r) graph.T().q(i10);
            t tVar2 = this.f46767d;
            AbstractC6492s.f(tVar2);
            int iK = tVar2.T().k(i10);
            t tVar3 = this.f46767d;
            AbstractC6492s.f(tVar3);
            tVar3.T().o(iK, rVar);
        }
        for (C5512k c5512k : this.f46771h) {
            List<r> listS = AbstractC3689v.S(AbstractC8783m.Z(r.f46869k.c(c5512k.f())));
            r rVarN = this.f46767d;
            AbstractC6492s.f(rVarN);
            for (r rVar2 : listS) {
                if (!AbstractC6492s.d(rVar2, this.f46767d) || !AbstractC6492s.d(rVarN, graph)) {
                    if (rVarN instanceof t) {
                        rVarN = ((t) rVarN).N(rVar2.s());
                        AbstractC6492s.f(rVarN);
                    }
                }
            }
            c5512k.n(rVarN);
        }
    }

    public void s0(InterfaceC4017o owner) {
        AbstractC4013k abstractC4013kO;
        AbstractC6492s.i(owner, "owner");
        if (AbstractC6492s.d(owner, this.f46780q)) {
            return;
        }
        InterfaceC4017o interfaceC4017o = this.f46780q;
        if (interfaceC4017o != null && (abstractC4013kO = interfaceC4017o.O()) != null) {
            abstractC4013kO.c(this.f46784u);
        }
        this.f46780q = owner;
        owner.O().a(this.f46784u);
    }

    public void t0(Q viewModelStore) {
        AbstractC6492s.i(viewModelStore, "viewModelStore");
        f2.o oVar = this.f46781r;
        o.b bVar = f2.o.f46823c;
        if (AbstractC6492s.d(oVar, bVar.a(viewModelStore))) {
            return;
        }
        if (!this.f46771h.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.f46781r = bVar.a(viewModelStore);
    }

    public void u(boolean z10) {
        this.f46786w = z10;
        w0();
    }

    public final C5512k u0(C5512k child) {
        AbstractC6492s.i(child, "child");
        C5512k c5512k = (C5512k) this.f46776m.remove(child);
        if (c5512k == null) {
            return null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.f46777n.get(c5512k);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            b bVar = (b) this.f46788y.get(this.f46787x.e(c5512k.f().u()));
            if (bVar != null) {
                bVar.e(c5512k);
            }
            this.f46777n.remove(c5512k);
        }
        return c5512k;
    }

    public final void v0() {
        AtomicInteger atomicInteger;
        N nC;
        Set set;
        List<C5512k> listL1 = AbstractC3689v.l1(this.f46771h);
        if (listL1.isEmpty()) {
            return;
        }
        r rVarF = ((C5512k) AbstractC3689v.B0(listL1)).f();
        ArrayList arrayList = new ArrayList();
        if (rVarF instanceof InterfaceC5505d) {
            Iterator it = AbstractC3689v.P0(listL1).iterator();
            while (it.hasNext()) {
                r rVarF2 = ((C5512k) it.next()).f();
                arrayList.add(rVarF2);
                if (!(rVarF2 instanceof InterfaceC5505d) && !(rVarF2 instanceof t)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C5512k c5512k : AbstractC3689v.P0(listL1)) {
            AbstractC4013k.b bVarJ = c5512k.j();
            r rVarF3 = c5512k.f();
            if (rVarF != null && rVarF3.s() == rVarF.s()) {
                AbstractC4013k.b bVar = AbstractC4013k.b.RESUMED;
                if (bVarJ != bVar) {
                    b bVar2 = (b) this.f46788y.get(K().e(c5512k.f().u()));
                    if (AbstractC6492s.d((bVar2 == null || (nC = bVar2.c()) == null || (set = (Set) nC.getValue()) == null) ? null : Boolean.valueOf(set.contains(c5512k)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f46777n.get(c5512k)) != null && atomicInteger.get() == 0)) {
                        map.put(c5512k, AbstractC4013k.b.STARTED);
                    } else {
                        map.put(c5512k, bVar);
                    }
                }
                r rVar = (r) AbstractC3689v.s0(arrayList);
                if (rVar != null && rVar.s() == rVarF3.s()) {
                    AbstractC3689v.L(arrayList);
                }
                rVarF = rVarF.v();
            } else if (arrayList.isEmpty() || rVarF3.s() != ((r) AbstractC3689v.q0(arrayList)).s()) {
                c5512k.p(AbstractC4013k.b.CREATED);
            } else {
                r rVar2 = (r) AbstractC3689v.L(arrayList);
                if (bVarJ == AbstractC4013k.b.RESUMED) {
                    c5512k.p(AbstractC4013k.b.STARTED);
                } else {
                    AbstractC4013k.b bVar3 = AbstractC4013k.b.STARTED;
                    if (bVarJ != bVar3) {
                        map.put(c5512k, bVar3);
                    }
                }
                t tVarV = rVar2.v();
                if (tVarV != null && !arrayList.contains(tVarV)) {
                    arrayList.add(tVarV);
                }
            }
        }
        for (C5512k c5512k2 : listL1) {
            AbstractC4013k.b bVar4 = (AbstractC4013k.b) map.get(c5512k2);
            if (bVar4 != null) {
                c5512k2.p(bVar4);
            } else {
                c5512k2.q();
            }
        }
    }

    public final r x(int i10, r rVar) {
        r rVarF;
        t tVar = this.f46767d;
        if (tVar == null) {
            return null;
        }
        AbstractC6492s.f(tVar);
        if (tVar.s() == i10) {
            if (rVar == null) {
                return this.f46767d;
            }
            if (AbstractC6492s.d(this.f46767d, rVar) && rVar.v() == null) {
                return this.f46767d;
            }
        }
        C5512k c5512k = (C5512k) this.f46771h.T();
        if (c5512k == null || (rVarF = c5512k.f()) == null) {
            rVarF = this.f46767d;
            AbstractC6492s.f(rVarF);
        }
        return z(rVarF, i10, false, rVar);
    }

    public final r z(r rVar, int i10, boolean z10, r rVar2) {
        t tVar;
        AbstractC6492s.i(rVar, "<this>");
        if (rVar.s() == i10 && (rVar2 == null || (AbstractC6492s.d(rVar, rVar2) && AbstractC6492s.d(rVar.v(), rVar2.v())))) {
            return rVar;
        }
        if (rVar instanceof t) {
            tVar = (t) rVar;
        } else {
            t tVarV = rVar.v();
            AbstractC6492s.f(tVarV);
            tVar = tVarV;
        }
        return tVar.R(i10, tVar, z10, rVar2);
    }
}
