package com.instagram.common.viewpoint.core;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0907Vk {
    public final InterfaceC0905Vi A0B;
    public final boolean A0F;
    public final String A0C = C0907Vk.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
    public final int A08 = FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = FacebookMediationAdapter.ERROR_NULL_CONTEXT;
    public final int A05 = 108;
    public final int A06 = FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<C0906Vj> A0D = new LinkedList();

    public C0907Vk(T8 t82, InterfaceC0905Vi interfaceC0905Vi) {
        int nativeViewabilityHistorySamplingRate = AbstractC0888Ur.A0D(t82);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = t82.A09().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = interfaceC0905Vi;
    }

    private int A00() {
        return this.A0B.A7d();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(C0906Vj c0906Vj) {
        synchronized (this.A0D) {
            this.A0D.add(c0906Vj);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new C0906Vj(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new C0906Vj(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new C0906Vj(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new C0906Vj(A01(), FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new C0906Vj(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new C0906Vj(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new C0906Vj(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new C0906Vj(A01(), FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, A00(), null));
    }

    public final void A0C(T8 t82, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new C0906Vj(A01(), FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, A00(), null));
        YG.A06.execute(new RunnableC0904Vh(this, str, t82));
    }
}
