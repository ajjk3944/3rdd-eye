package fl;

import android.net.NetworkInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8973a;

    static {
        int[] iArr = new int[NetworkInfo.State.values().length];
        try {
            iArr[NetworkInfo.State.CONNECTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NetworkInfo.State.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f8973a = iArr;
    }
}
