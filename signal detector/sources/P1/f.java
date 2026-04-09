package p1;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class f implements I1.b {

    /* renamed from: a, reason: collision with root package name */
    public final MessageDigest f22744a;

    /* renamed from: b, reason: collision with root package name */
    public final I1.d f22745b = new I1.d();

    public f(MessageDigest messageDigest) {
        this.f22744a = messageDigest;
    }

    @Override // I1.b
    public final I1.d d() {
        return this.f22745b;
    }
}
