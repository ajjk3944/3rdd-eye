package com.google.android.gms.internal.ads;

import android.util.Base64;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class Xy {

    /* renamed from: a, reason: collision with root package name */
    public final ID f12521a;

    /* renamed from: b, reason: collision with root package name */
    public final Yy f12522b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f12523c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12524d;

    /* renamed from: e, reason: collision with root package name */
    public final S5 f12525e;

    /* renamed from: f, reason: collision with root package name */
    public final C1291hz f12526f;

    /* renamed from: g, reason: collision with root package name */
    public final C1948uA f12527g;

    public Xy(ID id, Yy yy, C1291hz c1291hz, EnumC1450ky enumC1450ky, String str, S5 s5, C2123xN c2123xN, C2123xN c2123xN2, C2123xN c2123xN3, C1948uA c1948uA) {
        this.f12521a = id;
        this.f12522b = yy;
        this.f12524d = str;
        this.f12526f = c1291hz;
        this.f12525e = s5;
        this.f12527g = c1948uA;
        int iOrdinal = enumC1450ky.ordinal();
        if (iOrdinal == 0) {
            this.f12523c = c2123xN.c();
        } else if (iOrdinal == 1) {
            this.f12523c = c2123xN2.c();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            this.f12523c = c2123xN3.c();
        }
    }

    public final InterfaceFutureC2326a a() {
        boolean z6;
        if (!this.f12522b.b()) {
            return AbstractC1984ut.e(Integer.toString(7));
        }
        C1291hz c1291hz = this.f12526f;
        synchronized (c1291hz) {
            z6 = c1291hz.f14632j;
        }
        if (!z6) {
            final int i = 1;
            return AbstractC1984ut.z(new Callable(this) { // from class: com.google.android.gms.internal.ads.Wy

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Xy f12350b;

                {
                    this.f12350b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strEncodeToString;
                    switch (i) {
                        case 0:
                            Xy xy = this.f12350b;
                            try {
                                xy.f12527g.a(101).a();
                                C1136f6 c1136f6 = (C1136f6) xy.f12525e.d();
                                String str = xy.f12524d;
                                Yy yy = xy.f12522b;
                                try {
                                    strEncodeToString = Base64.encodeToString(((C1675p6) yy.e(str, c1136f6.b()).d()).b(), 11);
                                } catch (IllegalArgumentException unused) {
                                    yy.getClass();
                                    S5 s5C0 = C1136f6.C0();
                                    s5C0.h(4096);
                                    strEncodeToString = Base64.encodeToString(yy.c(((C1136f6) s5C0.d()).b(), str, true), 11);
                                }
                                return strEncodeToString;
                            } finally {
                            }
                        default:
                            Xy xy2 = this.f12350b;
                            String str2 = xy2.f12524d;
                            Yy yy2 = xy2.f12522b;
                            yy2.getClass();
                            S5 s5C02 = C1136f6.C0();
                            s5C02.h(16384);
                            return Base64.encodeToString(yy2.c(((C1136f6) s5C02.d()).b(), str2, true), 11);
                    }
                }
            }, this.f12521a);
        }
        Set set = this.f12523c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0623Mf) this.f12521a).b((InterfaceCallableC2044vz) it.next()));
        }
        LB lbM = LB.m(arrayList);
        final int i3 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.Wy

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Xy f12350b;

            {
                this.f12350b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strEncodeToString;
                switch (i3) {
                    case 0:
                        Xy xy = this.f12350b;
                        try {
                            xy.f12527g.a(101).a();
                            C1136f6 c1136f6 = (C1136f6) xy.f12525e.d();
                            String str = xy.f12524d;
                            Yy yy = xy.f12522b;
                            try {
                                strEncodeToString = Base64.encodeToString(((C1675p6) yy.e(str, c1136f6.b()).d()).b(), 11);
                            } catch (IllegalArgumentException unused) {
                                yy.getClass();
                                S5 s5C0 = C1136f6.C0();
                                s5C0.h(4096);
                                strEncodeToString = Base64.encodeToString(yy.c(((C1136f6) s5C0.d()).b(), str, true), 11);
                            }
                            return strEncodeToString;
                        } finally {
                        }
                    default:
                        Xy xy2 = this.f12350b;
                        String str2 = xy2.f12524d;
                        Yy yy2 = xy2.f12522b;
                        yy2.getClass();
                        S5 s5C02 = C1136f6.C0();
                        s5C02.h(16384);
                        return Base64.encodeToString(yy2.c(((C1136f6) s5C02.d()).b(), str2, true), 11);
                }
            }
        };
        EnumC2059wD enumC2059wD = EnumC2059wD.f17407a;
        C2005vD c2005vD = new C2005vD(lbM, false, false);
        c2005vD.f17236D = new C1951uD(c2005vD, callable, enumC2059wD);
        c2005vD.v();
        return c2005vD;
    }
}
