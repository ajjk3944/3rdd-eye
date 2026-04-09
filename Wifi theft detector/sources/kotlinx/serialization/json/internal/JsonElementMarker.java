package kotlinx.serialization.json.internal;

/* loaded from: classes4.dex */
public final class JsonElementMarker {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.internal.e0 f22970a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22971b;

    public JsonElementMarker(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        this.f22970a = new kotlinx.serialization.internal.e0(descriptor, new JsonElementMarker$origin$1(this));
    }

    public final boolean b() {
        return this.f22971b;
    }

    public final void c(int i10) {
        this.f22970a.a(i10);
    }

    public final int d() {
        return this.f22970a.d();
    }

    public final boolean e(kotlinx.serialization.descriptors.f fVar, int i10) {
        boolean z10 = !fVar.i(i10) && fVar.g(i10).b();
        this.f22971b = z10;
        return z10;
    }
}
