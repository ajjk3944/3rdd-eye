package xi;

import java.util.List;

/* loaded from: classes.dex */
public final class f implements fj.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jj.d f25327a;

    public f(jj.d dVar) {
        this.f25327a = dVar;
    }

    @Override // fj.q
    public final void a(List list) {
        ch.n.b("CellTriggerDataSource", "onCellsInfoChanged() called with: cellsInfo = " + list);
        this.f25327a.a1();
    }
}
