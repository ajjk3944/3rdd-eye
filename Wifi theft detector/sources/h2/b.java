package h2;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21383a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21384b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21385c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21386d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21383a = z10;
        this.f21384b = z11;
        this.f21385c = z12;
        this.f21386d = z13;
    }

    public boolean a() {
        return this.f21383a;
    }

    public boolean b() {
        return this.f21385c;
    }

    public boolean c() {
        return this.f21386d;
    }

    public boolean d() {
        return this.f21384b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21383a == bVar.f21383a && this.f21384b == bVar.f21384b && this.f21385c == bVar.f21385c && this.f21386d == bVar.f21386d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f21383a;
        int i10 = r02;
        if (this.f21384b) {
            i10 = r02 + 16;
        }
        int i11 = i10;
        if (this.f21385c) {
            i11 = i10 + 256;
        }
        return this.f21386d ? i11 + 4096 : i11;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f21383a), Boolean.valueOf(this.f21384b), Boolean.valueOf(this.f21385c), Boolean.valueOf(this.f21386d));
    }
}
