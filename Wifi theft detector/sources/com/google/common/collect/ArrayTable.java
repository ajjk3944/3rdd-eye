package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import com.google.common.collect.Tables;
import com.google.common.collect.t0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Beta
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class ArrayTable<R, C, V> extends g implements Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;

    /* renamed from: b, reason: collision with root package name */
    public transient e f11665b;
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableList<C> columnList;
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableList<R> rowList;

    public class a extends com.google.common.collect.a {
        public a(int i10) {
            super(i10);
        }

        @Override // com.google.common.collect.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t0.a a(int i10) {
            return ArrayTable.this.q(i10);
        }
    }

    public class b extends Tables.b {

        /* renamed from: a, reason: collision with root package name */
        public final int f11667a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11668b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f11669c;

        public b(int i10) {
            this.f11669c = i10;
            this.f11667a = i10 / ArrayTable.this.columnList.size();
            this.f11668b = i10 % ArrayTable.this.columnList.size();
        }

        @Override // com.google.common.collect.t0.a
        public Object d() {
            return ArrayTable.this.rowList.get(this.f11667a);
        }

        @Override // com.google.common.collect.t0.a
        public Object g() {
            return ArrayTable.this.columnList.get(this.f11668b);
        }

        @Override // com.google.common.collect.t0.a
        public Object getValue() {
            return ArrayTable.this.p(this.f11667a, this.f11668b);
        }
    }

    public static abstract class c extends Maps.f {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMap f11671a;

        public class a extends com.google.common.collect.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f11672a;

            public a(int i10) {
                this.f11672a = i10;
            }

            @Override // com.google.common.collect.b, java.util.Map.Entry
            public Object getKey() {
                return c.this.d(this.f11672a);
            }

            @Override // com.google.common.collect.b, java.util.Map.Entry
            public Object getValue() {
                return c.this.f(this.f11672a);
            }

            @Override // com.google.common.collect.b, java.util.Map.Entry
            public Object setValue(Object obj) {
                return c.this.h(this.f11672a, obj);
            }
        }

        public class b extends com.google.common.collect.a {
            public b(int i10) {
                super(i10);
            }

            @Override // com.google.common.collect.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry a(int i10) {
                return c.this.c(i10);
            }
        }

        public /* synthetic */ c(ImmutableMap immutableMap, a aVar) {
            this(immutableMap);
        }

        @Override // com.google.common.collect.Maps.f
        public Iterator a() {
            return new b(size());
        }

        public Map.Entry c(int i10) {
            com.google.common.base.g.k(i10, size());
            return new a(i10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f11671a.containsKey(obj);
        }

        public Object d(int i10) {
            return this.f11671a.keySet().v().get(i10);
        }

        public abstract String e();

        public abstract Object f(int i10);

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            Integer num = (Integer) this.f11671a.get(obj);
            if (num == null) {
                return null;
            }
            return f(num.intValue());
        }

        public abstract Object h(int i10, Object obj);

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f11671a.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return this.f11671a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            Integer num = (Integer) this.f11671a.get(obj);
            if (num != null) {
                return h(num.intValue(), obj2);
            }
            String strE = e();
            String strValueOf = String.valueOf(obj);
            String strValueOf2 = String.valueOf(this.f11671a.keySet());
            StringBuilder sb = new StringBuilder(String.valueOf(strE).length() + 9 + strValueOf.length() + strValueOf2.length());
            sb.append(strE);
            sb.append(" ");
            sb.append(strValueOf);
            sb.append(" not in ");
            sb.append(strValueOf2);
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f11671a.size();
        }

        public c(ImmutableMap immutableMap) {
            this.f11671a = immutableMap;
        }
    }

    public class d extends c {

        /* renamed from: b, reason: collision with root package name */
        public final int f11675b;

        public d(int i10) {
            super(ArrayTable.this.columnKeyToIndex, null);
            this.f11675b = i10;
        }

        @Override // com.google.common.collect.ArrayTable.c
        public String e() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.c
        public Object f(int i10) {
            return ArrayTable.this.p(this.f11675b, i10);
        }

        @Override // com.google.common.collect.ArrayTable.c
        public Object h(int i10, Object obj) {
            return ArrayTable.this.r(this.f11675b, i10, obj);
        }
    }

    public class e extends c {
        public /* synthetic */ e(ArrayTable arrayTable, a aVar) {
            this();
        }

        @Override // com.google.common.collect.ArrayTable.c
        public String e() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map f(int i10) {
            return new d(i10);
        }

        @Override // com.google.common.collect.ArrayTable.c, java.util.AbstractMap, java.util.Map
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Map put(Object obj, Map map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.c
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map h(int i10, Map map) {
            throw new UnsupportedOperationException();
        }

        public e() {
            super(ArrayTable.this.rowKeyToIndex, null);
        }
    }

    @Override // com.google.common.collect.g, com.google.common.collect.t0
    public Set d() {
        return super.d();
    }

    @Override // com.google.common.collect.g
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.t0
    public Map g() {
        e eVar = this.f11665b;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this, null);
        this.f11665b = eVar2;
        return eVar2;
    }

    @Override // com.google.common.collect.g
    public Iterator h() {
        return new a(size());
    }

    @Override // com.google.common.collect.g
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.g
    public void i() {
        throw new UnsupportedOperationException();
    }

    public Object p(int i10, int i11) {
        com.google.common.base.g.k(i10, this.rowList.size());
        com.google.common.base.g.k(i11, this.columnList.size());
        return this.array[i10][i11];
    }

    public final t0.a q(int i10) {
        return new b(i10);
    }

    public Object r(int i10, int i11, Object obj) {
        com.google.common.base.g.k(i10, this.rowList.size());
        com.google.common.base.g.k(i11, this.columnList.size());
        Object[] objArr = this.array[i10];
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    @Override // com.google.common.collect.t0
    public int size() {
        return this.rowList.size() * this.columnList.size();
    }

    @Override // com.google.common.collect.g
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
