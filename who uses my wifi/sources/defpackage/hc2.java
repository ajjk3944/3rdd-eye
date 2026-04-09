package defpackage;

import android.content.Context;
import android.os.Process;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hc2 extends Thread {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc2(zg2 zg2Var, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.g = runnable2;
        this.h = zg2Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f) {
            case 0:
                new ug4((Context) this.g, null).a((String) this.h, null);
                break;
            default:
                Process.setThreadPriority(((zg2) this.h).b);
                ((Runnable) this.g).run();
                break;
        }
    }

    public hc2(j63 j63Var, Context context, String str) {
        this.g = context;
        this.h = str;
    }
}
