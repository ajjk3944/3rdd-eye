package g8;

import br.w;

/* loaded from: classes.dex */
public final class c extends rq.c {
    public Object B;
    public w D;
    public w E;
    public w F;
    public w G;
    public /* synthetic */ Object H;
    public final /* synthetic */ h I;
    public int J;

    /* renamed from: r, reason: collision with root package name */
    public h f9381r;

    /* renamed from: x, reason: collision with root package name */
    public l8.j f9382x;

    /* renamed from: y, reason: collision with root package name */
    public Object f9383y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, rq.c cVar) {
        super(cVar);
        this.I = hVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return h.b(this.I, null, null, null, null, this);
    }
}
