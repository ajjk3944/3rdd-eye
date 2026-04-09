package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ym, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2193ym implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C1547mn f17754a;

    /* renamed from: b, reason: collision with root package name */
    public final Q2.a f17755b;

    /* renamed from: c, reason: collision with root package name */
    public C1481lb f17756c;

    /* renamed from: d, reason: collision with root package name */
    public C0415Ab f17757d;

    /* renamed from: e, reason: collision with root package name */
    public String f17758e;

    /* renamed from: f, reason: collision with root package name */
    public Long f17759f;

    /* renamed from: g, reason: collision with root package name */
    public WeakReference f17760g;

    public ViewOnClickListenerC2193ym(C1547mn c1547mn, Q2.a aVar) {
        this.f17754a = c1547mn;
        this.f17755b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.f17760g;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f17758e != null && this.f17759f != null) {
            HashMap map = new HashMap();
            map.put("id", this.f17758e);
            this.f17755b.getClass();
            map.put("time_interval", String.valueOf(System.currentTimeMillis() - this.f17759f.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f17754a.d(map);
        }
        this.f17758e = null;
        this.f17759f = null;
        WeakReference weakReference2 = this.f17760g;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.f17760g = null;
    }
}
