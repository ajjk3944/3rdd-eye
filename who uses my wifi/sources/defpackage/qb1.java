package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.util.TypedValue;
import android.view.View;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qb1 implements of1 {
    public static final Object[] g = new Object[0];
    public static final pz h = new pz(27);
    public static final int[] i = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] j = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] k = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] l = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] m = {5, 8, 10, 12};
    public static final int[] n = {6, 9, 12, 15};
    public static final int[] o = {2, 4, 6, 8};
    public static final int[] p = {9, 11, 13, 16};
    public static final int[] q = {5, 8, 10, 12};
    public static final rv1 r = new rv1(15);
    public static final zq2 s = new zq2(14);
    public static final p63 t = new p63(4);
    public static final p63 u = new p63(19);
    public static final /* synthetic */ int v = 0;
    public final /* synthetic */ int f;

    public /* synthetic */ qb1(int i2) {
        this.f = i2;
    }

    public static long[] A(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        int i2 = (int) length;
        zt0.V(length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i2];
        int i3 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i3, length2);
            i3 += length2;
        }
        return jArr3;
    }

    public static void B(int i2, long j2, String str, int i3, PriorityQueue priorityQueue) {
        dw1 dw1Var = new dw1(i3, j2, str);
        if ((priorityQueue.size() != i2 || (((dw1) priorityQueue.peek()).c <= i3 && ((dw1) priorityQueue.peek()).a <= j2)) && !priorityQueue.contains(dw1Var)) {
            priorityQueue.add(dw1Var);
            if (priorityQueue.size() > i2) {
                priorityQueue.poll();
            }
        }
    }

    public static void C(n70 n70Var, aa3 aa3Var) {
        if (((Boolean) n02.c.w()).booleanValue()) {
            gq3 gq3VarR = gq3.r(n70Var);
            kf3 kf3Var = new kf3(26, aa3Var);
            gq3VarR.c(new jq3(gq3VarR, kf3Var, 0), md2.g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int D(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4e
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r3]
        L1f:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r1 = r1 | r2
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5c
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 8
            r7 = r7[r2]
        L35:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r0 = r0 | r1
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5c
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 9
            r7 = r7[r2]
            goto L35
        L4e:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r4]
            goto L1f
        L5c:
            if (r0 == 0) goto L62
            int r7 = r7 * 16
            int r7 = r7 / 14
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb1.D(byte[]):int");
    }

    public static String E(String[] strArr, int i2, int i3) {
        int i4 = i3 + i2;
        if (strArr.length < i4) {
            gi2.Z("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i4 - 1;
            if (i2 >= i5) {
                sb.append(strArr[i5]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            sb.append(' ');
            i2++;
        }
    }

    public static LinkedHashMap F(int i2) {
        return new LinkedHashMap(i2 < 3 ? i2 + 1 : i2 < 1073741824 ? (int) ((i2 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static void G(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? I("start index", i2, i4) : (i3 < 0 || i3 > i4) ? I("end index", i3, i4) : i41.H("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static long H(int i2, long j2) {
        if (i2 == 1) {
            return j2;
        }
        int i3 = i2 >> 1;
        long j3 = (j2 * j2) % 1073807359;
        return (i2 & 1) == 0 ? H(i3, j3) % 1073807359 : ((H(i3, j3) % 1073807359) * j2) % 1073807359;
    }

    public static String I(String str, int i2, int i3) {
        if (i2 < 0) {
            return i41.H("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return i41.H("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(ex0.f("negative size: ", i3));
    }

    public static String J(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(L(objArr[i2]));
            i3 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i2 < length) {
            String str2 = " [";
            while (i2 < objArr.length) {
                sb.append(str2);
                sb.append(L(objArr[i2]));
                i2++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static long K(int i2, String[] strArr) {
        long jZ = (zt0.z(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            jZ = (((zt0.z(strArr[i3]) + 2147483647L) % 1073807359) + ((jZ * 16785407) % 1073807359)) % 1073807359;
        }
        return jZ;
    }

    public static String L(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strL = ex0.l(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strL), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strL.length() + 8 + name2.length() + 1);
            ex0.q(sb, "<", strL, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static int M(int i2) {
        if (i2 == 20) {
            return 63750;
        }
        if (i2 == 30) {
            return 2250000;
        }
        switch (i2) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i2) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static int N(l83 l83Var) {
        int iD = a30.D(l83Var) - 1;
        return (iD == 0 || iD == 1) ? 7 : 23;
    }

    public static int O(lg1 lg1Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && lg1Var.q(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return lg1Var.r(iArr[i2]) + i4;
    }

    public static void P(n70 n70Var, da3 da3Var, aa3 aa3Var, boolean z) {
        if (((Boolean) n02.c.w()).booleanValue()) {
            gq3 gq3VarR = gq3.r(n70Var);
            wy0 wy0Var = new wy0();
            wy0Var.g = da3Var;
            wy0Var.h = aa3Var;
            wy0Var.f = z;
            gq3VarR.c(new jq3(gq3VarR, wy0Var, 0), md2.g);
        }
    }

    public static lg1 Q(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new lg1(bArr.length, bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b3 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b3;
            }
        }
        int length = bArrCopyOf.length;
        lg1 lg1Var = new lg1(length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            lg1 lg1Var2 = new lg1(length, bArrCopyOf);
            while (lg1Var2.f() >= 16) {
                lg1Var2.o(2);
                int iR = lg1Var2.r(14);
                int iMin = Math.min(8 - lg1Var.c, 14);
                int i4 = lg1Var.c;
                int i5 = (8 - i4) - iMin;
                byte[] bArr2 = lg1Var.a;
                int i6 = lg1Var.b;
                byte b4 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr2[i6]);
                bArr2[i6] = b4;
                int i7 = 14 - iMin;
                int i8 = iR & 16383;
                bArr2[i6] = (byte) (b4 | ((i8 >>> i7) << i5));
                int i9 = i6 + 1;
                while (i7 > 8) {
                    i7 -= 8;
                    lg1Var.a[i9] = (byte) (i8 >>> i7);
                    i9++;
                }
                byte[] bArr3 = lg1Var.a;
                byte b5 = (byte) (bArr3[i9] & ((1 << r7) - 1));
                bArr3[i9] = b5;
                bArr3[i9] = (byte) (((i8 & ((1 << i7) - 1)) << (8 - i7)) | b5);
                lg1Var.o(14);
                lg1Var.y();
            }
        }
        int length2 = bArrCopyOf.length;
        lg1Var.a = bArrCopyOf;
        lg1Var.b = 0;
        lg1Var.c = 0;
        lg1Var.d = length2;
        return lg1Var;
    }

    public static void b(int i2, Object obj) {
        if (obj == null || k(i2, obj)) {
            return;
        }
        r(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static void e(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new l30("Invalid DNS TTL: " + j2);
        }
    }

    public static int f(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strD = e8.d(str);
            if (strD != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerC = f8.c(context);
                    iC = f8.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                    if (iC == 0) {
                        iC = f8.a(appOpsManagerC, strD, iMyUid, f8.b(context));
                    }
                } else {
                    iC = e8.c((AppOpsManager) e8.a(context, AppOpsManager.class), strD, packageName);
                }
                if (iC != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static int g(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void h(View view, d71 d71Var) {
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        e71 e71Var = new e71();
        e71Var.a = paddingStart;
        e71Var.b = paddingTop;
        e71Var.c = paddingEnd;
        e71Var.d = paddingBottom;
        l92 l92Var = new l92(d71Var, e71Var);
        WeakHashMap weakHashMap = e61.a;
        t51.u(view, l92Var);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new b71());
        }
    }

    public static l81 i(pi piVar, int i2, ArrayList arrayList, l81 l81Var) {
        int i3;
        int i4 = i2 == 0 ? piVar.n0 : piVar.o0;
        if (i4 != -1 && (l81Var == null || i4 != l81Var.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                l81 l81Var2 = (l81) arrayList.get(i5);
                if (l81Var2.b == i4) {
                    if (l81Var != null) {
                        l81Var.c(i2, l81Var2);
                        arrayList.remove(l81Var);
                    }
                    l81Var = l81Var2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return l81Var;
        }
        if (l81Var == null) {
            if (piVar instanceof s00) {
                s00 s00Var = (s00) piVar;
                int i6 = 0;
                while (true) {
                    if (i6 >= s00Var.r0) {
                        i3 = -1;
                        break;
                    }
                    pi piVar2 = s00Var.q0[i6];
                    if ((i2 == 0 && (i3 = piVar2.n0) != -1) || (i2 == 1 && (i3 = piVar2.o0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        l81 l81Var3 = (l81) arrayList.get(i7);
                        if (l81Var3.b == i3) {
                            l81Var = l81Var3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (l81Var == null) {
                l81Var = new l81();
                l81Var.a = new ArrayList();
                l81Var.d = null;
                l81Var.e = -1;
                int i8 = l81.f;
                l81.f = i8 + 1;
                l81Var.b = i8;
                l81Var.c = i2;
            }
            arrayList.add(l81Var);
        }
        int i9 = l81Var.b;
        ArrayList arrayList2 = l81Var.a;
        if (arrayList2.contains(piVar)) {
            return l81Var;
        }
        arrayList2.add(piVar);
        if (piVar instanceof b00) {
            b00 b00Var = (b00) piVar;
            b00Var.t0.c(b00Var.u0 == 0 ? 1 : 0, l81Var, arrayList);
        }
        if (i2 == 0) {
            piVar.n0 = i9;
            piVar.I.c(i2, l81Var, arrayList);
            piVar.K.c(i2, l81Var, arrayList);
        } else {
            piVar.o0 = i9;
            piVar.J.c(i2, l81Var, arrayList);
            piVar.M.c(i2, l81Var, arrayList);
            piVar.L.c(i2, l81Var, arrayList);
        }
        piVar.P.c(i2, l81Var, arrayList);
        return l81Var;
    }

    public static ColorStateList j(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !r0.u(drawable)) {
            return null;
        }
        return r0.f(drawable).getColorStateList();
    }

    public static boolean k(int i2, Object obj) {
        if (obj instanceof py) {
            if ((obj instanceof qy ? ((qy) obj).b() : obj instanceof rx ? 0 : obj instanceof dy ? 1 : obj instanceof hy ? 2 : obj instanceof iy ? 3 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static void l(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static PorterDuff.Mode m(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static TypedValue n(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean o(Context context, int i2, boolean z) {
        TypedValue typedValueN = n(context, i2);
        return (typedValueN == null || typedValueN.type != 18) ? z : typedValueN.data != 0;
    }

    public static TypedValue p(int i2, Context context, String str) {
        TypedValue typedValueN = n(context, i2);
        if (typedValueN != null) {
            return typedValueN;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static void q(Outline outline, Path path) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            xp.a(outline, path);
            return;
        }
        if (i2 >= 29) {
            try {
                wp.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            wp.a(outline, path);
        }
    }

    public static void r(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        i30.Q(classCastException, qb1.class.getName());
        throw classCastException;
    }

    public static final Object[] s(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                        i30.l(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                        i30.l(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i2 = i3;
                }
            }
        }
        return g;
    }

    public static final Object[] t(Collection collection, Object[] objArr) throws NegativeArraySizeException {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    i30.k(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                        i30.l(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i3] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                        i30.l(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static boolean u(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012a  */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void v(android.content.Context r18, java.util.concurrent.Executor r19, defpackage.qm0 r20, boolean r21) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb1.v(android.content.Context, java.util.concurrent.Executor, qm0, boolean):void");
    }

    public static int w(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static void x(int i2, int i3) {
        String strH;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strH = i41.H("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException(ex0.f("negative size: ", i3));
                }
                strH = i41.H("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static void y(String str, boolean z) throws lq1 {
        if (!z) {
            throw lq1.a(null, str);
        }
    }

    public static byte[] z(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            byte b2 = (byte) ((b + b) & 254);
            bArr2[i2] = b2;
            if (i2 < 15) {
                bArr2[i2] = (byte) (((bArr[i3] >> 7) & 1) | b2);
            }
            i2 = i3;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public v4 c(Context context, Looper looper, bu1 bu1Var, Object obj, hz hzVar, iz izVar) {
        switch (this.f) {
            case 0:
                bu1Var.getClass();
                Integer num = (Integer) bu1Var.l;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new yv0(context, looper, bu1Var, bundle, hzVar, izVar);
            case 1:
                obj.getClass();
                throw new ClassCastException();
            default:
                xb1 xb1Var = (xb1) hzVar;
                xb1 xb1Var2 = (xb1) izVar;
                switch (this.f) {
                    case 2:
                        return new vc1(context, looper, bu1Var, (r01) obj, xb1Var, xb1Var2);
                    case 3:
                        return new kn2(context, looper, 300, bu1Var, xb1Var, xb1Var2);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
        }
    }
}
