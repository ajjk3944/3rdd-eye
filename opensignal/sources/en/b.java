package en;

import ar.n;
import bh.g;
import h2.j0;
import k0.t;
import lq.b0;
import n0.p;
import n0.w;
import z0.m;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8232a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8233d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8234g;

    public /* synthetic */ b(Object obj, Object obj2, int i10, int i11) {
        this.f8232a = i11;
        this.f8233d = obj;
        this.f8234g = obj2;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f8232a) {
            case 0:
                ((Integer) obj2).getClass();
                a.a.a((m) this.f8233d, (g) this.f8234g, (p) obj, w.m(7));
                break;
            default:
                ((Integer) obj2).getClass();
                t.a((j0) this.f8233d, (v0.d) this.f8234g, (p) obj, w.m(1));
                break;
        }
        return b0.f15562a;
    }
}
