package p6;

import android.graphics.Path;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: p6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7235f implements InterfaceC7232c {

    /* renamed from: a, reason: collision with root package name */
    public static final C7235f f57696a = new C7235f();

    /* renamed from: p6.f$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57697a;

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
            f57697a = iArr;
        }
    }

    private C7235f() {
    }

    @Override // p6.InterfaceC7232c
    public void a(float f10, float f11, float f12, float f13, EnumC7231b cornerLocation, Path path) {
        AbstractC6492s.i(cornerLocation, "cornerLocation");
        AbstractC6492s.i(path, "path");
        int i10 = a.f57697a[cornerLocation.ordinal()];
        if (i10 == 1) {
            path.lineTo(f10, f13);
            return;
        }
        if (i10 == 2) {
            path.lineTo(f12, f11);
        } else if (i10 == 3) {
            path.lineTo(f10, f13);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            path.lineTo(f12, f11);
        }
    }
}
