package P;

import B4.i;
import android.opengl.EGLSurface;

/* compiled from: AutoValue_OutputSurface.java */
/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    public final EGLSurface f10542a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10543b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10544c;

    public c(EGLSurface eGLSurface, int i, int i10) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f10542a = eGLSurface;
        this.f10543b = i;
        this.f10544c = i10;
    }

    @Override // P.g
    public final EGLSurface a() {
        return this.f10542a;
    }

    @Override // P.g
    public final int b() {
        return this.f10544c;
    }

    @Override // P.g
    public final int c() {
        return this.f10543b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f10542a.equals(gVar.a()) && this.f10543b == gVar.c() && this.f10544c == gVar.b();
    }

    public final int hashCode() {
        return ((((this.f10542a.hashCode() ^ 1000003) * 1000003) ^ this.f10543b) * 1000003) ^ this.f10544c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.f10542a);
        sb.append(", width=");
        sb.append(this.f10543b);
        sb.append(", height=");
        return i.j(sb, this.f10544c, "}");
    }
}
