package B9;

import A.InterfaceC2396c;
import A.y;
import C0.C;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import Yg.J;
import f0.c;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import mh.r;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import z.C8680c;
import z.W;
import z.Z;

/* loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B9.a$a, reason: collision with other inner class name */
    public static final class C0049a implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final C0049a f1234a = new C0049a();

        C0049a() {
        }

        public final Void a(int i10) {
            return null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class b implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f1235a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1236b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f1237c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f1238d;

        /* renamed from: B9.a$b$a, reason: collision with other inner class name */
        static final class C0050a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f1239a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f1240b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1241c;

            C0050a(boolean z10, q qVar, int i10) {
                this.f1239a = z10;
                this.f1240b = qVar;
                this.f1241c = i10;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1000034518, i10, -1, "com.ui.core.ui.component.list.actionItems.<anonymous>.<anonymous>.<anonymous> (ActionLazyListScope.kt:41)");
                }
                if (this.f1239a) {
                    this.f1240b.s(Integer.valueOf(this.f1241c), interfaceC3540l, 0);
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        b(boolean z10, boolean z11, q qVar, q qVar2) {
            this.f1235a = z10;
            this.f1236b = z11;
            this.f1237c = qVar;
            this.f1238d = qVar2;
        }

        public final void a(InterfaceC2396c items, int i10, InterfaceC3540l interfaceC3540l, int i11) {
            int i12;
            AbstractC6492s.i(items, "$this$items");
            if ((i11 & 48) == 0) {
                i12 = i11 | (interfaceC3540l.i(i10) ? 32 : 16);
            } else {
                i12 = i11;
            }
            if ((i12 & 145) == 144 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2056269741, i12, -1, "com.ui.core.ui.component.list.actionItems.<anonymous> (ActionLazyListScope.kt:34)");
            }
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            c.InterfaceC1752c interfaceC1752cI = f0.c.f46573a.i();
            boolean z10 = this.f1235a;
            boolean z11 = this.f1236b;
            q qVar = this.f1237c;
            q qVar2 = this.f1238d;
            C cB = W.b(C8680c.f66832a.f(), interfaceC1752cI, interfaceC3540l, 48);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            Z z12 = Z.f66823a;
            if (z10) {
                interfaceC3540l.U(1513963619);
                AbstractC7385d.e(z12, z11, null, null, null, null, b0.c.e(-1000034518, true, new C0050a(z11, qVar, i10), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(1514184742);
                qVar.s(Integer.valueOf(i10), interfaceC3540l, Integer.valueOf((i12 >> 3) & 14));
                interfaceC3540l.J();
            }
            qVar2.s(Integer.valueOf(i10), interfaceC3540l, Integer.valueOf((i12 >> 3) & 14));
            interfaceC3540l.R();
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

    public static final void a(y yVar, List items, InterfaceC6835l itemId, InterfaceC6835l contentType, boolean z10, boolean z11, q actionContent, q itemContent) {
        AbstractC6492s.i(yVar, "<this>");
        AbstractC6492s.i(items, "items");
        AbstractC6492s.i(itemId, "itemId");
        AbstractC6492s.i(contentType, "contentType");
        AbstractC6492s.i(actionContent, "actionContent");
        AbstractC6492s.i(itemContent, "itemContent");
        yVar.a(items.size(), itemId, contentType, b0.c.c(-2056269741, true, new b(z11, z10, actionContent, itemContent)));
    }
}
