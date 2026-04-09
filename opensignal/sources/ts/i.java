package ts;

import java.util.Comparator;
import rr.m0;
import rr.u;

/* loaded from: classes.dex */
public final class i implements Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final i f22962d = new i(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22963a;

    public /* synthetic */ i(int i10) {
        this.f22963a = i10;
    }

    public static int a(rr.l lVar) {
        if (d.m(lVar)) {
            return 8;
        }
        if (lVar instanceof rr.k) {
            return 7;
        }
        if (lVar instanceof m0) {
            return ((m0) lVar).j0() == null ? 6 : 5;
        }
        if (lVar instanceof u) {
            return ((u) lVar).j0() == null ? 4 : 3;
        }
        if (lVar instanceof rr.f) {
            return 2;
        }
        return lVar instanceof ft.u ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.f22963a) {
            case 0:
                rr.l lVar = (rr.l) obj;
                rr.l lVar2 = (rr.l) obj2;
                int iA = a(lVar2) - a(lVar);
                if (iA != 0) {
                    numValueOf = Integer.valueOf(iA);
                } else if (d.m(lVar) && d.m(lVar2)) {
                    numValueOf = 0;
                } else {
                    int iCompareTo = lVar.getName().f21035a.compareTo(lVar2.getName().f21035a);
                    numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            default:
                return se.b.n(xs.d.g((rr.f) obj).b(), xs.d.g((rr.f) obj2).b());
        }
    }
}
