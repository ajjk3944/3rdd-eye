package V3;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes2.dex */
public interface d {

    /* compiled from: CircularRevealWidget.java */
    public static class a implements TypeEvaluator<C0183d> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f12914b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final C0183d f12915a = new C0183d();

        @Override // android.animation.TypeEvaluator
        public final C0183d evaluate(float f10, C0183d c0183d, C0183d c0183d2) {
            C0183d c0183d3 = c0183d;
            C0183d c0183d4 = c0183d2;
            float f11 = c0183d3.f12918a;
            float f12 = 1.0f - f10;
            float f13 = (c0183d4.f12918a * f10) + (f11 * f12);
            float f14 = c0183d3.f12919b;
            float f15 = (c0183d4.f12919b * f10) + (f14 * f12);
            float f16 = c0183d3.f12920c;
            float f17 = (f10 * c0183d4.f12920c) + (f12 * f16);
            C0183d c0183d5 = this.f12915a;
            c0183d5.f12918a = f13;
            c0183d5.f12919b = f15;
            c0183d5.f12920c = f17;
            return c0183d5;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class b extends Property<d, C0183d> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f12916a = new b(C0183d.class, "circularReveal");

        @Override // android.util.Property
        public final C0183d get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(d dVar, C0183d c0183d) {
            dVar.setRevealInfo(c0183d);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class c extends Property<d, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f12917a = new c(Integer.class, "circularRevealScrimColor");

        @Override // android.util.Property
        public final Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: V3.d$d, reason: collision with other inner class name */
    public static class C0183d {

        /* renamed from: a, reason: collision with root package name */
        public float f12918a;

        /* renamed from: b, reason: collision with root package name */
        public float f12919b;

        /* renamed from: c, reason: collision with root package name */
        public float f12920c;

        public C0183d() {
        }

        public C0183d(float f10, float f11, float f12) {
            this.f12918a = f10;
            this.f12919b = f11;
            this.f12920c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    C0183d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C0183d c0183d);
}
