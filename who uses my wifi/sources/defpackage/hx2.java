package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class hx2 extends Exception {
    public final int f;

    public hx2(int i) {
        this.f = i;
    }

    public hx2(String str, int i) {
        super(str);
        this.f = i;
    }

    public hx2(String str, Throwable th) {
        super(str, th);
        this.f = 1;
    }
}
