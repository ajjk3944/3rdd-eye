package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zq {
    public int a;
    public int b;
    public int c;

    public zq(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }

    public static zq a(xe4 xe4Var) {
        return xe4Var.i ? new zq(3, 0, 0) : xe4Var.n ? new zq(2, 0, 0) : xe4Var.m ? new zq(0, 0, 0) : new zq(1, xe4Var.k, xe4Var.h);
    }

    public boolean b() {
        return this.a == 3;
    }

    public /* synthetic */ zq(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
