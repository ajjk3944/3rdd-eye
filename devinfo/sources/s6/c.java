package s6;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import com.google.android.gms.internal.measurement.j4;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements b, e, g {

    /* renamed from: c, reason: collision with root package name */
    public static final c f33473c = new c(0);

    /* renamed from: d, reason: collision with root package name */
    public static final c f33474d = new c(1);

    /* renamed from: e, reason: collision with root package name */
    public static final c f33475e = new c(2);

    /* renamed from: f, reason: collision with root package name */
    public static final c f33476f = new c(3);
    public static final c g = new c(4);

    /* renamed from: h, reason: collision with root package name */
    public static final c f33477h = new c(5);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33478b;

    public /* synthetic */ c(int i4) {
        this.f33478b = i4;
    }

    @Override // s6.b
    public Rect a(Activity activity) throws Exception {
        int i4;
        DisplayCutout displayCutoutA;
        switch (this.f33478b) {
            case 0:
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                k.b(defaultDisplay);
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Rect rect = new Rect();
                int i10 = point.x;
                if (i10 == 0 || (i4 = point.y) == 0) {
                    defaultDisplay.getRectSize(rect);
                } else {
                    rect.right = i10;
                    rect.bottom = i4;
                }
                return rect;
            case 1:
                Rect rect2 = new Rect();
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay2.getRectSize(rect2);
                if (!j4.o(activity)) {
                    Point point2 = new Point();
                    defaultDisplay2.getRealSize(point2);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i11 = rect2.bottom + dimensionPixelSize;
                    if (i11 == point2.y) {
                        rect2.bottom = i11;
                    } else {
                        int i12 = rect2.right + dimensionPixelSize;
                        if (i12 == point2.x) {
                            rect2.right = i12;
                        }
                    }
                }
                return rect2;
            case 2:
                Rect rect3 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (j4.o(activity)) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        k.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                        rect3.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        k.c(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                        rect3.set((Rect) objInvoke2);
                    }
                } catch (Exception e2) {
                    if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                        throw e2;
                    }
                    b.f33472a.getClass();
                    Log.w(a.f33471b, e2);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect3);
                }
                Display defaultDisplay3 = activity.getWindowManager().getDefaultDisplay();
                Point point3 = new Point();
                defaultDisplay3.getRealSize(point3);
                if (!j4.o(activity)) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i13 = rect3.bottom + dimensionPixelSize2;
                    if (i13 == point3.y) {
                        rect3.bottom = i13;
                    } else {
                        int i14 = rect3.right + dimensionPixelSize2;
                        if (i14 == point3.x) {
                            rect3.right = i14;
                        } else if (rect3.left == dimensionPixelSize2) {
                            rect3.left = 0;
                        }
                    }
                }
                if ((rect3.width() < point3.x || rect3.height() < point3.y) && !j4.o(activity) && (displayCutoutA = a4.f.a(defaultDisplay3)) != null) {
                    if (rect3.left == a4.f.y(displayCutoutA)) {
                        rect3.left = 0;
                    }
                    if (point3.x - rect3.right == a4.f.z(displayCutoutA)) {
                        rect3.right = a4.f.z(displayCutoutA) + rect3.right;
                    }
                    if (rect3.top == a4.f.A(displayCutoutA)) {
                        rect3.top = 0;
                    }
                    if (point3.y - rect3.bottom == a4.f.x(displayCutoutA)) {
                        rect3.bottom = a4.f.x(displayCutoutA) + rect3.bottom;
                    }
                }
                return rect3;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField2 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(configuration2);
                    Object objInvoke3 = obj2.getClass().getDeclaredMethod("getBounds", null).invoke(obj2, null);
                    k.c(objInvoke3, "null cannot be cast to non-null type android.graphics.Rect");
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchFieldException) && !(e10 instanceof NoSuchMethodException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof InvocationTargetException)) {
                        throw e10;
                    }
                    b.f33472a.getClass();
                    Log.w(a.f33471b, e10);
                    return f33475e.a(activity);
                }
        }
    }

    @Override // s6.e
    public float b(ContextWrapper contextWrapper) {
        return contextWrapper.getResources().getDisplayMetrics().density;
    }

    @Override // s6.g
    public r6.a c(ContextWrapper contextWrapper, e eVar) {
        k.e(eVar, "densityCompatHelper");
        Context baseContext = contextWrapper;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = contextWrapper;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper2.getBaseContext();
            k.d(baseContext, "getBaseContext(...)");
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            b.f33472a.getClass();
            int i4 = Build.VERSION.SDK_INT;
            return new r6.a(new q6.a((i4 >= 30 ? d.f33479b : i4 >= 29 ? f33476f : i4 >= 28 ? f33475e : i4 >= 24 ? f33474d : f33473c).a(activity)), eVar.b(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Object systemService = contextWrapper.getSystemService("window");
        k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        k.d(defaultDisplay, "getDefaultDisplay(...)");
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new r6.a(new Rect(0, 0, point.x, point.y), eVar.b(contextWrapper));
    }
}
