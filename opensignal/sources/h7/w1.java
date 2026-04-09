package h7;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10228a;

    /* renamed from: b, reason: collision with root package name */
    public int f10229b;

    /* renamed from: c, reason: collision with root package name */
    public int f10230c;

    /* renamed from: d, reason: collision with root package name */
    public int f10231d;

    /* renamed from: e, reason: collision with root package name */
    public int f10232e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f10233f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10234g;

    public w1(int i10) {
        this.f10228a = 1;
        this.f10229b = i10;
        if (i10 <= 0) {
            v.a.c("maxSize <= 0");
            throw null;
        }
        this.f10233f = new oh.p(20);
        this.f10234g = new cg.e();
    }

    public void a() {
        View view = (View) h0.b.f(1, (ArrayList) this.f10233f);
        v1 v1Var = (v1) view.getLayoutParams();
        this.f10230c = ((StaggeredGridLayoutManager) this.f10234g).f2091r.b(view);
        v1Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f10233f).clear();
        this.f10229b = Integer.MIN_VALUE;
        this.f10230c = Integer.MIN_VALUE;
        this.f10231d = 0;
    }

    public Object c(Object obj) {
        br.l.e(obj, "key");
        return null;
    }

    public void d(Object obj, Object obj2, Object obj3) {
        br.l.e(obj, "key");
        br.l.e(obj2, "oldValue");
    }

    public int e() {
        return ((StaggeredGridLayoutManager) this.f10234g).f2096w ? g(r0.size() - 1, -1) : g(0, ((ArrayList) this.f10233f).size());
    }

    public int f() {
        return ((StaggeredGridLayoutManager) this.f10234g).f2096w ? g(0, ((ArrayList) this.f10233f).size()) : g(r0.size() - 1, -1);
    }

    public int g(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f10234g;
        int iK = staggeredGridLayoutManager.f2091r.k();
        int iG = staggeredGridLayoutManager.f2091r.g();
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View view = (View) ((ArrayList) this.f10233f).get(i10);
            int iE = staggeredGridLayoutManager.f2091r.e(view);
            int iB = staggeredGridLayoutManager.f2091r.b(view);
            boolean z10 = iE <= iG;
            boolean z11 = iB >= iK;
            if (z10 && z11 && (iE < iK || iB > iG)) {
                return y0.H(view);
            }
            i10 += i12;
        }
        return -1;
    }

    public Object h(Object obj) {
        Object objPut;
        br.l.e(obj, "key");
        synchronized (((cg.e) this.f10234g)) {
            oh.p pVar = (oh.p) this.f10233f;
            pVar.getClass();
            Object obj2 = ((LinkedHashMap) pVar.f19481d).get(obj);
            if (obj2 != null) {
                this.f10231d++;
                return obj2;
            }
            this.f10232e++;
            Object objC = c(obj);
            if (objC == null) {
                return null;
            }
            synchronized (((cg.e) this.f10234g)) {
                oh.p pVar2 = (oh.p) this.f10233f;
                pVar2.getClass();
                objPut = ((LinkedHashMap) pVar2.f19481d).put(obj, objC);
                if (objPut != null) {
                    oh.p pVar3 = (oh.p) this.f10233f;
                    pVar3.getClass();
                    ((LinkedHashMap) pVar3.f19481d).put(obj, objPut);
                } else {
                    this.f10230c += n(obj, objC);
                }
            }
            if (objPut != null) {
                d(obj, objC, objPut);
                return objPut;
            }
            p(this.f10229b);
            return objC;
        }
    }

    public int i(int i10) {
        int i11 = this.f10230c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (((ArrayList) this.f10233f).size() == 0) {
            return i10;
        }
        a();
        return this.f10230c;
    }

    public View j(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f10234g;
        ArrayList arrayList = (ArrayList) this.f10233f;
        View view = null;
        if (i11 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2096w && y0.H(view2) >= i10) || ((!staggeredGridLayoutManager.f2096w && y0.H(view2) <= i10) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            View view3 = (View) arrayList.get(i12);
            if ((staggeredGridLayoutManager.f2096w && y0.H(view3) <= i10) || ((!staggeredGridLayoutManager.f2096w && y0.H(view3) >= i10) || !view3.hasFocusable())) {
                break;
            }
            i12++;
            view = view3;
        }
        return view;
    }

    public int k(int i10) {
        ArrayList arrayList = (ArrayList) this.f10233f;
        int i11 = this.f10229b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (arrayList.size() == 0) {
            return i10;
        }
        View view = (View) arrayList.get(0);
        v1 v1Var = (v1) view.getLayoutParams();
        this.f10229b = ((StaggeredGridLayoutManager) this.f10234g).f2091r.e(view);
        v1Var.getClass();
        return this.f10229b;
    }

    public Object l(Object obj, Object obj2) {
        Object objPut;
        br.l.e(obj, "key");
        br.l.e(obj2, "value");
        synchronized (((cg.e) this.f10234g)) {
            this.f10230c += n(obj, obj2);
            oh.p pVar = (oh.p) this.f10233f;
            pVar.getClass();
            objPut = ((LinkedHashMap) pVar.f19481d).put(obj, obj2);
            if (objPut != null) {
                this.f10230c -= n(obj, objPut);
            }
        }
        if (objPut != null) {
            d(obj, objPut, obj2);
        }
        p(this.f10229b);
        return objPut;
    }

    public Object m(Object obj) {
        Object objRemove;
        br.l.e(obj, "key");
        synchronized (((cg.e) this.f10234g)) {
            oh.p pVar = (oh.p) this.f10233f;
            pVar.getClass();
            objRemove = ((LinkedHashMap) pVar.f19481d).remove(obj);
            if (objRemove != null) {
                this.f10230c -= n(obj, objRemove);
            }
        }
        if (objRemove != null) {
            d(obj, objRemove, null);
        }
        return objRemove;
    }

    public int n(Object obj, Object obj2) {
        int iO = o(obj, obj2);
        if (iO >= 0) {
            return iO;
        }
        String str = "Negative size: " + obj + '=' + obj2;
        br.l.e(str, "message");
        throw new IllegalStateException(str);
    }

    public int o(Object obj, Object obj2) {
        br.l.e(obj, "key");
        br.l.e(obj2, "value");
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
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
            java.lang.Object r0 = r5.f10234g
            cg.e r0 = (cg.e) r0
            monitor-enter(r0)
            int r1 = r5.f10230c     // Catch: java.lang.Throwable -> L1c
            if (r1 < 0) goto L7a
            java.lang.Object r1 = r5.f10233f     // Catch: java.lang.Throwable -> L1c
            oh.p r1 = (oh.p) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f19481d     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            int r1 = r5.f10230c     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L7a
            goto L1e
        L1c:
            r6 = move-exception
            goto L82
        L1e:
            int r1 = r5.f10230c     // Catch: java.lang.Throwable -> L1c
            if (r1 <= r6) goto L78
            java.lang.Object r1 = r5.f10233f     // Catch: java.lang.Throwable -> L1c
            oh.p r1 = (oh.p) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f19481d     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L31
            goto L78
        L31:
            java.lang.Object r1 = r5.f10233f     // Catch: java.lang.Throwable -> L1c
            oh.p r1 = (oh.p) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f19481d     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "<get-entries>(...)"
            br.l.d(r1, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = mq.o.s0(r1)     // Catch: java.lang.Throwable -> L1c
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L4e
            monitor-exit(r0)
            return
        L4e:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r5.f10233f     // Catch: java.lang.Throwable -> L1c
            oh.p r3 = (oh.p) r3     // Catch: java.lang.Throwable -> L1c
            r3.getClass()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "key"
            br.l.e(r2, r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r3.f19481d     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L1c
            r3.remove(r2)     // Catch: java.lang.Throwable -> L1c
            int r3 = r5.f10230c     // Catch: java.lang.Throwable -> L1c
            int r4 = r5.n(r2, r1)     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 - r4
            r5.f10230c = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            r0 = 0
            r5.d(r2, r1, r0)
            goto L0
        L78:
            monitor-exit(r0)
            return
        L7a:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L82:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.w1.p(int):void");
    }

    public String toString() {
        String str;
        switch (this.f10228a) {
            case 1:
                synchronized (((cg.e) this.f10234g)) {
                    try {
                        int i10 = this.f10231d;
                        int i11 = this.f10232e + i10;
                        str = "LruCache[maxSize=" + this.f10229b + ",hits=" + this.f10231d + ",misses=" + this.f10232e + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public w1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f10228a = 0;
        this.f10234g = staggeredGridLayoutManager;
        this.f10233f = new ArrayList();
        this.f10229b = Integer.MIN_VALUE;
        this.f10230c = Integer.MIN_VALUE;
        this.f10231d = 0;
        this.f10232e = i10;
    }
}
