package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ i5 g;

    public /* synthetic */ sg(i5 i5Var, int i) {
        this.f = i;
        this.g = i5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                this.g.invalidateOptionsMenu();
                break;
            default:
                ch.f(this.g);
                break;
        }
    }
}
