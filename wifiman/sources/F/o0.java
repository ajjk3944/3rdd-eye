package F;

import androidx.compose.ui.layout.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6533i;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class o0 implements C0.C {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6824a f5596a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f5597b;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f5598a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f5599b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, List list2) {
            super(1);
            this.f5598a = list;
            this.f5599b = list2;
        }

        public final void a(t.a aVar) {
            List list = this.f5598a;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Yg.s sVar = (Yg.s) list.get(i10);
                    t.a.j(aVar, (androidx.compose.ui.layout.t) sVar.a(), ((Y0.n) sVar.c()).n(), 0.0f, 2, null);
                }
            }
            List list2 = this.f5599b;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Yg.s sVar2 = (Yg.s) list2.get(i11);
                    androidx.compose.ui.layout.t tVar = (androidx.compose.ui.layout.t) sVar2.a();
                    InterfaceC6824a interfaceC6824a = (InterfaceC6824a) sVar2.c();
                    t.a.j(aVar, tVar, interfaceC6824a != null ? ((Y0.n) interfaceC6824a.invoke()).n() : Y0.n.f24536b.a(), 0.0f, 2, null);
                }
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    public o0(InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2) {
        this.f5596a = interfaceC6824a;
        this.f5597b = interfaceC6824a2;
    }

    @Override // C0.C
    public C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (!(((C0.B) obj).b() instanceof s0)) {
                arrayList.add(obj);
            }
        }
        List list2 = (List) this.f5597b.invoke();
        ArrayList arrayList2 = null;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C6533i c6533i = (C6533i) list2.get(i11);
                Yg.s sVar = c6533i != null ? new Yg.s(((C0.B) arrayList.get(i11)).T(Y0.c.b(0, (int) Math.floor(c6533i.r()), 0, (int) Math.floor(c6533i.j()), 5, null)), Y0.n.b(Y0.o.a(Math.round(c6533i.k()), Math.round(c6533i.n())))) : null;
                if (sVar != null) {
                    arrayList3.add(sVar);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Object obj2 = list.get(i12);
            if (((C0.B) obj2).b() instanceof s0) {
                arrayList4.add(obj2);
            }
        }
        return androidx.compose.ui.layout.m.x0(mVar, Y0.b.l(j10), Y0.b.k(j10), null, new a(arrayList2, AbstractC2717g.i(arrayList4, this.f5596a)), 4, null);
    }
}
