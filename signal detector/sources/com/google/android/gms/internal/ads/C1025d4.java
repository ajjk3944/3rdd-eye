package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.C0305b;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025d4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13722a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13723b;

    /* renamed from: c, reason: collision with root package name */
    public final T0[] f13724c;

    /* renamed from: d, reason: collision with root package name */
    public final C0305b f13725d;

    public C1025d4(int i, List list) {
        this.f13722a = i;
        switch (i) {
            case 1:
                this.f13723b = list;
                this.f13724c = new T0[list.size()];
                C0305b c0305b = new C0305b(new C1283hr(4, this));
                this.f13725d = c0305b;
                c0305b.v(3);
                break;
            default:
                this.f13723b = list;
                this.f13724c = new T0[list.size()];
                this.f13725d = new C0305b(new L6(4, this));
                break;
        }
    }

    public final void a(InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        switch (this.f13722a) {
            case 0:
                int i = 0;
                while (true) {
                    T0[] t0Arr = this.f13724c;
                    if (i >= t0Arr.length) {
                        break;
                    } else {
                        c1189g4.a();
                        c1189g4.b();
                        T0 t0X = interfaceC2100x0.x(c1189g4.f14197d, 3);
                        TP tp = (TP) this.f13723b.get(i);
                        String str = tp.f11397m;
                        boolean z6 = true;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z6 = false;
                        }
                        AbstractC0582Jp.b0(z6, "Invalid closed caption MIME type provided: %s", str);
                        String str2 = tp.f11386a;
                        if (str2 == null) {
                            c1189g4.b();
                            str2 = c1189g4.f14198e;
                        }
                        C1855sP c1855sP = new C1855sP();
                        c1855sP.f16722a = str2;
                        c1855sP.d("video/mp2t");
                        c1855sP.e(str);
                        c1855sP.f16726e = tp.f11390e;
                        c1855sP.f16725d = tp.f11389d;
                        c1855sP.f16719I = tp.f11383J;
                        c1855sP.f16735o = tp.f11400p;
                        t0X.e(new TP(c1855sP));
                        t0Arr[i] = t0X;
                        i++;
                    }
                }
                break;
            default:
                int i3 = 0;
                while (true) {
                    T0[] t0Arr2 = this.f13724c;
                    if (i3 >= t0Arr2.length) {
                        break;
                    } else {
                        c1189g4.a();
                        c1189g4.b();
                        T0 t0X2 = interfaceC2100x0.x(c1189g4.f14197d, 3);
                        TP tp2 = (TP) this.f13723b.get(i3);
                        String str3 = tp2.f11397m;
                        boolean z7 = true;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z7 = false;
                        }
                        AbstractC0582Jp.b0(z7, "Invalid closed caption MIME type provided: %s", str3);
                        C1855sP c1855sP2 = new C1855sP();
                        c1189g4.b();
                        c1855sP2.f16722a = c1189g4.f14198e;
                        c1855sP2.d("video/mp2t");
                        c1855sP2.e(str3);
                        c1855sP2.f16726e = tp2.f11390e;
                        c1855sP2.f16725d = tp2.f11389d;
                        c1855sP2.f16719I = tp2.f11383J;
                        c1855sP2.f16735o = tp2.f11400p;
                        t0X2.e(new TP(c1855sP2));
                        t0Arr2[i3] = t0X2;
                        i3++;
                    }
                }
                break;
        }
    }

    public void b(long j6, C2036vr c2036vr) {
        if (c2036vr.B() < 9) {
            return;
        }
        int iB = c2036vr.b();
        int iB2 = c2036vr.b();
        int iK = c2036vr.K();
        if (iB == 434 && iB2 == 1195456820 && iK == 3) {
            this.f13725d.w(j6, c2036vr);
        }
    }
}
