package rs;

/* loaded from: classes.dex */
public final class n implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f21767a;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f21768d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21769g;

    public n(int i10, j0 j0Var, boolean z10) {
        this.f21767a = i10;
        this.f21768d = j0Var;
        this.f21769g = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f21767a - ((n) obj).f21767a;
    }
}
