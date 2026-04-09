package Of;

import gg.AbstractC5912b;
import gg.i;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f17819a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17820b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17821c;

    /* renamed from: Of.a$a, reason: collision with other inner class name */
    public interface InterfaceC0626a {
        i c();

        AbstractC5912b d(String str);
    }

    public a(String name, boolean z10, long j10) {
        AbstractC6492s.i(name, "name");
        this.f17819a = name;
        this.f17820b = z10;
        this.f17821c = j10;
    }

    public final String a() {
        return this.f17819a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f17819a, aVar.f17819a) && this.f17820b == aVar.f17820b && this.f17821c == aVar.f17821c;
    }

    public int hashCode() {
        return (((this.f17819a.hashCode() * 31) + Boolean.hashCode(this.f17820b)) * 31) + Long.hashCode(this.f17821c);
    }

    public String toString() {
        return "WmwSettings(name=" + this.f17819a + ", hwResetButtonEnabled=" + this.f17820b + ", autoSleepAfterMillis=" + this.f17821c + ")";
    }
}
