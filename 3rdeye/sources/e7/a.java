package E7;

import I6.g;
import K6.D0;
import K6.G0;
import N7.Tb;
import N7.Ub;
import O6.C;
import O6.H;
import O6.t;
import O6.w;
import Z6.d;
import b9.C1992A;
import c.AbstractC2021s;
import c.C2004b;
import c.C2023u;
import c9.C2087h;
import c9.C2092m;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import p9.l;
import r6.C5528e;

/* compiled from: InMemoryDivStateCache.kt */
/* loaded from: classes.dex */
public final class a extends m implements l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1473g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1474h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i) {
        super(1);
        this.f1473g = i;
        this.f1474h = obj;
    }

    @Override // p9.l
    public final Object invoke(Object obj) throws Exception {
        boolean zContains;
        int i;
        AbstractC2021s abstractC2021sPrevious;
        switch (this.f1473g) {
            case 0:
                break;
            case 1:
                i7.b item = (i7.b) obj;
                kotlin.jvm.internal.l.f(item, "item");
                List<Ub> listM = item.f38460a.d().m();
                if (listM != null) {
                    zContains = listM.contains(Ub.DATA_CHANGE);
                } else {
                    C2087h c2087h = (C2087h) this.f1474h;
                    Tb tb = (Tb) (c2087h.isEmpty() ? null : c2087h.f18573c[c2087h.l(C2092m.V(c2087h) + c2087h.f18572b)]);
                    zContains = tb != null && ((i = g.a.f2536a[tb.ordinal()]) == 1 || i == 2);
                }
                break;
            case 2:
                Exception it = (Exception) obj;
                kotlin.jvm.internal.l.f(it, "it");
                ((D0) this.f1474h).invoke(it, G0.f3224g);
                break;
            case 3:
                ((w) this.f1474h).setHintTextColor(((Number) obj).intValue());
                break;
            case 4:
                ((t) this.f1474h).setOnInterceptTouchEventListener(((Boolean) obj).booleanValue() ? H.f10376a : null);
                break;
            case 5:
                ((C) this.f1474h).getDivider().setBackgroundColor(((Number) obj).intValue());
                break;
            case 6:
                break;
            case 7:
                C2004b backEvent = (C2004b) obj;
                kotlin.jvm.internal.l.f(backEvent, "backEvent");
                C2023u c2023u = (C2023u) this.f1474h;
                if (c2023u.f18310c == null) {
                    C2087h<AbstractC2021s> c2087h2 = c2023u.f18309b;
                    ListIterator<AbstractC2021s> listIterator = c2087h2.listIterator(c2087h2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            abstractC2021sPrevious = listIterator.previous();
                            if (abstractC2021sPrevious.f18304a) {
                            }
                        } else {
                            abstractC2021sPrevious = null;
                        }
                    }
                }
                break;
            default:
                kotlin.jvm.internal.l.f((d) obj, "it");
                C5528e c5528e = (C5528e) this.f1474h;
                c5528e.f45733l.close();
                c5528e.f45736o.close();
                c5528e.f45737p.close();
                c5528e.f45738q.close();
                break;
        }
        return C1992A.f18074a;
    }
}
