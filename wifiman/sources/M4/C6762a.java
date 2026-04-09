package m4;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6762a extends AbstractC6768g {

    /* renamed from: a, reason: collision with root package name */
    static final C6762a f53123a = new C6762a();

    private C6762a() {
    }

    static AbstractC6768g h() {
        return f53123a;
    }

    @Override // m4.AbstractC6768g
    public Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // m4.AbstractC6768g
    public boolean d() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
