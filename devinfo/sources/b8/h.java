package b8;

import java.security.MessageDigest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements u8.b {

    /* renamed from: a, reason: collision with root package name */
    public final MessageDigest f2085a;

    /* renamed from: b, reason: collision with root package name */
    public final u8.e f2086b = new u8.e();

    public h(MessageDigest messageDigest) {
        this.f2085a = messageDigest;
    }

    @Override // u8.b
    public final u8.e d() {
        return this.f2086b;
    }
}
