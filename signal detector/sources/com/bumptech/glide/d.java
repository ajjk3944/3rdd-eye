package com.bumptech.glide;

import R.T;
import android.animation.TimeInterpolator;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import com.apm.insight.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d5.y;
import e.AbstractC2286c;
import h0.C2351a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import q0.K;
import q0.M;
import x.AbstractC2984e;
import z5.C3049z;

/* loaded from: classes.dex */
public abstract class d implements T {
    public static int A(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(A.f.h(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static int B(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(A.f.h(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static int C(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        throw new IllegalArgumentException(A.f.h(i, "Could not convert ", " to State"));
    }

    public static boolean E(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static boolean F(Context context, AbstractC2286c abstractC2286c) {
        if (context == null || abstractC2286c == null) {
            return false;
        }
        Intent intentX = x(context, "android.settings.APPLICATION_DETAILS_SETTINGS");
        if (intentX == null) {
            return true;
        }
        abstractC2286c.a(intentX);
        return true;
    }

    public static void N(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static int O(Context context, int i, int i3) {
        TypedValue typedValueN = y.n(context, i);
        return (typedValueN == null || typedValueN.type != 16) ? i3 : typedValueN.data;
    }

    public static TimeInterpolator P(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!E(strValueOf, "cubic-bezier") && !E(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!E(strValueOf, "cubic-bezier")) {
            if (E(strValueOf, "path")) {
                return new PathInterpolator(o(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(v(0, strArrSplit), v(1, strArrSplit), v(2, strArrSplit), v(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static void V(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z6 = onLongClickListener != null;
        boolean z7 = zHasOnClickListeners || z6;
        checkableImageButton.setFocusable(z7);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z6);
        checkableImageButton.setImportantForAccessibility(z7 ? 1 : 2);
    }

    public static int b0(int i) {
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return 0;
        }
        int i3 = 1;
        if (iC != 1) {
            i3 = 2;
            if (iC != 2) {
                i3 = 3;
                if (iC != 3) {
                    i3 = 4;
                    if (iC != 4) {
                        if (iC == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + A.f.A(i) + " to int");
                    }
                }
            }
        }
        return i3;
    }

    public static Object d(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void e(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static w.k f(C3049z c3049z) {
        return R3.b.m(new F4.c(28, c3049z));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:46|6|(4:51|7|(2:9|10)|(2:44|15))|53|19) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        r7.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static V0.e g(byte[] r7) throws java.lang.Throwable {
        /*
            V0.e r0 = new V0.e
            r0.<init>()
            if (r7 != 0) goto L8
            goto L5d
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            V0.d r5 = new V0.d     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.f3818a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L5e
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L5d
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L5d
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L5e
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L3e
            r2.close()     // Catch: java.io.IOException -> L58
            goto L3e
        L58:
            r7 = move-exception
            r7.printStackTrace()
            goto L3e
        L5d:
            return r0
        L5e:
            if (r2 == 0) goto L68
            r2.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r0 = move-exception
            r0.printStackTrace()
        L68:
            r1.close()     // Catch: java.io.IOException -> L6c
            goto L70
        L6c:
            r0 = move-exception
            r0.printStackTrace()
        L70:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.g(byte[]):V0.e");
    }

    public static boolean h(J.e[] eVarArr, J.e[] eVarArr2) {
        if (eVarArr == null || eVarArr2 == null || eVarArr.length != eVarArr2.length) {
            return false;
        }
        for (int i = 0; i < eVarArr.length; i++) {
            J.e eVar = eVarArr[i];
            char c6 = eVar.f2012a;
            J.e eVar2 = eVarArr2[i];
            if (c6 != eVar2.f2012a || eVar.f2013b.length != eVar2.f2013b.length) {
                return false;
            }
        }
        return true;
    }

    public static ImageView.ScaleType l(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static float[] m(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static J.e[] n(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.n(java.lang.String):J.e[]");
    }

    public static Path o(String str) {
        Path path = new Path();
        try {
            J.e.b(n(str), path);
            return path;
        } catch (RuntimeException e6) {
            throw new RuntimeException("Error in parsing ".concat(str), e6);
        }
    }

    public static J.e[] p(J.e[] eVarArr) {
        J.e[] eVarArr2 = new J.e[eVarArr.length];
        for (int i = 0; i < eVarArr.length; i++) {
            eVarArr2[i] = new J.e(eVarArr[i]);
        }
        return eVarArr2;
    }

    public static c3.j r(Exception exc) {
        c3.j jVar = new c3.j();
        jVar.f(exc);
        return jVar;
    }

    public static final String s(q5.d dVar) {
        String str;
        HashMap map = q5.d.f23289c;
        Class cls = dVar.f23290a;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String str2 = (String) map.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public static int t(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            try {
                switch (bluetoothDevice.getBluetoothClass().getDeviceClass()) {
                    case 256:
                    case 264:
                    case 268:
                    case 272:
                    case 276:
                        break;
                    case 260:
                        break;
                    case 280:
                    case 1792:
                    case 1796:
                        break;
                    case 512:
                    case 516:
                    case 520:
                    case 524:
                        break;
                    case 528:
                        break;
                    case 532:
                        break;
                    case 1024:
                    case 1076:
                        break;
                    case 1028:
                    case 1032:
                    case 1048:
                    case 1808:
                        break;
                    case 1040:
                        break;
                    case 1044:
                    case 1064:
                        break;
                    case 1052:
                        break;
                    case 1056:
                        break;
                    case 1060:
                        break;
                    case 1072:
                        break;
                    case 1080:
                        break;
                    case 1084:
                        break;
                    case 1088:
                        break;
                    case 1096:
                    case 2048:
                    case 2064:
                    case 2068:
                        break;
                    case 1280:
                        break;
                    case 1344:
                    case 1472:
                        break;
                    case 1408:
                        break;
                    case 1800:
                        break;
                    case 1804:
                        break;
                    case 1812:
                        break;
                    case 2052:
                        break;
                    case 2056:
                        break;
                    case 2060:
                        break;
                    case 2304:
                    case 2328:
                    case 2332:
                        break;
                    case 2308:
                        break;
                    case 2312:
                        break;
                    case 2316:
                        break;
                    case 2320:
                        break;
                    case 2324:
                        break;
                }
            } catch (Throwable th) {
                R2.a.d(th);
                return R.drawable.ic_unknown_blue_device;
            }
        }
        return R.drawable.ic_unknown_blue_device;
    }

    public static float v(int i, String[] strArr) throws NumberFormatException {
        float f2 = Float.parseFloat(strArr[i]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static String w(Class cls) {
        LinkedHashMap linkedHashMap = M.f22940b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            K k6 = (K) cls.getAnnotation(K.class);
            strValue = k6 != null ? k6.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        q5.i.b(strValue);
        return strValue;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Intent x(Context context, String str) {
        if (context == null) {
            return null;
        }
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        switch (str.hashCode()) {
            case -1471926860:
                if (str.equals("android.settings.USAGE_ACCESS_SETTINGS")) {
                    intent.setData(Uri.parse("package:" + context.getPackageName()));
                    break;
                }
                break;
            case -1116156552:
                if (str.equals("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION")) {
                    intent.setData(Uri.parse("package:" + context.getPackageName()));
                    break;
                }
                break;
            case -417739141:
                if (str.equals("android.settings.APPLICATION_DETAILS_SETTINGS")) {
                    intent.setData(Uri.parse("package:" + context.getPackageName()));
                    break;
                }
                break;
            case 604372044:
                if (str.equals("android.settings.action.MANAGE_OVERLAY_PERMISSION") && Build.VERSION.SDK_INT >= 30) {
                    intent.setData(Uri.parse("package:" + context.getPackageName()));
                    break;
                }
                break;
        }
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return intent;
        }
        if (str.equals("android.settings.SETTINGS")) {
            return null;
        }
        Intent intent2 = new Intent("android.settings.SETTINGS");
        if (intent2.resolveActivity(context.getPackageManager()) != null) {
            return intent2;
        }
        return null;
    }

    public static int z(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(A.f.h(i, "Could not convert ", " to BackoffPolicy"));
    }

    public boolean D() {
        return false;
    }

    public abstract void G();

    public abstract void I(int i);

    public abstract void J(Typeface typeface, boolean z6);

    public abstract boolean K(int i, KeyEvent keyEvent);

    public boolean L(KeyEvent keyEvent) {
        return false;
    }

    public boolean M() {
        return false;
    }

    public abstract void R(boolean z6);

    public abstract void S(boolean z6);

    public abstract void T(int i);

    public abstract void U(Drawable drawable);

    public abstract void W(boolean z6);

    public abstract void X(String str);

    public abstract void Y(CharSequence charSequence);

    public abstract void Z();

    public m.a a0(C2351a c2351a) {
        return null;
    }

    public abstract void c0();

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public abstract boolean k();

    public abstract void q(boolean z6);

    public abstract int u();

    public abstract Context y();

    public void H() {
    }

    public void Q() {
    }

    @Override // R.T
    public void a() {
    }

    @Override // R.T
    public void b() {
    }
}
