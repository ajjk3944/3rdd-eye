package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.er, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1120er implements InterfaceC0956bq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13989a;

    /* renamed from: b, reason: collision with root package name */
    public final ID f13990b;

    /* renamed from: c, reason: collision with root package name */
    public final Mu f13991c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13992d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13993e;

    public /* synthetic */ C1120er(Mu mu, ID id, Object obj, Object obj2, int i) {
        this.f13989a = i;
        this.f13991c = mu;
        this.f13990b = id;
        this.f13993e = obj2;
        this.f13992d = obj;
    }

    public static final String c(int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final boolean a(Xt xt, Qt qt) {
        Ut ut;
        switch (this.f13989a) {
            case 0:
                return !qt.f10793t.isEmpty();
            default:
                return (((N9) this.f13992d) == null || (ut = qt.f10791s) == null || ut.f11811a == null) ? false : true;
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.zk] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final InterfaceFutureC2326a b(Xt xt, Qt qt) {
        C1119eq c1119eqA;
        switch (this.f13989a) {
            case 0:
                Iterator it = qt.f10793t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            c1119eqA = ((InterfaceC1064dq) this.f13992d).a((String) it.next(), qt.f10797v);
                        } catch (C1123eu unused) {
                        }
                    } else {
                        c1119eqA = null;
                    }
                }
                if (c1119eqA == null) {
                    return AbstractC1984ut.w(new C0566Iq(3, "Unable to instantiate mediation adapter class."));
                }
                C0657Of c0657Of = new C0657Of();
                c1119eqA.f13988c.s2(new A1.w(this, c1119eqA, c0657Of));
                if (qt.M) {
                    Bundle bundle = ((C0960bu) xt.f12509a.f10110b).f13482d.f23176m;
                    Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("render_test_ad_label", true);
                }
                Mu mu = this.f13991c;
                Ku ku = Ku.ADAPTER_LOAD_AD_SYN;
                Objects.requireNonNull(mu);
                C1065dr c1065dr = new C1065dr(this, xt, qt, c1119eqA);
                ID id = this.f13990b;
                C1677p8 c1677p8 = new C1677p8(mu, ku, null, Mu.f9922d, Collections.EMPTY_LIST, ((C0623Mf) id).b(new Zs(2, c1065dr)));
                C1677p8 c1677p8A = ((Mu) c1677p8.f16142f).a(c1677p8.u(), Ku.ADAPTER_LOAD_AD_ACK);
                C0518Gc c0518Gc = new C0518Gc(1, c0657Of);
                C0623Mf c0623Mf = AbstractC0640Nf.f10011g;
                C1677p8 c1677p82 = new C1677p8((Mu) c1677p8A.f16142f, c1677p8A.f16139c, (String) c1677p8A.f16137a, (InterfaceFutureC2326a) c1677p8A.f16138b, (List) c1677p8A.f16140d, AbstractC1984ut.F((InterfaceFutureC2326a) c1677p8A.f16141e, c0518Gc, c0623Mf));
                return ((Mu) c1677p82.f16142f).a(c1677p82.u(), Ku.ADAPTER_WRAP_ADAPTER).g(new C1065dr(this, xt, qt, c1119eqA)).u();
            default:
                C0657Of c0657Of2 = new C0657Of();
                C1389jr c1389jr = new C1389jr();
                C1726q3 c1726q3 = new C1726q3(this, c0657Of2, xt, qt, c1389jr, 4, false);
                synchronized (c1389jr) {
                    c1389jr.f15005a = c1726q3;
                }
                Ut ut = qt.f10791s;
                M9 m9 = new M9(c1389jr, ut.f11812b, ut.f11811a);
                Ku ku2 = Ku.CUSTOM_RENDER_SYN;
                Mu mu2 = this.f13991c;
                Objects.requireNonNull(mu2);
                C0697Ql c0697Ql = new C0697Ql(this, 26, m9);
                ID id2 = this.f13990b;
                C1677p8 c1677p83 = new C1677p8(mu2, ku2, null, Mu.f9922d, Collections.EMPTY_LIST, ((C0623Mf) id2).b(new Zs(2, c0697Ql)));
                C1677p8 c1677p8A2 = ((Mu) c1677p83.f16142f).a(c1677p83.u(), Ku.CUSTOM_RENDER_ACK);
                C0518Gc c0518Gc2 = new C0518Gc(1, c0657Of2);
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10011g;
                return new C1677p8((Mu) c1677p8A2.f16142f, c1677p8A2.f16139c, (String) c1677p8A2.f16137a, (InterfaceFutureC2326a) c1677p8A2.f16138b, (List) c1677p8A2.f16140d, AbstractC1984ut.F((InterfaceFutureC2326a) c1677p8A2.f16141e, c0518Gc2, c0623Mf2)).u();
        }
    }
}
