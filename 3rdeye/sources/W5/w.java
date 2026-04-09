package w5;

/* compiled from: SessionEvent.kt */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC5736k f47474a;

    /* renamed from: b, reason: collision with root package name */
    public final C5724D f47475b;

    /* renamed from: c, reason: collision with root package name */
    public final C5727b f47476c;

    public w(EnumC5736k eventType, C5724D c5724d, C5727b c5727b) {
        kotlin.jvm.internal.l.f(eventType, "eventType");
        this.f47474a = eventType;
        this.f47475b = c5724d;
        this.f47476c = c5727b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f47474a == wVar.f47474a && kotlin.jvm.internal.l.b(this.f47475b, wVar.f47475b) && kotlin.jvm.internal.l.b(this.f47476c, wVar.f47476c);
    }

    public final int hashCode() {
        return this.f47476c.hashCode() + ((this.f47475b.hashCode() + (this.f47474a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + this.f47474a + ", sessionData=" + this.f47475b + ", applicationInfo=" + this.f47476c + ')';
    }
}
