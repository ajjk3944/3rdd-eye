package q8;

import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20734a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f20735b;

    static {
        int[] iArr = new int[c8.h.values().length];
        try {
            iArr[c8.h.MEMORY_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c8.h.MEMORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c8.h.DISK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c8.h.NETWORK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        try {
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f20734a = iArr2;
        int[] iArr3 = new int[m8.g.values().length];
        try {
            iArr3[m8.g.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[m8.g.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f20735b = iArr3;
    }
}
