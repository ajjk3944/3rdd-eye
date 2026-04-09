package n6;

import kotlin.jvm.internal.g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'VISUAL_ERRORS_ENABLED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: Experiment.kt */
/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5370a {
    public static final EnumC5370a COMPLEX_REBIND_ENABLED;
    public static final EnumC5370a MULTIPLE_STATE_CHANGE_ENABLED;
    public static final EnumC5370a VIEW_POOL_OPTIMIZATION_DEBUG;
    public static final EnumC5370a VISUAL_ERRORS_ENABLED;
    private final boolean defaultValue;
    private final String key;
    public static final EnumC5370a TAP_BEACONS_ENABLED = new EnumC5370a("TAP_BEACONS_ENABLED", 0, "tap_beacons_enabled", false, 2, null);
    public static final EnumC5370a VISIBILITY_BEACONS_ENABLED = new EnumC5370a("VISIBILITY_BEACONS_ENABLED", 1, "visibility_beacons_enabled", false, 2, null);
    public static final EnumC5370a SWIPE_OUT_BEACONS_ENABLED = new EnumC5370a("SWIPE_OUT_BEACONS_ENABLED", 2, "swipe_out_beacons_enabled", true);
    public static final EnumC5370a LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED = new EnumC5370a("LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED", 3, "longtap_actions_pass_to_child", false, 2, null);
    public static final EnumC5370a IGNORE_ACTION_MENU_ITEMS_ENABLED = new EnumC5370a("IGNORE_ACTION_MENU_ITEMS_ENABLED", 4, "override_context_menu_handler", false, 2, null);
    public static final EnumC5370a HYPHENATION_SUPPORT_ENABLED = new EnumC5370a("HYPHENATION_SUPPORT_ENABLED", 5, "support_hyphenation", false, 2, null);
    public static final EnumC5370a ACCESSIBILITY_ENABLED = new EnumC5370a("ACCESSIBILITY_ENABLED", 7, "accessibility_enabled", true);
    public static final EnumC5370a VIEW_POOL_ENABLED = new EnumC5370a("VIEW_POOL_ENABLED", 8, "view_pool_enabled", true);
    public static final EnumC5370a VIEW_POOL_PROFILING_ENABLED = new EnumC5370a("VIEW_POOL_PROFILING_ENABLED", 9, "view_pool_profiling_enabled", false, 2, null);
    public static final EnumC5370a RESOURCE_CACHE_ENABLED = new EnumC5370a("RESOURCE_CACHE_ENABLED", 11, "resource_cache_enabled", true);
    public static final EnumC5370a SHOW_RENDERING_TIME = new EnumC5370a("SHOW_RENDERING_TIME", 12, "demo_activity_rendering_time_enabled", false);
    public static final EnumC5370a BIND_ON_ATTACH_ENABLED = new EnumC5370a("BIND_ON_ATTACH_ENABLED", 14, "bind_on_attach_enabled", false, 2, null);
    public static final EnumC5370a PAGER_PAGE_CLIP_ENABLED = new EnumC5370a("PAGER_PAGE_CLIP_ENABLED", 16, "pager_page_children_enabled", true);
    public static final EnumC5370a PERMANENT_DEBUG_PANEL_ENABLED = new EnumC5370a("PERMANENT_DEBUG_PANEL_ENABLED", 17, "permanent_debug_panel_enabled", false);
    private static final /* synthetic */ EnumC5370a[] $VALUES = $values();

    private static final /* synthetic */ EnumC5370a[] $values() {
        return new EnumC5370a[]{TAP_BEACONS_ENABLED, VISIBILITY_BEACONS_ENABLED, SWIPE_OUT_BEACONS_ENABLED, LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED, IGNORE_ACTION_MENU_ITEMS_ENABLED, HYPHENATION_SUPPORT_ENABLED, VISUAL_ERRORS_ENABLED, ACCESSIBILITY_ENABLED, VIEW_POOL_ENABLED, VIEW_POOL_PROFILING_ENABLED, VIEW_POOL_OPTIMIZATION_DEBUG, RESOURCE_CACHE_ENABLED, SHOW_RENDERING_TIME, MULTIPLE_STATE_CHANGE_ENABLED, BIND_ON_ATTACH_ENABLED, COMPLEX_REBIND_ENABLED, PAGER_PAGE_CLIP_ENABLED, PERMANENT_DEBUG_PANEL_ENABLED};
    }

    static {
        g gVar = null;
        VISUAL_ERRORS_ENABLED = new EnumC5370a("VISUAL_ERRORS_ENABLED", 6, "visual_errors", false, 2, gVar);
        int i = 2;
        g gVar2 = null;
        boolean z10 = false;
        VIEW_POOL_OPTIMIZATION_DEBUG = new EnumC5370a("VIEW_POOL_OPTIMIZATION_DEBUG", 10, "view_pool_optimization_debug", z10, i, gVar2);
        MULTIPLE_STATE_CHANGE_ENABLED = new EnumC5370a("MULTIPLE_STATE_CHANGE_ENABLED", 13, "multiple_state_change_enabled", z10, i, gVar2);
        COMPLEX_REBIND_ENABLED = new EnumC5370a("COMPLEX_REBIND_ENABLED", 15, "complex_rebind_enabled", false, 2, gVar);
    }

    private EnumC5370a(String str, int i, String str2, boolean z10) {
        this.key = str2;
        this.defaultValue = z10;
    }

    public static EnumC5370a valueOf(String str) {
        return (EnumC5370a) Enum.valueOf(EnumC5370a.class, str);
    }

    public static EnumC5370a[] values() {
        return (EnumC5370a[]) $VALUES.clone();
    }

    public final boolean getDefaultValue() {
        return this.defaultValue;
    }

    public final String getKey() {
        return this.key;
    }

    public /* synthetic */ EnumC5370a(String str, int i, String str2, boolean z10, int i10, g gVar) {
        this(str, i, str2, (i10 & 2) != 0 ? false : z10);
    }
}
