package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vz0 extends h01 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17796f = 3;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f17797h;

    public vz0(zc zcVar, sz0 sz0Var, DisplayMetrics displayMetrics, View view, g21 g21Var) {
        super("QtFUhprc0s9rDonjH5m4IrigIFuqmp02TDnBB8cCDzOGBvtX+nN2RsZyZRWOgPcG", "ANcskOtBFoz5qdvK1HjqJ5/70uPKH1zreYbosxrVnAY=", zcVar, sz0Var, g21Var.a(124));
        this.g = displayMetrics;
        this.f17797h = view;
    }

    private final void b(Method method, zc zcVar) {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l10 = (Long) method.invoke("", (Context) this.g);
                if (l10 == null) {
                    throw null;
                }
                lValueOf = l10;
            } else {
                vd.b bVar = (vd.b) ((Map) this.f17797h).get("gs");
                if (bVar != null && bVar.isDone()) {
                    lValueOf = Long.valueOf(((md) bVar.get()).y0());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zcVar) {
            long jLongValue = lValueOf.longValue();
            zcVar.b();
            ((md) zcVar.f14755b).c0(jLongValue);
        }
    }

    private final void c(Method method, zc zcVar) {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = (Map) this.g;
        Long l10 = (Long) map.get("tcq");
        if (l10 == null) {
            l10 = -1L;
        }
        lArr[0] = l10;
        Long l11 = (Long) map.get("tpq");
        if (l11 == null) {
            l11 = -1L;
        }
        lArr[1] = l11;
        Long l12 = (Long) map.get("tcv");
        if (l12 == null) {
            l12 = -1L;
        }
        lArr[2] = l12;
        Long l13 = (Long) map.get("tpv");
        if (l13 == null) {
            l13 = -1L;
        }
        lArr[3] = l13;
        Long l14 = (Long) map.get("tchv");
        if (l14 == null) {
            l14 = -1L;
        }
        lArr[4] = l14;
        Long l15 = (Long) map.get("tphv");
        if (l15 == null) {
            l15 = -1L;
        }
        lArr[5] = l15;
        Long l16 = (Long) map.get("tcc");
        if (l16 == null) {
            l16 = -1L;
        }
        lArr[6] = l16;
        Long l17 = (Long) map.get("tpc");
        if (l17 == null) {
            l17 = -1L;
        }
        lArr[7] = l17;
        Long l18 = (Long) map.get("tst");
        if (l18 == null) {
            l18 = -1L;
        }
        lArr[8] = l18;
        for (int i4 = 0; i4 < 9; i4++) {
            if (lArr[i4] == null) {
                lArr[i4] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(((zx0) this.f17797h).ordinal()));
        lArr2.getClass();
        synchronized (zcVar) {
            long jLongValue = lArr2[0].longValue();
            zcVar.b();
            ((md) zcVar.f14755b).n0(jLongValue);
            long jLongValue2 = lArr2[1].longValue();
            zcVar.b();
            ((md) zcVar.f14755b).D(jLongValue2);
            long jLongValue3 = lArr2[2].longValue();
            zcVar.b();
            ((md) zcVar.f14755b).R0(jLongValue3);
            long jLongValue4 = lArr2[3].longValue();
            zcVar.b();
            ((md) zcVar.f14755b).O0(jLongValue4);
            long jLongValue5 = lArr2[4].longValue();
            zcVar.b();
            ((md) zcVar.f14755b).j0(jLongValue5);
            long jLongValue6 = lArr2[5].longValue();
            zcVar.b();
            ((md) zcVar.f14755b).k0(jLongValue6);
            long jLongValue7 = lArr2[6].longValue();
            zcVar.b();
            ((md) zcVar.f14755b).Q(jLongValue7);
            long jLongValue8 = lArr2[7].longValue();
            zcVar.b();
            ((md) zcVar.f14755b).R(jLongValue8);
        }
    }

    @Override // com.google.android.gms.internal.ads.h01
    public final void a(Method method, zc zcVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f17796f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (View) this.f17797h, (Activity) this.g);
                objArr.getClass();
                synchronized (zcVar) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    zcVar.b();
                    ((md) zcVar.f14755b).d0(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    zcVar.b();
                    ((md) zcVar.f14755b).e0(jLongValue2);
                    String str = (String) objArr[2];
                    zcVar.b();
                    ((md) zcVar.f14755b).f0(str);
                }
                return;
            case 1:
                b(method, zcVar);
                return;
            case 2:
                c(method, zcVar);
                return;
            default:
                View view = (View) this.f17797h;
                if (view == null) {
                    return;
                }
                Object objInvoke = method.invoke("", (DisplayMetrics) this.g, view);
                objInvoke.getClass();
                Long[] lArr = (Long[]) objInvoke;
                kd kdVarA = ld.A();
                long jLongValue3 = lArr[2].longValue();
                kdVarA.b();
                ((ld) kdVarA.f14755b).C(jLongValue3);
                long jLongValue4 = lArr[1].longValue();
                kdVarA.b();
                ((ld) kdVarA.f14755b).D(jLongValue4);
                long jLongValue5 = lArr[0].longValue();
                kdVarA.b();
                ((ld) kdVarA.f14755b).E(jLongValue5);
                long jLongValue6 = lArr[3].longValue();
                kdVarA.b();
                ((ld) kdVarA.f14755b).B(jLongValue6);
                long jLongValue7 = lArr[4].longValue();
                kdVarA.b();
                ((ld) kdVarA.f14755b).F(jLongValue7);
                ld ldVar = (ld) kdVarA.e();
                zcVar.b();
                ((md) zcVar.f14755b).W(ldVar);
                return;
        }
    }

    public vz0(zc zcVar, sz0 sz0Var, View view, Activity activity, g21 g21Var) {
        super("bnVSgdPP2gLWa4hBN3KENgNw/HH5/Lu+gCRQEGIHMH/zN0uabg0EmprGntHqQpss", "4mb2wE47WPzlH8QFuj7X929jGLgzTiMr8Iu3TogjJ0U=", zcVar, sz0Var, g21Var.a(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION));
        this.f17797h = view;
        this.g = activity;
    }

    public vz0(zc zcVar, sz0 sz0Var, zx0 zx0Var, Map map, g21 g21Var) {
        super("+PmnicIB6Ggxqdcyc5KXYWsM1j/GXRihAyryrcphzvI3AMIT+uhHMqbkBoIk/Q9k", "+zCNZC90FxKlnODut7cZO0wgbMEddS2/rBQzUBv6at4=", zcVar, sz0Var, g21Var.a(122));
        this.g = map;
        this.f17797h = zx0Var;
    }

    public vz0(zc zcVar, sz0 sz0Var, Map map, Context context, g21 g21Var) {
        super("4E5LGVIWQ1GEduvP5TN/xg9UMJg1ApPRTsJapm6hD1tpcLj2ORRJ8msrY4RVPfxM", "Dj3g22+8PSWa8Tetil7hQ1gD69SNesarbyARD9M1zvc=", zcVar, sz0Var, g21Var.a(120));
        this.g = context;
        this.f17797h = map;
    }
}
