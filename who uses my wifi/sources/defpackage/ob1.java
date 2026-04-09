package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.EditorInfo;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.spec.ECParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ob1 {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];
    public static final byte[] d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};
    public static final us0 k = new us0();
    public static final rv1 l = new rv1(17);
    public static final zq2 m = new zq2(16);
    public static final p63 n = new p63(6);
    public static final String[] o = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
    public static String p;

    public static vq2 B(kz2 kz2Var) {
        kz2Var.G(1);
        int iO = kz2Var.O();
        long j2 = kz2Var.b;
        long j3 = iO;
        int i2 = iO / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long jD = kz2Var.d();
            if (jD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jD;
            jArrCopyOf2[i3] = kz2Var.d();
            kz2Var.G(2);
            i3++;
        }
        kz2Var.G((int) ((j2 + j3) - kz2Var.b));
        return new vq2(jArrCopyOf, jArrCopyOf2, 19);
    }

    public static void C(ArrayList arrayList, so1 so1Var) {
        String str = (String) so1Var.w();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static void D(lg1 lg1Var) {
        int iR;
        int iR2 = lg1Var.r(2);
        if (iR2 == 0) {
            lg1Var.o(6);
            return;
        }
        int iJ = J(lg1Var, 5, 8, 16) + 1;
        if (iR2 == 1) {
            lg1Var.o(iJ * 7);
            return;
        }
        if (iR2 == 2) {
            boolean zQ = lg1Var.q();
            int i2 = true != zQ ? 5 : 1;
            int i3 = true == zQ ? 7 : 5;
            int i4 = true == zQ ? 8 : 6;
            int i5 = 0;
            while (i5 < iJ) {
                if (lg1Var.q()) {
                    lg1Var.o(7);
                    iR = 0;
                } else {
                    if (lg1Var.r(2) == 3 && lg1Var.r(i3) * i2 != 0) {
                        lg1Var.m();
                    }
                    iR = lg1Var.r(i4) * i2;
                    if (iR != 0 && iR != 180) {
                        lg1Var.m();
                    }
                    lg1Var.m();
                }
                if (iR != 0 && iR != 180 && lg1Var.q()) {
                    i5++;
                }
                i5++;
            }
        }
    }

    public static byte[] F(byte[] bArr) {
        int length;
        int i2 = 0;
        while (true) {
            length = bArr.length;
            if (i2 >= length || bArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == length) {
            i2 = length - 1;
        }
        int i3 = (bArr[i2] & 128) == 128 ? 1 : 0;
        int i4 = length - i2;
        byte[] bArr2 = new byte[i4 + i3];
        System.arraycopy(bArr, i2, bArr2, i3, i4);
        return bArr2;
    }

    public static void I(lg1 lg1Var) {
        lg1Var.o(3);
        lg1Var.o(8);
        boolean zQ = lg1Var.q();
        boolean zQ2 = lg1Var.q();
        if (zQ) {
            lg1Var.o(5);
        }
        if (zQ2) {
            lg1Var.o(6);
        }
    }

    public static int J(lg1 lg1Var, int i2, int i3, int i4) {
        zt0.D(Math.max(Math.max(i2, i3), i4) <= 31);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        Math.addExact(Math.addExact(i5, i6), 1 << i4);
        if (lg1Var.f() >= i2) {
            int iR = lg1Var.r(i2);
            if (iR == i5) {
                if (lg1Var.f() >= i3) {
                    int iR2 = lg1Var.r(i3);
                    iR += iR2;
                    if (iR2 == i6) {
                        if (lg1Var.f() >= i4) {
                            return lg1Var.r(i4) + iR;
                        }
                    }
                }
            }
            return iR;
        }
        return -1;
    }

    public static final int a(int i2, int i3, int[] iArr) {
        i30.m(iArr, "array");
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int b(long[] jArr, int i2, long j2) {
        i30.m(jArr, "array");
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static int c(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : gi0.a(new hi0(context).a) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList d(android.content.Context r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            dq0 r1 = new dq0
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.fq0.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.fq0.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            cq0 r5 = (defpackage.cq0) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Laf
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = defpackage.fq0.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L7e
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.gg.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
        L7e:
            if (r4 == 0) goto Laa
            java.lang.Object r2 = defpackage.fq0.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.fq0.b     // Catch: java.lang.Throwable -> L96
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L96
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L96
            if (r3 != 0) goto L98
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L96
            r3.<init>()     // Catch: java.lang.Throwable -> L96
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r8 = move-exception
            goto La8
        L98:
            cq0 r0 = new cq0     // Catch: java.lang.Throwable -> L96
            android.content.res.Resources r1 = r1.a     // Catch: java.lang.Throwable -> L96
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L96
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L96
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L96
            goto Lae
        La8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L96
            throw r8
        Laa:
            android.content.res.ColorStateList r4 = defpackage.bq0.b(r0, r9, r8)
        Lae:
            return r4
        Laf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob1.d(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static ColorStateList e(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListD;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListD = d(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListD;
    }

    public static ColorStateList f(Context context, xb4 xb4Var, int i2) {
        int resourceId;
        ColorStateList colorStateListD;
        TypedArray typedArray = (TypedArray) xb4Var.h;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListD = d(context, resourceId)) == null) ? xb4Var.k(i2) : colorStateListD;
    }

    public static int g(Context context, TypedArray typedArray, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i2, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i2, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i3);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable h(Context context, int i2) {
        return zp0.b().c(context, i2);
    }

    public static Drawable i(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableH;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableH = h(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableH;
    }

    public static boolean m() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean n(String str) {
        a5 a5Var = f81.a;
        Set<oh> setUnmodifiableSet = Collections.unmodifiableSet(b5.c);
        HashSet hashSet = new HashSet();
        for (oh ohVar : setUnmodifiableSet) {
            if (((b5) ohVar).a.equals(str)) {
                hashSet.add(ohVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            b5 b5Var = (b5) ((oh) it.next());
            if (b5Var.a() || b5Var.b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean o(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static void r(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[EDGE_INSN: B:66:0x00c5->B:44:0x00c5 BREAK  A[LOOP:1: B:29:0x0094->B:67:0x0094]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String s(android.content.Context r10) {
        /*
            java.lang.String r0 = defpackage.ob1.p
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            java.lang.String r3 = "https://www.example.com"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r1.<init>(r2, r3)
            r2 = 0
            android.content.pm.ResolveInfo r3 = r0.resolveActivity(r1, r2)
            r4 = 0
            if (r3 == 0) goto L23
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L24
        L23:
            r3 = r4
        L24:
            java.util.List r5 = r0.queryIntentActivities(r1, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L31:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r5.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = "android.support.customtabs.action.CustomTabsService"
            r8.setAction(r9)
            android.content.pm.ActivityInfo r9 = r7.activityInfo
            java.lang.String r9 = r9.packageName
            r8.setPackage(r9)
            android.content.pm.ResolveInfo r8 = r0.resolveService(r8, r2)
            if (r8 == 0) goto L31
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.packageName
            r6.add(r7)
            goto L31
        L5c:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L66
            defpackage.ob1.p = r4
            goto Le5
        L66:
            int r0 = r6.size()
            r4 = 1
            if (r0 != r4) goto L77
            java.lang.Object r10 = r6.get(r2)
            java.lang.String r10 = (java.lang.String) r10
            defpackage.ob1.p = r10
            goto Le5
        L77:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lc5
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch: java.lang.RuntimeException -> Lb5
            r0 = 64
            java.util.List r10 = r10.queryIntentActivities(r1, r0)     // Catch: java.lang.RuntimeException -> Lb5
            if (r10 == 0) goto Lbc
            int r0 = r10.size()     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 != 0) goto L90
            goto Lbc
        L90:
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.RuntimeException -> Lb5
        L94:
            boolean r0 = r10.hasNext()     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r10.next()     // Catch: java.lang.RuntimeException -> Lb5
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch: java.lang.RuntimeException -> Lb5
            android.content.IntentFilter r1 = r0.filter     // Catch: java.lang.RuntimeException -> Lb5
            if (r1 == 0) goto L94
            int r2 = r1.countDataAuthorities()     // Catch: java.lang.RuntimeException -> Lb5
            if (r2 == 0) goto L94
            int r1 = r1.countDataPaths()     // Catch: java.lang.RuntimeException -> Lb5
            if (r1 == 0) goto L94
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 == 0) goto L94
            goto Lc5
        Lb5:
            java.lang.String r10 = "CustomTabsHelper"
            java.lang.String r0 = "Runtime exception while getting specialized handlers"
            android.util.Log.e(r10, r0)
        Lbc:
            boolean r10 = r6.contains(r3)
            if (r10 == 0) goto Lc5
            defpackage.ob1.p = r3
            goto Le5
        Lc5:
            java.lang.String r10 = "com.android.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Ld0
            defpackage.ob1.p = r10
            goto Le5
        Ld0:
            java.lang.String r10 = "com.chrome.beta"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Ldb
            defpackage.ob1.p = r10
            goto Le5
        Ldb:
            java.lang.String r10 = "com.chrome.dev"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Le5
            defpackage.ob1.p = r10
        Le5:
            java.lang.String r10 = defpackage.ob1.p
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob1.s(android.content.Context):java.lang.String");
    }

    public static Provider t() {
        for (int i2 = 0; i2 < 3; i2++) {
            Provider provider = Security.getProvider(o[i2]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static void u(Context context) {
        boolean z;
        Object obj = wb4.b;
        if (((Boolean) p02.a.w()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (wb4.b) {
                        z = wb4.c;
                    }
                    if (z) {
                        return;
                    }
                    n70 n70VarR1 = new gc2(context).r1();
                    gi2.f0("Updating ad debug logging enablement.");
                    um.F(n70VarR1, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception unused) {
                gi2.q0(5);
            }
        }
    }

    public static void v(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        throw new NullPointerException(ex0.l(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
    }

    public static void w(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static ECParameterSpec y(h34 h34Var) throws NoSuchAlgorithmException {
        int iOrdinal = h34Var.ordinal();
        if (iOrdinal == 0) {
            return ru3.a;
        }
        if (iOrdinal == 1) {
            return ru3.b;
        }
        if (iOrdinal == 2) {
            return ru3.c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(h34Var.toString()));
    }

    public static void z(String str, int i2) {
        if (i2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(i2).length());
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract void A(np3 np3Var, np3 np3Var2);

    public abstract boolean E(op3 op3Var, np3 np3Var, np3 np3Var2);

    public abstract boolean G(gp3 gp3Var, dp3 dp3Var, dp3 dp3Var2);

    public abstract np3 H(gp3 gp3Var);

    public abstract dp3 K(gp3 gp3Var);

    public abstract boolean L(op3 op3Var, Object obj, Object obj2);

    public abstract int j(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int k();

    public abstract ViewPropertyAnimator l(View view, int i2);

    public abstract void p(int i2);

    public abstract void q(Typeface typeface, boolean z);

    public abstract void x(np3 np3Var, Thread thread);
}
