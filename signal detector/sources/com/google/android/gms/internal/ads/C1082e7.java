package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.e7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1082e7 extends AbstractCallableC1676p7 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13870h = 1;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f13871j;

    public C1082e7(X6 x6, S5 s5, int i, Context context) {
        super(x6, "t0O1yTkaf8U85RYVI/Iw764S7xVo2UnzoC6xqdKHezEduB25T+k9NlupfapwCNk2", "NAFu5DHVi3o3yaFx1OCpv/KBsMCIhscKWxn1MzThPRk=", s5, i, 31);
        this.i = null;
        this.f13871j = context;
    }

    private final void b() {
        View view = (View) this.f13871j;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) C2841s.f23267e.f23270c.a(H9.f8748g3);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f16134e.invoke(null, view, (Activity) this.i, bool);
        S5 s5 = this.f16133d;
        synchronized (s5) {
            try {
                long jLongValue = ((Long) objArr[0]).longValue();
                s5.b();
                ((C1136f6) s5.f13551b).d0(jLongValue);
                long jLongValue2 = ((Long) objArr[1]).longValue();
                s5.b();
                ((C1136f6) s5.f13551b).e0(jLongValue2);
                if (zBooleanValue) {
                    String str = (String) objArr[2];
                    s5.b();
                    ((C1136f6) s5.f13551b).f0(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1676p7
    public final void a() {
        switch (this.f13870h) {
            case 0:
                b();
                return;
            default:
                S5 s5 = this.f16133d;
                s5.b();
                ((C1136f6) s5.f13551b).B(-1L);
                s5.b();
                ((C1136f6) s5.f13551b).C(-1L);
                Context context = (Context) this.f13871j;
                if (context == null) {
                    context = this.f16130a.f12375a;
                }
                if (((List) this.i) == null) {
                    this.i = (List) this.f16134e.invoke(null, context);
                }
                List list = (List) this.i;
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (s5) {
                    long jLongValue = ((Long) ((List) this.i).get(0)).longValue();
                    s5.b();
                    ((C1136f6) s5.f13551b).B(jLongValue);
                    long jLongValue2 = ((Long) ((List) this.i).get(1)).longValue();
                    s5.b();
                    ((C1136f6) s5.f13551b).C(jLongValue2);
                }
                return;
        }
    }

    public C1082e7(X6 x6, S5 s5, int i, View view, Activity activity) {
        super(x6, "v55I7GonHWsamYbBtyIFKaZFQR/sofAKKTQsUzMKV1C6iCJ1v6Vqzq9x9meUl2ez", "Z7zWno+0eCAtcsPK71T7clKp8ZTgICQrdpeo5cTQYQo=", s5, i, 62);
        this.f13871j = view;
        this.i = activity;
    }
}
