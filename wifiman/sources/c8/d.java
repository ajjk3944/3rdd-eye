package C8;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Te.K0;
import Zg.AbstractC3689v;
import android.content.Context;
import b8.EnumC4076c;
import com.ubnt.usurvey.R;
import gg.AbstractC5912b;
import gg.i;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import je.AbstractC6317r;
import je.u;
import ke.AbstractC6458c;
import kg.InterfaceC6465b;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import mh.q;
import nd.C6934f;
import nd.InterfaceC6935g;
import s9.d;

/* loaded from: classes3.dex */
public final class d implements C8.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6084a f2353a;

    /* renamed from: b, reason: collision with root package name */
    private final i f2354b;

    /* renamed from: c, reason: collision with root package name */
    private final i f2355c;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2356a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(AbstractC6317r it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof AbstractC6317r.b.a) {
                return new C6556a(((AbstractC6317r.b.a) it).i());
            }
            if ((it instanceof AbstractC6317r.b.C1875b) || (it instanceof AbstractC6317r.a)) {
                return new C6556a(null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V7.b f2357a;

        b(V7.b bVar) {
            this.f2357a = bVar;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            String string;
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(1925930080);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1925930080, i10, -1, "com.ubnt.usurvey.ui.signal.places.SignalTabPlacesCardOperatorImpl.getCellularConnectionInfoText.<anonymous> (SignalTabPlacesCardOperatorImpl.kt:36)");
            }
            if (this.f2357a != null) {
                String string2 = it.getString(R.string.value_chain_with_delimiter_2);
                AbstractC6492s.h(string2, "getString(...)");
                string = String.format(string2, Arrays.copyOf(new Object[]{it.getString(R.string.active_network_connection_type_cellular), it.getString(Ne.a.a(this.f2357a))}, 2));
                AbstractC6492s.h(string, "format(...)");
            } else {
                string = it.getString(R.string.active_network_connection_type_cellular);
                AbstractC6492s.f(string);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return string;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class c implements InterfaceC6465b {
        c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List places, C6556a c6556a) {
            AbstractC6492s.i(places, "places");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6458c abstractC6458c = (AbstractC6458c) c6556a.a();
            List<C6934f> list = places;
            d dVar = d.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            for (C6934f c6934f : list) {
                c6934f.r();
                arrayList.add(new K0.h(dVar.e(c6934f, AbstractC6492s.d(abstractC6458c != null ? abstractC6458c.b() : null, c6934f.r()))));
            }
            return arrayList;
        }
    }

    public d(InterfaceC6935g placesManager, u wifiWifiConnectionService, InterfaceC6084a viewRouter) {
        AbstractC6492s.i(placesManager, "placesManager");
        AbstractC6492s.i(wifiWifiConnectionService, "wifiWifiConnectionService");
        AbstractC6492s.i(viewRouter, "viewRouter");
        this.f2353a = viewRouter;
        i iVarW = wifiWifiConnectionService.a().N0(a.f2356a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f2354b = iVarW;
        i iVarI2 = i.v(placesManager.h(), iVarW, new c()).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f2355c = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Te.C3572b0 e(nd.C6934f r13, boolean r14) {
        /*
            r12 = this;
            S8.l r0 = r13.l()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2b
            S8.l r0 = r13.l()
            java.lang.String r3 = r13.b()
            if (r3 != 0) goto L16
            java.lang.String r3 = r13.a()
        L16:
            if (r3 == 0) goto L28
            boolean r4 = kotlin.text.t.m0(r3)
            if (r4 != 0) goto L1f
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r3 == 0) goto L28
            s9.d$c r4 = new s9.d$c
            r4.<init>(r3)
            goto L29
        L28:
            r4 = r2
        L29:
            r9 = r4
            goto L60
        L2b:
            java.lang.Integer r0 = r13.q()
            if (r0 != 0) goto L32
            goto L4b
        L32:
            int r0 = r0.intValue()
            if (r0 != r1) goto L4b
            V7.a r0 = r13.p()
            if (r0 == 0) goto L4b
            V7.a r0 = r13.p()
            V7.b r3 = r13.o()
            s9.d r4 = r12.f(r3)
            goto L29
        L4b:
            V7.a r0 = r13.n()
            if (r0 == 0) goto L5e
            V7.a r0 = r13.n()
            V7.b r3 = r13.m()
            s9.d r4 = r12.f(r3)
            goto L29
        L5e:
            r0 = r2
            r9 = r0
        L60:
            Te.b0 r11 = new Te.b0
            java.lang.String r4 = r13.g()
            s9.d$c r5 = new s9.d$c
            java.lang.String r3 = r13.j()
            r5.<init>(r3)
            b8.c r3 = r12.g(r13)
            s9.b r6 = com.ui.wifiman.ui.component.network.AbstractC5218p.a(r3)
            b8.c r3 = r12.g(r13)
            java.lang.String r13 = r13.r()
            s9.d r7 = com.ui.wifiman.ui.component.network.AbstractC5218p.b(r3, r13)
            if (r0 == 0) goto L8a
            r13 = 2
            s9.d r2 = Ne.f.h(r0, r1, r2, r13, r2)
        L8a:
            r8 = r2
            r3 = r11
            r10 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: C8.d.e(nd.f, boolean):Te.b0");
    }

    private final s9.d f(V7.b bVar) {
        return new d.a(String.valueOf(bVar), new b(bVar));
    }

    private final EnumC4076c g(C6934f c6934f) {
        return c6934f.l() != null ? EnumC4076c.WIFI : (c6934f.n() == null && c6934f.p() == null) ? EnumC4076c.ETHERNET : EnumC4076c.MOBILE;
    }

    @Override // C8.c
    public AbstractC5912b a(String id2) {
        AbstractC6492s.i(id2, "id");
        return this.f2353a.a(new InterfaceC6084a.b.p.C1838b(id2));
    }

    @Override // C8.c
    public i b() {
        return this.f2355c;
    }

    @Override // C8.c
    public AbstractC5912b c() {
        return this.f2353a.a(InterfaceC6084a.b.p.C1837a.f48941a);
    }
}
