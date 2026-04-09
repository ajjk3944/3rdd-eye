package rq;

import br.l;
import br.x;

/* loaded from: classes.dex */
public abstract class i extends h implements br.i {

    /* renamed from: d, reason: collision with root package name */
    public final int f21673d;

    public i(int i10, pq.c cVar) {
        super(cVar);
        this.f21673d = i10;
    }

    @Override // br.i
    public final int f() {
        return this.f21673d;
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
