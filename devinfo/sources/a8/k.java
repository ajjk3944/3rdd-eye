package a8;

import android.graphics.Bitmap;
import t8.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final f f243a;

    /* renamed from: b, reason: collision with root package name */
    public int f244b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f245c;

    public k(f fVar) {
        this.f243a = fVar;
    }

    @Override // a8.i
    public final void a() {
        this.f243a.u(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f244b == kVar.f244b && m.b(this.f245c, kVar.f245c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f244b * 31;
        Bitmap.Config config = this.f245c;
        return i4 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return l.c(this.f244b, this.f245c);
    }
}
