package e8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import br.l;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import m8.g;

/* loaded from: classes.dex */
public final class a extends Drawable implements Animatable {
    public Canvas D;
    public Bitmap E;
    public float H;
    public float I;
    public boolean J;
    public long K;
    public long L;
    public Picture N;
    public boolean P;

    /* renamed from: a, reason: collision with root package name */
    public final Movie f7965a;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap.Config f7966d;

    /* renamed from: g, reason: collision with root package name */
    public final g f7967g;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f7968r = new Paint(3);

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f7969x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final Rect f7970y = new Rect();
    public final Rect B = new Rect();
    public float F = 1.0f;
    public float G = 1.0f;
    public int M = -1;
    public o8.b O = o8.b.UNCHANGED;

    public a(Movie movie, Bitmap.Config config, g gVar) {
        this.f7965a = movie;
        this.f7966d = config;
        this.f7967g = gVar;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.");
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = this.f7968r;
        Canvas canvas2 = this.D;
        Bitmap bitmap = this.E;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f10 = this.F;
            canvas2.scale(f10, f10);
            this.f7965a.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.N;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.H, this.I);
                float f11 = this.G;
                canvas.scale(f11, f11);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th2) {
            canvas2.restoreToCount(iSave);
            throw th2;
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.f7970y;
        if (l.a(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Movie movie = this.f7965a;
        int iWidth2 = movie.width();
        int iHeight2 = movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        g gVar = this.f7967g;
        double dG = y3.g(iWidth2, iHeight2, iWidth, iHeight, gVar);
        if (!this.P && dG > 1.0d) {
            dG = 1.0d;
        }
        float f10 = (float) dG;
        this.F = f10;
        int i10 = (int) (iWidth2 * f10);
        int i11 = (int) (f10 * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, this.f7966d);
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.E = bitmapCreateBitmap;
        this.D = new Canvas(bitmapCreateBitmap);
        if (this.P) {
            this.G = 1.0f;
            this.H = 0.0f;
            this.I = 0.0f;
            return;
        }
        float fG = (float) y3.g(i10, i11, iWidth, iHeight, gVar);
        this.G = fG;
        float f11 = iWidth - (i10 * fG);
        float f12 = 2;
        this.H = (f11 / f12) + rect.left;
        this.I = ((iHeight - (fG * i11)) / f12) + rect.top;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Movie movie = this.f7965a;
        int iDuration = movie.duration();
        if (iDuration == 0) {
            iDuration = 0;
            z10 = false;
        } else {
            if (this.J) {
                this.L = SystemClock.uptimeMillis();
            }
            int i10 = (int) (this.L - this.K);
            int i11 = i10 / iDuration;
            int i12 = this.M;
            z10 = i12 == -1 || i11 <= i12;
            if (z10) {
                iDuration = i10 - (i11 * iDuration);
            }
        }
        movie.setTime(iDuration);
        if (this.P) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.B;
            rect.set(0, 0, width, height);
            b(rect);
            int iSave = canvas.save();
            try {
                float f10 = 1 / this.F;
                canvas.scale(f10, f10);
                a(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.J && z10) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f7965a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f7965a.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f7968r.getAlpha() != 255) {
            return -3;
        }
        o8.b bVar = this.O;
        if (bVar != o8.b.OPAQUE) {
            return (bVar == o8.b.UNCHANGED && this.f7965a.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (i10 < 0 || i10 >= 256) {
            throw new IllegalArgumentException(h0.b.h(i10, "Invalid alpha: ").toString());
        }
        this.f7968r.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7968r.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.J) {
            return;
        }
        this.J = true;
        this.K = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f7969x;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((pd.a) arrayList.get(i10)).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.J) {
            this.J = false;
            ArrayList arrayList = this.f7969x;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((pd.a) arrayList.get(i10)).a(this);
            }
        }
    }
}
