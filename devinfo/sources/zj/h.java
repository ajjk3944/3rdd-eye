package zj;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h extends AbstractMap implements Map, ok.d {
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new z0.f(0, (z0.d) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new z0.f(1, (z0.d) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ((z0.d) this).f37813f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new ak.i(1, (z0.d) this);
    }
}
