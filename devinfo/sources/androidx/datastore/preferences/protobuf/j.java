package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.ads.zb1;
import e4.c2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public int f995a;

    /* renamed from: b, reason: collision with root package name */
    public Object f996b;

    public j(int i4) {
        this.f995a = i4;
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i4);

    public void D() {
        int iZ;
        do {
            iZ = z();
            if (iZ == 0) {
                return;
            }
            int i4 = this.f995a;
            if (i4 >= 100) {
                throw new a0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f995a = i4 + 1;
            this.f995a--;
        } while (C(iZ));
    }

    public abstract int[] E(int i4, int[] iArr);

    public abstract int F();

    public ByteBuffer G(int i4, byte[] bArr) {
        int[] iArrE = E(i4, zb1.c(bArr));
        int[] iArr = (int[]) iArrE.clone();
        zb1.a(iArr);
        for (int i10 = 0; i10 < 16; i10++) {
            iArrE[i10] = iArrE[i10] + iArr[i10];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrE, 0, 16);
        return byteBufferOrder;
    }

    public abstract void a(int i4);

    public abstract int b();

    public abstract boolean c();

    public abstract c2 f(c2 c2Var, List list);

    public abstract yb.i g(e4.l1 l1Var, yb.i iVar);

    public abstract void h(int i4);

    public abstract int i(int i4);

    public abstract boolean k();

    public abstract g l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    public void d(e4.l1 l1Var) {
    }

    public void e(e4.l1 l1Var) {
    }
}
