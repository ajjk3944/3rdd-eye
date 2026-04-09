package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t00 {

    /* renamed from: a, reason: collision with root package name */
    public String f16621a;

    /* renamed from: b, reason: collision with root package name */
    public qp1 f16622b;

    /* renamed from: c, reason: collision with root package name */
    public qr1 f16623c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f16624d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f16625e = new AtomicBoolean(false);

    public t00(ScheduledExecutorService scheduledExecutorService) {
        this.f16624d = scheduledExecutorService;
    }

    public final void a() {
        try {
            String strD = ii.a.s("GET_VARIATIONS_HEADER") ? o6.f.d() : null;
            if (strD != null && !strD.isEmpty()) {
                this.f16621a = strD;
                byte[] bArrDecode = Base64.decode(strD, 10);
                this.f16622b = qp1.A(bArrDecode, jn1.a());
                pk pkVar = sk.f16061ba;
                va.s sVar = va.s.f36163e;
                rk rkVar = sVar.f36166c;
                rk rkVar2 = sVar.f36166c;
                if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
                    this.f16623c = qr1.A(bArrDecode, jn1.a());
                }
                if (((Boolean) rkVar2.a(sk.Z9)).booleanValue() && ((Boolean) rkVar2.a(sk.Y9)).booleanValue()) {
                    this.f16624d.schedule(new s(26, this), ((Integer) rkVar2.a(sk.f16044aa)).intValue(), TimeUnit.MINUTES);
                }
            }
        } catch (ao1 e2) {
            e = e2;
            ua.j.C.f35265h.g("ChromeVariations", e);
        } catch (IllegalArgumentException e10) {
            e = e10;
            ua.j.C.f35265h.g("ChromeVariations", e);
        }
    }
}
