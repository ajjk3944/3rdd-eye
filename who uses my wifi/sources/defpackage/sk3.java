package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sk3 implements ServiceConnection {
    public final /* synthetic */ x03 a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        x03 x03Var = this.a;
        ((er3) x03Var.i).a("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        x03Var.c(new sz2(this, iBinder, 15));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        x03 x03Var = this.a;
        ((er3) x03Var.i).a("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        x03Var.c(new bh3(4, this));
    }
}
