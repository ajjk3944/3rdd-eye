package q;

import java.util.HashMap;
import q.C5486b;

/* compiled from: FastSafeIterableMap.java */
/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5485a<K, V> extends C5486b<K, V> {

    /* renamed from: f, reason: collision with root package name */
    public final HashMap<K, C5486b.c<K, V>> f45302f = new HashMap<>();

    @Override // q.C5486b
    public final C5486b.c<K, V> b(K k10) {
        return this.f45302f.get(k10);
    }

    @Override // q.C5486b
    public final V c(K k10) {
        V v10 = (V) super.c(k10);
        this.f45302f.remove(k10);
        return v10;
    }
}
