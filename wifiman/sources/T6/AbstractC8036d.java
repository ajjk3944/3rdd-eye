package t6;

import android.graphics.RectF;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: t6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8036d {

    /* renamed from: t6.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61829a;

        static {
            int[] iArr = new int[EnumC8035c.values().length];
            try {
                iArr[EnumC8035c.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8035c.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8035c.Center.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f61829a = iArr;
        }
    }

    public static final EnumC8035c a(EnumC8035c enumC8035c, RectF bounds, float f10, float f11, float f12) {
        AbstractC6492s.i(enumC8035c, "<this>");
        AbstractC6492s.i(bounds, "bounds");
        float f13 = (f12 - f10) - f11;
        float f14 = bounds.top;
        boolean z10 = f13 >= f14;
        float f15 = f11 / 2;
        boolean z11 = f12 - f15 >= f14 && f15 + f12 <= bounds.bottom;
        boolean z12 = (f12 + f10) + f11 <= bounds.bottom;
        int i10 = a.f61829a[enumC8035c.ordinal()];
        if (i10 == 1) {
            return z10 ? enumC8035c : EnumC8035c.Bottom;
        }
        if (i10 == 2) {
            return z12 ? enumC8035c : EnumC8035c.Top;
        }
        if (i10 == 3) {
            return z11 ? enumC8035c : z10 ? EnumC8035c.Top : EnumC8035c.Bottom;
        }
        throw new NoWhenBranchMatchedException();
    }
}
