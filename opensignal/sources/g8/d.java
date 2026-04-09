package g8;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import ar.k;
import ar.n;
import br.w;
import coil.memory.MemoryCache$Key;
import com.google.android.gms.internal.measurement.z3;
import lq.b0;
import w.s;
import w.u;
import wt.t;

/* loaded from: classes.dex */
public final class d extends rq.j implements n {
    public Object B;
    public final /* synthetic */ Object D;
    public Object E;
    public final /* synthetic */ Object F;
    public Object G;
    public /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9384x = 3;

    /* renamed from: y, reason: collision with root package name */
    public int f9385y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ContentResolver contentResolver, Uri uri, z3 z3Var, yt.c cVar, Context context, pq.c cVar2) {
        super(2, cVar2);
        this.G = contentResolver;
        this.H = uri;
        this.I = z3Var;
        this.D = cVar;
        this.F = context;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ar.k, rq.j] */
    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f9384x) {
            case 0:
                return new d((h) this.B, (w) this.G, (w) this.H, (l8.j) this.D, this.E, (w) this.I, (a8.b) this.F, cVar);
            case 1:
                return new d((h) this.B, (l8.j) this.D, this.E, (l8.n) this.G, (a8.b) this.F, (MemoryCache$Key) this.H, (j) this.I, cVar);
            case 2:
                d dVar = new d((s) this.I, (u) this.D, (rq.j) this.F, cVar);
                dVar.H = obj;
                return dVar;
            default:
                d dVar2 = new d((ContentResolver) this.G, (Uri) this.H, (z3) this.I, (yt.c) this.D, (Context) this.F, cVar);
                dVar2.E = obj;
                return dVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #4 {all -> 0x002d, blocks: (B:9:0x0027, B:20:0x005e, B:24:0x0070, B:26:0x0078, B:16:0x0040, B:19:0x0055), top: B:160:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Type inference failed for: r7v14, types: [ar.k] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009d -> B:20:0x005e). Please report as a decompilation issue!!! */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.d.q(java.lang.Object):java.lang.Object");
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f9384x) {
            case 0:
                return ((d) o((t) obj, (pq.c) obj2)).q(b0.f15562a);
            case 1:
                return ((d) o((t) obj, (pq.c) obj2)).q(b0.f15562a);
            case 2:
                return ((d) o((t) obj, (pq.c) obj2)).q(b0.f15562a);
            default:
                return ((d) o((zt.g) obj, (pq.c) obj2)).q(b0.f15562a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, w wVar, w wVar2, l8.j jVar, Object obj, w wVar3, a8.b bVar, pq.c cVar) {
        super(2, cVar);
        this.B = hVar;
        this.G = wVar;
        this.H = wVar2;
        this.D = jVar;
        this.E = obj;
        this.I = wVar3;
        this.F = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, l8.j jVar, Object obj, l8.n nVar, a8.b bVar, MemoryCache$Key memoryCache$Key, j jVar2, pq.c cVar) {
        super(2, cVar);
        this.B = hVar;
        this.D = jVar;
        this.E = obj;
        this.G = nVar;
        this.F = bVar;
        this.H = memoryCache$Key;
        this.I = jVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(s sVar, u uVar, k kVar, pq.c cVar) {
        super(2, cVar);
        this.I = sVar;
        this.D = uVar;
        this.F = (rq.j) kVar;
    }
}
