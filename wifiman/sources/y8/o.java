package y8;

import Cc.InterfaceC2557a;
import Cd.f;
import Te.B0;
import Zg.AbstractC3689v;
import com.ubnt.usurvey.R;
import h9.C5969a;
import java.util.List;
import jd.C6292a;
import jd.InterfaceC6293b;
import kg.InterfaceC6465b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import n8.AbstractC6912m;
import s9.InterfaceC7929a;
import s9.d;
import y8.AbstractC8627a;

/* loaded from: classes3.dex */
public final class o extends f implements n {

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f66481d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f66482e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f66483f;

    static final class a implements InterfaceC6465b {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
        
            r9 = java.lang.Long.max(r9, ((java.lang.Number) r14.d()).longValue());
            r8.add(new Te.G(r6.h(r4, r14.c()), r15));
            r2 = r2;
            r1 = r1;
            r13 = r14;
         */
        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final Te.J apply(java.util.List r21, java.util.List r22) {
            /*
                Method dump skipped, instructions count: 365
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y8.o.a.apply(java.util.List, java.util.List):Te.J");
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f66485a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            B0 b02 = (B0) c6556a.a();
            List listC = AbstractC3689v.c();
            if (b02 != null) {
                listC.add(b02);
            }
            return AbstractC3689v.a(listC);
        }
    }

    static final class c implements InterfaceC6465b {
        c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0, types: [s9.d] */
        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a, f.a speedtestState) {
            InterfaceC2557a interfaceC2557aB;
            C5969a c5969aL;
            InterfaceC2557a interfaceC2557aB2;
            String name;
            InterfaceC2557a interfaceC2557aB3;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(speedtestState, "speedtestState");
            C6292a.b bVar = (C6292a.b) c6556a.a();
            if (speedtestState instanceof f.a.AbstractC0125a.b) {
                InterfaceC7929a interfaceC7929aE = (bVar == null || (interfaceC2557aB3 = bVar.b()) == null) ? null : AbstractC6912m.e(interfaceC2557aB3, o.this.d(), Pe.a.f18599a.o());
                s9.d bVar2 = (bVar == null || (interfaceC2557aB2 = bVar.b()) == null || (name = interfaceC2557aB2.getName()) == null) ? new d.b(R.string.device_type_network_gateway) : new d.c(name);
                d.c cVar = (bVar == null || (interfaceC2557aB = bVar.b()) == null || (c5969aL = interfaceC2557aB.l()) == null) ? null : new d.c(c5969aL.toString());
                W7.a aVarA = ((f.a.AbstractC0125a.b) speedtestState).a();
                b0 = new B0("currentlyConnected", null, interfaceC7929aE, bVar2, true, null, cVar, aVarA != null ? L8.b.a(aVarA, 1) : null, false, null, 288, null);
            } else if (!(speedtestState instanceof f.a.AbstractC0125a.C0126a) && !(speedtestState instanceof f.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return new C6556a(b0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AbstractC8627a.b markerManager, Cd.f infiniteSpeedtest, InterfaceC6293b topologyService) {
        super(null);
        AbstractC6492s.i(markerManager, "markerManager");
        AbstractC6492s.i(infiniteSpeedtest, "infiniteSpeedtest");
        AbstractC6492s.i(topologyService, "topologyService");
        gg.i iVarE1 = gg.i.v(infiniteSpeedtest.b(), markerManager.a(), new a()).U0(infiniteSpeedtest.a()).e1();
        AbstractC6492s.h(iVarE1, "onBackpressureLatest(...)");
        this.f66481d = iVarE1;
        gg.i iVarW = gg.i.v(topologyService.d(), infiniteSpeedtest.getState(), new c()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f66482e = iVarW;
        gg.i iVarI2 = iVarW.N0(b.f66485a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f66483f = iVarI2;
    }

    @Override // y8.c
    public gg.i a() {
        return this.f66483f;
    }

    @Override // y8.c
    public gg.i b() {
        return this.f66481d;
    }
}
