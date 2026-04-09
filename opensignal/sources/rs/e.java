package rs;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes.dex */
public abstract class e implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public static final w f21745a = new w(new byte[0]);

    public static e a(Iterator it, int i10) {
        if (i10 == 1) {
            return (e) it.next();
        }
        int i11 = i10 >>> 1;
        return a(it, i11).b(a(it, i10 - i11));
    }

    public static d k() {
        return new d();
    }

    public final e b(e eVar) {
        int size = size();
        int size2 = eVar.size();
        if (size + size2 >= 2147483647L) {
            StringBuilder sb2 = new StringBuilder(53);
            sb2.append("ByteString would be too long: ");
            sb2.append(size);
            sb2.append("+");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int[] iArr = a0.D;
        a0 a0Var = this instanceof a0 ? (a0) this : null;
        if (eVar.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return eVar;
        }
        int size3 = eVar.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = eVar.size();
            byte[] bArr = new byte[size4 + size5];
            c(0, 0, size4, bArr);
            eVar.c(0, size4, size5, bArr);
            return new w(bArr);
        }
        if (a0Var != null) {
            e eVar2 = a0Var.f21730r;
            if (eVar.size() + eVar2.size() < 128) {
                int size6 = eVar2.size();
                int size7 = eVar.size();
                byte[] bArr2 = new byte[size6 + size7];
                eVar2.c(0, 0, size6, bArr2);
                eVar.c(0, size6, size7, bArr2);
                return new a0(a0Var.f21729g, new w(bArr2));
            }
        }
        if (a0Var != null) {
            e eVar3 = a0Var.f21730r;
            e eVar4 = a0Var.f21729g;
            if (eVar4.e() > eVar3.e() && a0Var.f21732y > eVar.e()) {
                return new a0(eVar4, new a0(eVar3, eVar));
            }
        }
        if (size3 >= a0.D[Math.max(e(), eVar.e()) + 1]) {
            return new a0(this, eVar);
        }
        o2.g gVar = new o2.g(15);
        gVar.Y(this);
        gVar.Y(eVar);
        Stack stack = (Stack) gVar.f18754d;
        e a0Var2 = (e) stack.pop();
        while (!stack.isEmpty()) {
            a0Var2 = new a0((e) stack.pop(), a0Var2);
        }
        return a0Var2;
    }

    public final void c(int i10, int i11, int i12, byte[] bArr) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(w.g.e("Source offset < 0: ", 30, i10));
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(w.g.e("Target offset < 0: ", 30, i11));
        }
        if (i12 < 0) {
            throw new IndexOutOfBoundsException(w.g.e("Length < 0: ", 23, i12));
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            throw new IndexOutOfBoundsException(w.g.e("Source end offset < 0: ", 34, i13));
        }
        int i14 = i11 + i12;
        if (i14 > bArr.length) {
            throw new IndexOutOfBoundsException(w.g.e("Target end offset < 0: ", 34, i14));
        }
        if (i12 > 0) {
            d(i10, i11, i12, bArr);
        }
    }

    public abstract void d(int i10, int i11, int i12, byte[] bArr);

    public abstract int e();

    public abstract boolean g();

    public abstract boolean j();

    public abstract int l(int i10, int i11, int i12);

    public abstract int m(int i10, int i11, int i12);

    public abstract int n();

    public abstract String o();

    public final String p() {
        try {
            return o();
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException("UTF-8 not supported?", e4);
        }
    }

    public abstract void r(OutputStream outputStream, int i10, int i11);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
