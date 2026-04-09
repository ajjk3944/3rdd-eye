package d4;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class y extends rq.c {
    public br.w B;
    public boolean D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ c0 G;
    public int H;

    /* renamed from: r, reason: collision with root package name */
    public Object f6908r;

    /* renamed from: x, reason: collision with root package name */
    public Object f6909x;

    /* renamed from: y, reason: collision with root package name */
    public Serializable f6910y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, rq.c cVar) {
        super(cVar);
        this.G = c0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return c0.g(this.G, false, this);
    }
}
