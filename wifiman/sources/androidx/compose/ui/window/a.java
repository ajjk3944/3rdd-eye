package androidx.compose.ui.window;

import C0.B;
import C0.C;
import C0.D;
import E0.InterfaceC2629g;
import J0.w;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.K;
import T.L;
import T.L0;
import T.X0;
import T.z1;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.ui.layout.t;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.compose.ui.window.a$a, reason: collision with other inner class name */
    static final class C1082a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f29867a;

        /* renamed from: androidx.compose.ui.window.a$a$a, reason: collision with other inner class name */
        public static final class C1083a implements K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f29868a;

            public C1083a(j jVar) {
                this.f29868a = jVar;
            }

            @Override // T.K
            public void dispose() {
                this.f29868a.dismiss();
                this.f29868a.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1082a(j jVar) {
            super(1);
            this.f29867a = jVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke(L l10) {
            this.f29867a.show();
            return new C1083a(this.f29867a);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f29869a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f29870b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f29871c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y0.t f29872d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar, InterfaceC6824a interfaceC6824a, i iVar, Y0.t tVar) {
            super(0);
            this.f29869a = jVar;
            this.f29870b = interfaceC6824a;
            this.f29871c = iVar;
            this.f29872d = tVar;
        }

        public final void a() {
            this.f29869a.o(this.f29870b, this.f29871c, this.f29872d);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f29873a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f29874b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f29875c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29876d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f29877e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6824a interfaceC6824a, i iVar, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f29873a = interfaceC6824a;
            this.f29874b = iVar;
            this.f29875c = interfaceC6839p;
            this.f29876d = i10;
            this.f29877e = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            a.a(this.f29873a, this.f29874b, this.f29875c, interfaceC3540l, L0.a(this.f29876d | 1), this.f29877e);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f29878a;

        /* renamed from: androidx.compose.ui.window.a$d$a, reason: collision with other inner class name */
        static final class C1084a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final C1084a f29879a = new C1084a();

            C1084a() {
                super(1);
            }

            public final void a(w wVar) {
                J0.t.k(wVar);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((w) obj);
                return J.f24997a;
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1 f29880a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(z1 z1Var) {
                super(2);
                this.f29880a = z1Var;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-533674951, i10, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:188)");
                }
                a.b(this.f29880a).invoke(interfaceC3540l, 0);
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
        d(z1 z1Var) {
            super(2);
            this.f29878a = z1Var;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(488261145, i10, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:185)");
            }
            a.c(J0.m.c(androidx.compose.ui.e.f28771b0, false, C1084a.f29879a, 1, null), b0.c.e(-533674951, true, new b(this.f29878a), interfaceC3540l, 54), interfaceC3540l, 48, 0);
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

    static final class e extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f29881a = new e();

        e() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    static final class f implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final f f29882a = new f();

        /* renamed from: androidx.compose.ui.window.a$f$a, reason: collision with other inner class name */
        static final class C1085a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f29883a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1085a(List list) {
                super(1);
                this.f29883a = list;
            }

            public final void a(t.a aVar) {
                List list = this.f29883a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    t.a.l(aVar, (androidx.compose.ui.layout.t) list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return J.f24997a;
            }
        }

        f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v15 */
        /* JADX WARN: Type inference failed for: r13v17 */
        /* JADX WARN: Type inference failed for: r13v18 */
        /* JADX WARN: Type inference failed for: r13v23 */
        @Override // C0.C
        public final D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
            Object obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((B) list.get(i10)).T(j10));
            }
            androidx.compose.ui.layout.t tVar = null;
            int i11 = 1;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int iI0 = ((androidx.compose.ui.layout.t) obj).I0();
                int iN = AbstractC3689v.n(arrayList);
                if (1 <= iN) {
                    int i12 = 1;
                    while (true) {
                        Object obj2 = arrayList.get(i12);
                        int iI02 = ((androidx.compose.ui.layout.t) obj2).I0();
                        if (iI0 < iI02) {
                            obj = obj2;
                            iI0 = iI02;
                        }
                        if (i12 == iN) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            androidx.compose.ui.layout.t tVar2 = (androidx.compose.ui.layout.t) obj;
            int iI03 = tVar2 != null ? tVar2.I0() : Y0.b.n(j10);
            if (!arrayList.isEmpty()) {
                ?? r13 = arrayList.get(0);
                int iC0 = ((androidx.compose.ui.layout.t) r13).C0();
                int iN2 = AbstractC3689v.n(arrayList);
                boolean z10 = r13;
                if (1 <= iN2) {
                    while (true) {
                        Object obj3 = arrayList.get(i11);
                        int iC02 = ((androidx.compose.ui.layout.t) obj3).C0();
                        r13 = z10;
                        if (iC0 < iC02) {
                            r13 = obj3;
                            iC0 = iC02;
                        }
                        if (i11 == iN2) {
                            break;
                        }
                        i11++;
                        z10 = r13;
                    }
                }
                tVar = r13;
            }
            androidx.compose.ui.layout.t tVar3 = tVar;
            return androidx.compose.ui.layout.m.x0(mVar, iI03, tVar3 != null ? tVar3.C0() : Y0.b.m(j10), null, new C1085a(arrayList), 4, null);
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f29884a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f29885b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29886c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29887d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f29884a = eVar;
            this.f29885b = interfaceC6839p;
            this.f29886c = i10;
            this.f29887d = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            a.c(this.f29884a, this.f29885b, interfaceC3540l, L0.a(this.f29886c | 1), this.f29887d);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(mh.InterfaceC6824a r23, androidx.compose.ui.window.i r24, mh.InterfaceC6839p r25, T.InterfaceC3540l r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.a.a(mh.a, androidx.compose.ui.window.i, mh.p, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6839p b(z1 z1Var) {
        return (InterfaceC6839p) z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1177876616);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1177876616, i12, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:464)");
            }
            f fVar = f.f29882a;
            int i14 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & 112);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
            int i15 = ((i14 << 6) & 896) | 6;
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, fVar, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            interfaceC6839p.invoke(interfaceC3540lR, Integer.valueOf((i15 >> 6) & 14));
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new g(eVar, interfaceC6839p, i10, i11));
        }
    }
}
