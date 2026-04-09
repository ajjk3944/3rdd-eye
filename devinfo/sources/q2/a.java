package q2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f32144a = (1023 << 50) ^ (-1);

    /* renamed from: b, reason: collision with root package name */
    public static final long f32145b = (-1) ^ (33554431 << 25);

    /* renamed from: c, reason: collision with root package name */
    public static final long f32146c;

    static {
        long j = 33554431;
        f32146c = j | (Math.min(0, 1023) << 50) | (j << 25);
    }
}
