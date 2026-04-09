package l5;

import android.media.metrics.LogSessionId;
import e5.n0;
import e5.o0;

/* loaded from: classes.dex */
public abstract class o {
    public static void a(i iVar, o0 o0Var) {
        n0 n0Var = o0Var.f7911a;
        n0Var.getClass();
        LogSessionId logSessionId = n0Var.f7905a;
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        iVar.f14718b.setString("log-session-id", logSessionId.getStringId());
    }
}
