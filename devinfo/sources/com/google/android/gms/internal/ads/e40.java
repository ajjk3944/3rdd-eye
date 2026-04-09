package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e40 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10697a;

    /* renamed from: b, reason: collision with root package name */
    public View f10698b;

    public e40(Context context) {
        super(context);
        this.f10697a = context;
    }

    public static e40 a(Context context, View view, wp0 wp0Var) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        e40 e40Var = new e40(context);
        List list = wp0Var.f18110u;
        boolean zIsEmpty = list.isEmpty();
        Context context2 = e40Var.f10697a;
        if (!zIsEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f10 = ((xp0) list.get(0)).f18440a;
            float f11 = displayMetrics.density;
            e40Var.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (r5.f18441b * f11)));
        }
        e40Var.f10698b = view;
        e40Var.addView(view);
        hl hlVar = ua.j.C.B;
        kx kxVar = new kx(e40Var, e40Var);
        View view2 = (View) ((WeakReference) kxVar.f11937a).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            kxVar.v1(viewTreeObserver);
        }
        jx jxVar = new jx(e40Var, e40Var);
        View view3 = (View) ((WeakReference) jxVar.f11937a).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            jxVar.v1(viewTreeObserver3);
        }
        JSONObject jSONObject = wp0Var.f18086h0;
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            e40Var.b(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            e40Var.b(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        e40Var.addView(relativeLayout);
        return e40Var;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i4) {
        Context context = this.f10697a;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double dOptDouble = jSONObject.optDouble("padding", 0.0d);
        va.r rVar = va.r.g;
        za.d dVar = rVar.f36157a;
        int iB = za.d.b((int) dOptDouble, context);
        textView.setPadding(0, iB, 0, iB);
        double dOptDouble2 = jSONObject.optDouble("height", 15.0d);
        za.d dVar2 = rVar.f36157a;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, za.d.b((int) dOptDouble2, context));
        layoutParams.addRule(i4);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f10698b.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f10698b.setY(-r0[1]);
    }
}
