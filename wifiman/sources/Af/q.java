package Af;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final s9.b f725a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f726b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f727c;

    public q(s9.b icon, s9.d key, s9.d value) {
        AbstractC6492s.i(icon, "icon");
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(value, "value");
        this.f725a = icon;
        this.f726b = key;
        this.f727c = value;
    }

    public final s9.b a() {
        return this.f725a;
    }

    public final s9.d b() {
        return this.f726b;
    }

    public final s9.d c() {
        return this.f727c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return AbstractC6492s.d(this.f725a, qVar.f725a) && AbstractC6492s.d(this.f726b, qVar.f726b) && AbstractC6492s.d(this.f727c, qVar.f727c);
    }

    public int hashCode() {
        return (((this.f725a.hashCode() * 31) + this.f726b.hashCode()) * 31) + this.f727c.hashCode();
    }

    public String toString() {
        return "Item(icon=" + this.f725a + ", key=" + this.f726b + ", value=" + this.f727c + ")";
    }
}
