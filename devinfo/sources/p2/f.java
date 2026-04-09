package p2;

import java.util.Comparator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final f f31044b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f31045c = new f(1);

    /* renamed from: d, reason: collision with root package name */
    public static final f f31046d = new f(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31047a;

    public /* synthetic */ f(int i4) {
        this.f31047a = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f31047a) {
            case 0:
                o1.c cVarH = ((p) obj).h();
                o1.c cVarH2 = ((p) obj2).h();
                int iCompare = Float.compare(cVarH.f30366a, cVarH2.f30366a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(cVarH.f30367b, cVarH2.f30367b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(cVarH.f30369d, cVarH2.f30369d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(cVarH.f30368c, cVarH2.f30368c);
            case 1:
                o1.c cVarH3 = ((p) obj).h();
                o1.c cVarH4 = ((p) obj2).h();
                int iCompare4 = Float.compare(cVarH4.f30368c, cVarH3.f30368c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(cVarH3.f30367b, cVarH4.f30367b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(cVarH3.f30369d, cVarH4.f30369d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(cVarH4.f30366a, cVarH3.f30366a);
            default:
                yj.i iVar = (yj.i) obj;
                yj.i iVar2 = (yj.i) obj2;
                int iCompare7 = Float.compare(((o1.c) iVar.f37638a).f30367b, ((o1.c) iVar2.f37638a).f30367b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((o1.c) iVar.f37638a).f30369d, ((o1.c) iVar2.f37638a).f30369d);
        }
    }
}
