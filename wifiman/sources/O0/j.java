package O0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class j extends ReplacementSpan {

    /* renamed from: k, reason: collision with root package name */
    public static final a f16743k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f16744l = 8;

    /* renamed from: a, reason: collision with root package name */
    private final float f16745a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16746b;

    /* renamed from: c, reason: collision with root package name */
    private final float f16747c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16748d;

    /* renamed from: e, reason: collision with root package name */
    private final float f16749e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16750f;

    /* renamed from: g, reason: collision with root package name */
    private Paint.FontMetricsInt f16751g;

    /* renamed from: h, reason: collision with root package name */
    private int f16752h;

    /* renamed from: i, reason: collision with root package name */
    private int f16753i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16754j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.f16745a = f10;
        this.f16746b = i10;
        this.f16747c = f11;
        this.f16748d = i11;
        this.f16749e = f12;
        this.f16750f = i12;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f16751g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC6492s.v("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.f16754j) {
            return this.f16753i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    public final int c() {
        return this.f16750f;
    }

    public final int d() {
        if (this.f16754j) {
            return this.f16752h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        int iA;
        this.f16754j = true;
        float textSize = paint.getTextSize();
        this.f16751g = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        int i12 = this.f16746b;
        if (i12 == 0) {
            f10 = this.f16745a * this.f16749e;
        } else {
            if (i12 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f10 = this.f16745a * textSize;
        }
        this.f16752h = k.a(f10);
        int i13 = this.f16748d;
        if (i13 == 0) {
            iA = k.a(this.f16747c * this.f16749e);
        } else {
            if (i13 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            iA = k.a(this.f16747c * textSize);
        }
        this.f16753i = iA;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f16750f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + b();
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = iB + b();
                        break;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return d();
    }
}
