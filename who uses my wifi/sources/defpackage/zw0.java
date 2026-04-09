package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zw0 implements Handler.Callback {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ zw0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                ax0 ax0Var = (ax0) this.g;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (ax0Var.f) {
                    throw null;
                }
            case 1:
                mu2 mu2Var = (mu2) this.g;
                Iterator it = ((CopyOnWriteArraySet) mu2Var.f).iterator();
                while (it.hasNext()) {
                    ht2 ht2Var = (ht2) it.next();
                    vs2 vs2Var = (vs2) mu2Var.e;
                    if (!ht2Var.d && ht2Var.c) {
                        of4 of4VarG = ht2Var.b.g();
                        ht2Var.b = new nb(6);
                        ht2Var.c = false;
                        vs2Var.e(ht2Var.a, of4VarG);
                    }
                    if (((d13) mu2Var.d).a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                int i = message.what;
                if (i == 0) {
                    synchronized (((nf4) this.g).a) {
                        try {
                            kd4 kd4Var = (kd4) message.obj;
                            ud4 ud4Var = (ud4) ((nf4) this.g).a.get(kd4Var);
                            if (ud4Var != null && ud4Var.a.isEmpty()) {
                                if (ud4Var.c) {
                                    ud4Var.g.c.removeMessages(1, ud4Var.e);
                                    nf4 nf4Var = ud4Var.g;
                                    nf4Var.d.o(nf4Var.b, ud4Var);
                                    ud4Var.c = false;
                                    ud4Var.b = 2;
                                }
                                ((nf4) this.g).a.remove(kd4Var);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (i != 1) {
                        return false;
                    }
                    synchronized (((nf4) this.g).a) {
                        try {
                            kd4 kd4Var2 = (kd4) message.obj;
                            ud4 ud4Var2 = (ud4) ((nf4) this.g).a.get(kd4Var2);
                            if (ud4Var2 != null && ud4Var2.b == 3) {
                                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(kd4Var2)), new Exception());
                                ComponentName componentName = ud4Var2.f;
                                if (componentName == null) {
                                    kd4Var2.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = kd4Var2.b;
                                    ou1.j(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                ud4Var2.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
