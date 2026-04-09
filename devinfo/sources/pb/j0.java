package pb;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.applovin.sdk.AppLovinMediationProvider;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f31631a;

    public /* synthetic */ j0(k0 k0Var) {
        this.f31631a = k0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            k0 k0Var = this.f31631a;
            synchronized (k0Var.f31637a) {
                try {
                    h0 h0Var = (h0) message.obj;
                    i0 i0Var = (i0) k0Var.f31637a.get(h0Var);
                    if (i0Var != null && i0Var.f31617a.isEmpty()) {
                        if (i0Var.f31619c) {
                            h0 h0Var2 = i0Var.f31621e;
                            k0 k0Var2 = i0Var.g;
                            k0Var2.f31639c.removeMessages(1, h0Var2);
                            k0Var2.f31640d.b(k0Var2.f31638b, i0Var);
                            i0Var.f31619c = false;
                            i0Var.f31618b = 2;
                        }
                        k0Var.f31637a.remove(h0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i4 != 1) {
            return false;
        }
        k0 k0Var3 = this.f31631a;
        synchronized (k0Var3.f31637a) {
            try {
                h0 h0Var3 = (h0) message.obj;
                i0 i0Var2 = (i0) k0Var3.f31637a.get(h0Var3);
                if (i0Var2 != null && i0Var2.f31618b == 3) {
                    String strValueOf = String.valueOf(h0Var3);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentName = i0Var2.f31622f;
                    if (componentName == null) {
                        h0Var3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = h0Var3.f31615b;
                        y.h(str);
                        componentName = new ComponentName(str, AppLovinMediationProvider.UNKNOWN);
                    }
                    i0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
