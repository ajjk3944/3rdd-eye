package l8;

import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.l;

/* compiled from: ConfigurationEntry.kt */
/* loaded from: classes3.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f43924a;

    /* renamed from: b, reason: collision with root package name */
    public final T f43925b;

    public d(String str, T t10) {
        this.f43924a = str;
        this.f43925b = t10;
        b.i.getClass();
        HashMap<String, String> map = b.f43908k;
        String lowerCase = String.valueOf(t10).toLowerCase(Locale.ROOT);
        l.e(lowerCase, "toLowerCase(...)");
        map.put(str, lowerCase);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.b(this.f43924a, dVar.f43924a) && l.b(this.f43925b, dVar.f43925b);
    }

    public final int hashCode() {
        int iHashCode = this.f43924a.hashCode() * 31;
        T t10 = this.f43925b;
        return iHashCode + (t10 == null ? 0 : t10.hashCode());
    }

    public final String toString() {
        return "ConfigurationEntry(key=" + this.f43924a + ", default=" + this.f43925b + ")";
    }
}
