package ya;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final Object f26177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26178b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26179c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26180d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26181e;

    public u(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean a() {
        return this.f26178b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f26177a.equals(uVar.f26177a) && this.f26178b == uVar.f26178b && this.f26179c == uVar.f26179c && this.f26180d == uVar.f26180d && this.f26181e == uVar.f26181e;
    }

    public final int hashCode() {
        return ((((((((this.f26177a.hashCode() + 527) * 31) + this.f26178b) * 31) + this.f26179c) * 31) + ((int) this.f26180d)) * 31) + this.f26181e;
    }

    public u(u uVar) {
        this.f26177a = uVar.f26177a;
        this.f26178b = uVar.f26178b;
        this.f26179c = uVar.f26179c;
        this.f26180d = uVar.f26180d;
        this.f26181e = uVar.f26181e;
    }

    public u(Object obj, int i10, int i11, long j, int i12) {
        this.f26177a = obj;
        this.f26178b = i10;
        this.f26179c = i11;
        this.f26180d = j;
        this.f26181e = i12;
    }
}
