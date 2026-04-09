package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public class ImmutableRangeMap<K extends Comparable<?>, V> implements l0, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final ImmutableRangeMap f11817c = new ImmutableRangeMap(ImmutableList.A(), ImmutableList.A());
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final transient ImmutableList f11818a;

    /* renamed from: b, reason: collision with root package name */
    public final transient ImmutableList f11819b;

    public static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableMap<Range<K>, V> mapOfRanges;

        public SerializedForm(ImmutableMap immutableMap) {
            this.mapOfRanges = immutableMap;
        }

        public Object d() {
            a aVar = new a();
            v0 it = this.mapOfRanges.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                aVar.b((Range) entry.getKey(), entry.getValue());
            }
            return aVar.a();
        }

        public Object readResolve() {
            return this.mapOfRanges.isEmpty() ? ImmutableRangeMap.h() : d();
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f11820a = b0.g();

        public ImmutableRangeMap a() {
            Collections.sort(this.f11820a, Range.k().g());
            ImmutableList.a aVar = new ImmutableList.a(this.f11820a.size());
            ImmutableList.a aVar2 = new ImmutableList.a(this.f11820a.size());
            for (int i10 = 0; i10 < this.f11820a.size(); i10++) {
                Range range = (Range) ((Map.Entry) this.f11820a.get(i10)).getKey();
                if (i10 > 0) {
                    Range range2 = (Range) ((Map.Entry) this.f11820a.get(i10 - 1)).getKey();
                    if (range.i(range2) && !range.h(range2).j()) {
                        String strValueOf = String.valueOf(range2);
                        String strValueOf2 = String.valueOf(range);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 47 + strValueOf2.length());
                        sb.append("Overlapping ranges: range ");
                        sb.append(strValueOf);
                        sb.append(" overlaps with entry ");
                        sb.append(strValueOf2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                aVar.f(range);
                aVar2.f(((Map.Entry) this.f11820a.get(i10)).getValue());
            }
            return new ImmutableRangeMap(aVar.g(), aVar2.g());
        }

        public a b(Range range, Object obj) {
            com.google.common.base.g.m(range);
            com.google.common.base.g.m(obj);
            com.google.common.base.g.i(!range.j(), "Range must not be empty, but was %s", range);
            this.f11820a.add(Maps.e(range, obj));
            return this;
        }
    }

    public ImmutableRangeMap(ImmutableList immutableList, ImmutableList immutableList2) {
        this.f11818a = immutableList;
        this.f11819b = immutableList2;
    }

    public static ImmutableRangeMap h() {
        return f11817c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l0) {
            return d().equals(((l0) obj).d());
        }
        return false;
    }

    @Override // com.google.common.collect.l0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ImmutableMap d() {
        return this.f11818a.isEmpty() ? ImmutableMap.o() : new ImmutableSortedMap(new RegularImmutableSortedSet(this.f11818a, Range.k()), this.f11819b);
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d().toString();
    }

    public Object writeReplace() {
        return new SerializedForm(d());
    }
}
