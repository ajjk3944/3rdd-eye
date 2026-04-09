package W2;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private Class f23596a;

    /* renamed from: b, reason: collision with root package name */
    private Class f23597b;

    /* renamed from: c, reason: collision with root package name */
    private Class f23598c;

    public j() {
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f23596a = cls;
        this.f23597b = cls2;
        this.f23598c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f23596a.equals(jVar.f23596a) && this.f23597b.equals(jVar.f23597b) && l.d(this.f23598c, jVar.f23598c);
    }

    public int hashCode() {
        int iHashCode = ((this.f23596a.hashCode() * 31) + this.f23597b.hashCode()) * 31;
        Class cls = this.f23598c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f23596a + ", second=" + this.f23597b + '}';
    }

    public j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
