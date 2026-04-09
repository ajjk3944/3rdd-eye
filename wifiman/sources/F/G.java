package F;

import androidx.compose.ui.layout.t;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class G implements C0.C {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6824a f4867a;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f4868a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f4869b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, G g10) {
            super(1);
            this.f4868a = list;
            this.f4869b = g10;
        }

        public final void a(t.a aVar) {
            List listI = AbstractC2717g.i(this.f4868a, this.f4869b.f4867a);
            if (listI != null) {
                int size = listI.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Yg.s sVar = (Yg.s) listI.get(i10);
                    androidx.compose.ui.layout.t tVar = (androidx.compose.ui.layout.t) sVar.a();
                    InterfaceC6824a interfaceC6824a = (InterfaceC6824a) sVar.c();
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

    public G(InterfaceC6824a interfaceC6824a) {
        this.f4867a = interfaceC6824a;
    }

    @Override // C0.C
    public C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
        return androidx.compose.ui.layout.m.x0(mVar, Y0.b.l(j10), Y0.b.k(j10), null, new a(list, this), 4, null);
    }
}
