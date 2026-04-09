package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d01 extends h01 {
    public static volatile Long g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f10282h = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10283f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d01(String str, String str2, zc zcVar, sz0 sz0Var, f21 f21Var, int i4) {
        super(str, str2, zcVar, sz0Var, f21Var);
        this.f10283f = i4;
    }

    private final void b(Method method, zc zcVar) {
        if (g == null) {
            synchronized (f10282h) {
                try {
                    if (g == null) {
                        Long l10 = (Long) method.invoke("", null);
                        if (l10 == null) {
                            throw null;
                        }
                        g = l10;
                    }
                } finally {
                }
            }
        }
        synchronized (zcVar) {
            try {
                if (g != null) {
                    long jLongValue = g.longValue();
                    zcVar.b();
                    ((md) zcVar.f14755b).Q0(jLongValue);
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h01
    public final void a(Method method, zc zcVar) {
        switch (this.f10283f) {
            case 0:
                b(method, zcVar);
                return;
            default:
                synchronized (zcVar) {
                    zcVar.b();
                    ((md) zcVar.f14755b).E0("E");
                    zcVar.b();
                    ((md) zcVar.f14755b).M(0L);
                    zcVar.b();
                    ((md) zcVar.f14755b).g0("D");
                }
                Object[] objArr = (Object[]) method.invoke("", null);
                objArr.getClass();
                synchronized (zcVar) {
                    String str = (String) objArr[0];
                    zcVar.b();
                    ((md) zcVar.f14755b).E0(str);
                    long jLongValue = ((Long) objArr[1]).longValue();
                    zcVar.b();
                    ((md) zcVar.f14755b).M(jLongValue);
                    String str2 = (String) objArr[2];
                    zcVar.b();
                    ((md) zcVar.f14755b).g0(str2);
                }
                return;
        }
    }
}
