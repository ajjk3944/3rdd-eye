package u6;

import android.graphics.Typeface;

/* compiled from: DivTypefaceType.java */
/* loaded from: classes.dex */
public enum b {
    REGULAR,
    MEDIUM,
    BOLD,
    LIGHT;

    /* compiled from: DivTypefaceType.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46599a;

        static {
            int[] iArr = new int[b.values().length];
            f46599a = iArr;
            try {
                iArr[b.BOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46599a[b.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46599a[b.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Typeface getTypeface(u6.a aVar) {
        int i = a.f46599a[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? aVar.getRegular() : aVar.getLight() : aVar.getMedium() : aVar.getBold();
    }
}
