package Cj;

import Aj.g;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a implements Aj.a {

    /* renamed from: a, reason: collision with root package name */
    private long f2760a;

    /* renamed from: b, reason: collision with root package name */
    private long f2761b;

    /* renamed from: c, reason: collision with root package name */
    private g f2762c;

    @Override // Aj.a
    public g a() {
        return this.f2762c;
    }

    @Override // Aj.a
    public boolean b() {
        return !e();
    }

    @Override // Aj.a
    public long c() {
        return this.f2760a;
    }

    @Override // Aj.a
    public long d(int i10) {
        long jAbs = Math.abs(c());
        return (f() == 0 || Math.abs((((double) f()) / ((double) a().b())) * 100.0d) <= ((double) i10)) ? jAbs : jAbs + 1;
    }

    @Override // Aj.a
    public boolean e() {
        return c() < 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2761b == aVar.f2761b && this.f2760a == aVar.f2760a) {
            return Objects.equals(this.f2762c, aVar.f2762c);
        }
        return false;
    }

    public long f() {
        return this.f2761b;
    }

    public void g(long j10) {
        this.f2761b = j10;
    }

    public void h(long j10) {
        this.f2760a = j10;
    }

    public int hashCode() {
        return ((((Long.hashCode(this.f2761b) + 31) * 31) + Long.hashCode(this.f2760a)) * 31) + Objects.hashCode(this.f2762c);
    }

    public void i(g gVar) {
        this.f2762c = gVar;
    }

    public String toString() {
        return "DurationImpl [" + this.f2760a + " " + this.f2762c + ", delta=" + this.f2761b + "]";
    }
}
