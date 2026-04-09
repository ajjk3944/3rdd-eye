package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.np, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3888np implements InterfaceC22563v {
    public static final List<C3889nq> A01 = new ArrayList(50);
    public final Handler A00;

    public C3888np(Handler handler) {
        this.A00 = handler;
    }

    public static C3889nq A00() {
        C3889nq c3889nq;
        synchronized (A01) {
            c3889nq = A01.isEmpty() ? new C3889nq() : A01.remove(A01.size() - 1);
        }
        return c3889nq;
    }

    public static void A01(C3889nq c3889nq) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c3889nq);
            }
        }
    }

    public final boolean A03(Runnable runnable) {
        return this.A00.post(runnable);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC22563v
    public final Looper A8J() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC22563v
    public final boolean A9f(int i) {
        return this.A00.hasMessages(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC22563v
    public final C3889nq AC7(int i) {
        return A00().A01(this.A00.obtainMessage(i), this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC22563v
    public final C3889nq AC8(int i, int i10, int i11) {
        return A00().A01(this.A00.obtainMessage(i, i10, i11), this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC22563v
    public final C3889nq AC9(int i, int i10, int i11, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, i10, i11, obj), this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC22563v
    public final C3889nq ACA(int i, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, obj), this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC22563v
    public final void AHj(int i) {
        this.A00.removeMessages(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC22563v
    public final boolean AIQ(int i) {
        return this.A00.sendEmptyMessage(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC22563v
    public final boolean AIR(int i, long j4) {
        return this.A00.sendEmptyMessageAtTime(i, j4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC22563v
    public final boolean AIT(InterfaceC22553u interfaceC22553u) {
        return ((C3889nq) interfaceC22553u).A03(this.A00);
    }
}
