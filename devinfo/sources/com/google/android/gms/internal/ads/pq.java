package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pq implements wo {

    /* renamed from: a, reason: collision with root package name */
    public final hq f15067a;

    /* renamed from: b, reason: collision with root package name */
    public final gx f15068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qq f15069c;

    public pq(qq qqVar, hq hqVar, gx gxVar) {
        Objects.requireNonNull(qqVar);
        this.f15069c = qqVar;
        this.f15067a = hqVar;
        this.f15068b = gxVar;
    }

    @Override // com.google.android.gms.internal.ads.wo
    public final void j(String str) {
        hq hqVar = this.f15067a;
        gx gxVar = this.f15068b;
        try {
            if (str == null) {
                gxVar.d(new lq());
            } else {
                gxVar.d(new lq(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th2) {
            hqVar.y();
            throw th2;
        }
        hqVar.y();
    }

    @Override // com.google.android.gms.internal.ads.wo
    public final void k(JSONObject jSONObject) {
        hq hqVar = this.f15067a;
        gx gxVar = this.f15068b;
        try {
            try {
                gxVar.b(((mq) this.f15069c.f15396c).k(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e2) {
                gxVar.d(e2);
            }
        } finally {
            hqVar.y();
        }
    }
}
