package j7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import b9.C2001h;
import b9.j;
import b9.p;
import c9.C2091l;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* compiled from: RadialGradientDrawable.kt */
/* loaded from: classes.dex */
public final class d extends Drawable {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f43091g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final c f43092a;

    /* renamed from: b, reason: collision with root package name */
    public final a f43093b;

    /* renamed from: c, reason: collision with root package name */
    public final a f43094c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f43095d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f43096e = new Paint();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f43097f = new RectF();

    /* compiled from: RadialGradientDrawable.kt */
    public static abstract class a {

        /* compiled from: RadialGradientDrawable.kt */
        /* renamed from: j7.d$a$a, reason: collision with other inner class name */
        public static final class C0480a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final float f43098a;

            public C0480a(float f10) {
                this.f43098a = f10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0480a) && Float.compare(this.f43098a, ((C0480a) obj).f43098a) == 0;
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.f43098a);
            }

            public final String toString() {
                return "Fixed(value=" + this.f43098a + ')';
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final float f43099a;

            public b(float f10) {
                this.f43099a = f10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Float.compare(this.f43099a, ((b) obj).f43099a) == 0;
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.f43099a);
            }

            public final String toString() {
                return "Relative(value=" + this.f43099a + ')';
            }
        }
    }

    /* compiled from: RadialGradientDrawable.kt */
    public static final class b {

        /* compiled from: RadialGradientDrawable.kt */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43100a;

            static {
                int[] iArr = new int[c.b.a.values().length];
                try {
                    iArr[c.b.a.NEAREST_CORNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.b.a.FARTHEST_CORNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.b.a.NEAREST_SIDE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.b.a.FARTHEST_SIDE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f43100a = iArr;
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        /* renamed from: j7.d$b$b, reason: collision with other inner class name */
        public static final class C0481b extends m implements InterfaceC5480a<Float[]> {

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ float f43101g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ float f43102h;
            public final /* synthetic */ float i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ float f43103j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0481b(float f10, float f11, float f12, float f13) {
                super(0);
                this.f43101g = f10;
                this.f43102h = f11;
                this.i = f12;
                this.f43103j = f13;
            }

            @Override // p9.InterfaceC5480a
            public final Float[] invoke() {
                float f10 = this.i;
                float f11 = this.f43103j;
                Float fValueOf = Float.valueOf(b.a(f10, f11, 0.0f, 0.0f));
                float f12 = this.f43101g;
                Float fValueOf2 = Float.valueOf(b.a(f10, f11, f12, 0.0f));
                float f13 = this.f43102h;
                return new Float[]{fValueOf, fValueOf2, Float.valueOf(b.a(f10, f11, f12, f13)), Float.valueOf(b.a(f10, f11, 0.0f, f13))};
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        public static final class c extends m implements InterfaceC5480a<Float[]> {

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ float f43104g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ float f43105h;
            public final /* synthetic */ float i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ float f43106j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(float f10, float f11, float f12, float f13) {
                super(0);
                this.f43104g = f10;
                this.f43105h = f11;
                this.i = f12;
                this.f43106j = f13;
            }

            @Override // p9.InterfaceC5480a
            public final Float[] invoke() {
                float f10 = this.i;
                Float fValueOf = Float.valueOf(Math.abs(f10 - 0.0f));
                Float fValueOf2 = Float.valueOf(Math.abs(f10 - this.f43104g));
                float f11 = this.f43106j;
                return new Float[]{fValueOf, fValueOf2, Float.valueOf(Math.abs(f11 - this.f43105h)), Float.valueOf(Math.abs(f11 - 0.0f))};
            }
        }

        public static final float a(float f10, float f11, float f12, float f13) {
            double d10 = 2;
            return (float) Math.sqrt(((float) Math.pow(f10 - f12, d10)) + ((float) Math.pow(f11 - f13, d10)));
        }

        public static RadialGradient b(c radius, a centerX, a centerY, int[] colors, int i, int i10) {
            float f10;
            float f11;
            float fFloatValue;
            l.f(radius, "radius");
            l.f(centerX, "centerX");
            l.f(centerY, "centerY");
            l.f(colors, "colors");
            if (centerX instanceof a.C0480a) {
                f10 = ((a.C0480a) centerX).f43098a;
            } else {
                if (!(centerX instanceof a.b)) {
                    throw new j();
                }
                f10 = ((a.b) centerX).f43099a * i;
            }
            float f12 = f10;
            if (centerY instanceof a.C0480a) {
                f11 = ((a.C0480a) centerY).f43098a;
            } else {
                if (!(centerY instanceof a.b)) {
                    throw new j();
                }
                f11 = i10 * ((a.b) centerY).f43099a;
            }
            float f13 = f11;
            float f14 = i;
            float f15 = i10;
            p pVarB = C2001h.b(new C0481b(f14, f15, f12, f13));
            p pVarB2 = C2001h.b(new c(f14, f15, f12, f13));
            if (radius instanceof c.a) {
                fFloatValue = ((c.a) radius).f43107a;
            } else {
                if (!(radius instanceof c.b)) {
                    throw new j();
                }
                int i11 = a.f43100a[((c.b) radius).f43108a.ordinal()];
                if (i11 == 1) {
                    Float fR = C2091l.r((Float[]) pVarB.getValue());
                    l.c(fR);
                    fFloatValue = fR.floatValue();
                } else if (i11 == 2) {
                    Float fQ = C2091l.q((Float[]) pVarB.getValue());
                    l.c(fQ);
                    fFloatValue = fQ.floatValue();
                } else if (i11 == 3) {
                    Float fR2 = C2091l.r((Float[]) pVarB2.getValue());
                    l.c(fR2);
                    fFloatValue = fR2.floatValue();
                } else {
                    if (i11 != 4) {
                        throw new j();
                    }
                    Float fQ2 = C2091l.q((Float[]) pVarB2.getValue());
                    l.c(fQ2);
                    fFloatValue = fQ2.floatValue();
                }
            }
            if (fFloatValue <= 0.0f) {
                fFloatValue = 0.01f;
            }
            return new RadialGradient(f12, f13, fFloatValue, colors, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    /* compiled from: RadialGradientDrawable.kt */
    public static abstract class c {

        /* compiled from: RadialGradientDrawable.kt */
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public final float f43107a;

            public a(float f10) {
                this.f43107a = f10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Float.compare(this.f43107a, ((a) obj).f43107a) == 0;
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.f43107a);
            }

            public final String toString() {
                return "Fixed(value=" + this.f43107a + ')';
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public final a f43108a;

            /* compiled from: RadialGradientDrawable.kt */
            public enum a {
                NEAREST_CORNER,
                FARTHEST_CORNER,
                NEAREST_SIDE,
                FARTHEST_SIDE
            }

            public b(a type) {
                l.f(type, "type");
                this.f43108a = type;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f43108a == ((b) obj).f43108a;
            }

            public final int hashCode() {
                return this.f43108a.hashCode();
            }

            public final String toString() {
                return "Relative(type=" + this.f43108a + ')';
            }
        }
    }

    public d(c cVar, a aVar, a aVar2, int[] iArr) {
        this.f43092a = cVar;
        this.f43093b = aVar;
        this.f43094c = aVar2;
        this.f43095d = iArr;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        canvas.drawRect(this.f43097f, this.f43096e);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f43096e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        l.f(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f43096e.setShader(b.b(this.f43092a, this.f43093b, this.f43094c, this.f43095d, bounds.width(), bounds.height()));
        this.f43097f.set(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f43096e.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
