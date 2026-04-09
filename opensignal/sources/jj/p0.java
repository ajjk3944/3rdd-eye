package jj;

/* loaded from: classes.dex */
public abstract /* synthetic */ class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13746a;

    static {
        int[] iArr = new int[r0.values().length];
        try {
            iArr[r0.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r0.CONNECTED_TO_SSID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r0.DISCONNECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f13746a = iArr;
    }
}
