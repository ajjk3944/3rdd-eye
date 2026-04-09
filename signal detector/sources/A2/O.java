package A2;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class O extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f198a;

    public O(Q q3) {
        this.f198a = q3;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        Q q3 = this.f198a;
        synchronized (q3) {
            try {
                if (size() <= q3.f202a) {
                    return false;
                }
                q3.f207f.add(new Pair((String) entry.getKey(), ((P) entry.getValue()).f200b));
                return size() > q3.f202a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
