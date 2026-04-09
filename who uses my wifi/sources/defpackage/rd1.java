package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rd1 {
    public final /* synthetic */ zf4 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ sd1 c;

    public rd1(sd1 sd1Var, zf4 zf4Var, int i, long j) {
        this.a = zf4Var;
        this.b = i;
        this.c = sd1Var;
    }

    public final void a() {
        sd1 sd1Var = this.c;
        sd1Var.getClass();
        Trace.beginSection("dropVideoBuffer");
        this.a.I(this.b);
        Trace.endSection();
        sd1Var.u0(0, 1);
    }
}
