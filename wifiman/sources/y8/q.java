package y8;

import Af.p;
import Te.E0;
import Te.H;
import Te.J;
import Te.M;
import Zg.AbstractC3689v;
import a8.C3771a;
import fh.InterfaceC5826a;
import gc.EnumC5895b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jd.C6292a;
import jd.InterfaceC6293b;
import je.AbstractC6317r;
import je.C6316q;
import je.InterfaceC6297C;
import ke.AbstractC6456a;
import kg.InterfaceC6465b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.N;
import l9.C6556a;
import y8.AbstractC8627a;

/* loaded from: classes3.dex */
public final class q extends f implements p {

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f66487d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f66488e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f66489f;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66490a;

        static {
            int[] iArr = new int[S8.c.values().length];
            try {
                iArr[S8.c.GHZ_2_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S8.c.GHZ_5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S8.c.GHZ_6.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66490a = iArr;
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f66491a = new b();

        b() {
        }

        private static final void b(N n10, Set set, AbstractC6317r abstractC6317r) {
            if (abstractC6317r instanceof AbstractC6317r.b.a.C1874b) {
                S8.c cVarB = ((AbstractC6317r.b.a.C1874b) abstractC6317r).b();
                if (cVarB != null) {
                    set.add(cVarB);
                    return;
                }
                return;
            }
            if (!(abstractC6317r instanceof AbstractC6317r.b.a.C1873a)) {
                if (!(abstractC6317r instanceof AbstractC6317r.b.C1875b) && !(abstractC6317r instanceof AbstractC6317r.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            Iterator it = ((Iterable) n10.f51689a).iterator();
            while (it.hasNext()) {
                C6316q c6316qO = ((AbstractC6317r.b.a.C1873a) abstractC6317r).o((S8.c) it.next());
                if (c6316qO != null) {
                    if (!(c6316qO.i() instanceof AbstractC6456a.AbstractC1905a.AbstractC1906a) || c6316qO.h() == null) {
                        c6316qO = null;
                    }
                    if (c6316qO != null) {
                        set.add(c6316qO.c());
                    }
                }
            }
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(List timelineItem) {
            AbstractC6492s.i(timelineItem, "timelineItem");
            long jCurrentTimeMillis = System.currentTimeMillis() - 30000;
            N n10 = new N();
            n10.f51689a = AbstractC3689v.n1(S8.c.getEntries());
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = timelineItem.iterator();
            boolean z10 = false;
            AbstractC6317r abstractC6317r = null;
            while (it.hasNext()) {
                Wc.c cVar = (Wc.c) it.next();
                long jA = cVar.a();
                AbstractC6317r abstractC6317r2 = (AbstractC6317r) cVar.b();
                if (z10 || jA >= jCurrentTimeMillis) {
                    if (abstractC6317r != null) {
                        b(n10, linkedHashSet, abstractC6317r);
                        abstractC6317r = null;
                    }
                    b(n10, linkedHashSet, abstractC6317r2);
                    if (S8.c.getEntries().size() - linkedHashSet.size() != ((Set) n10.f51689a).size()) {
                        n10.f51689a = AbstractC3689v.Y0(S8.c.getEntries(), linkedHashSet);
                    }
                    z10 = true;
                } else {
                    abstractC6317r = abstractC6317r2;
                }
            }
            return linkedHashSet;
        }
    }

    static final class c implements InterfaceC6465b {
        c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J apply(List timeline, List markers) {
            AbstractC6492s.i(timeline, "timeline");
            AbstractC6492s.i(markers, "markers");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            InterfaceC5826a entries = S8.c.getEntries();
            q qVar = q.this;
            Iterator<E> it = entries.iterator();
            while (it.hasNext()) {
                Yg.s sVarL = qVar.l((S8.c) it.next(), timeline, markers);
                List list = (List) sVarL.a();
                List list2 = (List) sVarL.c();
                arrayList.addAll(list);
                arrayList2.addAll(list2);
            }
            return new J(EnumC5895b.SIGNAL, arrayList, M.b.C0800b.f21723a, q.this.e(), arrayList2, AbstractC3689v.l());
        }
    }

    static final class d implements kg.h {
        d() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(List connected, C6556a c6556a, Set chartDrawnBands, C3771a c3771a) {
            AbstractC6317r abstractC6317r;
            AbstractC6492s.i(connected, "connected");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(chartDrawnBands, "chartDrawnBands");
            AbstractC6492s.i(c3771a, "<unused var>");
            C6292a.b bVar = (C6292a.b) c6556a.a();
            q qVar = q.this;
            Wc.c cVar = (Wc.c) AbstractC3689v.D0(connected);
            if (cVar == null || (abstractC6317r = (AbstractC6317r) cVar.d()) == null) {
                abstractC6317r = AbstractC6317r.b.C1875b.f50791a;
            }
            return AbstractC3689v.e(qVar.p(abstractC6317r, chartDrawnBands, bVar != null ? bVar.b() : null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InterfaceC6297C wifiConnectionStateTimelapseService, AbstractC8627a.b markerManager, InterfaceC6293b topologyService, Cc.n wifimanDeviceManager) {
        super(null);
        AbstractC6492s.i(wifiConnectionStateTimelapseService, "wifiConnectionStateTimelapseService");
        AbstractC6492s.i(markerManager, "markerManager");
        AbstractC6492s.i(topologyService, "topologyService");
        AbstractC6492s.i(wifimanDeviceManager, "wifimanDeviceManager");
        gg.i iVarW = wifiConnectionStateTimelapseService.b().N0(b.f66491a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f66487d = iVarW;
        gg.i iVarI2 = gg.i.v(g(wifiConnectionStateTimelapseService.b()), markerManager.a(), new c()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f66488e = iVarI2;
        gg.i iVarI22 = gg.i.t(wifiConnectionStateTimelapseService.b(), topologyService.c(), iVarW, wifimanDeviceManager.a(), new d()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f66489f = iVarI22;
    }

    private final E0 k(C6316q c6316q) {
        De.g gVar = null;
        if (!(c6316q.i() instanceof AbstractC6456a.AbstractC1905a.AbstractC1906a)) {
            return null;
        }
        S8.c cVarC = c6316q.c();
        Te.N nO = o(c6316q.c());
        AbstractC6456a abstractC6456aI = c6316q.i();
        if (abstractC6456aI instanceof AbstractC6456a.AbstractC1905a.AbstractC1906a.b) {
            gVar = p.c.f723a;
        } else if (abstractC6456aI instanceof AbstractC6456a.AbstractC1905a.AbstractC1906a.C1907a) {
            gVar = p.a.f721a;
        } else if (!(abstractC6456aI instanceof AbstractC6456a.AbstractC1905a.b) && !(abstractC6456aI instanceof AbstractC6456a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return new E0(nO, cVarC, gVar, c6316q.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01cf, code lost:
    
        r12 = r27;
        r16 = r8;
        r8 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Yg.s l(S8.c r25, java.util.List r26, java.util.List r27) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.q.l(S8.c, java.util.List, java.util.List):Yg.s");
    }

    private static final void m(List list, N n10, q qVar, S8.c cVar) {
        Object obj = n10.f51689a;
        AbstractC6492s.f(obj);
        list.add(new H.a(qVar.o(cVar), (List) obj));
        n10.f51689a = null;
    }

    private final E0 n(S8.c cVar) {
        return new E0(o(cVar), cVar, null, null);
    }

    private final Te.N o(S8.c cVar) {
        int i10 = a.f66490a[cVar.ordinal()];
        if (i10 == 1) {
            return Te.N.PRIMARY;
        }
        if (i10 == 2) {
            return Te.N.COMPARE_5;
        }
        if (i10 == 3) {
            return Te.N.COMPARE_3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012a  */
    /* JADX WARN: Type inference failed for: r3v4, types: [s9.d$c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Te.F0 p(je.AbstractC6317r r22, java.util.Set r23, Cc.InterfaceC2557a r24) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.q.p(je.r, java.util.Set, Cc.a):Te.F0");
    }

    @Override // y8.c
    public gg.i a() {
        return this.f66489f;
    }

    @Override // y8.c
    public gg.i b() {
        return this.f66488e;
    }
}
