package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q2.C2841s;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Bh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438Bh implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7389a;

    /* renamed from: b, reason: collision with root package name */
    public final C1283hr f7390b;

    public C0438Bh(Context context, C2951a c2951a) {
        C1283hr c1283hr;
        this.f7389a = context;
        E9 e9 = H9.f8800o3;
        C2841s c2841s = C2841s.f23267e;
        int iIntValue = ((Integer) c2841s.f23270c.a(e9)).intValue();
        int i = iIntValue != 1 ? (iIntValue == 2 || iIntValue != 3) ? 3 : 4 : 2;
        C1127ey c1127eyE = C1182fy.E();
        float fFloatValue = ((Float) c2841s.f23270c.a(H9.f8844v3)).floatValue();
        c1127eyE.b();
        ((C1182fy) c1127eyE.f13551b).G(fFloatValue);
        C1182fy c1182fy = (C1182fy) c1127eyE.d();
        C1236gy c1236gyH = C1290hy.H();
        boolean zBooleanValue = ((Boolean) c2841s.f23270c.a(H9.f8851w3)).booleanValue();
        c1236gyH.b();
        ((C1290hy) c1236gyH.f13551b).J(zBooleanValue);
        long jLongValue = ((Long) c2841s.f23270c.a(H9.y3)).longValue();
        c1236gyH.b();
        ((C1290hy) c1236gyH.f13551b).K(jLongValue);
        C1290hy c1290hy = (C1290hy) c1236gyH.d();
        Wx wxY = Xx.Y();
        wxY.b();
        ((Xx) wxY.f13551b).E(i);
        String str = c2951a.f23784a;
        wxY.b();
        ((Xx) wxY.f13551b).a0(str);
        boolean zBooleanValue2 = ((Boolean) c2841s.f23270c.a(H9.f8668S2)).booleanValue();
        wxY.b();
        ((Xx) wxY.f13551b).Z(zBooleanValue2);
        boolean z6 = ((Integer) c2841s.f23270c.a(H9.f8779l3)).intValue() == -1;
        wxY.b();
        ((Xx) wxY.f13551b).C(z6);
        long jIntValue = ((Integer) c2841s.f23270c.a(H9.f8793n3)).intValue();
        wxY.b();
        ((Xx) wxY.f13551b).B(jIntValue);
        long jLongValue2 = ((Long) c2841s.f23270c.a(H9.f8857x3)).longValue();
        wxY.b();
        ((Xx) wxY.f13551b).d0(jLongValue2);
        long jIntValue2 = ((Integer) c2841s.f23270c.a(H9.f8786m3)).intValue();
        wxY.b();
        ((Xx) wxY.f13551b).c0(jIntValue2);
        wxY.b();
        ((Xx) wxY.f13551b).b0(c1182fy);
        wxY.b();
        ((Xx) wxY.f13551b).A(c1290hy);
        Xx xx = (Xx) wxY.d();
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        synchronized (C1283hr.f14589c) {
            try {
                if (C1283hr.f14590d == null) {
                    C1283hr.f14590d = new C1283hr(context, c0623Mf, xx);
                }
                c1283hr = C1283hr.f14590d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7390b = c1283hr;
        c1283hr.p();
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void a(int i, int i3, int i6) {
        u2.f fVar = q2.r.f23260g.f23261a;
        Context context = this.f7389a;
        long j6 = i6;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j6, 0, u2.f.b(context, i), u2.f.n(context.getResources().getDisplayMetrics(), i3), 0);
        C1283hr c1283hr = this.f7390b;
        c1283hr.w(motionEventObtain);
        motionEventObtain.recycle();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j6, 2, u2.f.n(context.getResources().getDisplayMetrics(), i), u2.f.n(context.getResources().getDisplayMetrics(), i3), 0);
        c1283hr.w(motionEventObtain2);
        motionEventObtain2.recycle();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j6, 1, u2.f.n(context.getResources().getDisplayMetrics(), i), u2.f.n(context.getResources().getDisplayMetrics(), i3), 0);
        c1283hr.w(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void b(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f7390b.w(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String c(Context context, String str, View view, Activity activity) {
        return this.f7390b.t(context, view, str);
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String d(Context context, View view, String str) {
        return this.f7390b.t(context, view, str);
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String e(Context context) {
        return this.f7390b.q(context);
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void f(StackTraceElement[] stackTraceElementArr) {
        C1283hr c1283hr = this.f7390b;
        List listAsList = Arrays.asList(stackTraceElementArr);
        C1571nA c1571nA = ((Ux) c1283hr.f14592b).f11842c.f14911b;
        synchronized (c1571nA) {
            ArrayList arrayList = c1571nA.f15758a;
            arrayList.clear();
            arrayList.addAll(listAsList);
        }
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String g(Context context) {
        return this.f7390b.q(context);
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void h(View view) {
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String i(Context context, View view, Activity activity) {
        String string;
        C1358jD c1358jD;
        Ux ux = (Ux) this.f7390b.f14592b;
        InterfaceC1666oy interfaceC1666oy = ux.f11844e;
        C1948uA c1948uA = ux.f11843d;
        C1894tA c1894tAA = c1948uA.a(4);
        try {
            try {
                try {
                    c1894tAA.a();
                    C2205yy c2205yy = ux.f11840a;
                    synchronized (c2205yy) {
                        c1358jD = c2205yy.f17803e;
                        if (c1358jD == null) {
                            throw null;
                        }
                    }
                    string = (String) AbstractC1984ut.F(c1358jD, new C0450Cc(ux, context, view, activity, 6), EnumC2059wD.f17407a).get(ux.f11845f, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e6) {
                    Thread.currentThread().interrupt();
                    c1894tAA.b(e6);
                    string = "";
                } catch (ExecutionException e7) {
                    Throwable th = e7;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    c1894tAA.b(th);
                    string = Integer.toString(3);
                }
            } catch (TimeoutException unused) {
                c1948uA.b(57);
                string = Integer.toString(17);
            } catch (Throwable th2) {
                c1894tAA.b(th2);
                throw th2;
            }
            c1894tAA.c();
            interfaceC1666oy.c();
            return string;
        } catch (Throwable th3) {
            c1894tAA.c();
            interfaceC1666oy.c();
            throw th3;
        }
    }
}
