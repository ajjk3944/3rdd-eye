package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.C4359g7;
import com.google.android.gms.internal.measurement.C4452s2;
import com.google.android.gms.internal.measurement.C4460t2;
import com.google.android.gms.internal.measurement.C4468u2;
import com.google.android.gms.internal.measurement.C4484w2;
import com.google.android.gms.internal.measurement.C4492x2;
import com.google.android.gms.internal.measurement.C4500y2;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.r5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4946r5 extends U6 {
    public C4946r5(C4833d7 c4833d7) {
        super(c4833d7);
    }

    private static String d(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.U6
    protected final boolean t() {
        return false;
    }

    public final byte[] u(L l10, String str) {
        u7 u7Var;
        Bundle bundle;
        C4492x2.a aVar;
        C4864h2 c4864h2;
        C4484w2.a aVar2;
        byte[] bArr;
        long j10;
        H hA;
        j();
        this.f36331a.j();
        AbstractC7901p.l(l10);
        AbstractC7901p.f(str);
        if (!"_iap".equals(l10.f35974a) && !"_iapx".equals(l10.f35974a)) {
            zzj().B().c("Generating a payload for this event is not available. package_name, event_name", str, l10.f35974a);
            return null;
        }
        C4484w2.a aVarL = C4484w2.L();
        m().j1();
        try {
            C4864h2 c4864h2Q0 = m().Q0(str);
            if (c4864h2Q0 == null) {
                zzj().B().b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!c4864h2Q0.A()) {
                zzj().B().b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            C4492x2.a aVarG1 = C4492x2.D2().D0(1).g1("android");
            if (!TextUtils.isEmpty(c4864h2Q0.l())) {
                aVarG1.Z(c4864h2Q0.l());
            }
            if (!TextUtils.isEmpty(c4864h2Q0.n())) {
                aVarG1.m0((String) AbstractC7901p.l(c4864h2Q0.n()));
            }
            if (!TextUtils.isEmpty(c4864h2Q0.o())) {
                aVarG1.t0((String) AbstractC7901p.l(c4864h2Q0.o()));
            }
            if (c4864h2Q0.V() != -2147483648L) {
                aVarG1.p0((int) c4864h2Q0.V());
            }
            aVarG1.A0(c4864h2Q0.A0()).r0(c4864h2Q0.w0());
            String strQ = c4864h2Q0.q();
            String strJ = c4864h2Q0.j();
            if (!TextUtils.isEmpty(strQ)) {
                aVarG1.a1(strQ);
            } else if (!TextUtils.isEmpty(strJ)) {
                aVarG1.M(strJ);
            }
            aVarG1.Q0(c4864h2Q0.K0());
            C4839e4 c4839e4A0 = this.f36173b.a0(str);
            aVarG1.k0(c4864h2Q0.u0());
            if (this.f36331a.n() && a().L(aVarG1.n1()) && c4839e4A0.w() && !TextUtils.isEmpty(null)) {
                aVarG1.O0(null);
            }
            aVarG1.B0(c4839e4A0.u());
            if (c4839e4A0.w() && c4864h2Q0.z()) {
                Pair pairV = o().v(c4864h2Q0.l(), c4839e4A0);
                if (c4864h2Q0.z() && pairV != null && !TextUtils.isEmpty((CharSequence) pairV.first)) {
                    aVarG1.i1(d((String) pairV.first, Long.toString(l10.f35977d)));
                    Object obj = pairV.second;
                    if (obj != null) {
                        aVarG1.h0(((Boolean) obj).booleanValue());
                    }
                }
            }
            b().l();
            C4492x2.a aVarJ0 = aVarG1.J0(Build.MODEL);
            b().l();
            aVarJ0.e1(Build.VERSION.RELEASE).M0((int) b().q()).m1(b().r());
            if (c4839e4A0.x() && c4864h2Q0.m() != null) {
                aVarG1.g0(d((String) AbstractC7901p.l(c4864h2Q0.m()), Long.toString(l10.f35977d)));
            }
            if (!TextUtils.isEmpty(c4864h2Q0.p())) {
                aVarG1.Y0((String) AbstractC7901p.l(c4864h2Q0.p()));
            }
            String strL = c4864h2Q0.l();
            List listD1 = m().d1(strL);
            Iterator it = listD1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u7Var = null;
                    break;
                }
                u7Var = (u7) it.next();
                if ("_lte".equals(u7Var.f36790c)) {
                    break;
                }
            }
            if (u7Var == null || u7Var.f36792e == null) {
                u7 u7Var2 = new u7(strL, "auto", "_lte", zzb().a(), 0L);
                listD1.add(u7Var2);
                m().i0(u7Var2);
            }
            com.google.android.gms.internal.measurement.C2[] c2Arr = new com.google.android.gms.internal.measurement.C2[listD1.size()];
            for (int i10 = 0; i10 < listD1.size(); i10++) {
                C2.a aVarB = com.google.android.gms.internal.measurement.C2.R().z(((u7) listD1.get(i10)).f36790c).B(((u7) listD1.get(i10)).f36791d);
                k().R(aVarB, ((u7) listD1.get(i10)).f36792e);
                c2Arr[i10] = (com.google.android.gms.internal.measurement.C2) ((com.google.android.gms.internal.measurement.D4) aVarB.p());
            }
            aVarG1.s0(Arrays.asList(c2Arr));
            this.f36173b.w(c4864h2Q0, aVarG1);
            this.f36173b.i0(c4864h2Q0, aVarG1);
            P2 p2B = P2.b(l10);
            g().J(p2B.f36165d, m().M0(str));
            g().S(p2B, a().t(str));
            Bundle bundle2 = p2B.f36165d;
            bundle2.putLong("_c", 1L);
            zzj().B().a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", l10.f35976c);
            if (g().B0(aVarG1.n1(), c4864h2Q0.v())) {
                g().K(bundle2, "_dbg", 1L);
                g().K(bundle2, "_r", 1L);
            }
            H hP0 = m().P0(str, l10.f35974a);
            if (hP0 == null) {
                bundle = bundle2;
                aVar = aVarG1;
                c4864h2 = c4864h2Q0;
                aVar2 = aVarL;
                bArr = null;
                hA = new H(str, l10.f35974a, 0L, 0L, l10.f35977d, 0L, null, null, null, null);
                j10 = 0;
            } else {
                bundle = bundle2;
                aVar = aVarG1;
                c4864h2 = c4864h2Q0;
                aVar2 = aVarL;
                bArr = null;
                j10 = hP0.f35907f;
                hA = hP0.a(l10.f35977d);
            }
            m().U(hA);
            I i11 = new I(this.f36331a, l10.f35976c, str, l10.f35974a, l10.f35977d, j10, bundle);
            C4452s2.a aVarA = C4452s2.R().H(i11.f35927d).F(i11.f35925b).A(i11.f35928e);
            Iterator it2 = i11.f35929f.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                C4468u2.a aVarB2 = C4468u2.T().B(str2);
                Object objJ = i11.f35929f.j(str2);
                if (objJ != null) {
                    k().Q(aVarB2, objJ);
                    aVarA.B(aVarB2);
                }
            }
            C4492x2.a aVar3 = aVar;
            aVar3.F(aVarA).G(C4500y2.F().u(C4460t2.F().u(hA.f35904c).w(l10.f35974a)));
            aVar3.L(l().v(c4864h2.l(), Collections.emptyList(), aVar3.Q(), Long.valueOf(aVarA.K()), Long.valueOf(aVarA.K()), false));
            if (aVarA.O()) {
                aVar3.N0(aVarA.K()).w0(aVarA.K());
            }
            long jE0 = c4864h2.E0();
            if (jE0 != 0) {
                aVar3.E0(jE0);
            }
            long jI0 = c4864h2.I0();
            if (jI0 != 0) {
                aVar3.I0(jI0);
            } else if (jE0 != 0) {
                aVar3.I0(jE0);
            }
            String strU = c4864h2.u();
            if (C4359g7.a() && a().D(str, N.f36032L0) && strU != null) {
                aVar3.k1(strU);
            }
            c4864h2.y();
            aVar3.v0((int) c4864h2.G0()).X0(118003L).U0(zzb().a()).n0(true);
            this.f36173b.G(aVar3.n1(), aVar3);
            C4484w2.a aVar4 = aVar2;
            aVar4.x(aVar3);
            C4864h2 c4864h22 = c4864h2;
            c4864h22.D0(aVar3.u0());
            c4864h22.z0(aVar3.o0());
            m().V(c4864h22, false, false);
            m().o1();
            try {
                return k().d0(((C4484w2) ((com.google.android.gms.internal.measurement.D4) aVar4.p())).i());
            } catch (IOException e10) {
                zzj().C().c("Data loss. Failed to bundle and serialize. appId", L2.r(str), e10);
                return bArr;
            }
        } catch (SecurityException e11) {
            zzj().B().b("Resettable device id encryption failed", e11.getMessage());
            return new byte[0];
        } catch (SecurityException e12) {
            zzj().B().b("app instance id encryption failed", e12.getMessage());
            return new byte[0];
        } finally {
            m().m1();
        }
    }
}
