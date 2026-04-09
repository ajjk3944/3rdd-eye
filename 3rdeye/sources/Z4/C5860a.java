package z4;

import java.util.HashMap;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5860a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f48452a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f48453b;

    static {
        HashMap map = new HashMap();
        f48452a = map;
        HashMap map2 = new HashMap();
        f48453b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }
}
