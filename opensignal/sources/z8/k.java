package z8;

/* loaded from: classes.dex */
public final class k implements b {

    /* renamed from: a, reason: collision with root package name */
    public final j f26739a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26740b;

    public k(String str, j jVar, boolean z10) {
        this.f26739a = jVar;
        this.f26740b = z10;
    }

    @Override // z8.b
    public final t8.c a(r8.v vVar, r8.h hVar, a9.b bVar) {
        if (vVar.I.f17548a.contains(r8.w.MergePathsApi19)) {
            return new t8.m(this);
        }
        e9.c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f26739a + '}';
    }
}
