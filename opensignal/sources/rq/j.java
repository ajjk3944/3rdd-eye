package rq;

import br.l;
import br.x;

/* loaded from: classes.dex */
public abstract class j extends c implements br.i {

    /* renamed from: r, reason: collision with root package name */
    public final int f21674r;

    public j(int i10, pq.c cVar) {
        super(cVar);
        this.f21674r = i10;
    }

    @Override // br.i
    public final int f() {
        return this.f21674r;
    }

    @Override // rq.a
    public final String toString() {
        if (this.f21664a != null) {
            return super.toString();
        }
        String strH = x.f2918a.h(this);
        l.d(strH, "renderLambdaToString(...)");
        return strH;
    }
}
