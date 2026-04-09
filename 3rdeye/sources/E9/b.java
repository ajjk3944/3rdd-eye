package E9;

import E9.d;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.Arrays;

/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes3.dex */
public abstract class b<S extends d<?>> {

    /* renamed from: b, reason: collision with root package name */
    public S[] f1485b;

    /* renamed from: c, reason: collision with root package name */
    public int f1486c;

    /* renamed from: d, reason: collision with root package name */
    public int f1487d;

    public final S c() {
        S s10;
        synchronized (this) {
            try {
                S[] sArr = this.f1485b;
                if (sArr == null) {
                    sArr = (S[]) e();
                    this.f1485b = sArr;
                } else if (this.f1486c >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    kotlin.jvm.internal.l.e(objArrCopyOf, "copyOf(...)");
                    this.f1485b = (S[]) ((d[]) objArrCopyOf);
                    sArr = (S[]) ((d[]) objArrCopyOf);
                }
                int i = this.f1487d;
                do {
                    s10 = sArr[i];
                    if (s10 == null) {
                        s10 = (S) d();
                        sArr[i] = s10;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                } while (!s10.a(this));
                this.f1487d = i;
                this.f1486c++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s10;
    }

    public abstract S d();

    public abstract d[] e();

    public final void f(S s10) {
        int i;
        InterfaceC4347e[] interfaceC4347eArrB;
        synchronized (this) {
            try {
                int i10 = this.f1486c - 1;
                this.f1486c = i10;
                if (i10 == 0) {
                    this.f1487d = 0;
                }
                kotlin.jvm.internal.l.d(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC4347eArrB = s10.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC4347e interfaceC4347e : interfaceC4347eArrB) {
            if (interfaceC4347e != null) {
                interfaceC4347e.resumeWith(C1992A.f18074a);
            }
        }
    }
}
