package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import j2.EnumC2546b;
import java.util.concurrent.ScheduledExecutorService;
import q2.C2841s;
import u2.C2951a;

/* loaded from: classes.dex */
public final class Nv {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10099a;

    /* renamed from: b, reason: collision with root package name */
    public final C2951a f10100b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f10101c;

    /* renamed from: d, reason: collision with root package name */
    public final Hu f10102d;

    /* renamed from: e, reason: collision with root package name */
    public final ClientApi f10103e = new ClientApi();

    /* renamed from: f, reason: collision with root package name */
    public final C1338iu f10104f;

    /* renamed from: g, reason: collision with root package name */
    public final Q2.a f10105g;

    /* renamed from: h, reason: collision with root package name */
    public final Av f10106h;

    public Nv(Context context, C2951a c2951a, ScheduledExecutorService scheduledExecutorService, Hu hu, C1338iu c1338iu, Q2.a aVar, Av av) {
        this.f10099a = context;
        this.f10100b = c2951a;
        this.f10101c = scheduledExecutorService;
        this.f10102d = hu;
        this.f10105g = aVar;
        this.f10104f = c1338iu;
        this.f10106h = av;
    }

    public final Ev a(q2.U0 u02, q2.P p6) {
        EnumC2546b enumC2546bA = EnumC2546b.a(u02.f23140b);
        if (enumC2546bA == null) {
            return null;
        }
        int iOrdinal = enumC2546bA.ordinal();
        Context context = this.f10099a;
        C2951a c2951a = this.f10100b;
        if (iOrdinal == 1) {
            return new Ev(this.f10103e, context, c2951a.f23786c, this.f10104f, u02, p6, this.f10101c, this.f10102d, c(), this.f10105g, 1);
        }
        if (iOrdinal == 2) {
            return new Ev(this.f10103e, context, c2951a.f23786c, this.f10104f, u02, p6, this.f10101c, this.f10102d, c(), this.f10105g, 2);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new Ev(this.f10103e, context, c2951a.f23786c, this.f10104f, u02, p6, this.f10101c, this.f10102d, c(), this.f10105g, 0);
    }

    public final Ev b(String str, q2.U0 u02, q2.Q q3) {
        EnumC2546b enumC2546bA = EnumC2546b.a(u02.f23140b);
        if (enumC2546bA == null) {
            return null;
        }
        int iOrdinal = enumC2546bA.ordinal();
        Context context = this.f10099a;
        C2951a c2951a = this.f10100b;
        if (iOrdinal == 1) {
            return new Ev(str, this.f10103e, context, c2951a.f23786c, this.f10104f, u02, q3, this.f10101c, this.f10102d, c(), this.f10105g, this.f10106h, 1);
        }
        if (iOrdinal == 2) {
            return new Ev(str, this.f10103e, context, c2951a.f23786c, this.f10104f, u02, q3, this.f10101c, this.f10102d, c(), this.f10105g, this.f10106h, 2);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new Ev(str, this.f10103e, context, c2951a.f23786c, this.f10104f, u02, q3, this.f10101c, this.f10102d, c(), this.f10105g, this.f10106h, 0);
    }

    public final Fv c() {
        E9 e9 = H9.f8594G;
        C2841s c2841s = C2841s.f23267e;
        return new Fv(((Long) c2841s.f23270c.a(e9)).longValue(), ((Long) c2841s.f23270c.a(H9.f8601H)).longValue(), this.f10105g);
    }
}
