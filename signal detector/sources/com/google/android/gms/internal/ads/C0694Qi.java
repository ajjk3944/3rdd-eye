package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.Qi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694Qi implements M7 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0828Yg f10674a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f10675b;

    /* renamed from: c, reason: collision with root package name */
    public final C0592Ki f10676c;

    /* renamed from: d, reason: collision with root package name */
    public final Q2.a f10677d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10678e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10679f = false;

    /* renamed from: g, reason: collision with root package name */
    public final C0626Mi f10680g = new C0626Mi();

    public C0694Qi(Executor executor, C0592Ki c0592Ki, Q2.a aVar) {
        this.f10675b = executor;
        this.f10676c = c0592Ki;
        this.f10677d = aVar;
    }

    @Override // com.google.android.gms.internal.ads.M7
    public final void K(L7 l7) {
        boolean z6 = this.f10679f ? false : l7.f9629j;
        C0626Mi c0626Mi = this.f10680g;
        c0626Mi.f9885a = z6;
        this.f10677d.getClass();
        c0626Mi.f9887c = SystemClock.elapsedRealtime();
        c0626Mi.f9889e = l7;
        if (this.f10678e) {
            a();
        }
    }

    public final void a() {
        try {
            JSONObject jSONObjectD = this.f10676c.d(this.f10680g);
            if (this.f10674a != null) {
                this.f10675b.execute(new CD(this, 19, jSONObjectD));
            }
        } catch (JSONException e6) {
            AbstractC2907C.n("Failed to call video active view js", e6);
        }
    }
}
