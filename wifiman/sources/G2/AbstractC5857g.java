package g2;

import Ii.N;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.K;
import T.L;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import T.z1;
import Yg.J;
import Yg.v;
import androidx.compose.ui.platform.A0;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4015m;
import androidx.lifecycle.InterfaceC4017o;
import c0.AbstractC4178g;
import c0.InterfaceC4176e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f2.C5512k;
import f2.r;
import g2.AbstractC5857g;
import g2.C5859i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: g2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5857g {

    /* renamed from: g2.g$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5859i f47547a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5512k f47548b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5859i c5859i, C5512k c5512k) {
            super(0);
            this.f47547a = c5859i;
            this.f47548b = c5512k;
        }

        public final void a() {
            this.f47547a.m(this.f47548b);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* renamed from: g2.g$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5512k f47549a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5859i f47550b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC4176e f47551c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.snapshots.k f47552d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C5859i.b f47553e;

        /* renamed from: g2.g$b$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.snapshots.k f47554a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5512k f47555b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C5859i f47556c;

            /* renamed from: g2.g$b$a$a, reason: collision with other inner class name */
            public static final class C1768a implements K {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C5859i f47557a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C5512k f47558b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.snapshots.k f47559c;

                public C1768a(C5859i c5859i, C5512k c5512k, androidx.compose.runtime.snapshots.k kVar) {
                    this.f47557a = c5859i;
                    this.f47558b = c5512k;
                    this.f47559c = kVar;
                }

                @Override // T.K
                public void dispose() {
                    this.f47557a.p(this.f47558b);
                    this.f47559c.remove(this.f47558b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.runtime.snapshots.k kVar, C5512k c5512k, C5859i c5859i) {
                super(1);
                this.f47554a = kVar;
                this.f47555b = c5512k;
                this.f47556c = c5859i;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final K invoke(L l10) {
                this.f47554a.add(this.f47555b);
                return new C1768a(this.f47556c, this.f47555b, this.f47554a);
            }
        }

        /* renamed from: g2.g$b$b, reason: collision with other inner class name */
        static final class C1769b extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5859i.b f47560a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5512k f47561b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1769b(C5859i.b bVar, C5512k c5512k) {
                super(2);
                this.f47560a = bVar;
                this.f47561b = c5512k;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-497631156, i10, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                }
                this.f47560a.L().s(this.f47561b, interfaceC3540l, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C5512k c5512k, C5859i c5859i, InterfaceC4176e interfaceC4176e, androidx.compose.runtime.snapshots.k kVar, C5859i.b bVar) {
            super(2);
            this.f47549a = c5512k;
            this.f47550b = c5859i;
            this.f47551c = interfaceC4176e;
            this.f47552d = kVar;
            this.f47553e = bVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1129586364, i10, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
            }
            C5512k c5512k = this.f47549a;
            boolean zL = interfaceC3540l.l(this.f47549a) | interfaceC3540l.T(this.f47550b);
            androidx.compose.runtime.snapshots.k kVar = this.f47552d;
            C5512k c5512k2 = this.f47549a;
            C5859i c5859i = this.f47550b;
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(kVar, c5512k2, c5859i);
                interfaceC3540l.K(objF);
            }
            O.c(c5512k, (InterfaceC6835l) objF, interfaceC3540l, 0);
            C5512k c5512k3 = this.f47549a;
            AbstractC5860j.a(c5512k3, this.f47551c, b0.c.e(-497631156, true, new C1769b(this.f47553e, c5512k3), interfaceC3540l, 54), interfaceC3540l, 384);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: g2.g$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f47562a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1 f47563b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5859i f47564c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.snapshots.k f47565d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z1 z1Var, C5859i c5859i, androidx.compose.runtime.snapshots.k kVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f47563b = z1Var;
            this.f47564c = c5859i;
            this.f47565d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new c(this.f47563b, this.f47564c, this.f47565d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f47562a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            Set<C5512k> setC = AbstractC5857g.c(this.f47563b);
            C5859i c5859i = this.f47564c;
            androidx.compose.runtime.snapshots.k kVar = this.f47565d;
            for (C5512k c5512k : setC) {
                if (!((List) c5859i.n().getValue()).contains(c5512k) && !kVar.contains(c5512k)) {
                    c5859i.p(c5512k);
                }
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: g2.g$d */
    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5859i f47566a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f47567b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C5859i c5859i, int i10) {
            super(2);
            this.f47566a = c5859i;
            this.f47567b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC5857g.a(this.f47566a, interfaceC3540l, L0.a(this.f47567b | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: g2.g$e */
    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5512k f47568a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f47569b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f47570c;

        /* renamed from: g2.g$e$a */
        public static final class a implements K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5512k f47571a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC4015m f47572b;

            public a(C5512k c5512k, InterfaceC4015m interfaceC4015m) {
                this.f47571a = c5512k;
                this.f47572b = interfaceC4015m;
            }

            @Override // T.K
            public void dispose() {
                this.f47571a.O().c(this.f47572b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C5512k c5512k, boolean z10, List list) {
            super(1);
            this.f47568a = c5512k;
            this.f47569b = z10;
            this.f47570c = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(boolean z10, List list, C5512k c5512k, InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar) {
            if (z10 && !list.contains(c5512k)) {
                list.add(c5512k);
            }
            if (aVar == AbstractC4013k.a.ON_START && !list.contains(c5512k)) {
                list.add(c5512k);
            }
            if (aVar == AbstractC4013k.a.ON_STOP) {
                list.remove(c5512k);
            }
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final K invoke(L l10) {
            final boolean z10 = this.f47569b;
            final List list = this.f47570c;
            final C5512k c5512k = this.f47568a;
            InterfaceC4015m interfaceC4015m = new InterfaceC4015m() { // from class: g2.h
                @Override // androidx.lifecycle.InterfaceC4015m
                public final void j(InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar) {
                    AbstractC5857g.e.h(z10, list, c5512k, interfaceC4017o, aVar);
                }
            };
            this.f47568a.O().a(interfaceC4015m);
            return new a(this.f47568a, interfaceC4015m);
        }
    }

    /* renamed from: g2.g$f */
    static final class f extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f47573a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection f47574b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f47575c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, Collection collection, int i10) {
            super(2);
            this.f47573a = list;
            this.f47574b = collection;
            this.f47575c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC5857g.d(this.f47573a, this.f47574b, interfaceC3540l, L0.a(this.f47575c | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public static final void a(C5859i c5859i, InterfaceC3540l interfaceC3540l, int i10) {
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(294589392);
        int i11 = (i10 & 6) == 0 ? (interfaceC3540lR.T(c5859i) ? 4 : 2) | i10 : i10;
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(294589392, i11, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            boolean z10 = false;
            InterfaceC4176e interfaceC4176eA = AbstractC4178g.a(interfaceC3540lR, 0);
            InterfaceC5380e interfaceC5380e = null;
            boolean z11 = true;
            z1 z1VarB = o1.b(c5859i.n(), null, interfaceC3540lR, 0, 1);
            androidx.compose.runtime.snapshots.k<C5512k> kVarF = f(b(z1VarB), interfaceC3540lR, 0);
            d(kVarF, b(z1VarB), interfaceC3540lR, 0);
            z1 z1VarB2 = o1.b(c5859i.o(), null, interfaceC3540lR, 0, 1);
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = o1.f();
                interfaceC3540lR.K(objF);
            }
            androidx.compose.runtime.snapshots.k kVar = (androidx.compose.runtime.snapshots.k) objF;
            interfaceC3540lR.U(1361037007);
            for (C5512k c5512k : kVarF) {
                r rVarF = c5512k.f();
                AbstractC6492s.g(rVarF, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                C5859i.b bVar = (C5859i.b) rVarF;
                boolean zL = ((i11 & 14) == 4 ? z11 : z10) | interfaceC3540lR.l(c5512k);
                Object objF2 = interfaceC3540lR.f();
                if (zL || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new a(c5859i, c5512k);
                    interfaceC3540lR.K(objF2);
                }
                androidx.compose.ui.window.a.a((InterfaceC6824a) objF2, bVar.M(), b0.c.e(1129586364, z11, new b(c5512k, c5859i, interfaceC4176eA, kVar, bVar), interfaceC3540lR, 54), interfaceC3540lR, 384, 0);
                interfaceC5380e = null;
                i11 = i11;
                kVar = kVar;
                z1VarB2 = z1VarB2;
                z11 = z11;
                z10 = z10;
            }
            androidx.compose.runtime.snapshots.k kVar2 = kVar;
            z1 z1Var = z1VarB2;
            boolean z12 = z11;
            InterfaceC5380e interfaceC5380e2 = interfaceC5380e;
            boolean z13 = z10;
            interfaceC3540lR.J();
            Set setC = c(z1Var);
            boolean zT = interfaceC3540lR.T(z1Var) | ((i11 & 14) == 4 ? z12 : z13);
            Object objF3 = interfaceC3540lR.f();
            if (zT || objF3 == InterfaceC3540l.f21100a.a()) {
                objF3 = new c(z1Var, c5859i, kVar2, interfaceC5380e2);
                interfaceC3540lR.K(objF3);
            }
            O.e(setC, kVar2, (InterfaceC6839p) objF3, interfaceC3540lR, 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new d(c5859i, i10));
        }
    }

    private static final List b(z1 z1Var) {
        return (List) z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set c(z1 z1Var) {
        return (Set) z1Var.getValue();
    }

    public static final void d(List list, Collection collection, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1537894851);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(collection) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1537894851, i11, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            boolean zBooleanValue = ((Boolean) interfaceC3540lR.t(A0.a())).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C5512k c5512k = (C5512k) it.next();
                AbstractC4013k abstractC4013kO = c5512k.O();
                boolean zC = interfaceC3540lR.c(zBooleanValue) | interfaceC3540lR.l(list) | interfaceC3540lR.l(c5512k);
                Object objF = interfaceC3540lR.f();
                if (zC || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new e(c5512k, zBooleanValue, list);
                    interfaceC3540lR.K(objF);
                }
                O.c(abstractC4013kO, (InterfaceC6835l) objF, interfaceC3540lR, 0);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new f(list, collection, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.runtime.snapshots.k f(java.util.Collection r5, T.InterfaceC3540l r6, int r7) {
        /*
            boolean r0 = T.AbstractC3546o.H()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)"
            r2 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            T.AbstractC3546o.Q(r2, r7, r0, r1)
        Lf:
            T.H0 r7 = androidx.compose.ui.platform.A0.a()
            java.lang.Object r7 = r6.t(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            boolean r0 = r6.T(r5)
            java.lang.Object r1 = r6.f()
            if (r0 != 0) goto L2f
            T.l$a r0 = T.InterfaceC3540l.f21100a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L69
        L2f:
            androidx.compose.runtime.snapshots.k r1 = T.o1.f()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L3e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r5.next()
            r3 = r2
            f2.k r3 = (f2.C5512k) r3
            if (r7 == 0) goto L4f
            r3 = 1
            goto L5d
        L4f:
            androidx.lifecycle.k r3 = r3.O()
            androidx.lifecycle.k$b r3 = r3.b()
            androidx.lifecycle.k$b r4 = androidx.lifecycle.AbstractC4013k.b.STARTED
            boolean r3 = r3.isAtLeast(r4)
        L5d:
            if (r3 == 0) goto L3e
            r0.add(r2)
            goto L3e
        L63:
            r1.addAll(r0)
            r6.K(r1)
        L69:
            androidx.compose.runtime.snapshots.k r1 = (androidx.compose.runtime.snapshots.k) r1
            boolean r5 = T.AbstractC3546o.H()
            if (r5 == 0) goto L74
            T.AbstractC3546o.P()
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.AbstractC5857g.f(java.util.Collection, T.l, int):androidx.compose.runtime.snapshots.k");
    }
}
