package M0;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: d, reason: collision with root package name */
    public I.d f2645d;

    /* renamed from: e, reason: collision with root package name */
    public float f2646e;

    /* renamed from: f, reason: collision with root package name */
    public I.d f2647f;

    /* renamed from: g, reason: collision with root package name */
    public float f2648g;

    /* renamed from: h, reason: collision with root package name */
    public float f2649h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f2650j;

    /* renamed from: k, reason: collision with root package name */
    public float f2651k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f2652l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f2653m;

    /* renamed from: n, reason: collision with root package name */
    public float f2654n;

    @Override // M0.m
    public final boolean a() {
        return this.f2647f.c() || this.f2645d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // M0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            I.d r0 = r6.f2647f
            boolean r1 = r0.c()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f1852d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f1850b
            if (r1 == r4) goto L1e
            r0.f1850b = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            I.d r1 = r6.f2645d
            boolean r4 = r1.c()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f1852d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f1850b
            if (r7 == r4) goto L3a
            r1.f1850b = r7
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.k.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f2649h;
    }

    public int getFillColor() {
        return this.f2647f.f1850b;
    }

    public float getStrokeAlpha() {
        return this.f2648g;
    }

    public int getStrokeColor() {
        return this.f2645d.f1850b;
    }

    public float getStrokeWidth() {
        return this.f2646e;
    }

    public float getTrimPathEnd() {
        return this.f2650j;
    }

    public float getTrimPathOffset() {
        return this.f2651k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.f2649h = f2;
    }

    public void setFillColor(int i) {
        this.f2647f.f1850b = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f2648g = f2;
    }

    public void setStrokeColor(int i) {
        this.f2645d.f1850b = i;
    }

    public void setStrokeWidth(float f2) {
        this.f2646e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f2650j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f2651k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
