package g4;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends o implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20241a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof n) && ((n) obj).f20241a.equals(this.f20241a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f20241a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f20241a.iterator();
    }
}
