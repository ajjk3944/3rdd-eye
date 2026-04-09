package y7;

import H6.C0672i;
import H6.C0675l;
import N7.C1175g0;
import h7.C4421b;
import java.util.List;
import y7.c;
import y7.e;

/* compiled from: TabTitlesLayoutView.java */
/* loaded from: classes.dex */
public final class s implements e.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f48325a;

    public s(t tVar) {
        this.f48325a = tVar;
    }

    @Override // y7.e.c
    public final void a(e.f fVar) {
        t tVar = this.f48325a;
        if (tVar.f48326J == null) {
            return;
        }
        int i = fVar.f48287b;
        List<? extends c.f.a<ACTION>> list = tVar.f48327K;
        if (list != 0) {
            c.f.a aVar = (c.f.a) list.get(i);
            C1175g0 c1175g0C = aVar == null ? null : aVar.c();
            if (c1175g0C != null) {
                N6.o oVar = c.this.i;
                oVar.getClass();
                if (c1175g0C.f8257e != null) {
                    int i10 = C4421b.f38269a;
                    C4421b.a(C7.a.WARNING);
                }
                C0672i c0672i = oVar.f4742a;
                oVar.f4744c.getClass();
                C0675l c0675l = c0672i.f2146a;
                C0675l c0675l2 = c0675l != null ? c0675l : null;
                j6.h actionHandler = c0675l2 != null ? c0675l2.getActionHandler() : null;
                oVar.f4743b.a(c0675l, c0672i.f2147b, c1175g0C, "click", actionHandler);
            }
        }
    }

    @Override // y7.e.c
    public final void b(e.f fVar) {
        Object obj = this.f48325a.f48326J;
        if (obj == null) {
            return;
        }
        c.this.f48208c.setCurrentItem(fVar.f48287b);
    }
}
