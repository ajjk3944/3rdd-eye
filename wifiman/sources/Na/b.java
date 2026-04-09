package Na;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f16329a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16330b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16331c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16332d;

    public b(UUID id2, String email, String username, String str) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(email, "email");
        AbstractC6492s.i(username, "username");
        this.f16329a = id2;
        this.f16330b = email;
        this.f16331c = username;
        this.f16332d = str;
    }

    public final String a() {
        return this.f16332d;
    }

    public final String b() {
        return this.f16330b;
    }

    public final UUID c() {
        return this.f16329a;
    }

    public final String d() {
        return this.f16331c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC6492s.d(this.f16329a, bVar.f16329a) && AbstractC6492s.d(this.f16330b, bVar.f16330b) && AbstractC6492s.d(this.f16331c, bVar.f16331c) && AbstractC6492s.d(this.f16332d, bVar.f16332d);
    }

    public int hashCode() {
        return this.f16329a.hashCode();
    }

    public String toString() {
        return "UIAccount[" + this.f16329a + "](username: " + this.f16331c + ", email: " + this.f16330b + ", avatar: " + this.f16332d + ")";
    }
}
