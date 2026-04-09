package androidx.camera.core.impl;

import B.j;
import android.util.ArrayMap;
import androidx.camera.core.impl.U;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: OptionsBundle.java */
/* renamed from: androidx.camera.core.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1717u0 implements U {

    /* renamed from: H, reason: collision with root package name */
    public static final B2.h f15116H;

    /* renamed from: I, reason: collision with root package name */
    public static final C1717u0 f15117I;

    /* renamed from: G, reason: collision with root package name */
    public final TreeMap<U.a<?>, Map<U.b, Object>> f15118G;

    static {
        B2.h hVar = new B2.h(2);
        f15116H = hVar;
        f15117I = new C1717u0(new TreeMap(hVar));
    }

    public C1717u0(TreeMap<U.a<?>, Map<U.b, Object>> treeMap) {
        this.f15118G = treeMap;
    }

    public static C1717u0 J(U u8) {
        if (C1717u0.class.equals(u8.getClass())) {
            return (C1717u0) u8;
        }
        TreeMap treeMap = new TreeMap(f15116H);
        for (U.a<?> aVar : u8.l()) {
            Set<U.b> setX = u8.x(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (U.b bVar : setX) {
                arrayMap.put(bVar, u8.j(aVar, bVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C1717u0(treeMap);
    }

    @Override // androidx.camera.core.impl.U
    public final <ValueT> ValueT b(U.a<ValueT> aVar) {
        Map<U.b, Object> map = this.f15118G.get(aVar);
        if (map != null) {
            return (ValueT) map.get((U.b) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // androidx.camera.core.impl.U
    public final boolean f(U.a<?> aVar) {
        return this.f15118G.containsKey(aVar);
    }

    @Override // androidx.camera.core.impl.U
    public final void g(B.i iVar) {
        for (Map.Entry<U.a<?>, Map<U.b, Object>> entry : this.f15118G.tailMap(U.a.a(Void.class, "camera2.captureRequest.option.")).entrySet()) {
            if (!entry.getKey().b().startsWith("camera2.captureRequest.option.")) {
                return;
            }
            U.a<?> key = entry.getKey();
            j.a aVar = (j.a) iVar.f327c;
            U u8 = (U) iVar.f328d;
            aVar.f330a.M(key, u8.w(key), u8.b(key));
        }
    }

    @Override // androidx.camera.core.impl.U
    public final <ValueT> ValueT j(U.a<ValueT> aVar, U.b bVar) {
        Map<U.b, Object> map = this.f15118G.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(bVar)) {
            return (ValueT) map.get(bVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + bVar);
    }

    @Override // androidx.camera.core.impl.U
    public final Set<U.a<?>> l() {
        return Collections.unmodifiableSet(this.f15118G.keySet());
    }

    @Override // androidx.camera.core.impl.U
    public final <ValueT> ValueT o(U.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) b(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // androidx.camera.core.impl.U
    public final U.b w(U.a<?> aVar) {
        Map<U.b, Object> map = this.f15118G.get(aVar);
        if (map != null) {
            return (U.b) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // androidx.camera.core.impl.U
    public final Set<U.b> x(U.a<?> aVar) {
        Map<U.b, Object> map = this.f15118G.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }
}
