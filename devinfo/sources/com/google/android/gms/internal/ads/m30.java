package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m30 implements xg {

    /* renamed from: a, reason: collision with root package name */
    public qz f13741a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f13742b;

    /* renamed from: c, reason: collision with root package name */
    public final f30 f13743c;

    /* renamed from: d, reason: collision with root package name */
    public final tb.a f13744d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13745e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13746f = false;
    public final i30 g = new i30();

    public m30(Executor executor, f30 f30Var, tb.a aVar) {
        this.f13742b = executor;
        this.f13743c = f30Var;
        this.f13744d = aVar;
    }

    public final void a() {
        try {
            JSONObject jSONObjectH = this.f13743c.h(this.g);
            if (this.f13741a != null) {
                this.f13742b.execute(new q81(18, this, jSONObjectH));
            }
        } catch (JSONException e2) {
            ya.a0.n("Failed to call video active view js", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.xg
    public final void w(wg wgVar) {
        boolean z3 = this.f13746f ? false : wgVar.j;
        i30 i30Var = this.g;
        i30Var.f12133a = z3;
        this.f13744d.getClass();
        i30Var.f12135c = SystemClock.elapsedRealtime();
        i30Var.f12137e = wgVar;
        if (this.f13745e) {
            a();
        }
    }
}
