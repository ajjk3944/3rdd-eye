package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a01 extends h01 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9164f;
    public final Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a01(zc zcVar, sz0 sz0Var, Context context, g21 g21Var, int i4) {
        super("PH59Z8k3dpWxORUT8HU0o+g5WN12ilbJvwpqiSzw0bSm8ti3u+Yy1pYDsitXR/IS", "EBTPDqTGNNE4oafrCuyvamIcg1nistjqiNmDYn1J+fs=", zcVar, sz0Var, g21Var.a(115));
        this.f9164f = i4;
        switch (i4) {
            case 1:
                super("10eHn0oEJc+Kv4xHAilDadQXUH+Qd7+H1wb3g/5791dKT43oKLnvfFcwz9lBLCYb", "DO5TusvTbmxbLfPhMKcHxON+YLmz+u+OpsMl13dRFcs=", zcVar, sz0Var, g21Var.a(119));
                this.g = context;
                break;
            default:
                this.g = context;
                break;
        }
    }

    private final void b(Method method, zc zcVar) {
        int i4 = 1;
        Object[] objArr = (Object[]) method.invoke("", this.g);
        objArr.getClass();
        synchronized (zcVar) {
            try {
                long jIntValue = ((Integer) objArr[0]).intValue();
                zcVar.b();
                ((md) zcVar.f14755b).Y(jIntValue);
                long jIntValue2 = ((Integer) objArr[1]).intValue();
                zcVar.b();
                ((md) zcVar.f14755b).H0(jIntValue2);
                long jIntValue3 = ((Integer) objArr[2]).intValue();
                zcVar.b();
                ((md) zcVar.f14755b).I0(jIntValue3);
                long jIntValue4 = ((Integer) objArr[3]).intValue();
                zcVar.b();
                ((md) zcVar.f14755b).m0(jIntValue4);
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    zcVar.b();
                    ((md) zcVar.f14755b).q0(3);
                } else {
                    int i10 = true != bool.booleanValue() ? 1 : 2;
                    zcVar.b();
                    ((md) zcVar.f14755b).q0(i10);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    zcVar.h(3);
                } else {
                    if (true == bool2.booleanValue()) {
                        i4 = 2;
                    }
                    zcVar.h(i4);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h01
    public final void a(Method method, zc zcVar) {
        switch (this.f9164f) {
            case 0:
                b(method, zcVar);
                return;
            default:
                Object[] objArr = (Object[]) method.invoke("", this.g);
                objArr.getClass();
                synchronized (zcVar) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    zcVar.b();
                    ((md) zcVar.f14755b).G0(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    zcVar.b();
                    ((md) zcVar.f14755b).Z(jLongValue2);
                }
                return;
        }
    }
}
