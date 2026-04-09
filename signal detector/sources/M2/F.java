package M2;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class F implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f2722a;

    public /* synthetic */ F(G g2) {
        this.f2722a = g2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            G g2 = this.f2722a;
            synchronized (g2.f2725a) {
                try {
                    D d6 = (D) message.obj;
                    E e6 = (E) g2.f2725a.get(d6);
                    if (e6 != null && e6.f2715a.isEmpty()) {
                        if (e6.f2717c) {
                            D d7 = e6.f2719e;
                            G g6 = e6.f2721g;
                            g6.f2727c.removeMessages(1, d7);
                            g6.f2728d.b(g6.f2726b, e6);
                            e6.f2717c = false;
                            e6.f2716b = 2;
                        }
                        g2.f2725a.remove(d6);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        G g7 = this.f2722a;
        synchronized (g7.f2725a) {
            try {
                D d8 = (D) message.obj;
                E e7 = (E) g7.f2725a.get(d8);
                if (e7 != null && e7.f2716b == 3) {
                    String strValueOf = String.valueOf(d8);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = e7.f2720f;
                    if (componentName == null) {
                        d8.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = d8.f2713b;
                        u.e(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    e7.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
