package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5081h implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC5081h f38499b = new j(AbstractC5097y.f38600d);

    /* renamed from: c, reason: collision with root package name */
    private static final f f38500c;

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator f38501d;

    /* renamed from: a, reason: collision with root package name */
    private int f38502a = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$a */
    class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private int f38503a = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f38504b;

        a() {
            this.f38504b = AbstractC5081h.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h.g
        public byte b() {
            int i10 = this.f38503a;
            if (i10 >= this.f38504b) {
                throw new NoSuchElementException();
            }
            this.f38503a = i10 + 1;
            return AbstractC5081h.this.F(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38503a < this.f38504b;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$b */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC5081h abstractC5081h, AbstractC5081h abstractC5081h2) {
            g gVarS = abstractC5081h.S();
            g gVarS2 = abstractC5081h2.S();
            while (gVarS.hasNext() && gVarS2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC5081h.U0(gVarS.b())).compareTo(Integer.valueOf(AbstractC5081h.U0(gVarS2.b())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC5081h.size()).compareTo(Integer.valueOf(abstractC5081h2.size()));
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$c */
    static abstract class c implements g {
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

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$d */
    private static final class d implements f {
        private d() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$e */
    private static final class e extends j {

        /* renamed from: f, reason: collision with root package name */
        private final int f38506f;

        /* renamed from: g, reason: collision with root package name */
        private final int f38507g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC5081h.o(i10, i10 + i11, bArr.length);
            this.f38506f = i10;
            this.f38507g = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h.j, com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        protected void C(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f38510e, d1() + i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h.j, com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        byte F(int i10) {
            return this.f38510e[this.f38506f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h.j
        protected int d1() {
            return this.f38506f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h.j, com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        public byte j(int i10) {
            AbstractC5081h.m(i10, size());
            return this.f38510e[this.f38506f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h.j, com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        public int size() {
            return this.f38507g;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$g */
    public interface g extends Iterator {
        byte b();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$h, reason: collision with other inner class name */
    static final class C1217h {

        /* renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f38508a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f38509b;

        /* synthetic */ C1217h(int i10, a aVar) {
            this(i10);
        }

        public AbstractC5081h a() {
            this.f38508a.c();
            return new j(this.f38509b);
        }

        public CodedOutputStream b() {
            return this.f38508a;
        }

        private C1217h(int i10) {
            byte[] bArr = new byte[i10];
            this.f38509b = bArr;
            this.f38508a = CodedOutputStream.U(bArr);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$i */
    static abstract class i extends AbstractC5081h {
        i() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.S();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$j */
    private static class j extends i {

        /* renamed from: e, reason: collision with root package name */
        protected final byte[] f38510e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f38510e = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        protected void C(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f38510e, i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        byte F(int i10) {
            return this.f38510e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        public final boolean J() {
            int iD1 = d1();
            return m0.n(this.f38510e, iD1, size() + iD1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        public final AbstractC5081h M0(int i10, int i11) {
            int iO = AbstractC5081h.o(i10, i11, size());
            return iO == 0 ? AbstractC5081h.f38499b : new e(this.f38510e, d1() + i10, iO);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        protected final String W0(Charset charset) {
            return new String(this.f38510e, d1(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        public final AbstractC5082i b0() {
            return AbstractC5082i.j(this.f38510e, d1(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        final void b1(AbstractC5080g abstractC5080g) {
            abstractC5080g.a(this.f38510e, d1(), size());
        }

        final boolean c1(AbstractC5081h abstractC5081h, int i10, int i11) {
            if (i11 > abstractC5081h.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC5081h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC5081h.size());
            }
            if (!(abstractC5081h instanceof j)) {
                return abstractC5081h.M0(i10, i12).equals(M0(0, i11));
            }
            j jVar = (j) abstractC5081h;
            byte[] bArr = this.f38510e;
            byte[] bArr2 = jVar.f38510e;
            int iD1 = d1() + i11;
            int iD12 = d1();
            int iD13 = jVar.d1() + i10;
            while (iD12 < iD1) {
                if (bArr[iD12] != bArr2[iD13]) {
                    return false;
                }
                iD12++;
                iD13++;
            }
            return true;
        }

        protected int d1() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC5081h) || size() != ((AbstractC5081h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iK0 = K0();
            int iK02 = jVar.K0();
            if (iK0 == 0 || iK02 == 0 || iK0 == iK02) {
                return c1(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        public byte j(int i10) {
            return this.f38510e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        protected final int q0(int i10, int i11, int i12) {
            return AbstractC5097y.h(i10, this.f38510e, d1() + i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h
        public int size() {
            return this.f38510e.length;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$k */
    private static final class k implements f {
        private k() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5081h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f38500c = AbstractC5077d.c() ? new k(aVar) : new d(aVar);
        f38501d = new b();
    }

    AbstractC5081h() {
    }

    static C1217h T(int i10) {
        return new C1217h(i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int U0(byte b10) {
        return b10 & 255;
    }

    private String Y0() {
        if (size() <= 50) {
            return g0.a(this);
        }
        return g0.a(M0(0, 47)) + "...";
    }

    static AbstractC5081h Z0(byte[] bArr) {
        return new j(bArr);
    }

    static AbstractC5081h a1(byte[] bArr, int i10, int i11) {
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

    public static AbstractC5081h s(byte[] bArr) {
        return v(bArr, 0, bArr.length);
    }

    public static AbstractC5081h v(byte[] bArr, int i10, int i11) {
        o(i10, i10 + i11, bArr.length);
        return new j(f38500c.a(bArr, i10, i11));
    }

    public static AbstractC5081h y(String str) {
        return new j(str.getBytes(AbstractC5097y.f38598b));
    }

    protected abstract void C(byte[] bArr, int i10, int i11, int i12);

    abstract byte F(int i10);

    public abstract boolean J();

    protected final int K0() {
        return this.f38502a;
    }

    public abstract AbstractC5081h M0(int i10, int i11);

    public final byte[] N0() {
        int size = size();
        if (size == 0) {
            return AbstractC5097y.f38600d;
        }
        byte[] bArr = new byte[size];
        C(bArr, 0, 0, size);
        return bArr;
    }

    public g S() {
        return new a();
    }

    public final String V0(Charset charset) {
        return size() == 0 ? "" : W0(charset);
    }

    protected abstract String W0(Charset charset);

    public final String X0() {
        return V0(AbstractC5097y.f38598b);
    }

    public abstract AbstractC5082i b0();

    abstract void b1(AbstractC5080g abstractC5080g);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iQ0 = this.f38502a;
        if (iQ0 == 0) {
            int size = size();
            iQ0 = q0(size, 0, size);
            if (iQ0 == 0) {
                iQ0 = 1;
            }
            this.f38502a = iQ0;
        }
        return iQ0;
    }

    public abstract byte j(int i10);

    protected abstract int q0(int i10, int i11, int i12);

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), Y0());
    }
}
