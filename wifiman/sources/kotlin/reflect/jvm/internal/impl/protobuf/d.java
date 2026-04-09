package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes4.dex */
public abstract class d implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public static final d f51945a = new m(new byte[0]);

    public interface a extends Iterator {
        byte b();
    }

    d() {
    }

    private static d b(Iterator it, int i10) {
        if (i10 == 1) {
            return (d) it.next();
        }
        int i11 = i10 >>> 1;
        return b(it, i11).e(b(it, i10 - i11));
    }

    public static d f(Iterable iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add((d) it.next());
            }
        }
        return arrayList.isEmpty() ? f51945a : b(arrayList.iterator(), arrayList.size());
    }

    public static d g(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static d i(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new m(bArr2);
    }

    public static d j(String str) {
        try {
            return new m(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public static b u() {
        return new b(128);
    }

    public String A() {
        try {
            return z("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    void C(OutputStream outputStream, int i10, int i11) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= size()) {
            if (i11 > 0) {
                D(outputStream, i10, i11);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    abstract void D(OutputStream outputStream, int i10, int i11);

    public d e(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (size + size2 < 2147483647L) {
            return r.I(this, dVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append(MqttTopic.SINGLE_LEVEL_WILDCARD);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void k(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i12 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i13);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                m(bArr, i10, i11, i12);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i14);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    protected abstract void m(byte[] bArr, int i10, int i11, int i12);

    protected abstract int o();

    protected abstract boolean q();

    public abstract boolean s();

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected abstract int v(int i10, int i11, int i12);

    protected abstract int w(int i10, int i11, int i12);

    protected abstract int x();

    public byte[] y() {
        int size = size();
        if (size == 0) {
            return i.f51995a;
        }
        byte[] bArr = new byte[size];
        m(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String z(String str);

    public static final class b extends OutputStream {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f51946f = new byte[0];

        /* renamed from: a, reason: collision with root package name */
        private final int f51947a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f51948b;

        /* renamed from: c, reason: collision with root package name */
        private int f51949c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f51950d;

        /* renamed from: e, reason: collision with root package name */
        private int f51951e;

        b(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f51947a = i10;
            this.f51948b = new ArrayList();
            this.f51950d = new byte[i10];
        }

        private byte[] a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void g(int i10) {
            this.f51948b.add(new m(this.f51950d));
            int length = this.f51949c + this.f51950d.length;
            this.f51949c = length;
            this.f51950d = new byte[Math.max(this.f51947a, Math.max(i10, length >>> 1))];
            this.f51951e = 0;
        }

        private void h() {
            int i10 = this.f51951e;
            byte[] bArr = this.f51950d;
            if (i10 >= bArr.length) {
                this.f51948b.add(new m(this.f51950d));
                this.f51950d = f51946f;
            } else if (i10 > 0) {
                this.f51948b.add(new m(a(bArr, i10)));
            }
            this.f51949c += this.f51951e;
            this.f51951e = 0;
        }

        public synchronized int j() {
            return this.f51949c + this.f51951e;
        }

        public synchronized d p() {
            h();
            return d.f(this.f51948b);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(j()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f51951e == this.f51950d.length) {
                    g(1);
                }
                byte[] bArr = this.f51950d;
                int i11 = this.f51951e;
                this.f51951e = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f51950d;
                int length = bArr2.length;
                int i12 = this.f51951e;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f51951e += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    g(i13);
                    System.arraycopy(bArr, i10 + length2, this.f51950d, 0, i13);
                    this.f51951e = i13;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
