package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import android.graphics.Color;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class y30 implements nl<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    private final gt1 f35603a;

    /* renamed from: b, reason: collision with root package name */
    private final ql f35604b;

    public y30(gt1 scaledDrawableBitmapProvider, ql bitmapProvider) {
        kotlin.jvm.internal.l.f(scaledDrawableBitmapProvider, "scaledDrawableBitmapProvider");
        kotlin.jvm.internal.l.f(bitmapProvider, "bitmapProvider");
        this.f35603a = scaledDrawableBitmapProvider;
        this.f35604b = bitmapProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // com.yandex.mobile.ads.impl.nl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.graphics.drawable.Drawable r6, android.graphics.Bitmap r7) {
        /*
            r5 = this;
            java.lang.String r0 = "drawable"
            kotlin.jvm.internal.l.f(r6, r0)
            java.lang.String r0 = "bitmap"
            kotlin.jvm.internal.l.f(r7, r0)
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L21
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r1 = r0.getBitmap()
            if (r1 == 0) goto L21
            android.graphics.Bitmap r6 = r0.getBitmap()
            java.lang.String r0 = "getBitmap(...)"
            kotlin.jvm.internal.l.e(r6, r0)
            goto L27
        L21:
            com.yandex.mobile.ads.impl.gt1 r0 = r5.f35603a
            android.graphics.Bitmap r6 = r0.a(r6)
        L27:
            com.yandex.mobile.ads.impl.ql r0 = r5.f35604b
            r0.getClass()
            java.lang.String r0 = "src"
            kotlin.jvm.internal.l.f(r6, r0)
            r0 = 1
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r6, r0, r0, r0)
            java.lang.String r1 = "createScaledBitmap(...)"
            kotlin.jvm.internal.l.e(r6, r1)
            com.yandex.mobile.ads.impl.ql r2 = r5.f35604b
            r2.getClass()
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createScaledBitmap(r7, r0, r0, r0)
            kotlin.jvm.internal.l.e(r7, r1)
            com.yandex.mobile.ads.impl.y30$a r1 = new com.yandex.mobile.ads.impl.y30$a
            r2 = 0
            int r6 = r6.getPixel(r2, r2)
            r1.<init>(r6)
            com.yandex.mobile.ads.impl.y30$a r6 = new com.yandex.mobile.ads.impl.y30$a
            int r7 = r7.getPixel(r2, r2)
            r6.<init>(r7)
            int r7 = r1.a()
            int r3 = r6.a()
            int r7 = r7 - r3
            int r7 = java.lang.Math.abs(r7)
            r3 = 20
            if (r7 <= r3) goto L6c
            goto L9c
        L6c:
            int r7 = r1.d()
            int r4 = r6.d()
            int r7 = r7 - r4
            int r7 = java.lang.Math.abs(r7)
            if (r7 <= r3) goto L7c
            goto L9c
        L7c:
            int r7 = r1.c()
            int r4 = r6.c()
            int r7 = r7 - r4
            int r7 = java.lang.Math.abs(r7)
            if (r7 <= r3) goto L8c
            goto L9c
        L8c:
            int r7 = r1.b()
            int r6 = r6.b()
            int r7 = r7 - r6
            int r6 = java.lang.Math.abs(r7)
            if (r6 > r3) goto L9c
            return r0
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.y30.a(android.graphics.drawable.Drawable, android.graphics.Bitmap):boolean");
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f35605a;

        /* renamed from: b, reason: collision with root package name */
        private final int f35606b;

        /* renamed from: c, reason: collision with root package name */
        private final int f35607c;

        /* renamed from: d, reason: collision with root package name */
        private final int f35608d;

        /* renamed from: e, reason: collision with root package name */
        private final int f35609e;

        public /* synthetic */ a(int i) {
            this(i, Color.alpha(i), Color.red(i), Color.green(i), Color.blue(i));
        }

        public final int a() {
            return this.f35606b;
        }

        public final int b() {
            return this.f35609e;
        }

        public final int c() {
            return this.f35608d;
        }

        public final int d() {
            return this.f35607c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f35605a == aVar.f35605a && this.f35606b == aVar.f35606b && this.f35607c == aVar.f35607c && this.f35608d == aVar.f35608d && this.f35609e == aVar.f35609e;
        }

        public final int hashCode() {
            return this.f35609e + sx1.a(this.f35608d, sx1.a(this.f35607c, sx1.a(this.f35606b, this.f35605a * 31, 31), 31), 31);
        }

        public final String toString() {
            int i = this.f35605a;
            int i10 = this.f35606b;
            int i11 = this.f35607c;
            int i12 = this.f35608d;
            int i13 = this.f35609e;
            StringBuilder sbI = androidx.work.s.i("BitmapPixel(color=", i, ", alpha=", i10, ", red=");
            C1094a9.k(sbI, i11, ", green=", i12, ", blue=");
            return B4.i.j(sbI, i13, ")");
        }

        public a(int i, int i10, int i11, int i12, int i13) {
            this.f35605a = i;
            this.f35606b = i10;
            this.f35607c = i11;
            this.f35608d = i12;
            this.f35609e = i13;
        }
    }
}
