package s7;

import N7.B8;
import b9.j;

/* compiled from: IndicatorParams.kt */
/* renamed from: s7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5584c {

    /* compiled from: IndicatorParams.kt */
    /* renamed from: s7.c$a */
    public static final class a extends AbstractC5584c {

        /* renamed from: a, reason: collision with root package name */
        public final float f46125a;

        public a(float f10) {
            this.f46125a = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f46125a, ((a) obj).f46125a) == 0;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f46125a);
        }

        public final String toString() {
            return "Circle(radius=" + this.f46125a + ')';
        }
    }

    /* compiled from: IndicatorParams.kt */
    /* renamed from: s7.c$b */
    public static final class b extends AbstractC5584c {

        /* renamed from: a, reason: collision with root package name */
        public final float f46126a;

        /* renamed from: b, reason: collision with root package name */
        public final float f46127b;

        /* renamed from: c, reason: collision with root package name */
        public final float f46128c;

        public b(float f10, float f11, float f12) {
            this.f46126a = f10;
            this.f46127b = f11;
            this.f46128c = f12;
        }

        public static b c(b bVar, float f10, float f11, int i) {
            if ((i & 2) != 0) {
                f11 = bVar.f46127b;
            }
            float f12 = bVar.f46128c;
            bVar.getClass();
            return new b(f10, f11, f12);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.f46126a, bVar.f46126a) == 0 && Float.compare(this.f46127b, bVar.f46127b) == 0 && Float.compare(this.f46128c, bVar.f46128c) == 0;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f46128c) + B8.g(this.f46127b, Float.floatToIntBits(this.f46126a) * 31, 31);
        }

        public final String toString() {
            return "RoundedRect(itemWidth=" + this.f46126a + ", itemHeight=" + this.f46127b + ", cornerRadius=" + this.f46128c + ')';
        }
    }

    public final float a() {
        if (this instanceof b) {
            return ((b) this).f46127b;
        }
        if (!(this instanceof a)) {
            throw new j();
        }
        return ((a) this).f46125a * 2;
    }

    public final float b() {
        if (this instanceof b) {
            return ((b) this).f46126a;
        }
        if (!(this instanceof a)) {
            throw new j();
        }
        return ((a) this).f46125a * 2;
    }
}
