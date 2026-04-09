package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class tl implements ServiceConnection {
    public Context a;

    public abstract void a(sl slVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        p10 p10Var;
        if (this.a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = o10.f;
        if (iBinder == null) {
            p10Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(p10.b);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p10)) {
                n10 n10Var = new n10();
                n10Var.f = iBinder;
                p10Var = n10Var;
            } else {
                p10Var = (p10) iInterfaceQueryLocalInterface;
            }
        }
        a(new sl(p10Var, componentName));
    }
}
