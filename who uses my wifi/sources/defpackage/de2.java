package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class de2 implements Runnable {
    public final /* synthetic */ int f;
    public final ee2 g;
    public boolean h;

    public de2(ee2 ee2Var) {
        this.f = 2;
        this.h = false;
        this.g = ee2Var;
    }

    public void a() {
        this.h = true;
        this.g.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                this.g.c("windowVisibilityChanged", "isVisible", String.valueOf(this.h));
                break;
            case 1:
                boolean z = this.h;
                ee2 ee2Var = this.g;
                ee2Var.getClass();
                ee2Var.c("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
                break;
            default:
                if (!this.h) {
                    this.g.b();
                    i63 i63Var = lf4.l;
                    i63Var.removeCallbacks(this);
                    i63Var.postDelayed(this, 250L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ de2(ee2 ee2Var, boolean z, int i) {
        this.f = i;
        this.h = z;
        this.g = ee2Var;
    }
}
