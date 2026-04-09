package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vw {
    private static int bw = -1;
    private static int dg = -1;
    private static float emc = -1.0f;
    private static Boolean gbl = null;
    private static ViewConfiguration msw = null;
    private static float ru = -1.0f;
    private static final Object sup = new Object();
    private static boolean sz = true;
    private static WindowManager uym = null;
    private static float xq = -1.0f;
    private static int ycc = -1;
    private static int ypw = -1;
    private static int zz = -1;

    public static boolean aa(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            if (string != null) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static int bw(Context context) {
        emc(context);
        return bw;
    }

    public static boolean cf(Context context) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int dg(Context context) {
        emc(context);
        return xq(context, dg);
    }

    private static boolean emc(int i10) {
        return i10 == 0 || i10 == 8 || i10 == 4;
    }

    public static Pair<Integer, Integer> gbl(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.aa.emc();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static float msw(Context context) {
        emc(context, true);
        return emc;
    }

    public static boolean qh(Context context) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int ru(Context context) {
        emc(context);
        return ypw;
    }

    public static boolean sba(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static int sup(Context context) {
        return ((Integer) gbl(context).second).intValue();
    }

    public static int sz(Context context) {
        return ((Integer) gbl(context).first).intValue();
    }

    public static int uym(Context context) {
        emc(context);
        return xq(context, bw);
    }

    public static boolean vk(Context context) {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.startsWith("ONEPLUS");
    }

    private static boolean xq() {
        return emc < 0.0f || ypw < 0 || xq < 0.0f || dg < 0 || bw < 0;
    }

    public static int ycc(Context context) {
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.aa.emc();
        }
        if (context == null) {
            return ycc;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            ycc = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return ycc;
    }

    public static float zz(Context context) {
        emc(context);
        return xq;
    }

    public static void emc(Context context) {
        emc(context, false);
    }

    public static int xq(Context context, float f10) {
        emc(context, true);
        float fMsw = msw(context);
        if (fMsw <= 0.0f) {
            fMsw = 1.0f;
        }
        return (int) ((f10 / fMsw) + 0.5f);
    }

    public static int ypw(Context context, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return Float.valueOf(emc(context, f10, true)).intValue();
    }

    public static void bw(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.vw.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    vw.emc(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    public static boolean dg(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static void emc(Context context, boolean z10) {
        Context contextEmc = context == null ? com.bytedance.sdk.openadsdk.core.aa.emc() : context;
        if (contextEmc == null) {
            return;
        }
        uym = (WindowManager) contextEmc.getSystemService("window");
        if (xq() || z10) {
            DisplayMetrics displayMetrics = contextEmc.getResources().getDisplayMetrics();
            emc = displayMetrics.density;
            ypw = displayMetrics.densityDpi;
            xq = displayMetrics.scaledDensity;
            dg = displayMetrics.widthPixels;
            bw = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i10 = dg;
            int i11 = bw;
            if (i10 > i11) {
                dg = i11;
                bw = i10;
            }
        } else {
            int i12 = dg;
            int i13 = bw;
            if (i12 < i13) {
                dg = i13;
                bw = i12;
            }
        }
        ycc = configuration.smallestScreenWidthDp;
    }

    public static void uym(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static int[] ypw(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (context == null) {
            return null;
        }
        if (uym == null) {
            uym = (WindowManager) com.bytedance.sdk.openadsdk.core.aa.emc().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = uym;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i10 = point.x;
                i11 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i10;
            iArr[1] = i11;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static boolean dg(Activity activity) {
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                    sz = false;
                } else {
                    displayCutout = null;
                }
                if (displayCutout != null) {
                    return true;
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e10.getMessage());
            }
        }
        return false;
    }

    public static int xq(Context context) {
        emc(context);
        return dg;
    }

    @Nullable
    public static int[] xq(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static void ycc(View view) {
        if (view == null) {
            return;
        }
        emc(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.vw.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    public static boolean xq(Activity activity) {
        if (gbl == null) {
            synchronized (sup) {
                try {
                    if (gbl == null) {
                        String strEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("cutout_devices", "");
                        String str = Build.MODEL;
                        if (!TextUtils.isEmpty(strEmc) && !TextUtils.isEmpty(str)) {
                            try {
                                JSONArray jSONArray = new JSONArray(strEmc);
                                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                    if (str.equals(jSONArray.getString(i10))) {
                                        gbl = Boolean.TRUE;
                                        return true;
                                    }
                                }
                            } catch (Exception e10) {
                                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e10.getMessage());
                            }
                        }
                        gbl = Boolean.valueOf(dg(activity) || emc("ro.miui.notch", activity) == 1 || qh(activity) || sba(activity) || cf(activity) || vk(activity) || aa(activity));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return gbl.booleanValue();
    }

    public static float emc(Context context, float f10) {
        emc(context);
        return f10 * zz(context);
    }

    public static int[] ypw(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static float emc(Context context, float f10, boolean z10) {
        emc(context);
        return (f10 * msw(context)) + (z10 ? 0.5f : 0.0f);
    }

    public static void ypw(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    @Nullable
    public static int[] emc(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static boolean ypw() {
        return sz && Build.VERSION.SDK_INT >= 28;
    }

    private static Bitmap ypw(com.bytedance.sdk.component.zz.ycc yccVar) {
        if (yccVar == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(yccVar.getWidth(), yccVar.getHeight(), Bitmap.Config.RGB_565);
            yccVar.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void emc(View view, int i10) {
        if (view == null || view.getVisibility() == i10 || !emc(i10)) {
            return;
        }
        view.setVisibility(i10);
    }

    public static void emc(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void xq(final com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str, String str2, final Bitmap bitmap, final String str3, final long j10) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, str, str2, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.utils.vw.4
                        @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                        public JSONObject xq() throws JSONException {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int iEmc = vw.emc(bitmap);
                                jSONObject.put("url", str3);
                                long j11 = j10;
                                if (j11 != -1) {
                                    jSONObject.put("page_id", j11);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iEmc == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.dr.ypw(rieVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(rieVar) ? 1 : 0);
                            } catch (JSONException unused) {
                            }
                            return jSONObject;
                        }
                    });
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.xq("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    public static void emc(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        emc(view, (ViewGroup.MarginLayoutParams) layoutParams, i10, i11, i12, i13);
    }

    private static ArrayList<Integer> ypw(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = iArr[i11];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i12) >> 16, (65280 & i12) >> 8, i12 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void emc(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.bottomMargin == i13) {
            return;
        }
        if (i10 != -3) {
            marginLayoutParams.leftMargin = i10;
        }
        if (i11 != -3) {
            marginLayoutParams.topMargin = i11;
        }
        if (i12 != -3) {
            marginLayoutParams.rightMargin = i12;
        }
        if (i13 != -3) {
            marginLayoutParams.bottomMargin = i13;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void ypw(View view, final float f10) {
        if (view != null && f10 > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.vw.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f10);
                }
            });
            view.setClipToOutline(true);
        }
    }

    private static Bitmap emc(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("UIUtils", th.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static float emc() {
        float f10 = ru;
        if (f10 > 0.0f) {
            return f10;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.aa.emc().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        ru = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void emc(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ul.xq("UIUtils", e10.getMessage());
        }
    }

    public static int emc(String str, Activity activity) throws ClassNotFoundException {
        if (sb.bw()) {
            try {
                Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e10) {
                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e10.getMessage());
            } catch (IllegalAccessException e11) {
                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e11.getMessage());
            } catch (IllegalArgumentException e12) {
                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e12.getMessage());
            } catch (NoSuchMethodException e13) {
                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e13.getMessage());
            } catch (InvocationTargetException e14) {
                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e14.getMessage());
            }
        }
        return 0;
    }

    public static void emc(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.ul.xq("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void emc(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.ul.xq("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void emc(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
    }

    public static void emc(TextView textView, com.bytedance.sdk.openadsdk.core.widget.vk vkVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        emc(textView, vkVar, rieVar, 14);
    }

    public static void emc(TextView textView, com.bytedance.sdk.openadsdk.core.widget.vk vkVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i10) {
        emc(textView, vkVar, (rieVar == null || rieVar.mjd() == null) ? -1.0d : rieVar.mjd().dg(), i10);
    }

    public static void emc(TextView textView, com.bytedance.sdk.openadsdk.core.widget.vk vkVar, double d10, int i10) {
        if (d10 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            vkVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d10)));
            }
            emc(vkVar, d10, i10);
        }
    }

    public static void emc(com.bytedance.sdk.openadsdk.core.widget.vk vkVar, double d10, int i10) {
        if (d10 < 0.0d) {
            vkVar.setVisibility(8);
        } else {
            vkVar.setVisibility(0);
            vkVar.emc(d10, i10);
        }
    }

    public static Bitmap emc(com.bytedance.sdk.component.zz.ycc yccVar) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        WebView webView = yccVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapYpw = ypw(yccVar);
        if (bitmapYpw == null) {
            bitmapYpw = emc(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapYpw == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.dg.emc(bitmapYpw, bitmapYpw.getWidth() / 6, bitmapYpw.getHeight() / 6);
    }

    public static void emc(final com.bytedance.sdk.openadsdk.core.model.rie rieVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j10) {
        iyl.ypw(new com.bytedance.sdk.component.msw.msw("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.vw.3
            @Override // java.lang.Runnable
            public void run() {
                vw.xq(rieVar, str, str2, bitmap, str3, j10);
            }
        }, 10);
    }

    public static int emc(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListYpw = ypw(bitmap);
            if (arrayListYpw == null) {
                return -1;
            }
            HashMap map = new HashMap();
            int size = arrayListYpw.size();
            int iIntValue = 0;
            int i10 = 0;
            while (i10 < size) {
                Integer num = arrayListYpw.get(i10);
                i10++;
                Integer num2 = num;
                if (map.containsKey(num2)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(num2)).intValue() + 1);
                    map.remove(num2);
                    map.put(num2, numValueOf);
                } else {
                    map.put(num2, 1);
                }
            }
            int i11 = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i11 < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i11 = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i11 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean emc(float f10, float f11, Context context) {
        if (f10 != -1.0f && f11 != -1.0f) {
            if (msw == null) {
                msw = ViewConfiguration.get(context);
            }
            if (zz == -1) {
                zz = msw.getScaledTouchSlop();
            }
            if (f10 - f11 > zz) {
                return true;
            }
        }
        return false;
    }

    public static void emc(boolean z10) {
        gbl = Boolean.valueOf(z10);
    }
}
