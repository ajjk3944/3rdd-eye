package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class dj3 implements zk3 {
    public static final /* synthetic */ dj3 b = new dj3(0);
    public static final /* synthetic */ dj3 c = new dj3(1);
    public static final /* synthetic */ dj3 d = new dj3(2);
    public static final /* synthetic */ dj3 e = new dj3(3);
    public static final /* synthetic */ dj3 f = new dj3(4);
    public static final /* synthetic */ dj3 g = new dj3(5);
    public static final /* synthetic */ dj3 h = new dj3(6);
    public static final /* synthetic */ dj3 i = new dj3(7);
    public final /* synthetic */ int a;

    public /* synthetic */ dj3(int i2) {
        this.a = i2;
    }

    @Override // defpackage.zk3
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return pj3.b(5);
            case 4:
                lf1 lf1Var = (lf1) obj;
                lf1Var.getClass();
                return lf1Var.getClass().getSimpleName();
            case 5:
                ui4 ui4Var = (ui4) obj;
                int i2 = ph4.N;
                String str = ui4Var.a;
                String str2 = ui4Var.b;
                return ex0.l(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str, ": ", str2);
            case 6:
                return xm3.m(gi2.O(((jh4) obj).l().b, i));
            default:
                ri4 ri4Var = ri4.d;
                return Integer.valueOf(((d02) obj).c);
        }
    }
}
