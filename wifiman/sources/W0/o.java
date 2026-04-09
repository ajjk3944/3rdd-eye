package W0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final a f23550c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final o f23551d = new o(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    private final float f23552a;

    /* renamed from: b, reason: collision with root package name */
    private final float f23553b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a() {
            return o.f23551d;
        }

        private a() {
        }
    }

    public o(float f10, float f11) {
        this.f23552a = f10;
        this.f23553b = f11;
    }

    public final float b() {
        return this.f23552a;
    }

    public final float c() {
        return this.f23553b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f23552a == oVar.f23552a && this.f23553b == oVar.f23553b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f23552a) * 31) + Float.hashCode(this.f23553b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f23552a + ", skewX=" + this.f23553b + ')';
    }
}
