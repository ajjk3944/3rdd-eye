package defpackage;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mf4 extends LinkedHashMap {
    public final /* synthetic */ oh4 f;

    public mf4(oh4 oh4Var) {
        this.f = oh4Var;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        oh4 oh4Var = this.f;
        synchronized (oh4Var) {
            try {
                if (size() <= oh4Var.a) {
                    return false;
                }
                oh4Var.f.add(new Pair((String) entry.getKey(), ((fg4) entry.getValue()).b));
                return size() > oh4Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
