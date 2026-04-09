package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ub3 {
    public final Context a;
    public final e51 b;
    public final ScheduledExecutorService c;
    public final ClientApi d = new ClientApi();
    public final t83 e;
    public final ym f;

    public ub3(Context context, e51 e51Var, ScheduledExecutorService scheduledExecutorService, t83 t83Var, ym ymVar) {
        this.a = context;
        this.b = e51Var;
        this.c = scheduledExecutorService;
        this.f = ymVar;
        this.e = t83Var;
    }

    public static kb3 c() {
        iz1 iz1Var = mz1.D;
        tw1 tw1Var = tw1.e;
        return new kb3(((Long) tw1Var.c.a(iz1Var)).longValue(), ((Long) tw1Var.c.a(mz1.E)).longValue());
    }

    public final jb3 a(ae3 ae3Var, od2 od2Var) {
        s2 s2VarA = s2.a(ae3Var.g);
        if (s2VarA == null) {
            return null;
        }
        int iOrdinal = s2VarA.ordinal();
        Context context = this.a;
        e51 e51Var = this.b;
        if (iOrdinal == 1) {
            return new jb3(this.d, context, e51Var.h, this.e, ae3Var, od2Var, this.c, c(), this.f, 1);
        }
        if (iOrdinal == 2) {
            return new jb3(this.d, context, e51Var.h, this.e, ae3Var, od2Var, this.c, c(), this.f, 2);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new jb3(this.d, context, e51Var.h, this.e, ae3Var, od2Var, this.c, c(), this.f, 0);
    }

    public final jb3 b(String str, ae3 ae3Var, bf2 bf2Var) {
        s2 s2VarA = s2.a(ae3Var.g);
        if (s2VarA == null) {
            return null;
        }
        int iOrdinal = s2VarA.ordinal();
        Context context = this.a;
        e51 e51Var = this.b;
        if (iOrdinal == 1) {
            return new jb3(str, this.d, context, e51Var.h, this.e, ae3Var, bf2Var, this.c, c(), this.f, 1);
        }
        if (iOrdinal == 2) {
            return new jb3(str, this.d, context, e51Var.h, this.e, ae3Var, bf2Var, this.c, c(), this.f, 2);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new jb3(str, this.d, context, e51Var.h, this.e, ae3Var, bf2Var, this.c, c(), this.f, 0);
    }
}
