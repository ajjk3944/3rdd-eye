package ug;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends rq.c {
    public eu.d B;
    public Map D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ c G;
    public int H;

    /* renamed from: r, reason: collision with root package name */
    public Map f23555r;

    /* renamed from: x, reason: collision with root package name */
    public Iterator f23556x;

    /* renamed from: y, reason: collision with root package name */
    public d f23557y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, rq.c cVar2) {
        super(cVar2);
        this.G = cVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(this);
    }
}
