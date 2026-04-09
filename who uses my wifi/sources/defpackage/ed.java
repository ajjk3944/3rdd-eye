package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ed extends gd {
    public final /* synthetic */ ha1 g;
    public final /* synthetic */ UUID h;

    public ed(ha1 ha1Var, UUID uuid) {
        this.g = ha1Var;
        this.h = uuid;
    }

    @Override // defpackage.gd
    public final void b() {
        ha1 ha1Var = this.g;
        WorkDatabase workDatabase = ha1Var.r;
        workDatabase.c();
        try {
            gd.a(ha1Var, this.h.toString());
            workDatabase.h();
            workDatabase.f();
            gt0.a(ha1Var.q, ha1Var.r, ha1Var.t);
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
