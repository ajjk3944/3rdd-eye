package bf;

import A.AbstractC2395b;
import A.B;
import A.InterfaceC2396c;
import A.y;
import Be.N;
import Be.U;
import L9.AbstractC3198d;
import L9.E;
import L9.L;
import L9.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.O;
import T.o1;
import T.t1;
import T.z1;
import Yg.J;
import Yg.v;
import Zg.AbstractC3689v;
import android.content.res.Resources;
import bf.AbstractC4107k;
import bf.q;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import j0.AbstractC6240k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import jj.AbstractC6349a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import r.AbstractC7521c;
import s9.d;
import sh.AbstractC7978m;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import y6.AbstractC8612a;
import z.InterfaceC8681d;
import z.Y;
import z.j0;

/* loaded from: classes4.dex */
public abstract class q {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4107k f33209a;

        /* renamed from: bf.q$a$a, reason: collision with other inner class name */
        static final class C1158a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC4107k f33210a;

            /* renamed from: bf.q$a$a$a, reason: collision with other inner class name */
            static final class C1159a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC4107k f33211a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC3551q0 f33212b;

                /* renamed from: bf.q$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1160a extends C6490p implements InterfaceC6824a {
                    C1160a(Object obj) {
                        super(0, obj, AbstractC4107k.class, "onDoneClicked", "onDoneClicked()V", 0);
                    }

                    public final void a() {
                        ((AbstractC4107k) this.receiver).q0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                /* renamed from: bf.q$a$a$a$b */
                public /* synthetic */ class b {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f33213a;

                    static {
                        int[] iArr = new int[EnumC4106j.values().length];
                        try {
                            iArr[EnumC4106j.DEFAULT.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[EnumC4106j.EDIT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        f33213a = iArr;
                    }
                }

                C1159a(AbstractC4107k abstractC4107k, InterfaceC3551q0 interfaceC3551q0) {
                    this.f33211a = abstractC4107k;
                    this.f33212b = interfaceC3551q0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(InterfaceC3551q0 interfaceC3551q0) {
                    C1158a.h(interfaceC3551q0, true);
                    return J.f24997a;
                }

                public final void b(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1284613003, i10, -1, "com.ui.wifiman.ui.speed.hosts.NetworkHostsUi.<anonymous>.<anonymous>.<anonymous> (NetworkHostsUi.kt:64)");
                    }
                    int i11 = b.f33213a[((EnumC4106j) o1.b(this.f33211a.C(), null, interfaceC3540l, 0, 1).getValue()).ordinal()];
                    if (i11 == 1) {
                        interfaceC3540l.U(2022135457);
                        s9.b bVarF = N9.b.f16117a.F();
                        interfaceC3540l.U(1173614287);
                        final InterfaceC3551q0 interfaceC3551q0 = this.f33212b;
                        Object objF = interfaceC3540l.f();
                        if (objF == InterfaceC3540l.f21100a.a()) {
                            objF = new InterfaceC6824a() { // from class: bf.p
                                @Override // mh.InterfaceC6824a
                                public final Object invoke() {
                                    return q.a.C1158a.C1159a.c(interfaceC3551q0);
                                }
                            };
                            interfaceC3540l.K(objF);
                        }
                        interfaceC3540l.J();
                        z.c(bVarF, null, 0L, false, (InterfaceC6824a) objF, interfaceC3540l, 24576, 14);
                        interfaceC3540l.J();
                    } else {
                        if (i11 != 2) {
                            interfaceC3540l.U(1173605998);
                            interfaceC3540l.J();
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC3540l.U(2022455191);
                        d.b bVar = new d.b(AbstractC6780c.f53468d);
                        AbstractC4107k abstractC4107k = this.f33211a;
                        interfaceC3540l.U(1173624973);
                        boolean zT = interfaceC3540l.T(abstractC4107k);
                        Object objF2 = interfaceC3540l.f();
                        if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
                            objF2 = new C1160a(abstractC4107k);
                            interfaceC3540l.K(objF2);
                        }
                        interfaceC3540l.J();
                        He.i.c(null, (InterfaceC6824a) ((th.g) objF2), false, bVar, interfaceC3540l, 0, 5);
                        interfaceC3540l.J();
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    b((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            C1158a(AbstractC4107k abstractC4107k) {
                this.f33210a = abstractC4107k;
            }

            private static final boolean f(InterfaceC3551q0 interfaceC3551q0) {
                return ((Boolean) interfaceC3551q0.getValue()).booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void h(InterfaceC3551q0 interfaceC3551q0, boolean z10) {
                interfaceC3551q0.setValue(Boolean.valueOf(z10));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J i(InterfaceC3551q0 interfaceC3551q0) {
                h(interfaceC3551q0, false);
                return J.f24997a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J j(AbstractC4107k abstractC4107k, InterfaceC3551q0 interfaceC3551q0, String it) {
                AbstractC6492s.i(it, "it");
                if (AbstractC6492s.d(it, "add")) {
                    h(interfaceC3551q0, false);
                    abstractC4107k.o0();
                } else if (AbstractC6492s.d(it, "edit")) {
                    h(interfaceC3551q0, false);
                    abstractC4107k.r0();
                }
                return J.f24997a;
            }

            public final void e(Y UiToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiToolbar, "$this$UiToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(41443356, i10, -1, "com.ui.wifiman.ui.speed.hosts.NetworkHostsUi.<anonymous>.<anonymous> (NetworkHostsUi.kt:62)");
                }
                interfaceC3540l.U(-174497729);
                Object objF = interfaceC3540l.f();
                InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
                if (objF == aVar.a()) {
                    objF = t1.d(Boolean.FALSE, null, 2, null);
                    interfaceC3540l.K(objF);
                }
                final InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
                interfaceC3540l.J();
                L.b(null, b0.c.e(-1284613003, true, new C1159a(this.f33210a, interfaceC3551q0), interfaceC3540l, 54), interfaceC3540l, 48, 1);
                interfaceC3540l.U(-174468590);
                Object objF2 = interfaceC3540l.f();
                if (objF2 == aVar.a()) {
                    objF2 = Ci.a.b(new N.a("add", Pe.a.f18599a.a(), new d.b(AbstractC6780c.f53610x1), false, null, 24, null), new N.a("edit", N9.b.f16117a.G(), new d.b(AbstractC6780c.f53617y1), false, null, 24, null));
                    interfaceC3540l.K(objF2);
                }
                Ci.f fVar = (Ci.f) objF2;
                interfaceC3540l.J();
                boolean zF = f(interfaceC3551q0);
                interfaceC3540l.U(-174443055);
                Object objF3 = interfaceC3540l.f();
                if (objF3 == aVar.a()) {
                    objF3 = new InterfaceC6824a() { // from class: bf.n
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return q.a.C1158a.i(interfaceC3551q0);
                        }
                    };
                    interfaceC3540l.K(objF3);
                }
                InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF3;
                interfaceC3540l.J();
                interfaceC3540l.U(-174440604);
                boolean zT = interfaceC3540l.T(this.f33210a);
                final AbstractC4107k abstractC4107k = this.f33210a;
                Object objF4 = interfaceC3540l.f();
                if (zT || objF4 == aVar.a()) {
                    objF4 = new InterfaceC6835l() { // from class: bf.o
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return q.a.C1158a.j(abstractC4107k, interfaceC3551q0, (String) obj);
                        }
                    };
                    interfaceC3540l.K(objF4);
                }
                interfaceC3540l.J();
                U.e(null, zF, interfaceC6824a, 0L, null, (InterfaceC6835l) objF4, fVar, interfaceC3540l, 1573248, 25);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                e((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        a(AbstractC4107k abstractC4107k) {
            this.f33209a = abstractC4107k;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1754205396, i10, -1, "com.ui.wifiman.ui.speed.hosts.NetworkHostsUi.<anonymous> (NetworkHostsUi.kt:53)");
            }
            final InterfaceC8511f.b bVar = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
            androidx.compose.ui.e eVarC = j0.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
            String strA = H0.f.a(AbstractC6780c.f53624z1, interfaceC3540l, 0);
            AbstractC3198d.a aVar = AbstractC3198d.a.f11402b;
            interfaceC3540l.U(965504766);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: bf.m
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return q.a.c(bVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            E.i(eVarC, strA, aVar, (InterfaceC6824a) objF, b0.c.e(41443356, true, new C1158a(this.f33209a), interfaceC3540l, 54), 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540l, (AbstractC3198d.a.f11403c << 6) | 24576, 0, 2016);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4107k f33214a;

        static final class a implements mh.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.snapshots.k f33215a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Map f33216b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4101e f33217c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ EnumC4106j f33218d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AbstractC4107k f33219e;

            /* renamed from: bf.q$b$a$a, reason: collision with other inner class name */
            static final class C1161a implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC4107k f33220a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C4101e f33221b;

                C1161a(AbstractC4107k abstractC4107k, C4101e c4101e) {
                    this.f33220a = abstractC4107k;
                    this.f33221b = c4101e;
                }

                public final void a(String it) {
                    AbstractC6492s.i(it, "it");
                    this.f33220a.p0(this.f33221b.b());
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((String) obj);
                    return J.f24997a;
                }
            }

            /* renamed from: bf.q$b$a$b, reason: collision with other inner class name */
            public /* synthetic */ class C1162b {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f33222a;

                static {
                    int[] iArr = new int[EnumC4106j.values().length];
                    try {
                        iArr[EnumC4106j.EDIT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC4106j.DEFAULT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f33222a = iArr;
                }
            }

            a(androidx.compose.runtime.snapshots.k kVar, Map map, C4101e c4101e, EnumC4106j enumC4106j, AbstractC4107k abstractC4107k) {
                this.f33215a = kVar;
                this.f33216b = map;
                this.f33217c = c4101e;
                this.f33218d = enumC4106j;
                this.f33219e = abstractC4107k;
            }

            public final void a(InterfaceC8681d ReorderableItem, boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
                int i11;
                AbstractC6492s.i(ReorderableItem, "$this$ReorderableItem");
                if ((i10 & 48) == 0) {
                    i11 = i10 | (interfaceC3540l.c(z10) ? 32 : 16);
                } else {
                    i11 = i10;
                }
                if ((i11 & 145) == 144 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                int iNextIndex = -1;
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1991722150, i11, -1, "com.ui.wifiman.ui.speed.hosts.NetworkHostsUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NetworkHostsUi.kt:153)");
                }
                boolean z11 = false;
                z1 z1VarC = AbstractC7521c.c(Y0.h.j(z10 ? 16 : 0), null, "host elevation", null, interfaceC3540l, 384, 10);
                androidx.compose.runtime.snapshots.k kVar = this.f33215a;
                C4101e c4101e = this.f33217c;
                ListIterator listIterator = kVar.listIterator(kVar.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    } else if (AbstractC6492s.d(((C4101e) listIterator.previous()).b(), c4101e.b())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                androidx.compose.ui.e eVarB = AbstractC6240k.b(androidx.compose.foundation.layout.o.k(androidx.compose.ui.e.f28771b0, C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), 0.0f, 2, null), ((Y0.h) z1VarC.getValue()).s(), null, false, 0L, 0L, 30, null);
                C4101e c4101e2 = (C4101e) this.f33216b.get(this.f33217c.b());
                if (c4101e2 == null) {
                    c4101e2 = this.f33217c;
                }
                int i12 = C1162b.f33222a[this.f33218d.ordinal()];
                if (i12 == 1) {
                    z11 = true;
                } else if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                EnumC4097a enumC4097a = z10 ? EnumC4097a.DRAGGING : (iNextIndex == 0 && this.f33215a.size() == 1) ? EnumC4097a.ON_LIST_TOP_BOTTOM : iNextIndex == 0 ? EnumC4097a.ON_LIST_TOP : iNextIndex == this.f33215a.size() - 1 ? EnumC4097a.ON_LIST_BOTTOM : EnumC4097a.IN_LIST_MIDDLE;
                interfaceC3540l.U(21648989);
                boolean zT = interfaceC3540l.T(this.f33219e) | interfaceC3540l.T(this.f33217c);
                AbstractC4107k abstractC4107k = this.f33219e;
                C4101e c4101e3 = this.f33217c;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C1161a(abstractC4107k, c4101e3);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                AbstractC4105i.e(eVarB, c4101e2, z11, enumC4097a, (InterfaceC6835l) objF, interfaceC3540l, 0, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.r
            public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                a((InterfaceC8681d) obj, ((Boolean) obj2).booleanValue(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                return J.f24997a;
            }
        }

        /* renamed from: bf.q$b$b, reason: collision with other inner class name */
        static final class C1163b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f33223a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.snapshots.k f33224b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC4107k.a f33225c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1163b(androidx.compose.runtime.snapshots.k kVar, AbstractC4107k.a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f33224b = kVar;
                this.f33225c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C1163b(this.f33224b, this.f33225c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f33223a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                AbstractC8612a.b(this.f33224b, this.f33225c.a());
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((C1163b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        public static final class c extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final c f33226a = new c();

            public c() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Object obj) {
                return null;
            }
        }

        public static final class d extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f33227a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f33228b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(InterfaceC6835l interfaceC6835l, List list) {
                super(1);
                this.f33227a = interfaceC6835l;
                this.f33228b = list;
            }

            public final Object a(int i10) {
                return this.f33227a.invoke(this.f33228b.get(i10));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        public static final class e extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f33229a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f33230b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(InterfaceC6835l interfaceC6835l, List list) {
                super(1);
                this.f33229a = interfaceC6835l;
                this.f33230b = list;
            }

            public final Object a(int i10) {
                return this.f33229a.invoke(this.f33230b.get(i10));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        public static final class f extends AbstractC6494u implements mh.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f33231a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ jj.g f33232b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.snapshots.k f33233c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f33234d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ EnumC4106j f33235e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC4107k f33236f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(List list, jj.g gVar, androidx.compose.runtime.snapshots.k kVar, Map map, EnumC4106j enumC4106j, AbstractC4107k abstractC4107k) {
                super(4);
                this.f33231a = list;
                this.f33232b = gVar;
                this.f33233c = kVar;
                this.f33234d = map;
                this.f33235e = enumC4106j;
                this.f33236f = abstractC4107k;
            }

            public final void a(InterfaceC2396c interfaceC2396c, int i10, InterfaceC3540l interfaceC3540l, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (interfaceC3540l.T(interfaceC2396c) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= interfaceC3540l.i(i10) ? 32 : 16;
                }
                if ((i12 & 147) == 146 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                C4101e c4101e = (C4101e) this.f33231a.get(i10);
                interfaceC3540l.U(-2018400737);
                jj.e.a(this.f33232b, c4101e.b(), null, null, false, null, b0.c.e(-1991722150, true, new a(this.f33233c, this.f33234d, c4101e, this.f33235e, this.f33236f), interfaceC3540l, 54), interfaceC3540l, jj.g.f50940t | 1572864, 60);
                interfaceC3540l.J();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.r
            public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                a((InterfaceC2396c) obj, ((Number) obj2).intValue(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                return J.f24997a;
            }
        }

        b(AbstractC4107k abstractC4107k) {
            this.f33214a = abstractC4107k;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J h(androidx.compose.runtime.snapshots.k kVar, jj.g gVar, Map map, EnumC4106j enumC4106j, AbstractC4107k abstractC4107k, y LazyColumn) {
            AbstractC6492s.i(LazyColumn, "$this$LazyColumn");
            LazyColumn.a(kVar.size(), new d(new InterfaceC6835l() { // from class: bf.u
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return q.b.i((C4101e) obj);
                }
            }, kVar), new e(c.f33226a, kVar), b0.c.c(-632812321, true, new f(kVar, gVar, kVar, map, enumC4106j, abstractC4107k)));
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object i(C4101e it) {
            AbstractC6492s.i(it, "it");
            return it.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J j(androidx.compose.runtime.snapshots.k kVar, jj.d from, jj.d to) {
            AbstractC6492s.i(from, "from");
            AbstractC6492s.i(to, "to");
            List listL1 = AbstractC3689v.l1(kVar);
            listL1.add(to.a(), listL1.remove(from.a()));
            AbstractC8612a.b(kVar, listL1);
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J k(androidx.compose.runtime.snapshots.k kVar, AbstractC4107k abstractC4107k, int i10, int i11) {
            C4101e c4101e = (C4101e) AbstractC3689v.t0(kVar, i11);
            String strB = c4101e != null ? c4101e.b() : null;
            Z7.b.h("NetworkHostsUi - Item " + strB + " moved from " + i10 + " to " + i11, null, 2, null);
            if (strB != null) {
                abstractC4107k.s0(strB, i11);
            }
            return J.f24997a;
        }

        public final void f(z.N scaffoldPadding, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(scaffoldPadding, "scaffoldPadding");
            int i11 = (i10 & 6) == 0 ? i10 | (interfaceC3540l.T(scaffoldPadding) ? 4 : 2) : i10;
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1116307227, i11, -1, "com.ui.wifiman.ui.speed.hosts.NetworkHostsUi.<anonymous> (NetworkHostsUi.kt:116)");
            }
            interfaceC3540l.U(965585524);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = o1.f();
                interfaceC3540l.K(objF);
            }
            final androidx.compose.runtime.snapshots.k kVar = (androidx.compose.runtime.snapshots.k) objF;
            interfaceC3540l.J();
            AbstractC4107k.a aVar = (AbstractC4107k.a) o1.b(this.f33214a.n0(), null, interfaceC3540l, 0, 1).getValue();
            List listA = aVar.a();
            final LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(Zg.U.d(AbstractC3689v.w(listA, 10)), 16));
            for (Object obj : listA) {
                linkedHashMap.put(((C4101e) obj).b(), obj);
            }
            interfaceC3540l.U(965594538);
            Object objF2 = interfaceC3540l.f();
            InterfaceC3540l.a aVar2 = InterfaceC3540l.f21100a;
            if (objF2 == aVar2.a()) {
                objF2 = new InterfaceC6839p() { // from class: bf.r
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj2, Object obj3) {
                        return q.b.j(kVar, (jj.d) obj2, (jj.d) obj3);
                    }
                };
                interfaceC3540l.K(objF2);
            }
            InterfaceC6839p interfaceC6839p = (InterfaceC6839p) objF2;
            interfaceC3540l.J();
            interfaceC3540l.U(965601975);
            boolean zT = interfaceC3540l.T(this.f33214a);
            final AbstractC4107k abstractC4107k = this.f33214a;
            Object objF3 = interfaceC3540l.f();
            if (zT || objF3 == aVar2.a()) {
                objF3 = new InterfaceC6839p() { // from class: bf.s
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj2, Object obj3) {
                        return q.b.k(kVar, abstractC4107k, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                    }
                };
                interfaceC3540l.K(objF3);
            }
            interfaceC3540l.J();
            final jj.g gVarA = jj.h.a(interfaceC6839p, null, null, (InterfaceC6839p) objF3, 0.0f, null, interfaceC3540l, 6, 54);
            final EnumC4106j enumC4106j = (EnumC4106j) o1.b(this.f33214a.C(), null, interfaceC3540l, 0, 1).getValue();
            androidx.compose.ui.e eVarA = AbstractC6349a.a(jj.f.b(androidx.compose.foundation.layout.o.h(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), scaffoldPadding), gVarA), gVarA);
            B bY = gVarA.Y();
            interfaceC3540l.U(965622531);
            boolean zL = interfaceC3540l.l(gVarA) | interfaceC3540l.l(linkedHashMap) | interfaceC3540l.T(enumC4106j) | interfaceC3540l.T(this.f33214a);
            final AbstractC4107k abstractC4107k2 = this.f33214a;
            Object objF4 = interfaceC3540l.f();
            if (zL || objF4 == aVar2.a()) {
                Object obj2 = new InterfaceC6835l() { // from class: bf.t
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj3) {
                        return q.b.h(kVar, gVarA, linkedHashMap, enumC4106j, abstractC4107k2, (y) obj3);
                    }
                };
                interfaceC3540l.K(obj2);
                objF4 = obj2;
            }
            interfaceC3540l.J();
            AbstractC2395b.a(eVarA, bY, null, false, null, null, null, false, (InterfaceC6835l) objF4, interfaceC3540l, 0, 252);
            Integer numValueOf = Integer.valueOf(aVar.a().size());
            interfaceC3540l.U(965671867);
            boolean zT2 = interfaceC3540l.T(aVar);
            Object objF5 = interfaceC3540l.f();
            if (zT2 || objF5 == aVar2.a()) {
                objF5 = new C1163b(kVar, aVar, null);
                interfaceC3540l.K(objF5);
            }
            interfaceC3540l.J();
            O.f(numValueOf, (InterfaceC6839p) objF5, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            f((z.N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(bf.AbstractC4107k r31, T.InterfaceC3540l r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.q.b(bf.k, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(AbstractC4107k abstractC4107k, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(abstractC4107k, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
