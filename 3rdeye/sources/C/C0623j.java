package C;

import C.k0;
import android.view.Surface;

/* compiled from: AutoValue_SurfaceRequest_Result.java */
/* renamed from: C.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623j extends k0.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f719a;

    /* renamed from: b, reason: collision with root package name */
    public final Surface f720b;

    public C0623j(int i, Surface surface) {
        this.f719a = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f720b = surface;
    }

    @Override // C.k0.c
    public final int a() {
        return this.f719a;
    }

    @Override // C.k0.c
    public final Surface b() {
        return this.f720b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0.c)) {
            return false;
        }
        k0.c cVar = (k0.c) obj;
        return this.f719a == cVar.a() && this.f720b.equals(cVar.b());
    }

    public final int hashCode() {
        return this.f720b.hashCode() ^ ((this.f719a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.f719a + ", surface=" + this.f720b + "}";
    }
}
