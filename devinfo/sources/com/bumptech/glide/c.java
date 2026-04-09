package com.bumptech.glide;

import a0.x0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import je.u;
import rl.c0;
import rl.y;
import rl.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c {
    public static boolean A(com.google.android.gms.internal.measurement.n nVar, com.google.android.gms.internal.measurement.n nVar2) {
        if (!nVar.getClass().equals(nVar2.getClass())) {
            return false;
        }
        if ((nVar instanceof r) || (nVar instanceof com.google.android.gms.internal.measurement.l)) {
            return true;
        }
        if (!(nVar instanceof com.google.android.gms.internal.measurement.g)) {
            return nVar instanceof q ? nVar.zzc().equals(nVar2.zzc()) : nVar instanceof com.google.android.gms.internal.measurement.e ? nVar.c().equals(nVar2.c()) : nVar == nVar2;
        }
        if (Double.isNaN(nVar.f().doubleValue()) || Double.isNaN(nVar2.f().doubleValue())) {
            return false;
        }
        return nVar.f().equals(nVar2.f());
    }

    public static int B(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) (((d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static double C(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return (d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10));
    }

    public static Object D(com.google.android.gms.internal.measurement.n nVar) {
        if (com.google.android.gms.internal.measurement.n.K8.equals(nVar)) {
            return null;
        }
        if (com.google.android.gms.internal.measurement.n.J8.equals(nVar)) {
            return "";
        }
        if (nVar instanceof com.google.android.gms.internal.measurement.k) {
            return E((com.google.android.gms.internal.measurement.k) nVar);
        }
        if (!(nVar instanceof com.google.android.gms.internal.measurement.d)) {
            return !nVar.f().isNaN() ? nVar.f() : nVar.zzc();
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.gms.internal.measurement.d dVar = (com.google.android.gms.internal.measurement.d) nVar;
        int i4 = 0;
        while (i4 < dVar.m()) {
            if (i4 >= dVar.m()) {
                throw new NoSuchElementException(d.h.q(i4, "Out of bounds index: ", new StringBuilder(String.valueOf(i4).length() + 21)));
            }
            int i10 = i4 + 1;
            Object objD = D(dVar.o(i4));
            if (objD != null) {
                arrayList.add(objD);
            }
            i4 = i10;
        }
        return arrayList;
    }

    public static HashMap E(com.google.android.gms.internal.measurement.k kVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(kVar.f19793a.keySet());
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            String str = (String) obj;
            Object objD = D(kVar.g(str));
            if (objD != null) {
                map.put(str, objD);
            }
        }
        return map;
    }

    public static void F(x0 x0Var) {
        int iB = B(x0Var.X("runtime.counter").f().doubleValue() + 1.0d);
        if (iB > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        x0Var.V("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(iB)));
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b7 A[Catch: RejectedExecutionException -> 0x019b, TryCatch #0 {RejectedExecutionException -> 0x019b, blocks: (B:107:0x0194, B:115:0x01a5, B:117:0x01b7, B:123:0x01c4, B:125:0x01d5, B:129:0x01df, B:119:0x01bd, B:111:0x019e), top: B:154:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bd A[Catch: RejectedExecutionException -> 0x019b, TryCatch #0 {RejectedExecutionException -> 0x019b, blocks: (B:107:0x0194, B:115:0x01a5, B:117:0x01b7, B:123:0x01c4, B:125:0x01d5, B:129:0x01df, B:119:0x01bd, B:111:0x019e), top: B:154:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d5 A[Catch: RejectedExecutionException -> 0x019b, TryCatch #0 {RejectedExecutionException -> 0x019b, blocks: (B:107:0x0194, B:115:0x01a5, B:117:0x01b7, B:123:0x01c4, B:125:0x01d5, B:129:0x01df, B:119:0x01bd, B:111:0x019e), top: B:154:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01df A[Catch: RejectedExecutionException -> 0x019b, TRY_LEAVE, TryCatch #0 {RejectedExecutionException -> 0x019b, blocks: (B:107:0x0194, B:115:0x01a5, B:117:0x01b7, B:123:0x01c4, B:125:0x01d5, B:129:0x01df, B:119:0x01bd, B:111:0x019e), top: B:154:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.lang.String r18, final i1.n r19, final s2.h0 r20, final int r21, final boolean r22, final int r23, final int r24, u0.p r25, final int r26) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.a(java.lang.String, i1.n, s2.h0, int, boolean, int, int, u0.p, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0361  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(i1.n r38, i0.u r39, g0.a0 r40, d0.k r41, boolean r42, c0.j r43, i1.c r44, g0.d r45, mk.c r46, u0.p r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.b(i1.n, i0.u, g0.a0, d0.k, boolean, c0.j, i1.c, g0.d, mk.c, u0.p, int, int):void");
    }

    public static final Object[] c(Object[] objArr, int i4, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        zj.m.R(0, i4, 6, objArr, objArr2);
        zj.m.N(i4 + 2, i4, objArr.length, objArr, objArr2);
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] d(Object[] objArr, int i4) {
        Object[] objArr2 = new Object[objArr.length - 2];
        zj.m.R(0, i4, 6, objArr, objArr2);
        zj.m.N(i4, i4 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] e(Object[] objArr, int i4) {
        Object[] objArr2 = new Object[objArr.length - 1];
        zj.m.R(0, i4, 6, objArr, objArr2);
        zj.m.N(i4, i4 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void f(int i4, int i10) {
        if (i4 < 0 || i4 >= i10) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, i10, "index: ", ", size: "));
        }
    }

    public static final void g(int i4, int i10) {
        if (i4 < 0 || i4 > i10) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, i10, "index: ", ", size: "));
        }
    }

    public static final void h(int i4, int i10, int i11) {
        if (i4 < 0 || i10 > i11) {
            StringBuilder sbN = r5.c.n(i4, "fromIndex: ", ", toIndex: ", i10, ", size: ");
            sbN.append(i11);
            throw new IndexOutOfBoundsException(sbN.toString());
        }
        if (i4 > i10) {
            throw new IllegalArgumentException(a0.g.i(i4, i10, "fromIndex: ", " > toIndex: "));
        }
    }

    public static void i(Cursor cursor) {
        if (cursor != null) {
            try {
                r5.c.s(cursor);
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void j(XmlResourceParser xmlResourceParser) {
        if (xmlResourceParser != null) {
            try {
                xmlResourceParser.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static String k(String str, String str2, Resources resources) throws NumberFormatException {
        String resourceEntryName;
        if (str2.startsWith("@")) {
            try {
                int i4 = Integer.parseInt(str2.substring(1));
                int iHashCode = str.hashCode();
                if (iHashCode != -341064690) {
                    if (iHashCode == 110327241 && str.equals("theme")) {
                    }
                } else {
                    resourceEntryName = str.equals("resource") ? resources.getResourceEntryName(i4) : resources.getString(i4);
                }
                return TextUtils.htmlEncode(resourceEntryName);
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public static void l(vd.b bVar) {
        boolean z3 = false;
        if (!bVar.isDone()) {
            throw new IllegalStateException(wb.e.G("Future was expected to be done: %s", bVar));
        }
        while (true) {
            try {
                bVar.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th2) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    public static gg.b m() {
        return (gg.b) gg.b.g.getValue();
    }

    public static final il.a n(il.a aVar) {
        nk.k.e(aVar, "<this>");
        return aVar.d().c() ? aVar : new ml.j(aVar);
    }

    public static Object o(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a4.c.a(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (f.a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final int p(int i4, int i10) {
        return (i4 >> i10) & 31;
    }

    public static long q(Context context, Uri uri, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    i(cursorQuery);
                    return 0L;
                }
                long j = cursorQuery.getLong(0);
                i(cursorQuery);
                return j;
            } catch (Exception e2) {
                Log.w("DocumentFile", "Failed query: " + e2);
                i(cursorQuery);
                return 0L;
            }
        } catch (Throwable th2) {
            i(cursorQuery);
            throw th2;
        }
    }

    public static String r(Context context, Uri uri, String str) throws Throwable {
        Cursor cursorQuery;
        Throwable th2;
        Exception exc;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
        } catch (Exception e2) {
            exc = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            cursorQuery = null;
            th2 = th3;
            i(cursorQuery);
            throw th2;
        }
        try {
            try {
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    i(cursorQuery);
                    return null;
                }
                String string = cursorQuery.getString(0);
                i(cursorQuery);
                return string;
            } catch (Throwable th4) {
                th2 = th4;
                i(cursorQuery);
                throw th2;
            }
        } catch (Exception e10) {
            exc = e10;
            Log.w("DocumentFile", "Failed query: " + exc);
            i(cursorQuery);
            return null;
        }
    }

    public static final void s(View view) {
        nk.k.e(view, "<this>");
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static final z t(z zVar) {
        nk.k.e(zVar, "<this>");
        y yVarC = zVar.c();
        c0 c0Var = zVar.g;
        yVarC.g = new sl.d(c0Var.g(), c0Var.e());
        return yVarC.a();
    }

    public static final String u(float f10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        if (Float.isInfinite(f10)) {
            return f10 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f11 = f10 * fPow;
        int i4 = (int) f11;
        if (f11 - i4 >= 0.5f) {
            i4++;
        }
        float f12 = i4 / fPow;
        return iMax > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }

    public static void v(int i4, List list, String str) {
        if (list.size() == i4) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i4 + " parameters found " + list.size());
    }

    public static void w(int i4, List list, String str) {
        if (list.size() >= i4) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i4 + " parameters found " + list.size());
    }

    public static void x(String str, int i4, ArrayList arrayList) {
        if (arrayList.size() <= i4) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i4 + " parameters found " + arrayList.size());
    }

    public static boolean y(com.google.android.gms.internal.measurement.n nVar) {
        if (nVar == null) {
            return false;
        }
        Double dF = nVar.f();
        return !dF.isNaN() && dF.doubleValue() >= 0.0d && dF.equals(Double.valueOf(Math.floor(dF.doubleValue())));
    }

    public static w z(String str) throws NumberFormatException {
        w wVar = null;
        if (str != null && !str.isEmpty()) {
            wVar = (w) w.f20001l0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalArgumentException(u.t("Unsupported commandId ", str));
    }
}
