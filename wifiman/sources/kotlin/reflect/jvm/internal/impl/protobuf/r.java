package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import org.snmp4j.mp.MPv3;

/* loaded from: classes4.dex */
class r extends kotlin.reflect.jvm.internal.impl.protobuf.d {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f52005h;

    /* renamed from: b, reason: collision with root package name */
    private final int f52006b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f52007c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f52008d;

    /* renamed from: e, reason: collision with root package name */
    private final int f52009e;

    /* renamed from: f, reason: collision with root package name */
    private final int f52010f;

    /* renamed from: g, reason: collision with root package name */
    private int f52011g;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Stack f52012a;

        private b() {
            this.f52012a = new Stack();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public kotlin.reflect.jvm.internal.impl.protobuf.d b(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
            c(dVar);
            c(dVar2);
            kotlin.reflect.jvm.internal.impl.protobuf.d rVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) this.f52012a.pop();
            while (!this.f52012a.isEmpty()) {
                rVar = new r((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f52012a.pop(), rVar);
            }
            return rVar;
        }

        private void c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            if (dVar.q()) {
                e(dVar);
                return;
            }
            if (dVar instanceof r) {
                r rVar = (r) dVar;
                c(rVar.f52007c);
                c(rVar.f52008d);
            } else {
                String strValueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(r.f52005h, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            int iD = d(dVar.size());
            int i10 = r.f52005h[iD + 1];
            if (this.f52012a.isEmpty() || ((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f52012a.peek()).size() >= i10) {
                this.f52012a.push(dVar);
                return;
            }
            int i11 = r.f52005h[iD];
            kotlin.reflect.jvm.internal.impl.protobuf.d rVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) this.f52012a.pop();
            while (true) {
                if (this.f52012a.isEmpty() || ((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f52012a.peek()).size() >= i11) {
                    break;
                } else {
                    rVar = new r((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f52012a.pop(), rVar);
                }
            }
            r rVar2 = new r(rVar, dVar);
            while (!this.f52012a.isEmpty()) {
                if (((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f52012a.peek()).size() >= r.f52005h[d(rVar2.size()) + 1]) {
                    break;
                } else {
                    rVar2 = new r((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f52012a.pop(), rVar2);
                }
            }
            this.f52012a.push(rVar2);
        }
    }

    private static class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private final Stack f52013a;

        /* renamed from: b, reason: collision with root package name */
        private m f52014b;

        private m a(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            while (dVar instanceof r) {
                r rVar = (r) dVar;
                this.f52013a.push(rVar);
                dVar = rVar.f52007c;
            }
            return (m) dVar;
        }

        private m c() {
            while (!this.f52013a.isEmpty()) {
                m mVarA = a(((r) this.f52013a.pop()).f52008d);
                if (!mVarA.isEmpty()) {
                    return mVarA;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public m next() {
            m mVar = this.f52014b;
            if (mVar == null) {
                throw new NoSuchElementException();
            }
            this.f52014b = c();
            return mVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52014b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f52013a = new Stack();
            this.f52014b = a(dVar);
        }
    }

    private class d implements d.a {

        /* renamed from: a, reason: collision with root package name */
        private final c f52015a;

        /* renamed from: b, reason: collision with root package name */
        private d.a f52016b;

        /* renamed from: c, reason: collision with root package name */
        int f52017c;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte b() {
            if (!this.f52016b.hasNext()) {
                this.f52016b = this.f52015a.next().iterator();
            }
            this.f52017c--;
            return this.f52016b.b();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52017c > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(r.this);
            this.f52015a = cVar;
            this.f52016b = cVar.next().iterator();
            this.f52017c = r.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.valueOf(MPv3.MAX_MESSAGE_ID));
        f52005h = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f52005h;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.d I(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        r rVar = dVar instanceof r ? (r) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return J(dVar, dVar2);
            }
            if (rVar != null && rVar.f52008d.size() + dVar2.size() < 128) {
                dVar2 = new r(rVar.f52007c, J(rVar.f52008d, dVar2));
            } else {
                if (rVar == null || rVar.f52007c.o() <= rVar.f52008d.o() || rVar.o() <= dVar2.o()) {
                    return size >= f52005h[Math.max(dVar.o(), dVar2.o()) + 1] ? new r(dVar, dVar2) : new b().b(dVar, dVar2);
                }
                dVar2 = new r(rVar.f52007c, new r(rVar.f52008d, dVar2));
            }
        }
        return dVar2;
    }

    private static m J(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.k(bArr, 0, 0, size);
        dVar2.k(bArr, 0, size, size2);
        return new m(bArr);
    }

    private boolean L(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
        c cVar = new c(this);
        m mVar = (m) cVar.next();
        c cVar2 = new c(dVar);
        m mVar2 = (m) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = mVar.size() - i10;
            int size2 = mVar2.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? mVar.F(mVar2, i11, iMin) : mVar2.F(mVar, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f52006b;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                mVar = (m) cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                mVar2 = (m) cVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void D(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f52009e;
        if (i12 <= i13) {
            this.f52007c.D(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f52008d.D(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f52007c.D(outputStream, i10, i14);
            this.f52008d.D(outputStream, 0, i11 - i14);
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new d();
    }

    public boolean equals(Object obj) {
        int iX;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.d)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
        if (this.f52006b != dVar.size()) {
            return false;
        }
        if (this.f52006b == 0) {
            return true;
        }
        if (this.f52011g == 0 || (iX = dVar.x()) == 0 || this.f52011g == iX) {
            return L(dVar);
        }
        return false;
    }

    public int hashCode() {
        int iV = this.f52011g;
        if (iV == 0) {
            int i10 = this.f52006b;
            iV = v(i10, 0, i10);
            if (iV == 0) {
                iV = 1;
            }
            this.f52011g = iV;
        }
        return iV;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void m(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f52009e;
        if (i13 <= i14) {
            this.f52007c.m(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f52008d.m(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f52007c.m(bArr, i10, i11, i15);
            this.f52008d.m(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int o() {
        return this.f52010f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean q() {
        return this.f52006b >= f52005h[this.f52010f];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean s() {
        int iW = this.f52007c.w(0, 0, this.f52009e);
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f52008d;
        return dVar.w(iW, 0, dVar.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f52006b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int v(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f52009e;
        if (i13 <= i14) {
            return this.f52007c.v(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f52008d.v(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f52008d.v(this.f52007c.v(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int w(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f52009e;
        if (i13 <= i14) {
            return this.f52007c.w(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f52008d.w(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f52008d.w(this.f52007c.w(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int x() {
        return this.f52011g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String z(String str) {
        return new String(y(), str);
    }

    private r(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        this.f52011g = 0;
        this.f52007c = dVar;
        this.f52008d = dVar2;
        int size = dVar.size();
        this.f52009e = size;
        this.f52006b = size + dVar2.size();
        this.f52010f = Math.max(dVar.o(), dVar2.o()) + 1;
    }
}
