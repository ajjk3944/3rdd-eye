package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ia4 implements ga4 {
    public static final Object c = new Object();
    public volatile ca4 a;
    public volatile Object b;

    public static ga4 a(ca4 ca4Var) {
        if ((ca4Var instanceof ia4) || (ca4Var instanceof ba4)) {
            return ca4Var;
        }
        ia4 ia4Var = new ia4();
        ia4Var.b = c;
        ia4Var.a = ca4Var;
        return ia4Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        ca4 ca4Var = this.a;
        if (ca4Var == null) {
            return this.b;
        }
        Object objD = ca4Var.d();
        this.b = objD;
        this.a = null;
        return objD;
    }
}
