package cq;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class e extends rq.c {
    public long B;
    public /* synthetic */ Object D;
    public final /* synthetic */ of.b E;
    public int F;

    /* renamed from: r, reason: collision with root package name */
    public of.b f6616r;

    /* renamed from: x, reason: collision with root package name */
    public Iterator f6617x;

    /* renamed from: y, reason: collision with root package name */
    public long f6618y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(of.b bVar, rq.c cVar) {
        super(cVar);
        this.E = bVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return of.b.a(this.E, null, this);
    }
}
