package defpackage;

import android.content.Context;
import android.os.Message;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i63 extends wc1 {
    @Override // defpackage.wc1
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            hg4 hg4Var = hg4.C;
            lf4 lf4Var = hg4Var.c;
            Context context = hg4Var.h.e;
            if (context != null) {
                try {
                    if (((Boolean) f12.b.w()).booleanValue()) {
                        m54.a(context, th);
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
        } catch (Exception e) {
            hg4.C.h.d("AdMobHandler.handleMessage", e);
        }
    }
}
