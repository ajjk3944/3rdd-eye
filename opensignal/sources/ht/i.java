package ht;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final sr.h f10909a;

    public i(sr.h hVar) {
        br.l.e(hVar, "annotations");
        this.f10909a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return br.l.a(((i) obj).f10909a, this.f10909a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10909a.hashCode();
    }
}
