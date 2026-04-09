package c2;

import android.content.res.Resources;
import br.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f3132a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3133b;

    public b(Resources.Theme theme, int i10) {
        this.f3132a = theme;
        this.f3133b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f3132a, bVar.f3132a) && this.f3133b == bVar.f3133b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3133b) + (this.f3132a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f3132a);
        sb2.append(", id=");
        return c7.a.q(sb2, this.f3133b, ')');
    }
}
