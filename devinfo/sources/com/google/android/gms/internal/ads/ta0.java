package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ta0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final hc0 f16760a;

    /* renamed from: b, reason: collision with root package name */
    public final tb.a f16761b;

    /* renamed from: c, reason: collision with root package name */
    public vn f16762c;

    /* renamed from: d, reason: collision with root package name */
    public lo f16763d;

    /* renamed from: e, reason: collision with root package name */
    public String f16764e;

    /* renamed from: f, reason: collision with root package name */
    public Long f16765f;
    public WeakReference g;

    public ta0(hc0 hc0Var, tb.a aVar) {
        this.f16760a = hc0Var;
        this.f16761b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.g;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f16764e != null && this.f16765f != null) {
            HashMap map = new HashMap();
            map.put(FacebookMediationAdapter.KEY_ID, this.f16764e);
            this.f16761b.getClass();
            map.put("time_interval", String.valueOf(System.currentTimeMillis() - this.f16765f.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f16760a.d(map);
        }
        this.f16764e = null;
        this.f16765f = null;
        WeakReference weakReference2 = this.g;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.g = null;
    }
}
