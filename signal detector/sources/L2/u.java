package L2;

import A2.C0117e;
import G3.C0152f;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import h0.C2351a;
import java.util.Map;

/* loaded from: classes.dex */
public final class u extends p {

    /* renamed from: b, reason: collision with root package name */
    public final H3.g f2564b;

    /* renamed from: c, reason: collision with root package name */
    public final c3.f f2565c;

    /* renamed from: d, reason: collision with root package name */
    public final C0152f f2566d;

    public u(int i, H3.g gVar, c3.f fVar, C0152f c0152f) {
        super(i);
        this.f2565c = fVar;
        this.f2564b = gVar;
        this.f2566d = c0152f;
        if (i == 2 && gVar.f1797b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // L2.p
    public final boolean a(k kVar) {
        return this.f2564b.f1797b;
    }

    @Override // L2.p
    public final J2.d[] b(k kVar) {
        return (J2.d[]) this.f2564b.f1799d;
    }

    @Override // L2.p
    public final void c(Status status) {
        this.f2566d.getClass();
        this.f2565c.a(status.f6906c != null ? new K2.j(status) : new K2.d(status));
    }

    @Override // L2.p
    public final void d(Exception exc) {
        this.f2565c.a(exc);
    }

    @Override // L2.p
    public final void e(k kVar) throws DeadObjectException {
        c3.f fVar = this.f2565c;
        try {
            H3.g gVar = this.f2564b;
            ((g) ((C0117e) gVar.f1800e).f245b).accept(kVar.f2523b, fVar);
        } catch (DeadObjectException e6) {
            throw e6;
        } catch (RemoteException e7) {
            c(p.g(e7));
        } catch (RuntimeException e8) {
            fVar.a(e8);
        }
    }

    @Override // L2.p
    public final void f(V2.h hVar, boolean z6) {
        Map map = (Map) hVar.f3876c;
        Boolean boolValueOf = Boolean.valueOf(z6);
        c3.f fVar = this.f2565c;
        map.put(fVar, boolValueOf);
        fVar.f5902a.a(new C2351a(hVar, fVar, 6, false));
    }
}
