package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multisets;
import com.google.common.collect.e0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.xbill.DNS.TTL;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class EnumMultiset<E extends Enum<E>> extends d implements Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    public transient Class f11735c;

    /* renamed from: d, reason: collision with root package name */
    public transient Enum[] f11736d;

    /* renamed from: e, reason: collision with root package name */
    public transient int[] f11737e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f11738f;

    /* renamed from: g, reason: collision with root package name */
    public transient long f11739g;

    public class a extends c {
        public a() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Enum a(int i10) {
            return EnumMultiset.this.f11736d[i10];
        }
    }

    public class b extends c {

        public class a extends Multisets.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f11742a;

            public a(int i10) {
                this.f11742a = i10;
            }

            @Override // com.google.common.collect.e0.a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public Enum d() {
                return EnumMultiset.this.f11736d[this.f11742a];
            }

            @Override // com.google.common.collect.e0.a
            public int getCount() {
                return EnumMultiset.this.f11737e[this.f11742a];
            }
        }

        public b() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e0.a a(int i10) {
            return new a(i10);
        }
    }

    public abstract class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f11744a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f11745b = -1;

        public c() {
        }

        public abstract Object a(int i10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.f11744a < EnumMultiset.this.f11736d.length) {
                int[] iArr = EnumMultiset.this.f11737e;
                int i10 = this.f11744a;
                if (iArr[i10] > 0) {
                    return true;
                }
                this.f11744a = i10 + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objA = a(this.f11744a);
            int i10 = this.f11744a;
            this.f11745b = i10;
            this.f11744a = i10 + 1;
            return objA;
        }

        @Override // java.util.Iterator
        public void remove() {
            j.d(this.f11745b >= 0);
            if (EnumMultiset.this.f11737e[this.f11745b] > 0) {
                EnumMultiset.v(EnumMultiset.this);
                EnumMultiset.w(EnumMultiset.this, r0.f11737e[this.f11745b]);
                EnumMultiset.this.f11737e[this.f11745b] = 0;
            }
            this.f11745b = -1;
        }
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Class cls = (Class) objectInputStream.readObject();
        this.f11735c = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f11736d = enumArr;
        this.f11737e = new int[enumArr.length];
        n0.f(this, objectInputStream);
    }

    public static /* synthetic */ int v(EnumMultiset enumMultiset) {
        int i10 = enumMultiset.f11738f;
        enumMultiset.f11738f = i10 - 1;
        return i10;
    }

    public static /* synthetic */ long w(EnumMultiset enumMultiset, long j10) {
        long j11 = enumMultiset.f11739g - j10;
        enumMultiset.f11739g = j11;
        return j11;
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f11735c);
        n0.k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.e0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int l(Enum r72, int i10) {
        y(r72);
        j.b(i10, "count");
        int iOrdinal = r72.ordinal();
        int[] iArr = this.f11737e;
        int i11 = iArr[iOrdinal];
        iArr[iOrdinal] = i10;
        this.f11739g += i10 - i11;
        if (i11 == 0 && i10 > 0) {
            this.f11738f++;
            return i11;
        }
        if (i11 > 0 && i10 == 0) {
            this.f11738f--;
        }
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.f11737e, 0);
        this.f11739g = 0L;
        this.f11738f = 0;
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.e0
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.d
    public int h() {
        return this.f11738f;
    }

    @Override // com.google.common.collect.d
    public Iterator i() {
        return new a();
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return Multisets.h(this);
    }

    @Override // com.google.common.collect.d
    public Iterator j() {
        return new b();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public /* bridge */ /* synthetic */ Set k() {
        return super.k();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public int m(Object obj, int i10) {
        if (obj == null || !z(obj)) {
            return 0;
        }
        Enum r12 = (Enum) obj;
        j.b(i10, "occurrences");
        if (i10 == 0) {
            return r(obj);
        }
        int iOrdinal = r12.ordinal();
        int[] iArr = this.f11737e;
        int i11 = iArr[iOrdinal];
        if (i11 == 0) {
            return 0;
        }
        if (i11 > i10) {
            iArr[iOrdinal] = i11 - i10;
            this.f11739g -= i10;
            return i11;
        }
        iArr[iOrdinal] = 0;
        this.f11738f--;
        this.f11739g -= i11;
        return i11;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public /* bridge */ /* synthetic */ boolean p(Object obj, int i10, int i11) {
        return super.p(obj, i10, i11);
    }

    @Override // com.google.common.collect.e0
    public int r(Object obj) {
        if (obj == null || !z(obj)) {
            return 0;
        }
        return this.f11737e[((Enum) obj).ordinal()];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.e0
    public int size() {
        return com.google.common.primitives.c.d(this.f11739g);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int n(Enum r82, int i10) {
        y(r82);
        j.b(i10, "occurrences");
        if (i10 == 0) {
            return r(r82);
        }
        int iOrdinal = r82.ordinal();
        int i11 = this.f11737e[iOrdinal];
        long j10 = i10;
        long j11 = i11 + j10;
        com.google.common.base.g.h(j11 <= TTL.MAX_VALUE, "too many occurrences: %s", j11);
        this.f11737e[iOrdinal] = (int) j11;
        if (i11 == 0) {
            this.f11738f++;
        }
        this.f11739g += j10;
        return i11;
    }

    public final void y(Object obj) {
        com.google.common.base.g.m(obj);
        if (z(obj)) {
            return;
        }
        String strValueOf = String.valueOf(this.f11735c);
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 21 + strValueOf2.length());
        sb.append("Expected an ");
        sb.append(strValueOf);
        sb.append(" but got ");
        sb.append(strValueOf2);
        throw new ClassCastException(sb.toString());
    }

    public final boolean z(Object obj) {
        if (obj instanceof Enum) {
            Enum r52 = (Enum) obj;
            int iOrdinal = r52.ordinal();
            Enum[] enumArr = this.f11736d;
            if (iOrdinal < enumArr.length && enumArr[iOrdinal] == r52) {
                return true;
            }
        }
        return false;
    }
}
