package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class el0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10818a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10819b;

    public /* synthetic */ el0(int i4, Object obj) {
        this.f10818a = i4;
        this.f10819b = obj;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        switch (this.f10818a) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 58;
            case 3:
                return 15;
            case 4:
                return 25;
            case 5:
                return 30;
            default:
                return 49;
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        int i4 = this.f10818a;
        boolean z3 = true;
        int i10 = 2;
        Object obj = this.f10819b;
        switch (i4) {
            case 0:
                return yo0.e(new fl0(0, wd.b.c((Context) obj, "com.google.android.gms.permission.AD_ID") == 0));
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return yo0.e(new sl0(0, arrayList));
            case 2:
                return yo0.e(new fl0(1, ((hq0) obj).f11955q));
            case 3:
                vo0 vo0Var = (vo0) obj;
                String str = null;
                if (vo0Var == null) {
                    return yo0.e(new ml0(str, i10));
                }
                String str2 = vo0Var.f17678a;
                int i11 = tb.d.f34539a;
                return (str2 == null || str2.trim().isEmpty()) ? yo0.e(new ml0(str, i10)) : yo0.e(new ml0(str2, i10));
            case 4:
                return yo0.e(new um0(z3 ? 1 : 0, (vp0) obj));
            case 5:
                return yo0.e(new tl0(2, (Bundle) obj));
            default:
                return yo0.G(yo0.E(yo0.e(new Bundle()), ((Long) va.s.f36163e.f36166c.a(sk.U4)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj), o5.f14552o, fx.f11274a);
        }
    }
}
