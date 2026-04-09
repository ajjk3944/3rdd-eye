package k2;

import java.util.List;

/* loaded from: classes.dex */
public final class b extends rq.c {
    public int B;
    public /* synthetic */ Object D;
    public final /* synthetic */ g1.f E;
    public int F;

    /* renamed from: r, reason: collision with root package name */
    public List f13974r;

    /* renamed from: x, reason: collision with root package name */
    public x f13975x;

    /* renamed from: y, reason: collision with root package name */
    public int f13976y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g1.f fVar, rq.c cVar) {
        super(cVar);
        this.E = fVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.w(this);
    }
}
