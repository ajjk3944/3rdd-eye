package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class m extends c5 {
    public static j2 L0(v3 v3Var, Spliterator spliterator) {
        j$.time.format.a aVar = new j$.time.format.a(12);
        j$.time.format.a aVar2 = new j$.time.format.a(13);
        j$.time.format.a aVar3 = new j$.time.format.a(14);
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(aVar2);
        Objects.requireNonNull(aVar3);
        return new j2((Collection) new a4(b7.REFERENCE, aVar3, aVar2, aVar, 3).j(v3Var, spliterator));
    }

    @Override // j$.util.stream.a
    public final e2 E0(v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        a aVar = (a) v3Var;
        if (a7.DISTINCT.l(aVar.f26462m)) {
            return v3Var.h0(spliterator, false, intFunction);
        }
        if (a7.ORDERED.l(aVar.f26462m)) {
            return L0(v3Var, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.util.concurrent.t tVar = new j$.util.concurrent.t(4, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(tVar);
        new o0(tVar, false).a(v3Var, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new j2(collectionKeySet);
    }

    @Override // j$.util.stream.a
    public final Spliterator F0(a aVar, Spliterator spliterator) {
        if (a7.DISTINCT.l(aVar.f26462m)) {
            return aVar.y0(spliterator);
        }
        if (a7.ORDERED.l(aVar.f26462m)) {
            return L0(aVar, spliterator).spliterator();
        }
        return new j7(aVar.y0(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.a
    public final m5 H0(int i4, m5 m5Var) {
        Objects.requireNonNull(m5Var);
        if (a7.DISTINCT.l(i4)) {
            return m5Var;
        }
        if (a7.SORTED.l(i4)) {
            return new k(m5Var);
        }
        return new l(m5Var);
    }
}
