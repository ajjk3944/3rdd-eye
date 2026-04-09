package F;

import E0.InterfaceC2629g;
import L0.C3174d;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Zg.AbstractC3689v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: F.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2712b {

    /* renamed from: a, reason: collision with root package name */
    private static final Yg.s f5002a = new Yg.s(AbstractC3689v.l(), AbstractC3689v.l());

    /* renamed from: F.b$a */
    static final class a implements C0.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5003a = new a();

        /* renamed from: F.b$a$a, reason: collision with other inner class name */
        static final class C0211a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f5004a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0211a(List list) {
                super(1);
                this.f5004a = list;
            }

            public final void a(t.a aVar) {
                List list = this.f5004a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    t.a.l(aVar, (androidx.compose.ui.layout.t) list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return Yg.J.f24997a;
            }
        }

        a() {
        }

        @Override // C0.C
        public final C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((C0.B) list.get(i10)).T(j10));
            }
            return androidx.compose.ui.layout.m.x0(mVar, Y0.b.l(j10), Y0.b.k(j10), null, new C0211a(arrayList), 4, null);
        }
    }

    /* renamed from: F.b$b, reason: collision with other inner class name */
    static final class C0212b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3174d f5005a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f5006b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5007c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0212b(C3174d c3174d, List list, int i10) {
            super(2);
            this.f5005a = c3174d;
            this.f5006b = list;
            this.f5007c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2712b.a(this.f5005a, this.f5006b, interfaceC3540l, L0.a(this.f5007c | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void a(C3174d c3174d, List list, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1794596951);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(c3174d) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(list) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1794596951, i11, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
            }
            int size = list.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                C3174d.c cVar = (C3174d.c) list.get(i13);
                mh.q qVar = (mh.q) cVar.a();
                int iB = cVar.b();
                int iC = cVar.c();
                a aVar = a.f5003a;
                e.a aVar2 = androidx.compose.ui.e.f28771b0;
                int iA = AbstractC3536j.a(interfaceC3540lR, i12);
                InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, aVar2);
                InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
                InterfaceC6824a interfaceC6824aA = aVar3.a();
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
                E1.c(interfaceC3540lA, aVar, aVar3.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
                InterfaceC6839p interfaceC6839pB = aVar3.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar3.f());
                qVar.s(c3174d.subSequence(iB, iC).k(), interfaceC3540lR, 0);
                interfaceC3540lR.R();
                i13++;
                i12 = 0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new C0212b(c3174d, list, i10));
        }
    }

    public static final boolean b(C3174d c3174d) {
        return c3174d.p("androidx.compose.foundation.text.inlineContent", 0, c3174d.k().length());
    }

    public static final Yg.s c(C3174d c3174d, Map map) {
        if (map == null || map.isEmpty()) {
            return f5002a;
        }
        List listJ = c3174d.j("androidx.compose.foundation.text.inlineContent", 0, c3174d.k().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3174d.c cVar = (C3174d.c) listJ.get(i10);
            C2729t c2729t = (C2729t) map.get(cVar.g());
            if (c2729t != null) {
                arrayList.add(new C3174d.c(c2729t.b(), cVar.h(), cVar.f()));
                arrayList2.add(new C3174d.c(c2729t.a(), cVar.h(), cVar.f()));
            }
        }
        return new Yg.s(arrayList, arrayList2);
    }
}
