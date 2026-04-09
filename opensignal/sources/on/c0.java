package on;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f19599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var) {
        super(1);
        this.f19599d = g0Var;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        List list = (List) obj;
        br.l.e(list, "seenEvents");
        List listUnmodifiableList = Collections.unmodifiableList(list);
        br.l.d(listUnmodifiableList, "unmodifiableList(...)");
        g0 g0Var = this.f19599d;
        g0Var.f19621f = listUnmodifiableList;
        if (g0Var.f19618c.e() && g0Var.f19620e.compareAndSet(false, true)) {
            wt.w.s(g0Var.f19624i, null, null, new f0(g0Var, null), 3);
        }
        return lq.b0.f15562a;
    }
}
