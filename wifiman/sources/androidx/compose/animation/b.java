package androidx.compose.animation;

import C0.C;
import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import Y0.s;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.ui.layout.t;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class b implements C {

    /* renamed from: a, reason: collision with root package name */
    private final e f27526a;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t[] f27527a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f27528b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27529c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f27530d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t[] tVarArr, b bVar, int i10, int i11) {
            super(1);
            this.f27527a = tVarArr;
            this.f27528b = bVar;
            this.f27529c = i10;
            this.f27530d = i11;
        }

        public final void a(t.a aVar) {
            t[] tVarArr = this.f27527a;
            b bVar = this.f27528b;
            int i10 = this.f27529c;
            int i11 = this.f27530d;
            for (t tVar : tVarArr) {
                if (tVar != null) {
                    long jA = bVar.a().n().a(s.a(tVar.I0(), tVar.C0()), s.a(i10, i11), Y0.t.Ltr);
                    t.a.h(aVar, tVar, Y0.n.h(jA), Y0.n.i(jA), 0.0f, 4, null);
                }
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public b(e eVar) {
        this.f27526a = eVar;
    }

    public final e a() {
        return this.f27526a;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    @Override // C0.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0.D b(androidx.compose.ui.layout.m r21, java.util.List r22, long r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.b.b(androidx.compose.ui.layout.m, java.util.List, long):C0.D");
    }

    @Override // C0.C
    public int c(InterfaceC2535o interfaceC2535o, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC2534n) list.get(0)).s(i10));
            int iN = AbstractC3689v.n(list);
            int i11 = 1;
            if (1 <= iN) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2534n) list.get(i11)).s(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iN) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // C0.C
    public int e(InterfaceC2535o interfaceC2535o, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC2534n) list.get(0)).S(i10));
            int iN = AbstractC3689v.n(list);
            int i11 = 1;
            if (1 <= iN) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2534n) list.get(i11)).S(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iN) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // C0.C
    public int f(InterfaceC2535o interfaceC2535o, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC2534n) list.get(0)).R(i10));
            int iN = AbstractC3689v.n(list);
            int i11 = 1;
            if (1 <= iN) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2534n) list.get(i11)).R(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iN) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // C0.C
    public int i(InterfaceC2535o interfaceC2535o, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC2534n) list.get(0)).s0(i10));
            int iN = AbstractC3689v.n(list);
            int i11 = 1;
            if (1 <= iN) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2534n) list.get(i11)).s0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iN) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
