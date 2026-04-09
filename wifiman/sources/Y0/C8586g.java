package y0;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8586g {

    /* renamed from: a, reason: collision with root package name */
    private long f66285a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseLongArray f66286b = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f66287c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    private final List f66288d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private int f66289e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f66290f = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f66286b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f66286b;
                long j10 = this.f66285a;
                this.f66285a = 1 + j10;
                sparseLongArray.put(pointerId, j10);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f66286b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f66286b;
            long j11 = this.f66285a;
            this.f66285a = 1 + j11;
            sparseLongArray2.put(pointerId2, j11);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f66287c.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f66289e && source == this.f66290f) {
            return;
        }
        this.f66289e = toolType;
        this.f66290f = source;
        this.f66287c.clear();
        this.f66286b.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final y0.C8562B d(y0.InterfaceC8573M r32, android.view.MotionEvent r33, int r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.C8586g.d(y0.M, android.view.MotionEvent, int, boolean):y0.B");
    }

    private final long f(int i10) {
        long jValueAt;
        int iIndexOfKey = this.f66286b.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            jValueAt = this.f66286b.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.f66285a;
            this.f66285a = 1 + jValueAt;
            this.f66286b.put(i10, jValueAt);
        }
        return C8603x.b(jValueAt);
    }

    private final boolean g(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    private final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f66287c.get(pointerId, false)) {
                this.f66286b.delete(pointerId);
                this.f66287c.delete(pointerId);
            }
        }
        if (this.f66286b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f66286b.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f66286b.keyAt(size);
                if (!g(motionEvent, iKeyAt)) {
                    this.f66286b.removeAt(size);
                    this.f66287c.delete(iKeyAt);
                }
            }
        }
    }

    public final C8561A c(MotionEvent motionEvent, InterfaceC8573M interfaceC8573M) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f66286b.clear();
            this.f66287c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z10 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z11 = actionMasked == 8;
        if (z10) {
            this.f66287c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.f66288d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        while (i10 < pointerCount) {
            this.f66288d.add(d(interfaceC8573M, motionEvent, i10, (z10 || i10 == actionIndex || (z11 && motionEvent.getButtonState() == 0)) ? false : true));
            i10++;
        }
        h(motionEvent);
        return new C8561A(motionEvent.getEventTime(), this.f66288d, motionEvent);
    }

    public final void e(int i10) {
        this.f66287c.delete(i10);
        this.f66286b.delete(i10);
    }
}
