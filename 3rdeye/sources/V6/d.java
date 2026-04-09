package V6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import m7.AbstractC5333b;

/* compiled from: ImageSpan.kt */
/* loaded from: classes.dex */
public final class d extends AbstractC5333b {

    /* renamed from: b, reason: collision with root package name */
    public final int f12955b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12956c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12957d;

    /* renamed from: e, reason: collision with root package name */
    public final n f12958e;

    /* renamed from: f, reason: collision with root package name */
    public final a f12959f;

    /* renamed from: g, reason: collision with root package name */
    public BitmapDrawable f12960g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f12961h;

    /* compiled from: ImageSpan.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f12962a;

        /* renamed from: b, reason: collision with root package name */
        public final String f12963b;

        /* renamed from: c, reason: collision with root package name */
        public final j f12964c;

        public a(String str, String str2, j jVar) {
            this.f12962a = str;
            this.f12963b = str2;
            this.f12964c = jVar;
        }
    }

    /* compiled from: ImageSpan.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12965a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f12965a = iArr;
        }
    }

    public d(int i, int i10, int i11, n alignment, a aVar) {
        kotlin.jvm.internal.l.f(alignment, "alignment");
        this.f12955b = i;
        this.f12956c = i10;
        this.f12957d = i11;
        this.f12958e = alignment;
        this.f12959f = aVar;
        this.f12960g = null;
        this.f12961h = new RectF();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence text, int i, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        kotlin.jvm.internal.l.f(text, "text");
        kotlin.jvm.internal.l.f(paint, "paint");
        BitmapDrawable bitmapDrawable = this.f12960g;
        if (bitmapDrawable == null) {
            return;
        }
        canvas.save();
        int iHeight = bitmapDrawable.getBounds().height();
        int i14 = b.f12965a[this.f12958e.ordinal()];
        if (i14 == 1) {
            i12 = i11 + iHeight;
        } else if (i14 == 2) {
            i12 = ((i11 + i13) + iHeight) / 2;
        } else if (i14 != 3) {
            if (i14 != 4) {
                throw new b9.j();
            }
            i12 = i13;
        }
        float f11 = i12 - iHeight;
        RectF rectF = this.f12961h;
        rectF.set(bitmapDrawable.getBounds());
        rectF.offset(f10, f11);
        canvas.translate(f10, f11);
        bitmapDrawable.draw(canvas);
        canvas.restore();
    }
}
