package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Ah, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421Ah {

    /* renamed from: a, reason: collision with root package name */
    public String f7022a;

    /* renamed from: b, reason: collision with root package name */
    public C1097eM f7023b;

    /* renamed from: c, reason: collision with root package name */
    public C1044dN f7024c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f7025d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7026e = new AtomicBoolean(false);

    public C0421Ah(ScheduledExecutorService scheduledExecutorService) {
        this.f7025d = scheduledExecutorService;
    }

    public final void a() {
        try {
            String strD = AbstractC0241a.k("GET_VARIATIONS_HEADER") ? T0.f.d() : null;
            if (strD != null && !strD.isEmpty()) {
                this.f7022a = strD;
                byte[] bArrDecode = Base64.decode(strD, 10);
                this.f7023b = C1097eM.A(bArrDecode, XK.a());
                E9 e9 = H9.Z9;
                C2841s c2841s = C2841s.f23267e;
                G9 g9 = c2841s.f23270c;
                G9 g92 = c2841s.f23270c;
                if (((Boolean) g9.a(e9)).booleanValue()) {
                    this.f7024c = C1044dN.A(bArrDecode, XK.a());
                }
                if (((Boolean) g92.a(H9.X9)).booleanValue() && ((Boolean) g92.a(H9.W9)).booleanValue()) {
                    this.f7025d.schedule(new RunnableC1883t(27, this), ((Integer) g92.a(H9.Y9)).intValue(), TimeUnit.MINUTES);
                }
            }
        } catch (C1636oL e6) {
            e = e6;
            p2.j.f22785C.f22795h.g("ChromeVariations", e);
        } catch (IllegalArgumentException e7) {
            e = e7;
            p2.j.f22785C.f22795h.g("ChromeVariations", e);
        }
    }
}
