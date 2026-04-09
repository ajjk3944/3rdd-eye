package s8;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import t8.m;
import x7.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public final int f33505b;

    /* renamed from: c, reason: collision with root package name */
    public final e f33506c;

    public a(int i4, e eVar) {
        this.f33505b = i4;
        this.f33506c = eVar;
    }

    @Override // x7.e
    public final void b(MessageDigest messageDigest) {
        this.f33506c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f33505b).array());
    }

    @Override // x7.e
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f33505b == aVar.f33505b && this.f33506c.equals(aVar.f33506c)) {
                return true;
            }
        }
        return false;
    }

    @Override // x7.e
    public final int hashCode() {
        return m.h(this.f33505b, this.f33506c);
    }
}
