package J0;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;
import sh.InterfaceC7970e;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final a f9597d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final f f9598e = new f(0.0f, AbstractC7978m.b(0.0f, 0.0f), 0, 4, null);

    /* renamed from: a, reason: collision with root package name */
    private final float f9599a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7970e f9600b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9601c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return f.f9598e;
        }

        private a() {
        }
    }

    public f(float f10, InterfaceC7970e interfaceC7970e, int i10) {
        this.f9599a = f10;
        this.f9600b = interfaceC7970e;
        this.f9601c = i10;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final float b() {
        return this.f9599a;
    }

    public final InterfaceC7970e c() {
        return this.f9600b;
    }

    public final int d() {
        return this.f9601c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f9599a == fVar.f9599a && AbstractC6492s.d(this.f9600b, fVar.f9600b) && this.f9601c == fVar.f9601c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f9599a) * 31) + this.f9600b.hashCode()) * 31) + this.f9601c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f9599a + ", range=" + this.f9600b + ", steps=" + this.f9601c + ')';
    }

    public /* synthetic */ f(float f10, InterfaceC7970e interfaceC7970e, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, interfaceC7970e, (i11 & 4) != 0 ? 0 : i10);
    }
}
