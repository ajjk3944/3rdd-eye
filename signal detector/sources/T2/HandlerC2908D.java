package t2;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.AbstractC1857sa;

/* renamed from: t2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC2908D extends W2.e {
    @Override // W2.e
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            p2.j jVar = p2.j.f22785C;
            C2911G c2911g = jVar.f22790c;
            Context context = jVar.f22795h.f8972e;
            if (context != null) {
                try {
                    if (((Boolean) AbstractC1857sa.f16750b.v()).booleanValue()) {
                        Q2.b.a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e6) {
            p2.j.f22785C.f22795h.f("AdMobHandler.handleMessage", e6);
        }
    }
}
