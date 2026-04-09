package O2;

import C2.k;
import O2.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* renamed from: a, reason: collision with root package name */
    private final a f16905a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16906b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16907c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16908d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16909e;

    /* renamed from: f, reason: collision with root package name */
    private int f16910f;

    /* renamed from: g, reason: collision with root package name */
    private int f16911g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16912h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f16913i;

    /* renamed from: j, reason: collision with root package name */
    private Rect f16914j;

    /* renamed from: k, reason: collision with root package name */
    private List f16915k;

    static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        final g f16916a;

        a(g gVar) {
            this.f16916a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, B2.a aVar, k kVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.c(context), aVar, i10, i11, kVar, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f16914j == null) {
            this.f16914j = new Rect();
        }
        return this.f16914j;
    }

    private Paint h() {
        if (this.f16913i == null) {
            this.f16913i = new Paint(2);
        }
        return this.f16913i;
    }

    private void j() {
        List list = this.f16915k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) this.f16915k.get(i10)).b(this);
            }
        }
    }

    private void l() {
        this.f16910f = 0;
    }

    private void n() {
        W2.k.a(!this.f16908d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f16905a.f16916a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f16906b) {
                return;
            }
            this.f16906b = true;
            this.f16905a.f16916a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f16906b = false;
        this.f16905a.f16916a.s(this);
    }

    @Override // O2.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f16910f++;
        }
        int i10 = this.f16911g;
        if (i10 == -1 || this.f16910f < i10) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f16905a.f16916a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f16908d) {
            return;
        }
        if (this.f16912h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f16912h = false;
        }
        canvas.drawBitmap(this.f16905a.f16916a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f16905a.f16916a.e();
    }

    public int f() {
        return this.f16905a.f16916a.f();
    }

    public int g() {
        return this.f16905a.f16916a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f16905a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f16905a.f16916a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f16905a.f16916a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f16905a.f16916a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f16906b;
    }

    public void k() {
        this.f16908d = true;
        this.f16905a.f16916a.a();
    }

    public void m(k kVar, Bitmap bitmap) {
        this.f16905a.f16916a.o(kVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f16912h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        W2.k.a(!this.f16908d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f16909e = z10;
        if (!z10) {
            o();
        } else if (this.f16907c) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f16907c = true;
        l();
        if (this.f16909e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f16907c = false;
        o();
    }

    c(a aVar) {
        this.f16909e = true;
        this.f16911g = -1;
        this.f16905a = (a) W2.k.d(aVar);
    }
}
