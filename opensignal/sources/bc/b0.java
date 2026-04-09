package bc;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class b0 extends v {

    /* renamed from: b, reason: collision with root package name */
    public final j f2578b;

    /* renamed from: c, reason: collision with root package name */
    public final dd.h f2579c;

    /* renamed from: d, reason: collision with root package name */
    public final df.c f2580d;

    public b0(int i10, j jVar, dd.h hVar, df.c cVar) {
        super(i10);
        this.f2579c = hVar;
        this.f2578b = jVar;
        this.f2580d = cVar;
        if (i10 == 2 && jVar.f2610b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // bc.v
    public final Feature[] a(n nVar) {
        return (Feature[]) this.f2578b.f2613e;
    }

    @Override // bc.v
    public final boolean b(n nVar) {
        return this.f2578b.f2610b;
    }

    @Override // bc.v
    public final int c(n nVar) {
        return this.f2578b.f2611c;
    }

    @Override // bc.v
    public final void d(Status status) {
        this.f2580d.getClass();
        this.f2579c.b(status.f4821g != null ? new ac.j(status) : new ac.d(status));
    }

    @Override // bc.v
    public final void e(Exception exc) {
        this.f2579c.b(exc);
    }

    @Override // bc.v
    public final void f(bm.e eVar, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Map map = (Map) eVar.f2831g;
        dd.h hVar = this.f2579c;
        map.put(hVar, boolValueOf);
        dd.r rVar = hVar.f7294a;
        bm.e eVar2 = new bm.e(eVar, hVar);
        rVar.getClass();
        rVar.f7319b.o(new dd.m(dd.i.f7295a, eVar2));
        rVar.q();
    }

    @Override // bc.v
    public final void g(n nVar) throws DeadObjectException {
        dd.h hVar = this.f2579c;
        try {
            j jVar = this.f2578b;
            ((i) ((j) jVar.f2612d).f2612d).accept(nVar.f2624e, hVar);
        } catch (DeadObjectException e4) {
            throw e4;
        } catch (RemoteException e10) {
            d(v.h(e10));
        } catch (RuntimeException e11) {
            hVar.b(e11);
        }
    }
}
