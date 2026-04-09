package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class b90 implements h90 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ b90(i90 i90Var, String str, int i) {
        this.a = i;
        this.b = i90Var;
        this.c = str;
    }

    @Override // defpackage.h90
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q(this.c);
                break;
            case 1:
                this.b.p(this.c);
                break;
            default:
                this.b.s(this.c);
                break;
        }
    }
}
