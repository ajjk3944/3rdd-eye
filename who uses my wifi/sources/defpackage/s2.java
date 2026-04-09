package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public enum s2 {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    public final int f;

    s2(int i) {
        this.f = i;
    }

    public static s2 a(int i) {
        for (s2 s2Var : values()) {
            if (s2Var.f == i) {
                return s2Var;
            }
        }
        return null;
    }
}
