package c6;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;
import x6.b;

/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4226a {
    Grouped,
    Stack;

    /* renamed from: c6.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1178a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33887a;

        static {
            int[] iArr = new int[EnumC4226a.values().length];
            try {
                iArr[EnumC4226a.Grouped.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4226a.Stack.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f33887a = iArr;
        }
    }

    public final float getMaxY(b model) {
        AbstractC6492s.i(model, "model");
        int i10 = C1178a.f33887a[ordinal()];
        if (i10 == 1) {
            return model.a();
        }
        if (i10 == 2) {
            return model.h();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float getMinY(b model) {
        AbstractC6492s.i(model, "model");
        int i10 = C1178a.f33887a[ordinal()];
        if (i10 == 1) {
            return AbstractC7978m.f(model.c(), 0.0f);
        }
        if (i10 == 2) {
            return AbstractC7978m.f(model.g(), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }
}
