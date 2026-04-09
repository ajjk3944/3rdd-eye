package jj;

import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import com.google.android.gms.internal.measurement.e5;
import h9.r2;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class e0 extends androidx.lifecycle.o implements ek.g {
    public hk.k B;

    /* renamed from: g, reason: collision with root package name */
    public final fj.g f13735g;

    /* renamed from: r, reason: collision with root package name */
    public final al.b f13736r;

    /* renamed from: x, reason: collision with root package name */
    public final m0 f13737x;

    /* renamed from: y, reason: collision with root package name */
    public final List f13738y;

    public e0(fj.g gVar, al.b bVar) {
        super(10, false);
        this.f13735g = gVar;
        this.f13736r = bVar;
        this.f13737x = m0.NETWORK_GENERATION_TRIGGER;
        this.f13738y = e5.I(o0.FIVE_G_CONNECTED, o0.FIVE_G_AVAILABLE, o0.FIVE_G_DISCONNECTED, o0.FIVE_G_MMWAVE_DISABLED, o0.FIVE_G_MMWAVE_ENABLED, o0.FIVE_G_STANDALONE_CONNECTED, o0.FIVE_G_STANDALONE_DISCONNECTED, o0.FOUR_G_CONNECTED, o0.FOUR_G_DISCONNECTED, o0.THREE_G_CONNECTED, o0.THREE_G_DISCONNECTED, o0.TWO_G_CONNECTED, o0.TWO_G_DISCONNECTED);
    }

    @Override // androidx.lifecycle.o
    public final hk.k g1() {
        return this.B;
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        return this.f13737x;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        return this.f13738y;
    }

    @Override // androidx.lifecycle.o
    public final void r1(hk.k kVar) {
        bk.c cVar = (bk.c) this.f13736r.f813e;
        this.B = kVar;
        if (kVar == null) {
            cVar.n(this);
        } else {
            cVar.p(this);
        }
    }

    public final boolean t1() {
        TelephonyDisplayInfo telephonyDisplayInfo;
        TelephonyDisplayInfo telephonyDisplayInfo2;
        r2 r2Var = this.f13735g.f8919h;
        fj.n nVar = (fj.n) r2Var.f10470a;
        Integer numA = null;
        ServiceState serviceState = nVar != null ? nVar.N : null;
        Pattern pattern = com.opensignal.sdk.common.measurements.base.e.f5854b;
        Integer numA2 = serviceState == null ? null : com.opensignal.sdk.common.measurements.base.e.a(serviceState.toString(), com.opensignal.sdk.common.measurements.base.e.f5855c);
        if (numA2 != null && numA2.intValue() == 2) {
            return true;
        }
        if (((ch.f) r2Var.f10473r).g()) {
            numA = ((com.opensignal.sdk.common.measurements.base.c) r2Var.f10475y).E(nVar != null ? nVar.N : null);
        } else {
            ServiceState serviceState2 = nVar != null ? nVar.N : null;
            if (serviceState2 != null) {
                numA = com.opensignal.sdk.common.measurements.base.e.a(serviceState2.toString(), com.opensignal.sdk.common.measurements.base.e.f5856d);
            }
        }
        if (numA != null && numA.intValue() == 4) {
            return true;
        }
        if (nVar == null || (telephonyDisplayInfo2 = nVar.R) == null || telephonyDisplayInfo2.getOverrideNetworkType() != 4) {
            return ((ak.g) ((q3.a) r2Var.f10472g).f20680g).f529f.f449a.f481l == 0 && nVar != null && (telephonyDisplayInfo = nVar.R) != null && telephonyDisplayInfo.getOverrideNetworkType() == 5;
        }
        return true;
    }
}
