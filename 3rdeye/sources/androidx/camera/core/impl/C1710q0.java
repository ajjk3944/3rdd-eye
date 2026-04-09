package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.U;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: MutableOptionsBundle.java */
/* renamed from: androidx.camera.core.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1710q0 extends C1717u0 implements InterfaceC1708p0 {

    /* renamed from: J, reason: collision with root package name */
    public static final U.b f15114J = U.b.OPTIONAL;

    public static C1710q0 K() {
        return new C1710q0(new TreeMap(C1717u0.f15116H));
    }

    public static C1710q0 L(U u8) {
        TreeMap treeMap = new TreeMap(C1717u0.f15116H);
        for (U.a<?> aVar : u8.l()) {
            Set<U.b> setX = u8.x(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (U.b bVar : setX) {
                arrayMap.put(bVar, u8.j(aVar, bVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C1710q0(treeMap);
    }

    public final <ValueT> void M(U.a<ValueT> aVar, U.b bVar, ValueT valuet) {
        U.b bVar2;
        TreeMap<U.a<?>, Map<U.b, Object>> treeMap = this.f15118G;
        Map<U.b, Object> map = treeMap.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(aVar, arrayMap);
            arrayMap.put(bVar, valuet);
            return;
        }
        U.b bVar3 = (U.b) Collections.min(map.keySet());
        if (Objects.equals(map.get(bVar3), valuet) || bVar3 != (bVar2 = U.b.REQUIRED) || bVar != bVar2) {
            map.put(bVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.b() + ", existing value (" + bVar3 + ")=" + map.get(bVar3) + ", conflicting (" + bVar + ")=" + valuet);
    }

    public final <ValueT> void N(U.a<ValueT> aVar, ValueT valuet) {
        M(aVar, f15114J, valuet);
    }
}
