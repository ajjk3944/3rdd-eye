package defpackage;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class um implements of1 {
    public static final z91 j;
    public static final z91 k;
    public static final z91 l;
    public static final z91 m;
    public static final z91 n;
    public static boolean t = false;
    public static Method u = null;
    public static boolean v = false;
    public static Field w;
    public static final /* synthetic */ int x = 0;
    public static final Object f = new Object();
    public static final int[] g = {R.attr.theme, com.phuongpn.whousemywifi.networkscanner.R.attr.theme};
    public static final int[] h = {com.phuongpn.whousemywifi.networkscanner.R.attr.materialThemeOverlay};
    public static final z91 i = new z91(1, 2, 0);
    public static final z91 o = new z91(11, 12, 6);
    public static final rv1 p = new rv1(6);
    public static final zq2 q = new zq2(9);
    public static final zq2 r = new zq2(25);
    public static final p63 s = new p63(14);

    static {
        int i2 = 4;
        j = new z91(3, i2, 1);
        k = new z91(i2, 5, 2);
        int i3 = 7;
        l = new z91(6, i3, 3);
        int i4 = 8;
        m = new z91(i3, i4, 4);
        n = new z91(i4, 9, 5);
    }

    public static Context A(Context context, AttributeSet attributeSet, int i2, int i3, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h, i2, i3);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        boolean z = (context instanceof nj) && ((nj) context).a == i4;
        if (i4 == 0 || z) {
            return context;
        }
        nj njVar = new nj(context, i4);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr3[i5] = typedArrayObtainStyledAttributes2.getResourceId(i5, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr3[i6];
            if (i7 != 0) {
                njVar.getTheme().applyStyle(i7, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, g);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            njVar.getTheme().applyStyle(resourceId, true);
        }
        return njVar;
    }

    public static int B(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static long C(double d) {
        zt0.M("not a normal value", J(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static String D(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (K(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c = charArray[i2];
                    if (K(c)) {
                        charArray[i2] = (char) (c ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static su3 E() throws GeneralSecurityException {
        try {
            su3 su3Var = rr3.a;
            if (mu3.a()) {
                throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
            }
            return rr3.a;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void F(n70 n70Var, String str) {
        er3 er3Var = new er3(str, 3);
        n70Var.c(new jq3(n70Var, er3Var, 0), md2.g);
    }

    public static void G(AtomicReference atomicReference, e73 e73Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            e73Var.mo17c(obj);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    public static String H(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c = charArray[i2];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i2] = (char) (c ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static final void I(a54 a54Var, ArrayDeque arrayDeque) {
        if (!a54Var.h()) {
            if (!(a54Var instanceof u64)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(a54Var.getClass())));
            }
            u64 u64Var = (u64) a54Var;
            I(u64Var.i, arrayDeque);
            I(u64Var.j, arrayDeque);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(u64.m, a54Var.d());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iR = u64.r(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((a54) arrayDeque.peek()).d() >= iR) {
            arrayDeque.push(a54Var);
            return;
        }
        int iR2 = u64.r(iBinarySearch);
        a54 u64Var2 = (a54) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((a54) arrayDeque.peek()).d() < iR2) {
            u64Var2 = new u64((a54) arrayDeque.pop(), u64Var2);
        }
        u64 u64Var3 = new u64(u64Var2, a54Var);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(u64.m, u64Var3.h);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((a54) arrayDeque.peek()).d() >= u64.r(iBinarySearch2 + 1)) {
                break;
            } else {
                u64Var3 = new u64((a54) arrayDeque.pop(), u64Var3);
            }
        }
        arrayDeque.push(u64Var3);
    }

    public static boolean J(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static boolean K(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean L(String str, CharSequence charSequence) {
        char c;
        int length = str.length();
        if (str == charSequence) {
            return true;
        }
        if (length == charSequence.length()) {
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) == charSequence.charAt(i2) || ((c = (char) ((r3 | ' ') - 97)) < 26 && c == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.util.List r6, defpackage.rw0 r7, defpackage.qj r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.lm
            if (r0 == 0) goto L13
            r0 = r8
            lm r0 = (defpackage.lm) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            lm r0 = new lm
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.k
            int r1 = r0.l
            r2 = 2
            r3 = 1
            rk r4 = defpackage.rk.f
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.util.Iterator r6 = r0.j
            java.io.Serializable r7 = r0.i
            cp0 r7 = (defpackage.cp0) r7
            defpackage.bd2.x(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.i
            java.util.List r6 = (java.util.List) r6
            defpackage.bd2.x(r8)
            goto L5c
        L42:
            defpackage.bd2.x(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            nm r1 = new nm
            r5 = 0
            r1.<init>(r6, r8, r5)
            r0.i = r8
            r0.l = r3
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 != r4) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            cp0 r7 = new cp0
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            dy r8 = (defpackage.dy) r8
            r0.i = r7     // Catch: java.lang.Throwable -> L30
            r0.j = r6     // Catch: java.lang.Throwable -> L30
            r0.l = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.g(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r4) goto L65
            goto L93
        L7e:
            java.lang.Object r1 = r7.f
            if (r1 != 0) goto L85
            r7.f = r8
            goto L65
        L85:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            defpackage.gi2.a(r1, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            z31 r4 = defpackage.z31.a
        L93:
            return r4
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um.b(java.util.List, rw0, qj):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(defpackage.qi r40, defpackage.x60 r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um.c(qi, x60, java.util.ArrayList, int):void");
    }

    public static String e(String str) {
        String strValueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            Locale locale = Locale.getDefault();
            i30.l(locale, "getDefault(...)");
            String strValueOf2 = String.valueOf(cCharAt);
            i30.k(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            strValueOf = strValueOf2.toUpperCase(locale);
            i30.l(strValueOf, "toUpperCase(...)");
            if (strValueOf.length() <= 1) {
                String strValueOf3 = String.valueOf(cCharAt);
                i30.k(strValueOf3, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf3.toUpperCase(Locale.ROOT);
                i30.l(upperCase, "toUpperCase(...)");
                if (strValueOf.equals(upperCase)) {
                    strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                }
            } else if (cCharAt != 329) {
                char cCharAt2 = strValueOf.charAt(0);
                String strSubstring = strValueOf.substring(1);
                i30.l(strSubstring, "substring(...)");
                String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
                i30.l(lowerCase, "toLowerCase(...)");
                strValueOf = cCharAt2 + lowerCase;
            }
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        String strSubstring2 = str.substring(1);
        i30.l(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    public static String f(int i2) {
        return String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i2 & 16777215)}, 1));
    }

    public static boolean g(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = e61.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = d61.d;
        d61 d61Var = (d61) view.getTag(com.phuongpn.whousemywifi.networkscanner.R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (d61Var == null) {
            d61Var = new d61();
            d61Var.a = null;
            d61Var.b = null;
            d61Var.c = null;
            view.setTag(com.phuongpn.whousemywifi.networkscanner.R.id.tag_unhandled_key_event_manager, d61Var);
        }
        WeakReference weakReference2 = d61Var.c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        d61Var.c = new WeakReference(keyEvent);
        if (d61Var.b == null) {
            d61Var.b = new SparseArray();
        }
        SparseArray sparseArray = d61Var.b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(com.phuongpn.whousemywifi.networkscanner.R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean h(s40 s40Var, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (s40Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return s40Var.b(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!t) {
                            try {
                                u = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            t = true;
                        }
                        Method method = u;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (e61.b(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!v) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        w = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    v = true;
                }
                Field field = w;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (e61.b(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && e61.b(view, keyEvent)) || s40Var.b(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static String i(byte[] bArr, boolean z) {
        return g82.s(64, y(bArr), z);
    }

    public static String j(String str, String str2) {
        String string = str != null ? sy0.J(str).toString() : null;
        String string2 = str2 != null ? sy0.J(str2).toString() : null;
        if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
            return (string == null || string.length() == 0) ? (string2 == null || string2.length() == 0) ? "" : string2 : string;
        }
        return string + " (" + string2 + ")";
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static String l(int i2) {
        String str = "";
        for (int i3 = 0; i3 < 4; i3++) {
            str = str + ((i2 >> (i3 * 8)) & 255) + ".";
        }
        String strSubstring = str.substring(0, str.length() - 1);
        i30.l(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final yt0 m(Object obj) {
        if (obj != i41.h) {
            return (yt0) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static long n(String str) {
        List listO;
        i30.m(str, "ip_addr");
        Pattern patternCompile = Pattern.compile("\\.");
        i30.l(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listO = arrayList;
        } else {
            listO = zt0.o(str.toString());
        }
        boolean zIsEmpty = listO.isEmpty();
        Collection collectionO = ns.f;
        if (!zIsEmpty) {
            ListIterator listIterator = listO.listIterator(listO.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    int iNextIndex = listIterator.nextIndex() + 1;
                    if (iNextIndex < 0) {
                        throw new IllegalArgumentException(("Requested element count " + iNextIndex + " is less than zero.").toString());
                    }
                    if (iNextIndex != 0) {
                        if (iNextIndex >= listO.size()) {
                            collectionO = yf.o0(listO);
                        } else if (iNextIndex != 1) {
                            ArrayList arrayList2 = new ArrayList(iNextIndex);
                            Iterator it = listO.iterator();
                            int i2 = 0;
                            while (it.hasNext()) {
                                arrayList2.add(it.next());
                                i2++;
                                if (i2 == iNextIndex) {
                                    break;
                                }
                            }
                            int size = arrayList2.size();
                            if (size != 0) {
                                collectionO = size != 1 ? arrayList2 : zt0.o(arrayList2.get(0));
                            }
                        } else {
                            if (listO.isEmpty()) {
                                throw new NoSuchElementException("List is empty.");
                            }
                            collectionO = zt0.o(listO.get(0));
                        }
                    }
                }
            }
        }
        String[] strArr = (String[]) collectionO.toArray(new String[0]);
        return Integer.parseInt(strArr[3]) + (Integer.parseInt(strArr[2]) * 256) + (Integer.parseInt(strArr[1]) * 65536) + (Integer.parseInt(strArr[0]) * 16777216);
    }

    public static f31 o(Context context, WifiInfo wifiInfo) {
        if (Build.VERSION.SDK_INT < 30) {
            return new f31(context.getString(com.phuongpn.whousemywifi.networkscanner.R.string.wifi_standard_unknown), "", "");
        }
        int wifiStandard = wifiInfo.getWifiStandard();
        int frequency = wifiInfo.getFrequency();
        if (wifiStandard == 1) {
            return new f31(context.getString(com.phuongpn.whousemywifi.networkscanner.R.string.wifi_standard_legacy), "Wi-Fi 3", "3");
        }
        switch (wifiStandard) {
            case 6:
                if (5925 <= frequency && frequency < 7126) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return new f31(context.getString(com.phuongpn.whousemywifi.networkscanner.R.string.wifi_standard_unknown), "", "");
    }

    public static final boolean p(Object obj) {
        return obj == i41.h;
    }

    public static sv s(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            w(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), bn0.b);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(4);
        String string3 = typedArrayObtainAttributes.getString(5);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(2, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
        String string4 = typedArrayObtainAttributes.getString(6);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                w(xmlResourceParser);
            }
            return new vv(new g4(string, string2, string3, u(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), bn0.c);
                    int i2 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i3 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i4 = typedArrayObtainAttributes2.getInt(i3, 0);
                    int i5 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i5, 0);
                    String string6 = typedArrayObtainAttributes2.getString(i5);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        w(xmlResourceParser);
                    }
                    arrayList.add(new uv(i2, i4, resourceId2, string6, string5, z));
                } else {
                    w(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new tv((uv[]) arrayList.toArray(new uv[0]));
    }

    public static void t(Context context, String str) {
        synchronized (f) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                } catch (Exception unused) {
                    if (fileOutputStreamOpenFileOutput != null) {
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (FileNotFoundException unused4) {
            }
        }
    }

    public static List u(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (rv.a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String v(android.content.Context r8) {
        /*
            java.lang.Object r0 = defpackage.um.f
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L63
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L4c
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
        L44:
            if (r2 == 0) goto L55
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L55
            goto L55
        L4a:
            r8 = move-exception
            goto L65
        L4c:
            if (r2 == 0) goto L51
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L51
        L51:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L52:
            if (r2 == 0) goto L55
            goto L46
        L55:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5c
            goto L61
        L5c:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um.v(android.content.Context):java.lang.String");
    }

    public static void w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final String x(oj ojVar) {
        Object objK;
        if (ojVar instanceof cp) {
            return ojVar.toString();
        }
        try {
            objK = ojVar + '@' + k(ojVar);
        } catch (Throwable th) {
            objK = bd2.k(th);
        }
        if (jq0.a(objK) != null) {
            objK = ojVar.getClass().getName() + '@' + k(ojVar);
        }
        return (String) objK;
    }

    public static String y(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 < (bArr.length + 2) / 3; i2++) {
            short[] sArr = new short[3];
            short[] sArr2 = new short[4];
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = (i2 * 3) + i3;
                if (i4 < bArr.length) {
                    sArr[i3] = (short) (bArr[i4] & 255);
                } else {
                    sArr[i3] = -1;
                }
            }
            sArr2[0] = (short) (sArr[0] >> 2);
            short s2 = sArr[1];
            if (s2 == -1) {
                sArr2[1] = (short) ((sArr[0] & 3) << 4);
            } else {
                sArr2[1] = (short) (((sArr[0] & 3) << 4) + (s2 >> 4));
            }
            short s3 = sArr[1];
            if (s3 == -1) {
                sArr2[3] = 64;
                sArr2[2] = 64;
            } else {
                short s4 = sArr[2];
                if (s4 == -1) {
                    sArr2[2] = (short) ((s3 & 15) << 2);
                    sArr2[3] = 64;
                } else {
                    sArr2[2] = (short) (((s3 & 15) << 2) + (s4 >> 6));
                    sArr2[3] = (short) (sArr[2] & 63);
                }
            }
            for (int i5 = 0; i5 < 4; i5++) {
                byteArrayOutputStream.write("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(sArr2[i5]));
            }
        }
        return byteArrayOutputStream.toString();
    }

    public static Context z(Context context, AttributeSet attributeSet, int i2, int i3) {
        return A(context, attributeSet, i2, i3, new int[0]);
    }

    public abstract void q(u70 u70Var);

    public abstract void r(Object obj);
}
