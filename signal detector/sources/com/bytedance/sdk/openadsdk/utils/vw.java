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

    private static boolean emc(int i) {
        return i == 0 || i == 8 || i == 4;
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

    public static int xq(Context context, float f2) {
        emc(context, true);
        float fMsw = msw(context);
        if (fMsw <= 0.0f) {
            fMsw = 1.0f;
        }
        return (int) ((f2 / fMsw) + 0.5f);
    }

    public static int ypw(Context context, float f2) {
        if (f2 == 0.0f) {
            return 0;
        }
        return Float.valueOf(emc(context, f2, true)).intValue();
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

    public static void emc(Context context, boolean z6) {
        Context contextEmc = context == null ? com.bytedance.sdk.openadsdk.core.aa.emc() : context;
        if (contextEmc == null) {
            return;
        }
        uym = (WindowManager) contextEmc.getSystemService("window");
        if (xq() || z6) {
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
            int i = dg;
            int i3 = bw;
            if (i > i3) {
                dg = i3;
                bw = i;
            }
        } else {
            int i6 = dg;
            int i7 = bw;
            if (i6 < i7) {
                dg = i7;
                bw = i6;
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
            int i = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i = point.x;
                i3 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i;
            iArr[1] = i3;
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
            } catch (Exception e6) {
                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e6.getMessage());
            }
        }
        return false;
    }

    public static int xq(Context context) {
        emc(context);
        return dg;
    }

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
                onAnimationEnd(animator);
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
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    if (str.equals(jSONArray.getString(i))) {
                                        gbl = Boolean.TRUE;
                                        return true;
                                    }
                                }
                            } catch (Exception e6) {
                                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e6.getMessage());
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

    public static float emc(Context context, float f2) {
        emc(context);
        return zz(context) * f2;
    }

    public static int[] ypw(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static float emc(Context context, float f2, boolean z6) {
        emc(context);
        return (msw(context) * f2) + (z6 ? 0.5f : 0.0f);
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

    public static void emc(View view, int i) {
        if (view == null || view.getVisibility() == i || !emc(i)) {
            return;
        }
        view.setVisibility(i);
    }

    public static void emc(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void xq(final com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str, String str2, final Bitmap bitmap, final String str3, final long j6) {
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
                                long j7 = j6;
                                if (j7 != -1) {
                                    jSONObject.put("page_id", j7);
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

    public static void emc(View view, int i, int i3, int i6, int i7) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        emc(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i3, i6, i7);
    }

    private static ArrayList<Integer> ypw(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i3 = 0; i3 < i; i3++) {
                int i6 = iArr[i3];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i6) >> 16, (65280 & i6) >> 8, i6 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void emc(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i3, int i6, int i7) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i3 && marginLayoutParams.rightMargin == i6 && marginLayoutParams.bottomMargin == i7) {
            return;
        }
        if (i != -3) {
            marginLayoutParams.leftMargin = i;
        }
        if (i3 != -3) {
            marginLayoutParams.topMargin = i3;
        }
        if (i6 != -3) {
            marginLayoutParams.rightMargin = i6;
        }
        if (i7 != -3) {
            marginLayoutParams.bottomMargin = i7;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void ypw(View view, final float f2) {
        if (view != null && f2 > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.vw.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f2);
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
        float f2 = ru;
        if (f2 > 0.0f) {
            return f2;
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
        } catch (Exception e6) {
            com.bytedance.sdk.component.utils.ul.xq("UIUtils", e6.getMessage());
        }
    }

    public static int emc(String str, Activity activity) throws ClassNotFoundException {
        if (sb.bw()) {
            try {
                Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e6) {
                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e6.getMessage());
            } catch (IllegalAccessException e7) {
                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e7.getMessage());
            } catch (IllegalArgumentException e8) {
                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e8.getMessage());
            } catch (NoSuchMethodException e9) {
                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e9.getMessage());
            } catch (InvocationTargetException e10) {
                com.bytedance.sdk.component.utils.ul.xq("UIUtils", e10.getMessage());
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

    public static void emc(View view, float f2) {
        if (view == null) {
            return;
        }
        view.setAlpha(f2);
    }

    public static void emc(TextView textView, com.bytedance.sdk.openadsdk.core.widget.vk vkVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        emc(textView, vkVar, rieVar, 14);
    }

    public static void emc(TextView textView, com.bytedance.sdk.openadsdk.core.widget.vk vkVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i) {
        emc(textView, vkVar, (rieVar == null || rieVar.mjd() == null) ? -1.0d : rieVar.mjd().dg(), i);
    }

    public static void emc(TextView textView, com.bytedance.sdk.openadsdk.core.widget.vk vkVar, double d6, int i) {
        if (d6 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            vkVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d6)));
            }
            emc(vkVar, d6, i);
        }
    }

    public static void emc(com.bytedance.sdk.openadsdk.core.widget.vk vkVar, double d6, int i) {
        if (d6 < 0.0d) {
            vkVar.setVisibility(8);
        } else {
            vkVar.setVisibility(0);
            vkVar.emc(d6, i);
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

    public static void emc(final com.bytedance.sdk.openadsdk.core.model.rie rieVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j6) {
        iyl.ypw(new com.bytedance.sdk.component.msw.msw("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.vw.3
            @Override // java.lang.Runnable
            public void run() {
                vw.xq(rieVar, str, str2, bitmap, str3, j6);
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
            int i = 0;
            while (i < size) {
                Integer num = arrayListYpw.get(i);
                i++;
                Integer num2 = num;
                if (map.containsKey(num2)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(num2)).intValue() + 1);
                    map.remove(num2);
                    map.put(num2, numValueOf);
                } else {
                    map.put(num2, 1);
                }
            }
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i3 < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i3 = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i3 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean emc(float f2, float f5, Context context) {
        if (f2 != -1.0f && f5 != -1.0f) {
            if (msw == null) {
                msw = ViewConfiguration.get(context);
            }
            if (zz == -1) {
                zz = msw.getScaledTouchSlop();
            }
            if (f2 - f5 > zz) {
                return true;
            }
        }
        return false;
    }

    public static void emc(boolean z6) {
        gbl = Boolean.valueOf(z6);
    }
}
