package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import f4.InterfaceFutureC2326a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.lz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1505lz extends AbstractC2098wz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15499f = 3;

    /* renamed from: g, reason: collision with root package name */
    public final Object f15500g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f15501h;

    public C1505lz(S5 s5, C1291hz c1291hz, DisplayMetrics displayMetrics, View view, C1948uA c1948uA) {
        super("QtFUhprc0s9rDonjH5m4IrigIFuqmp02TDnBB8cCDzOGBvtX+nN2RsZyZRWOgPcG", "ANcskOtBFoz5qdvK1HjqJ5/70uPKH1zreYbosxrVnAY=", s5, c1291hz, c1948uA.a(124));
        this.f15500g = displayMetrics;
        this.f15501h = view;
    }

    private final void b(Method method, S5 s5) {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l2 = (Long) method.invoke("", (Context) this.f15500g);
                if (l2 == null) {
                    throw null;
                }
                lValueOf = l2;
            } else {
                InterfaceFutureC2326a interfaceFutureC2326a = (InterfaceFutureC2326a) ((Map) this.f15501h).get("gs");
                if (interfaceFutureC2326a != null && interfaceFutureC2326a.isDone()) {
                    lValueOf = Long.valueOf(((C1136f6) interfaceFutureC2326a.get()).y0());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (s5) {
            long jLongValue = lValueOf.longValue();
            s5.b();
            ((C1136f6) s5.f13551b).c0(jLongValue);
        }
    }

    private final void c(Method method, S5 s5) {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = (Map) this.f15500g;
        Long l2 = (Long) map.get("tcq");
        if (l2 == null) {
            l2 = -1L;
        }
        lArr[0] = l2;
        Long l6 = (Long) map.get("tpq");
        if (l6 == null) {
            l6 = -1L;
        }
        lArr[1] = l6;
        Long l7 = (Long) map.get("tcv");
        if (l7 == null) {
            l7 = -1L;
        }
        lArr[2] = l7;
        Long l8 = (Long) map.get("tpv");
        if (l8 == null) {
            l8 = -1L;
        }
        lArr[3] = l8;
        Long l9 = (Long) map.get("tchv");
        if (l9 == null) {
            l9 = -1L;
        }
        lArr[4] = l9;
        Long l10 = (Long) map.get("tphv");
        if (l10 == null) {
            l10 = -1L;
        }
        lArr[5] = l10;
        Long l11 = (Long) map.get("tcc");
        if (l11 == null) {
            l11 = -1L;
        }
        lArr[6] = l11;
        Long l12 = (Long) map.get("tpc");
        if (l12 == null) {
            l12 = -1L;
        }
        lArr[7] = l12;
        Long l13 = (Long) map.get("tst");
        if (l13 == null) {
            l13 = -1L;
        }
        lArr[8] = l13;
        for (int i = 0; i < 9; i++) {
            if (lArr[i] == null) {
                lArr[i] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(((EnumC1450ky) this.f15501h).ordinal()));
        lArr2.getClass();
        synchronized (s5) {
            long jLongValue = lArr2[0].longValue();
            s5.b();
            ((C1136f6) s5.f13551b).n0(jLongValue);
            long jLongValue2 = lArr2[1].longValue();
            s5.b();
            ((C1136f6) s5.f13551b).D(jLongValue2);
            long jLongValue3 = lArr2[2].longValue();
            s5.b();
            ((C1136f6) s5.f13551b).R0(jLongValue3);
            long jLongValue4 = lArr2[3].longValue();
            s5.b();
            ((C1136f6) s5.f13551b).O0(jLongValue4);
            long jLongValue5 = lArr2[4].longValue();
            s5.b();
            ((C1136f6) s5.f13551b).j0(jLongValue5);
            long jLongValue6 = lArr2[5].longValue();
            s5.b();
            ((C1136f6) s5.f13551b).k0(jLongValue6);
            long jLongValue7 = lArr2[6].longValue();
            s5.b();
            ((C1136f6) s5.f13551b).Q(jLongValue7);
            long jLongValue8 = lArr2[7].longValue();
            s5.b();
            ((C1136f6) s5.f13551b).R(jLongValue8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2098wz
    public final void a(Method method, S5 s5) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f15499f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (View) this.f15501h, (Activity) this.f15500g);
                objArr.getClass();
                synchronized (s5) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    s5.b();
                    ((C1136f6) s5.f13551b).d0(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    s5.b();
                    ((C1136f6) s5.f13551b).e0(jLongValue2);
                    String str = (String) objArr[2];
                    s5.b();
                    ((C1136f6) s5.f13551b).f0(str);
                }
                return;
            case 1:
                b(method, s5);
                return;
            case 2:
                c(method, s5);
                return;
            default:
                View view = (View) this.f15501h;
                if (view == null) {
                    return;
                }
                Object objInvoke = method.invoke("", (DisplayMetrics) this.f15500g, view);
                objInvoke.getClass();
                Long[] lArr = (Long[]) objInvoke;
                C1027d6 c1027d6A = C1081e6.A();
                long jLongValue3 = lArr[2].longValue();
                c1027d6A.b();
                ((C1081e6) c1027d6A.f13551b).C(jLongValue3);
                long jLongValue4 = lArr[1].longValue();
                c1027d6A.b();
                ((C1081e6) c1027d6A.f13551b).D(jLongValue4);
                long jLongValue5 = lArr[0].longValue();
                c1027d6A.b();
                ((C1081e6) c1027d6A.f13551b).E(jLongValue5);
                long jLongValue6 = lArr[3].longValue();
                c1027d6A.b();
                ((C1081e6) c1027d6A.f13551b).B(jLongValue6);
                long jLongValue7 = lArr[4].longValue();
                c1027d6A.b();
                ((C1081e6) c1027d6A.f13551b).F(jLongValue7);
                C1081e6 c1081e6 = (C1081e6) c1027d6A.d();
                s5.b();
                ((C1136f6) s5.f13551b).W(c1081e6);
                return;
        }
    }

    public C1505lz(S5 s5, C1291hz c1291hz, View view, Activity activity, C1948uA c1948uA) {
        super("bnVSgdPP2gLWa4hBN3KENgNw/HH5/Lu+gCRQEGIHMH/zN0uabg0EmprGntHqQpss", "4mb2wE47WPzlH8QFuj7X929jGLgzTiMr8Iu3TogjJ0U=", s5, c1291hz, c1948uA.a(111));
        this.f15501h = view;
        this.f15500g = activity;
    }

    public C1505lz(S5 s5, C1291hz c1291hz, EnumC1450ky enumC1450ky, Map map, C1948uA c1948uA) {
        super("+PmnicIB6Ggxqdcyc5KXYWsM1j/GXRihAyryrcphzvI3AMIT+uhHMqbkBoIk/Q9k", "+zCNZC90FxKlnODut7cZO0wgbMEddS2/rBQzUBv6at4=", s5, c1291hz, c1948uA.a(122));
        this.f15500g = map;
        this.f15501h = enumC1450ky;
    }

    public C1505lz(S5 s5, C1291hz c1291hz, Map map, Context context, C1948uA c1948uA) {
        super("4E5LGVIWQ1GEduvP5TN/xg9UMJg1ApPRTsJapm6hD1tpcLj2ORRJ8msrY4RVPfxM", "Dj3g22+8PSWa8Tetil7hQ1gD69SNesarbyARD9M1zvc=", s5, c1291hz, c1948uA.a(120));
        this.f15500g = context;
        this.f15501h = map;
    }
}
