package j7;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.l;

/* compiled from: ScalingDrawable.kt */
/* loaded from: classes.dex */
public final class f extends Drawable {

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f43126d;

    /* renamed from: e, reason: collision with root package name */
    public Picture f43127e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f43130h;

    /* renamed from: k, reason: collision with root package name */
    public float f43132k;

    /* renamed from: l, reason: collision with root package name */
    public float f43133l;

    /* renamed from: a, reason: collision with root package name */
    public c f43123a = c.NO_SCALE;

    /* renamed from: b, reason: collision with root package name */
    public a f43124b = a.LEFT;

    /* renamed from: c, reason: collision with root package name */
    public b f43125c = b.TOP;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f43128f = new Paint(3);

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f43129g = new Matrix();
    public float i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f43131j = 1.0f;

    /* compiled from: ScalingDrawable.kt */
    public enum a {
        LEFT,
        CENTER,
        RIGHT
    }

    /* compiled from: ScalingDrawable.kt */
    public enum b {
        TOP,
        CENTER,
        BOTTOM
    }

    /* compiled from: ScalingDrawable.kt */
    public enum c {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* compiled from: ScalingDrawable.kt */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43134a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43135b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f43136c;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.NO_SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43134a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f43135b = iArr2;
            int[] iArr3 = new int[b.values().length];
            try {
                iArr3[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[b.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f43136c = iArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.f.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f43128f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        l.f(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f43130h = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f43128f.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
