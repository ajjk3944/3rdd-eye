package a4;

import L0.w;
import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import c.C0375O;
import com.apm.insight.R;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.C1448kw;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.G9;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.Qt;
import com.google.android.gms.internal.ads.XA;
import com.google.android.gms.internal.ads.YA;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.I0;
import o4.AbstractC2763b;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import t2.C2911G;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static g f4722a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4723b = true;

    /* renamed from: c, reason: collision with root package name */
    public static Field f4724c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4725d;

    public static JSONObject A(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                E9 e9 = H9.W8;
                C2841s c2841s = C2841s.f23267e;
                G9 g9 = c2841s.f23270c;
                G9 g92 = c2841s.f23270c;
                if (((Boolean) g9.a(e9)).booleanValue()) {
                    if (((Boolean) g92.a(H9.X8)).booleanValue()) {
                        C2911G c2911g = p2.j.f22785C.f22790c;
                        jSONObject.put("contained_in_scroll_view", C2911G.b(view) != 0);
                    }
                    if (((Boolean) g92.a(H9.Y8)).booleanValue()) {
                        C2911G c2911g2 = p2.j.f22785C.f22790c;
                        jSONObject.put("scroll_view_type", C2911G.b(view));
                        return jSONObject;
                    }
                } else {
                    C2911G c2911g3 = p2.j.f22785C.f22790c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) != -1);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject B(Context context, View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                C2911G c2911g = p2.j.f22785C.f22790c;
                jSONObject.put("can_show_on_lock_screen", C2911G.M(view));
                boolean z6 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z6 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z6);
                return jSONObject;
            } catch (JSONException unused) {
                u2.k.h("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject C(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) throws JSONException {
        int[] iArr;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                        try {
                            q2.r rVar = q2.r.f23260g;
                            jSONObject4.put("width", rVar.f23261a.h(context, measuredWidth));
                            jSONObject4.put("height", rVar.f23261a.h(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", rVar.f23261a.h(context, iArr3[0] - iArr[0]));
                            jSONObject4.put("y", rVar.f23261a.h(context, iArr3[1] - iArr[1]));
                            jSONObject4.put("relative_to", "ad_view");
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = H(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", rVar.f23261a.h(context, iArr3[0] - iArr[0]));
                                jSONObject.put("y", rVar.f23261a.h(context, iArr3[1] - iArr[1]));
                                jSONObject.put("relative_to", "ad_view");
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                E9 e9 = H9.Z8;
                                C2841s c2841s = C2841s.f23267e;
                                if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) c2841s.f23270c.a(H9.a9)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", I(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", I(layoutParams.height) - 1);
                                }
                                if (((Boolean) c2841s.f23270c.a(H9.b9)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) C2841s.f23267e.f23270c.a(H9.c9)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused) {
                            u2.k.h("Unable to get asset views information");
                            it = it2;
                            iArr2 = iArr;
                            i = 2;
                        }
                    } catch (JSONException unused2) {
                        iArr = iArr2;
                    }
                    it = it2;
                    iArr2 = iArr;
                    i = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject D(String str, Context context, Point point, Point point2) throws JSONException {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    int i = point2.x;
                    q2.r rVar = q2.r.f23260g;
                    jSONObject3.put("x", rVar.f23261a.h(context, i));
                    jSONObject3.put("y", rVar.f23261a.h(context, point2.y));
                    jSONObject3.put("start_x", rVar.f23261a.h(context, point.x));
                    jSONObject3.put("start_y", rVar.f23261a.h(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e6) {
                    u2.k.f("Error occurred while putting signals into JSON object.", e6);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e7) {
                e = e7;
                jSONObject = jSONObject2;
                u2.k.f("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }

    public static boolean E(Context context, Qt qt) {
        XA xa;
        if (!qt.f10744N) {
            return false;
        }
        E9 e9 = H9.d9;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (((Boolean) g9.a(e9)).booleanValue()) {
            return ((Boolean) g92.a(H9.g9)).booleanValue();
        }
        String str = (String) g92.a(H9.e9);
        if (str.isEmpty() || context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        C1448kw c1448kwF = C1448kw.f(new MA(';'));
        Iterator itE = ((YA) c1448kwF.f15314b).e(c1448kwF, str);
        do {
            xa = (XA) itE;
            if (!xa.hasNext()) {
                return false;
            }
        } while (!((String) xa.next()).equals(packageName));
        return true;
    }

    public static JSONObject F(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C2911G c2911g = p2.j.f22785C.f22790c;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        try {
            int i = displayMetrics.widthPixels;
            q2.r rVar = q2.r.f23260g;
            jSONObject.put("width", rVar.f23261a.h(context, i));
            jSONObject.put("height", rVar.f23261a.h(context, displayMetrics.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams G() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) C2841s.f23267e.f23270c.a(H9.f9)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject H(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i = rect.right - rect.left;
        q2.r rVar = q2.r.f23260g;
        jSONObject.put("width", rVar.f23261a.h(context, i));
        int i3 = rect.bottom - rect.top;
        u2.f fVar = rVar.f23261a;
        jSONObject.put("height", fVar.h(context, i3));
        jSONObject.put("x", fVar.h(context, rect.left));
        jSONObject.put("y", fVar.h(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int I(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
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
    public static final java.lang.Object a(java.util.List r6, a0.u r7, j5.b r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof a0.C0249c
            if (r0 == 0) goto L13
            r0 = r8
            a0.c r0 = (a0.C0249c) r0
            int r1 = r0.f4569g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4569g = r1
            goto L18
        L13:
            a0.c r0 = new a0.c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4568f
            int r1 = r0.f4569g
            r2 = 2
            r3 = 1
            i5.a r4 = i5.EnumC2380a.f20635a
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.util.Iterator r6 = r0.f4567e
            java.io.Serializable r7 = r0.f4566d
            q5.o r7 = (q5.o) r7
            R2.a.H(r8)     // Catch: java.lang.Throwable -> L30
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
            java.io.Serializable r6 = r0.f4566d
            java.util.List r6 = (java.util.List) r6
            R2.a.H(r8)
            goto L5c
        L42:
            R2.a.H(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            a0.e r1 = new a0.e
            r5 = 0
            r1.<init>(r6, r8, r5)
            r0.f4566d = r8
            r0.f4569g = r3
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 != r4) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            q5.o r7 = new q5.o
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            p5.l r8 = (p5.l) r8
            r0.f4566d = r7     // Catch: java.lang.Throwable -> L30
            r0.f4567e = r6     // Catch: java.lang.Throwable -> L30
            r0.f4569g = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.f(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r4) goto L65
            goto L93
        L7e:
            java.lang.Object r1 = r7.f23299a
            if (r1 != 0) goto L85
            r7.f23299a = r8
            goto L65
        L85:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.bumptech.glide.e.b(r1, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f23299a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            c5.i r4 = c5.C0412i.f5929a
        L93:
            return r4
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.t.a(java.util.List, a0.u, j5.b):java.lang.Object");
    }

    public static void c(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int f(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, G.d.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static void g(BaseViewHolder baseViewHolder, int i) {
        q5.i.e(baseViewHolder, "holder");
        AbstractC2763b.g(i, "loadMoreStatus");
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            baseViewHolder.getView(R.id.load_more_loading_view).setVisibility(8);
            baseViewHolder.getView(R.id.load_more_load_complete_view).setVisibility(0);
            baseViewHolder.getView(R.id.load_more_load_fail_view).setVisibility(8);
            baseViewHolder.getView(R.id.load_more_load_end_view).setVisibility(8);
            return;
        }
        if (iC == 1) {
            baseViewHolder.getView(R.id.load_more_loading_view).setVisibility(0);
            baseViewHolder.getView(R.id.load_more_load_complete_view).setVisibility(8);
            baseViewHolder.getView(R.id.load_more_load_fail_view).setVisibility(8);
            baseViewHolder.getView(R.id.load_more_load_end_view).setVisibility(8);
            return;
        }
        if (iC == 2) {
            baseViewHolder.getView(R.id.load_more_loading_view).setVisibility(8);
            baseViewHolder.getView(R.id.load_more_load_complete_view).setVisibility(8);
            baseViewHolder.getView(R.id.load_more_load_fail_view).setVisibility(0);
            baseViewHolder.getView(R.id.load_more_load_end_view).setVisibility(8);
            return;
        }
        if (iC != 3) {
            return;
        }
        baseViewHolder.getView(R.id.load_more_loading_view).setVisibility(8);
        baseViewHolder.getView(R.id.load_more_load_complete_view).setVisibility(8);
        baseViewHolder.getView(R.id.load_more_load_fail_view).setVisibility(8);
        baseViewHolder.getView(R.id.load_more_load_end_view).setVisibility(0);
    }

    public static final C0.o h(Context context, Class cls, String str) {
        q5.i.e(context, "context");
        if (y5.l.b0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new C0.o(context, cls, str);
    }

    public static Drawable i(Context context, int i) {
        return I0.d().f(context, i);
    }

    public static P.d j(AppCompatTextView appCompatTextView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new P.d(K.a.k(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (appCompatTextView.getInputType() & 15) != 3) {
                boolean z6 = appCompatTextView.getLayoutDirection() == 1;
                switch (appCompatTextView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z6) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(K.a.c(N.e.e(appCompatTextView.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new P.d(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean l(Context context) {
        if (context != null) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (locationManager == null) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return locationManager.isLocationEnabled();
            }
            boolean zIsProviderEnabled = locationManager.getAllProviders().contains("gps") ? locationManager.isProviderEnabled("gps") : false;
            boolean zIsProviderEnabled2 = locationManager.getAllProviders().contains("network") ? locationManager.isProviderEnabled("network") : false;
            if (zIsProviderEnabled || zIsProviderEnabled2) {
                return true;
            }
        }
        return false;
    }

    public static float m(float f2, float f5, float f6) {
        return (f6 * f5) + ((1.0f - f6) * f2);
    }

    public static void n(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void o(TextView textView, int i) {
        d(i);
        if (Build.VERSION.SDK_INT >= 28) {
            K.a.n(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void p(TextView textView, int i) {
        d(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i3);
        }
    }

    public static void q(TextView textView, int i) {
        d(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static ActionMode.Callback u(ActionMode.Callback callback) {
        return (!(callback instanceof U.h) || Build.VERSION.SDK_INT < 26) ? callback : ((U.h) callback).f3659a;
    }

    public static ActionMode.Callback v(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof U.h) || callback == null) ? callback : new U.h(callback, textView);
    }

    public static String w(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(y(objArr[i]));
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(y(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean x(int i) {
        E9 e9 = H9.f8749g4;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            return ((Boolean) c2841s.f23270c.a(H9.f8756h4)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    public static String y(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e6) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strN = AbstractC1135f5.n(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strN), (Throwable) e6);
            String name2 = e6.getClass().getName();
            StringBuilder sb = new StringBuilder(strN.length() + 8 + name2.length() + 1);
            A.f.w(sb, "<", strN, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c A[Catch: JSONException -> 0x0145, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0145, blocks: (B:32:0x0114, B:49:0x0141, B:52:0x0147, B:53:0x014c), top: B:71:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject z(android.content.Context r17, android.view.View r18) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.t.z(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public float k(View view) {
        if (f4723b) {
            try {
                return w.a(view);
            } catch (NoSuchMethodError unused) {
                f4723b = false;
            }
        }
        return view.getAlpha();
    }

    public void r(View view, float f2) {
        if (f4723b) {
            try {
                w.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f4723b = false;
            }
        }
        view.setAlpha(f2);
    }

    public void s(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f4725d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f4724c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f4725d = true;
        }
        Field field = f4724c;
        if (field != null) {
            try {
                f4724c.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void t(C0375O c0375o, C0375O c0375o2, Window window, View view, boolean z6, boolean z7);

    public void b(Window window) {
    }
}
