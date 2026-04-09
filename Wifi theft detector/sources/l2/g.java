package l2;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f23069a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23070b;

    public g(String str, int i10) {
        this.f23069a = str;
        this.f23070b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f23070b != gVar.f23070b) {
            return false;
        }
        return this.f23069a.equals(gVar.f23069a);
    }

    public int hashCode() {
        return (this.f23069a.hashCode() * 31) + this.f23070b;
    }
}
