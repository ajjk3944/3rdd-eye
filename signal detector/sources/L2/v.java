package L2;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class v extends p {

    /* renamed from: b, reason: collision with root package name */
    public final c3.f f2567b;

    public v(c3.f fVar) {
        super(4);
        this.f2567b = fVar;
    }

    @Override // L2.p
    public final boolean a(k kVar) {
        if (kVar.f2527f.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // L2.p
    public final J2.d[] b(k kVar) {
        if (kVar.f2527f.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // L2.p
    public final void c(Status status) {
        this.f2567b.a(new K2.d(status));
    }

    @Override // L2.p
    public final void d(Exception exc) {
        this.f2567b.a(exc);
    }

    @Override // L2.p
    public final void e(k kVar) throws DeadObjectException {
        try {
            h(kVar);
        } catch (DeadObjectException e6) {
            c(p.g(e6));
            throw e6;
        } catch (RemoteException e7) {
            c(p.g(e7));
        } catch (RuntimeException e8) {
            this.f2567b.a(e8);
        }
    }

    public final void h(k kVar) {
        if (kVar.f2527f.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f2567b.b(Boolean.FALSE);
    }

    @Override // L2.p
    public final /* bridge */ /* synthetic */ void f(V2.h hVar, boolean z6) {
    }
}
