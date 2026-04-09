package c2;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import com.google.android.gms.internal.ads.w4;
import com.google.android.gms.internal.ads.y1;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f2605a;

    /* renamed from: b, reason: collision with root package name */
    public int f2606b;

    /* renamed from: c, reason: collision with root package name */
    public long f2607c;

    /* renamed from: d, reason: collision with root package name */
    public final Cloneable f2608d;

    /* renamed from: e, reason: collision with root package name */
    public final Cloneable f2609e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2610f;
    public Object g;

    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Cloneable] */
    public f(int i4) {
        switch (i4) {
            case 1:
                this.f2608d = new byte[8];
                this.f2609e = new ArrayDeque();
                this.f2610f = new w4(0);
                break;
            default:
                this.f2608d = new SparseLongArray();
                this.f2609e = new SparseBooleanArray();
                this.f2610f = new ArrayList();
                this.g = new x.o((Object) null);
                this.f2605a = -1;
                this.f2606b = -1;
                break;
        }
    }

    public void a(MotionEvent motionEvent) {
        SparseLongArray sparseLongArray = (SparseLongArray) this.f2608d;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.f2607c;
                this.f2607c = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j8 = this.f2607c;
            this.f2607c = 1 + j8;
            sparseLongArray.put(pointerId2, j8);
            if (motionEvent.getToolType(actionIndex) == 3) {
                ((SparseBooleanArray) this.f2609e).put(pointerId2, true);
            }
        }
    }

    public void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f2605a && source == this.f2606b) {
            return;
        }
        this.f2605a = toolType;
        this.f2606b = source;
        ((SparseBooleanArray) this.f2609e).clear();
        ((SparseLongArray) this.f2608d).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yb.i c(android.view.MotionEvent r45, j2.r r46) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.f.c(android.view.MotionEvent, j2.r):yb.i");
    }

    public void d(MotionEvent motionEvent) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f2609e;
        SparseLongArray sparseLongArray = (SparseLongArray) this.f2608d;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i4) == iKeyAt) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
    }

    public long e(y1 y1Var, int i4) {
        y1Var.L1(0, i4, (byte[]) this.f2608d);
        long j = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            j = (j << 8) | (r0[i10] & 255);
        }
        return j;
    }
}
