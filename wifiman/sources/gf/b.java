package Gf;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final s9.d f7366a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f7367b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7368c;

    public b(s9.d number, s9.d quality, boolean z10) {
        AbstractC6492s.i(number, "number");
        AbstractC6492s.i(quality, "quality");
        this.f7366a = number;
        this.f7367b = quality;
        this.f7368c = z10;
    }

    public final boolean a() {
        return this.f7368c;
    }

    public final s9.d b() {
        return this.f7366a;
    }

    public final s9.d c() {
        return this.f7367b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC6492s.d(this.f7366a, bVar.f7366a) && AbstractC6492s.d(this.f7367b, bVar.f7367b) && this.f7368c == bVar.f7368c;
    }

    public int hashCode() {
        return (((this.f7366a.hashCode() * 31) + this.f7367b.hashCode()) * 31) + Boolean.hashCode(this.f7368c);
    }

    public String toString() {
        return "Model(number=" + this.f7366a + ", quality=" + this.f7367b + ", highlighted=" + this.f7368c + ")";
    }
}
