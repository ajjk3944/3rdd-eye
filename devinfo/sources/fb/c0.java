package fb;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f23883a;

    public c0(e0 e0Var) {
        this.f23883a = e0Var;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        e0 e0Var = this.f23883a;
        synchronized (e0Var) {
            try {
                if (size() <= e0Var.f23890a) {
                    return false;
                }
                e0Var.f23895f.add(new Pair((String) entry.getKey(), ((d0) entry.getValue()).f23887b));
                return size() > e0Var.f23890a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
