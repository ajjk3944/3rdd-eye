package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t83 implements i80, hk1, rd2, ug2, qq2 {
    public static t83 j;
    public static volatile t83 k;
    public static final Object l = new Object();
    public static final on1 m;
    public static final on1 n;
    public static t83 o;
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;

    static {
        long j2 = -9223372036854775807L;
        m = new on1(2, j2);
        n = new on1(3, j2);
    }

    public /* synthetic */ t83(int i, boolean z) {
        this.f = i;
    }

    public static t83 D(Context context) {
        if (k == null) {
            synchronized (l) {
                try {
                    if (k == null) {
                        k = new t83(context);
                    }
                } finally {
                }
            }
        }
        return k;
    }

    public static t83 S(Context context) {
        synchronized (t83.class) {
            try {
                t83 t83Var = j;
                if (t83Var != null) {
                    return t83Var;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) t02.b.w()).longValue();
                nm2 nm2VarAsInterface = null;
                if (jLongValue > 0 && jLongValue <= 253830000) {
                    try {
                        nm2VarAsInterface = cm2.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        gi2.c0("Failed to retrieve lite SDK info.", e);
                    }
                }
                t83 t83Var2 = new t83(applicationContext, nm2VarAsInterface);
                j = t83Var2;
                return t83Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String Y(Context context) throws IOException {
        File file = new File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16384];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, i);
                }
                jo3 jo3VarF = jo3.f.f();
                byte[] bArrDigest = messageDigest.digest();
                String strG = jo3VarF.g(bArrDigest.length, bArrDigest);
                fileInputStream.close();
                return strG;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public Object A(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.h;
        if (g82.l()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                t20 t20Var = (t20) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = t20Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            A(cls2, hashSet);
                        }
                    }
                }
                objB = t20Var.b((Context) this.g);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new rg(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    public View B(int i) {
        return ((RecyclerView) ((z71) this.g).g).getChildAt(E(i));
    }

    public int C() {
        return ((RecyclerView) ((z71) this.g).g).getChildCount() - ((ArrayList) this.i).size();
    }

    public int E(int i) {
        ue ueVar = (ue) this.h;
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((z71) this.g).g).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iF = i - (i2 - ueVar.f(i2));
            if (iF == 0) {
                while (ueVar.q(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iF;
        }
        return -1;
    }

    public sz0 F(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
        rq0 rq0VarF = rq0.f("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            rq0VarF.h(1);
        } else {
            rq0VarF.i(str, 1);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(rq0VarF);
        try {
            return cursorG.moveToFirst() ? new sz0(cursorG.getString(yb.j(cursorG, "work_spec_id")), cursorG.getInt(yb.j(cursorG, "system_id"))) : null;
        } finally {
            cursorG.close();
            rq0VarF.k();
        }
    }

    public View G(int i) {
        return ((RecyclerView) ((z71) this.g).g).getChildAt(i);
    }

    public int H() {
        return ((RecyclerView) ((z71) this.g).g).getChildCount();
    }

    public void I(View view) {
        ((ArrayList) this.i).add(view);
        z71 z71Var = (z71) this.g;
        wo0 wo0VarI = RecyclerView.I(view);
        if (wo0VarI != null) {
            View view2 = wo0VarI.a;
            RecyclerView recyclerView = (RecyclerView) z71Var.g;
            int i = wo0VarI.q;
            if (i != -1) {
                wo0VarI.p = i;
            } else {
                WeakHashMap weakHashMap = e61.a;
                wo0VarI.p = view2.getImportantForAccessibility();
            }
            if (recyclerView.L()) {
                wo0VarI.q = 4;
                recyclerView.x0.add(wo0VarI);
            } else {
                WeakHashMap weakHashMap2 = e61.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public void J(sz0 sz0Var) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((io) this.h).e(sz0Var);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public boolean K(int i, di diVar, pi piVar) {
        ra raVar = (ra) this.h;
        int[] iArr = piVar.p0;
        int[] iArr2 = piVar.t;
        raVar.a = iArr[0];
        raVar.b = iArr[1];
        raVar.c = piVar.q();
        raVar.d = piVar.k();
        raVar.i = false;
        raVar.j = i;
        boolean z = raVar.a == 3;
        boolean z2 = raVar.b == 3;
        boolean z3 = z && piVar.W > 0.0f;
        boolean z4 = z2 && piVar.W > 0.0f;
        if (z3 && iArr2[0] == 4) {
            raVar.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            raVar.b = 1;
        }
        diVar.b(piVar, raVar);
        piVar.O(raVar.e);
        piVar.L(raVar.f);
        piVar.E = raVar.h;
        piVar.I(raVar.g);
        raVar.j = 0;
        return raVar.i;
    }

    public void L(Object[] objArr) {
        xy0 xy0Var = new xy0();
        System.currentTimeMillis();
        xy0Var.a = (vy0) this.h;
        Thread.currentThread().getName();
        xy0Var.b = objArr;
        ((Queue) this.i).add(xy0Var);
    }

    public void M(Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            L(new Object[]{obj});
        } else {
            L(new Object[]{obj, obj2});
        }
    }

    public void N(Object[] objArr) {
        Throwable th = null;
        if (objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
            }
        }
        if (th == null) {
            L(objArr);
            return;
        }
        if (objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        L(objArr2);
    }

    public void O(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.g;
        workDatabase_Impl.b();
        tz0 tz0Var = (tz0) this.i;
        px pxVarA = tz0Var.a();
        if (str == null) {
            pxVarA.g(1);
        } else {
            pxVarA.h(str, 1);
        }
        workDatabase_Impl.c();
        try {
            pxVarA.t();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            tz0Var.c(pxVarA);
        }
    }

    public void P(qi qiVar, int i, int i2, int i3) {
        qiVar.getClass();
        int i4 = qiVar.b0;
        int i5 = qiVar.c0;
        qiVar.b0 = 0;
        qiVar.c0 = 0;
        qiVar.O(i2);
        qiVar.L(i3);
        if (i4 < 0) {
            qiVar.b0 = 0;
        } else {
            qiVar.b0 = i4;
        }
        if (i5 < 0) {
            qiVar.c0 = 0;
        } else {
            qiVar.c0 = i5;
        }
        qi qiVar2 = (qi) this.i;
        qiVar2.t0 = i;
        qiVar2.U();
    }

    public void Q(View view) {
        if (((ArrayList) this.i).remove(view)) {
            z71 z71Var = (z71) this.g;
            wo0 wo0VarI = RecyclerView.I(view);
            if (wo0VarI != null) {
                RecyclerView recyclerView = (RecyclerView) z71Var.g;
                int i = wo0VarI.p;
                if (recyclerView.L()) {
                    wo0VarI.q = i;
                    recyclerView.x0.add(wo0VarI);
                } else {
                    View view2 = wo0VarI.a;
                    WeakHashMap weakHashMap = e61.a;
                    view2.setImportantForAccessibility(i);
                }
                wo0VarI.p = 0;
            }
        }
    }

    public void R(qi qiVar) {
        ArrayList arrayList = (ArrayList) this.g;
        arrayList.clear();
        int size = qiVar.q0.size();
        for (int i = 0; i < size; i++) {
            pi piVar = (pi) qiVar.q0.get(i);
            int[] iArr = piVar.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(piVar);
            }
        }
        qiVar.s0.a = true;
    }

    public void T(String str, double d, double d2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) this.h;
        ArrayList arrayList3 = (ArrayList) this.i;
        int i = 0;
        while (true) {
            arrayList = (ArrayList) this.g;
            if (i >= arrayList.size()) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i)).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            } else {
                i++;
            }
        }
        arrayList.add(i, str);
        arrayList3.add(i, Double.valueOf(d));
        arrayList2.add(i, Double.valueOf(d2));
    }

    public void U(nf1 nf1Var, in1 in1Var) {
        int i = 0;
        while (true) {
            jg1[] jg1VarArr = (jg1[]) this.h;
            if (i >= jg1VarArr.length) {
                return;
            }
            in1Var.a();
            in1Var.b();
            jg1 jg1VarZ = nf1Var.z(in1Var.d, 3);
            ph4 ph4Var = (ph4) ((List) this.g).get(i);
            String str = ph4Var.m;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zt0.X(z, "Invalid closed caption MIME type provided: %s", str);
            String str2 = ph4Var.a;
            if (str2 == null) {
                in1Var.b();
                str2 = in1Var.e;
            }
            gg4 gg4Var = new gg4();
            gg4Var.a = str2;
            gg4Var.d("video/mp2t");
            gg4Var.e(str);
            gg4Var.e = ph4Var.e;
            gg4Var.d = ph4Var.d;
            gg4Var.I = ph4Var.J;
            gg4Var.o = ph4Var.p;
            jg1VarZ.d(new ph4(gg4Var));
            jg1VarArr[i] = jg1VarZ;
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void V(defpackage.c83 r3, defpackage.a83 r4, int r5, defpackage.d03 r6, long r7) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.i
            mv2 r0 = (defpackage.mv2) r0
            lv2 r0 = r0.a()
            java.lang.String r1 = "gqi"
            java.lang.String r3 = r3.b
            r0.k(r1, r3)
            r0.i(r4)
            java.lang.String r3 = "action"
            java.lang.String r1 = "adapter_status"
            r0.k(r3, r1)
            java.lang.String r3 = "adapter_l"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.k(r3, r7)
            java.lang.String r3 = "sc"
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r0.k(r3, r5)
            r3 = 0
            if (r6 == 0) goto L61
            nx2 r5 = r6.g
            int r5 = r5.f
            java.lang.String r5 = java.lang.Integer.toString(r5)
            java.lang.String r7 = "arec"
            r0.k(r7, r5)
            java.lang.Object r5 = r2.g
            s83 r5 = (defpackage.s83) r5
            java.lang.String r6 = r6.getMessage()
            java.util.regex.Pattern r5 = r5.a
            if (r5 == 0) goto L59
            if (r6 != 0) goto L4a
            goto L59
        L4a:
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L59
            java.lang.String r5 = r5.group()
            goto L5a
        L59:
            r5 = r3
        L5a:
            if (r5 == 0) goto L61
            java.lang.String r6 = "areec"
            r0.k(r6, r5)
        L61:
            java.lang.Object r5 = r2.h
            xu2 r5 = (defpackage.xu2) r5
            java.util.List r4 = r4.t
            java.util.Iterator r4 = r4.iterator()
        L6b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            wu2 r6 = r5.b(r6)
            if (r6 == 0) goto L6b
            r3 = r6
        L7e:
            if (r3 == 0) goto La1
            java.lang.String r4 = "ancn"
            java.lang.String r5 = r3.a
            r0.k(r4, r5)
            i82 r4 = r3.b
            if (r4 == 0) goto L94
            java.lang.String r5 = "adapter_v"
            java.lang.String r4 = r4.toString()
            r0.k(r5, r4)
        L94:
            i82 r3 = r3.c
            if (r3 == 0) goto La1
            java.lang.String r4 = "adapter_sv"
            java.lang.String r3 = r3.toString()
            r0.k(r4, r3)
        La1:
            r0.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t83.V(c83, a83, int, d03, long):void");
    }

    public synchronized void W(f93 f93Var, e93 e93Var) {
        try {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.g;
            z83 z83Var = (z83) concurrentHashMap.get(f93Var);
            hg4.C.k.getClass();
            e93Var.d = System.currentTimeMillis();
            if (z83Var == null) {
                d93 d93Var = (d93) this.h;
                z83 z83Var2 = new z83(d93Var.j, d93Var.k * 1000);
                if (concurrentHashMap.size() == d93Var.i) {
                    int i = d93Var.o;
                    int i2 = i - 1;
                    f93 f93Var2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j2 = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((z83) entry.getValue()).d.a < j2) {
                                j2 = ((z83) entry.getValue()).d.a;
                                f93Var2 = (f93) entry.getKey();
                            }
                        }
                        if (f93Var2 != null) {
                            concurrentHashMap.remove(f93Var2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((z83) entry2.getValue()).d.c < j2) {
                                j2 = ((z83) entry2.getValue()).d.c;
                                f93Var2 = (f93) entry2.getKey();
                            }
                        }
                        if (f93Var2 != null) {
                            concurrentHashMap.remove(f93Var2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((z83) entry3.getValue()).d.d < i3) {
                                i3 = ((z83) entry3.getValue()).d.d;
                                f93Var2 = (f93) entry3.getKey();
                            }
                        }
                        if (f93Var2 != null) {
                            concurrentHashMap.remove(f93Var2);
                        }
                    }
                    b93 b93Var = (b93) this.i;
                    b93Var.c++;
                    b93Var.a.g = true;
                }
                concurrentHashMap.put(f93Var, z83Var2);
                b93 b93Var2 = (b93) this.i;
                b93Var2.b++;
                b93Var2.a.f = true;
                z83Var = z83Var2;
            }
            m93 m93Var = z83Var.d;
            m93Var.getClass();
            hg4.C.k.getClass();
            m93Var.c = System.currentTimeMillis();
            m93Var.d++;
            z83Var.a();
            LinkedList linkedList = z83Var.a;
            if (linkedList.size() != z83Var.b) {
                linkedList.add(e93Var);
            }
            b93 b93Var3 = (b93) this.i;
            b93Var3.f++;
            a93 a93Var = b93Var3.a;
            a93 a93VarClone = a93Var.clone();
            a93Var.f = false;
            a93Var.g = false;
            l93 l93Var = z83Var.d.b;
            l93 l93VarClone = l93Var.clone();
            l93Var.f = false;
            l93Var.g = 0;
            by1 by1VarA = gy1.A();
            zx1 zx1VarB = ay1.B();
            zx1VarB.b();
            ((ay1) zx1VarB.g).C();
            ey1 ey1VarB = fy1.B();
            boolean z = a93VarClone.f;
            ey1VarB.b();
            ((fy1) ey1VarB.g).C(z);
            boolean z2 = a93VarClone.g;
            ey1VarB.b();
            ((fy1) ey1VarB.g).D(z2);
            int i4 = l93VarClone.g;
            ey1VarB.b();
            ((fy1) ey1VarB.g).A(i4);
            zx1VarB.b();
            ((ay1) zx1VarB.g).A((fy1) ey1VarB.d());
            by1VarA.b();
            ((gy1) by1VarA.g).B((ay1) zx1VarB.d());
            e93Var.a.a().f.g0((gy1) by1VarA.d());
            a0();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void X(u62 u62Var) {
        u62 adapterCreator;
        AtomicReference atomicReference = (AtomicReference) this.i;
        if (!((Boolean) t02.a.w()).booleanValue()) {
            while (!atomicReference.compareAndSet(null, u62Var) && atomicReference.get() == null) {
            }
            return;
        }
        nm2 nm2Var = (nm2) this.h;
        if (nm2Var == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = nm2Var.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        if (adapterCreator == null) {
            adapterCreator = u62Var;
        }
        while (!atomicReference.compareAndSet(null, adapterCreator) && atomicReference.get() == null) {
        }
    }

    public void Z() {
        try {
            ((xy2) ((z94) this.g).d()).q0(((e51) this.h).f);
            if (((Boolean) tw1.e.c.a(mz1.Ge)).booleanValue()) {
                lv2 lv2VarA = ((mv2) this.i).a();
                lv2VarA.k("action", "ptard");
                lv2VarA.k("ptard", "l");
                lv2VarA.m();
            }
        } catch (RemoteException | NullPointerException e) {
            if (((Boolean) tw1.e.c.a(mz1.He)).booleanValue()) {
                hg4.C.h.d("Preconnect Local", e);
            }
        }
    }

    @Override // defpackage.hk1
    public int a() {
        return ((long[]) this.i).length;
    }

    public void a0() {
        if (((Boolean) tw1.e.c.a(mz1.I6)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            d93 d93Var = (d93) this.h;
            sb.append(d93Var.h);
            sb.append(" PoolCollection");
            b93 b93Var = (b93) this.i;
            sb.append("\n\tPool does not exist: " + b93Var.d + "\n\tNew pools created: " + b93Var.b + "\n\tPools removed: " + b93Var.c + "\n\tEntries added: " + b93Var.f + "\n\tNo entries retrieved: " + b93Var.e + "\n");
            int i = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.g).entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((f93) entry.getKey()).hashCode());
                sb.append("    ");
                int i2 = 0;
                while (true) {
                    z83 z83Var = (z83) entry.getValue();
                    z83Var.a();
                    if (i2 >= z83Var.a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i2++;
                }
                z83 z83Var2 = (z83) entry.getValue();
                z83Var2.a();
                for (int size = z83Var2.a.size(); size < d93Var.j; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                m93 m93Var = ((z83) entry.getValue()).d;
                sb.append("Created: " + m93Var.a + " Last accessed: " + m93Var.c + " Accesses: " + m93Var.d + "\nEntries retrieved: Valid: " + m93Var.e + " Stale: " + m93Var.f);
                sb.append("\n");
            }
            while (i < d93Var.i) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            gi2.U(sb.toString());
        }
    }

    @Override // defpackage.hk1
    public ArrayList b(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.g;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = (long[]) this.h;
            int i2 = i + i;
            if (jArr[i2] <= j2 && j2 < jArr[i2 + 1]) {
                pl1 pl1Var = (pl1) list.get(i);
                fi2 fi2Var = pl1Var.a;
                if (fi2Var.e == -3.4028235E38f) {
                    arrayList2.add(pl1Var);
                } else {
                    arrayList.add(fi2Var);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, bk.h);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            fi2 fi2Var2 = ((pl1) arrayList2.get(i3)).a;
            arrayList.add(new fi2(fi2Var2.a, fi2Var2.b, fi2Var2.c, fi2Var2.d, (-1) - i3, 1, fi2Var2.g, fi2Var2.h, fi2Var2.i, fi2Var2.l, fi2Var2.m, fi2Var2.j, fi2Var2.k, fi2Var2.n, fi2Var2.o, fi2Var2.p));
        }
        return arrayList;
    }

    public gq3 b0(fa2 fa2Var, oy2 oy2Var, oy2 oy2Var2, yp3 yp3Var) {
        pq3 pq3Var = (pq3) this.g;
        String str = fa2Var.i;
        lf4 lf4Var = hg4.C.c;
        return pu1.L(pu1.O(pu1.O(gq3.r(lf4.e(str) ? pu1.B(new my2(1)) : pu1.L(oy2Var.e(fa2Var), ExecutionException.class, fi1.h, pq3Var)), fi1.f, pq3Var), yp3Var, pq3Var), my2.class, new k62(this, oy2Var2, fa2Var, yp3Var, 4), pq3Var);
    }

    @Override // defpackage.hk1
    public long c(int i) {
        zt0.D(i >= 0);
        long[] jArr = (long[]) this.i;
        zt0.D(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.qq2
    public a83 d() {
        return (a83) this.h;
    }

    @Override // defpackage.i80
    public void e(String str, Object... objArr) {
        N(objArr);
    }

    @Override // defpackage.i80
    public void f(String str, Object obj, Object obj2) {
        M(obj, obj2);
    }

    @Override // defpackage.i80
    public void g(Instant instant) {
        L(new Object[]{instant});
    }

    @Override // defpackage.i80
    public String getName() {
        return (String) this.g;
    }

    @Override // defpackage.i80
    public boolean h() {
        return true;
    }

    @Override // defpackage.i80
    public void i(Integer num) {
        L(new Object[]{num});
    }

    @Override // defpackage.i80
    public void j(String str, Object obj, Object obj2) {
        M(obj, obj2);
    }

    @Override // defpackage.i80
    public void k(String str, Object... objArr) {
        N(objArr);
    }

    @Override // defpackage.i80
    public void l(String str) {
        L(null);
    }

    @Override // defpackage.i80
    public void m(Object obj, String str) {
        L(new Object[]{obj});
    }

    @Override // defpackage.i80
    public void n(String str, Object... objArr) {
        N(objArr);
    }

    @Override // defpackage.i80
    public void o(Object obj, String str) {
        L(new Object[]{obj});
    }

    @Override // defpackage.i80
    public void p(String str, Exception exc) {
        L(null);
    }

    @Override // defpackage.qq2
    public void q(boolean z, Context context, an2 an2Var) {
        try {
            y24 y24Var = hg4.C.b;
            y24.b(context, (AdOverlayInfoParcel) ((pd2) this.g).f.get(), true, (mv2) ((t03) this.i).f);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.i80
    public void r(String str) {
        L(null);
    }

    @Override // defpackage.i80
    public boolean s() {
        return true;
    }

    @Override // defpackage.i80
    public void t(IOException iOException) {
        L(null);
    }

    public String toString() {
        switch (this.f) {
            case 4:
                return ((ue) this.h).toString() + ", hidden list:" + ((ArrayList) this.i).size();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.i80
    public void u(IOException iOException) {
        L(null);
    }

    @Override // defpackage.ug2
    public void v(String str, int i, String str2, boolean z) {
        mt2 mt2Var = (mt2) this.g;
        ag2 ag2Var = (ag2) this.h;
        yw1 yw1Var = (yw1) this.i;
        if (z) {
            ih3 ih3Var = mt2Var.a.a;
            if (ih3Var != null && ag2Var.f() != null) {
                ag2Var.f().C3(ih3Var);
            }
            yw1Var.d();
            return;
        }
        mt2Var.getClass();
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        yw1Var.b(new r13(ex0.k(sb, ", Failing URL: ", str2), 1));
    }

    public void w(View view, int i, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((z71) this.g).g;
        int childCount = i < 0 ? recyclerView.getChildCount() : E(i);
        ((ue) this.h).r(childCount, z);
        if (z) {
            I(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void x(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((z71) this.g).g;
        int childCount = i < 0 ? recyclerView.getChildCount() : E(i);
        ((ue) this.h).r(childCount, z);
        if (z) {
            I(view);
        }
        wo0 wo0VarI = RecyclerView.I(view);
        if (wo0VarI != null) {
            if (!wo0VarI.j() && !wo0VarI.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + wo0VarI + recyclerView.y());
            }
            wo0VarI.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void y(int i) {
        wo0 wo0VarI;
        int iE = E(i);
        ((ue) this.h).C(iE);
        RecyclerView recyclerView = (RecyclerView) ((z71) this.g).g;
        View childAt = recyclerView.getChildAt(iE);
        if (childAt != null && (wo0VarI = RecyclerView.I(childAt)) != null) {
            if (wo0VarI.j() && !wo0VarI.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + wo0VarI + recyclerView.y());
            }
            wo0VarI.a(256);
        }
        recyclerView.detachViewFromParent(iE);
    }

    public void z(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet = (HashSet) this.i;
        String string = ((Context) this.g).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (t20.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    A((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new rg(e);
            }
        }
    }

    public t83(Context context, e51 e51Var, cx1 cx1Var, wt2 wt2Var) {
        this.f = 24;
        this.g = context;
        this.i = e51Var;
        this.h = cx1Var;
    }

    @Override // defpackage.rd2, defpackage.y23
    /* renamed from: a */
    public void mo8a() {
        ea3 ea3Var;
        gi2.G("loadNewJavascriptEngine (failure): Trying to acquire lock");
        mm2 mm2Var = (mm2) this.i;
        synchronized (mm2Var.b) {
            try {
                gi2.G("loadNewJavascriptEngine (failure): Lock acquired");
                mm2Var.g = 1;
                gi2.G("Failed loading new engine. Marking new engine destroyable.");
                ((b62) this.g).y();
                if (((Boolean) n02.d.w()).booleanValue() && (ea3Var = (ea3) mm2Var.e) != null) {
                    aa3 aa3Var = (aa3) this.h;
                    aa3Var.m("Failed loading new engine");
                    aa3Var.b(false);
                    ea3Var.b(aa3Var.n());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gi2.G("loadNewJavascriptEngine (failure): Lock released");
    }

    public t83(Context context, pq3 pq3Var, pq3 pq3Var2, z94 z94Var, e51 e51Var, sq0 sq0Var, mv2 mv2Var) {
        this.f = 23;
        this.g = z94Var;
        this.h = e51Var;
        this.i = mv2Var;
    }

    public /* synthetic */ t83(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj2;
        this.h = obj3;
        this.i = obj;
    }

    public /* synthetic */ t83(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public t83(c72 c72Var, b72 b72Var, e72 e72Var) {
        this.f = 20;
        this.h = c72Var;
        this.i = b72Var;
        this.g = e72Var;
    }

    public t83(rx2 rx2Var, rx2 rx2Var2) {
        this.f = 16;
        this.g = rx2Var;
        this.h = rx2Var2;
    }

    public /* synthetic */ t83(xb4 xb4Var) {
        this.f = 14;
        this.g = (String) xb4Var.g;
        this.h = (String) xb4Var.h;
        this.i = (ad2) xb4Var.i;
    }

    public t83(int i) {
        this.f = i;
        switch (i) {
            case 10:
                List list = Collections.EMPTY_LIST;
                this.g = list;
                this.h = list;
                break;
            case 15:
                this.g = new ArrayList();
                this.h = new ArrayList();
                this.i = new ArrayList();
                break;
            case 29:
                this.h = new ArrayDeque();
                this.i = null;
                this.g = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            default:
                String str = v23.a;
                this.g = new ia1(3, Executors.newSingleThreadExecutor(new uj2(1, "ExoPlayer:Loader:ProgressiveMediaPeriod")));
                break;
        }
    }

    public t83(Context context, e51 e51Var) {
        this.f = 5;
        this.g = context;
        this.h = context.getPackageName();
        this.i = e51Var.f;
    }

    public t83(Context context, Executor executor, yq1 yq1Var, vg0 vg0Var) {
        this.f = 13;
        this.h = vg0Var;
        this.i = yq1Var;
        this.g = pu1.D(new gs1(this, context, 0), executor);
    }

    public t83(Context context, nm2 nm2Var) {
        this.f = 0;
        this.i = new AtomicReference();
        this.g = context;
        this.h = nm2Var;
    }

    public t83(ArrayList arrayList) {
        this.f = 11;
        this.g = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.h = new long[size + size];
        for (int i = 0; i < arrayList.size(); i++) {
            pl1 pl1Var = (pl1) arrayList.get(i);
            long[] jArr = (long[]) this.h;
            int i2 = i + i;
            jArr[i2] = pl1Var.b;
            jArr[i2 + 1] = pl1Var.c;
        }
        long[] jArr2 = (long[]) this.h;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.i = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public t83(List list) {
        this.f = 12;
        this.g = list;
        this.h = new jg1[list.size()];
        this.i = new fw3(new kf3(12, this));
    }

    public t83(yr2 yr2Var, mv2 mv2Var) {
        this.f = 27;
        this.g = yr2Var;
        s23 s23Var = new s23(mv2Var);
        this.h = s23Var;
        this.i = new x23(s23Var, yr2Var.e);
    }

    public t83(d93 d93Var) {
        this.f = 28;
        this.g = new ConcurrentHashMap(d93Var.j);
        this.h = d93Var;
        this.i = new b93();
    }

    public t83(WorkDatabase_Impl workDatabase_Impl) {
        this.f = 8;
        this.g = workDatabase_Impl;
        this.h = new io(workDatabase_Impl, 2);
        this.i = new tz0(workDatabase_Impl, 0);
    }

    public t83(z71 z71Var) {
        this.f = 4;
        this.g = z71Var;
        this.h = new ue(0);
        this.i = new ArrayList();
    }

    public t83(nb0 nb0Var, View view) {
        Object ob0Var;
        this.f = 7;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ob0Var = new qb0();
        } else {
            ob0Var = i >= 33 ? new ob0() : null;
        }
        this.g = ob0Var;
        this.h = nb0Var;
        this.i = view;
    }

    public t83(Context context, LocationManager locationManager) {
        this.f = 9;
        this.i = new g31();
        this.g = context;
        this.h = locationManager;
    }

    public t83(Context context) {
        this.f = 1;
        this.g = context.getApplicationContext();
        this.i = new HashSet();
        this.h = new HashMap();
    }

    public t83(qi qiVar) {
        this.f = 3;
        this.g = new ArrayList();
        this.h = new ra();
        this.i = qiVar;
    }
}
