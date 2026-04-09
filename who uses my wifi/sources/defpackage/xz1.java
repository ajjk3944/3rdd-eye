package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xz1 extends tl {
    public final AtomicBoolean b = new AtomicBoolean(false);
    public Context c;
    public mv2 d;
    public mc2 e;
    public sl f;

    @Override // defpackage.tl
    public final void a(sl slVar) {
        this.f = slVar;
        try {
            ((n10) slVar.a).X0();
        } catch (RemoteException unused) {
        }
        this.e = slVar.b(new wz1(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f = null;
        this.e = null;
    }
}
