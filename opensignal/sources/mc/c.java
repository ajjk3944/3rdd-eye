package mc;

import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Feature f16673a;

    /* renamed from: b, reason: collision with root package name */
    public static final Feature f16674b;

    /* renamed from: c, reason: collision with root package name */
    public static final Feature[] f16675c;

    static {
        Feature feature = new Feature("CLIENT_TELEMETRY", 1L);
        f16673a = feature;
        Feature feature2 = new Feature("CLIENT_NOTIFICATION_TELEMETRY", 1L);
        f16674b = feature2;
        f16675c = new Feature[]{feature, feature2};
    }
}
