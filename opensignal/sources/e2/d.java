package e2;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class d implements Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final d f7679d = new d(0);

    /* renamed from: g, reason: collision with root package name */
    public static final d f7680g = new d(1);

    /* renamed from: r, reason: collision with root package name */
    public static final d f7681r = new d(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7682a;

    public /* synthetic */ d(int i10) {
        this.f7682a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7682a) {
            case 0:
                f1.c cVarH = ((k) obj).h();
                f1.c cVarH2 = ((k) obj2).h();
                int iCompare = Float.compare(cVarH.f8404a, cVarH2.f8404a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(cVarH.f8405b, cVarH2.f8405b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(cVarH.f8407d, cVarH2.f8407d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(cVarH.f8406c, cVarH2.f8406c);
            case 1:
                f1.c cVarH3 = ((k) obj).h();
                f1.c cVarH4 = ((k) obj2).h();
                int iCompare4 = Float.compare(cVarH4.f8406c, cVarH3.f8406c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(cVarH3.f8405b, cVarH4.f8405b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(cVarH3.f8407d, cVarH4.f8407d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(cVarH4.f8404a, cVarH3.f8404a);
            default:
                lq.l lVar = (lq.l) obj;
                lq.l lVar2 = (lq.l) obj2;
                int iCompare7 = Float.compare(((f1.c) lVar.f15571a).f8405b, ((f1.c) lVar2.f15571a).f8405b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((f1.c) lVar.f15571a).f8407d, ((f1.c) lVar2.f15571a).f8407d);
        }
    }
}
