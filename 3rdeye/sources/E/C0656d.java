package E;

import C.J;
import E.t;

/* compiled from: AutoValue_JpegBytes2Disk_In.java */
/* renamed from: E.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0656d extends t.a {

    /* renamed from: a, reason: collision with root package name */
    public final N.m<byte[]> f1307a;

    public C0656d(N.m<byte[]> mVar, J.f fVar) {
        if (mVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f1307a = mVar;
        throw new NullPointerException("Null outputFileOptions");
    }

    @Override // E.t.a
    public final J.f a() {
        return null;
    }

    @Override // E.t.a
    public final N.m<byte[]> b() {
        return this.f1307a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t.a)) {
            return false;
        }
        t.a aVar = (t.a) obj;
        if (!this.f1307a.equals(aVar.b())) {
            return false;
        }
        aVar.a();
        throw null;
    }

    public final int hashCode() {
        this.f1307a.hashCode();
        throw null;
    }

    public final String toString() {
        return "In{packet=" + this.f1307a + ", outputFileOptions=" + ((Object) null) + "}";
    }
}
