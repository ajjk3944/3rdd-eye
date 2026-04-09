package s7;

/* renamed from: s7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7914a {
    public abstract boolean a(AbstractC7914a abstractC7914a);

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC7914a) {
            return a((AbstractC7914a) obj);
        }
        return false;
    }

    public int hashCode() {
        return getClass().hashCode();
    }
}
