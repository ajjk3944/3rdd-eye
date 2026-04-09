package k4;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class p extends j {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f51210b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f51211c;

    p(r rVar, IBinder iBinder) {
        this.f51210b = iBinder;
        this.f51211c = rVar;
    }

    @Override // k4.j
    public final void a() throws RemoteException {
        this.f51211c.f51213a.f51227m = e.c(this.f51210b);
        t.q(this.f51211c.f51213a);
        this.f51211c.f51213a.f51221g = false;
        Iterator it = this.f51211c.f51213a.f51218d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f51211c.f51213a.f51218d.clear();
    }
}
