package q;

import C0.C;
import C0.D;
import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.ui.layout.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7384c implements C {

    /* renamed from: a, reason: collision with root package name */
    private final C7387f f58209a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f58210b;

    /* renamed from: q.c$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f58211a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list) {
            super(1);
            this.f58211a = list;
        }

        public final void a(t.a aVar) {
            List list = this.f58211a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                t.a.h(aVar, (androidx.compose.ui.layout.t) list.get(i10), 0, 0, 0.0f, 4, null);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public C7384c(C7387f c7387f) {
        this.f58209a = c7387f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v24 */
    @Override // C0.C
    public D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((C0.B) list.get(i10)).T(j10));
        }
        androidx.compose.ui.layout.t tVar = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int iI0 = ((androidx.compose.ui.layout.t) obj).I0();
            int iN = AbstractC3689v.n(arrayList);
            if (1 <= iN) {
                int i11 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i11);
                    int iI02 = ((androidx.compose.ui.layout.t) obj2).I0();
                    if (iI0 < iI02) {
                        obj = obj2;
                        iI0 = iI02;
                    }
                    if (i11 == iN) {
                        break;
                    }
                    i11++;
                }
            }
        }
        androidx.compose.ui.layout.t tVar2 = (androidx.compose.ui.layout.t) obj;
        int iI03 = tVar2 != null ? tVar2.I0() : 0;
        if (!arrayList.isEmpty()) {
            ?? r12 = arrayList.get(0);
            int iC0 = ((androidx.compose.ui.layout.t) r12).C0();
            int iN2 = AbstractC3689v.n(arrayList);
            if (1 <= iN2) {
                int i12 = 1;
                boolean z10 = r12;
                while (true) {
                    Object obj3 = arrayList.get(i12);
                    int iC02 = ((androidx.compose.ui.layout.t) obj3).C0();
                    r12 = z10;
                    if (iC0 < iC02) {
                        r12 = obj3;
                        iC0 = iC02;
                    }
                    if (i12 == iN2) {
                        break;
                    }
                    i12++;
                    z10 = r12;
                }
            }
            tVar = r12;
        }
        androidx.compose.ui.layout.t tVar3 = tVar;
        int iC03 = tVar3 != null ? tVar3.C0() : 0;
        if (mVar.a1()) {
            this.f58210b = true;
            this.f58209a.a().setValue(Y0.r.b(Y0.s.a(iI03, iC03)));
        } else if (!this.f58210b) {
            this.f58209a.a().setValue(Y0.r.b(Y0.s.a(iI03, iC03)));
        }
        return androidx.compose.ui.layout.m.x0(mVar, iI03, iC03, null, new a(arrayList), 4, null);
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
