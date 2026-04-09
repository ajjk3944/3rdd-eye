package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class c90 implements h90 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i90 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c90(i90 i90Var, int i, int i2) {
        this.a = i2;
        this.b = i90Var;
        this.c = i;
    }

    @Override // defpackage.h90
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o(this.c);
                break;
            case 1:
                this.b.r(this.c);
                break;
            default:
                this.b.n(this.c);
                break;
        }
    }
}
