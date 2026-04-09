package J6;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
class d extends WeakReference {

    public interface a {
        d a(I6.a aVar);
    }

    d(I6.a aVar) {
        super(aVar);
    }

    boolean a(Object obj) {
        I6.a aVar = (I6.a) get();
        return (obj instanceof I6.a) && aVar != null && aVar.a() == ((I6.a) obj).a();
    }

    public boolean b() {
        return get() == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WeakReference)) {
            return false;
        }
        I6.a aVar = (I6.a) get();
        Object obj2 = ((WeakReference) obj).get();
        return aVar != null && (obj2 instanceof I6.a) && aVar.a().equals(((I6.a) obj2).a());
    }

    public int hashCode() {
        if (get() != 0) {
            return ((I6.a) get()).hashCode();
        }
        return 0;
    }
}
