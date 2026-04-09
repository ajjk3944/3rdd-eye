package s0;

import androidx.lifecycle.EnumC0291m;

/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2882c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23403a;

    static {
        int[] iArr = new int[EnumC0291m.values().length];
        try {
            iArr[EnumC0291m.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0291m.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0291m.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0291m.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f23403a = iArr;
    }
}
