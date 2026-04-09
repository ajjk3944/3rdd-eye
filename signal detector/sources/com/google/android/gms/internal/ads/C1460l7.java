package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.l7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1460l7 extends AbstractCallableC1676p7 {

    /* renamed from: h, reason: collision with root package name */
    public final L6 f15351h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15352j;

    public C1460l7(X6 x6, S5 s5, int i, L6 l6, long j6, long j7) {
        super(x6, "MHYgRB9ZLJ711MlDBgDgyPDdkDVVlHwuqDeF/1i1ByNixJnhURH1lj12DYAv6vPJ", "+dsC4zlVzClLb/gffysp/RM/1OAwcqKcuzzXTv3qmQk=", s5, i, 11);
        this.f15351h = l6;
        this.i = j6;
        this.f15352j = j7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1676p7
    public final void a() {
        L6 l6 = this.f15351h;
        if (l6 != null) {
            String str = (String) this.f16134e.invoke(null, (NetworkCapabilities) l6.f9620b, Long.valueOf(this.i), Long.valueOf(this.f15352j));
            K6 k6 = new K6();
            HashMap mapO = AbstractC2022vd.o(str);
            if (mapO != null) {
                k6.f9449I = (Long) mapO.get(0);
                k6.f9450J = (Long) mapO.get(1);
                k6.f9451K = (Long) mapO.get(2);
            }
            S5 s5 = this.f16133d;
            synchronized (s5) {
                try {
                    long jLongValue = k6.f9449I.longValue();
                    s5.b();
                    ((C1136f6) s5.f13551b).J0(jLongValue);
                    if (((Long) k6.f9450J).longValue() >= 0) {
                        long jLongValue2 = ((Long) k6.f9450J).longValue();
                        s5.b();
                        ((C1136f6) s5.f13551b).h0(jLongValue2);
                    }
                    if (((Long) k6.f9451K).longValue() >= 0) {
                        long jLongValue3 = ((Long) k6.f9451K).longValue();
                        s5.b();
                        ((C1136f6) s5.f13551b).i0(jLongValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
