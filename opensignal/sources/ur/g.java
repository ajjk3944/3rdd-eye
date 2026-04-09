package ur;

import ht.x0;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n0.d1;

/* loaded from: classes.dex */
public final class g implements ar.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23638a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23639d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f23640g;

    public /* synthetic */ g(Object obj, int i10, Object obj2) {
        this.f23638a = i10;
        this.f23640g = obj;
        this.f23639d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [vu.q] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [vu.c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // ar.a
    public final Object c() throws Throwable {
        Throwable th2;
        vu.c cVar;
        switch (this.f23638a) {
            case 0:
                ht.i0.f10910d.getClass();
                ht.i0 i0Var = ht.i0.f10911g;
                ht.m0 m0VarV = ((i) this.f23640g).v();
                List list = Collections.EMPTY_LIST;
                d1 d1Var = new d1(1, this);
                gt.b bVar = gt.l.f9657e;
                br.l.d(bVar, "NO_LOCKS");
                return ht.e.s(new at.j(bVar, d1Var), i0Var, m0VarV, list, false);
            case 1:
                rt.f fVar = new rt.f();
                Iterator it = ((u) this.f23640g).p().iterator();
                while (it.hasNext()) {
                    fVar.add(((rr.u) it.next()).e((x0) this.f23639d));
                }
                return fVar;
            default:
                ?? r02 = (vu.q) this.f23640g;
                vu.u uVar = (vu.u) this.f23639d;
                vu.c cVar2 = vu.c.INTERNAL_ERROR;
                ?? r32 = 1;
                IOException e4 = null;
                try {
                    try {
                        try {
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    } catch (IOException e10) {
                        e4 = e10;
                        cVar = cVar2;
                    }
                    if (!uVar.b(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                        try {
                        } catch (Throwable th4) {
                            th2 = th4;
                            r32 = cVar2;
                            r02.b(r32, cVar2, e4);
                            pu.b.d(uVar);
                            throw th2;
                        }
                    } while (uVar.b(false, this));
                    cVar = vu.c.NO_ERROR;
                    try {
                        cVar2 = vu.c.CANCEL;
                        r02.b(cVar, cVar2, null);
                        r32 = cVar;
                    } catch (IOException e11) {
                        e4 = e11;
                        cVar2 = vu.c.PROTOCOL_ERROR;
                        r02.b(cVar2, cVar2, e4);
                        r32 = cVar;
                        pu.b.d(uVar);
                        return lq.b0.f15562a;
                    }
                    pu.b.d(uVar);
                    return lq.b0.f15562a;
                } catch (Throwable th5) {
                    th2 = th5;
                    r02.b(r32, cVar2, e4);
                    pu.b.d(uVar);
                    throw th2;
                }
        }
    }
}
