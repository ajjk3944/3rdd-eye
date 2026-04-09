package xr;

import java.util.Collection;

/* loaded from: classes.dex */
public final class y extends s implements hs.b {

    /* renamed from: a, reason: collision with root package name */
    public final qs.c f25518a;

    public y(qs.c cVar) {
        br.l.e(cVar, "fqName");
        this.f25518a = cVar;
    }

    @Override // hs.b
    public final e a(qs.c cVar) {
        br.l.e(cVar, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return br.l.a(this.f25518a, ((y) obj).f25518a);
        }
        return false;
    }

    @Override // hs.b
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return mq.w.f16945a;
    }

    public final int hashCode() {
        return this.f25518a.hashCode();
    }

    public final String toString() {
        return y.class.getName() + ": " + this.f25518a;
    }
}
