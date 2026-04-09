package b1;

import android.util.Log;
import androidx.compose.ui.layout.t;
import g1.C5846d;
import g1.C5850h;
import j1.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k1.C6356b;
import kotlin.jvm.internal.AbstractC6492s;
import o.C7019j;

/* loaded from: classes.dex */
public class z implements C6356b.InterfaceC1888b, r {

    /* renamed from: a, reason: collision with root package name */
    private String f32782a = "";

    /* renamed from: b, reason: collision with root package name */
    private final j1.f f32783b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f32784c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f32785d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f32786e;

    /* renamed from: f, reason: collision with root package name */
    private final C4040B f32787f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f32788g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f32789h;

    /* renamed from: i, reason: collision with root package name */
    private float f32790i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f32791j;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32792a;

        static {
            int[] iArr = new int[e.b.values().length];
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.b.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.b.MATCH_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f32792a = iArr;
        }
    }

    public z(Y0.d dVar) {
        j1.f fVar = new j1.f(0, 0);
        fVar.D1(this);
        this.f32783b = fVar;
        this.f32784c = new LinkedHashMap();
        this.f32785d = new LinkedHashMap();
        this.f32786e = new LinkedHashMap();
        this.f32787f = new C4040B(dVar);
        this.f32788g = new int[2];
        this.f32789h = new int[2];
        this.f32790i = Float.NaN;
        this.f32791j = new ArrayList();
    }

    private final void e(Integer[] numArr, C6356b.a aVar) {
        numArr[0] = Integer.valueOf(aVar.f51027e);
        numArr[1] = Integer.valueOf(aVar.f51028f);
        numArr[2] = Integer.valueOf(aVar.f51029g);
    }

    private final long f(j1.e eVar, long j10) {
        Object objP = eVar.p();
        String str = eVar.f49920o;
        int i10 = 0;
        if (eVar instanceof j1.l) {
            int i11 = Y0.b.j(j10) ? 1073741824 : Y0.b.h(j10) ? Integer.MIN_VALUE : 0;
            if (Y0.b.i(j10)) {
                i10 = 1073741824;
            } else if (Y0.b.g(j10)) {
                i10 = Integer.MIN_VALUE;
            }
            j1.l lVar = (j1.l) eVar;
            lVar.k1(i11, Y0.b.l(j10), i10, Y0.b.k(j10));
            return C7019j.b(lVar.f1(), lVar.e1());
        }
        if (objP instanceof C0.B) {
            androidx.compose.ui.layout.t tVarT = ((C0.B) objP).T(j10);
            this.f32784c.put(objP, tVarT);
            return C7019j.b(tVarT.I0(), tVarT.C0());
        }
        Log.w("CCL", "Nothing to measure for widget: " + str);
        return C7019j.b(0, 0);
    }

    private final boolean g(e.b bVar, int i10, int i11, int i12, boolean z10, boolean z11, int i13, int[] iArr) {
        int i14 = a.f32792a[bVar.ordinal()];
        if (i14 == 1) {
            iArr[0] = i10;
            iArr[1] = i10;
        } else {
            if (i14 == 2) {
                iArr[0] = 0;
                iArr[1] = i13;
                return true;
            }
            if (i14 == 3) {
                if (AbstractC4053j.f32745a) {
                    Log.d("CCL", "Measure strategy " + i12);
                    Log.d("CCL", "DW " + i11);
                    Log.d("CCL", "ODR " + z10);
                    Log.d("CCL", "IRH " + z11);
                }
                boolean z12 = z11 || ((i12 == C6356b.a.f51021l || i12 == C6356b.a.f51022m) && (i12 == C6356b.a.f51022m || i11 != 1 || z10));
                if (AbstractC4053j.f32745a) {
                    Log.d("CCL", "UD " + z12);
                }
                iArr[0] = z12 ? i10 : 0;
                if (!z12) {
                    i10 = i13;
                }
                iArr[1] = i10;
                if (!z12) {
                    return true;
                }
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException((bVar + " is not supported").toString());
                }
                iArr[0] = i13;
                iArr[1] = i13;
            }
        }
        return false;
    }

    @Override // k1.C6356b.InterfaceC1888b
    public void a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    @Override // k1.C6356b.InterfaceC1888b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(j1.e r20, k1.C6356b.a r21) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.z.b(j1.e, k1.b$a):void");
    }

    protected final void c(long j10) {
        this.f32783b.U0(Y0.b.l(j10));
        this.f32783b.z0(Y0.b.k(j10));
        this.f32790i = Float.NaN;
    }

    public void d() {
        j1.e eVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{ ");
        sb2.append("  root: {");
        sb2.append("interpolated: { left:  0,");
        sb2.append("  top:  0,");
        sb2.append("  right:   " + this.f32783b.O() + " ,");
        sb2.append("  bottom:  " + this.f32783b.u() + " ,");
        sb2.append(" } }");
        Iterator it = this.f32783b.c1().iterator();
        while (it.hasNext()) {
            j1.e eVar2 = (j1.e) it.next();
            Object objP = eVar2.p();
            if (objP instanceof C0.B) {
                C5850h c5850h = null;
                if (eVar2.f49920o == null) {
                    C0.B b10 = (C0.B) objP;
                    Object objA = androidx.compose.ui.layout.f.a(b10);
                    if (objA == null) {
                        objA = m.a(b10);
                    }
                    eVar2.f49920o = objA != null ? objA.toString() : null;
                }
                C5850h c5850h2 = (C5850h) this.f32786e.get(objP);
                if (c5850h2 != null && (eVar = c5850h2.f47497a) != null) {
                    c5850h = eVar.f49918n;
                }
                if (c5850h != null) {
                    sb2.append(' ' + eVar2.f49920o + ": {");
                    sb2.append(" interpolated : ");
                    c5850h.e(sb2, true);
                    sb2.append("}, ");
                }
            } else if (eVar2 instanceof j1.h) {
                sb2.append(' ' + eVar2.f49920o + ": {");
                j1.h hVar = (j1.h) eVar2;
                if (hVar.b1() == 0) {
                    sb2.append(" type: 'hGuideline', ");
                } else {
                    sb2.append(" type: 'vGuideline', ");
                }
                sb2.append(" interpolated: ");
                sb2.append(" { left: " + hVar.P() + ", top: " + hVar.Q() + ", right: " + (hVar.P() + hVar.O()) + ", bottom: " + (hVar.Q() + hVar.u()) + " }");
                sb2.append("}, ");
            }
        }
        sb2.append(" }");
        this.f32782a = sb2.toString();
    }

    public final void h(t.a aVar, List list) {
        C0.B b10;
        androidx.compose.ui.layout.t tVar;
        Object next;
        if (this.f32786e.isEmpty()) {
            ArrayList arrayListC1 = this.f32783b.c1();
            int size = arrayListC1.size();
            for (int i10 = 0; i10 < size; i10++) {
                j1.e eVar = (j1.e) arrayListC1.get(i10);
                Object objP = eVar.p();
                if (objP instanceof C0.B) {
                    this.f32786e.put(objP, new C5850h(eVar.f49918n.j()));
                }
            }
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C0.B b11 = (C0.B) list.get(i11);
            if (this.f32786e.containsKey(b11)) {
                b10 = b11;
            } else {
                Iterator it = this.f32786e.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    C0.B b12 = (C0.B) next;
                    if (androidx.compose.ui.layout.f.a(b12) != null && AbstractC6492s.d(androidx.compose.ui.layout.f.a(b12), androidx.compose.ui.layout.f.a(b11))) {
                        break;
                    }
                }
                b10 = (C0.B) next;
                if (b10 == null) {
                    continue;
                }
            }
            C5850h c5850h = (C5850h) this.f32786e.get(b10);
            if (c5850h == null || (tVar = (androidx.compose.ui.layout.t) this.f32784c.get(b10)) == null) {
                return;
            }
            if (this.f32786e.containsKey(b11)) {
                AbstractC4053j.f(aVar, tVar, c5850h, 0L, 4, null);
            } else {
                AbstractC4053j.f(aVar, b11.T(Y0.b.f24516b.c(tVar.I0(), tVar.C0())), c5850h, 0L, 4, null);
            }
        }
        if (w.BOUNDS == null) {
            d();
        }
    }

    public final long i(long j10, Y0.t tVar, n nVar, List list, int i10) {
        String string;
        Object objA;
        if (list.isEmpty()) {
            return Y0.s.a(Y0.b.n(j10), Y0.b.m(j10));
        }
        this.f32787f.C(Y0.b.j(j10) ? C5846d.b(Y0.b.l(j10)) : C5846d.h().n(Y0.b.n(j10)));
        this.f32787f.m(Y0.b.i(j10) ? C5846d.b(Y0.b.k(j10)) : C5846d.h().n(Y0.b.m(j10)));
        this.f32787f.f47491f.E().a(this.f32787f, this.f32783b, 0);
        this.f32787f.f47491f.C().a(this.f32787f, this.f32783b, 1);
        this.f32787f.G(j10);
        this.f32787f.x(tVar == Y0.t.Rtl);
        j();
        if (nVar.a(list)) {
            this.f32787f.u();
            nVar.e(this.f32787f, list);
            AbstractC4053j.c(this.f32787f, list);
            this.f32787f.a(this.f32783b);
        } else {
            AbstractC4053j.c(this.f32787f, list);
        }
        c(j10);
        this.f32783b.H1();
        if (AbstractC4053j.f32745a) {
            this.f32783b.q0("ConstraintLayout");
            ArrayList arrayListC1 = this.f32783b.c1();
            int size = arrayListC1.size();
            for (int i11 = 0; i11 < size; i11++) {
                j1.e eVar = (j1.e) arrayListC1.get(i11);
                Object objP = eVar.p();
                C0.B b10 = objP instanceof C0.B ? (C0.B) objP : null;
                if (b10 == null || (objA = androidx.compose.ui.layout.f.a(b10)) == null || (string = objA.toString()) == null) {
                    string = "NOTAG";
                }
                eVar.q0(string);
            }
            Log.d("CCL", "ConstraintLayout is asked to measure with " + ((Object) Y0.b.q(j10)));
            Log.d("CCL", AbstractC4053j.g(this.f32783b));
            ArrayList arrayListC12 = this.f32783b.c1();
            int size2 = arrayListC12.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Log.d("CCL", AbstractC4053j.g((j1.e) arrayListC12.get(i12)));
            }
        }
        this.f32783b.E1(i10);
        j1.f fVar = this.f32783b;
        fVar.z1(fVar.u1(), 0, 0, 0, 0, 0, 0, 0, 0);
        if (AbstractC4053j.f32745a) {
            Log.d("CCL", "ConstraintLayout is at the end " + this.f32783b.O() + ' ' + this.f32783b.u());
        }
        return Y0.s.a(this.f32783b.O(), this.f32783b.u());
    }

    public final void j() {
        this.f32784c.clear();
        this.f32785d.clear();
        this.f32786e.clear();
    }
}
