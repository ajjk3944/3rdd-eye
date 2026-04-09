package u7;

import android.graphics.Paint;
import bc.f0;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: d, reason: collision with root package name */
    public f0 f23392d;

    /* renamed from: e, reason: collision with root package name */
    public float f23393e;

    /* renamed from: f, reason: collision with root package name */
    public f0 f23394f;

    /* renamed from: g, reason: collision with root package name */
    public float f23395g;

    /* renamed from: h, reason: collision with root package name */
    public float f23396h;

    /* renamed from: i, reason: collision with root package name */
    public float f23397i;
    public float j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f23398l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f23399m;

    /* renamed from: n, reason: collision with root package name */
    public float f23400n;

    @Override // u7.k
    public final boolean a() {
        return this.f23394f.i() || this.f23392d.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // u7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            bc.f0 r0 = r6.f23394f
            boolean r1 = r0.i()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f2604r
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f2602d
            if (r1 == r4) goto L1e
            r0.f2602d = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            bc.f0 r1 = r6.f23392d
            boolean r4 = r1.i()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f2604r
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f2602d
            if (r7 == r4) goto L3a
            r1.f2602d = r7
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.i.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f23396h;
    }

    public int getFillColor() {
        return this.f23394f.f2602d;
    }

    public float getStrokeAlpha() {
        return this.f23395g;
    }

    public int getStrokeColor() {
        return this.f23392d.f2602d;
    }

    public float getStrokeWidth() {
        return this.f23393e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.f23397i;
    }

    public void setFillAlpha(float f10) {
        this.f23396h = f10;
    }

    public void setFillColor(int i10) {
        this.f23394f.f2602d = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.f23395g = f10;
    }

    public void setStrokeColor(int i10) {
        this.f23392d.f2602d = i10;
    }

    public void setStrokeWidth(float f10) {
        this.f23393e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f23397i = f10;
    }
}
