package di;

import Bh.G;
import kotlin.jvm.internal.AbstractC6492s;
import pi.S;

/* renamed from: di.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5398g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f46095a;

    public AbstractC5398g(Object obj) {
        this.f46095a = obj;
    }

    public abstract S a(G g10);

    public Object b() {
        return this.f46095a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            Object objB = b();
            AbstractC5398g abstractC5398g = obj instanceof AbstractC5398g ? (AbstractC5398g) obj : null;
            if (!AbstractC6492s.d(objB, abstractC5398g != null ? abstractC5398g.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
