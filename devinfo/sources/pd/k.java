package pd;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f31739a;

    public k(int i4) {
        this.f31739a = i4;
    }

    public static k a(int i4) {
        byte b10 = (byte) (((byte) 1) | 2);
        if (b10 == 3) {
            return new k(i4);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof k) && this.f31739a == ((k) obj).f31739a;
    }

    public final int hashCode() {
        return ((this.f31739a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return r5.c.h(this.f31739a, "AppUpdateOptions{appUpdateType=", ", allowAssetPackDeletion=false}");
    }
}
