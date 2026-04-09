package E5;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import z5.H;
import z5.I;

/* loaded from: classes3.dex */
public class x {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1420b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public H[] f1421a;

    public final void a(H h6) {
        h6.c((I) this);
        H[] hArr = this.f1421a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1420b;
        if (hArr == null) {
            hArr = new H[4];
            this.f1421a = hArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= hArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(hArr, atomicIntegerFieldUpdater.get(this) * 2);
            q5.i.d(objArrCopyOf, "copyOf(...)");
            hArr = (H[]) objArrCopyOf;
            this.f1421a = hArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        hArr[i] = h6;
        h6.f24491b = i;
        e(i);
    }

    public final H b() {
        H h6;
        synchronized (this) {
            H[] hArr = this.f1421a;
            h6 = hArr != null ? hArr[0] : null;
        }
        return h6;
    }

    public final void c(H h6) {
        synchronized (this) {
            if (h6.a() != null) {
                d(h6.f24491b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final z5.H d(int r9) {
        /*
            r8 = this;
            z5.H[] r0 = r8.f1421a
            q5.i.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = E5.x.f1420b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.f(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            q5.i.b(r4)
            r5 = r0[r2]
            q5.i.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.f(r9, r2)
            r8.e(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            z5.H[] r5 = r8.f1421a
            q5.i.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            q5.i.b(r6)
            r7 = r5[r4]
            q5.i.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            q5.i.b(r4)
            r5 = r5[r2]
            q5.i.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.f(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            q5.i.b(r9)
            r2 = 0
            r9.c(r2)
            r9.f24491b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.x.d(int):z5.H");
    }

    public final void e(int i) {
        while (i > 0) {
            H[] hArr = this.f1421a;
            q5.i.b(hArr);
            int i3 = (i - 1) / 2;
            H h6 = hArr[i3];
            q5.i.b(h6);
            H h7 = hArr[i];
            q5.i.b(h7);
            if (h6.compareTo(h7) <= 0) {
                return;
            }
            f(i, i3);
            i = i3;
        }
    }

    public final void f(int i, int i3) {
        H[] hArr = this.f1421a;
        q5.i.b(hArr);
        H h6 = hArr[i3];
        q5.i.b(h6);
        H h7 = hArr[i];
        q5.i.b(h7);
        hArr[i] = h6;
        hArr[i3] = h7;
        h6.f24491b = i;
        h7.f24491b = i3;
    }
}
