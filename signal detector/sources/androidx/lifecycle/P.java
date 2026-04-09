package androidx.lifecycle;

import p0.C2769a;

/* loaded from: classes.dex */
public class P implements Z {

    /* renamed from: b, reason: collision with root package name */
    public static P f5207b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5208a;

    @Override // androidx.lifecycle.Z
    public X a(Class cls) {
        switch (this.f5208a) {
            case 0:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            case 1:
                return com.bumptech.glide.c.j(cls);
            case 2:
                return new k0.M(true);
            case 3:
                return new C2769a();
            default:
                return new q0.o();
        }
    }

    @Override // androidx.lifecycle.Z
    public final X b(q5.d dVar, n0.d dVar2) {
        switch (this.f5208a) {
        }
        return A.f.a(this, dVar, dVar2);
    }

    @Override // androidx.lifecycle.Z
    public X c(Class cls, n0.d dVar) {
        switch (this.f5208a) {
        }
        return a(cls);
    }
}
