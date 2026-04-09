package o7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum b {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* renamed from: a, reason: collision with root package name */
    public final String f30417a;

    b(String str) {
        this.f30417a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f30417a;
    }
}
