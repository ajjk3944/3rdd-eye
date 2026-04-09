package Ta;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f21521a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21522b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21523c;

    public c(String id2, String name, String model) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(model, "model");
        this.f21521a = id2;
        this.f21522b = name;
        this.f21523c = model;
    }

    public final String a() {
        return this.f21521a;
    }

    public final String b() {
        return this.f21523c;
    }

    public final String c() {
        return this.f21522b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(this.f21521a, cVar.f21521a) && AbstractC6492s.d(this.f21522b, cVar.f21522b) && AbstractC6492s.d(this.f21523c, cVar.f21523c);
    }

    public int hashCode() {
        return (((this.f21521a.hashCode() * 31) + this.f21522b.hashCode()) * 31) + this.f21523c.hashCode();
    }

    public String toString() {
        return "UiAccountDeviceIdentifiers(id=" + this.f21521a + ", name=" + this.f21522b + ", model=" + this.f21523c + ")";
    }
}
