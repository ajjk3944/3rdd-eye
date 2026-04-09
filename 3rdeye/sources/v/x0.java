package v;

/* compiled from: ZoomStateImpl.java */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public float f46947a;

    /* renamed from: b, reason: collision with root package name */
    public final float f46948b;

    /* renamed from: c, reason: collision with root package name */
    public final float f46949c;

    /* renamed from: d, reason: collision with root package name */
    public float f46950d;

    public x0(float f10, float f11) {
        this.f46948b = f10;
        this.f46949c = f11;
    }

    public final float a() {
        return this.f46950d;
    }

    public final float b() {
        return this.f46948b;
    }

    public final float c() {
        return this.f46949c;
    }

    public final float d() {
        return this.f46947a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() throws java.lang.IllegalArgumentException {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r6.f46948b
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            float r3 = r6.f46949c
            if (r2 > 0) goto L29
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L29
            r6.f46947a = r0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L17
        L15:
            r0 = r5
            goto L26
        L17:
            if (r2 != 0) goto L1a
            goto L26
        L1a:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L1f
            goto L15
        L1f:
            float r1 = r0 / r1
            float r2 = r0 / r3
            float r0 = r0 - r2
            float r1 = r1 - r2
            float r0 = r0 / r1
        L26:
            r6.f46950d = r0
            return
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested zoomRatio 1.0 is not within valid range ["
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r2 = " , "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v.x0.e():void");
    }
}
