package J0;

import Yg.InterfaceC3665i;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f9586a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3665i f9587b;

    public a(String str, InterfaceC3665i interfaceC3665i) {
        this.f9586a = str;
        this.f9587b = interfaceC3665i;
    }

    public final InterfaceC3665i a() {
        return this.f9587b;
    }

    public final String b() {
        return this.f9586a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f9586a, aVar.f9586a) && AbstractC6492s.d(this.f9587b, aVar.f9587b);
    }

    public int hashCode() {
        String str = this.f9586a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC3665i interfaceC3665i = this.f9587b;
        return iHashCode + (interfaceC3665i != null ? interfaceC3665i.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f9586a + ", action=" + this.f9587b + ')';
    }
}
