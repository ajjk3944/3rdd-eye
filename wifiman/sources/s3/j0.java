package s3;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class j0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l0 f61308a;

    /* synthetic */ j0(l0 l0Var, k0 k0Var) {
        this.f61308a = l0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f61308a.f61309g) {
                try {
                    h0 h0Var = (h0) message.obj;
                    i0 i0Var = (i0) this.f61308a.f61309g.get(h0Var);
                    if (i0Var != null && i0Var.i()) {
                        if (i0Var.j()) {
                            i0Var.g("GmsClientSupervisor");
                        }
                        this.f61308a.f61309g.remove(h0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f61308a.f61309g) {
            try {
                h0 h0Var2 = (h0) message.obj;
                i0 i0Var2 = (i0) this.f61308a.f61309g.get(h0Var2);
                if (i0Var2 != null && i0Var2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(h0Var2), new Exception());
                    ComponentName componentNameB = i0Var2.b();
                    if (componentNameB == null) {
                        componentNameB = h0Var2.a();
                    }
                    if (componentNameB == null) {
                        String strC = h0Var2.c();
                        AbstractC7901p.l(strC);
                        componentNameB = new ComponentName(strC, "unknown");
                    }
                    i0Var2.onServiceDisconnected(componentNameB);
                }
            } finally {
            }
        }
        return true;
    }
}
