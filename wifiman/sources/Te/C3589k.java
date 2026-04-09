package Te;

import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;

/* renamed from: Te.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3589k {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7929a f21865a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f21866b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f21867c;

    public C3589k(InterfaceC7929a img, s9.d title, s9.d message) {
        AbstractC6492s.i(img, "img");
        AbstractC6492s.i(title, "title");
        AbstractC6492s.i(message, "message");
        this.f21865a = img;
        this.f21866b = title;
        this.f21867c = message;
    }

    public final InterfaceC7929a a() {
        return this.f21865a;
    }

    public final s9.d b() {
        return this.f21867c;
    }

    public final s9.d c() {
        return this.f21866b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3589k)) {
            return false;
        }
        C3589k c3589k = (C3589k) obj;
        return AbstractC6492s.d(this.f21865a, c3589k.f21865a) && AbstractC6492s.d(this.f21866b, c3589k.f21866b) && AbstractC6492s.d(this.f21867c, c3589k.f21867c);
    }

    public int hashCode() {
        return (((this.f21865a.hashCode() * 31) + this.f21866b.hashCode()) * 31) + this.f21867c.hashCode();
    }

    public String toString() {
        return "Model(img=" + this.f21865a + ", title=" + this.f21866b + ", message=" + this.f21867c + ")";
    }
}
