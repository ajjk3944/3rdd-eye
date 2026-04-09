package F6;

import H7.b;
import O6.t;
import O6.u;
import U9.r;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import c.C2023u;
import c9.C2092m;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* compiled from: DivTextRangesBackgroundHelper.kt */
/* loaded from: classes.dex */
public final class c extends m implements InterfaceC5480a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1667g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1668h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i) {
        super(0);
        this.f1667g = i;
        this.f1668h = obj;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        switch (this.f1667g) {
            case 0:
                d dVar = (d) this.f1668h;
                return new g(dVar.f1669a, dVar.f1670b);
            case 1:
                return (b.a) this.f1668h;
            case 2:
                t tVar = (t) this.f1668h;
                RecyclerView recyclerView = tVar.getRecyclerView();
                if (recyclerView == null) {
                    return null;
                }
                recyclerView.setDescendantFocusability(262144);
                return new u(recyclerView, tVar);
            case 3:
                r rVar = ((Y9.g) this.f1668h).f13860e;
                l.c(rVar);
                List<Certificate> listA = rVar.a();
                ArrayList arrayList = new ArrayList(C2092m.T(listA, 10));
                for (Certificate certificate : listA) {
                    l.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            default:
                ((C2023u) this.f1668h).c();
                return C1992A.f18074a;
        }
    }
}
