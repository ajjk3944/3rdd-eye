package com.bytedance.adsdk.ugeno.fkw;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    int bly;

    /* renamed from: cf, reason: collision with root package name */
    float f6888cf;
    int fkw;
    int ko;

    /* renamed from: le, reason: collision with root package name */
    int f6890le;
    int mwh;
    int pno;
    int ra;
    int rn;
    int ryl;
    float tlj;
    boolean vm;
    boolean zih;
    int ouw = Integer.MAX_VALUE;
    int vt = Integer.MAX_VALUE;

    /* renamed from: lh, reason: collision with root package name */
    int f6891lh = LinearLayoutManager.INVALID_OFFSET;
    int yu = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: jg, reason: collision with root package name */
    List<Integer> f6889jg = new ArrayList();

    public final int ouw() {
        return this.pno - this.bly;
    }

    public final void ouw(View view, int i4, int i10, int i11, int i12) {
        vt vtVar = (vt) view.getLayoutParams();
        this.ouw = Math.min(this.ouw, (view.getLeft() - vtVar.mwh()) - i4);
        this.vt = Math.min(this.vt, (view.getTop() - vtVar.jg()) - i10);
        this.f6891lh = Math.max(this.f6891lh, vtVar.ko() + view.getRight() + i11);
        this.yu = Math.max(this.yu, vtVar.rn() + view.getBottom() + i12);
    }
}
