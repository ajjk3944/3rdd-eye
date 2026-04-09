package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class of extends zf {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14692h = 1;

    /* renamed from: i, reason: collision with root package name */
    public Object f14693i;
    public final Object j;

    public of(ff ffVar, zc zcVar, int i4, Context context) {
        super(ffVar, "t0O1yTkaf8U85RYVI/Iw764S7xVo2UnzoC6xqdKHezEduB25T+k9NlupfapwCNk2", "NAFu5DHVi3o3yaFx1OCpv/KBsMCIhscKWxn1MzThPRk=", zcVar, i4, 31);
        this.f14693i = null;
        this.j = context;
    }

    private final void b() {
        View view = (View) this.j;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) va.s.f36163e.f36166c.a(sk.f16135g3);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f19076e.invoke(null, view, (Activity) this.f14693i, bool);
        zc zcVar = this.f19075d;
        synchronized (zcVar) {
            try {
                long jLongValue = ((Long) objArr[0]).longValue();
                zcVar.b();
                ((md) zcVar.f14755b).d0(jLongValue);
                long jLongValue2 = ((Long) objArr[1]).longValue();
                zcVar.b();
                ((md) zcVar.f14755b).e0(jLongValue2);
                if (zBooleanValue) {
                    String str = (String) objArr[2];
                    zcVar.b();
                    ((md) zcVar.f14755b).f0(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void a() {
        switch (this.f14692h) {
            case 0:
                b();
                return;
            default:
                zc zcVar = this.f19075d;
                zcVar.b();
                ((md) zcVar.f14755b).B(-1L);
                zcVar.b();
                ((md) zcVar.f14755b).C(-1L);
                Context context = (Context) this.j;
                if (context == null) {
                    context = this.f19072a.f11116a;
                }
                if (((List) this.f14693i) == null) {
                    this.f14693i = (List) this.f19076e.invoke(null, context);
                }
                List list = (List) this.f14693i;
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (zcVar) {
                    long jLongValue = ((Long) ((List) this.f14693i).get(0)).longValue();
                    zcVar.b();
                    ((md) zcVar.f14755b).B(jLongValue);
                    long jLongValue2 = ((Long) ((List) this.f14693i).get(1)).longValue();
                    zcVar.b();
                    ((md) zcVar.f14755b).C(jLongValue2);
                }
                return;
        }
    }

    public of(ff ffVar, zc zcVar, int i4, View view, Activity activity) {
        super(ffVar, "v55I7GonHWsamYbBtyIFKaZFQR/sofAKKTQsUzMKV1C6iCJ1v6Vqzq9x9meUl2ez", "Z7zWno+0eCAtcsPK71T7clKp8ZTgICQrdpeo5cTQYQo=", zcVar, i4, 62);
        this.j = view;
        this.f14693i = activity;
    }
}
