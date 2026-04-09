package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class re2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object i;

    public /* synthetic */ re2(Object obj, boolean z, long j, int i) {
        this.f = i;
        this.i = obj;
        this.g = z;
        this.h = j;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                se2 se2Var = (se2) this.i;
                se2Var.h.z(this.h, this.g);
                break;
            default:
                ((ag2) this.i).z(this.h, this.g);
                break;
        }
    }
}
