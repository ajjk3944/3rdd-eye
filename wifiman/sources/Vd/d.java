package Vd;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f23376a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23377b;

    public d(String secret, String token) {
        AbstractC6492s.i(secret, "secret");
        AbstractC6492s.i(token, "token");
        this.f23376a = secret;
        this.f23377b = token;
    }

    public final String a() {
        return this.f23376a;
    }

    public final String b() {
        return this.f23377b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC6492s.d(this.f23376a, dVar.f23376a) && AbstractC6492s.d(this.f23377b, dVar.f23377b);
    }

    public int hashCode() {
        return (this.f23376a.hashCode() * 31) + this.f23377b.hashCode();
    }

    public String toString() {
        return "UnifiConsoleTeleportAuth(secret=" + this.f23376a + ", token=" + this.f23377b + ")";
    }
}
