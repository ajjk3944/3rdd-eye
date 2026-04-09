package If;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: If.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3023c {

    /* renamed from: a, reason: collision with root package name */
    private final String f9162a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.c f9163b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f9164c;

    public C3023c(String id2, s9.c image, s9.d name) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(image, "image");
        AbstractC6492s.i(name, "name");
        this.f9162a = id2;
        this.f9163b = image;
        this.f9164c = name;
    }

    public final String a() {
        return this.f9162a;
    }

    public final s9.c b() {
        return this.f9163b;
    }

    public final s9.d c() {
        return this.f9164c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3023c)) {
            return false;
        }
        C3023c c3023c = (C3023c) obj;
        return AbstractC6492s.d(this.f9162a, c3023c.f9162a) && AbstractC6492s.d(this.f9163b, c3023c.f9163b) && AbstractC6492s.d(this.f9164c, c3023c.f9164c);
    }

    public int hashCode() {
        return (((this.f9162a.hashCode() * 31) + this.f9163b.hashCode()) * 31) + this.f9164c.hashCode();
    }

    public String toString() {
        return "Device(id=" + this.f9162a + ", image=" + this.f9163b + ", name=" + this.f9164c + ")";
    }
}
