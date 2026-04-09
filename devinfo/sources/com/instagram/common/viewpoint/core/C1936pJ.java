package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1936pJ implements C4X {
    public static final List<C1937pK> A01 = new ArrayList(50);
    public final Handler A00;

    public C1936pJ(Handler handler) {
        this.A00 = handler;
    }

    public static C1937pK A00() {
        C1937pK c1937pK;
        synchronized (A01) {
            c1937pK = A01.isEmpty() ? new C1937pK() : A01.remove(A01.size() - 1);
        }
        return c1937pK;
    }

    public static void A01(C1937pK c1937pK) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c1937pK);
            }
        }
    }

    public final boolean A03(Runnable runnable) {
        return this.A00.post(runnable);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final Looper A8R() {
        return this.A00.getLooper();
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean A9n(int i4) {
        return this.A00.hasMessages(i4);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C1937pK ACg(int i4) {
        return A00().A01(this.A00.obtainMessage(i4), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C1937pK ACh(int i4, int i10, int i11) {
        return A00().A01(this.A00.obtainMessage(i4, i10, i11), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C1937pK ACi(int i4, int i10, int i11, Object obj) {
        return A00().A01(this.A00.obtainMessage(i4, i10, i11, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C1937pK ACj(int i4, Object obj) {
        return A00().A01(this.A00.obtainMessage(i4, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final void AIT(int i4) {
        this.A00.removeMessages(i4);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean AJA(int i4) {
        return this.A00.sendEmptyMessage(i4);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean AJB(int i4, long j) {
        return this.A00.sendEmptyMessageAtTime(i4, j);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean AJD(C4W c4w) {
        return ((C1937pK) c4w).A03(this.A00);
    }
}
