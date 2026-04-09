package io.sentry.android.core.performance;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final g f11722a = new g();

    /* renamed from: d, reason: collision with root package name */
    public final g f11723d = new g();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int iCompare = Long.compare(this.f11722a.f11734g, cVar.f11722a.f11734g);
        return iCompare == 0 ? Long.compare(this.f11723d.f11734g, cVar.f11723d.f11734g) : iCompare;
    }
}
