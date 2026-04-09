package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1378a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1379b;

    /* renamed from: c, reason: collision with root package name */
    public int f1380c;

    /* renamed from: d, reason: collision with root package name */
    public int f1381d;

    /* renamed from: e, reason: collision with root package name */
    public int f1382e;

    /* renamed from: f, reason: collision with root package name */
    public int f1383f;
    public final Object g;

    public g2() {
        this.f1378a = 1;
        this.g = new com.google.android.gms.internal.ads.u[5];
        this.f1379b = new ArrayList();
        this.f1380c = -1;
    }

    public static void m(Object obj, Object obj2) {
        nk.k.e(obj, "key");
        nk.k.e(obj2, "value");
    }

    public void a() {
        View view = (View) je.u.p(1, (ArrayList) this.f1379b);
        d2 d2Var = (d2) view.getLayoutParams();
        this.f1381d = ((StaggeredGridLayoutManager) this.g).f1271c.b(view);
        d2Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f1379b).clear();
        this.f1380c = LinearLayoutManager.INVALID_OFFSET;
        this.f1381d = LinearLayoutManager.INVALID_OFFSET;
        this.f1382e = 0;
    }

    public Object c(Object obj) {
        nk.k.e(obj, "key");
        return null;
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.g).f1275h ? f(r0.size() - 1, -1) : f(0, ((ArrayList) this.f1379b).size());
    }

    public int e() {
        return ((StaggeredGridLayoutManager) this.g).f1275h ? f(0, ((ArrayList) this.f1379b).size()) : f(r0.size() - 1, -1);
    }

    public int f(int i4, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int iK = staggeredGridLayoutManager.f1271c.k();
        int iG = staggeredGridLayoutManager.f1271c.g();
        int i11 = i10 > i4 ? 1 : -1;
        while (i4 != i10) {
            View view = (View) ((ArrayList) this.f1379b).get(i4);
            int iE = staggeredGridLayoutManager.f1271c.e(view);
            int iB = staggeredGridLayoutManager.f1271c.b(view);
            boolean z3 = iE <= iG;
            boolean z10 = iB >= iK;
            if (z3 && z10 && (iE < iK || iB > iG)) {
                return staggeredGridLayoutManager.getPosition(view);
            }
            i4 += i11;
        }
        return -1;
    }

    public Object g(Object obj) {
        Object objPut;
        nk.k.e(obj, "key");
        synchronized (((i7.b) this.g)) {
            o.e eVar = (o.e) this.f1379b;
            eVar.getClass();
            Object obj2 = ((LinkedHashMap) eVar.f30195b).get(obj);
            if (obj2 != null) {
                this.f1382e++;
                return obj2;
            }
            this.f1383f++;
            Object objC = c(obj);
            if (objC == null) {
                return null;
            }
            synchronized (((i7.b) this.g)) {
                o.e eVar2 = (o.e) this.f1379b;
                eVar2.getClass();
                objPut = ((LinkedHashMap) eVar2.f30195b).put(obj, objC);
                if (objPut != null) {
                    o.e eVar3 = (o.e) this.f1379b;
                    eVar3.getClass();
                    ((LinkedHashMap) eVar3.f30195b).put(obj, objPut);
                } else {
                    int i4 = this.f1381d;
                    m(obj, objC);
                    this.f1381d = i4 + 1;
                }
            }
            if (objPut != null) {
                return objPut;
            }
            n(this.f1380c);
            return objC;
        }
    }

    public int h(int i4) {
        int i10 = this.f1381d;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (((ArrayList) this.f1379b).size() == 0) {
            return i4;
        }
        a();
        return this.f1381d;
    }

    public View i(int i4, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f1379b;
        View view = null;
        if (i10 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1275h && staggeredGridLayoutManager.getPosition(view2) >= i4) || ((!staggeredGridLayoutManager.f1275h && staggeredGridLayoutManager.getPosition(view2) <= i4) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            View view3 = (View) arrayList.get(i11);
            if ((staggeredGridLayoutManager.f1275h && staggeredGridLayoutManager.getPosition(view3) <= i4) || ((!staggeredGridLayoutManager.f1275h && staggeredGridLayoutManager.getPosition(view3) >= i4) || !view3.hasFocusable())) {
                break;
            }
            i11++;
            view = view3;
        }
        return view;
    }

    public int j(int i4) {
        ArrayList arrayList = (ArrayList) this.f1379b;
        int i10 = this.f1380c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (arrayList.size() == 0) {
            return i4;
        }
        View view = (View) arrayList.get(0);
        d2 d2Var = (d2) view.getLayoutParams();
        this.f1380c = ((StaggeredGridLayoutManager) this.g).f1271c.e(view);
        d2Var.getClass();
        return this.f1380c;
    }

    public Object k(Object obj, Object obj2) {
        Object objPut;
        nk.k.e(obj, "key");
        nk.k.e(obj2, "value");
        synchronized (((i7.b) this.g)) {
            int i4 = this.f1381d;
            m(obj, obj2);
            this.f1381d = i4 + 1;
            o.e eVar = (o.e) this.f1379b;
            eVar.getClass();
            objPut = ((LinkedHashMap) eVar.f30195b).put(obj, obj2);
            if (objPut != null) {
                int i10 = this.f1381d;
                m(obj, objPut);
                this.f1381d = i10 - 1;
            }
        }
        n(this.f1380c);
        return objPut;
    }

    public Object l(Object obj) {
        Object objRemove;
        nk.k.e(obj, "key");
        synchronized (((i7.b) this.g)) {
            o.e eVar = (o.e) this.f1379b;
            eVar.getClass();
            objRemove = ((LinkedHashMap) eVar.f30195b).remove(obj);
            if (objRemove != null) {
                int i4 = this.f1381d;
                m(obj, objRemove);
                this.f1381d = i4 - 1;
            }
        }
        return objRemove;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(int r6) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r5.g
            i7.b r0 = (i7.b) r0
            monitor-enter(r0)
            int r1 = r5.f1381d     // Catch: java.lang.Throwable -> L1c
            if (r1 < 0) goto L9c
            java.lang.Object r1 = r5.f1379b     // Catch: java.lang.Throwable -> L1c
            o.e r1 = (o.e) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f30195b     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1f
            int r1 = r5.f1381d     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L9c
            goto L1f
        L1c:
            r6 = move-exception
            goto La4
        L1f:
            int r1 = r5.f1381d     // Catch: java.lang.Throwable -> L1c
            if (r1 <= r6) goto L9a
            java.lang.Object r1 = r5.f1379b     // Catch: java.lang.Throwable -> L1c
            o.e r1 = (o.e) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f30195b     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L32
            goto L9a
        L32:
            java.lang.Object r1 = r5.f1379b     // Catch: java.lang.Throwable -> L1c
            o.e r1 = (o.e) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f30195b     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "<get-entries>(...)"
            nk.k.d(r1, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L1c
            r3 = 0
            if (r2 == 0) goto L59
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L53
            goto L68
        L53:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L1c
            goto L68
        L59:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L64
            goto L68
        L64:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L1c
        L68:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L6e
            monitor-exit(r0)
            return
        L6e:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r5.f1379b     // Catch: java.lang.Throwable -> L1c
            o.e r3 = (o.e) r3     // Catch: java.lang.Throwable -> L1c
            r3.getClass()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "key"
            nk.k.e(r1, r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r3.f30195b     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L1c
            r3.remove(r1)     // Catch: java.lang.Throwable -> L1c
            int r3 = r5.f1381d     // Catch: java.lang.Throwable -> L1c
            m(r1, r2)     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 + (-1)
            r5.f1381d = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            java.lang.String r0 = "oldValue"
            nk.k.e(r2, r0)
            goto L0
        L9a:
            monitor-exit(r0)
            return
        L9c:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        La4:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.g2.n(int):void");
    }

    public void o(int i4, float f10) {
        com.google.android.gms.internal.ads.u uVar;
        com.google.android.gms.internal.ads.u[] uVarArr = (com.google.android.gms.internal.ads.u[]) this.g;
        ArrayList arrayList = (ArrayList) this.f1379b;
        if (this.f1380c != 1) {
            Collections.sort(arrayList, com.google.android.gms.internal.ads.v.f17395c);
            this.f1380c = 1;
        }
        int i10 = this.f1383f;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.f1383f = i11;
            uVar = uVarArr[i11];
        } else {
            uVar = new com.google.android.gms.internal.ads.u();
        }
        int i12 = this.f1381d;
        this.f1381d = i12 + 1;
        uVar.f17021a = i12;
        uVar.f17022b = i4;
        uVar.f17023c = f10;
        arrayList.add(uVar);
        this.f1382e += i4;
        while (true) {
            int i13 = this.f1382e;
            if (i13 <= 2000) {
                return;
            }
            int i14 = i13 - 2000;
            com.google.android.gms.internal.ads.u uVar2 = (com.google.android.gms.internal.ads.u) arrayList.get(0);
            int i15 = uVar2.f17022b;
            if (i15 <= i14) {
                this.f1382e -= i15;
                arrayList.remove(0);
                int i16 = this.f1383f;
                if (i16 < 5) {
                    this.f1383f = i16 + 1;
                    uVarArr[i16] = uVar2;
                }
            } else {
                uVar2.f17022b = i15 - i14;
                this.f1382e -= i14;
            }
        }
    }

    public float p() {
        ArrayList arrayList = (ArrayList) this.f1379b;
        if (this.f1380c != 0) {
            Collections.sort(arrayList, com.google.android.gms.internal.ads.v.f17394b);
            this.f1380c = 0;
        }
        float f10 = this.f1382e;
        int i4 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            float f11 = 0.5f * f10;
            com.google.android.gms.internal.ads.u uVar = (com.google.android.gms.internal.ads.u) arrayList.get(i10);
            i4 += uVar.f17022b;
            if (i4 >= f11) {
                return uVar.f17023c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((com.google.android.gms.internal.ads.u) arrayList.get(arrayList.size() - 1)).f17023c;
    }

    public String toString() {
        String str;
        switch (this.f1378a) {
            case 2:
                synchronized (((i7.b) this.g)) {
                    try {
                        int i4 = this.f1382e;
                        int i10 = this.f1383f + i4;
                        str = "LruCache[maxSize=" + this.f1380c + ",hits=" + this.f1382e + ",misses=" + this.f1383f + ",hitRate=" + (i10 != 0 ? (i4 * 100) / i10 : 0) + "%]";
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public g2(int i4) {
        this.f1378a = 2;
        this.f1380c = i4;
        if (i4 <= 0) {
            y.a.c("maxSize <= 0");
            throw null;
        }
        this.f1379b = new o.e((byte) 0, 24);
        this.g = new i7.b();
    }

    public g2(StaggeredGridLayoutManager staggeredGridLayoutManager, int i4) {
        this.f1378a = 0;
        this.g = staggeredGridLayoutManager;
        this.f1379b = new ArrayList();
        this.f1380c = LinearLayoutManager.INVALID_OFFSET;
        this.f1381d = LinearLayoutManager.INVALID_OFFSET;
        this.f1382e = 0;
        this.f1383f = i4;
    }
}
