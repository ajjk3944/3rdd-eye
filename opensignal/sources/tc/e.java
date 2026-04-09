package tc;

import cc.s;
import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Feature f22700a;

    /* renamed from: b, reason: collision with root package name */
    public static final Feature f22701b;

    /* renamed from: c, reason: collision with root package name */
    public static final Feature[] f22702c;

    static {
        Feature feature = new Feature("name_ulr_private", 1L);
        Feature feature2 = new Feature("name_sleep_segment_request", 1L);
        Feature feature3 = new Feature("get_last_activity_feature_id", 1L);
        Feature feature4 = new Feature("support_context_feature_id", 1L);
        Feature feature5 = new Feature("get_current_location", 2L);
        Feature feature6 = new Feature("get_last_location_with_request", 1L);
        f22700a = feature6;
        Feature feature7 = new Feature("set_mock_mode_with_callback", 1L);
        Feature feature8 = new Feature("set_mock_location_with_callback", 1L);
        Feature feature9 = new Feature("inject_location_with_callback", 1L);
        Feature feature10 = new Feature("location_updates_with_callback", 1L);
        f22701b = feature10;
        f22702c = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9, feature10, new Feature("use_safe_parcelable_in_intents", 1L), new Feature("flp_debug_updates", 1L), new Feature("google_location_accuracy_enabled", 1L), new Feature("geofences_with_callback", 1L), new Feature("location_enabled", 1L)};
    }

    public static void a(int i10) {
        boolean z10 = true;
        if (i10 != 100 && i10 != 102 && i10 != 104) {
            if (i10 == 105) {
                i10 = 105;
            } else {
                z10 = false;
            }
        }
        s.c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i10));
    }

    public static String b(int i10) {
        if (i10 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i10 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i10 == 104) {
            return "LOW_POWER";
        }
        if (i10 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
