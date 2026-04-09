package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1352j7 extends AbstractCallableC1676p7 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14908h = 3;
    public final Object i;

    public C1352j7(X6 x6, S5 s5, int i, View view) {
        super(x6, "FW20C8Ai9koIlsaxQSE6ztByFAH2b9HaWXnzViOGstPwi5iqItbLmay/ubT2VSsg", "WvzwBqCGqiupQVgrtkQ81CPfk2zDbRT3OzniCOJeuxU=", s5, i, 57);
        this.i = view;
    }

    private final void b() {
        Method method = this.f16134e;
        F3 f32 = (F3) this.i;
        List list = f32.f8064a;
        f32.f8064a = Collections.EMPTY_LIST;
        int iIntValue = ((Integer) method.invoke(null, list)).intValue();
        S5 s5 = this.f16133d;
        synchronized (s5) {
            int iK = AbstractC0933bL.k(iIntValue);
            s5.b();
            ((C1136f6) s5.f13551b).u0(iK);
        }
    }

    private final void c() {
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.i;
        if (stackTraceElementArr != null) {
            K6 k6 = new K6((String) this.f16134e.invoke(null, stackTraceElementArr));
            S5 s5 = this.f16133d;
            synchronized (s5) {
                try {
                    long jLongValue = k6.f9449I.longValue();
                    s5.b();
                    ((C1136f6) s5.f13551b).N(jLongValue);
                    if (((Boolean) k6.f9450J).booleanValue()) {
                        int i = true != ((Boolean) k6.f9451K).booleanValue() ? 2 : 1;
                        s5.b();
                        ((C1136f6) s5.f13551b).r0(i);
                    } else {
                        s5.b();
                        ((C1136f6) s5.f13551b).r0(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1676p7
    public final void a() {
        switch (this.f14908h) {
            case 0:
                Method method = this.f16134e;
                C1453l0 c1453l0 = (C1453l0) this.i;
                long[] jArr = (long[]) method.invoke(null, Long.valueOf(c1453l0.f15324c), Long.valueOf(c1453l0.f15325d), Long.valueOf(c1453l0.f15326e), Long.valueOf(c1453l0.f15327f));
                S5 s5 = this.f16133d;
                synchronized (s5) {
                    long j6 = jArr[0];
                    s5.b();
                    ((C1136f6) s5.f13551b).j0(j6);
                    long j7 = jArr[1];
                    s5.b();
                    ((C1136f6) s5.f13551b).k0(j7);
                }
                return;
            case 1:
                b();
                return;
            case 2:
                c();
                return;
            default:
                View view = (View) this.i;
                if (view != null) {
                    E9 e9 = H9.f8724c4;
                    C2841s c2841s = C2841s.f23267e;
                    Boolean bool = (Boolean) c2841s.f23270c.a(e9);
                    Boolean bool2 = (Boolean) c2841s.f23270c.a(H9.ic);
                    String str = (String) this.f16134e.invoke(null, view, this.f16130a.f12375a.getResources().getDisplayMetrics(), bool, bool2);
                    C0864a7 c0864a7 = new C0864a7();
                    HashMap mapO = AbstractC2022vd.o(str);
                    if (mapO != null) {
                        c0864a7.f13069H = (Long) mapO.get(0);
                        c0864a7.f13070I = (Long) mapO.get(1);
                        c0864a7.f13071J = (Long) mapO.get(2);
                        c0864a7.f13072K = (Long) mapO.get(3);
                        c0864a7.f13073L = (Long) mapO.get(4);
                    }
                    C1027d6 c1027d6A = C1081e6.A();
                    long jLongValue = c0864a7.f13069H.longValue();
                    c1027d6A.b();
                    ((C1081e6) c1027d6A.f13551b).C(jLongValue);
                    long jLongValue2 = c0864a7.f13070I.longValue();
                    c1027d6A.b();
                    ((C1081e6) c1027d6A.f13551b).D(jLongValue2);
                    long jLongValue3 = c0864a7.f13071J.longValue();
                    c1027d6A.b();
                    ((C1081e6) c1027d6A.f13551b).E(jLongValue3);
                    if (bool2.booleanValue()) {
                        long jLongValue4 = c0864a7.f13073L.longValue();
                        c1027d6A.b();
                        ((C1081e6) c1027d6A.f13551b).B(jLongValue4);
                    }
                    if (bool.booleanValue()) {
                        long jLongValue5 = c0864a7.f13072K.longValue();
                        c1027d6A.b();
                        ((C1081e6) c1027d6A.f13551b).F(jLongValue5);
                    }
                    S5 s52 = this.f16133d;
                    C1081e6 c1081e6 = (C1081e6) c1027d6A.d();
                    s52.b();
                    ((C1136f6) s52.f13551b).W(c1081e6);
                    return;
                }
                return;
        }
    }

    public C1352j7(X6 x6, S5 s5, int i, C1453l0 c1453l0) {
        super(x6, "uAqKAtpzCVdzsQfO3VsjAegcR1bzJIPV7WnBpdLTTlepVA45FMcx2CHHUDw9JuIC", "/PvocKqER/fglRgbozHO01MU+uyxr0WG8/b5JQrvhOY=", s5, i, 85);
        this.i = c1453l0;
    }

    public C1352j7(X6 x6, S5 s5, int i, F3 f32) {
        super(x6, "mt+WJZ1rsk0A64GmF9v+ldp/SXHcK6tYIctDM1+NeYG+QzoGvdHV21P9oFWIcCVk", "JGpzBcqG4jzyQyzoEbT5NvLNZXRWAW3o2QUKET83n6Q=", s5, i, 94);
        this.i = f32;
    }

    public C1352j7(X6 x6, S5 s5, int i, StackTraceElement[] stackTraceElementArr) {
        super(x6, "TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=", s5, i, 45);
        this.i = stackTraceElementArr;
    }
}
