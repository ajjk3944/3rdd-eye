package jj;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13740a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.AUDIO_ON_CALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.AUDIO_NOT_ON_CALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.AUDIO_ON_TELEPHONY_CALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j.AUDIO_NOT_ON_TELEPHONY_CALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[j.AUDIO_ON_VOIP_CALL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[j.AUDIO_NOT_ON_VOIP_CALL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f13740a = iArr;
    }
}
