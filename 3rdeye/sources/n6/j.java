package N6;

import N7.EnumC1195h5;

/* compiled from: DivTabsBinder.kt */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: DivTabsBinder.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4734a;

        static {
            int[] iArr = new int[EnumC1195h5.values().length];
            try {
                iArr[EnumC1195h5.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1195h5.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1195h5.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1195h5.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4734a = iArr;
        }
    }

    public static final u6.b a(EnumC1195h5 enumC1195h5) {
        int i = a.f4734a[enumC1195h5.ordinal()];
        if (i == 1) {
            return u6.b.MEDIUM;
        }
        if (i == 2) {
            return u6.b.REGULAR;
        }
        if (i == 3) {
            return u6.b.LIGHT;
        }
        if (i == 4) {
            return u6.b.BOLD;
        }
        throw new b9.j();
    }
}
