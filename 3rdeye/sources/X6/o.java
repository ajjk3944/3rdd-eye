package X6;

import O6.F;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.concurrent.Future;
import p9.InterfaceC5480a;
import r7.C5530a;

/* compiled from: LoadableImageView.kt */
/* loaded from: classes.dex */
public class o extends C5530a implements F {

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f13641k;

    /* renamed from: l, reason: collision with root package name */
    public w6.e f13642l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC5480a<C1992A> f13643m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f13644n;

    /* renamed from: o, reason: collision with root package name */
    public a f13645o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f13646p;

    @Override // android.view.View
    public final void buildDrawingCache(boolean z10) {
        getDelegate();
        super.buildDrawingCache(z10);
    }

    public final Bitmap getCurrentBitmapWithoutFilters$div_release() {
        return this.f13641k;
    }

    public f getDelegate() {
        return null;
    }

    public final Drawable getExternalImage() {
        return this.f13646p;
    }

    public final a getImageTransformer() {
        return this.f13645o;
    }

    public final w6.e getLoadReference$div_release() {
        return this.f13642l;
    }

    @Override // O6.F
    public Future<?> getLoadingTask() {
        Object tag = getTag(R.id.bitmap_load_references_tag);
        if (tag instanceof Future) {
            return (Future) tag;
        }
        return null;
    }

    @Override // O6.F
    public final void i(Future<?> future) {
        setTag(R.id.bitmap_load_references_tag, future);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable dr) {
        kotlin.jvm.internal.l.f(dr, "dr");
        getDelegate();
        super.invalidateDrawable(dr);
    }

    @Override // O6.F
    public final void k() {
        setTag(R.id.bitmap_load_references_tag, null);
    }

    public final boolean m() {
        return kotlin.jvm.internal.l.b(getTag(R.id.image_loaded_flag), Boolean.TRUE);
    }

    public final Drawable n(Drawable drawable) {
        if (o()) {
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    bitmap.setDensity(160);
                }
                bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && J0.e.l(drawable)) {
                return new P6.b(drawable, getContext().getResources().getDisplayMetrics().density);
            }
        }
        return drawable;
    }

    public final boolean o() {
        int i;
        int i10 = getLayoutParams().width;
        return ((i10 == -3 || i10 == -2) && ((i = getLayoutParams().height) == -3 || i == -2)) || getImageScale() == C5530a.EnumC0523a.NO_SCALE;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getDelegate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDelegate();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        kotlin.jvm.internal.l.f(changedView, "changedView");
        getDelegate();
    }

    public final void setCurrentBitmapWithoutFilters$div_release(Bitmap bitmap) {
        this.f13641k = bitmap;
    }

    public final void setExternalImage(Drawable drawable) {
        this.f13646p = drawable != null ? n(drawable) : null;
        invalidate();
    }

    public void setImage(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (o() && bitmap != null) {
            bitmap.setDensity(160);
        }
        setImageDrawable(new BitmapDrawable(getContext().getResources(), bitmap));
    }

    public final void setImageChangeCallback(InterfaceC5480a<C1992A> interfaceC5480a) {
        this.f13643m = interfaceC5480a;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f13644n = drawable;
        if (this.f13646p == null) {
            this.f13645o.a(drawable);
            super.setImageDrawable(drawable != null ? n(drawable) : null);
            InterfaceC5480a<C1992A> interfaceC5480a = this.f13643m;
            if (interfaceC5480a != null) {
                interfaceC5480a.invoke();
                return;
            }
            return;
        }
        Drawable drawable2 = getDrawable();
        Drawable drawable3 = this.f13646p;
        if (drawable2 != drawable3) {
            super.setImageDrawable(drawable3);
        }
        InterfaceC5480a<C1992A> interfaceC5480a2 = this.f13643m;
        if (interfaceC5480a2 != null) {
            interfaceC5480a2.invoke();
        }
    }

    public final void setImageTransformer(a aVar) {
        if (aVar == null) {
            aVar = a.C0197a.f13647a;
        }
        this.f13645o = aVar;
        Drawable drawable = this.f13644n;
        if (drawable != null) {
            setImageDrawable(drawable);
        }
    }

    public final void setLoadReference$div_release(w6.e eVar) {
        this.f13642l = eVar;
    }

    public void setPlaceholder(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void setPreview(Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        getDelegate();
        super.unscheduleDrawable(drawable);
    }

    public void setImage(Drawable drawable) {
        setImageDrawable(drawable);
        Object drawable2 = getDrawable();
        if ((drawable2 instanceof Animatable) && this.f13646p == null) {
            ((Animatable) drawable2).start();
        }
    }

    public void setPreview(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public static /* synthetic */ void getCurrentBitmapWithoutFilters$div_release$annotations() {
    }

    public static /* synthetic */ void getExternalImage$annotations() {
    }

    /* compiled from: LoadableImageView.kt */
    public interface a {
        Drawable a(Drawable drawable);

        /* compiled from: LoadableImageView.kt */
        /* renamed from: X6.o$a$a, reason: collision with other inner class name */
        public static final class C0197a implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0197a f13647a = new C0197a();

            @Override // X6.o.a
            public final Drawable a(Drawable drawable) {
                return drawable;
            }
        }
    }

    public void setDelegate(f fVar) {
    }
}
