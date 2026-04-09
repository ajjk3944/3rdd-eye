package i2;

/* compiled from: RenderMode.java */
/* renamed from: i2.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4439L {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* compiled from: RenderMode.java */
    /* renamed from: i2.L$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38337a;

        static {
            int[] iArr = new int[EnumC4439L.values().length];
            f38337a = iArr;
            try {
                iArr[EnumC4439L.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38337a[EnumC4439L.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38337a[EnumC4439L.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean useSoftwareRendering(int i, boolean z10, int i10) {
        int i11 = a.f38337a[ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 != 2) {
            return (z10 && i < 28) || i10 > 4 || i <= 25;
        }
        return true;
    }
}
