package wd;

import ac.m;
import ah.o;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import bl.v;
import ck.i;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.google.android.gms.internal.ads.s9;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.mode.User;
import d0.a1;
import f7.j;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import je.q;
import nk.k;
import p7.p;
import r3.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static i7.b f36607a;

    public b() {
        new ConcurrentHashMap();
    }

    public static boolean A(byte b10) {
        return b10 > -65;
    }

    public static void B(Exception exc) {
        f36607a.getClass();
        f fVarB = f.b();
        fVarB.a();
        fe.c cVar = (fe.c) fVarB.f36617d.a(fe.c.class);
        if (cVar == null) {
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        }
        q qVar = cVar.f24018a;
        Map map = Collections.EMPTY_MAP;
        qVar.f27603o.f28258a.a(new aj.d(qVar, exc));
    }

    public static ck.h C(ck.f fVar, ck.g gVar) {
        k.e(gVar, "key");
        return k.a(fVar.getKey(), gVar) ? i.f2898a : fVar;
    }

    public static l7.a I(q7.b bVar, j jVar) {
        return new l7.a(0, p.a(bVar, jVar, 1.0f, p7.f.f31408b, false));
    }

    public static l7.b J(q7.a aVar, j jVar, boolean z3) {
        return new l7.b(6, p.a(aVar, jVar, z3 ? r7.j.c() : 1.0f, p7.f.f31409c, false));
    }

    public static l7.a K(q7.b bVar, j jVar, int i4) {
        s9 s9Var = new s9(9);
        s9Var.f15910b = i4;
        ArrayList arrayListA = p.a(bVar, jVar, 1.0f, s9Var, false);
        for (int i10 = 0; i10 < arrayListA.size(); i10++) {
            s7.a aVar = (s7.a) arrayListA.get(i10);
            m7.c cVar = (m7.c) aVar.f33484b;
            m7.c cVar2 = (m7.c) aVar.f33485c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f28882a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f28882a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f10 = Float.NaN;
                    int i11 = 0;
                    for (int i12 = 0; i12 < length2; i12++) {
                        float f11 = fArr3[i12];
                        if (f11 != f10) {
                            fArr3[i11] = f11;
                            i11++;
                            f10 = fArr3[i12];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i11);
                    aVar = new s7.a(cVar.b(fArrCopyOfRange), cVar2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i10, aVar);
        }
        return new l7.a(1, arrayListA);
    }

    public static l7.a L(q7.a aVar, j jVar) {
        return new l7.a(2, p.a(aVar, jVar, 1.0f, p7.f.f31410d, false));
    }

    public static l7.a M(q7.b bVar, j jVar) {
        return new l7.a(3, p.a(bVar, jVar, r7.j.c(), p7.f.f31412f, true));
    }

    public static void N(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = (Animator) arrayList.get(i4);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static ck.h O(ck.f fVar, ck.h hVar) {
        k.e(hVar, "context");
        return hVar == i.f2898a ? fVar : (ck.h) hVar.G(fVar, new v(2));
    }

    public static void S(PAGRequest pAGRequest, String str, bb.d dVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = dVar.f2114f;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Map<String, Object> extraInfo = pAGRequest.getExtraInfo();
        if (extraInfo == null) {
            extraInfo = new HashMap<>();
        }
        extraInfo.put("admob_watermark", str2);
        pAGRequest.setExtraInfo(extraInfo);
    }

    public static void a(Throwable th2, Throwable th3) {
        k.e(th2, "<this>");
        k.e(th3, "exception");
        if (th2 != th3) {
            Integer num = hk.a.f25159a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(th3);
                return;
            }
            Method method = gk.a.f24754a;
            if (method != null) {
                method.invoke(th2, th3);
            }
        }
    }

    public static fh.a b() {
        o oVar = o.f400d;
        String string = oVar.f402b.getString("key_huawei_order_token", null);
        bh.c cVar = bh.c.f2188a;
        if (!bh.c.c()) {
            return oVar.c() ? (string == null || vk.i.H0(string)) ? new fh.a(DeviceInfoApp.f21145f.getString(R.string.activated_pro_but_unknown_source), null, 62) : new fh.a(DeviceInfoApp.f21145f.getString(R.string.recommend_huawei_pro_bind_to_account), string, 24) : new fh.a(null, null, 63);
        }
        User userB = bh.c.b();
        k.b(userB);
        return userB.getVip().getAvailable() ? new fh.a(null, null, 63) : oVar.c() ? (string == null || vk.i.H0(string)) ? new fh.a(DeviceInfoApp.f21145f.getString(R.string.activated_pro_but_unknown_source), null, 62) : new fh.a(DeviceInfoApp.f21145f.getString(R.string.recommend_huawei_pro_bind_to_account_logged), string, 22) : new fh.a(null, null, 63);
    }

    public static int c(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new y(context).a() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static final void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static final void e(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            d(closeable);
        }
    }

    public static final long o(a1 a1Var, int i4) {
        k.e(a1Var, "orientation");
        int iOrdinal = a1Var.ordinal();
        if (iOrdinal == 0) {
            return ii.a.a(0, i4);
        }
        if (iOrdinal == 1) {
            return ii.a.a(i4, 0);
        }
        throw new m();
    }

    public static ck.f p(ck.f fVar, ck.g gVar) {
        k.e(gVar, "key");
        if (k.a(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static final float q(long j, a1 a1Var) {
        k.e(a1Var, "orientation");
        int iOrdinal = a1Var.ordinal();
        if (iOrdinal == 0) {
            return o1.b.e(j);
        }
        if (iOrdinal == 1) {
            return o1.b.d(j);
        }
        throw new m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r5.f35088c == r9.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList r(int r8, android.content.Context r9) {
        /*
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.Resources$Theme r9 = r9.getTheme()
            u3.i r1 = new u3.i
            r1.<init>(r0, r9)
            java.lang.Object r2 = u3.k.f35093c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = u3.k.f35092b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L4f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L4f
            java.lang.Object r5 = r3.get(r8)     // Catch: java.lang.Throwable -> L3c
            u3.h r5 = (u3.h) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L4f
            android.content.res.Configuration r6 = r5.f35087b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4c
            if (r9 != 0) goto L3e
            int r6 = r5.f35088c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L48
            goto L3e
        L3c:
            r8 = move-exception
            goto L91
        L3e:
            if (r9 == 0) goto L4c
            int r6 = r5.f35088c     // Catch: java.lang.Throwable -> L3c
            int r7 = r9.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4c
        L48:
            android.content.res.ColorStateList r3 = r5.f35086a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L4c:
            r3.remove(r8)     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L51:
            if (r3 == 0) goto L54
            return r3
        L54:
            java.lang.ThreadLocal r2 = u3.k.f35091a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L66
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L66:
            r2 = 1
            r0.getValue(r8, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L75
            r3 = 31
            if (r2 > r3) goto L75
            goto L86
        L75:
            android.content.res.XmlResourceParser r2 = r0.getXml(r8)
            android.content.res.ColorStateList r4 = u3.c.a(r0, r2, r9)     // Catch: java.lang.Exception -> L7e
            goto L86
        L7e:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L86:
            if (r4 == 0) goto L8c
            u3.k.a(r1, r8, r4, r9)
            goto L90
        L8c:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r8, r9)
        L90:
            return r4
        L91:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.b.r(int, android.content.Context):android.content.res.ColorStateList");
    }

    public static final Object t(t4.b bVar, t4.d dVar, Serializable serializable) {
        k.e(bVar, "<this>");
        k.e(dVar, "key");
        Object objCopyOf = bVar.f34165a.get(dVar);
        if (objCopyOf instanceof byte[]) {
            byte[] bArr = (byte[]) objCopyOf;
            objCopyOf = Arrays.copyOf(bArr, bArr.length);
            k.d(objCopyOf, "copyOf(this, size)");
        }
        return objCopyOf == null ? serializable : objCopyOf;
    }

    public abstract void D();

    public abstract boolean F(int i4, KeyEvent keyEvent);

    public boolean G(KeyEvent keyEvent) {
        return false;
    }

    public boolean H() {
        return false;
    }

    public abstract void P(boolean z3);

    public abstract void Q(boolean z3);

    public abstract void R(boolean z3);

    public abstract void T(CharSequence charSequence);

    public n.a U(yb.i iVar) {
        return null;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract Typeface h(Context context, u3.e eVar, Resources resources, int i4);

    public abstract Typeface i(Context context, b4.k[] kVarArr, int i4);

    public Typeface j(Context context, List list, int i4) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface k(Context context, InputStream inputStream) {
        File fileO = a.a.o(context);
        if (fileO == null) {
            return null;
        }
        try {
            if (a.a.e(fileO, inputStream)) {
                return Typeface.createFromFile(fileO.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileO.delete();
        }
    }

    public Typeface l(Context context, Resources resources, int i4, String str, int i10) {
        File fileO = a.a.o(context);
        if (fileO == null) {
            return null;
        }
        try {
            if (a.a.d(fileO, resources, i4)) {
                return Typeface.createFromFile(fileO.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileO.delete();
        }
    }

    public abstract void m(boolean z3);

    public b4.k n(b4.k[] kVarArr, int i4) {
        int i10 = (i4 & 1) == 0 ? 400 : 700;
        boolean z3 = (i4 & 2) != 0;
        b4.k kVar = null;
        int i11 = Integer.MAX_VALUE;
        for (b4.k kVar2 : kVarArr) {
            int iAbs = (Math.abs(kVar2.f1696c - i10) * 2) + (kVar2.f1697d == z3 ? 0 : 1);
            if (kVar == null || i11 > iAbs) {
                kVar = kVar2;
                i11 = iAbs;
            }
        }
        return kVar;
    }

    public abstract int s();

    public abstract int u(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract Context v();

    public abstract int w();

    public abstract ViewPropertyAnimator x(int i4, View view);

    public abstract void y();

    public boolean z() {
        return false;
    }

    public void E() {
    }
}
