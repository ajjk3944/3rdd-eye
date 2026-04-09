package v9;

import kotlin.jvm.internal.l;

/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes3.dex */
public final class c extends C5685a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        char c10 = this.f47088b;
        char c11 = this.f47089c;
        if (l.h(c10, c11) > 0) {
            c cVar = (c) obj;
            if (l.h(cVar.f47088b, cVar.f47089c) > 0) {
                return true;
            }
        }
        c cVar2 = (c) obj;
        return c10 == cVar2.f47088b && c11 == cVar2.f47089c;
    }

    public final int hashCode() {
        char c10 = this.f47088b;
        char c11 = this.f47089c;
        if (l.h(c10, c11) > 0) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.f47088b + ".." + this.f47089c;
    }
}
