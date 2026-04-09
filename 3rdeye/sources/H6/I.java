package H6;

import L0.I;
import L0.InterfaceC0788t;
import L0.X;
import N7.G8;
import O4.C1461g;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.core.impl.C0;
import androidx.work.impl.WorkDatabase;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import h.LayoutInflaterFactory2C4402f;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m0.C5308a;
import o.f0;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;
import r.InterfaceC5503a;
import s6.i;
import t4.C5607e;
import u4.C5633b;
import u4.InterfaceC5634c;
import y.C5787a;
import z0.C5848a;

/* compiled from: DivViewIdProvider.kt */
/* loaded from: classes.dex */
public final class I implements I.a, i.a, S1.n, InterfaceC0788t, InterfaceC5634c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2052b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2053c;

    public /* synthetic */ I(Object obj, int i) {
        this.f2052b = i;
        this.f2053c = obj;
    }

    @Override // S1.n
    public String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f2053c).getSupportedFeatures();
    }

    @Override // I.a
    public A4.a apply(Object obj) {
        return I.j.e(((InterfaceC5503a) this.f2053c).apply(obj));
    }

    @Override // s6.i.a
    public void b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            ((O6.B) this.f2053c).setChecked(bool.booleanValue());
        }
    }

    @Override // s6.i.a
    public void c(i.b bVar) {
        ((O6.B) this.f2053c).setOnCheckedChangeListener(bVar);
    }

    @Override // S1.n
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) ka.a.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f2053c).createWebView(webView));
    }

    @Override // L0.InterfaceC0788t
    public X d(View view, X x10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z10;
        boolean z11;
        int iD = x10.d();
        LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = (LayoutInflaterFactory2C4402f) this.f2053c;
        layoutInflaterFactory2C4402f.getClass();
        int iD2 = x10.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C4402f.f38029w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C4402f.f38029w.getLayoutParams();
            if (layoutInflaterFactory2C4402f.f38029w.isShown()) {
                if (layoutInflaterFactory2C4402f.f38012e0 == null) {
                    layoutInflaterFactory2C4402f.f38012e0 = new Rect();
                    layoutInflaterFactory2C4402f.f38013f0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C4402f.f38012e0;
                Rect rect2 = layoutInflaterFactory2C4402f.f38013f0;
                rect.set(x10.b(), x10.d(), x10.c(), x10.a());
                ViewGroup viewGroup = layoutInflaterFactory2C4402f.f37984C;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z12 = f0.f44665a;
                    f0.a.a(viewGroup, rect, rect2);
                } else {
                    if (!f0.f44665a) {
                        f0.f44665a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            f0.f44666b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                f0.f44666b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = f0.f44666b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e4) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e4);
                        }
                    }
                }
                int i = rect.top;
                int i10 = rect.left;
                int i11 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C4402f.f37984C;
                WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
                X xA = I.e.a(viewGroup2);
                int iB = xA == null ? 0 : xA.b();
                int iC = xA == null ? 0 : xA.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i10;
                    marginLayoutParams.rightMargin = i11;
                    z11 = true;
                }
                Context context = layoutInflaterFactory2C4402f.f38018l;
                if (i <= 0 || layoutInflaterFactory2C4402f.f37986E != null) {
                    View view2 = layoutInflaterFactory2C4402f.f37986E;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i12 = marginLayoutParams2.height;
                        int i13 = marginLayoutParams.topMargin;
                        if (i12 != i13 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i13;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            layoutInflaterFactory2C4402f.f37986E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C4402f.f37986E = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    layoutInflaterFactory2C4402f.f37984C.addView(layoutInflaterFactory2C4402f.f37986E, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C4402f.f37986E;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C4402f.f37986E;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? C5848a.getColor(context, R.color.abc_decor_view_status_guard_light) : C5848a.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C4402f.f37991J && z) {
                    iD2 = 0;
                }
                z10 = z;
                z = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z = false;
            }
            if (z) {
                layoutInflaterFactory2C4402f.f38029w.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C4402f.f37986E;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return L0.I.j(view, iD != iD2 ? x10.f(x10.b(), iD2, x10.c(), x10.a()) : x10);
    }

    public synchronized void e(U9.H route) {
        kotlin.jvm.internal.l.f(route, "route");
        ((LinkedHashSet) this.f2053c).remove(route);
    }

    public int f(String str) {
        if (str == null) {
            return -1;
        }
        C5308a c5308a = (C5308a) this.f2053c;
        Object objValueOf = c5308a.get(str);
        if (objValueOf == null) {
            WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
            objValueOf = Integer.valueOf(View.generateViewId());
            c5308a.put(str, objValueOf);
        }
        return ((Number) objValueOf).intValue();
    }

    public JSONObject g() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f2053c;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(C1461g.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        C1461g.b(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    C1461g.b(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            C1461g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            C1461g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // S1.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) ka.a.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f2053c).getStatics());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h() {
        /*
            r5 = this;
            r0 = 0
            java.lang.Object r1 = r5.f2053c
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r1 = (androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk) r1
            if (r1 == 0) goto L20
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            r4 = 1
            if (r2 >= r3) goto L13
            r1.getClass()
        L11:
            r1 = r0
            goto L1d
        L13:
            w.l r1 = r1.f14831a
            r2 = 5
            int r1 = v.C5658m.p(r1, r2)
            if (r1 != r2) goto L11
            r1 = r4
        L1d:
            if (r1 != 0) goto L20
            r0 = r4
        L20:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "shouldUseFlashModeTorch: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "UseFlashModeTorchFor3aUpdate"
            C.S.a(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.I.h():boolean");
    }

    @Override // u4.InterfaceC5634c
    public Object zza() {
        switch (this.f2052b) {
            case 14:
                Context context = (Context) ((A3.c) ((I) this.f2053c).f2053c).f36c;
                G8.r("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("AppUpdateListenerRegistry");
                new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
                C5607e c5607e = new C5607e();
                new HashSet();
                context.getApplicationContext();
                return c5607e;
            default:
                return (Context) ((A3.c) this.f2053c).f36c;
        }
    }

    public I(A3.c cVar) {
        this.f2052b = 16;
        I i = new I(cVar, 15);
        InterfaceC5634c interfaceC5634cA = C5633b.a(new K4.b(5, i, C5633b.a(new B7.e(i, 11))));
        InterfaceC5634c interfaceC5634cA2 = C5633b.a(new I(i, 14));
        N5.c cVar2 = new N5.c();
        cVar2.f4674b = interfaceC5634cA;
        cVar2.f4675c = interfaceC5634cA2;
        cVar2.f4676d = i;
        this.f2053c = C5633b.a(new B7.e(C5633b.a(cVar2), 10));
    }

    public I(u6.a typefaceProvider) {
        this.f2052b = 17;
        kotlin.jvm.internal.l.f(typefaceProvider, "typefaceProvider");
        this.f2053c = typefaceProvider;
    }

    public I(int i) {
        this.f2052b = i;
        switch (i) {
            case 4:
                this.f2053c = new HashMap();
                new HashMap();
                break;
            case 8:
                this.f2053c = new LinkedHashSet();
                break;
            case 18:
                this.f2053c = (ExtraSupportedSurfaceCombinationsQuirk) C5787a.f47852a.e(ExtraSupportedSurfaceCombinationsQuirk.class);
                break;
            default:
                this.f2053c = new C5308a();
                break;
        }
    }

    public I(WorkDatabase workDatabase) {
        this.f2052b = 9;
        kotlin.jvm.internal.l.f(workDatabase, "workDatabase");
        this.f2053c = workDatabase;
    }

    public I(T4.e eVar) {
        this.f2052b = 7;
        this.f2053c = new File(eVar.f12285c, "com.crashlytics.settings.json");
    }

    public I(C0 c02) {
        this.f2052b = 19;
        this.f2053c = (TorchFlashRequiredFor3aUpdateQuirk) c02.e(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public I(y7.n scrollableViewPager) {
        this.f2052b = 5;
        kotlin.jvm.internal.l.f(scrollableViewPager, "scrollableViewPager");
        this.f2053c = scrollableViewPager;
    }
}
