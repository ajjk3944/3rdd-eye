package L2;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f2544a;

    public p(int i) {
        this.f2544a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(k kVar);

    public abstract J2.d[] b(k kVar);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(k kVar);

    public abstract void f(V2.h hVar, boolean z6);
}
