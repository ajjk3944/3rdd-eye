package androidx.compose.ui.window;

import C0.B;
import C0.C;
import C0.D;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.ui.layout.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class c implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final c f29923a = new c();

    public static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29924a = new a();

        public a() {
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

    public static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f29925a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.layout.t tVar) {
            super(1);
            this.f29925a = tVar;
        }

        public final void a(t.a aVar) {
            t.a.l(aVar, this.f29925a, 0, 0, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    /* renamed from: androidx.compose.ui.window.c$c, reason: collision with other inner class name */
    public static final class C1088c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f29926a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1088c(List list) {
            super(1);
            this.f29926a = list;
        }

        public final void a(t.a aVar) {
            int iN = AbstractC3689v.n(this.f29926a);
            if (iN < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                t.a.l(aVar, (androidx.compose.ui.layout.t) this.f29926a.get(i10), 0, 0, 0.0f, 4, null);
                if (i10 == iN) {
                    return;
                } else {
                    i10++;
                }
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    @Override // C0.C
    public final D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
        int i10;
        int i11;
        int size = list.size();
        if (size == 0) {
            return androidx.compose.ui.layout.m.x0(mVar, 0, 0, null, a.f29924a, 4, null);
        }
        int i12 = 0;
        if (size == 1) {
            androidx.compose.ui.layout.t tVarT = ((B) list.get(0)).T(j10);
            return androidx.compose.ui.layout.m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new b(tVarT), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            arrayList.add(((B) list.get(i13)).T(j10));
        }
        int iN = AbstractC3689v.n(arrayList);
        if (iN >= 0) {
            int iMax = 0;
            int iMax2 = 0;
            while (true) {
                androidx.compose.ui.layout.t tVar = (androidx.compose.ui.layout.t) arrayList.get(i12);
                iMax = Math.max(iMax, tVar.I0());
                iMax2 = Math.max(iMax2, tVar.C0());
                if (i12 == iN) {
                    break;
                }
                i12++;
            }
            i10 = iMax;
            i11 = iMax2;
        } else {
            i10 = 0;
            i11 = 0;
        }
        return androidx.compose.ui.layout.m.x0(mVar, i10, i11, null, new C1088c(arrayList), 4, null);
    }
}
