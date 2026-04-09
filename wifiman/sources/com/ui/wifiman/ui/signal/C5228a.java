package com.ui.wifiman.ui.signal;

import F9.r0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Te.E;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import s9.d;
import sa.AbstractC7930a;
import sh.AbstractC7978m;
import sh.C7974i;

/* renamed from: com.ui.wifiman.ui.signal.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5228a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5228a f44791a = new C5228a();

    /* renamed from: b, reason: collision with root package name */
    public static mh.r f44792b = b0.c.c(1802472326, false, C1605a.f44794a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f44793c = b0.c.c(1550894442, false, b.f44795a);

    /* renamed from: com.ui.wifiman.ui.signal.a$a, reason: collision with other inner class name */
    static final class C1605a implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        public static final C1605a f44794a = new C1605a();

        C1605a() {
        }

        public final void a(androidx.compose.ui.e itemModifier, Te.E item, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(itemModifier, "itemModifier");
            AbstractC6492s.i(item, "item");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(itemModifier) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? interfaceC3540l.T(item) : interfaceC3540l.l(item) ? 32 : 16;
            }
            if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1802472326, i11, -1, "com.ui.wifiman.ui.signal.ComposableSingletons$SignalTabPlaceDetailUiKt.lambda-1.<anonymous> (SignalTabPlaceDetailUi.kt:66)");
            }
            if (!(item instanceof E.a)) {
                throw new NoWhenBranchMatchedException();
            }
            E.a aVar = (E.a) item;
            r0.f(itemModifier, AbstractC7930a.b(aVar.a(), interfaceC3540l, 0), null, AbstractC7930a.b(aVar.b(), interfaceC3540l, 0), null, 0, null, null, null, false, null, null, null, null, null, interfaceC3540l, i11 & 14, 0, 32756);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((androidx.compose.ui.e) obj, (Te.E) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: com.ui.wifiman.ui.signal.a$b */
    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44795a = new b();

        /* renamed from: com.ui.wifiman.ui.signal.a$b$a, reason: collision with other inner class name */
        public static final class C1606a extends E {

            /* renamed from: g, reason: collision with root package name */
            private final Li.N f44796g = Li.P.a(new d.c("Living Room"));

            /* renamed from: h, reason: collision with root package name */
            private final Li.z f44797h;

            C1606a() {
                C7974i c7974iS = AbstractC7978m.s(0, 10);
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(c7974iS, 10));
                Iterator it = c7974iS.iterator();
                while (it.hasNext()) {
                    int iD = ((Zg.Q) it).d();
                    arrayList.add(new E.a(String.valueOf(iD), new d.c("Name " + iD), new d.c("Value " + iD)));
                }
                this.f44797h = Li.P.a(arrayList);
            }

            @Override // org.kodein.di.c
            public DI d() {
                throw new IllegalStateException();
            }

            @Override // com.ui.wifiman.ui.signal.E
            public Li.N getTitle() {
                return this.f44796g;
            }

            @Override // com.ui.wifiman.ui.signal.E
            public void p0() {
            }

            @Override // com.ui.wifiman.ui.signal.E
            /* renamed from: q0, reason: merged with bridge method [inline-methods] */
            public Li.z n0() {
                return this.f44797h;
            }
        }

        b() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1550894442, i10, -1, "com.ui.wifiman.ui.signal.ComposableSingletons$SignalTabPlaceDetailUiKt.lambda-2.<anonymous> (SignalTabPlaceDetailUi.kt:81)");
            }
            G.b(null, new C1606a(), interfaceC3540l, 0, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public final mh.r a() {
        return f44792b;
    }
}
