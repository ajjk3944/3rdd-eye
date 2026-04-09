package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mj4 {
    public final d02 a;
    public final int[] b;

    public mj4(d02 d02Var, int[] iArr) {
        if (iArr.length == 0) {
            a30.C("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = d02Var;
        this.b = iArr;
    }
}
