package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jg extends ouw<PointF, PointF> {
    private final ouw<Float, Float> bly;
    protected com.bytedance.adsdk.vt.ra.vt<Float> fkw;

    /* renamed from: le, reason: collision with root package name */
    protected com.bytedance.adsdk.vt.ra.vt<Float> f7177le;
    private final PointF pno;
    private final PointF ra;
    private final ouw<Float, Float> tlj;

    public jg(ouw<Float, Float> ouwVar, ouw<Float, Float> ouwVar2) {
        super(Collections.EMPTY_LIST);
        this.ra = new PointF();
        this.pno = new PointF();
        this.bly = ouwVar;
        this.tlj = ouwVar2;
        ouw(ra());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    /* renamed from: pno, reason: merged with bridge method [inline-methods] */
    public PointF le() {
        if (this.fkw != null && this.bly.vt() != null) {
            this.bly.yu();
            throw null;
        }
        if (this.f7177le != null && this.tlj.vt() != null) {
            this.tlj.yu();
            throw null;
        }
        this.pno.set(this.ra.x, 0.0f);
        PointF pointF = this.pno;
        pointF.set(pointF.x, this.ra.y);
        return this.pno;
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ PointF ouw(com.bytedance.adsdk.vt.ra.ouw<PointF> ouwVar, float f10) {
        return le();
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final void ouw(float f10) {
        this.bly.ouw(f10);
        this.tlj.ouw(f10);
        this.ra.set(this.bly.le().floatValue(), this.tlj.le().floatValue());
        for (int i4 = 0; i4 < this.ouw.size(); i4++) {
            this.ouw.get(i4).ouw();
        }
    }
}
