package j2;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2546b {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f21332a;

    EnumC2546b(int i) {
        this.f21332a = i;
    }

    public static EnumC2546b a(int i) {
        for (EnumC2546b enumC2546b : values()) {
            if (enumC2546b.f21332a == i) {
                return enumC2546b;
            }
        }
        return null;
    }
}
