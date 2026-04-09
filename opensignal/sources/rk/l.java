package rk;

import com.staircase3.opensignal.models.PlaceType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21641a;

    static {
        int[] iArr = new int[PlaceType.values().length];
        try {
            iArr[PlaceType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlaceType.INDOOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlaceType.OUTDOOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f21641a = iArr;
    }
}
