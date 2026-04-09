package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;
    private final boolean isDataSourceTrigger;
    private final String reason;
    public static final m0 AUDIO_STATE_TRIGGER = new m0("AUDIO_STATE_TRIGGER", 0, "AudioStateTrigger", true);
    public static final m0 BATTERY_STATE_TRIGGER = new m0("BATTERY_STATE_TRIGGER", 1, "BatteryStateTrigger", true);
    public static final m0 POWER_STATE_TRIGGER = new m0("POWER_STATE_TRIGGER", 2, "PowerStateTrigger", true);
    public static final m0 SCREEN_STATE_TRIGGER = new m0("SCREEN_STATE_TRIGGER", 3, "ScreenStateTrigger", true);
    public static final m0 WIFI_CONNECTED_STATE_TRIGGER = new m0("WIFI_CONNECTED_STATE_TRIGGER", 4, "WifiConnectedStateTrigger", true);
    public static final m0 CELLULAR_CONNECTED_STATE_TRIGGER = new m0("CELLULAR_CONNECTED_STATE_TRIGGER", 5, "CellularConnectedStateTrigger", true);
    public static final m0 CELL_TRIGGER = new m0("CELL_TRIGGER", 6, "CellTrigger", true);
    public static final m0 DEVICE_BOOT_TRIGGER = new m0("DEVICE_BOOT_TRIGGER", 7, "DeviceBootTrigger", true);
    public static final m0 DEVICE_SHUTDOWN_TRIGGER = new m0("DEVICE_SHUTDOWN_TRIGGER", 8, "DeviceShutDownTrigger", true);
    public static final m0 LOCATION_EXPIRED_TRIGGER = new m0("LOCATION_EXPIRED_TRIGGER", 9, "LocationExpiredTrigger", true);
    public static final m0 LOCATION_HAS_IMPROVED_TRIGGER = new m0("LOCATION_HAS_IMPROVED_TRIGGER", 10, "LocationHasImprovedTrigger", true);
    public static final m0 LOCATION_SETTINGS_UPDATED_TRIGGER = new m0("LOCATION_SETTINGS_UPDATED_TRIGGER", 11, "LocationSettingsUpdatedTrigger", true);
    public static final m0 WIFI_ON_OFF_TRIGGER = new m0("WIFI_ON_OFF_TRIGGER", 12, "WifiOnOffTrigger", true);
    public static final m0 APP_BUCKET_TRIGGER = new m0("APP_BUCKET_TRIGGER", 13, "AppBucketTrigger", true);
    public static final m0 APP_LIFECYCLE_TRIGGER = new m0("APP_LIFECYCLE_TRIGGER", 14, "AppLifecycleTrigger", true);
    public static final m0 NETWORK_GENERATION_TRIGGER = new m0("NETWORK_GENERATION_TRIGGER", 15, "NetworkGenerationTrigger", true);
    public static final m0 NETWORK_CONNECTED_TRIGGER = new m0("NETWORK_CONNECTED_TRIGGER", 16, "NetworkConnectedTrigger", true);
    public static final m0 CONNECTION_CHANGED_TRIGGER = new m0("CONNECTION_CHANGED_TRIGGER", 17, "ConnectionChangedTrigger", true);
    public static final m0 SCHEDULE_TASK_COMMAND_TRIGGER = new m0("SCHEDULE_TASK_COMMAND_TRIGGER", 18, "ScheduleTasksCommand", false);
    public static final m0 RESCHEDULE_TASK_COMMAND_TRIGGER = new m0("RESCHEDULE_TASK_COMMAND_TRIGGER", 19, "RescheduleTasksCommand", false);
    public static final m0 RESCHEDULE_TASK_TRIGGER = new m0("RESCHEDULE_TASK_TRIGGER", 20, "RescheduleTask", false);
    public static final m0 SCHEDULE_PRECONFIGURED_TASK_TRIGGER = new m0("SCHEDULE_PRECONFIGURED_TASK_TRIGGER", 21, "SchedulePreConfiguredTask", false);
    public static final m0 TASK_FINISHED_WORK_TRIGGER = new m0("TASK_FINISHED_WORK_TRIGGER", 22, "TaskFinishedWork", false);
    public static final m0 SCHEDULE_INTENSIVE_TASK_TRIGGER = new m0("SCHEDULE_INTENSIVE_TASK_TRIGGER", 23, "ScheduleOtherNetworkIntensiveTasks", false);
    public static final m0 UNKNOWN = new m0("UNKNOWN", 24, "Unknown", false);
    public static final m0 WIFI_SCAN_TRIGGER = new m0("WIFI_SCAN_TRIGGER", 25, "WifiScanTrigger", true);
    public static final m0 NETWORK_BLOCKED_TRIGGER = new m0("NETWORK_BLOCKED_TRIGGER", 26, "NetworkBlockedTrigger", true);
    public static final m0 APP_ACTIVE_OR_SCREEN_UNLOCKED_TRIGGER = new m0("APP_ACTIVE_OR_SCREEN_UNLOCKED_TRIGGER", 27, "AppActiveOrScreenUnlockedTrigger", true);

    private static final /* synthetic */ m0[] $values() {
        return new m0[]{AUDIO_STATE_TRIGGER, BATTERY_STATE_TRIGGER, POWER_STATE_TRIGGER, SCREEN_STATE_TRIGGER, WIFI_CONNECTED_STATE_TRIGGER, CELLULAR_CONNECTED_STATE_TRIGGER, CELL_TRIGGER, DEVICE_BOOT_TRIGGER, DEVICE_SHUTDOWN_TRIGGER, LOCATION_EXPIRED_TRIGGER, LOCATION_HAS_IMPROVED_TRIGGER, LOCATION_SETTINGS_UPDATED_TRIGGER, WIFI_ON_OFF_TRIGGER, APP_BUCKET_TRIGGER, APP_LIFECYCLE_TRIGGER, NETWORK_GENERATION_TRIGGER, NETWORK_CONNECTED_TRIGGER, CONNECTION_CHANGED_TRIGGER, SCHEDULE_TASK_COMMAND_TRIGGER, RESCHEDULE_TASK_COMMAND_TRIGGER, RESCHEDULE_TASK_TRIGGER, SCHEDULE_PRECONFIGURED_TASK_TRIGGER, TASK_FINISHED_WORK_TRIGGER, SCHEDULE_INTENSIVE_TASK_TRIGGER, UNKNOWN, WIFI_SCAN_TRIGGER, NETWORK_BLOCKED_TRIGGER, APP_ACTIVE_OR_SCREEN_UNLOCKED_TRIGGER};
    }

    static {
        m0[] m0VarArr$values = $values();
        $VALUES = m0VarArr$values;
        $ENTRIES = a.a.j(m0VarArr$values);
    }

    private m0(String str, int i10, String str2, boolean z10) {
        this.reason = str2;
        this.isDataSourceTrigger = z10;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }

    public final String getReason() {
        return this.reason;
    }

    public final boolean isDataSourceTrigger() {
        return this.isDataSourceTrigger;
    }
}
