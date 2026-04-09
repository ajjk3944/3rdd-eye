package com.ui.wifiman.ui.signal;

import A.AbstractC2395b;
import A.InterfaceC2396c;
import C9.i;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Te.AbstractC3600t;
import Te.AbstractC3604x;
import Te.C3597p;
import Zg.AbstractC3689v;
import android.content.res.Resources;
import com.ui.wifiman.ui.signal.AbstractC5230c;
import com.ui.wifiman.ui.signal.AbstractC5239l;
import dh.InterfaceC5380e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import s9.b;
import s9.d;
import sh.AbstractC7978m;
import sh.C7974i;
import z.InterfaceC8687j;

/* loaded from: classes4.dex */
public abstract class r {

    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, AbstractC5240m.class, "onCreateFloorplanClicked", "onCreateFloorplanClicked()V", 0);
        }

        public final void a() {
            ((AbstractC5240m) this.receiver).p0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class b implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5240m f44848a;

        /* synthetic */ class a extends C6490p implements InterfaceC6839p {
            a(Object obj) {
                super(2, obj, AbstractC5240m.class, "loadFloorplanController", "loadFloorplanController(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final Object a(long j10, InterfaceC5380e interfaceC5380e) {
                return ((AbstractC5240m) this.receiver).o0(j10, interfaceC5380e);
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).longValue(), (InterfaceC5380e) obj2);
            }
        }

        b(AbstractC5240m abstractC5240m) {
            this.f44848a = abstractC5240m;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6839p invoke() {
            return new a(this.f44848a);
        }
    }

    static final class c implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5240m f44849a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5230c f44850b;

        c(AbstractC5240m abstractC5240m, AbstractC5230c abstractC5230c) {
            this.f44849a = abstractC5240m;
            this.f44850b = abstractC5230c;
        }

        public final void a() {
            this.f44849a.r0(((AbstractC5230c.b) this.f44850b).c().a());
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class d implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5240m f44851a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5230c f44852b;

        d(AbstractC5240m abstractC5240m, AbstractC5230c abstractC5230c) {
            this.f44851a = abstractC5240m;
            this.f44852b = abstractC5230c;
        }

        public final void a() {
            this.f44851a.q0(((AbstractC5230c.b) this.f44852b).c().a());
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class e implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5240m f44853a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5230c f44854b;

        e(AbstractC5240m abstractC5240m, AbstractC5230c abstractC5230c) {
            this.f44853a = abstractC5240m;
            this.f44854b = abstractC5230c;
        }

        public final void a() {
            this.f44853a.t0(((AbstractC5230c.b) this.f44854b).c().a());
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class f implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5230c f44855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5240m f44856b;

        static final class a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            public static final a f44857a = new a();

            a() {
            }

            public final long a(InterfaceC3540l interfaceC3540l, int i10) {
                interfaceC3540l.U(-58973859);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-58973859, i10, -1, "com.ui.wifiman.ui.signal.SignalTabFloorplanUiContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignalTabFloorplanUiContent.kt:96)");
                }
                long jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().h().f();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return jF;
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return C6733v0.g(a((InterfaceC3540l) obj, ((Number) obj2).intValue()));
            }
        }

        static final class b implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5240m f44858a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5230c f44859b;

            b(AbstractC5240m abstractC5240m, AbstractC5230c abstractC5230c) {
                this.f44858a = abstractC5240m;
                this.f44859b = abstractC5230c;
            }

            public final void a() {
                this.f44858a.s0(((AbstractC5230c.C1607c) this.f44859b).c());
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        static final class c implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f44860a = new c();

            c() {
            }

            public final void a() {
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        f(AbstractC5230c abstractC5230c, AbstractC5240m abstractC5240m) {
            this.f44855a = abstractC5230c;
            this.f44856b = abstractC5240m;
        }

        public final void a(InterfaceC8687j UiContentCard, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiContentCard, "$this$UiContentCard");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(37376819, i10, -1, "com.ui.wifiman.ui.signal.SignalTabFloorplanUiContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignalTabFloorplanUiContent.kt:91)");
            }
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            C9.i iVar = new C9.i("requirement", N9.b.f16117a.v().f(new b.C2145b("orange", a.f44857a)), r.l(((AbstractC5230c.C1607c) this.f44855a).c()), new i.a.b(new d.b(AbstractC6780c.f53334J1)), null, 16, null);
            interfaceC3540l.U(1011450099);
            boolean zT = interfaceC3540l.T(this.f44856b) | interfaceC3540l.T(this.f44855a);
            AbstractC5240m abstractC5240m = this.f44856b;
            AbstractC5230c abstractC5230c = this.f44855a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new b(abstractC5240m, abstractC5230c);
                interfaceC3540l.K(objF);
            }
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF;
            interfaceC3540l.J();
            interfaceC3540l.U(1011453401);
            Object objF2 = interfaceC3540l.f();
            if (objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = c.f44860a;
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            C9.s.o(eVarH, iVar, false, interfaceC6824a, (InterfaceC6824a) objF2, null, interfaceC3540l, 24582, 36);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f44861a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f44862b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC6835l interfaceC6835l, List list) {
            super(1);
            this.f44861a = interfaceC6835l;
            this.f44862b = list;
        }

        public final Object a(int i10) {
            return this.f44861a.invoke(this.f44862b.get(i10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f44863a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f44864b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC6835l interfaceC6835l, List list) {
            super(1);
            this.f44863a = interfaceC6835l;
            this.f44864b = list;
        }

        public final Object a(int i10) {
            return this.f44863a.invoke(this.f44864b.get(i10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class i extends AbstractC6494u implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f44865a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5240m f44866b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List list, AbstractC5240m abstractC5240m) {
            super(4);
            this.f44865a = list;
            this.f44866b = abstractC5240m;
        }

        public final void a(InterfaceC2396c interfaceC2396c, int i10, InterfaceC3540l interfaceC3540l, int i11) throws Resources.NotFoundException {
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
            AbstractC5230c abstractC5230c = (AbstractC5230c) this.f44865a.get(i10);
            interfaceC3540l.U(-1918365917);
            if (abstractC5230c instanceof AbstractC5230c.d) {
                interfaceC3540l.U(-1918380798);
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                C6562a c6562a = C6562a.f52458a;
                int i13 = C6562a.f52459b;
                androidx.compose.ui.e eVarB = InterfaceC2396c.b(interfaceC2396c, androidx.compose.foundation.layout.o.l(eVarH, c6562a.d(interfaceC3540l, i13).a().a().d(), c6562a.d(interfaceC3540l, i13).a().b().d(), c6562a.d(interfaceC3540l, i13).a().a().d(), c6562a.d(interfaceC3540l, i13).a().b().c()), null, 1, null);
                String strA = H0.f.a(AbstractC6780c.f53576s2, interfaceC3540l, 0);
                interfaceC3540l.U(-477505036);
                boolean zT = interfaceC3540l.T(this.f44866b);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new a(this.f44866b);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                w9.r.b(eVarB, (InterfaceC6824a) ((th.g) objF), ((AbstractC5230c.d) abstractC5230c).c(), false, null, null, strA, null, interfaceC3540l, 0, 184);
                interfaceC3540l.J();
            } else if (abstractC5230c instanceof AbstractC5230c.b) {
                interfaceC3540l.U(-1917581060);
                androidx.compose.ui.e eVarB2 = InterfaceC2396c.b(interfaceC2396c, androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, 1, null);
                C3597p c3597pC = ((AbstractC5230c.b) abstractC5230c).c();
                interfaceC3540l.U(-477490569);
                boolean zT2 = interfaceC3540l.T(this.f44866b);
                Object objF2 = interfaceC3540l.f();
                if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new b(this.f44866b);
                    interfaceC3540l.K(objF2);
                }
                InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF2;
                interfaceC3540l.J();
                interfaceC3540l.U(-477488223);
                boolean zT3 = interfaceC3540l.T(this.f44866b) | interfaceC3540l.T(abstractC5230c);
                Object objF3 = interfaceC3540l.f();
                if (zT3 || objF3 == InterfaceC3540l.f21100a.a()) {
                    objF3 = new c(this.f44866b, abstractC5230c);
                    interfaceC3540l.K(objF3);
                }
                InterfaceC6824a interfaceC6824a2 = (InterfaceC6824a) objF3;
                interfaceC3540l.J();
                interfaceC3540l.U(-477485501);
                boolean zT4 = interfaceC3540l.T(this.f44866b) | interfaceC3540l.T(abstractC5230c);
                Object objF4 = interfaceC3540l.f();
                if (zT4 || objF4 == InterfaceC3540l.f21100a.a()) {
                    objF4 = new d(this.f44866b, abstractC5230c);
                    interfaceC3540l.K(objF4);
                }
                InterfaceC6824a interfaceC6824a3 = (InterfaceC6824a) objF4;
                interfaceC3540l.J();
                interfaceC3540l.U(-477482750);
                boolean zT5 = interfaceC3540l.T(this.f44866b) | interfaceC3540l.T(abstractC5230c);
                Object objF5 = interfaceC3540l.f();
                if (zT5 || objF5 == InterfaceC3540l.f21100a.a()) {
                    objF5 = new e(this.f44866b, abstractC5230c);
                    interfaceC3540l.K(objF5);
                }
                interfaceC3540l.J();
                AbstractC3600t.f(eVarB2, c3597pC, interfaceC6824a, interfaceC6824a2, interfaceC6824a3, (InterfaceC6824a) objF5, interfaceC3540l, 0);
                interfaceC3540l.J();
            } else if (abstractC5230c instanceof AbstractC5230c.a) {
                interfaceC3540l.U(-477478650);
                AbstractC3604x.f(InterfaceC2396c.b(interfaceC2396c, androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, 1, null), interfaceC3540l, 0);
                interfaceC3540l.J();
            } else {
                if (!(abstractC5230c instanceof AbstractC5230c.C1607c)) {
                    interfaceC3540l.U(-477524768);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(-1916681719);
                B9.h.i(InterfaceC2396c.b(interfaceC2396c, androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), Y0.h.j(4)), null, 1, null), null, null, null, null, null, null, null, b0.c.e(37376819, true, new f(abstractC5230c, this.f44866b), interfaceC3540l, 54), interfaceC3540l, 100663296, 254);
                interfaceC3540l.J();
            }
            interfaceC3540l.J();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) throws Resources.NotFoundException {
            a((InterfaceC2396c) obj, ((Number) obj2).intValue(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void e(androidx.compose.ui.e eVar, final AbstractC5240m vm, final AbstractC5239l.a content, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        androidx.compose.ui.e eVar3;
        AbstractC6492s.i(vm, "vm");
        AbstractC6492s.i(content, "content");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-2056307157);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(vm) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.T(content) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2056307157, i12, -1, "com.ui.wifiman.ui.signal.SignalTabFloorplanUiContent (SignalTabFloorplanUiContent.kt:36)");
            }
            final List listK = k(content, interfaceC3540lR, (i12 >> 6) & 14);
            z.N nE = androidx.compose.foundation.layout.o.e(0.0f, C6562a.f52458a.d(interfaceC3540lR, C6562a.f52459b).a().b().c(), 0.0f, 0.0f, 13, null);
            interfaceC3540lR.U(-443287157);
            boolean zL = interfaceC3540lR.l(listK) | ((i12 & 112) == 32);
            Object objF = interfaceC3540lR.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.signal.n
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return r.g(listK, vm, (A.y) obj);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            AbstractC2395b.a(eVar3, null, nE, false, null, null, null, false, (InterfaceC6835l) objF, interfaceC3540lR, i12 & 14, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar4 = eVar3;
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.signal.o
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return r.f(eVar4, vm, content, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(androidx.compose.ui.e eVar, AbstractC5240m abstractC5240m, AbstractC5239l.a aVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, abstractC5240m, aVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(List list, AbstractC5240m abstractC5240m, A.y LazyColumn) {
        AbstractC6492s.i(LazyColumn, "$this$LazyColumn");
        LazyColumn.a(list.size(), new g(new InterfaceC6835l() { // from class: com.ui.wifiman.ui.signal.p
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return r.h((AbstractC5230c) obj);
            }
        }, list), new h(new InterfaceC6835l() { // from class: com.ui.wifiman.ui.signal.q
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return r.i((AbstractC5230c) obj);
            }
        }, list), b0.c.c(-632812321, true, new i(list, abstractC5240m)));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(AbstractC5230c it) {
        AbstractC6492s.i(it, "it");
        return it.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(AbstractC5230c it) {
        AbstractC6492s.i(it, "it");
        return it.b();
    }

    private static final List k(AbstractC5239l abstractC5239l, InterfaceC3540l interfaceC3540l, int i10) {
        List listL;
        interfaceC3540l.U(-787375872);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-787375872, i10, -1, "com.ui.wifiman.ui.signal.listItems (SignalTabFloorplanUiContent.kt:121)");
        }
        if (abstractC5239l instanceof AbstractC5239l.a) {
            AbstractC5239l.a aVar = (AbstractC5239l.a) abstractC5239l;
            if (aVar.e()) {
                C7974i c7974iS = AbstractC7978m.s(0, 2);
                listL = new ArrayList(AbstractC3689v.w(c7974iS, 10));
                Iterator it = c7974iS.iterator();
                while (it.hasNext()) {
                    listL.add(new AbstractC5230c.a(String.valueOf(((Zg.Q) it).d())));
                }
            } else {
                listL = new ArrayList();
                Iterator it2 = aVar.d().iterator();
                while (it2.hasNext()) {
                    listL.add(new AbstractC5230c.C1607c((AbstractC5239l.b.AbstractC1612b.d) it2.next()));
                }
                if (aVar.a()) {
                    listL.add(new AbstractC5230c.d(aVar.b()));
                }
                List listC = aVar.c();
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(listC, 10));
                Iterator it3 = listC.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new AbstractC5230c.b((C3597p) it3.next()));
                }
                listL.addAll(arrayList);
            }
        } else {
            if (!(abstractC5239l instanceof AbstractC5239l.b)) {
                throw new NoWhenBranchMatchedException();
            }
            listL = AbstractC3689v.l();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return listL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s9.d l(AbstractC5239l.b.AbstractC1612b.d dVar) {
        if (dVar instanceof AbstractC5239l.b.AbstractC1612b.d.C1614b) {
            return new d.b(AbstractC6780c.f53320H1);
        }
        if (dVar instanceof AbstractC5239l.b.AbstractC1612b.d.c) {
            return new d.b(AbstractC6780c.f53327I1);
        }
        if (dVar instanceof AbstractC5239l.b.AbstractC1612b.d.a) {
            return new d.b(AbstractC6780c.f53271A1);
        }
        throw new NoWhenBranchMatchedException();
    }
}
