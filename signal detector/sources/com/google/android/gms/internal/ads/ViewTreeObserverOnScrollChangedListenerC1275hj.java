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

/* renamed from: com.google.android.gms.internal.ads.hj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnScrollChangedListenerC1275hj extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14538a;

    /* renamed from: b, reason: collision with root package name */
    public View f14539b;

    public ViewTreeObserverOnScrollChangedListenerC1275hj(Context context) {
        super(context);
        this.f14538a = context;
    }

    public static ViewTreeObserverOnScrollChangedListenerC1275hj a(Context context, View view, Qt qt) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        ViewTreeObserverOnScrollChangedListenerC1275hj viewTreeObserverOnScrollChangedListenerC1275hj = new ViewTreeObserverOnScrollChangedListenerC1275hj(context);
        List list = qt.f10795u;
        boolean zIsEmpty = list.isEmpty();
        Context context2 = viewTreeObserverOnScrollChangedListenerC1275hj.f14538a;
        if (!zIsEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f2 = ((Rt) list.get(0)).f11075a;
            float f5 = displayMetrics.density;
            viewTreeObserverOnScrollChangedListenerC1275hj.setLayoutParams(new FrameLayout.LayoutParams((int) (f2 * f5), (int) (r5.f11076b * f5)));
        }
        viewTreeObserverOnScrollChangedListenerC1275hj.f14539b = view;
        viewTreeObserverOnScrollChangedListenerC1275hj.addView(view);
        W9 w9 = p2.j.f22785C.f22787B;
        ViewTreeObserverOnScrollChangedListenerC0725Sf viewTreeObserverOnScrollChangedListenerC0725Sf = new ViewTreeObserverOnScrollChangedListenerC0725Sf(viewTreeObserverOnScrollChangedListenerC1275hj, viewTreeObserverOnScrollChangedListenerC1275hj);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC0725Sf.f11985a).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnScrollChangedListenerC0725Sf.H1(viewTreeObserver);
        }
        ViewTreeObserverOnGlobalLayoutListenerC0708Rf viewTreeObserverOnGlobalLayoutListenerC0708Rf = new ViewTreeObserverOnGlobalLayoutListenerC0708Rf(viewTreeObserverOnScrollChangedListenerC1275hj, viewTreeObserverOnScrollChangedListenerC1275hj);
        View view3 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0708Rf.f11985a).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0708Rf.H1(viewTreeObserver3);
        }
        JSONObject jSONObject = qt.f10771h0;
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            viewTreeObserverOnScrollChangedListenerC1275hj.b(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            viewTreeObserverOnScrollChangedListenerC1275hj.b(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        viewTreeObserverOnScrollChangedListenerC1275hj.addView(relativeLayout);
        return viewTreeObserverOnScrollChangedListenerC1275hj;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        Context context = this.f14538a;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double dOptDouble = jSONObject.optDouble("padding", 0.0d);
        q2.r rVar = q2.r.f23260g;
        u2.f fVar = rVar.f23261a;
        int iB = u2.f.b(context, (int) dOptDouble);
        textView.setPadding(0, iB, 0, iB);
        double dOptDouble2 = jSONObject.optDouble("height", 15.0d);
        u2.f fVar2 = rVar.f23261a;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, u2.f.b(context, (int) dOptDouble2));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f14539b.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f14539b.setY(-r0[1]);
    }
}
