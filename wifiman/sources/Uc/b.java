package Uc;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f22330a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22331b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22332c;

    public b(String namespace, String name, int i10) {
        AbstractC6492s.i(namespace, "namespace");
        AbstractC6492s.i(name, "name");
        this.f22330a = namespace;
        this.f22331b = name;
        this.f22332c = i10;
    }

    public final String a() {
        return this.f22331b;
    }

    public final String b() {
        return this.f22330a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC6492s.d(this.f22330a, bVar.f22330a) && AbstractC6492s.d(this.f22331b, bVar.f22331b) && this.f22332c == bVar.f22332c;
    }

    public int hashCode() {
        return (((this.f22330a.hashCode() * 31) + this.f22331b.hashCode()) * 31) + Integer.hashCode(this.f22332c);
    }

    public String toString() {
        return "Type(namespace=" + this.f22330a + ", name=" + this.f22331b + ", version=" + this.f22332c + ")";
    }
}
