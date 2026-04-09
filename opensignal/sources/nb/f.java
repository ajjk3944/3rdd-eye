package nb;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f17471a;

    /* renamed from: d, reason: collision with root package name */
    public final b f17472d;

    public f(int i10, b bVar) {
        this.f17471a = i10;
        this.f17472d = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f17471a, ((f) obj).f17471a);
    }
}
