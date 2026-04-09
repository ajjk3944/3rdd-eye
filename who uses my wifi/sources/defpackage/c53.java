package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c53 implements q53 {
    public final String a;
    public final int b;

    public c53(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.q53
    public final n70 a() {
        return pu1.r(new d53(this.a, this.b));
    }

    @Override // defpackage.q53
    public final int d() {
        return 31;
    }
}
