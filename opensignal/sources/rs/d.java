package rs;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends OutputStream {

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f21739y = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public int f21742g;

    /* renamed from: x, reason: collision with root package name */
    public int f21744x;

    /* renamed from: a, reason: collision with root package name */
    public final int f21740a = 128;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f21741d = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public byte[] f21743r = new byte[128];

    public final void b(int i10) {
        this.f21741d.add(new w(this.f21743r));
        int length = this.f21742g + this.f21743r.length;
        this.f21742g = length;
        this.f21743r = new byte[Math.max(this.f21740a, Math.max(i10, length >>> 1))];
        this.f21744x = 0;
    }

    public final void f() {
        int i10 = this.f21744x;
        byte[] bArr = this.f21743r;
        int length = bArr.length;
        ArrayList arrayList = this.f21741d;
        if (i10 >= length) {
            arrayList.add(new w(this.f21743r));
            this.f21743r = f21739y;
        } else if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            arrayList.add(new w(bArr2));
        }
        this.f21742g += this.f21744x;
        this.f21744x = 0;
    }

    public final synchronized e h() {
        ArrayList arrayList;
        f();
        arrayList = this.f21741d;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((e) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? e.f21745a : e.a(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i10;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i10 = this.f21742g + this.f21744x;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i10));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        try {
            if (this.f21744x == this.f21743r.length) {
                b(1);
            }
            byte[] bArr = this.f21743r;
            int i11 = this.f21744x;
            this.f21744x = i11 + 1;
            bArr[i11] = (byte) i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        try {
            byte[] bArr2 = this.f21743r;
            int length = bArr2.length;
            int i12 = this.f21744x;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f21744x += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                b(i13);
                System.arraycopy(bArr, i10 + length2, this.f21743r, 0, i13);
                this.f21744x = i13;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
