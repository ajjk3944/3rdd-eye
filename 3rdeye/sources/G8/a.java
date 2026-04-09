package G8;

import B4.f;
import kotlin.jvm.internal.l;

/* compiled from: LogItem.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1938a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1939b;

    public a(String str, String str2) {
        this.f1938a = str;
        this.f1939b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.b(this.f1938a, aVar.f1938a) && l.b(this.f1939b, aVar.f1939b);
    }

    public final int hashCode() {
        return this.f1939b.hashCode() + (this.f1938a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogItem(name=");
        sb.append(this.f1938a);
        sb.append(", filePath=");
        return f.c(sb, this.f1939b, ")");
    }
}
