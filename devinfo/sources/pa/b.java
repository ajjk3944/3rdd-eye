package pa;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public enum b {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f31521a;

    b(int i4) {
        this.f31521a = i4;
    }

    public static b a(int i4) {
        for (b bVar : values()) {
            if (bVar.f31521a == i4) {
                return bVar;
            }
        }
        return null;
    }
}
