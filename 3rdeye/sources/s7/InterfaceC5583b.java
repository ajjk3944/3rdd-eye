package s7;

import N7.H7;

/* compiled from: IndicatorParams.kt */
/* renamed from: s7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5583b {

    /* compiled from: IndicatorParams.kt */
    /* renamed from: s7.b$a */
    public static final class a implements InterfaceC5583b {

        /* renamed from: a, reason: collision with root package name */
        public final float f46122a;

        public a(float f10) {
            this.f46122a = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f46122a, ((a) obj).f46122a) == 0;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f46122a);
        }

        public final String toString() {
            return "Default(spaceBetweenCenters=" + this.f46122a + ')';
        }
    }

    /* compiled from: IndicatorParams.kt */
    /* renamed from: s7.b$b, reason: collision with other inner class name */
    public static final class C0527b implements InterfaceC5583b {

        /* renamed from: a, reason: collision with root package name */
        public final float f46123a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46124b;

        public C0527b(float f10, int i) {
            this.f46123a = f10;
            this.f46124b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0527b)) {
                return false;
            }
            C0527b c0527b = (C0527b) obj;
            return Float.compare(this.f46123a, c0527b.f46123a) == 0 && this.f46124b == c0527b.f46124b;
        }

        public final int hashCode() {
            return (Float.floatToIntBits(this.f46123a) * 31) + this.f46124b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Stretch(itemSpacing=");
            sb.append(this.f46123a);
            sb.append(", maxVisibleItems=");
            return H7.p(sb, this.f46124b, ')');
        }
    }
}
