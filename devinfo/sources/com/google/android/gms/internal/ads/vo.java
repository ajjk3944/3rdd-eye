package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vo implements wo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17676a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final gx f17677b;

    public vo(lo loVar, gx gxVar) {
        this.f17677b = gxVar;
        Objects.requireNonNull(loVar);
    }

    @Override // com.google.android.gms.internal.ads.wo
    public final void j(String str) {
        switch (this.f17676a) {
            case 0:
                this.f17677b.d(new lq(str));
                break;
            default:
                gx gxVar = this.f17677b;
                try {
                    if (str == null) {
                        gxVar.d(new lq());
                    } else {
                        gxVar.d(new lq(str));
                    }
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.wo
    public final void k(JSONObject jSONObject) {
        switch (this.f17676a) {
            case 0:
                this.f17677b.b(jSONObject);
                break;
            default:
                gx gxVar = this.f17677b;
                try {
                    gxVar.b(jSONObject);
                    break;
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e2) {
                    gxVar.d(e2);
                }
        }
    }

    public vo(vq vqVar, gx gxVar) {
        this.f17677b = gxVar;
    }
}
