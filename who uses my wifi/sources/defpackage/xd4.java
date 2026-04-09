package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xd4 {
    public static final xd4 d;
    public final String a;
    public final x34 b;
    public final Object c;

    static {
        new xd4("");
        d = new xd4("preload");
    }

    public xd4(String str) {
        x34 x34Var;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            x34Var = new x34();
            x34Var.f = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            x34Var = null;
        }
        this.b = x34Var;
        this.c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd4)) {
            return false;
        }
        xd4 xd4Var = (xd4) obj;
        return Objects.equals(this.a, xd4Var.a) && Objects.equals(this.b, xd4Var.b) && Objects.equals(this.c, xd4Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
