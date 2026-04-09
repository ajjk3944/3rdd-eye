package com.bumptech.glide;

import B4.C0141c;
import B4.DialogC0143e;
import G3.C0152f;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.api.Status;
import com.lefan.signal.MainActivity;
import d5.y;
import e.C2284a;
import h.AbstractActivityC2349g;
import h0.C2351a;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import k0.K;

/* loaded from: classes.dex */
public abstract class e implements U.f {

    /* renamed from: a, reason: collision with root package name */
    public static c3.j f6495a;

    /* renamed from: b, reason: collision with root package name */
    public static C2351a f6496b;

    public e() {
        new ConcurrentHashMap();
    }

    public static int A(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void b(Throwable th, Throwable th2) {
        q5.i.e(th, "<this>");
        q5.i.e(th2, "exception");
        if (th != th2) {
            Integer num = l5.a.f21864a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = k5.a.f21801a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static int c(int i, int i3) {
        return J.a.e(i, (Color.alpha(i) * i3) / 255);
    }

    public static int i(Context context, int i) {
        if (context == null) {
            return 0;
        }
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final boolean k(Context context, String str, boolean z6) {
        q5.i.e(context, "context");
        return context.getSharedPreferences("sp", 0).getBoolean(str, z6);
    }

    public static int l(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    public static int m(int i, View view) {
        Context context = view.getContext();
        TypedValue typedValueQ = y.q(view.getContext(), i, view.getClass().getCanonicalName());
        int i3 = typedValueQ.resourceId;
        return i3 != 0 ? context.getColor(i3) : typedValueQ.data;
    }

    public static int n(Context context, int i, int i3) {
        Integer numValueOf;
        TypedValue typedValueN = y.n(context, i);
        if (typedValueN != null) {
            int i6 = typedValueN.resourceId;
            numValueOf = Integer.valueOf(i6 != 0 ? context.getColor(i6) : typedValueN.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3;
    }

    public static final Class o(q5.d dVar) {
        Class clsA = dVar.a();
        q5.i.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class p(w5.b bVar) {
        q5.i.e(bVar, "<this>");
        Class clsA = ((q5.c) bVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static Object q(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return N.b.a(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C2284a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static void r(MainActivity mainActivity) {
        c3.j jVarR;
        String str;
        Context applicationContext = mainActivity.getApplicationContext();
        if (applicationContext != null) {
            mainActivity = applicationContext;
        }
        C2351a c2351a = new C2351a(new W3.f(mainActivity));
        f6496b = c2351a;
        W3.f fVar = (W3.f) c2351a.f20441b;
        X3.e eVar = W3.f.f4032c;
        int i = 1;
        int i3 = 0;
        eVar.c("requestInAppReview (%s)", fVar.f4034b);
        if (fVar.f4033a == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", X3.e.e(eVar.f4174b, "Play Store app is either not installed or not the official version", objArr));
            }
            Locale locale = Locale.getDefault();
            HashMap map = Y3.a.f4387a;
            if (map.containsKey(-1)) {
                str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) Y3.a.f4388b.get(-1)) + ")";
            } else {
                str = "";
            }
            jVarR = d.r(new K2.j(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null)));
        } else {
            c3.f fVar2 = new c3.f();
            X3.h hVar = fVar.f4033a;
            W3.d dVar = new W3.d(fVar, fVar2, fVar2, i3);
            synchronized (hVar.f4184f) {
                hVar.f4183e.add(fVar2);
                fVar2.f5902a.a(new V2.h(hVar, 12, fVar2));
            }
            synchronized (hVar.f4184f) {
                try {
                    if (hVar.f4188k.getAndIncrement() > 0) {
                        X3.e eVar2 = hVar.f4180b;
                        Object[] objArr2 = new Object[0];
                        eVar2.getClass();
                        if (Log.isLoggable("PlayCore", 3)) {
                            Log.d("PlayCore", X3.e.e(eVar2.f4174b, "Already connected to the service.", objArr2));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hVar.a().post(new W3.d(hVar, fVar2, dVar, i));
            jVarR = fVar2.f5902a;
        }
        if (jVarR != null) {
            jVarR.a(new i4.b(5));
        }
    }

    public static boolean s(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = J.a.f2005a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d6 = iRed / 255.0d;
        double dPow = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        double d7 = iGreen / 255.0d;
        double dPow2 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        double d8 = iBlue / 255.0d;
        double dPow3 = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d9 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d9;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d9 / 100.0d > 0.5d;
    }

    public static int t(float f2, int i, int i3) {
        return J.a.c(J.a.e(i3, Math.round(Color.alpha(i3) * f2)), i);
    }

    public static Typeface u(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, y.f(configuration.fontWeightAdjustment + typeface.getWeight(), 1, TTAdConstant.STYLE_SIZE_RADIO_1_1), typeface.isItalic());
    }

    public static void v(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static void w(MainActivity mainActivity) {
        c1.g gVar = new c1.g(27, false);
        gVar.f5897c = mainActivity.getString(com.apm.insight.R.string.evaluate);
        gVar.f5896b = mainActivity.getString(com.apm.insight.R.string.evaluate_tip);
        gVar.f5898d = mainActivity.getString(com.apm.insight.R.string.to_evaluate);
        h2.d dVar = new h2.d(mainActivity);
        AbstractActivityC2349g abstractActivityC2349gO = c.O(mainActivity);
        K kS = (!(abstractActivityC2349gO instanceof AbstractActivityC2349g) && abstractActivityC2349gO == null) ? null : abstractActivityC2349gO.s();
        if (kS == null) {
            DialogC0143e dialogC0143e = new DialogC0143e(mainActivity, com.apm.insight.R.style.customDialog);
            dialogC0143e.f712m = gVar;
            dialogC0143e.f711l = dVar;
            dialogC0143e.show();
            return;
        }
        C0141c c0141c = new C0141c();
        c0141c.f704C0 = gVar;
        c0141c.f703B0 = dVar;
        c0141c.e0(kS, "custom_dialog");
    }

    public static void x(Window window, boolean z6) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            K.b.e(window, z6);
        } else {
            if (i >= 30) {
                K.b.d(window, z6);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void y(Context context, String str, long j6) {
        q5.i.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("sp", 0);
        q5.i.b(sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong(str, j6);
        editorEdit.apply();
    }

    public static final void z(Context context, String str, String str2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("sp", 0);
        q5.i.b(sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public abstract Typeface d(Context context, I.f fVar, Resources resources, int i);

    public abstract Typeface e(Context context, O.i[] iVarArr, int i);

    public Typeface f(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface g(Context context, InputStream inputStream) {
        File fileQ = I5.b.q(context);
        if (fileQ == null) {
            return null;
        }
        try {
            if (I5.b.i(fileQ, inputStream)) {
                return Typeface.createFromFile(fileQ.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileQ.delete();
        }
    }

    public Typeface h(Context context, Resources resources, int i, String str, int i3) {
        File fileQ = I5.b.q(context);
        if (fileQ == null) {
            return null;
        }
        try {
            if (I5.b.h(fileQ, resources, i)) {
                return Typeface.createFromFile(fileQ.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileQ.delete();
        }
    }

    public O.i j(O.i[] iVarArr, int i) {
        new C0152f(18);
        int i3 = (i & 1) == 0 ? 400 : 700;
        boolean z6 = (i & 2) != 0;
        O.i iVar = null;
        int i6 = Integer.MAX_VALUE;
        for (O.i iVar2 : iVarArr) {
            int iAbs = (Math.abs(iVar2.f3054c - i3) * 2) + (iVar2.f3055d == z6 ? 0 : 1);
            if (iVar == null || i6 > iAbs) {
                iVar = iVar2;
                i6 = iAbs;
            }
        }
        return iVar;
    }
}
