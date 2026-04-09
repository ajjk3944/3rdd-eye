package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class cc1 {
    public final int a;

    public cc1(int i) {
        this.a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(xb1 xb1Var);

    public abstract ju[] b(xb1 xb1Var);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(xb1 xb1Var);

    public abstract void f(tb1 tb1Var, boolean z);
}
