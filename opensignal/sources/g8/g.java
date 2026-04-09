package g8;

import ar.n;
import java.util.List;
import lq.b0;
import wt.t;

/* loaded from: classes.dex */
public final class g extends rq.j implements n {
    public int B;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ h G;
    public final /* synthetic */ a H;
    public final /* synthetic */ l8.n I;
    public final /* synthetic */ List J;
    public final /* synthetic */ a8.b K;
    public final /* synthetic */ l8.j L;

    /* renamed from: x, reason: collision with root package name */
    public List f9392x;

    /* renamed from: y, reason: collision with root package name */
    public l8.n f9393y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, a aVar, l8.n nVar, List list, a8.b bVar, l8.j jVar, pq.c cVar) {
        super(2, cVar);
        this.G = hVar;
        this.H = aVar;
        this.I = nVar;
        this.J = list;
        this.K = bVar;
        this.L = jVar;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        g gVar = new g(this.G, this.H, this.I, this.J, this.K, this.L, cVar);
        gVar.F = obj;
        return gVar;
    }

    /* JADX WARN: Path cross not found for [B:16:0x0056, B:10:0x003e], limit reached: 27 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00d8 -> B:25:0x00db). Please report as a decompilation issue!!! */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.g.q(java.lang.Object):java.lang.Object");
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        return ((g) o((t) obj, (pq.c) obj2)).q(b0.f15562a);
    }
}
