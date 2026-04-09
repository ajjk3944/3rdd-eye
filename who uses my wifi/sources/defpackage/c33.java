package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c33 implements n53 {
    public final /* synthetic */ int a;
    public final boolean b;

    public /* synthetic */ c33(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        switch (this.a) {
            case 0:
                ((jm2) obj).a.putString("adid_p", true != this.b ? "0" : "1");
                break;
            case 1:
                ((jm2) obj).a.putBoolean("ibrr", this.b);
                break;
            default:
                jm2 jm2Var = (jm2) obj;
                if (this.b) {
                    jm2Var.a.putBoolean("sdk_prefetch", true);
                    break;
                }
                break;
        }
    }
}
