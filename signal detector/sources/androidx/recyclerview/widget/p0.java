package androidx.recyclerview.widget;

import android.view.View;
import com.google.android.gms.internal.ads.C1991v;
import com.google.android.gms.internal.ads.C2045w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5576a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5577b;

    /* renamed from: c, reason: collision with root package name */
    public int f5578c;

    /* renamed from: d, reason: collision with root package name */
    public int f5579d;

    /* renamed from: e, reason: collision with root package name */
    public int f5580e;

    /* renamed from: f, reason: collision with root package name */
    public int f5581f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5582g;

    public p0() {
        this.f5576a = 1;
        this.f5582g = new C1991v[5];
        this.f5577b = new ArrayList();
        this.f5578c = -1;
    }

    public void a(View view) {
        m0 m0Var = (m0) view.getLayoutParams();
        m0Var.f5523e = this;
        ArrayList arrayList = (ArrayList) this.f5577b;
        arrayList.add(view);
        this.f5579d = LinearLayoutManager.INVALID_OFFSET;
        if (arrayList.size() == 1) {
            this.f5578c = LinearLayoutManager.INVALID_OFFSET;
        }
        if (m0Var.f5377a.isRemoved() || m0Var.f5377a.isUpdated()) {
            this.f5580e = ((StaggeredGridLayoutManager) this.f5582g).f5383c.c(view) + this.f5580e;
        }
    }

    public void b() {
        n0 n0VarE;
        ArrayList arrayList = (ArrayList) this.f5577b;
        View view = (View) arrayList.get(arrayList.size() - 1);
        m0 m0Var = (m0) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f5582g;
        this.f5579d = staggeredGridLayoutManager.f5383c.b(view);
        if (m0Var.f5524f && (n0VarE = staggeredGridLayoutManager.f5392m.E(m0Var.f5377a.getLayoutPosition())) != null && n0VarE.f5555b == 1) {
            int i = this.f5579d;
            int i3 = this.f5581f;
            int[] iArr = n0VarE.f5556c;
            this.f5579d = (iArr == null ? 0 : iArr[i3]) + i;
        }
    }

    public void c() {
        n0 n0VarE;
        View view = (View) ((ArrayList) this.f5577b).get(0);
        m0 m0Var = (m0) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f5582g;
        this.f5578c = staggeredGridLayoutManager.f5383c.e(view);
        if (m0Var.f5524f && (n0VarE = staggeredGridLayoutManager.f5392m.E(m0Var.f5377a.getLayoutPosition())) != null && n0VarE.f5555b == -1) {
            int i = this.f5578c;
            int i3 = this.f5581f;
            int[] iArr = n0VarE.f5556c;
            this.f5578c = i - (iArr != null ? iArr[i3] : 0);
        }
    }

    public void d() {
        ((ArrayList) this.f5577b).clear();
        this.f5578c = LinearLayoutManager.INVALID_OFFSET;
        this.f5579d = LinearLayoutManager.INVALID_OFFSET;
        this.f5580e = 0;
    }

    public int e() {
        return ((StaggeredGridLayoutManager) this.f5582g).f5388h ? g(false, r0.size() - 1, -1, false, true) : g(false, 0, ((ArrayList) this.f5577b).size(), false, true);
    }

    public int f() {
        return ((StaggeredGridLayoutManager) this.f5582g).f5388h ? g(false, 0, ((ArrayList) this.f5577b).size(), false, true) : g(false, r0.size() - 1, -1, false, true);
    }

    public int g(boolean z6, int i, int i3, boolean z7, boolean z8) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f5582g;
        int iK = staggeredGridLayoutManager.f5383c.k();
        int iG = staggeredGridLayoutManager.f5383c.g();
        int i6 = i3 > i ? 1 : -1;
        while (i != i3) {
            View view = (View) ((ArrayList) this.f5577b).get(i);
            int iE = staggeredGridLayoutManager.f5383c.e(view);
            int iB = staggeredGridLayoutManager.f5383c.b(view);
            boolean z9 = false;
            boolean z10 = !z8 ? iE >= iG : iE > iG;
            if (!z8 ? iB > iK : iB >= iK) {
                z9 = true;
            }
            if (z10 && z9) {
                if (z6 && z7) {
                    if (iE >= iK && iB <= iG) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                } else {
                    if (z7) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                    if (iE < iK || iB > iG) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                }
            }
            i += i6;
        }
        return -1;
    }

    public Object h(Object obj) {
        q5.i.e(obj, "key");
        synchronized (((p1.e) this.f5582g)) {
            h2.d dVar = (h2.d) this.f5577b;
            dVar.getClass();
            Object obj2 = ((LinkedHashMap) dVar.f20472a).get(obj);
            if (obj2 != null) {
                this.f5580e++;
                return obj2;
            }
            this.f5581f++;
            return null;
        }
    }

    public int i(int i) {
        int i3 = this.f5579d;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (((ArrayList) this.f5577b).size() == 0) {
            return i;
        }
        b();
        return this.f5579d;
    }

    public View j(int i, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f5582g;
        ArrayList arrayList = (ArrayList) this.f5577b;
        View view = null;
        if (i3 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f5388h && staggeredGridLayoutManager.getPosition(view2) >= i) || ((!staggeredGridLayoutManager.f5388h && staggeredGridLayoutManager.getPosition(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            View view3 = (View) arrayList.get(i6);
            if ((staggeredGridLayoutManager.f5388h && staggeredGridLayoutManager.getPosition(view3) <= i) || ((!staggeredGridLayoutManager.f5388h && staggeredGridLayoutManager.getPosition(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i6++;
            view = view3;
        }
        return view;
    }

    public int k(int i) {
        int i3 = this.f5578c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (((ArrayList) this.f5577b).size() == 0) {
            return i;
        }
        c();
        return this.f5578c;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f5577b;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        m0 m0Var = (m0) view.getLayoutParams();
        m0Var.f5523e = null;
        if (m0Var.f5377a.isRemoved() || m0Var.f5377a.isUpdated()) {
            this.f5580e -= ((StaggeredGridLayoutManager) this.f5582g).f5383c.c(view);
        }
        if (size == 1) {
            this.f5578c = LinearLayoutManager.INVALID_OFFSET;
        }
        this.f5579d = LinearLayoutManager.INVALID_OFFSET;
    }

    public void m() {
        ArrayList arrayList = (ArrayList) this.f5577b;
        View view = (View) arrayList.remove(0);
        m0 m0Var = (m0) view.getLayoutParams();
        m0Var.f5523e = null;
        if (arrayList.size() == 0) {
            this.f5579d = LinearLayoutManager.INVALID_OFFSET;
        }
        if (m0Var.f5377a.isRemoved() || m0Var.f5377a.isUpdated()) {
            this.f5580e -= ((StaggeredGridLayoutManager) this.f5582g).f5383c.c(view);
        }
        this.f5578c = LinearLayoutManager.INVALID_OFFSET;
    }

    public void n(View view) {
        m0 m0Var = (m0) view.getLayoutParams();
        m0Var.f5523e = this;
        ArrayList arrayList = (ArrayList) this.f5577b;
        arrayList.add(0, view);
        this.f5578c = LinearLayoutManager.INVALID_OFFSET;
        if (arrayList.size() == 1) {
            this.f5579d = LinearLayoutManager.INVALID_OFFSET;
        }
        if (m0Var.f5377a.isRemoved() || m0Var.f5377a.isUpdated()) {
            this.f5580e = ((StaggeredGridLayoutManager) this.f5582g).f5383c.c(view) + this.f5580e;
        }
    }

    public Object o(Object obj, Object obj2) {
        Object objPut;
        q5.i.e(obj, "key");
        synchronized (((p1.e) this.f5582g)) {
            this.f5579d++;
            h2.d dVar = (h2.d) this.f5577b;
            dVar.getClass();
            objPut = ((LinkedHashMap) dVar.f20472a).put(obj, obj2);
            if (objPut != null) {
                this.f5579d--;
            }
        }
        p(this.f5578c);
        return objPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(int r6) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r5.f5582g
            p1.e r0 = (p1.e) r0
            monitor-enter(r0)
            int r1 = r5.f5579d     // Catch: java.lang.Throwable -> L1c
            if (r1 < 0) goto L97
            java.lang.Object r1 = r5.f5577b     // Catch: java.lang.Throwable -> L1c
            h2.d r1 = (h2.d) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f20472a     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1f
            int r1 = r5.f5579d     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L97
            goto L1f
        L1c:
            r6 = move-exception
            goto L9f
        L1f:
            int r1 = r5.f5579d     // Catch: java.lang.Throwable -> L1c
            if (r1 <= r6) goto L95
            java.lang.Object r1 = r5.f5577b     // Catch: java.lang.Throwable -> L1c
            h2.d r1 = (h2.d) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f20472a     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L32
            goto L95
        L32:
            java.lang.Object r1 = r5.f5577b     // Catch: java.lang.Throwable -> L1c
            h2.d r1 = (h2.d) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f20472a     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "map.entries"
            q5.i.d(r1, r2)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L1c
            r3 = 0
            if (r2 == 0) goto L57
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L51
            goto L66
        L51:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L1c
            goto L66
        L57:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L62
            goto L66
        L62:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L1c
        L66:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L6c
            monitor-exit(r0)
            return
        L6c:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r5.f5577b     // Catch: java.lang.Throwable -> L1c
            h2.d r3 = (h2.d) r3     // Catch: java.lang.Throwable -> L1c
            r3.getClass()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "key"
            q5.i.e(r1, r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r3.f20472a     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L1c
            r3.remove(r1)     // Catch: java.lang.Throwable -> L1c
            int r1 = r5.f5579d     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "value"
            q5.i.e(r2, r3)     // Catch: java.lang.Throwable -> L1c
            int r1 = r1 + (-1)
            r5.f5579d = r1     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            goto L0
        L95:
            monitor-exit(r0)
            return
        L97:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L9f:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.p0.p(int):void");
    }

    public void q(int i, float f2) {
        C1991v c1991v;
        C1991v[] c1991vArr = (C1991v[]) this.f5582g;
        ArrayList arrayList = (ArrayList) this.f5577b;
        if (this.f5578c != 1) {
            Collections.sort(arrayList, C2045w.f17380c);
            this.f5578c = 1;
        }
        int i3 = this.f5581f;
        if (i3 > 0) {
            int i6 = i3 - 1;
            this.f5581f = i6;
            c1991v = c1991vArr[i6];
        } else {
            c1991v = new C1991v();
        }
        int i7 = this.f5579d;
        this.f5579d = i7 + 1;
        c1991v.f17200a = i7;
        c1991v.f17201b = i;
        c1991v.f17202c = f2;
        arrayList.add(c1991v);
        this.f5580e += i;
        while (true) {
            int i8 = this.f5580e;
            if (i8 <= 2000) {
                return;
            }
            int i9 = i8 - 2000;
            C1991v c1991v2 = (C1991v) arrayList.get(0);
            int i10 = c1991v2.f17201b;
            if (i10 <= i9) {
                this.f5580e -= i10;
                arrayList.remove(0);
                int i11 = this.f5581f;
                if (i11 < 5) {
                    this.f5581f = i11 + 1;
                    c1991vArr[i11] = c1991v2;
                }
            } else {
                c1991v2.f17201b = i10 - i9;
                this.f5580e -= i9;
            }
        }
    }

    public float r() {
        ArrayList arrayList = (ArrayList) this.f5577b;
        if (this.f5578c != 0) {
            Collections.sort(arrayList, C2045w.f17379b);
            this.f5578c = 0;
        }
        float f2 = this.f5580e;
        int i = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            float f5 = 0.5f * f2;
            C1991v c1991v = (C1991v) arrayList.get(i3);
            i += c1991v.f17201b;
            if (i >= f5) {
                return c1991v.f17202c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C1991v) arrayList.get(arrayList.size() - 1)).f17202c;
    }

    public String toString() {
        String str;
        switch (this.f5576a) {
            case 2:
                synchronized (((p1.e) this.f5582g)) {
                    try {
                        int i = this.f5580e;
                        int i3 = this.f5581f + i;
                        str = "LruCache[maxSize=" + this.f5578c + ",hits=" + this.f5580e + ",misses=" + this.f5581f + ",hitRate=" + (i3 != 0 ? (i * 100) / i3 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public p0(int i) {
        this.f5576a = 2;
        this.f5578c = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f5577b = new h2.d(15);
        this.f5582g = new p1.e(17);
    }

    public p0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f5576a = 0;
        this.f5582g = staggeredGridLayoutManager;
        this.f5577b = new ArrayList();
        this.f5578c = LinearLayoutManager.INVALID_OFFSET;
        this.f5579d = LinearLayoutManager.INVALID_OFFSET;
        this.f5580e = 0;
        this.f5581f = i;
    }
}
