package y8;

/* loaded from: classes4.dex */
public final class f implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f25171e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final f f25172f = g.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f25173a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25174b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25175c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25176d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public a() {
        }
    }

    public f(int i10, int i11, int i12) {
        this.f25173a = i10;
        this.f25174b = i11;
        this.f25175c = i12;
        this.f25176d = b(i10, i11, i12);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f other) {
        kotlin.jvm.internal.p.e(other, "other");
        return this.f25176d - other.f25176d;
    }

    public final int b(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f fVar = obj instanceof f ? (f) obj : null;
        return fVar != null && this.f25176d == fVar.f25176d;
    }

    public int hashCode() {
        return this.f25176d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25173a);
        sb.append('.');
        sb.append(this.f25174b);
        sb.append('.');
        sb.append(this.f25175c);
        return sb.toString();
    }
}
