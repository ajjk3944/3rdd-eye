package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.T;
import h.AbstractC5927a;
import h.AbstractC5929c;
import h.AbstractC5930d;
import h.AbstractC5931e;
import i.AbstractC6050a;
import w1.AbstractC8253a;

/* renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3886k {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f27420b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static C3886k f27421c;

    /* renamed from: a, reason: collision with root package name */
    private T f27422a;

    /* renamed from: androidx.appcompat.widget.k$a */
    class a implements T.c {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f27423a = {AbstractC5931e.f47995R, AbstractC5931e.f47993P, AbstractC5931e.f47997a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f27424b = {AbstractC5931e.f48011o, AbstractC5931e.f47979B, AbstractC5931e.f48016t, AbstractC5931e.f48012p, AbstractC5931e.f48013q, AbstractC5931e.f48015s, AbstractC5931e.f48014r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f27425c = {AbstractC5931e.f47992O, AbstractC5931e.f47994Q, AbstractC5931e.f48007k, AbstractC5931e.f47988K, AbstractC5931e.f47989L, AbstractC5931e.f47990M, AbstractC5931e.f47991N};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f27426d = {AbstractC5931e.f48019w, AbstractC5931e.f48005i, AbstractC5931e.f48018v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f27427e = {AbstractC5931e.f47987J, AbstractC5931e.f47996S};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f27428f = {AbstractC5931e.f47999c, AbstractC5931e.f48003g, AbstractC5931e.f48000d, AbstractC5931e.f48004h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int iC = X.c(context, AbstractC5927a.f47957t);
            return new ColorStateList(new int[][]{X.f27295b, X.f27298e, X.f27296c, X.f27302i}, new int[]{X.b(context, AbstractC5927a.f47955r), AbstractC8253a.g(iC, i10), AbstractC8253a.g(iC, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, X.c(context, AbstractC5927a.f47954q));
        }

        private ColorStateList j(Context context) {
            return h(context, X.c(context, AbstractC5927a.f47955r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = AbstractC5927a.f47959v;
            ColorStateList colorStateListE = X.e(context, i10);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = X.f27295b;
                iArr2[0] = X.b(context, i10);
                iArr[1] = X.f27299f;
                iArr2[1] = X.c(context, AbstractC5927a.f47956s);
                iArr[2] = X.f27302i;
                iArr2[2] = X.c(context, i10);
            } else {
                int[] iArr3 = X.f27295b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = X.f27299f;
                iArr2[1] = X.c(context, AbstractC5927a.f47956s);
                iArr[2] = X.f27302i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(T t10, Context context, int i10) throws Resources.NotFoundException {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = t10.i(context, AbstractC5931e.f47983F);
            Drawable drawableI2 = t10.i(context, AbstractC5931e.f47984G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C3886k.f27420b;
            }
            drawableMutate.setColorFilter(C3886k.e(i10, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[RETURN] */
        @Override // androidx.appcompat.widget.T.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C3886k.a()
                int[] r1 = r7.f27423a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = h.AbstractC5927a.f47958u
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f27425c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = h.AbstractC5927a.f47956s
                goto L11
            L20:
                int[] r1 = r7.f27426d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = h.AbstractC5931e.f48017u
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = h.AbstractC5931e.f48008l
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L66
                android.graphics.drawable.Drawable r10 = r10.mutate()
                int r8 = androidx.appcompat.widget.X.c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C3886k.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L65
                r10.setAlpha(r0)
            L65:
                return r2
            L66:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C3886k.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.T.c
        public PorterDuff.Mode b(int i10) {
            if (i10 == AbstractC5931e.f47985H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.T.c
        public Drawable c(T t10, Context context, int i10) {
            if (i10 == AbstractC5931e.f48006j) {
                return new LayerDrawable(new Drawable[]{t10.i(context, AbstractC5931e.f48005i), t10.i(context, AbstractC5931e.f48007k)});
            }
            if (i10 == AbstractC5931e.f48021y) {
                return l(t10, context, AbstractC5930d.f47975c);
            }
            if (i10 == AbstractC5931e.f48020x) {
                return l(t10, context, AbstractC5930d.f47976d);
            }
            if (i10 == AbstractC5931e.f48022z) {
                return l(t10, context, AbstractC5930d.f47977e);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.T.c
        public ColorStateList d(Context context, int i10) {
            if (i10 == AbstractC5931e.f48009m) {
                return AbstractC6050a.a(context, AbstractC5929c.f47969e);
            }
            if (i10 == AbstractC5931e.f47986I) {
                return AbstractC6050a.a(context, AbstractC5929c.f47972h);
            }
            if (i10 == AbstractC5931e.f47985H) {
                return k(context);
            }
            if (i10 == AbstractC5931e.f48002f) {
                return j(context);
            }
            if (i10 == AbstractC5931e.f47998b) {
                return g(context);
            }
            if (i10 == AbstractC5931e.f48001e) {
                return i(context);
            }
            if (i10 == AbstractC5931e.f47981D || i10 == AbstractC5931e.f47982E) {
                return AbstractC6050a.a(context, AbstractC5929c.f47971g);
            }
            if (f(this.f27424b, i10)) {
                return X.e(context, AbstractC5927a.f47958u);
            }
            if (f(this.f27427e, i10)) {
                return AbstractC6050a.a(context, AbstractC5929c.f47968d);
            }
            if (f(this.f27428f, i10)) {
                return AbstractC6050a.a(context, AbstractC5929c.f47967c);
            }
            if (i10 == AbstractC5931e.f47978A) {
                return AbstractC6050a.a(context, AbstractC5929c.f47970f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.T.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == AbstractC5931e.f47980C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = AbstractC5927a.f47958u;
                m(drawableFindDrawableByLayerId, X.c(context, i11), C3886k.f27420b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), X.c(context, i11), C3886k.f27420b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), X.c(context, AbstractC5927a.f47956s), C3886k.f27420b);
                return true;
            }
            if (i10 != AbstractC5931e.f48021y && i10 != AbstractC5931e.f48020x && i10 != AbstractC5931e.f48022z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), X.b(context, AbstractC5927a.f47958u), C3886k.f27420b);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i12 = AbstractC5927a.f47956s;
            m(drawableFindDrawableByLayerId2, X.c(context, i12), C3886k.f27420b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), X.c(context, i12), C3886k.f27420b);
            return true;
        }
    }

    public static synchronized C3886k b() {
        try {
            if (f27421c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f27421c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return T.k(i10, mode);
    }

    public static synchronized void h() {
        if (f27421c == null) {
            C3886k c3886k = new C3886k();
            f27421c = c3886k;
            c3886k.f27422a = T.g();
            f27421c.f27422a.t(new a());
        }
    }

    static void i(Drawable drawable, Z z10, int[] iArr) {
        T.v(drawable, z10, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f27422a.i(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f27422a.j(context, i10, z10);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f27422a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f27422a.r(context);
    }
}
