package androidx.lifecycle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class x0 implements h1 {

    /* renamed from: b, reason: collision with root package name */
    public static x0 f1199b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1200a;

    public /* synthetic */ x0(int i4) {
        this.f1200a = i4;
    }

    @Override // androidx.lifecycle.h1
    public e1 a(Class cls) {
        switch (this.f1200a) {
            case 0:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            case 1:
                return com.bumptech.glide.f.j(cls);
            case 2:
                return new b5.w0(true);
            default:
                return new j5.a();
        }
    }

    @Override // androidx.lifecycle.h1
    public e1 b(Class cls, h5.c cVar) {
        switch (this.f1200a) {
            case 0:
                a(cls);
                throw null;
            case 1:
                return a(cls);
            case 2:
                return a(cls);
            default:
                return a(cls);
        }
    }

    @Override // androidx.lifecycle.h1
    public final e1 c(nk.e eVar, h5.c cVar) {
        switch (this.f1200a) {
        }
        return a0.g.a(this, eVar, cVar);
    }
}
