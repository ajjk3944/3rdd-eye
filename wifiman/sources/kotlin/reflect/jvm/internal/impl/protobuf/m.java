package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* loaded from: classes4.dex */
class m extends d {

    /* renamed from: b, reason: collision with root package name */
    protected final byte[] f52000b;

    /* renamed from: c, reason: collision with root package name */
    private int f52001c = 0;

    private class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        private int f52002a;

        /* renamed from: b, reason: collision with root package name */
        private final int f52003b;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte b() {
            try {
                byte[] bArr = m.this.f52000b;
                int i10 = this.f52002a;
                this.f52002a = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52002a < this.f52003b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f52002a = 0;
            this.f52003b = m.this.size();
        }
    }

    m(byte[] bArr) {
        this.f52000b = bArr;
    }

    static int H(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void D(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f52000b, G() + i10, i11);
    }

    boolean F(m mVar, int i10, int i11) {
        if (i11 > mVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 + i11 > mVar.size()) {
            int size2 = mVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f52000b;
        byte[] bArr2 = mVar.f52000b;
        int iG = G() + i11;
        int iG2 = G();
        int iG3 = mVar.G() + i10;
        while (iG2 < iG) {
            if (bArr[iG2] != bArr2[iG3]) {
                return false;
            }
            iG2++;
            iG3++;
        }
        return true;
    }

    protected int G() {
        return 0;
    }

    @Override // java.lang.Iterable
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof m) {
            return F((m) obj, 0, size());
        }
        if (obj instanceof r) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(strValueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int iV = this.f52001c;
        if (iV == 0) {
            int size = size();
            iV = v(size, 0, size);
            if (iV == 0) {
                iV = 1;
            }
            this.f52001c = iV;
        }
        return iV;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void m(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f52000b, i10, bArr, i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int o() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean q() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean s() {
        int iG = G();
        return u.f(this.f52000b, iG, size() + iG);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f52000b.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int v(int i10, int i11, int i12) {
        return H(i10, this.f52000b, G() + i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int w(int i10, int i11, int i12) {
        int iG = G() + i11;
        return u.g(i10, this.f52000b, iG, i12 + iG);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int x() {
        return this.f52001c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String z(String str) {
        return new String(this.f52000b, G(), size(), str);
    }
}
