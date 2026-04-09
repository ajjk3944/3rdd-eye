package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t53 implements n53 {
    public final int a;
    public final int b;

    public t53(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.n53
    public final void c(Object obj) {
        int i;
        Bundle bundle = ((jm2) obj).a;
        int i2 = this.a;
        if (i2 == -1 || (i = this.b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i2);
        bundle.putInt("crashes_without_flags", i);
        sv1 sv1Var = sv1.f;
        if (tw1.e.c.j) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
