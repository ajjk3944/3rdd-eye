package v6;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f23889a;

    /* renamed from: d, reason: collision with root package name */
    public final b f23890d;

    public f(int i10, b bVar) {
        this.f23889a = i10;
        this.f23890d = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f23889a, ((f) obj).f23889a);
    }
}
