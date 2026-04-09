package mu;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class s extends rq.c {
    public String B;
    public /* synthetic */ Object D;
    public final /* synthetic */ ag.b E;
    public int F;

    /* renamed from: r, reason: collision with root package name */
    public lq.b f17033r;

    /* renamed from: x, reason: collision with root package name */
    public ag.b f17034x;

    /* renamed from: y, reason: collision with root package name */
    public LinkedHashMap f17035y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ag.b bVar, rq.a aVar) {
        super(aVar);
        this.E = bVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return ag.b.a(this.E, null, this);
    }
}
