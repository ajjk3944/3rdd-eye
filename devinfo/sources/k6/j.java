package k6;

import android.graphics.Paint;
import com.google.android.gms.common.api.internal.a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: d, reason: collision with root package name */
    public a0 f27985d;

    /* renamed from: e, reason: collision with root package name */
    public float f27986e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f27987f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public float f27988h;

    /* renamed from: i, reason: collision with root package name */
    public float f27989i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f27990k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f27991l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f27992m;

    /* renamed from: n, reason: collision with root package name */
    public float f27993n;

    @Override // k6.l
    public final boolean a() {
        return this.f27987f.i() || this.f27985d.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // k6.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            com.google.android.gms.common.api.internal.a0 r0 = r6.f27987f
            boolean r1 = r0.i()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f9071d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f9069b
            if (r1 == r4) goto L1e
            r0.f9069b = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            com.google.android.gms.common.api.internal.a0 r1 = r6.f27985d
            boolean r4 = r1.i()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f9071d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f9069b
            if (r7 == r4) goto L3a
            r1.f9069b = r7
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.j.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f27988h;
    }

    public int getFillColor() {
        return this.f27987f.f9069b;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.f27985d.f9069b;
    }

    public float getStrokeWidth() {
        return this.f27986e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.f27990k;
    }

    public float getTrimPathStart() {
        return this.f27989i;
    }

    public void setFillAlpha(float f10) {
        this.f27988h = f10;
    }

    public void setFillColor(int i4) {
        this.f27987f.f9069b = i4;
    }

    public void setStrokeAlpha(float f10) {
        this.g = f10;
    }

    public void setStrokeColor(int i4) {
        this.f27985d.f9069b = i4;
    }

    public void setStrokeWidth(float f10) {
        this.f27986e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f27990k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f27989i = f10;
    }
}
