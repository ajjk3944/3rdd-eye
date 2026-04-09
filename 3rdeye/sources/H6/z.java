package H6;

import K6.C0713c;
import N7.AbstractC1178g3;
import N7.C1088a3;
import N7.C1134d4;
import N7.C4;
import N7.F2;
import N7.I9;
import N7.Z8;
import android.content.Context;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import java.util.Iterator;
import x9.C5786d;

/* compiled from: DivTransitionBuilder.kt */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2270a;

    /* renamed from: b, reason: collision with root package name */
    public final I f2271b;

    /* compiled from: DivTransitionBuilder.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2272a;

        static {
            int[] iArr = new int[I9.a.values().length];
            try {
                iArr[I9.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I9.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I9.a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[I9.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2272a = iArr;
        }
    }

    public z(Context context, I i) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f2270a = context;
        this.f2271b = i;
    }

    public static K1.i c(AbstractC1178g3 abstractC1178g3, A7.d dVar) {
        if (abstractC1178g3 instanceof AbstractC1178g3.b) {
            K1.n nVar = new K1.n();
            Iterator<T> it = ((AbstractC1178g3.b) abstractC1178g3).f8274b.f8063a.iterator();
            while (it.hasNext()) {
                nVar.M(c((AbstractC1178g3) it.next(), dVar));
            }
            return nVar;
        }
        if (!(abstractC1178g3 instanceof AbstractC1178g3.a)) {
            throw new b9.j();
        }
        K1.b bVar = new K1.b();
        AbstractC1178g3.a aVar = (AbstractC1178g3.a) abstractC1178g3;
        bVar.f2981d = aVar.f8273b.f7889a.a(dVar).longValue();
        C1088a3 c1088a3 = aVar.f8273b;
        bVar.f2980c = c1088a3.f7891c.a(dVar).longValue();
        bVar.f2982e = C6.e.b(c1088a3.f7890b.a(dVar));
        return bVar;
    }

    public final K1.n a(C5786d c5786d, C5786d c5786d2, A7.d fromResolver, A7.d toResolver) {
        kotlin.jvm.internal.l.f(fromResolver, "fromResolver");
        kotlin.jvm.internal.l.f(toResolver, "toResolver");
        K1.n nVar = new K1.n();
        nVar.O(0);
        I i = this.f2271b;
        if (c5786d != null) {
            ArrayList arrayList = new ArrayList();
            C5786d.a aVar = new C5786d.a(c5786d);
            while (aVar.hasNext()) {
                i7.b bVar = (i7.b) aVar.next();
                String id = bVar.f38460a.d().getId();
                F2 f2B = bVar.f38460a.d().B();
                if (id != null && f2B != null) {
                    K1.i iVarB = b(f2B, 2, fromResolver);
                    iVarB.b(i.f(id));
                    arrayList.add(iVarB);
                }
            }
            I6.o.a(nVar, arrayList);
        }
        if (c5786d != null && c5786d2 != null) {
            ArrayList arrayList2 = new ArrayList();
            C5786d.a aVar2 = new C5786d.a(c5786d);
            while (aVar2.hasNext()) {
                i7.b bVar2 = (i7.b) aVar2.next();
                String id2 = bVar2.f38460a.d().getId();
                AbstractC1178g3 abstractC1178g3C = bVar2.f38460a.d().C();
                if (id2 != null && abstractC1178g3C != null) {
                    K1.i iVarC = c(abstractC1178g3C, fromResolver);
                    iVarC.b(i.f(id2));
                    arrayList2.add(iVarC);
                }
            }
            I6.o.a(nVar, arrayList2);
        }
        if (c5786d2 != null) {
            ArrayList arrayList3 = new ArrayList();
            C5786d.a aVar3 = new C5786d.a(c5786d2);
            while (aVar3.hasNext()) {
                i7.b bVar3 = (i7.b) aVar3.next();
                String id3 = bVar3.f38460a.d().getId();
                F2 f2W = bVar3.f38460a.d().w();
                if (id3 != null && f2W != null) {
                    K1.i iVarB2 = b(f2W, 1, toResolver);
                    iVarB2.b(i.f(id3));
                    arrayList3.add(iVarB2);
                }
            }
            I6.o.a(nVar, arrayList3);
        }
        return nVar;
    }

    public final K1.i b(F2 f22, int i, A7.d dVar) {
        int iG0;
        if (f22 instanceof F2.c) {
            K1.n nVar = new K1.n();
            Iterator<T> it = ((F2.c) f22).f5164b.f5010a.iterator();
            while (it.hasNext()) {
                K1.i iVarB = b((F2) it.next(), i, dVar);
                nVar.E(Math.max(nVar.f2981d, iVarB.f2980c + iVarB.f2981d));
                nVar.M(iVarB);
            }
            return nVar;
        }
        if (f22 instanceof F2.a) {
            F2.a aVar = (F2.a) f22;
            I6.h hVar = new I6.h((float) aVar.f5162b.f5018a.a(dVar).doubleValue());
            hVar.S(i);
            C4 c42 = aVar.f5162b;
            hVar.f2981d = c42.f5019b.a(dVar).longValue();
            hVar.f2980c = c42.f5021d.a(dVar).longValue();
            hVar.f2982e = C6.e.b(c42.f5020c.a(dVar));
            return hVar;
        }
        if (f22 instanceof F2.b) {
            F2.b bVar = (F2.b) f22;
            float fDoubleValue = (float) bVar.f5163b.f7868e.a(dVar).doubleValue();
            Z8 z82 = bVar.f5163b;
            I6.k kVar = new I6.k(fDoubleValue, (float) z82.f7866c.a(dVar).doubleValue(), (float) z82.f7867d.a(dVar).doubleValue());
            kVar.S(i);
            kVar.f2981d = z82.f7864a.a(dVar).longValue();
            kVar.f2980c = z82.f7869f.a(dVar).longValue();
            kVar.f2982e = C6.e.b(z82.f7865b.a(dVar));
            return kVar;
        }
        if (!(f22 instanceof F2.d)) {
            throw new b9.j();
        }
        F2.d dVar2 = (F2.d) f22;
        C1134d4 c1134d4 = dVar2.f5165b.f5481a;
        if (c1134d4 != null) {
            DisplayMetrics displayMetrics = this.f2270a.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics, "context.resources.displayMetrics");
            iG0 = C0713c.g0(c1134d4, displayMetrics, dVar);
        } else {
            iG0 = -1;
        }
        I9 i92 = dVar2.f5165b;
        int i10 = a.f2272a[i92.f5483c.a(dVar).ordinal()];
        int i11 = 3;
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = 48;
            } else if (i10 == 3) {
                i11 = 5;
            } else {
                if (i10 != 4) {
                    throw new b9.j();
                }
                i11 = 80;
            }
        }
        I6.n nVar2 = new I6.n(iG0, i11);
        nVar2.S(i);
        nVar2.f2981d = i92.f5482b.a(dVar).longValue();
        nVar2.f2980c = i92.f5485e.a(dVar).longValue();
        nVar2.f2982e = C6.e.b(i92.f5484d.a(dVar));
        return nVar2;
    }
}
