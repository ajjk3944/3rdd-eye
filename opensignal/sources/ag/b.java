package ag;

import a5.v;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.view.View;
import br.b0;
import br.l;
import coil.memory.MemoryCache$Key;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.sentry.b5;
import io.sentry.u0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import lf.t1;
import lu.a0;
import lu.p;
import lu.s;
import lu.w;
import mq.o;
import mu.r;
import v3.m;

/* loaded from: classes.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f344a;

    /* renamed from: d, reason: collision with root package name */
    public int f345d;

    /* renamed from: g, reason: collision with root package name */
    public Object f346g;

    public /* synthetic */ b(char c4, int i10) {
        this.f344a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007c -> B:23:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ag.b r12, lq.b r13, rq.a r14) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.b.a(ag.b, lq.b, rq.a):java.lang.Object");
    }

    public static b c() {
        b bVar = new b((char) 0, 0);
        bVar.f346g = e.DEFAULT;
        return bVar;
    }

    public a b() {
        return new a(this.f345d, (e) this.f346g);
    }

    @Override // v3.m
    public boolean d(View view) {
        ((BottomSheetBehavior) this.f346g).C(this.f345d);
        return true;
    }

    public void e() {
        WeakReference weakReference;
        this.f345d = 0;
        Iterator it = ((LinkedHashMap) this.f346g).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                j8.e eVar = (j8.e) o.t0(arrayList);
                if (((eVar == null || (weakReference = eVar.f13422b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (((j8.e) arrayList.get(i12)).f13422b.get() == null) {
                        arrayList.remove(i12);
                        i10++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public void f(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = (char[]) this.f346g;
        if (cArr.length <= i12) {
            int i13 = i10 * 2;
            if (i12 < i13) {
                i12 = i13;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i12);
            l.d(cArrCopyOf, "copyOf(...)");
            this.f346g = cArrCopyOf;
        }
    }

    public boolean g() {
        return i("android.permission.ACCESS_COARSE_LOCATION") || i("android.permission.ACCESS_FINE_LOCATION");
    }

    public boolean h() {
        return ((e9.a) this.f346g) != null;
    }

    public boolean i(String str) {
        return h3.c.a((Context) this.f346g, str) == 0;
    }

    public HashMap j(Map map, u0 u0Var) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), q(u0Var, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    public lu.l k() {
        lu.l wVar;
        Object obj;
        bj.c cVar = (bj.c) this.f346g;
        byte bE = cVar.E();
        if (bE == 1) {
            return o(true);
        }
        if (bE == 0) {
            return o(false);
        }
        if (bE != 6) {
            if (bE == 8) {
                return l();
            }
            bj.c.u(cVar, "Cannot read Json element because of unexpected ".concat(mu.l.q(bE)), 0, null, 6);
            throw null;
        }
        int i10 = this.f345d + 1;
        this.f345d = i10;
        if (i10 == 200) {
            r rVar = new r(this, null);
            qq.a aVar = lq.a.f15557a;
            lq.b bVar = new lq.b();
            bVar.f15559a = rVar;
            bVar.f15560d = bVar;
            qq.a aVar2 = lq.a.f15557a;
            bVar.f15561g = aVar2;
            while (true) {
                obj = bVar.f15561g;
                pq.c cVar2 = bVar.f15560d;
                if (cVar2 == null) {
                    break;
                }
                if (l.a(aVar2, obj)) {
                    try {
                        r rVar2 = bVar.f15559a;
                        b0.c(3, rVar2);
                        r rVar3 = new r(rVar2.f17032x, cVar2);
                        rVar3.f17031r = bVar;
                        Object objQ = rVar3.q(lq.b0.f15562a);
                        if (objQ != qq.a.COROUTINE_SUSPENDED) {
                            cVar2.g(objQ);
                        }
                    } catch (Throwable th2) {
                        cVar2.g(t1.k(th2));
                    }
                } else {
                    bVar.f15561g = aVar2;
                    cVar2.g(obj);
                }
            }
            t1.G(obj);
            wVar = (lu.l) obj;
        } else {
            byte bM = cVar.m((byte) 6);
            if (cVar.E() == 4) {
                bj.c.u(cVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!cVar.i()) {
                    break;
                }
                String strP = cVar.p();
                cVar.m((byte) 5);
                linkedHashMap.put(strP, k());
                bM = cVar.l();
                if (bM != 4) {
                    if (bM != 7) {
                        bj.c.u(cVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bM == 6) {
                cVar.m((byte) 7);
            } else if (bM == 4) {
                mu.l.k(cVar, "object");
                throw null;
            }
            wVar = new w(linkedHashMap);
        }
        this.f345d--;
        return wVar;
    }

    public lu.e l() {
        bj.c cVar = (bj.c) this.f346g;
        byte bL = cVar.l();
        if (cVar.E() == 4) {
            bj.c.u(cVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (cVar.i()) {
            arrayList.add(k());
            bL = cVar.l();
            if (bL != 4) {
                boolean z10 = bL == 9;
                int i10 = cVar.f2794d;
                if (!z10) {
                    bj.c.u(cVar, "Expected end of the array or comma", i10, null, 4);
                    throw null;
                }
            }
        }
        if (bL == 8) {
            cVar.m((byte) 9);
        } else if (bL == 4) {
            mu.l.k(cVar, "array");
            throw null;
        }
        return new lu.e(arrayList);
    }

    public long m(ca.l lVar) {
        fb.f fVar = (fb.f) this.f346g;
        int i10 = 0;
        lVar.p(fVar.f8800a, 0, 1);
        int i11 = fVar.f8800a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        lVar.p(fVar.f8800a, 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (fVar.f8800a[i10] & 255) + (i14 << 8);
        }
        this.f345d = i13 + 1 + this.f345d;
        return i14;
    }

    public long n(u5.l lVar) {
        v vVar = (v) this.f346g;
        int i10 = 0;
        lVar.p(vVar.f165a, 0, 1);
        int i11 = vVar.f165a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        lVar.p(vVar.f165a, 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (vVar.f165a[i10] & 255) + (i14 << 8);
        }
        this.f345d = i13 + 1 + this.f345d;
        return i14;
    }

    public a0 o(boolean z10) {
        bj.c cVar = (bj.c) this.f346g;
        String strQ = !z10 ? cVar.q() : cVar.p();
        return (z10 || !l.a(strQ, "null")) ? new p(strQ, z10) : s.INSTANCE;
    }

    public void p() {
        mu.c cVar = mu.c.f17009g;
        char[] cArr = (char[]) this.f346g;
        cVar.getClass();
        l.e(cArr, "array");
        synchronized (cVar) {
            int i10 = cVar.f1300a;
            if (cArr.length + i10 < mu.b.f17008a) {
                cVar.f1300a = i10 + cArr.length;
                ((mq.k) cVar.f1301d).addLast(cArr);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public Object q(u0 u0Var, Object obj) {
        Object objR;
        HashSet hashSet = (HashSet) this.f346g;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        int i10 = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = io.sentry.util.c.f12804a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            while (i10 < length) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i10)));
                i10++;
            }
            return arrayList;
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return io.sentry.util.c.a((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        if (hashSet.contains(obj)) {
            u0Var.m(b5.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        hashSet.add(obj);
        try {
            if (hashSet.size() > this.f345d) {
                hashSet.remove(obj);
                u0Var.m(b5.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    Object[] objArr = (Object[]) obj;
                    objR = new ArrayList();
                    int length2 = objArr.length;
                    while (i10 < length2) {
                        objR.add(q(u0Var, objArr[i10]));
                        i10++;
                    }
                } else if (obj instanceof Collection) {
                    objR = new ArrayList();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        objR.add(q(u0Var, it.next()));
                    }
                } else if (obj instanceof Map) {
                    objR = j((Map) obj, u0Var);
                } else {
                    objR = r(u0Var, obj);
                    if (objR.isEmpty()) {
                        objR = obj.toString();
                    }
                }
                hashSet.remove(obj);
                return objR;
            } catch (Exception e4) {
                u0Var.g(b5.INFO, "Not serializing object due to throwing sub-path.", e4);
                hashSet.remove(obj);
                return null;
            }
        } catch (Throwable th2) {
            hashSet.remove(obj);
            throw th2;
        }
    }

    public HashMap r(u0 u0Var, Object obj) throws SecurityException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, q(u0Var, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    u0Var.m(b5.INFO, h0.b.o("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }

    public synchronized void s(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map, int i10) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f346g;
            Object arrayList = linkedHashMap.get(memoryCache$Key);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(memoryCache$Key, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            j8.e eVar = new j8.e(iIdentityHashCode, new WeakReference(bitmap), map, i10);
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    arrayList2.add(eVar);
                    break;
                }
                j8.e eVar2 = (j8.e) arrayList2.get(i11);
                if (i10 < eVar2.f13424d) {
                    i11++;
                } else if (eVar2.f13421a == iIdentityHashCode && eVar2.f13422b.get() == bitmap) {
                    arrayList2.set(i11, eVar);
                } else {
                    arrayList2.add(i11, eVar);
                }
            }
            int i12 = this.f345d;
            this.f345d = i12 + 1;
            if (i12 >= 10) {
                e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void t(String str) {
        l.e(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        f(this.f345d, length);
        str.getChars(0, str.length(), (char[]) this.f346g, this.f345d);
        this.f345d += length;
    }

    public String toString() {
        switch (this.f344a) {
            case 10:
                return new String((char[]) this.f346g, 0, this.f345d);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(int i10, int i11, Object obj) {
        this.f344a = i11;
        this.f346g = obj;
        this.f345d = i10;
    }

    public b(lu.i iVar, bj.c cVar) {
        this.f344a = 11;
        this.f346g = cVar;
    }

    public b(int i10, String str) {
        this.f344a = 12;
        this.f345d = i10;
        this.f346g = str;
    }

    public b(int i10) {
        this.f344a = 4;
        this.f346g = new HashSet();
        this.f345d = i10;
    }

    public b(int i10, byte b2) {
        this.f344a = i10;
        switch (i10) {
            case 3:
                this.f346g = new fb.f(8);
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f346g = new v(8);
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f346g = new LinkedHashMap();
                break;
            case 16:
                this.f345d = Process.myUid();
                break;
            default:
                this.f345d = 255;
                this.f346g = null;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(java.util.List r7, q3.a r8) {
        /*
            r6 = this;
            r0 = 13
            r6.f344a = r0
            r6.<init>()
            r6.f346g = r7
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L21
            if (r8 == 0) goto L1b
            java.lang.Object r0 = r8.f20680g
            om.f r0 = (om.f) r0
            java.lang.Object r0 = r0.f19555g
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 == 0) goto L21
            l5.t.e(r0)
        L21:
            if (r8 == 0) goto L2c
            java.lang.Object r0 = r8.f20680g
            om.f r0 = (om.f) r0
            java.lang.Object r0 = r0.f19555g
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            if (r0 == 0) goto L32
            r0.getButtonState()
        L32:
            if (r8 == 0) goto L3d
            java.lang.Object r0 = r8.f20680g
            om.f r0 = (om.f) r0
            java.lang.Object r0 = r0.f19555g
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 == 0) goto L43
            r0.getMetaState()
        L43:
            if (r8 == 0) goto L4e
            java.lang.Object r8 = r8.f20680g
            om.f r8 = (om.f) r8
            java.lang.Object r8 = r8.f19555g
            r2 = r8
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
        L4e:
            r8 = 0
            r0 = 3
            r1 = 2
            r3 = 1
            if (r2 == 0) goto L6e
            int r7 = r2.getActionMasked()
            if (r7 == 0) goto L6c
            if (r7 == r3) goto L6a
            if (r7 == r1) goto L68
            switch(r7) {
                case 5: goto L6c;
                case 6: goto L6a;
                case 7: goto L68;
                case 8: goto L66;
                case 9: goto L64;
                case 10: goto L62;
                default: goto L61;
            }
        L61:
            goto L92
        L62:
            r8 = 5
            goto L92
        L64:
            r8 = 4
            goto L92
        L66:
            r8 = 6
            goto L92
        L68:
            r8 = r0
            goto L92
        L6a:
            r8 = r1
            goto L92
        L6c:
            r8 = r3
            goto L92
        L6e:
            int r2 = r7.size()
        L72:
            if (r8 >= r2) goto L68
            java.lang.Object r4 = r7.get(r8)
            r1.j r4 = (r1.j) r4
            boolean r5 = r4.f21173h
            if (r5 == 0) goto L84
            boolean r5 = r4.f21169d
            if (r5 != 0) goto L84
            r5 = 1
            goto L85
        L84:
            r5 = 0
        L85:
            if (r5 == 0) goto L88
            goto L6a
        L88:
            boolean r4 = dr.a.e(r4)
            if (r4 == 0) goto L8f
            goto L6c
        L8f:
            int r8 = r8 + 1
            goto L72
        L92:
            r6.f345d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.b.<init>(java.util.List, q3.a):void");
    }
}
