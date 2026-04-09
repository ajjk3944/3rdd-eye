package bc;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.h4;

/* loaded from: classes.dex */
public final class a0 extends v {

    /* renamed from: b, reason: collision with root package name */
    public final dd.h f2575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2576c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2577d;

    public a0(int i10, dd.h hVar) {
        super(i10);
        this.f2575b = hVar;
    }

    @Override // bc.v
    public final Feature[] a(n nVar) {
        switch (this.f2576c) {
            case 0:
                break;
            default:
                break;
        }
        return null;
    }

    @Override // bc.v
    public final boolean b(n nVar) {
        switch (this.f2576c) {
            case 0:
                return ((x) this.f2577d).f2660a.f2610b;
            default:
                x xVar = (x) nVar.f2628i.get((g) this.f2577d);
                return xVar != null && xVar.f2660a.f2610b;
        }
    }

    @Override // bc.v
    public final int c(n nVar) {
        switch (this.f2576c) {
            case 0:
                return ((x) this.f2577d).f2660a.f2611c;
            default:
                x xVar = (x) nVar.f2628i.get((g) this.f2577d);
                if (xVar != null) {
                    return xVar.f2660a.f2611c;
                }
                return -1;
        }
    }

    @Override // bc.v
    public final void d(Status status) {
        this.f2575b.b(new ac.d(status));
    }

    @Override // bc.v
    public final void e(Exception exc) {
        this.f2575b.b(exc);
    }

    @Override // bc.v
    public final /* bridge */ /* synthetic */ void f(bm.e eVar, boolean z10) {
        int i10 = this.f2576c;
    }

    @Override // bc.v
    public final void g(n nVar) throws DeadObjectException {
        try {
            k(nVar);
        } catch (DeadObjectException e4) {
            d(v.h(e4));
            throw e4;
        } catch (RemoteException e10) {
            d(v.h(e10));
        } catch (RuntimeException e11) {
            this.f2575b.b(e11);
        }
    }

    public final void k(n nVar) {
        switch (this.f2576c) {
            case 0:
                x xVar = (x) this.f2577d;
                j jVar = xVar.f2660a;
                ((om.f) ((a5.t) jVar.f2613e).f154b).accept(nVar.f2624e, this.f2575b);
                g gVar = (g) ((zb.g) jVar.f2612d).f26826b;
                if (gVar != null) {
                    nVar.f2628i.put(gVar, xVar);
                    break;
                }
                break;
            default:
                x xVar2 = (x) nVar.f2628i.remove((g) this.f2577d);
                if (xVar2 == null) {
                    this.f2575b.c(Boolean.FALSE);
                    break;
                } else {
                    ((h4) ((a5.t) xVar2.f2661b.f2481d).f155c).accept(nVar.f2624e, this.f2575b);
                    ((zb.g) xVar2.f2660a.f2612d).f26826b = null;
                    break;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(g gVar, dd.h hVar) {
        this(4, hVar);
        this.f2576c = 1;
        this.f2577d = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(x xVar, dd.h hVar) {
        this(3, hVar);
        this.f2576c = 0;
        this.f2577d = xVar;
    }

    private final /* bridge */ /* synthetic */ void i(bm.e eVar, boolean z10) {
    }

    private final /* bridge */ /* synthetic */ void j(bm.e eVar, boolean z10) {
    }
}
