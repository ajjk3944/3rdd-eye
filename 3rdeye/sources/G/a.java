package G;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

/* compiled from: AspectRatioUtil.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Rational f1791a = new Rational(4, 3);

    /* renamed from: b, reason: collision with root package name */
    public static final Rational f1792b = new Rational(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final Rational f1793c = new Rational(16, 9);

    /* renamed from: d, reason: collision with root package name */
    public static final Rational f1794d = new Rational(9, 16);

    /* compiled from: AspectRatioUtil.java */
    /* renamed from: G.a$a, reason: collision with other inner class name */
    public static final class C0030a implements Comparator<Rational> {

        /* renamed from: b, reason: collision with root package name */
        public final RectF f1795b;

        /* renamed from: c, reason: collision with root package name */
        public final Rational f1796c;

        public C0030a(Rational rational, Rational rational2) {
            this.f1796c = rational2 == null ? new Rational(4, 3) : rational2;
            this.f1795b = b(rational);
        }

        public static float a(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        public final RectF b(Rational rational) {
            float fFloatValue = rational.floatValue();
            Rational rational2 = this.f1796c;
            return fFloatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
        }

        @Override // java.util.Comparator
        public final int compare(Rational rational, Rational rational2) {
            Rational rational3 = rational;
            Rational rational4 = rational2;
            boolean z10 = false;
            if (rational3.equals(rational4)) {
                return 0;
            }
            RectF rectFB = b(rational3);
            RectF rectFB2 = b(rational4);
            RectF rectF = this.f1795b;
            boolean z11 = rectFB.width() >= rectF.width() && rectFB.height() >= rectF.height();
            if (rectFB2.width() >= rectF.width() && rectFB2.height() >= rectF.height()) {
                z10 = true;
            }
            if (z11 && z10) {
                return (int) Math.signum((rectFB.height() * rectFB.width()) - (rectFB2.height() * rectFB2.width()));
            }
            if (z11) {
                return -1;
            }
            if (z10) {
                return 1;
            }
            return -((int) Math.signum(a(rectFB, rectF) - a(rectFB2, rectF)));
        }
    }

    public static boolean a(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        Size size3 = M.c.f4110a;
        if (size.getHeight() * size.getWidth() >= M.c.a(size2)) {
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i = width % 16;
            if (i == 0 && height % 16 == 0) {
                if (b(Math.max(0, height - 16), width, rational) || b(Math.max(0, width - 16), height, rational2)) {
                    return true;
                }
            } else {
                if (i == 0) {
                    return b(height, width, rational);
                }
                if (height % 16 == 0) {
                    return b(width, height, rational2);
                }
            }
        }
        return false;
    }

    public static boolean b(int i, int i10, Rational rational) {
        A2.l.l(i10 % 16 == 0);
        double numerator = (rational.getNumerator() * i) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i10 + (-16))) && numerator < ((double) (i10 + 16));
    }
}
