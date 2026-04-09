package rl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public enum u {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");


    /* renamed from: b, reason: collision with root package name */
    public static final b f33178b = new b();

    /* renamed from: a, reason: collision with root package name */
    public final String f33185a;

    u(String str) {
        this.f33185a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f33185a;
    }
}
