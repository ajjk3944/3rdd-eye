package com.ui.wmw.api.v1;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.s;
import gg.z;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface a extends Lf.b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.ui.wmw.api.v1.a$a, reason: collision with other inner class name */
    public static final class EnumC1672a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC1672a[] $VALUES;
        private final String path;
        public static final EnumC1672a DEVICE = new EnumC1672a("DEVICE", 0, "");
        public static final EnumC1672a DEVICE_LOCATE = new EnumC1672a("DEVICE_LOCATE", 1, "/locate");
        public static final EnumC1672a DEVICE_REBOOT = new EnumC1672a("DEVICE_REBOOT", 2, "/reboot");
        public static final EnumC1672a DEVICE_RESET = new EnumC1672a("DEVICE_RESET", 3, "/reset");
        public static final EnumC1672a STATISTICS = new EnumC1672a("STATISTICS", 4, "/stats");
        public static final EnumC1672a STATISTICS_PERIODIC = new EnumC1672a("STATISTICS_PERIODIC", 5, "/per_stats");
        public static final EnumC1672a SETTINGS = new EnumC1672a("SETTINGS", 6, "/settings");
        public static final EnumC1672a SETTINGS_NAME = new EnumC1672a("SETTINGS_NAME", 7, "/settings/name");
        public static final EnumC1672a SETTINGS_LED = new EnumC1672a("SETTINGS_LED", 8, "/settings/led");
        public static final EnumC1672a SETTINGS_HW_RESET = new EnumC1672a("SETTINGS_HW_RESET", 9, "/settings/hwreset");
        public static final EnumC1672a SETTINGS_STATISTICS_INTERVAL = new EnumC1672a("SETTINGS_STATISTICS_INTERVAL", 10, "/settings/intervals");
        public static final EnumC1672a FIRMWARE = new EnumC1672a("FIRMWARE", 11, "/fw");
        public static final EnumC1672a FIRMWARE_UPLOAD_START = new EnumC1672a("FIRMWARE_UPLOAD_START", 12, "/fw/start");
        public static final EnumC1672a FIRMWARE_UPLOAD_DATA = new EnumC1672a("FIRMWARE_UPLOAD_DATA", 13, "/fw/data");
        public static final EnumC1672a FIRMWARE_UPLOAD_ABORT = new EnumC1672a("FIRMWARE_UPLOAD_ABORT", 14, "/fw/abort");
        public static final EnumC1672a BLUETOOTH = new EnumC1672a("BLUETOOTH", 15, "/bt");
        public static final EnumC1672a WIFI_SCAN_START = new EnumC1672a("WIFI_SCAN_START", 16, "/wifi/trigger_scan");
        public static final EnumC1672a WIFI_SCAN_STOP = new EnumC1672a("WIFI_SCAN_STOP", 17, "/wifi/stop_scan");
        public static final EnumC1672a WIFI_PRIORITY_CHANNELS = new EnumC1672a("WIFI_PRIORITY_CHANNELS", 18, "/wifi/priority");
        public static final EnumC1672a WIFI_SCAN_DONE = new EnumC1672a("WIFI_SCAN_DONE", 19, "/scan_done");
        public static final EnumC1672a WIFI_SCAN_RESULT = new EnumC1672a("WIFI_SCAN_RESULT", 20, "/wifi/get_scan_result");

        private static final /* synthetic */ EnumC1672a[] $values() {
            return new EnumC1672a[]{DEVICE, DEVICE_LOCATE, DEVICE_REBOOT, DEVICE_RESET, STATISTICS, STATISTICS_PERIODIC, SETTINGS, SETTINGS_NAME, SETTINGS_LED, SETTINGS_HW_RESET, SETTINGS_STATISTICS_INTERVAL, FIRMWARE, FIRMWARE_UPLOAD_START, FIRMWARE_UPLOAD_DATA, FIRMWARE_UPLOAD_ABORT, BLUETOOTH, WIFI_SCAN_START, WIFI_SCAN_STOP, WIFI_PRIORITY_CHANNELS, WIFI_SCAN_DONE, WIFI_SCAN_RESULT};
        }

        static {
            EnumC1672a[] enumC1672aArr$values = $values();
            $VALUES = enumC1672aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC1672aArr$values);
        }

        private EnumC1672a(String str, int i10, String str2) {
            this.path = str2;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC1672a valueOf(String str) {
            return (EnumC1672a) Enum.valueOf(EnumC1672a.class, str);
        }

        public static EnumC1672a[] values() {
            return (EnumC1672a[]) $VALUES.clone();
        }

        public String getPath() {
            return this.path;
        }

        protected final String pathPrefix(String sessionId) {
            AbstractC6492s.i(sessionId, "sessionId");
            return "/api/1.0/" + sessionId;
        }

        public final String getPath(String sessionId) {
            AbstractC6492s.i(sessionId, "sessionId");
            return pathPrefix(sessionId) + getPath();
        }
    }

    z a();

    s b();

    z c();

    AbstractC5912b d(String str);

    AbstractC5912b e(List list);

    z f();

    gg.i g(long j10, InputStream inputStream, boolean z10);

    AbstractC5912b h();

    z i();

    AbstractC5912b j(ApiV1BluetoothSettings apiV1BluetoothSettings);

    AbstractC5912b k();

    z l();

    z m();
}
