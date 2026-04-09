package K6;

import N7.EnumC1245kc;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: DivVideoBinder.kt */
/* loaded from: classes.dex */
public final class J1 extends AppCompatImageView {

    /* renamed from: e, reason: collision with root package name */
    public static final ImageView.ScaleType f3250e = ImageView.ScaleType.CENTER;

    /* renamed from: f, reason: collision with root package name */
    public static final ImageView.ScaleType f3251f = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: g, reason: collision with root package name */
    public static final ImageView.ScaleType f3252g = ImageView.ScaleType.CENTER_CROP;

    /* compiled from: DivVideoBinder.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3253a;

        static {
            int[] iArr = new int[EnumC1245kc.values().length];
            try {
                iArr[EnumC1245kc.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1245kc.NO_SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1245kc.FIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3253a = iArr;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        if (getScaleType() == f3250e && bitmap != null) {
            bitmap.setDensity(160);
        }
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            drawable = null;
        } else if (getScaleType() == f3250e && (drawable instanceof BitmapDrawable)) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                bitmap.setDensity(160);
            }
            bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
        }
        super.setImageDrawable(drawable);
    }
}
