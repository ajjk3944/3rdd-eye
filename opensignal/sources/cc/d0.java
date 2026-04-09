package cc;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class d0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f3613a;

    public /* synthetic */ d0(e0 e0Var) {
        this.f3613a = e0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            e0 e0Var = this.f3613a;
            synchronized (e0Var.f3640a) {
                try {
                    b0 b0Var = (b0) message.obj;
                    c0 c0Var = (c0) e0Var.f3640a.get(b0Var);
                    if (c0Var != null && c0Var.f3606a.isEmpty()) {
                        if (c0Var.f3608c) {
                            b0 b0Var2 = c0Var.f3610e;
                            e0 e0Var2 = c0Var.f3612g;
                            e0Var2.f3642c.removeMessages(1, b0Var2);
                            e0Var2.f3643d.c(e0Var2.f3641b, c0Var);
                            c0Var.f3608c = false;
                            c0Var.f3607b = 2;
                        }
                        e0Var.f3640a.remove(b0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        e0 e0Var3 = this.f3613a;
        synchronized (e0Var3.f3640a) {
            try {
                b0 b0Var3 = (b0) message.obj;
                c0 c0Var2 = (c0) e0Var3.f3640a.get(b0Var3);
                if (c0Var2 != null && c0Var2.f3607b == 3) {
                    String strValueOf = String.valueOf(b0Var3);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    io.sentry.android.core.e0.c("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentName = c0Var2.f3611f;
                    if (componentName == null) {
                        b0Var3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = b0Var3.f3604b;
                        s.h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    c0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
