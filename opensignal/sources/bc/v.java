package bc;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f2656a;

    public v(int i10) {
        this.f2656a = i10;
    }

    public static Status h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract Feature[] a(n nVar);

    public abstract boolean b(n nVar);

    public abstract int c(n nVar);

    public abstract void d(Status status);

    public abstract void e(Exception exc);

    public abstract void f(bm.e eVar, boolean z10);

    public abstract void g(n nVar);
}
