package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w33 implements n53 {
    public final /* synthetic */ int a;
    public final Integer b;

    public /* synthetic */ w33(Integer num, int i) {
        this.a = i;
        this.b = num;
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        switch (this.a) {
            case 0:
                jm2 jm2Var = (jm2) obj;
                Integer num = this.b;
                if (num != null) {
                    jm2Var.a.putInt("aos", num.intValue());
                    break;
                }
                break;
            default:
                jm2 jm2Var2 = (jm2) obj;
                Integer num2 = this.b;
                if (num2 != null) {
                    jm2Var2.a.putInt("dspct", Math.min(num2.intValue(), 20));
                    break;
                }
                break;
        }
    }
}
