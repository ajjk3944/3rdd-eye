package A5;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f325a = new HashMap();

    protected abstract Object a(Object obj);

    public Object b(Object obj) {
        synchronized (this.f325a) {
            try {
                if (this.f325a.containsKey(obj)) {
                    return this.f325a.get(obj);
                }
                Object objA = a(obj);
                this.f325a.put(obj, objA);
                return objA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
