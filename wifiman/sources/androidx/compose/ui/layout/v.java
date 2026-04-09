package androidx.compose.ui.layout;

import C0.B;
import C0.D;
import E0.G;
import Yg.J;
import androidx.compose.ui.layout.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class v extends G.f {

    /* renamed from: b, reason: collision with root package name */
    public static final v f29070b = new v();

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29071a = new a();

        a() {
            super(1);
        }

        public final void a(t.a aVar) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f29072a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t tVar) {
            super(1);
            this.f29072a = tVar;
        }

        public final void a(t.a aVar) {
            t.a.p(aVar, this.f29072a, 0, 0, 0.0f, null, 12, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f29073a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list) {
            super(1);
            this.f29073a = list;
        }

        public final void a(t.a aVar) {
            List list = this.f29073a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                t.a.p(aVar, (t) list.get(i10), 0, 0, 0.0f, null, 12, null);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    private v() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // C0.C
    public D b(m mVar, List list, long j10) {
        if (list.isEmpty()) {
            return m.x0(mVar, Y0.b.n(j10), Y0.b.m(j10), null, a.f29071a, 4, null);
        }
        if (list.size() == 1) {
            t tVarT = ((B) list.get(0)).T(j10);
            return m.x0(mVar, Y0.c.i(j10, tVarT.I0()), Y0.c.h(j10, tVarT.C0()), null, new b(tVarT), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((B) list.get(i10)).T(j10));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            t tVar = (t) arrayList.get(i11);
            iMax = Math.max(tVar.I0(), iMax);
            iMax2 = Math.max(tVar.C0(), iMax2);
        }
        return m.x0(mVar, Y0.c.i(j10, iMax), Y0.c.h(j10, iMax2), null, new c(arrayList), 4, null);
    }
}
