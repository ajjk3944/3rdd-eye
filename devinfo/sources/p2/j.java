package p2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p1.j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends nk.l implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public static final j f31053b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f31054c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f31055d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f31056e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f31057f;
    public static final j g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f31058h;

    /* renamed from: i, reason: collision with root package name */
    public static final j f31059i;
    public static final j j;

    /* renamed from: k, reason: collision with root package name */
    public static final j f31060k;

    /* renamed from: l, reason: collision with root package name */
    public static final j f31061l;

    /* renamed from: m, reason: collision with root package name */
    public static final j f31062m;

    /* renamed from: n, reason: collision with root package name */
    public static final j f31063n;

    /* renamed from: o, reason: collision with root package name */
    public static final j f31064o;

    /* renamed from: p, reason: collision with root package name */
    public static final j f31065p;

    /* renamed from: q, reason: collision with root package name */
    public static final j f31066q;

    /* renamed from: r, reason: collision with root package name */
    public static final j f31067r;

    /* renamed from: s, reason: collision with root package name */
    public static final j f31068s;

    /* renamed from: t, reason: collision with root package name */
    public static final j f31069t;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31070a;

    static {
        int i4 = 2;
        f31053b = new j(i4, 0);
        f31054c = new j(i4, 1);
        f31055d = new j(i4, 2);
        f31056e = new j(i4, 3);
        f31057f = new j(i4, 4);
        g = new j(i4, 5);
        f31058h = new j(i4, 6);
        f31059i = new j(i4, 7);
        j = new j(i4, 8);
        f31060k = new j(i4, 9);
        f31061l = new j(i4, 10);
        f31062m = new j(i4, 11);
        f31063n = new j(i4, 12);
        f31064o = new j(i4, 13);
        f31065p = new j(i4, 14);
        f31066q = new j(i4, 15);
        f31067r = new j(i4, 16);
        f31068s = new j(i4, 17);
        f31069t = new j(i4, 18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i4, int i10) {
        super(i4);
        this.f31070a = i10;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        yj.c cVar;
        switch (this.f31070a) {
            case 0:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = zj.s.f38317a;
                }
                return zj.n.j0(collection, list);
            case 1:
                return (j1.d) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayListS0 = zj.n.s0(list2);
                arrayListS0.addAll(list3);
                return arrayListS0;
            case 3:
                return (j1.o) obj;
            case 4:
                return (j1.p) obj;
            case 5:
                return (yj.u) obj;
            case 6:
                return (yj.u) obj;
            case 7:
                return (yj.u) obj;
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 9:
                h hVar = (h) obj;
                int i4 = ((h) obj2).f31050a;
                return hVar;
            case 10:
                return (j0) obj;
            case 11:
                return (String) obj;
            case 12:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayListS02 = zj.n.s0(list4);
                arrayListS02.addAll(list5);
                return arrayListS02;
            case 13:
                Float f10 = (Float) obj;
                ((Number) obj2).floatValue();
                return f10;
            case 14:
                return (String) obj;
            case 15:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 16:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f31036a) == null) {
                    str = aVar2.f31036a;
                }
                if (aVar == null || (cVar = aVar.f31037b) == null) {
                    cVar = aVar2.f31037b;
                }
                return new a(str, cVar);
            case 17:
                return obj == null ? obj2 : obj;
            default:
                p pVar = (p) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                l lVar = ((p) obj).f31104d;
                w wVar = t.f31131t;
                Object objG = lVar.f31095a.g(wVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = pVar.f31104d.f31095a.g(wVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
