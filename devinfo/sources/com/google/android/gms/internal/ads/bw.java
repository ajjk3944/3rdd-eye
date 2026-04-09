package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bw implements xg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9813a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9814b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9815c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9816d;

    public bw(Context context, String str) {
        this.f9813a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f9815c = str;
        this.f9816d = false;
        this.f9814b = new Object();
    }

    public final void a(boolean z3) {
        ua.j jVar = ua.j.C;
        dw dwVar = jVar.f35281y;
        Context context = this.f9813a;
        if (dwVar.a(context)) {
            synchronized (this.f9814b) {
                try {
                    if (this.f9816d == z3) {
                        return;
                    }
                    this.f9816d = z3;
                    String str = this.f9815c;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f9816d) {
                        dw dwVar2 = jVar.f35281y;
                        if (dwVar2.a(context)) {
                            dwVar2.j(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        dw dwVar3 = jVar.f35281y;
                        if (dwVar3.a(context)) {
                            dwVar3.j(context, str, "endAdUnitExposure");
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xg
    public final void w(wg wgVar) {
        a(wgVar.j);
    }
}
