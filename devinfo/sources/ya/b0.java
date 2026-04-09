package ya;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.dm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b0 extends ac.k {
    @Override // ac.k
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th2) {
            ua.j jVar = ua.j.C;
            f0 f0Var = jVar.f35261c;
            Context context = jVar.f35265h.f19197e;
            if (context != null) {
                try {
                    if (((Boolean) dm.f10517b.u()).booleanValue()) {
                        tb.b.a(context, th2);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th2;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e2) {
            ua.j.C.f35265h.f("AdMobHandler.handleMessage", e2);
        }
    }
}
