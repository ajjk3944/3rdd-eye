package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class f12 {
    public static final so1 c;
    public static final so1 d;
    public static final so1 a = so1.r("gads:dynamite_load:fail:sample_rate", 10000);
    public static final so1 b = so1.o("gads:report_dynamite_crash_in_background_thread", false);
    public static final so1 e = so1.o("gads:sdk_crash_report_full_stacktrace", false);
    public static final so1 f = new so1("gads:trapped_exception_sample_rate", Double.valueOf(0.01d), 3);

    static {
        int i = 4;
        c = new so1("gads:public_beta:traffic_multiplier", "1.0", i);
        d = new so1("gads:sdk_crash_report_class_prefix", "com.google.", i);
    }
}
