package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2314pJ implements C4X {
    public static final List<C2315pK> A01 = new ArrayList(50);
    public final Handler A00;

    public C2314pJ(Handler handler) {
        this.A00 = handler;
    }

    public static C2315pK A00() {
        C2315pK c2315pK;
        synchronized (A01) {
            c2315pK = A01.isEmpty() ? new C2315pK() : A01.remove(A01.size() - 1);
        }
        return c2315pK;
    }

    public static void A01(C2315pK c2315pK) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c2315pK);
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
    public final boolean A9n(int i10) {
        return this.A00.hasMessages(i10);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2315pK ACg(int i10) {
        return A00().A01(this.A00.obtainMessage(i10), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2315pK ACh(int i10, int i11, int i12) {
        return A00().A01(this.A00.obtainMessage(i10, i11, i12), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2315pK ACi(int i10, int i11, int i12, Object obj) {
        return A00().A01(this.A00.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2315pK ACj(int i10, Object obj) {
        return A00().A01(this.A00.obtainMessage(i10, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final void AIT(int i10) {
        this.A00.removeMessages(i10);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean AJA(int i10) {
        return this.A00.sendEmptyMessage(i10);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean AJB(int i10, long j10) {
        return this.A00.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean AJD(C4W c4w) {
        return ((C2315pK) c4w).A03(this.A00);
    }
}
