package W;

import C.C0624k;
import C.k0;
import W.O;

/* compiled from: AutoValue_StreamInfo.java */
/* renamed from: W.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1625m extends O {

    /* renamed from: d, reason: collision with root package name */
    public final int f13282d;

    /* renamed from: e, reason: collision with root package name */
    public final O.a f13283e;

    /* renamed from: f, reason: collision with root package name */
    public final C0624k f13284f;

    public C1625m(int i, O.a aVar, C0624k c0624k) {
        this.f13282d = i;
        if (aVar == null) {
            throw new NullPointerException("Null streamState");
        }
        this.f13283e = aVar;
        this.f13284f = c0624k;
    }

    @Override // W.O
    public final int a() {
        return this.f13282d;
    }

    @Override // W.O
    public final k0.d b() {
        return this.f13284f;
    }

    @Override // W.O
    public final O.a c() {
        return this.f13283e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        if (this.f13282d != o10.a() || !this.f13283e.equals(o10.c())) {
            return false;
        }
        C0624k c0624k = this.f13284f;
        return c0624k == null ? o10.b() == null : c0624k.equals(o10.b());
    }

    public final int hashCode() {
        int iHashCode = (((this.f13282d ^ 1000003) * 1000003) ^ this.f13283e.hashCode()) * 1000003;
        C0624k c0624k = this.f13284f;
        return (c0624k == null ? 0 : c0624k.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "StreamInfo{id=" + this.f13282d + ", streamState=" + this.f13283e + ", inProgressTransformationInfo=" + this.f13284f + "}";
    }
}
