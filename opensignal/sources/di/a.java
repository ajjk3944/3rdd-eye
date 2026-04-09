package di;

import wh.d;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7384a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.TWO_G.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.THREE_G.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.THREE_POINT5_G.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.FOUR_G.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f7384a = iArr;
    }
}
