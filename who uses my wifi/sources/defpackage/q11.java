package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class q11 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(q11.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public ct[] a;

    public final void a(ct ctVar) {
        ctVar.d((dt) this);
        ct[] ctVarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (ctVarArr == null) {
            ctVarArr = new ct[4];
            this.a = ctVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= ctVarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(ctVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            i30.l(objArrCopyOf, "copyOf(...)");
            ctVarArr = (ct[]) objArrCopyOf;
            this.a = ctVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        ctVarArr[i] = ctVar;
        ctVar.g = i;
        c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ct b(int r9) {
        /*
            r8 = this;
            ct[] r0 = r8.a
            defpackage.i30.j(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.q11.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            defpackage.i30.j(r4)
            r5 = r0[r2]
            defpackage.i30.j(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            ct[] r5 = r8.a
            defpackage.i30.j(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            defpackage.i30.j(r6)
            r7 = r5[r4]
            defpackage.i30.j(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            defpackage.i30.j(r4)
            r5 = r5[r2]
            defpackage.i30.j(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            defpackage.i30.j(r9)
            r2 = 0
            r9.d(r2)
            r9.g = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q11.b(int):ct");
    }

    public final void c(int i) {
        while (i > 0) {
            ct[] ctVarArr = this.a;
            i30.j(ctVarArr);
            int i2 = (i - 1) / 2;
            ct ctVar = ctVarArr[i2];
            i30.j(ctVar);
            ct ctVar2 = ctVarArr[i];
            i30.j(ctVar2);
            if (ctVar.compareTo(ctVar2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        ct[] ctVarArr = this.a;
        i30.j(ctVarArr);
        ct ctVar = ctVarArr[i2];
        i30.j(ctVar);
        ct ctVar2 = ctVarArr[i];
        i30.j(ctVar2);
        ctVarArr[i] = ctVar;
        ctVarArr[i2] = ctVar2;
        ctVar.g = i;
        ctVar2.g = i2;
    }
}
