package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ls2 implements eu2 {
    public static final Object h = new Object();
    public volatile ws2 f;
    public volatile Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public static ls2 b(ws2 ws2Var) {
        if (ws2Var instanceof ls2) {
            return (ls2) ws2Var;
        }
        ls2 ls2Var = new ls2();
        ls2Var.g = h;
        ls2Var.f = ws2Var;
        return ls2Var;
    }

    @Override // defpackage.eu2
    /* renamed from: a */
    public final Object mo18a() {
        Object obj = this.g;
        Object obj2 = h;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.g;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objMo18a = this.f.mo18a();
                Object obj4 = this.g;
                if (obj4 != obj2 && obj4 != objMo18a) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objMo18a + ". This is likely due to a circular dependency.");
                }
                this.g = objMo18a;
                this.f = null;
                return objMo18a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
