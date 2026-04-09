package p6;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: p6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7234e implements InterfaceC7232c {

    /* renamed from: a, reason: collision with root package name */
    public static final C7234e f57693a = new C7234e();

    /* renamed from: b, reason: collision with root package name */
    private static final RectF f57694b = new RectF();

    /* renamed from: p6.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57695a;

        static {
            int[] iArr = new int[EnumC7231b.values().length];
            try {
                iArr[EnumC7231b.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7231b.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7231b.BottomRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7231b.BottomLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f57695a = iArr;
        }
    }

    private C7234e() {
    }

    @Override // p6.InterfaceC7232c
    public void a(float f10, float f11, float f12, float f13, EnumC7231b cornerLocation, Path path) {
        float f14;
        AbstractC6492s.i(cornerLocation, "cornerLocation");
        AbstractC6492s.i(path, "path");
        int i10 = a.f57695a[cornerLocation.ordinal()];
        if (i10 == 1) {
            float f15 = 2;
            f57694b.set(f10, f13, (f12 * f15) - f10, (f11 * f15) - f13);
            f14 = 180.0f;
        } else if (i10 == 2) {
            float f16 = 2;
            f57694b.set((f10 * f16) - f12, f11, f12, (f13 * f16) - f11);
            f14 = 270.0f;
        } else if (i10 == 3) {
            float f17 = 2;
            f57694b.set((f12 * f17) - f10, (f11 * f17) - f13, f10, f13);
            f14 = 0.0f;
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            float f18 = 2;
            f57694b.set(f12, (f13 * f18) - f11, (f10 * f18) - f12, f11);
            f14 = 90.0f;
        }
        path.arcTo(f57694b, f14, 90.0f);
    }
}
