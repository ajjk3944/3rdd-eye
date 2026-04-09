package gf;

import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;

/* renamed from: gf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5900a {

    /* renamed from: a, reason: collision with root package name */
    private final String f47876a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7929a f47877b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f47878c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f47879d;

    /* renamed from: e, reason: collision with root package name */
    private final s9.d f47880e;

    public C5900a(String id2, InterfaceC7929a image, s9.d name, s9.d info, s9.d dVar) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(image, "image");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(info, "info");
        this.f47876a = id2;
        this.f47877b = image;
        this.f47878c = name;
        this.f47879d = info;
        this.f47880e = dVar;
    }

    public final String a() {
        return this.f47876a;
    }

    public final InterfaceC7929a b() {
        return this.f47877b;
    }

    public final s9.d c() {
        return this.f47879d;
    }

    public final s9.d d() {
        return this.f47878c;
    }

    public final s9.d e() {
        return this.f47880e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5900a)) {
            return false;
        }
        C5900a c5900a = (C5900a) obj;
        return AbstractC6492s.d(this.f47876a, c5900a.f47876a) && AbstractC6492s.d(this.f47877b, c5900a.f47877b) && AbstractC6492s.d(this.f47878c, c5900a.f47878c) && AbstractC6492s.d(this.f47879d, c5900a.f47879d) && AbstractC6492s.d(this.f47880e, c5900a.f47880e);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f47876a.hashCode() * 31) + this.f47877b.hashCode()) * 31) + this.f47878c.hashCode()) * 31) + this.f47879d.hashCode()) * 31;
        s9.d dVar = this.f47880e;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        return "Device(id=" + this.f47876a + ", image=" + this.f47877b + ", name=" + this.f47878c + ", info=" + this.f47879d + ", wifiExperience=" + this.f47880e + ")";
    }
}
