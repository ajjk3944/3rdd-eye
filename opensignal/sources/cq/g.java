package cq;

import h9.r2;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g extends rq.c {
    public long B;
    public long D;
    public /* synthetic */ Object E;
    public final /* synthetic */ r2 F;
    public int G;

    /* renamed from: r, reason: collision with root package name */
    public r2 f6622r;

    /* renamed from: x, reason: collision with root package name */
    public ar.a f6623x;

    /* renamed from: y, reason: collision with root package name */
    public Iterator f6624y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r2 r2Var, rq.c cVar) {
        super(cVar);
        this.F = r2Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return r2.v(this.F, null, null, this);
    }
}
