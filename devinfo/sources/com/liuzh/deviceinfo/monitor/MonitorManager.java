package com.liuzh.deviceinfo.monitor;

import a4.a;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.hardware.input.InputManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.kf;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nk.k;
import sh.r;
import wg.g;
import wg.s;
import wg.u;
import wi.h;
import zj.o;
import zj.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class MonitorManager {

    /* renamed from: f, reason: collision with root package name */
    public static final MonitorManager f21223f = new MonitorManager();

    /* renamed from: a, reason: collision with root package name */
    public final DeviceInfoApp f21224a;

    /* renamed from: b, reason: collision with root package name */
    public final WindowManager f21225b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f21226c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f21227d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f21228e;

    @Keep
    private final SharedPreferences.OnSharedPreferenceChangeListener mPrefListener;

    public MonitorManager() {
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        this.f21224a = deviceInfoApp;
        WindowManager windowManager = (WindowManager) deviceInfoApp.getSystemService("window");
        this.f21225b = windowManager;
        Point point = new Point();
        this.f21226c = point;
        this.f21227d = new HashMap();
        this.f21228e = new HashMap();
        r rVar = new r(1, this);
        this.mPrefListener = rVar;
        kf kfVar = new kf(13, this);
        f fVar = f.f21256b;
        f.n(rVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.setPriority(999);
        deviceInfoApp.registerReceiver(kfVar, intentFilter);
        windowManager.getDefaultDisplay().getRealSize(point);
    }

    public final WindowManager.LayoutParams a(Boolean bool) {
        int identifier;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.x = 0;
        DeviceInfoApp deviceInfoApp = this.f21224a;
        k.e(deviceInfoApp, "context");
        if (a.f185a == -1 && (identifier = deviceInfoApp.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            a.f185a = deviceInfoApp.getResources().getDimensionPixelSize(identifier);
        }
        layoutParams.y = a.f185a;
        layoutParams.height = -2;
        layoutParams.width = -2;
        if (h.f36757b) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = AdError.INTERNAL_ERROR_2003;
        }
        layoutParams.flags = 776;
        if (bool == null) {
            f fVar = f.f21256b;
            bool = Boolean.valueOf(!f.f21257c.getBoolean("monitor_fixed_position", false));
        }
        if (!bool.booleanValue()) {
            layoutParams.flags |= 48;
        }
        layoutParams.format = 1;
        return layoutParams;
    }

    public final Point b() {
        wg.a aVar;
        synchronized (this.f21228e) {
            aVar = (wg.a) this.f21228e.get("monitor_preview");
        }
        if (!(aVar instanceof g)) {
            return null;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) ((g) aVar).f36665c.getLayoutParams();
        return new Point(layoutParams.x, layoutParams.y);
    }

    public final void c(String str, boolean z3) {
        wg.a aVar;
        synchronized (this.f21228e) {
            aVar = (wg.a) this.f21228e.get(str);
        }
        if (aVar instanceof g) {
            ((g) aVar).f36665c.setVisibility(z3 ? 8 : 0);
        }
    }

    public final boolean d(String str) {
        boolean z3;
        synchronized (this.f21228e) {
            z3 = this.f21228e.get(str) != null;
        }
        return z3;
    }

    public final void e() {
        synchronized (this.f21227d) {
            try {
                HashSet hashSet = new HashSet();
                Iterator it = this.f21227d.entrySet().iterator();
                while (it.hasNext()) {
                    hashSet.add((String) ((Map.Entry) it.next()).getKey());
                }
                f.f21257c.edit().putStringSet("monitor_opened", hashSet).apply();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(String str) {
        wg.a aVar;
        synchronized (this.f21228e) {
            aVar = (wg.a) this.f21228e.remove(str);
        }
        if (aVar instanceof g) {
            g gVar = (g) aVar;
            gVar.e();
            this.f21225b.removeViewImmediate(gVar.f36665c);
            if (this.f21228e.isEmpty()) {
                String str2 = MonitorService.f21229a;
                if (!h.f36763i) {
                    DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                    deviceInfoApp.stopService(new Intent(deviceInfoApp, (Class<?>) MonitorService.class));
                } else {
                    NotificationManager notificationManager = MonitorService.f21230b;
                    if (notificationManager != null) {
                        notificationManager.cancel(2110271338);
                    }
                }
            }
        }
    }

    public final void g(CustomMonitorConfig customMonitorConfig) {
        g gVar;
        boolean z3;
        LinearLayout linearLayout;
        List<s> content;
        List<s> content2;
        synchronized (this.f21228e) {
            gVar = (g) this.f21228e.get(customMonitorConfig.getId());
        }
        boolean z10 = gVar != null;
        if (gVar == null) {
            gVar = new g();
            gVar.a();
        }
        boolean z11 = z10;
        LinearLayout linearLayout2 = gVar.f36665c;
        if (linearLayout2.getBackground() == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(this.f21224a.getResources().getDimensionPixelSize(R.dimen.common_card_radius));
            gradientDrawable.setTint(-13684945);
            linearLayout2.setBackground(gradientDrawable);
        }
        LinkedHashMap linkedHashMap = gVar.f36667e;
        if (k.a(gVar.f36675o, customMonitorConfig) || (linearLayout = gVar.f36665c) == null) {
            z3 = z11;
        } else {
            int iB = a.b(customMonitorConfig.getContainerPaddingDp());
            linearLayout.setPadding(iB, iB, iB, iB);
            CustomMonitorConfig customMonitorConfig2 = gVar.f36675o;
            if (customMonitorConfig2 == null || customMonitorConfig.getVerticalLayout() != customMonitorConfig2.getVerticalLayout()) {
                if (customMonitorConfig.getVerticalLayout()) {
                    linearLayout.setOrientation(1);
                    linearLayout.setGravity(8388611);
                } else {
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(16);
                }
            }
            int iB2 = customMonitorConfig.getVerticalLayout() ? 0 : a.b(customMonitorConfig.getItemSpacingDp());
            int iB3 = customMonitorConfig.getVerticalLayout() ? a.b(customMonitorConfig.getItemSpacingDp()) : 0;
            int childCount = linearLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                linearLayout.getChildAt(i4).setPadding(iB2, iB3, iB2, iB3);
            }
            float transparency = customMonitorConfig.getTransparency();
            CustomMonitorConfig customMonitorConfig3 = gVar.f36675o;
            Float fValueOf = customMonitorConfig3 != null ? Float.valueOf(customMonitorConfig3.getTransparency()) : null;
            if (fValueOf == null || transparency != fValueOf.floatValue()) {
                linearLayout.getBackground().setAlpha((int) (customMonitorConfig.getTransparency() * 255));
            }
            CustomMonitorConfig customMonitorConfig4 = gVar.f36675o;
            if (customMonitorConfig4 == null || (content = customMonitorConfig4.getContent()) == null) {
                content = zj.s.f38317a;
            }
            List<s> content3 = customMonitorConfig.getContent();
            int iH = w.H(o.T(content, 10));
            if (iH < 16) {
                iH = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH);
            for (Object obj : content) {
                linkedHashMap2.put(((s) obj).name(), obj);
            }
            int iH2 = w.H(o.T(content3, 10));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iH2 >= 16 ? iH2 : 16);
            for (Object obj2 : content3) {
                linkedHashMap3.put(((s) obj2).name(), obj2);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : content3) {
                boolean z12 = z11;
                if (!linkedHashMap2.containsKey(((s) obj3).name())) {
                    arrayList.add(obj3);
                }
                z11 = z12;
            }
            z3 = z11;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : content) {
                if (!linkedHashMap3.containsKey(((s) obj4).name())) {
                    arrayList2.add(obj4);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (s sVar : content3) {
                if (((s) linkedHashMap2.get(sVar.name())) != null) {
                    arrayList3.add(sVar);
                }
            }
            CustomMonitorConfig customMonitorConfig5 = gVar.f36675o;
            if (customMonitorConfig5 == null || ((content2 = customMonitorConfig5.getContent()) != null && content2.isEmpty())) {
                linearLayout.removeAllViews();
            }
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj5 = arrayList2.get(i10);
                i10++;
                View view = (ViewGroup) linkedHashMap.remove(((s) obj5).name());
                if (view != null) {
                    linearLayout.removeView(view);
                }
            }
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj6 = arrayList3.get(i11);
                i11++;
                s sVar2 = (s) obj6;
                ViewGroup viewGroup = (ViewGroup) linkedHashMap.get(sVar2.name());
                k.b(viewGroup);
                gVar.k(viewGroup, sVar2, customMonitorConfig);
            }
            int size3 = arrayList.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj7 = arrayList.get(i12);
                i12++;
                s sVar3 = (s) obj7;
                LinearLayout linearLayout3 = new LinearLayout(gVar.f36664b);
                TextView textView = new TextView(linearLayout3.getContext());
                textView.setText(gVar.h(sVar3, customMonitorConfig.getShowName()));
                textView.setTextColor(customMonitorConfig.getDarkText() ? -16777216 : -1);
                textView.setTextSize(customMonitorConfig.getTextSizeSp());
                textView.setSingleLine(true);
                linearLayout3.addView(textView, gVar.f(sVar3, customMonitorConfig), -2);
                linearLayout3.setPadding(iB2, iB3, iB2, iB3);
                linearLayout.addView(linearLayout3, -2, -2);
                linkedHashMap.put(sVar3.name(), linearLayout3);
            }
            if (linearLayout.getChildCount() == 0) {
                linearLayout.addView(gVar.g());
            }
            linearLayout.requestLayout();
            gVar.f36675o = customMonitorConfig;
        }
        boolean zV = a.v(this.f21224a.getResources());
        this.f21225b.getDefaultDisplay().getRealSize(this.f21226c);
        if (linearLayout2.getMeasuredHeight() == 0 || linearLayout2.getMeasuredWidth() == 0) {
            int iB4 = a.b(28.0f);
            linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(this.f21226c.x - iB4, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(this.f21226c.y - (iB4 * 2), LinearLayoutManager.INVALID_OFFSET));
        }
        int portraitX = zV ? customMonitorConfig.getPortraitX() : customMonitorConfig.getLandscapeX();
        int portraitY = zV ? customMonitorConfig.getPortraitY() : customMonitorConfig.getLandscapeY();
        if (portraitX == Integer.MIN_VALUE) {
            portraitX = (this.f21226c.x / 2) - (linearLayout2.getMeasuredWidth() / 2);
        }
        if (portraitY == Integer.MIN_VALUE) {
            portraitY = (this.f21226c.y / 4) - (linearLayout2.getMeasuredHeight() / 2);
        }
        int iMin = Math.min(Math.max(portraitX, 0), this.f21226c.x - linearLayout2.getMeasuredWidth());
        int iMin2 = Math.min(Math.max(portraitY, 0), this.f21226c.y - linearLayout2.getMeasuredHeight());
        WindowManager.LayoutParams layoutParamsA = z3 ? (WindowManager.LayoutParams) linearLayout2.getLayoutParams() : a(Boolean.valueOf(customMonitorConfig.getMoveable()));
        i(layoutParamsA, Boolean.valueOf(customMonitorConfig.getMoveable()));
        layoutParamsA.x = iMin;
        layoutParamsA.y = iMin2;
        if (z3) {
            this.f21225b.updateViewLayout(linearLayout2, layoutParamsA);
            return;
        }
        gVar.d();
        MonitorService.c();
        synchronized (this.f21228e) {
            this.f21228e.put(customMonitorConfig.getId(), gVar);
        }
        this.f21225b.addView(linearLayout2, layoutParamsA);
        linearLayout2.setOnTouchListener(new u(this, false, layoutParamsA, new wg.f(gVar, 1), linearLayout2, null, customMonitorConfig.getId(), new wg.f(gVar, 2)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liuzh.deviceinfo.monitor.MonitorManager.h(java.lang.String):void");
    }

    public final void i(WindowManager.LayoutParams layoutParams, Boolean bool) {
        if (h.g) {
            layoutParams.alpha = ((InputManager) this.f21224a.getSystemService(InputManager.class)).getMaximumObscuringOpacityForTouch();
        } else {
            layoutParams.alpha = 1.0f;
        }
        if (bool == null) {
            f fVar = f.f21256b;
            bool = Boolean.valueOf(!f.f21257c.getBoolean("monitor_fixed_position", false));
        }
        if (bool.booleanValue()) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
    }
}
