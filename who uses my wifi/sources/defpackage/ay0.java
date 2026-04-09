package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ay0 extends m0 implements pf0, yu {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(ay0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int i;

    public ay0(Object obj) {
        this._state$volatile = obj;
    }

    public final Object E() {
        gs3 gs3Var = yc0.b;
        Object obj = j.get(this);
        if (obj == gs3Var) {
            return null;
        }
        return obj;
    }

    public final void F(Object obj) {
        int i;
        by0[] by0VarArr;
        gs3 gs3Var;
        if (obj == null) {
            obj = yc0.b;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            if (i30.c(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.i;
            if ((i2 & 1) != 0) {
                this.i = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.i = i3;
            by0[] by0VarArr2 = (by0[]) this.h;
            while (true) {
                if (by0VarArr2 != null) {
                    for (by0 by0Var : by0VarArr2) {
                        if (by0Var != null) {
                            AtomicReference atomicReference = by0Var.a;
                            while (true) {
                                Object obj2 = atomicReference.get();
                                if (obj2 != null && obj2 != (gs3Var = gi2.d)) {
                                    gs3 gs3Var2 = gi2.c;
                                    if (obj2 != gs3Var2) {
                                        while (!atomicReference.compareAndSet(obj2, gs3Var2)) {
                                            if (atomicReference.get() != obj2) {
                                                break;
                                            }
                                        }
                                        ((kd) obj2).e(z31.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj2, gs3Var)) {
                                        if (atomicReference.get() != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.i;
                    if (i == i3) {
                        this.i = i3 + 1;
                        return;
                    }
                    by0VarArr = (by0[]) this.h;
                }
                by0VarArr2 = by0VarArr;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x014c, code lost:
    
        if (r4 != r3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0149, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003b, B:50:0x00cb, B:52:0x00d3, B:55:0x00da, B:56:0x00e0, B:58:0x00e3, B:68:0x0104, B:71:0x0114, B:72:0x0130, B:78:0x0140, B:75:0x0137, B:77:0x013d, B:60:0x00e9, B:64:0x00f0, B:21:0x0056, B:24:0x0061, B:49:0x00bb), top: B:98:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003b, B:50:0x00cb, B:52:0x00d3, B:55:0x00da, B:56:0x00e0, B:58:0x00e3, B:68:0x0104, B:71:0x0114, B:72:0x0130, B:78:0x0140, B:75:0x0137, B:77:0x013d, B:60:0x00e9, B:64:0x00f0, B:21:0x0056, B:24:0x0061, B:49:0x00bb), top: B:98:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0114 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003b, B:50:0x00cb, B:52:0x00d3, B:55:0x00da, B:56:0x00e0, B:58:0x00e3, B:68:0x0104, B:71:0x0114, B:72:0x0130, B:78:0x0140, B:75:0x0137, B:77:0x013d, B:60:0x00e9, B:64:0x00f0, B:21:0x0056, B:24:0x0061, B:49:0x00bb), top: B:98:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0113 -> B:50:0x00cb). Please report as a decompilation issue!!! */
    @Override // defpackage.yu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.av r18, defpackage.oj r19) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay0.b(av, oj):java.lang.Object");
    }

    @Override // defpackage.av
    public final Object d(Object obj, qj qjVar) {
        F(obj);
        return z31.a;
    }
}
