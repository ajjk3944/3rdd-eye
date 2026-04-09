package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3971g implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC3971g f30858b = new i(AbstractC3987x.f30966c);

    /* renamed from: c, reason: collision with root package name */
    private static final f f30859c;

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator f30860d;

    /* renamed from: a, reason: collision with root package name */
    private int f30861a = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.g$a */
    class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private int f30862a = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f30863b;

        a() {
            this.f30863b = AbstractC3971g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g.InterfaceC1096g
        public byte b() {
            int i10 = this.f30862a;
            if (i10 >= this.f30863b) {
                throw new NoSuchElementException();
            }
            this.f30862a = i10 + 1;
            return AbstractC3971g.this.C(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30862a < this.f30863b;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$b */
    static class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3971g abstractC3971g, AbstractC3971g abstractC3971g2) {
            InterfaceC1096g interfaceC1096gJ = abstractC3971g.J();
            InterfaceC1096g interfaceC1096gJ2 = abstractC3971g2.J();
            while (interfaceC1096gJ.hasNext() && interfaceC1096gJ2.hasNext()) {
                int iCompare = Integer.compare(AbstractC3971g.q0(interfaceC1096gJ.b()), AbstractC3971g.q0(interfaceC1096gJ2.b()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(abstractC3971g.size(), abstractC3971g2.size());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$c */
    static abstract class c implements InterfaceC1096g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$d */
    private static final class d implements f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$e */
    private static final class e extends i {

        /* renamed from: f, reason: collision with root package name */
        private final int f30865f;

        /* renamed from: g, reason: collision with root package name */
        private final int f30866g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC3971g.o(i10, i10 + i11, bArr.length);
            this.f30865f = i10;
            this.f30866g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g.i, androidx.datastore.preferences.protobuf.AbstractC3971g
        byte C(int i10) {
            return this.f30867e[this.f30865f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g.i
        protected int Y0() {
            return this.f30865f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g.i, androidx.datastore.preferences.protobuf.AbstractC3971g
        public byte j(int i10) {
            AbstractC3971g.m(i10, size());
            return this.f30867e[this.f30865f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g.i, androidx.datastore.preferences.protobuf.AbstractC3971g
        public int size() {
            return this.f30866g;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC1096g extends Iterator {
        byte b();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$h */
    static abstract class h extends AbstractC3971g {
        h() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.J();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$i */
    private static class i extends h {

        /* renamed from: e, reason: collision with root package name */
        protected final byte[] f30867e;

        i(byte[] bArr) {
            bArr.getClass();
            this.f30867e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g
        byte C(int i10) {
            return this.f30867e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g
        public final boolean F() {
            int iY0 = Y0();
            return n0.n(this.f30867e, iY0, size() + iY0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g
        protected final String M0(Charset charset) {
            return new String(this.f30867e, Y0(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g
        protected final int S(int i10, int i11, int i12) {
            return AbstractC3987x.i(i10, this.f30867e, Y0() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g
        final void W0(AbstractC3970f abstractC3970f) {
            abstractC3970f.a(this.f30867e, Y0(), size());
        }

        final boolean X0(AbstractC3971g abstractC3971g, int i10, int i11) {
            if (i11 > abstractC3971g.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC3971g.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC3971g.size());
            }
            if (!(abstractC3971g instanceof i)) {
                return abstractC3971g.b0(i10, i12).equals(b0(0, i11));
            }
            i iVar = (i) abstractC3971g;
            byte[] bArr = this.f30867e;
            byte[] bArr2 = iVar.f30867e;
            int iY0 = Y0() + i11;
            int iY02 = Y0();
            int iY03 = iVar.Y0() + i10;
            while (iY02 < iY0) {
                if (bArr[iY02] != bArr2[iY03]) {
                    return false;
                }
                iY02++;
                iY03++;
            }
            return true;
        }

        protected int Y0() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g
        public final AbstractC3971g b0(int i10, int i11) {
            int iO = AbstractC3971g.o(i10, i11, size());
            return iO == 0 ? AbstractC3971g.f30858b : new e(this.f30867e, Y0() + i10, iO);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC3971g) || size() != ((AbstractC3971g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iT = T();
            int iT2 = iVar.T();
            if (iT == 0 || iT2 == 0 || iT == iT2) {
                return X0(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g
        public byte j(int i10) {
            return this.f30867e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g
        public int size() {
            return this.f30867e.length;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$j */
    private static final class j implements f {
        private j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3971g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f30859c = AbstractC3968d.c() ? new j(aVar) : new d(aVar);
        f30860d = new b();
    }

    AbstractC3971g() {
    }

    static AbstractC3971g U0(byte[] bArr) {
        return new i(bArr);
    }

    static AbstractC3971g V0(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void m(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int o(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q0(byte b10) {
        return b10 & 255;
    }

    public static AbstractC3971g s(byte[] bArr) {
        return v(bArr, 0, bArr.length);
    }

    public static AbstractC3971g v(byte[] bArr, int i10, int i11) {
        o(i10, i10 + i11, bArr.length);
        return new i(f30859c.a(bArr, i10, i11));
    }

    public static AbstractC3971g y(String str) {
        return new i(str.getBytes(AbstractC3987x.f30964a));
    }

    abstract byte C(int i10);

    public abstract boolean F();

    public InterfaceC1096g J() {
        return new a();
    }

    public final String K0(Charset charset) {
        return size() == 0 ? "" : M0(charset);
    }

    protected abstract String M0(Charset charset);

    public final String N0() {
        return K0(AbstractC3987x.f30964a);
    }

    protected abstract int S(int i10, int i11, int i12);

    protected final int T() {
        return this.f30861a;
    }

    abstract void W0(AbstractC3970f abstractC3970f);

    public abstract AbstractC3971g b0(int i10, int i11);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iS = this.f30861a;
        if (iS == 0) {
            int size = size();
            iS = S(size, 0, size);
            if (iS == 0) {
                iS = 1;
            }
            this.f30861a = iS;
        }
        return iS;
    }

    public abstract byte j(int i10);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
