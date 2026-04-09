package Y4;

import android.net.wifi.SupplicantState;

/* loaded from: classes.dex */
public abstract /* synthetic */ class N {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4422a;

    static {
        int[] iArr = new int[SupplicantState.values().length];
        try {
            iArr[SupplicantState.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SupplicantState.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SupplicantState.ASSOCIATING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f4422a = iArr;
    }
}
