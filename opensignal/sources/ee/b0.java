package ee;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f8089a;

    /* renamed from: b, reason: collision with root package name */
    public b9.e f8090b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f8091c;

    /* renamed from: d, reason: collision with root package name */
    public b9.e[] f8092d;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r12, android.content.res.XmlResourceParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r11 = this;
            int r0 = r13.getDepth()
            r1 = 1
            int r0 = r0 + r1
        L6:
            int r2 = r13.next()
            if (r2 == r1) goto Ld4
            int r3 = r13.getDepth()
            if (r3 >= r0) goto L15
            r4 = 3
            if (r2 == r4) goto Ld4
        L15:
            r4 = 2
            if (r2 != r4) goto L6
            if (r3 > r0) goto L6
            java.lang.String r2 = r13.getName()
            java.lang.String r3 = "item"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            goto L6
        L27:
            android.content.res.Resources r2 = r12.getResources()
            r3 = 0
            if (r15 != 0) goto L35
            int[] r4 = ed.l.StateListSizeChange
            android.content.res.TypedArray r2 = r2.obtainAttributes(r14, r4)
            goto L3b
        L35:
            int[] r2 = ed.l.StateListSizeChange
            android.content.res.TypedArray r2 = r15.obtainStyledAttributes(r14, r2, r3, r3)
        L3b:
            int r4 = ed.l.StateListSizeChange_widthChange
            android.util.TypedValue r4 = r2.peekValue(r4)
            if (r4 != 0) goto L44
            goto L71
        L44:
            int r5 = r4.type
            r6 = 5
            if (r5 != r6) goto L60
            ee.z r5 = new ee.z
            ee.a0 r6 = ee.a0.PIXELS
            int r4 = r4.data
            android.content.res.Resources r7 = r2.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r4 = android.util.TypedValue.complexToDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r5.<init>(r6, r4)
            goto L72
        L60:
            r6 = 6
            if (r5 != r6) goto L71
            ee.z r5 = new ee.z
            ee.a0 r6 = ee.a0.PERCENT
            r7 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4.getFraction(r7, r7)
            r5.<init>(r6, r4)
            goto L72
        L71:
            r5 = 0
        L72:
            r2.recycle()
            int r2 = r14.getAttributeCount()
            int[] r4 = new int[r2]
            r6 = r3
            r7 = r6
        L7d:
            if (r6 >= r2) goto L97
            int r8 = r14.getAttributeNameResource(r6)
            int r9 = ed.b.widthChange
            if (r8 == r9) goto L94
            int r9 = r7 + 1
            boolean r10 = r14.getAttributeBooleanValue(r6, r3)
            if (r10 == 0) goto L90
            goto L91
        L90:
            int r8 = -r8
        L91:
            r4[r7] = r8
            r7 = r9
        L94:
            int r6 = r6 + 1
            goto L7d
        L97:
            int[] r2 = android.util.StateSet.trimStateSet(r4, r7)
            b9.e r4 = new b9.e
            r6 = 18
            r7 = 0
            r4.<init>(r6, r7)
            r4.f2481d = r5
            int r5 = r11.f8089a
            if (r5 == 0) goto Lac
            int r6 = r2.length
            if (r6 != 0) goto Lae
        Lac:
            r11.f8090b = r4
        Lae:
            int[][] r6 = r11.f8091c
            int r7 = r6.length
            if (r5 < r7) goto Lc5
            int r7 = r5 + 10
            int[][] r8 = new int[r7][]
            java.lang.System.arraycopy(r6, r3, r8, r3, r5)
            r11.f8091c = r8
            b9.e[] r6 = new b9.e[r7]
            b9.e[] r7 = r11.f8092d
            java.lang.System.arraycopy(r7, r3, r6, r3, r5)
            r11.f8092d = r6
        Lc5:
            int[][] r3 = r11.f8091c
            int r5 = r11.f8089a
            r3[r5] = r2
            b9.e[] r2 = r11.f8092d
            r2[r5] = r4
            int r5 = r5 + r1
            r11.f8089a = r5
            goto L6
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.b0.a(android.content.Context, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }
}
