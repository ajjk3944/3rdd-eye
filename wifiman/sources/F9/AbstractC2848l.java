package F9;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: F9.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2848l {

    /* renamed from: F9.l$a */
    public static final class a extends AbstractC2848l {

        /* renamed from: a, reason: collision with root package name */
        private final float f6273a;

        public /* synthetic */ a(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.7f : f10);
        }

        public final float a() {
            return this.f6273a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f6273a, ((a) obj).f6273a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f6273a);
        }

        public String toString() {
            return "StretchWidgetWrapTitle(titleMaxFraction=" + this.f6273a + ")";
        }

        public a(float f10) {
            super(null);
            this.f6273a = f10;
        }
    }

    /* renamed from: F9.l$b */
    public static final class b extends AbstractC2848l {

        /* renamed from: a, reason: collision with root package name */
        private final float f6274a;

        public /* synthetic */ b(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.7f : f10);
        }

        public final float a() {
            return this.f6274a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f6274a, ((b) obj).f6274a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f6274a);
        }

        public String toString() {
            return "WrapWidgetStretchTitle(widgetMaxFraction=" + this.f6274a + ")";
        }

        public b(float f10) {
            super(null);
            this.f6274a = f10;
        }
    }

    public /* synthetic */ AbstractC2848l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC2848l() {
    }
}
