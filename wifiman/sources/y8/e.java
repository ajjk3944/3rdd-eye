package y8;

import Af.p;
import Cc.InterfaceC2557a;
import Te.B0;
import Te.H;
import Te.J;
import Te.M;
import Te.N;
import W7.f;
import Zg.AbstractC3689v;
import a8.C3771a;
import a8.C3772b;
import com.ubnt.usurvey.R;
import gc.EnumC5895b;
import h9.C5969a;
import java.util.ArrayList;
import java.util.List;
import je.AbstractC6317r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import n8.AbstractC6912m;
import re.InterfaceC7588a;
import re.InterfaceC7601n;
import s9.InterfaceC7929a;
import s9.d;

/* loaded from: classes3.dex */
public final class e extends f implements y8.d {

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f66433d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f66434e;

    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f66435a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC7588a.b state) {
            AbstractC6492s.i(state, "state");
            if (state instanceof InterfaceC7588a.b.C2111a) {
                return ((InterfaceC7588a.b.C2111a) state).b().c();
            }
            if (!(state instanceof InterfaceC7588a.b.C2112b)) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarJ0 = gg.i.j0();
            AbstractC6492s.h(iVarJ0, "empty(...)");
            return iVarJ0;
        }
    }

    static final class b implements kg.n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J apply(List apComparison) {
            AbstractC6492s.i(apComparison, "apComparison");
            e eVar = e.this;
            List listC = AbstractC3689v.c();
            List list = apComparison;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                arrayList.add(Boolean.valueOf(listC.addAll(eVar.l((InterfaceC7601n.a) obj, eVar.n(i10)))));
                i10 = i11;
            }
            return new J(EnumC5895b.SIGNAL, AbstractC3689v.a(listC), M.b.C0800b.f21723a, e.this.e(), AbstractC3689v.l(), AbstractC3689v.l());
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f66437a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC7588a.b state) {
            AbstractC6492s.i(state, "state");
            if (state instanceof InterfaceC7588a.b.C2111a) {
                return ((InterfaceC7588a.b.C2111a) state).b().c();
            }
            if (!(state instanceof InterfaceC7588a.b.C2112b)) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarJ0 = gg.i.j0();
            AbstractC6492s.h(iVarJ0, "empty(...)");
            return iVarJ0;
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f66438a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(AbstractC6317r it) {
            AbstractC6492s.i(it, "it");
            AbstractC6317r.b.a aVar = it instanceof AbstractC6317r.b.a ? (AbstractC6317r.b.a) it : null;
            return new C6556a(aVar != null ? aVar.c() : null);
        }
    }

    /* renamed from: y8.e$e, reason: collision with other inner class name */
    static final class C2359e implements kg.g {
        C2359e() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(List apComparison, C6556a c6556a, C3771a devices) {
            AbstractC6492s.i(apComparison, "apComparison");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(devices, "devices");
            C5969a c5969a = (C5969a) c6556a.a();
            e eVar = e.this;
            List listC = AbstractC3689v.c();
            int i10 = 0;
            for (Object obj : apComparison) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                InterfaceC7601n.a aVar = (InterfaceC7601n.a) obj;
                InterfaceC7588a.C2110a c2110aA = aVar.a();
                N n10 = eVar.n(i10);
                InterfaceC2557a interfaceC2557a = (InterfaceC2557a) devices.a(C3772b.f25747c.b(aVar.a().b()));
                Wc.c cVar = (Wc.c) AbstractC3689v.D0(aVar.b());
                listC.add(eVar.o(c2110aA, n10, interfaceC2557a, cVar != null ? (S8.l) cVar.d() : null, AbstractC6492s.d(aVar.a().b(), c5969a)));
                i10 = i11;
            }
            return AbstractC3689v.a(listC);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC7588a wmwApComparison, je.u wifiConnectionService, Cc.n wifimanDeviceManager) {
        super(null);
        AbstractC6492s.i(wmwApComparison, "wmwApComparison");
        AbstractC6492s.i(wifiConnectionService, "wifiConnectionService");
        AbstractC6492s.i(wifimanDeviceManager, "wifimanDeviceManager");
        gg.i iVarI1 = wmwApComparison.getState().I1(a.f66435a);
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        gg.i iVarI2 = g(iVarI1).N0(new b()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f66433d = iVarI2;
        gg.i iVarU = gg.i.u(wmwApComparison.getState().I1(c.f66437a), wifiConnectionService.a().N0(d.f66438a).W(), wifimanDeviceManager.a(), new C2359e());
        AbstractC6492s.h(iVarU, "combineLatest(...)");
        this.f66434e = iVarU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List l(re.InterfaceC7601n.a r20, Te.N r21) {
        /*
            r19 = this;
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            kotlin.jvm.internal.N r2 = new kotlin.jvm.internal.N
            r2.<init>()
            long r3 = java.lang.System.currentTimeMillis()
            java.util.List r5 = r20.b()
            java.util.Iterator r5 = r5.iterator()
            kotlin.jvm.internal.N r6 = new kotlin.jvm.internal.N
            r6.<init>()
            r7 = 0
            r8 = 600(0x258, double:2.964E-321)
            sh.l r8 = sh.AbstractC7978m.t(r7, r8)
            java.util.Iterator r8 = r8.iterator()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto Lc9
            r12 = r8
            Zg.S r12 = (Zg.S) r12
            long r12 = r12.d()
            r14 = 30000(0x7530, double:1.4822E-319)
            long r14 = r3 - r14
            r16 = 50
            long r12 = r12 * r16
            long r14 = r14 + r12
        L41:
            if (r10 == 0) goto L50
            if (r11 == 0) goto L50
            r12 = r11
            Wc.c r12 = (Wc.c) r12
            long r12 = r12.c()
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L69
        L50:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L60
            java.lang.Object r10 = r5.next()
            r18 = r11
            r11 = r10
            r10 = r18
            goto L41
        L60:
            Wc.c r11 = (Wc.c) r11
            if (r11 != 0) goto L67
            r11 = r10
            Wc.c r11 = (Wc.c) r11
        L67:
            r10 = r11
            r11 = r9
        L69:
            r12 = r10
            Wc.c r12 = (Wc.c) r12
            if (r12 != 0) goto L71
            r12 = r11
            Wc.c r12 = (Wc.c) r12
        L71:
            if (r12 == 0) goto L8b
            long r16 = r12.c()
            int r13 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r13 >= 0) goto L7d
            r13 = 1
            goto L7e
        L7d:
            r13 = r7
        L7e:
            if (r13 == 0) goto L81
            goto L82
        L81:
            r12 = r9
        L82:
            if (r12 == 0) goto L8b
            java.lang.Object r12 = r12.d()
            S8.l r12 = (S8.l) r12
            goto L8c
        L8b:
            r12 = r9
        L8c:
            r6.f51689a = r12
            if (r12 == 0) goto Lbd
            java.lang.Object r12 = r2.f51689a
            if (r12 != 0) goto L9b
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r2.f51689a = r12
        L9b:
            java.lang.Object r12 = r2.f51689a
            kotlin.jvm.internal.AbstractC6492s.f(r12)
            java.util.List r12 = (java.util.List) r12
            Te.G r13 = new Te.G
            r7 = r19
            float r14 = r7.h(r3, r14)
            java.lang.Object r15 = r6.f51689a
            kotlin.jvm.internal.AbstractC6492s.f(r15)
            S8.l r15 = (S8.l) r15
            int r15 = r15.b()
            float r15 = (float) r15
            r13.<init>(r14, r15)
            r12.add(r13)
            goto Lc6
        Lbd:
            r7 = r19
            java.lang.Object r12 = r2.f51689a
            if (r12 == 0) goto Lc6
            m(r1, r2, r0)
        Lc6:
            r7 = 0
            goto L2b
        Lc9:
            r7 = r19
            java.lang.Object r3 = r2.f51689a
            if (r3 == 0) goto Ld2
            m(r1, r2, r0)
        Ld2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.e.l(re.n$a, Te.N):java.util.List");
    }

    private static final void m(List list, kotlin.jvm.internal.N n10, N n11) {
        Object obj = n10.f51689a;
        AbstractC6492s.f(obj);
        list.add(new H.a(n11, (List) obj));
        n10.f51689a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N n(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? N.SECONDARY : N.COMPARE_5 : N.COMPARE_4 : N.COMPARE_3 : N.COMPARE_2 : N.COMPARE_1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B0 o(InterfaceC7588a.C2110a c2110a, N n10, InterfaceC2557a interfaceC2557a, S8.l lVar, boolean z10) {
        s9.d bVar;
        f.a aVarH;
        W7.e eVarB;
        String name;
        String str = "cmp" + c2110a.b();
        InterfaceC7929a interfaceC7929aE = interfaceC2557a != null ? AbstractC6912m.e(interfaceC2557a, d(), Pe.a.f18599a.c()) : null;
        s9.d bVar2 = (interfaceC2557a == null || (name = interfaceC2557a.getName()) == null) ? new d.b(R.string.device_type_ap) : new d.c(name);
        p.a aVar = z10 ? p.a.f721a : null;
        boolean z11 = (interfaceC2557a != null ? interfaceC2557a.getName() : null) != null;
        d.c cVar = new d.c(c2110a.b().toString());
        if (lVar == null || (bVar = Ne.f.h(lVar, true, null, 2, null)) == null) {
            bVar = new d.b(R.string.signal_unavailable);
        }
        return new B0(str, n10, interfaceC7929aE, bVar2, z11, aVar, cVar, bVar, lVar == null, (lVar == null || (aVarH = lVar.h()) == null || (eVarB = Ne.f.b(aVarH)) == null) ? null : Ne.e.d(eVarB, false));
    }

    @Override // y8.c
    public gg.i a() {
        return this.f66434e;
    }

    @Override // y8.c
    public gg.i b() {
        return this.f66433d;
    }
}
