package o5;

import java.util.Arrays;
import lf.t1;

/* loaded from: classes.dex */
public final class e1 implements r5.k {

    /* renamed from: a, reason: collision with root package name */
    public final b5.k f18926a;

    /* renamed from: d, reason: collision with root package name */
    public final b5.a0 f18927d;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f18928g;

    public e1(b5.h hVar, b5.k kVar) {
        q.f19025e.getAndIncrement();
        this.f18926a = kVar;
        this.f18927d = new b5.a0(hVar);
    }

    @Override // r5.k, pb.j0
    public final void c() {
        b5.a0 a0Var = this.f18927d;
        a0Var.f2420d = 0L;
        try {
            a0Var.t(this.f18926a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) a0Var.f2420d;
                byte[] bArr = this.f18928g;
                if (bArr == null) {
                    this.f18928g = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f18928g = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f18928g;
                i10 = a0Var.read(bArr2, i11, bArr2.length - i11);
            }
            t1.h(a0Var);
        } catch (Throwable th2) {
            t1.h(a0Var);
            throw th2;
        }
    }

    @Override // r5.k, pb.j0
    public final void d() {
    }
}
