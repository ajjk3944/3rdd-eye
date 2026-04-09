package o5;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC7088i f55479a;

    /* renamed from: b, reason: collision with root package name */
    private final C7078C f55480b;

    /* renamed from: c, reason: collision with root package name */
    private final C7081b f55481c;

    public z(EnumC7088i eventType, C7078C sessionData, C7081b applicationInfo) {
        AbstractC6492s.i(eventType, "eventType");
        AbstractC6492s.i(sessionData, "sessionData");
        AbstractC6492s.i(applicationInfo, "applicationInfo");
        this.f55479a = eventType;
        this.f55480b = sessionData;
        this.f55481c = applicationInfo;
    }

    public final C7081b a() {
        return this.f55481c;
    }

    public final EnumC7088i b() {
        return this.f55479a;
    }

    public final C7078C c() {
        return this.f55480b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f55479a == zVar.f55479a && AbstractC6492s.d(this.f55480b, zVar.f55480b) && AbstractC6492s.d(this.f55481c, zVar.f55481c);
    }

    public int hashCode() {
        return (((this.f55479a.hashCode() * 31) + this.f55480b.hashCode()) * 31) + this.f55481c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f55479a + ", sessionData=" + this.f55480b + ", applicationInfo=" + this.f55481c + ')';
    }
}
