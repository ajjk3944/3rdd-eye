package j$.util.stream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* loaded from: classes2.dex */
public final class h4 extends v3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f26597h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f26598i;
    public final /* synthetic */ Supplier j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f26599k;

    @Override // j$.util.stream.v3
    public final q4 v0() {
        return new i4(this.j, this.f26598i, this.f26597h);
    }

    @Override // j$.util.stream.v3, j$.util.stream.g8
    public final int w() {
        Set<Collector.Characteristics> setCharacteristics = this.f26599k.f26603a.characteristics();
        if (setCharacteristics != null && !setCharacteristics.isEmpty()) {
            HashSet hashSet = new HashSet();
            Collector.Characteristics next = setCharacteristics.iterator().next();
            if (next instanceof h) {
                Iterator<Collector.Characteristics> it = setCharacteristics.iterator();
                while (it.hasNext()) {
                    try {
                        h hVar = (h) it.next();
                        hashSet.add(hVar == null ? null : hVar == h.CONCURRENT ? Collector.Characteristics.CONCURRENT : hVar == h.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                    } catch (ClassCastException e2) {
                        j$.util.g.a(e2, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            } else {
                if (!(next instanceof Collector.Characteristics)) {
                    j$.util.g.a(next.getClass(), "java.util.stream.Collector.Characteristics");
                    throw null;
                }
                Iterator<Collector.Characteristics> it2 = setCharacteristics.iterator();
                while (it2.hasNext()) {
                    try {
                        Collector.Characteristics next2 = it2.next();
                        hashSet.add(next2 == null ? null : next2 == Collector.Characteristics.CONCURRENT ? h.CONCURRENT : next2 == Collector.Characteristics.UNORDERED ? h.UNORDERED : h.IDENTITY_FINISH);
                    } catch (ClassCastException e10) {
                        j$.util.g.a(e10, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            }
            setCharacteristics = hashSet;
        }
        if (setCharacteristics.contains(h.UNORDERED)) {
            return a7.f26490r;
        }
        return 0;
    }

    public h4(b7 b7Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, i iVar) {
        this.f26597h = binaryOperator;
        this.f26598i = biConsumer;
        this.j = supplier;
        this.f26599k = iVar;
    }
}
