package androidx.datastore.preferences.protobuf;

import N7.H7;
import g0.C4356c;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ByteString.java */
/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1730h implements Iterable<Byte>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final e f15603c = new e(C1746y.f15708b);

    /* renamed from: d, reason: collision with root package name */
    public static final c f15604d;

    /* renamed from: b, reason: collision with root package name */
    public int f15605b = 0;

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$a */
    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            C1729g c1729g = (C1729g) this;
            int i = c1729g.f15596b;
            if (i >= c1729g.f15597c) {
                throw new NoSuchElementException();
            }
            c1729g.f15596b = i + 1;
            return Byte.valueOf(c1729g.f15598d.d(i));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    public static final class b implements c {
        @Override // androidx.datastore.preferences.protobuf.AbstractC1730h.c
        public final byte[] copyFrom(byte[] bArr, int i, int i10) {
            return Arrays.copyOfRange(bArr, i, i10 + i);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$c */
    public interface c {
        byte[] copyFrom(byte[] bArr, int i, int i10);
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$d */
    public static abstract class d extends AbstractC1730h {
        @Override // androidx.datastore.preferences.protobuf.AbstractC1730h, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new C1729g(this);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$e */
    public static class e extends d {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f15606e;

        public e(byte[] bArr) {
            bArr.getClass();
            this.f15606e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1730h
        public byte b(int i) {
            return this.f15606e[i];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1730h
        public byte d(int i) {
            return this.f15606e[i];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1730h
        public final boolean e() {
            int i = i();
            return p0.f15687a.c(this.f15606e, i, size() + i) == 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1730h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1730h) || size() != ((AbstractC1730h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof e)) {
                return obj.equals(this);
            }
            e eVar = (e) obj;
            int i = this.f15605b;
            int i10 = eVar.f15605b;
            if (i != 0 && i10 != 0 && i != i10) {
                return false;
            }
            int size = size();
            if (size > eVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size > eVar.size()) {
                StringBuilder sbJ = C4356c.j(size, "Ran off end of other: 0, ", ", ");
                sbJ.append(eVar.size());
                throw new IllegalArgumentException(sbJ.toString());
            }
            int i11 = i() + size;
            int i12 = i();
            int i13 = eVar.i();
            while (i12 < i11) {
                if (this.f15606e[i12] != eVar.f15606e[i13]) {
                    return false;
                }
                i12++;
                i13++;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1730h
        public final int f(int i, int i10) {
            int i11 = i();
            Charset charset = C1746y.f15707a;
            for (int i12 = i11; i12 < i11 + i10; i12++) {
                i = (i * 31) + this.f15606e[i12];
            }
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1730h
        public final String g(Charset charset) {
            return new String(this.f15606e, i(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1730h
        public final void h(AbstractC1733k abstractC1733k) throws IOException {
            abstractC1733k.a(this.f15606e, i(), size());
        }

        public int i() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1730h
        public int size() {
            return this.f15606e.length;
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$f */
    public static final class f implements c {
        @Override // androidx.datastore.preferences.protobuf.AbstractC1730h.c
        public final byte[] copyFrom(byte[] bArr, int i, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i, bArr2, 0, i10);
            return bArr2;
        }
    }

    static {
        f15604d = C1726d.a() ? new f() : new b();
    }

    public static e c(int i, int i10, byte[] bArr) {
        int i11 = i + i10;
        int length = bArr.length;
        if (((i11 - i) | i | i11 | (length - i11)) >= 0) {
            return new e(f15604d.copyFrom(bArr, i, i10));
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C4356c.i(i, "Beginning index: ", " < 0"));
        }
        if (i11 < i) {
            throw new IndexOutOfBoundsException(H7.n(i, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(H7.n(i11, length, "End index: ", " >= "));
    }

    public abstract byte b(int i);

    public abstract byte d(int i);

    public abstract boolean e();

    public abstract boolean equals(Object obj);

    public abstract int f(int i, int i10);

    public abstract String g(Charset charset);

    public abstract void h(AbstractC1733k abstractC1733k) throws IOException;

    public final int hashCode() {
        int iF = this.f15605b;
        if (iF == 0) {
            int size = size();
            iF = f(size, size);
            if (iF == 0) {
                iF = 1;
            }
            this.f15605b = iF;
        }
        return iF;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C1729g(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
