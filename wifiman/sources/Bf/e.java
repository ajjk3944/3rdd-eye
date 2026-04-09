package Bf;

import Bf.e;
import Ii.N;
import Li.P;
import Li.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.O;
import Yg.J;
import Yg.v;
import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import ch.AbstractC4260a;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import r.AbstractC7535j;
import r.G;
import r.m0;
import r.r0;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator f1731a = new c(new d(new b()));

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f1732a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f1733b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bf.b f1734c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z zVar, Bf.b bVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f1733b = zVar;
            this.f1734c = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J t(z zVar, Bf.b bVar, Bf.b bVar2, float f10, float f11) {
            zVar.j(e.c(f10, bVar, bVar2));
            return J.f24997a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f1733b, this.f1734c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f1732a;
            if (i10 == 0) {
                v.b(obj);
                final Bf.b bVar = (Bf.b) this.f1733b.getValue();
                if (this.f1734c.c() != bVar.c()) {
                    kotlin.coroutines.jvm.internal.b.a(this.f1733b.j(e.c(1.0f, bVar, this.f1734c)));
                } else {
                    r0 r0VarL = AbstractC7535j.l(700, 0, G.e(), 2, null);
                    final z zVar = this.f1733b;
                    final Bf.b bVar2 = this.f1734c;
                    InterfaceC6839p interfaceC6839p = new InterfaceC6839p() { // from class: Bf.d
                        @Override // mh.InterfaceC6839p
                        public final Object invoke(Object obj2, Object obj3) {
                            return e.a.t(zVar, bVar, bVar2, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.f1732a = 1;
                    if (m0.e(0.0f, 1.0f, 0.0f, r0VarL, interfaceC6839p, this, 4, null) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(((Bf.c) obj).g(), ((Bf.c) obj2).g());
        }
    }

    public static final class c implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f1735a;

        public c(Comparator comparator) {
            this.f1735a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f1735a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : AbstractC4260a.e(((Bf.c) obj).e(), ((Bf.c) obj2).e());
        }
    }

    public static final class d implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f1736a;

        public d(Comparator comparator) {
            this.f1736a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f1736a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : AbstractC4260a.e(((Bf.c) obj2).f(), ((Bf.c) obj).f());
        }
    }

    public static final Li.N b(Bf.b currentChartModel, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(currentChartModel, "currentChartModel");
        interfaceC3540l.U(-1082929990);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1082929990, i10, -1, "com.ui.wifiman.ui.wifi.component.chart.animatedWifiSpectrumChartModel (WifiSpectrumChartAnimation.kt:61)");
        }
        interfaceC3540l.U(2140963834);
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            objF = P.a(currentChartModel);
            interfaceC3540l.K(objF);
        }
        z zVar = (z) objF;
        interfaceC3540l.J();
        interfaceC3540l.U(2140967792);
        int i11 = i10 & 14;
        boolean zL = (((i11 ^ 6) > 4 && interfaceC3540l.T(currentChartModel)) || (i10 & 6) == 4) | interfaceC3540l.l(zVar);
        Object objF2 = interfaceC3540l.f();
        if (zL || objF2 == aVar.a()) {
            objF2 = new a(zVar, currentChartModel, null);
            interfaceC3540l.K(objF2);
        }
        interfaceC3540l.J();
        O.f(currentChartModel, (InterfaceC6839p) objF2, interfaceC3540l, i11);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bf.b c(float f10, Bf.b bVar, Bf.b bVar2) {
        Float f11;
        Float f12;
        Float f13;
        if (f10 >= 1.0f) {
            return Bf.b.b(bVar2, null, AbstractC3689v.X0(bVar2.d(), f1731a), 1, null);
        }
        Set setB = d0.b();
        Iterator it = bVar.d().iterator();
        while (it.hasNext()) {
            setB.add(((Bf.c) it.next()).e());
        }
        Iterator it2 = bVar2.d().iterator();
        while (it2.hasNext()) {
            setB.add(((Bf.c) it2.next()).e());
        }
        Set setA = d0.a(setB);
        List listD = bVar.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(listD, 10)), 16));
        for (Object obj : listD) {
            linkedHashMap.put(((Bf.c) obj).e(), obj);
        }
        List listD2 = bVar2.d();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(listD2, 10)), 16));
        for (Object obj2 : listD2) {
            linkedHashMap2.put(((Bf.c) obj2).e(), obj2);
        }
        S8.c cVarC = bVar2.c();
        Set<String> set = setA;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(set, 10));
        for (String str : set) {
            Object obj3 = linkedHashMap.get(str);
            Bf.c cVar = (Bf.c) linkedHashMap2.get(str);
            float fFloatValue = -95.0f;
            Bf.c cVar2 = (Bf.c) obj3;
            float fMax = Math.max((cVar == null || (f13 = cVar.f()) == null) ? -95.0f : f13.floatValue(), -95.0f) - Math.max((cVar2 == null || (f12 = cVar2.f()) == null) ? -95.0f : f12.floatValue(), -95.0f);
            Bf.c cVar3 = cVar2 == null ? cVar : cVar2;
            AbstractC6492s.f(cVar3);
            if (cVar2 != null && (f11 = cVar2.f()) != null) {
                fFloatValue = f11.floatValue();
            }
            arrayList.add(Bf.c.b(cVar3, null, null, Float.valueOf(fFloatValue + (fMax * f10)), 0L, null, 27, null));
        }
        return new Bf.b(cVarC, AbstractC3689v.X0(arrayList, f1731a));
    }
}
