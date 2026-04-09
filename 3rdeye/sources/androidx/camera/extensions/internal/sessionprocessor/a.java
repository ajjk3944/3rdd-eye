package androidx.camera.extensions.internal.sessionprocessor;

import A2.l;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: CaptureResultImageMatcher.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15133a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LongSparseArray<List<TotalCaptureResult>> f15134b = new LongSparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15135c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LongSparseArray<List<b>> f15136d = new LongSparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0231a f15137e;

    /* compiled from: CaptureResultImageMatcher.java */
    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.a$a, reason: collision with other inner class name */
    public interface InterfaceC0231a {
        void a(b bVar, TotalCaptureResult totalCaptureResult, int i);
    }

    public final void a(TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.f15133a) {
            try {
                Long l5 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                long jLongValue = l5 != null ? l5.longValue() : -1L;
                if (jLongValue == -1) {
                    return;
                }
                LongSparseArray<List<TotalCaptureResult>> longSparseArray = this.f15134b;
                List<TotalCaptureResult> arrayList = longSparseArray.get(jLongValue);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    longSparseArray.put(jLongValue, arrayList);
                }
                arrayList.add(totalCaptureResult);
                this.f15135c.put(totalCaptureResult, Integer.valueOf(i));
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f15133a) {
            try {
                this.f15134b.clear();
                for (int i = 0; i < this.f15136d.size(); i++) {
                    Iterator<b> it = this.f15136d.get(this.f15136d.keyAt(i)).iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                }
                this.f15136d.clear();
                this.f15135c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f15133a) {
            this.f15137e = null;
        }
    }

    public final void d(b bVar) {
        synchronized (this.f15133a) {
            Image image = bVar.get();
            LongSparseArray<List<b>> longSparseArray = this.f15136d;
            long timestamp = image.getTimestamp();
            List<b> arrayList = longSparseArray.get(timestamp);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                longSparseArray.put(timestamp, arrayList);
            }
            arrayList.add(bVar);
        }
        e();
    }

    public final void e() {
        b bVar;
        TotalCaptureResult totalCaptureResult;
        synchronized (this.f15133a) {
            try {
                int size = this.f15134b.size() - 1;
                while (true) {
                    bVar = null;
                    if (size < 0) {
                        totalCaptureResult = null;
                        break;
                    }
                    List<TotalCaptureResult> listValueAt = this.f15134b.valueAt(size);
                    if (!listValueAt.isEmpty()) {
                        totalCaptureResult = listValueAt.get(0);
                        Long l5 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                        long jLongValue = l5 != null ? l5.longValue() : -1L;
                        l.q(null, jLongValue == this.f15134b.keyAt(size));
                        List<b> list = this.f15136d.get(jLongValue);
                        if (list != null && !list.isEmpty()) {
                            bVar = list.get(0);
                            LongSparseArray<List<b>> longSparseArray = this.f15136d;
                            List<b> list2 = longSparseArray.get(jLongValue);
                            if (list2 != null) {
                                list2.remove(bVar);
                                if (list2.isEmpty()) {
                                    longSparseArray.remove(jLongValue);
                                }
                            }
                            listValueAt.remove(totalCaptureResult);
                            if (listValueAt.isEmpty()) {
                                this.f15134b.removeAt(size);
                            }
                        }
                    }
                    size--;
                }
                g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bVar == null || totalCaptureResult == null) {
            return;
        }
        f(bVar, totalCaptureResult);
    }

    public final void f(b bVar, TotalCaptureResult totalCaptureResult) {
        InterfaceC0231a interfaceC0231a;
        Integer num;
        synchronized (this.f15133a) {
            try {
                interfaceC0231a = this.f15137e;
                if (interfaceC0231a != null) {
                    num = (Integer) this.f15135c.get(totalCaptureResult);
                } else {
                    bVar.a();
                    interfaceC0231a = null;
                    num = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC0231a != null) {
            interfaceC0231a.a(bVar, totalCaptureResult, num.intValue());
        }
    }

    public final void g() {
        synchronized (this.f15133a) {
            try {
                if (this.f15136d.size() != 0 && this.f15134b.size() != 0) {
                    long jKeyAt = this.f15136d.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f15134b.keyAt(0);
                    l.l(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f15136d.size() - 1; size >= 0; size--) {
                            if (this.f15136d.keyAt(size) < jKeyAt2) {
                                Iterator<b> it = this.f15136d.valueAt(size).iterator();
                                while (it.hasNext()) {
                                    it.next().a();
                                }
                                this.f15136d.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f15134b.size() - 1; size2 >= 0; size2--) {
                            if (this.f15134b.keyAt(size2) < jKeyAt) {
                                this.f15134b.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void h(InterfaceC0231a interfaceC0231a) {
        synchronized (this.f15133a) {
            this.f15137e = interfaceC0231a;
        }
    }
}
