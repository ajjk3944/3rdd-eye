package E;

import E.h;
import android.graphics.Bitmap;

/* compiled from: AutoValue_Bitmap2JpegBytes_In.java */
/* renamed from: E.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653a extends h.b {

    /* renamed from: a, reason: collision with root package name */
    public final N.m<Bitmap> f1295a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1296b;

    public C0653a(N.m<Bitmap> mVar, int i) {
        if (mVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f1295a = mVar;
        this.f1296b = i;
    }

    @Override // E.h.b
    public final int a() {
        return this.f1296b;
    }

    @Override // E.h.b
    public final N.m<Bitmap> b() {
        return this.f1295a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h.b)) {
            return false;
        }
        h.b bVar = (h.b) obj;
        return this.f1295a.equals(bVar.b()) && this.f1296b == bVar.a();
    }

    public final int hashCode() {
        return ((this.f1295a.hashCode() ^ 1000003) * 1000003) ^ this.f1296b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.f1295a);
        sb.append(", jpegQuality=");
        return B4.i.j(sb, this.f1296b, "}");
    }
}
