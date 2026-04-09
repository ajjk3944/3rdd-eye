package o6;

import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u6.InterfaceC8137b;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7090a implements InterfaceC7092c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7092c f55482a;

    /* renamed from: b, reason: collision with root package name */
    private final float f55483b;

    /* renamed from: c, reason: collision with root package name */
    private final float f55484c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC2003a f55485d;

    /* renamed from: e, reason: collision with root package name */
    private float f55486e;

    /* renamed from: f, reason: collision with root package name */
    private float f55487f;

    /* renamed from: o6.a$a, reason: collision with other inner class name */
    public enum EnumC2003a {
        Resize,
        Fixed
    }

    /* renamed from: o6.a$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55488a;

        static {
            int[] iArr = new int[EnumC2003a.values().length];
            try {
                iArr[EnumC2003a.Resize.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2003a.Fixed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55488a = iArr;
        }
    }

    public C7090a(InterfaceC7092c shape, float f10, float f11, EnumC2003a fitStrategy) {
        AbstractC6492s.i(shape, "shape");
        AbstractC6492s.i(fitStrategy, "fitStrategy");
        this.f55482a = shape;
        this.f55483b = f10;
        this.f55484c = f11;
        this.f55485d = fitStrategy;
        this.f55486e = f10;
        this.f55487f = f11;
    }

    private final void b(float f10, float f11, float f12) {
        if (f10 == 0.0f && f11 == 0.0f) {
            this.f55486e = f12;
            return;
        }
        int i10 = b.f55488a[this.f55485d.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            this.f55486e = f10;
            this.f55487f = f11;
            return;
        }
        float f13 = f10 + f11;
        if (f12 < f13) {
            this.f55486e = f12;
            this.f55487f = 0.0f;
        } else {
            float fCeil = f12 / ((((float) Math.ceil(f12 / f13)) * f13) + f10);
            this.f55486e = f10 * fCeil;
            this.f55487f = f11 * fCeil;
        }
    }

    private final void c(InterfaceC8137b interfaceC8137b, float f10) {
        b(interfaceC8137b.g(this.f55483b), interfaceC8137b.g(this.f55484c), f10);
    }

    private final void d(InterfaceC8137b interfaceC8137b, Paint paint, Path path, float f10, float f11, float f12, float f13) {
        float f14;
        float f15 = f12 - f10;
        c(interfaceC8137b, f15);
        int i10 = 0;
        float f16 = 0.0f;
        while (f15 - f16 > 0.0f) {
            if (i10 % 2 == 0) {
                path.reset();
                float f17 = f10 + f16;
                this.f55482a.a(interfaceC8137b, paint, path, f17, f11, f17 + this.f55486e, f13);
                f14 = this.f55486e;
            } else {
                f14 = this.f55487f;
            }
            f16 += f14;
            i10++;
        }
    }

    private final void e(InterfaceC8137b interfaceC8137b, Paint paint, Path path, float f10, float f11, float f12, float f13) {
        float f14;
        float f15 = f13 - f11;
        c(interfaceC8137b, f15);
        int i10 = 0;
        float f16 = 0.0f;
        while (f15 - f16 > 0.0f) {
            if (i10 % 2 == 0) {
                path.reset();
                float f17 = f11 + f16;
                this.f55482a.a(interfaceC8137b, paint, path, f10, f17, f12, f17 + this.f55486e);
                f14 = this.f55486e;
            } else {
                f14 = this.f55487f;
            }
            f16 += f14;
            i10++;
        }
    }

    @Override // o6.InterfaceC7092c
    public void a(InterfaceC8137b context, Paint paint, Path path, float f10, float f11, float f12, float f13) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(paint, "paint");
        AbstractC6492s.i(path, "path");
        if (f12 - f10 > f13 - f11) {
            d(context, paint, path, f10, f11, f12, f13);
        } else {
            e(context, paint, path, f10, f11, f12, f13);
        }
    }

    public /* synthetic */ C7090a(InterfaceC7092c interfaceC7092c, float f10, float f11, EnumC2003a enumC2003a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C7094e.f55502a.b() : interfaceC7092c, (i10 & 2) != 0 ? 4.0f : f10, (i10 & 4) != 0 ? 2.0f : f11, (i10 & 8) != 0 ? EnumC2003a.Resize : enumC2003a);
    }
}
