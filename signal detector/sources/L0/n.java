package L0;

import java.util.ArrayList;
import u.C2936e;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2936e f2478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f2479b;

    public n(o oVar, C2936e c2936e) {
        this.f2479b = oVar;
        this.f2478a = c2936e;
    }

    @Override // L0.j
    public final void c(l lVar) {
        ((ArrayList) this.f2478a.get(this.f2479b.f2481b)).remove(lVar);
        lVar.y(this);
    }
}
