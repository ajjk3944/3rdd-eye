package com.ui.wifiman.db;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import bc.AbstractC4082a;
import bc.C4083b;
import cc.C4239c;
import cc.InterfaceC4238b;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m2.C6748f;
import m2.s;
import p2.AbstractC7208b;
import p2.C7212f;

/* loaded from: classes3.dex */
public final class WifimanDB_Impl extends WifimanDB {

    /* renamed from: A, reason: collision with root package name */
    private volatile Zb.a f42380A;

    /* renamed from: B, reason: collision with root package name */
    private volatile Xb.e f42381B;

    /* renamed from: C, reason: collision with root package name */
    private volatile Yb.b f42382C;

    /* renamed from: D, reason: collision with root package name */
    private volatile InterfaceC4238b f42383D;

    /* renamed from: E, reason: collision with root package name */
    private volatile Lb.b f42384E;

    /* renamed from: F, reason: collision with root package name */
    private volatile Nb.e f42385F;

    /* renamed from: G, reason: collision with root package name */
    private volatile ac.c f42386G;

    /* renamed from: H, reason: collision with root package name */
    private volatile ac.e f42387H;

    /* renamed from: I, reason: collision with root package name */
    private volatile Pb.c f42388I;

    /* renamed from: J, reason: collision with root package name */
    private volatile Pb.e f42389J;

    /* renamed from: K, reason: collision with root package name */
    private volatile Pb.a f42390K;

    /* renamed from: L, reason: collision with root package name */
    private volatile Rb.a f42391L;

    /* renamed from: M, reason: collision with root package name */
    private volatile Nb.a f42392M;

    /* renamed from: q, reason: collision with root package name */
    private volatile Vb.a f42393q;

    /* renamed from: r, reason: collision with root package name */
    private volatile Ub.a f42394r;

    /* renamed from: s, reason: collision with root package name */
    private volatile AbstractC4082a f42395s;

    /* renamed from: t, reason: collision with root package name */
    private volatile Mb.a f42396t;

    /* renamed from: u, reason: collision with root package name */
    private volatile Ob.a f42397u;

    /* renamed from: v, reason: collision with root package name */
    private volatile Tb.b f42398v;

    /* renamed from: w, reason: collision with root package name */
    private volatile Sb.b f42399w;

    /* renamed from: x, reason: collision with root package name */
    private volatile Wb.j f42400x;

    /* renamed from: y, reason: collision with root package name */
    private volatile Wb.h f42401y;

    /* renamed from: z, reason: collision with root package name */
    private volatile Wb.a f42402z;

    class a extends s.b {
        a(int i10) {
            super(i10);
        }

        @Override // m2.s.b
        public void a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `speedTestServer` (`id` TEXT NOT NULL, `city` TEXT, `country` TEXT, `countryCode` TEXT, `latitude` REAL, `longitude` REAL, `provider` TEXT, `providerUrl` TEXT, `speedMbps` INTEGER, `url` TEXT, `timestamp` INTEGER NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `settings` (`id` INTEGER NOT NULL, `themeId` TEXT NOT NULL, `dayNightId` TEXT NOT NULL, `distanceUnitId` TEXT NOT NULL, `channelsShowFrequencies` INTEGER NOT NULL, `channelsShowFrequencies_5ghz` INTEGER NOT NULL, `discoveryKeepScreenOn` INTEGER NOT NULL, `speedtestKeepScreenOn` INTEGER NOT NULL, `screen_orientation` TEXT NOT NULL, `teleport_tile_service_added` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `session` (`id` INTEGER NOT NULL, `sessionID` TEXT NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `discoveryListUiState` (`id` INTEGER NOT NULL, `sortType` TEXT NOT NULL, `favoritesOnTop` INTEGER NOT NULL, `ubiquitiOnTop` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `deviceInformation` (`hwAddrId` TEXT NOT NULL, `mac` TEXT NOT NULL, `favorite` INTEGER NOT NULL, `customName` TEXT, `updated` INTEGER NOT NULL, PRIMARY KEY(`hwAddrId`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `wifiScan` (`id` INTEGER NOT NULL, `chart_spectrum` TEXT NOT NULL, `sort_type` TEXT NOT NULL, `sort_type_quality` TEXT NOT NULL, `scan_feature` TEXT NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `wizardState` (`id` INTEGER NOT NULL, `locationHandled` INTEGER, `localSpeedtestHandled` INTEGER, `bluetoothScanHandled` INTEGER, `notifPermHandled` INTEGER, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `appReviewState` (`id` INTEGER NOT NULL, `appLaunchedInDays` INTEGER NOT NULL, `lastAppLaunchedTimestamp` INTEGER, `appReviewFlowDisplayed` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `speedTestId` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `serverId` TEXT, `unifiControllerId` TEXT, `timestamp` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_timestamp` ON `speedTestId` (`timestamp`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `speedTestEnv` (`resultId` INTEGER NOT NULL, `connection_type` TEXT, `ssid` TEXT, `topology` TEXT, `ap_name` TEXT, `wifi_mode` TEXT, `signal` INTEGER, `signalAP` INTEGER, `band_id` TEXT, `channel` INTEGER, `channel_width` TEXT, `rate_download` INTEGER, `rate_upload` INTEGER, `wifi_experience` REAL, `dns_servers` TEXT, PRIMARY KEY(`resultId`))");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_connectionType` ON `speedTestEnv` (`connection_type`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_ssid` ON `speedTestEnv` (`ssid`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_connTypeAndSsid` ON `speedTestEnv` (`connection_type`, `ssid`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `speedTestMeasurement` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resultId` INTEGER NOT NULL, `speedtest_type` TEXT NOT NULL, `latency` INTEGER, `jitter` INTEGER, `downloadBits` INTEGER, `download_bits_history` TEXT, `uploadBits` INTEGER, `upload_bits_history` TEXT, `endpoint_type` TEXT NOT NULL, `server_ip` TEXT NOT NULL, `server_name` TEXT, `server_provider` TEXT, `server_provider_url` TEXT, `server_location_city` TEXT, `server_location_country` TEXT, `server_product_id` INTEGER, `server_product_image_engine` INTEGER, `server_product_image_url` TEXT, `server_product` TEXT, `server_wifi_experience` INTEGER, `server_a2a_device_type` TEXT, `server_provider_secondary` TEXT, `public_ip_provider` TEXT, `public_ip_provider_image` TEXT)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_resultId` ON `speedTestMeasurement` (`resultId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `bluetoothListUiState` (`id` INTEGER NOT NULL, `connectedOnTop` INTEGER NOT NULL, `ubiquitiGrouped` INTEGER NOT NULL, `sort_type` TEXT NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `signalMapperPlaces` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `ssid` TEXT, `bssid` TEXT, `apName` TEXT, `apModel` TEXT, `signal` INTEGER, `throughput` INTEGER, `latency` INTEGER, `latencyDns` INTEGER, `packetLoss` INTEGER, `wifiBand` TEXT, `ieeeMode` TEXT, `created` INTEGER NOT NULL, `signalCellSimPrimaryIndex` INTEGER, `signalCellSim0` INTEGER, `signalCellSim0Type` TEXT, `signalCellSim1` INTEGER, `signalCellSim1Type` TEXT)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_signal_mapper_place_created` ON `signalMapperPlaces` (`created`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_signal_mapper_place_name` ON `signalMapperPlaces` (`name`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `signalMapperPlaceName` (`name` TEXT NOT NULL, `created` INTEGER NOT NULL, PRIMARY KEY(`name`))");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_signal_mapper_place_name_created` ON `signalMapperPlaceName` (`created`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `signalMapperUiState` (`id` INTEGER NOT NULL, `tutorialShown` INTEGER NOT NULL, `section` TEXT NOT NULL, `signalType` TEXT NOT NULL, `tab` TEXT NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `speedtestSettings` (`id` INTEGER NOT NULL, `uispReportEnabled` INTEGER NOT NULL, `advancedTestEnabled` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `teleportWizardState` (`id` INTEGER NOT NULL, `dataCollectionApproved` INTEGER NOT NULL, `consoleSelectedId` TEXT, `tunnelPrimaryId` TEXT, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `ssoAccount` (`uuid` TEXT NOT NULL, `username` TEXT NOT NULL, `first_name` TEXT, `last_name` TEXT, `email` TEXT NOT NULL, `avatarUrl` TEXT, `verified` INTEGER, `privacy_revision` TEXT, `terms_revision` TEXT, `isPrimary` INTEGER NOT NULL, `updated` INTEGER NOT NULL, PRIMARY KEY(`uuid`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `wifimanWizardAdoption` (`id` INTEGER NOT NULL, `mac` TEXT NOT NULL, `name` TEXT NOT NULL, `fw_recommended` TEXT, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `console` (`id` TEXT NOT NULL, `consoleId` TEXT NOT NULL, `ssoAccountId` TEXT, `publicSecret` TEXT, `name` TEXT NOT NULL, `network_name` TEXT, `wanIp` TEXT, `sku` TEXT, `imageId` INTEGER, `imageIdStr` TEXT, `imageEngine` INTEGER, `latitude` REAL, `longitude` REAL, `location_text` TEXT, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_console_id` ON `console` (`consoleId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `cloudConsoles` (`id` TEXT NOT NULL, `ssoAccountId` TEXT NOT NULL, `fw` TEXT, `name` TEXT, `mac` TEXT, `locLon` REAL, `locLat` REAL, `locText` TEXT, `available` INTEGER, `model` TEXT, `product` TEXT, `owner` INTEGER, `network_version` TEXT, `network_teleportAvailability` TEXT, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `discoveryHome` (`id` INTEGER NOT NULL, `tab` TEXT NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `favoriteHost` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `host` TEXT NOT NULL, `priority` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_host` ON `favoriteHost` (`host`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `floorplanRecord` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `ssid` TEXT, `timestamp` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_floorplan_record_timestamp` ON `floorplanRecord` (`timestamp`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_floorplan_record_name` ON `floorplanRecord` (`name`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `floorplanGpx` (`id` INTEGER NOT NULL, `gpx` TEXT NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `directConsoleConnectionPopup` (`consoleId` TEXT NOT NULL, `recommended` INTEGER NOT NULL, `cert` TEXT, PRIMARY KEY(`consoleId`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `wifiNetworkDetail` (`id` INTEGER NOT NULL, `sort_type_networks_ap` TEXT NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ef3df847d6d240519519ee77ffcabe3b')");
        }

        @Override // m2.s.b
        public void b(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `speedTestServer`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `settings`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `session`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `discoveryListUiState`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `deviceInformation`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `wifiScan`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `wizardState`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `appReviewState`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `speedTestId`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `speedTestEnv`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `speedTestMeasurement`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `bluetoothListUiState`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `signalMapperPlaces`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `signalMapperPlaceName`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `signalMapperUiState`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `speedtestSettings`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `teleportWizardState`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `ssoAccount`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `wifimanWizardAdoption`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `console`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `cloudConsoles`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `discoveryHome`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `favoriteHost`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `floorplanRecord`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `floorplanGpx`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `directConsoleConnectionPopup`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `wifiNetworkDetail`");
            List list = ((m2.q) WifimanDB_Impl.this).f53048h;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    AbstractC5487d.a(it.next());
                    throw null;
                }
            }
        }

        @Override // m2.s.b
        public void c(SupportSQLiteDatabase supportSQLiteDatabase) {
            List list = ((m2.q) WifimanDB_Impl.this).f53048h;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    AbstractC5487d.a(it.next());
                    throw null;
                }
            }
        }

        @Override // m2.s.b
        public void d(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((m2.q) WifimanDB_Impl.this).f53041a = supportSQLiteDatabase;
            WifimanDB_Impl.this.v(supportSQLiteDatabase);
            List list = ((m2.q) WifimanDB_Impl.this).f53048h;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    AbstractC5487d.a(it.next());
                    throw null;
                }
            }
        }

        @Override // m2.s.b
        public void e(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // m2.s.b
        public void f(SupportSQLiteDatabase supportSQLiteDatabase) {
            AbstractC7208b.a(supportSQLiteDatabase);
        }

        @Override // m2.s.b
        public s.c g(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(12);
            map.put("id", new C7212f.a("id", "TEXT", true, 1, null, 1));
            map.put("city", new C7212f.a("city", "TEXT", false, 0, null, 1));
            map.put("country", new C7212f.a("country", "TEXT", false, 0, null, 1));
            map.put("countryCode", new C7212f.a("countryCode", "TEXT", false, 0, null, 1));
            map.put("latitude", new C7212f.a("latitude", "REAL", false, 0, null, 1));
            map.put("longitude", new C7212f.a("longitude", "REAL", false, 0, null, 1));
            map.put("provider", new C7212f.a("provider", "TEXT", false, 0, null, 1));
            map.put("providerUrl", new C7212f.a("providerUrl", "TEXT", false, 0, null, 1));
            map.put("speedMbps", new C7212f.a("speedMbps", "INTEGER", false, 0, null, 1));
            map.put("url", new C7212f.a("url", "TEXT", false, 0, null, 1));
            map.put("timestamp", new C7212f.a("timestamp", "INTEGER", true, 0, null, 1));
            map.put("type", new C7212f.a("type", "TEXT", true, 0, null, 1));
            C7212f c7212f = new C7212f("speedTestServer", map, new HashSet(0), new HashSet(0));
            C7212f c7212fA = C7212f.a(supportSQLiteDatabase, "speedTestServer");
            if (!c7212f.equals(c7212fA)) {
                return new s.c(false, "speedTestServer(com.ui.wifiman.db.speedtest.server.RoomSpeedtestServer).\n Expected:\n" + c7212f + "\n Found:\n" + c7212fA);
            }
            HashMap map2 = new HashMap(10);
            map2.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map2.put("themeId", new C7212f.a("themeId", "TEXT", true, 0, null, 1));
            map2.put("dayNightId", new C7212f.a("dayNightId", "TEXT", true, 0, null, 1));
            map2.put("distanceUnitId", new C7212f.a("distanceUnitId", "TEXT", true, 0, null, 1));
            map2.put("channelsShowFrequencies", new C7212f.a("channelsShowFrequencies", "INTEGER", true, 0, null, 1));
            map2.put("channelsShowFrequencies_5ghz", new C7212f.a("channelsShowFrequencies_5ghz", "INTEGER", true, 0, null, 1));
            map2.put("discoveryKeepScreenOn", new C7212f.a("discoveryKeepScreenOn", "INTEGER", true, 0, null, 1));
            map2.put("speedtestKeepScreenOn", new C7212f.a("speedtestKeepScreenOn", "INTEGER", true, 0, null, 1));
            map2.put("screen_orientation", new C7212f.a("screen_orientation", "TEXT", true, 0, null, 1));
            map2.put("teleport_tile_service_added", new C7212f.a("teleport_tile_service_added", "INTEGER", true, 0, null, 1));
            C7212f c7212f2 = new C7212f("settings", map2, new HashSet(0), new HashSet(0));
            C7212f c7212fA2 = C7212f.a(supportSQLiteDatabase, "settings");
            if (!c7212f2.equals(c7212fA2)) {
                return new s.c(false, "settings(com.ui.wifiman.db.settings.RoomAppSettings).\n Expected:\n" + c7212f2 + "\n Found:\n" + c7212fA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map3.put("sessionID", new C7212f.a("sessionID", "TEXT", true, 0, null, 1));
            C7212f c7212f3 = new C7212f("session", map3, new HashSet(0), new HashSet(0));
            C7212f c7212fA3 = C7212f.a(supportSQLiteDatabase, "session");
            if (!c7212f3.equals(c7212fA3)) {
                return new s.c(false, "session(com.ui.wifiman.db.session.RoomAppSession).\n Expected:\n" + c7212f3 + "\n Found:\n" + c7212fA3);
            }
            HashMap map4 = new HashMap(4);
            map4.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map4.put("sortType", new C7212f.a("sortType", "TEXT", true, 0, null, 1));
            map4.put("favoritesOnTop", new C7212f.a("favoritesOnTop", "INTEGER", true, 0, null, 1));
            map4.put("ubiquitiOnTop", new C7212f.a("ubiquitiOnTop", "INTEGER", true, 0, null, 1));
            C7212f c7212f4 = new C7212f("discoveryListUiState", map4, new HashSet(0), new HashSet(0));
            C7212f c7212fA4 = C7212f.a(supportSQLiteDatabase, "discoveryListUiState");
            if (!c7212f4.equals(c7212fA4)) {
                return new s.c(false, "discoveryListUiState(com.ui.wifiman.db.discovery.RoomDiscoveryLanListConfig).\n Expected:\n" + c7212f4 + "\n Found:\n" + c7212fA4);
            }
            HashMap map5 = new HashMap(5);
            map5.put("hwAddrId", new C7212f.a("hwAddrId", "TEXT", true, 1, null, 1));
            map5.put("mac", new C7212f.a("mac", "TEXT", true, 0, null, 1));
            map5.put("favorite", new C7212f.a("favorite", "INTEGER", true, 0, null, 1));
            map5.put("customName", new C7212f.a("customName", "TEXT", false, 0, null, 1));
            map5.put("updated", new C7212f.a("updated", "INTEGER", true, 0, null, 1));
            C7212f c7212f5 = new C7212f("deviceInformation", map5, new HashSet(0), new HashSet(0));
            C7212f c7212fA5 = C7212f.a(supportSQLiteDatabase, "deviceInformation");
            if (!c7212f5.equals(c7212fA5)) {
                return new s.c(false, "deviceInformation(com.ui.wifiman.db.device.RoomDeviceRecord).\n Expected:\n" + c7212f5 + "\n Found:\n" + c7212fA5);
            }
            HashMap map6 = new HashMap(5);
            map6.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map6.put("chart_spectrum", new C7212f.a("chart_spectrum", "TEXT", true, 0, null, 1));
            map6.put("sort_type", new C7212f.a("sort_type", "TEXT", true, 0, null, 1));
            map6.put("sort_type_quality", new C7212f.a("sort_type_quality", "TEXT", true, 0, null, 1));
            map6.put("scan_feature", new C7212f.a("scan_feature", "TEXT", true, 0, null, 1));
            C7212f c7212f6 = new C7212f("wifiScan", map6, new HashSet(0), new HashSet(0));
            C7212f c7212fA6 = C7212f.a(supportSQLiteDatabase, "wifiScan");
            if (!c7212f6.equals(c7212fA6)) {
                return new s.c(false, "wifiScan(com.ui.wifiman.db.scan.RoomWifiScanHomeConfig).\n Expected:\n" + c7212f6 + "\n Found:\n" + c7212fA6);
            }
            HashMap map7 = new HashMap(5);
            map7.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map7.put("locationHandled", new C7212f.a("locationHandled", "INTEGER", false, 0, null, 1));
            map7.put("localSpeedtestHandled", new C7212f.a("localSpeedtestHandled", "INTEGER", false, 0, null, 1));
            map7.put("bluetoothScanHandled", new C7212f.a("bluetoothScanHandled", "INTEGER", false, 0, null, 1));
            map7.put("notifPermHandled", new C7212f.a("notifPermHandled", "INTEGER", false, 0, null, 1));
            C7212f c7212f7 = new C7212f("wizardState", map7, new HashSet(0), new HashSet(0));
            C7212f c7212fA7 = C7212f.a(supportSQLiteDatabase, "wizardState");
            if (!c7212f7.equals(c7212fA7)) {
                return new s.c(false, "wizardState(com.ui.wifiman.db.wizard.RoomAppWizardConfig).\n Expected:\n" + c7212f7 + "\n Found:\n" + c7212fA7);
            }
            HashMap map8 = new HashMap(4);
            map8.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map8.put("appLaunchedInDays", new C7212f.a("appLaunchedInDays", "INTEGER", true, 0, null, 1));
            map8.put("lastAppLaunchedTimestamp", new C7212f.a("lastAppLaunchedTimestamp", "INTEGER", false, 0, null, 1));
            map8.put("appReviewFlowDisplayed", new C7212f.a("appReviewFlowDisplayed", "INTEGER", true, 0, null, 1));
            C7212f c7212f8 = new C7212f("appReviewState", map8, new HashSet(0), new HashSet(0));
            C7212f c7212fA8 = C7212f.a(supportSQLiteDatabase, "appReviewState");
            if (!c7212f8.equals(c7212fA8)) {
                return new s.c(false, "appReviewState(com.ui.wifiman.db.appreview.RoomAppReviewState).\n Expected:\n" + c7212f8 + "\n Found:\n" + c7212fA8);
            }
            HashMap map9 = new HashMap(4);
            map9.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map9.put("serverId", new C7212f.a("serverId", "TEXT", false, 0, null, 1));
            map9.put("unifiControllerId", new C7212f.a("unifiControllerId", "TEXT", false, 0, null, 1));
            map9.put("timestamp", new C7212f.a("timestamp", "INTEGER", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new C7212f.e("index_timestamp", false, Arrays.asList("timestamp"), Arrays.asList("ASC")));
            C7212f c7212f9 = new C7212f("speedTestId", map9, hashSet, hashSet2);
            C7212f c7212fA9 = C7212f.a(supportSQLiteDatabase, "speedTestId");
            if (!c7212f9.equals(c7212fA9)) {
                return new s.c(false, "speedTestId(com.ui.wifiman.db.speedtest.result.RoomSpeedtestIdentification).\n Expected:\n" + c7212f9 + "\n Found:\n" + c7212fA9);
            }
            HashMap map10 = new HashMap(15);
            map10.put("resultId", new C7212f.a("resultId", "INTEGER", true, 1, null, 1));
            map10.put("connection_type", new C7212f.a("connection_type", "TEXT", false, 0, null, 1));
            map10.put("ssid", new C7212f.a("ssid", "TEXT", false, 0, null, 1));
            map10.put("topology", new C7212f.a("topology", "TEXT", false, 0, null, 1));
            map10.put("ap_name", new C7212f.a("ap_name", "TEXT", false, 0, null, 1));
            map10.put("wifi_mode", new C7212f.a("wifi_mode", "TEXT", false, 0, null, 1));
            map10.put("signal", new C7212f.a("signal", "INTEGER", false, 0, null, 1));
            map10.put("signalAP", new C7212f.a("signalAP", "INTEGER", false, 0, null, 1));
            map10.put("band_id", new C7212f.a("band_id", "TEXT", false, 0, null, 1));
            map10.put("channel", new C7212f.a("channel", "INTEGER", false, 0, null, 1));
            map10.put("channel_width", new C7212f.a("channel_width", "TEXT", false, 0, null, 1));
            map10.put("rate_download", new C7212f.a("rate_download", "INTEGER", false, 0, null, 1));
            map10.put("rate_upload", new C7212f.a("rate_upload", "INTEGER", false, 0, null, 1));
            map10.put("wifi_experience", new C7212f.a("wifi_experience", "REAL", false, 0, null, 1));
            map10.put("dns_servers", new C7212f.a("dns_servers", "TEXT", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(3);
            hashSet4.add(new C7212f.e("index_connectionType", false, Arrays.asList("connection_type"), Arrays.asList("ASC")));
            hashSet4.add(new C7212f.e("index_ssid", false, Arrays.asList("ssid"), Arrays.asList("ASC")));
            hashSet4.add(new C7212f.e("index_connTypeAndSsid", false, Arrays.asList("connection_type", "ssid"), Arrays.asList("ASC", "ASC")));
            C7212f c7212f10 = new C7212f("speedTestEnv", map10, hashSet3, hashSet4);
            C7212f c7212fA10 = C7212f.a(supportSQLiteDatabase, "speedTestEnv");
            if (!c7212f10.equals(c7212fA10)) {
                return new s.c(false, "speedTestEnv(com.ui.wifiman.db.speedtest.result.RoomSpeedtestEnvironment).\n Expected:\n" + c7212f10 + "\n Found:\n" + c7212fA10);
            }
            HashMap map11 = new HashMap(25);
            map11.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map11.put("resultId", new C7212f.a("resultId", "INTEGER", true, 0, null, 1));
            map11.put("speedtest_type", new C7212f.a("speedtest_type", "TEXT", true, 0, null, 1));
            map11.put("latency", new C7212f.a("latency", "INTEGER", false, 0, null, 1));
            map11.put("jitter", new C7212f.a("jitter", "INTEGER", false, 0, null, 1));
            map11.put("downloadBits", new C7212f.a("downloadBits", "INTEGER", false, 0, null, 1));
            map11.put("download_bits_history", new C7212f.a("download_bits_history", "TEXT", false, 0, null, 1));
            map11.put("uploadBits", new C7212f.a("uploadBits", "INTEGER", false, 0, null, 1));
            map11.put("upload_bits_history", new C7212f.a("upload_bits_history", "TEXT", false, 0, null, 1));
            map11.put("endpoint_type", new C7212f.a("endpoint_type", "TEXT", true, 0, null, 1));
            map11.put("server_ip", new C7212f.a("server_ip", "TEXT", true, 0, null, 1));
            map11.put("server_name", new C7212f.a("server_name", "TEXT", false, 0, null, 1));
            map11.put("server_provider", new C7212f.a("server_provider", "TEXT", false, 0, null, 1));
            map11.put("server_provider_url", new C7212f.a("server_provider_url", "TEXT", false, 0, null, 1));
            map11.put("server_location_city", new C7212f.a("server_location_city", "TEXT", false, 0, null, 1));
            map11.put("server_location_country", new C7212f.a("server_location_country", "TEXT", false, 0, null, 1));
            map11.put("server_product_id", new C7212f.a("server_product_id", "INTEGER", false, 0, null, 1));
            map11.put("server_product_image_engine", new C7212f.a("server_product_image_engine", "INTEGER", false, 0, null, 1));
            map11.put("server_product_image_url", new C7212f.a("server_product_image_url", "TEXT", false, 0, null, 1));
            map11.put("server_product", new C7212f.a("server_product", "TEXT", false, 0, null, 1));
            map11.put("server_wifi_experience", new C7212f.a("server_wifi_experience", "INTEGER", false, 0, null, 1));
            map11.put("server_a2a_device_type", new C7212f.a("server_a2a_device_type", "TEXT", false, 0, null, 1));
            map11.put("server_provider_secondary", new C7212f.a("server_provider_secondary", "TEXT", false, 0, null, 1));
            map11.put("public_ip_provider", new C7212f.a("public_ip_provider", "TEXT", false, 0, null, 1));
            map11.put("public_ip_provider_image", new C7212f.a("public_ip_provider_image", "TEXT", false, 0, null, 1));
            HashSet hashSet5 = new HashSet(0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C7212f.e("index_resultId", false, Arrays.asList("resultId"), Arrays.asList("ASC")));
            C7212f c7212f11 = new C7212f("speedTestMeasurement", map11, hashSet5, hashSet6);
            C7212f c7212fA11 = C7212f.a(supportSQLiteDatabase, "speedTestMeasurement");
            if (!c7212f11.equals(c7212fA11)) {
                return new s.c(false, "speedTestMeasurement(com.ui.wifiman.db.speedtest.result.RoomSpeedtestMeasurement).\n Expected:\n" + c7212f11 + "\n Found:\n" + c7212fA11);
            }
            HashMap map12 = new HashMap(4);
            map12.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map12.put("connectedOnTop", new C7212f.a("connectedOnTop", "INTEGER", true, 0, null, 1));
            map12.put("ubiquitiGrouped", new C7212f.a("ubiquitiGrouped", "INTEGER", true, 0, null, 1));
            map12.put("sort_type", new C7212f.a("sort_type", "TEXT", true, 0, null, 1));
            C7212f c7212f12 = new C7212f("bluetoothListUiState", map12, new HashSet(0), new HashSet(0));
            C7212f c7212fA12 = C7212f.a(supportSQLiteDatabase, "bluetoothListUiState");
            if (!c7212f12.equals(c7212fA12)) {
                return new s.c(false, "bluetoothListUiState(com.ui.wifiman.db.discovery.RoomDiscoveryBluetoothListConfig).\n Expected:\n" + c7212f12 + "\n Found:\n" + c7212fA12);
            }
            HashMap map13 = new HashMap(19);
            map13.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map13.put("name", new C7212f.a("name", "TEXT", true, 0, null, 1));
            map13.put("ssid", new C7212f.a("ssid", "TEXT", false, 0, null, 1));
            map13.put("bssid", new C7212f.a("bssid", "TEXT", false, 0, null, 1));
            map13.put("apName", new C7212f.a("apName", "TEXT", false, 0, null, 1));
            map13.put("apModel", new C7212f.a("apModel", "TEXT", false, 0, null, 1));
            map13.put("signal", new C7212f.a("signal", "INTEGER", false, 0, null, 1));
            map13.put("throughput", new C7212f.a("throughput", "INTEGER", false, 0, null, 1));
            map13.put("latency", new C7212f.a("latency", "INTEGER", false, 0, null, 1));
            map13.put("latencyDns", new C7212f.a("latencyDns", "INTEGER", false, 0, null, 1));
            map13.put("packetLoss", new C7212f.a("packetLoss", "INTEGER", false, 0, null, 1));
            map13.put("wifiBand", new C7212f.a("wifiBand", "TEXT", false, 0, null, 1));
            map13.put("ieeeMode", new C7212f.a("ieeeMode", "TEXT", false, 0, null, 1));
            map13.put("created", new C7212f.a("created", "INTEGER", true, 0, null, 1));
            map13.put("signalCellSimPrimaryIndex", new C7212f.a("signalCellSimPrimaryIndex", "INTEGER", false, 0, null, 1));
            map13.put("signalCellSim0", new C7212f.a("signalCellSim0", "INTEGER", false, 0, null, 1));
            map13.put("signalCellSim0Type", new C7212f.a("signalCellSim0Type", "TEXT", false, 0, null, 1));
            map13.put("signalCellSim1", new C7212f.a("signalCellSim1", "INTEGER", false, 0, null, 1));
            map13.put("signalCellSim1Type", new C7212f.a("signalCellSim1Type", "TEXT", false, 0, null, 1));
            HashSet hashSet7 = new HashSet(0);
            HashSet hashSet8 = new HashSet(2);
            hashSet8.add(new C7212f.e("index_signal_mapper_place_created", false, Arrays.asList("created"), Arrays.asList("ASC")));
            hashSet8.add(new C7212f.e("index_signal_mapper_place_name", false, Arrays.asList("name"), Arrays.asList("ASC")));
            C7212f c7212f13 = new C7212f("signalMapperPlaces", map13, hashSet7, hashSet8);
            C7212f c7212fA13 = C7212f.a(supportSQLiteDatabase, "signalMapperPlaces");
            if (!c7212f13.equals(c7212fA13)) {
                return new s.c(false, "signalMapperPlaces(com.ui.wifiman.db.signalmapper.RoomSignalMapperPlace).\n Expected:\n" + c7212f13 + "\n Found:\n" + c7212fA13);
            }
            HashMap map14 = new HashMap(2);
            map14.put("name", new C7212f.a("name", "TEXT", true, 1, null, 1));
            map14.put("created", new C7212f.a("created", "INTEGER", true, 0, null, 1));
            HashSet hashSet9 = new HashSet(0);
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C7212f.e("index_signal_mapper_place_name_created", false, Arrays.asList("created"), Arrays.asList("ASC")));
            C7212f c7212f14 = new C7212f("signalMapperPlaceName", map14, hashSet9, hashSet10);
            C7212f c7212fA14 = C7212f.a(supportSQLiteDatabase, "signalMapperPlaceName");
            if (!c7212f14.equals(c7212fA14)) {
                return new s.c(false, "signalMapperPlaceName(com.ui.wifiman.db.signalmapper.RoomSignalMapperPlaceName).\n Expected:\n" + c7212f14 + "\n Found:\n" + c7212fA14);
            }
            HashMap map15 = new HashMap(5);
            map15.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map15.put("tutorialShown", new C7212f.a("tutorialShown", "INTEGER", true, 0, null, 1));
            map15.put("section", new C7212f.a("section", "TEXT", true, 0, null, 1));
            map15.put("signalType", new C7212f.a("signalType", "TEXT", true, 0, null, 1));
            map15.put("tab", new C7212f.a("tab", "TEXT", true, 0, null, 1));
            C7212f c7212f15 = new C7212f("signalMapperUiState", map15, new HashSet(0), new HashSet(0));
            C7212f c7212fA15 = C7212f.a(supportSQLiteDatabase, "signalMapperUiState");
            if (!c7212f15.equals(c7212fA15)) {
                return new s.c(false, "signalMapperUiState(com.ui.wifiman.db.signalmapper.RoomSignalMapperConfig).\n Expected:\n" + c7212f15 + "\n Found:\n" + c7212fA15);
            }
            HashMap map16 = new HashMap(3);
            map16.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map16.put("uispReportEnabled", new C7212f.a("uispReportEnabled", "INTEGER", true, 0, null, 1));
            map16.put("advancedTestEnabled", new C7212f.a("advancedTestEnabled", "INTEGER", true, 0, null, 1));
            C7212f c7212f16 = new C7212f("speedtestSettings", map16, new HashSet(0), new HashSet(0));
            C7212f c7212fA16 = C7212f.a(supportSQLiteDatabase, "speedtestSettings");
            if (!c7212f16.equals(c7212fA16)) {
                return new s.c(false, "speedtestSettings(com.ui.wifiman.db.speedtest.settings.RoomSpeedtestSettings).\n Expected:\n" + c7212f16 + "\n Found:\n" + c7212fA16);
            }
            HashMap map17 = new HashMap(4);
            map17.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map17.put("dataCollectionApproved", new C7212f.a("dataCollectionApproved", "INTEGER", true, 0, null, 1));
            map17.put("consoleSelectedId", new C7212f.a("consoleSelectedId", "TEXT", false, 0, null, 1));
            map17.put("tunnelPrimaryId", new C7212f.a("tunnelPrimaryId", "TEXT", false, 0, null, 1));
            C7212f c7212f17 = new C7212f("teleportWizardState", map17, new HashSet(0), new HashSet(0));
            C7212f c7212fA17 = C7212f.a(supportSQLiteDatabase, "teleportWizardState");
            if (!c7212f17.equals(c7212fA17)) {
                return new s.c(false, "teleportWizardState(com.ui.wifiman.db.teleport.RoomTeleportState).\n Expected:\n" + c7212f17 + "\n Found:\n" + c7212fA17);
            }
            HashMap map18 = new HashMap(11);
            map18.put("uuid", new C7212f.a("uuid", "TEXT", true, 1, null, 1));
            map18.put("username", new C7212f.a("username", "TEXT", true, 0, null, 1));
            map18.put("first_name", new C7212f.a("first_name", "TEXT", false, 0, null, 1));
            map18.put("last_name", new C7212f.a("last_name", "TEXT", false, 0, null, 1));
            map18.put("email", new C7212f.a("email", "TEXT", true, 0, null, 1));
            map18.put("avatarUrl", new C7212f.a("avatarUrl", "TEXT", false, 0, null, 1));
            map18.put("verified", new C7212f.a("verified", "INTEGER", false, 0, null, 1));
            map18.put("privacy_revision", new C7212f.a("privacy_revision", "TEXT", false, 0, null, 1));
            map18.put("terms_revision", new C7212f.a("terms_revision", "TEXT", false, 0, null, 1));
            map18.put("isPrimary", new C7212f.a("isPrimary", "INTEGER", true, 0, null, 1));
            map18.put("updated", new C7212f.a("updated", "INTEGER", true, 0, null, 1));
            C7212f c7212f18 = new C7212f("ssoAccount", map18, new HashSet(0), new HashSet(0));
            C7212f c7212fA18 = C7212f.a(supportSQLiteDatabase, "ssoAccount");
            if (!c7212f18.equals(c7212fA18)) {
                return new s.c(false, "ssoAccount(com.ui.wifiman.db.account.RoomSSOAccount).\n Expected:\n" + c7212f18 + "\n Found:\n" + c7212fA18);
            }
            HashMap map19 = new HashMap(4);
            map19.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map19.put("mac", new C7212f.a("mac", "TEXT", true, 0, null, 1));
            map19.put("name", new C7212f.a("name", "TEXT", true, 0, null, 1));
            map19.put("fw_recommended", new C7212f.a("fw_recommended", "TEXT", false, 0, null, 1));
            C7212f c7212f19 = new C7212f("wifimanWizardAdoption", map19, new HashSet(0), new HashSet(0));
            C7212f c7212fA19 = C7212f.a(supportSQLiteDatabase, "wifimanWizardAdoption");
            if (!c7212f19.equals(c7212fA19)) {
                return new s.c(false, "wifimanWizardAdoption(com.ui.wifiman.db.wmw.RoomWifimanWizardAdoption).\n Expected:\n" + c7212f19 + "\n Found:\n" + c7212fA19);
            }
            HashMap map20 = new HashMap(14);
            map20.put("id", new C7212f.a("id", "TEXT", true, 1, null, 1));
            map20.put("consoleId", new C7212f.a("consoleId", "TEXT", true, 0, null, 1));
            map20.put("ssoAccountId", new C7212f.a("ssoAccountId", "TEXT", false, 0, null, 1));
            map20.put("publicSecret", new C7212f.a("publicSecret", "TEXT", false, 0, null, 1));
            map20.put("name", new C7212f.a("name", "TEXT", true, 0, null, 1));
            map20.put("network_name", new C7212f.a("network_name", "TEXT", false, 0, null, 1));
            map20.put("wanIp", new C7212f.a("wanIp", "TEXT", false, 0, null, 1));
            map20.put("sku", new C7212f.a("sku", "TEXT", false, 0, null, 1));
            map20.put("imageId", new C7212f.a("imageId", "INTEGER", false, 0, null, 1));
            map20.put("imageIdStr", new C7212f.a("imageIdStr", "TEXT", false, 0, null, 1));
            map20.put("imageEngine", new C7212f.a("imageEngine", "INTEGER", false, 0, null, 1));
            map20.put("latitude", new C7212f.a("latitude", "REAL", false, 0, null, 1));
            map20.put("longitude", new C7212f.a("longitude", "REAL", false, 0, null, 1));
            map20.put("location_text", new C7212f.a("location_text", "TEXT", false, 0, null, 1));
            HashSet hashSet11 = new HashSet(0);
            HashSet hashSet12 = new HashSet(1);
            hashSet12.add(new C7212f.e("index_console_id", true, Arrays.asList("consoleId"), Arrays.asList("ASC")));
            C7212f c7212f20 = new C7212f("console", map20, hashSet11, hashSet12);
            C7212f c7212fA20 = C7212f.a(supportSQLiteDatabase, "console");
            if (!c7212f20.equals(c7212fA20)) {
                return new s.c(false, "console(com.ui.wifiman.db.teleport.RoomTeleportTunnelRecord).\n Expected:\n" + c7212f20 + "\n Found:\n" + c7212fA20);
            }
            HashMap map21 = new HashMap(14);
            map21.put("id", new C7212f.a("id", "TEXT", true, 1, null, 1));
            map21.put("ssoAccountId", new C7212f.a("ssoAccountId", "TEXT", true, 0, null, 1));
            map21.put("fw", new C7212f.a("fw", "TEXT", false, 0, null, 1));
            map21.put("name", new C7212f.a("name", "TEXT", false, 0, null, 1));
            map21.put("mac", new C7212f.a("mac", "TEXT", false, 0, null, 1));
            map21.put("locLon", new C7212f.a("locLon", "REAL", false, 0, null, 1));
            map21.put("locLat", new C7212f.a("locLat", "REAL", false, 0, null, 1));
            map21.put("locText", new C7212f.a("locText", "TEXT", false, 0, null, 1));
            map21.put("available", new C7212f.a("available", "INTEGER", false, 0, null, 1));
            map21.put("model", new C7212f.a("model", "TEXT", false, 0, null, 1));
            map21.put("product", new C7212f.a("product", "TEXT", false, 0, null, 1));
            map21.put("owner", new C7212f.a("owner", "INTEGER", false, 0, null, 1));
            map21.put("network_version", new C7212f.a("network_version", "TEXT", false, 0, null, 1));
            map21.put("network_teleportAvailability", new C7212f.a("network_teleportAvailability", "TEXT", false, 0, null, 1));
            C7212f c7212f21 = new C7212f("cloudConsoles", map21, new HashSet(0), new HashSet(0));
            C7212f c7212fA21 = C7212f.a(supportSQLiteDatabase, "cloudConsoles");
            if (!c7212f21.equals(c7212fA21)) {
                return new s.c(false, "cloudConsoles(com.ui.wifiman.db.console.RoomUbiquitiCloudConsole).\n Expected:\n" + c7212f21 + "\n Found:\n" + c7212fA21);
            }
            HashMap map22 = new HashMap(2);
            map22.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map22.put("tab", new C7212f.a("tab", "TEXT", true, 0, null, 1));
            C7212f c7212f22 = new C7212f("discoveryHome", map22, new HashSet(0), new HashSet(0));
            C7212f c7212fA22 = C7212f.a(supportSQLiteDatabase, "discoveryHome");
            if (!c7212f22.equals(c7212fA22)) {
                return new s.c(false, "discoveryHome(com.ui.wifiman.db.discovery.RoomDiscoveryHomeConfig).\n Expected:\n" + c7212f22 + "\n Found:\n" + c7212fA22);
            }
            HashMap map23 = new HashMap(4);
            map23.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map23.put("host", new C7212f.a("host", "TEXT", true, 0, null, 1));
            map23.put("priority", new C7212f.a("priority", "INTEGER", true, 0, null, 1));
            map23.put("updatedAt", new C7212f.a("updatedAt", "INTEGER", true, 0, null, 1));
            HashSet hashSet13 = new HashSet(0);
            HashSet hashSet14 = new HashSet(1);
            hashSet14.add(new C7212f.e("index_host", true, Arrays.asList("host"), Arrays.asList("ASC")));
            C7212f c7212f23 = new C7212f("favoriteHost", map23, hashSet13, hashSet14);
            C7212f c7212fA23 = C7212f.a(supportSQLiteDatabase, "favoriteHost");
            if (!c7212f23.equals(c7212fA23)) {
                return new s.c(false, "favoriteHost(com.ui.wifiman.db.hosts.RoomFavoriteHost).\n Expected:\n" + c7212f23 + "\n Found:\n" + c7212fA23);
            }
            HashMap map24 = new HashMap(4);
            map24.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map24.put("name", new C7212f.a("name", "TEXT", false, 0, null, 1));
            map24.put("ssid", new C7212f.a("ssid", "TEXT", false, 0, null, 1));
            map24.put("timestamp", new C7212f.a("timestamp", "INTEGER", true, 0, null, 1));
            HashSet hashSet15 = new HashSet(0);
            HashSet hashSet16 = new HashSet(2);
            hashSet16.add(new C7212f.e("index_floorplan_record_timestamp", false, Arrays.asList("timestamp"), Arrays.asList("ASC")));
            hashSet16.add(new C7212f.e("index_floorplan_record_name", false, Arrays.asList("name"), Arrays.asList("ASC")));
            C7212f c7212f24 = new C7212f("floorplanRecord", map24, hashSet15, hashSet16);
            C7212f c7212fA24 = C7212f.a(supportSQLiteDatabase, "floorplanRecord");
            if (!c7212f24.equals(c7212fA24)) {
                return new s.c(false, "floorplanRecord(com.ui.wifiman.db.signalmapper.RoomFloorplanRecord).\n Expected:\n" + c7212f24 + "\n Found:\n" + c7212fA24);
            }
            HashMap map25 = new HashMap(2);
            map25.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map25.put("gpx", new C7212f.a("gpx", "TEXT", true, 0, null, 1));
            C7212f c7212f25 = new C7212f("floorplanGpx", map25, new HashSet(0), new HashSet(0));
            C7212f c7212fA25 = C7212f.a(supportSQLiteDatabase, "floorplanGpx");
            if (!c7212f25.equals(c7212fA25)) {
                return new s.c(false, "floorplanGpx(com.ui.wifiman.db.signalmapper.RoomFloorplanGpx).\n Expected:\n" + c7212f25 + "\n Found:\n" + c7212fA25);
            }
            HashMap map26 = new HashMap(3);
            map26.put("consoleId", new C7212f.a("consoleId", "TEXT", true, 1, null, 1));
            map26.put("recommended", new C7212f.a("recommended", "INTEGER", true, 0, null, 1));
            map26.put("cert", new C7212f.a("cert", "TEXT", false, 0, null, 1));
            C7212f c7212f26 = new C7212f("directConsoleConnectionPopup", map26, new HashSet(0), new HashSet(0));
            C7212f c7212fA26 = C7212f.a(supportSQLiteDatabase, "directConsoleConnectionPopup");
            if (!c7212f26.equals(c7212fA26)) {
                return new s.c(false, "directConsoleConnectionPopup(com.ui.wifiman.db.console.RoomDirectConsoleConnectionRecord).\n Expected:\n" + c7212f26 + "\n Found:\n" + c7212fA26);
            }
            HashMap map27 = new HashMap(2);
            map27.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map27.put("sort_type_networks_ap", new C7212f.a("sort_type_networks_ap", "TEXT", true, 0, null, 1));
            C7212f c7212f27 = new C7212f("wifiNetworkDetail", map27, new HashSet(0), new HashSet(0));
            C7212f c7212fA27 = C7212f.a(supportSQLiteDatabase, "wifiNetworkDetail");
            if (c7212f27.equals(c7212fA27)) {
                return new s.c(true, null);
            }
            return new s.c(false, "wifiNetworkDetail(com.ui.wifiman.db.networkdetail.RoomWifiNetworkDetailConfig).\n Expected:\n" + c7212f27 + "\n Found:\n" + c7212fA27);
        }
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Mb.a C() {
        Mb.a aVar;
        if (this.f42396t != null) {
            return this.f42396t;
        }
        synchronized (this) {
            try {
                if (this.f42396t == null) {
                    this.f42396t = new Mb.b(this);
                }
                aVar = this.f42396t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Ub.a D() {
        Ub.a aVar;
        if (this.f42394r != null) {
            return this.f42394r;
        }
        synchronized (this) {
            try {
                if (this.f42394r == null) {
                    this.f42394r = new Ub.b(this);
                }
                aVar = this.f42394r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Vb.a E() {
        Vb.a aVar;
        if (this.f42393q != null) {
            return this.f42393q;
        }
        synchronized (this) {
            try {
                if (this.f42393q == null) {
                    this.f42393q = new Vb.b(this);
                }
                aVar = this.f42393q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public AbstractC4082a F() {
        AbstractC4082a abstractC4082a;
        if (this.f42395s != null) {
            return this.f42395s;
        }
        synchronized (this) {
            try {
                if (this.f42395s == null) {
                    this.f42395s = new C4083b(this);
                }
                abstractC4082a = this.f42395s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC4082a;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Nb.e G() {
        Nb.e eVar;
        if (this.f42385F != null) {
            return this.f42385F;
        }
        synchronized (this) {
            try {
                if (this.f42385F == null) {
                    this.f42385F = new Nb.f(this);
                }
                eVar = this.f42385F;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Ob.a H() {
        Ob.a aVar;
        if (this.f42397u != null) {
            return this.f42397u;
        }
        synchronized (this) {
            try {
                if (this.f42397u == null) {
                    this.f42397u = new Ob.b(this);
                }
                aVar = this.f42397u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Nb.a I() {
        Nb.a aVar;
        if (this.f42392M != null) {
            return this.f42392M;
        }
        synchronized (this) {
            try {
                if (this.f42392M == null) {
                    this.f42392M = new Nb.b(this);
                }
                aVar = this.f42392M;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Pb.a J() {
        Pb.a aVar;
        if (this.f42390K != null) {
            return this.f42390K;
        }
        synchronized (this) {
            try {
                if (this.f42390K == null) {
                    this.f42390K = new Pb.b(this);
                }
                aVar = this.f42390K;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Pb.c K() {
        Pb.c cVar;
        if (this.f42388I != null) {
            return this.f42388I;
        }
        synchronized (this) {
            try {
                if (this.f42388I == null) {
                    this.f42388I = new Pb.d(this);
                }
                cVar = this.f42388I;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Pb.e L() {
        Pb.e eVar;
        if (this.f42389J != null) {
            return this.f42389J;
        }
        synchronized (this) {
            try {
                if (this.f42389J == null) {
                    this.f42389J = new Pb.f(this);
                }
                eVar = this.f42389J;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Rb.a M() {
        Rb.a aVar;
        if (this.f42391L != null) {
            return this.f42391L;
        }
        synchronized (this) {
            try {
                if (this.f42391L == null) {
                    this.f42391L = new Rb.b(this);
                }
                aVar = this.f42391L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Wb.a N() {
        Wb.a aVar;
        if (this.f42402z != null) {
            return this.f42402z;
        }
        synchronized (this) {
            try {
                if (this.f42402z == null) {
                    this.f42402z = new Wb.b(this);
                }
                aVar = this.f42402z;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Wb.h O() {
        Wb.h hVar;
        if (this.f42401y != null) {
            return this.f42401y;
        }
        synchronized (this) {
            try {
                if (this.f42401y == null) {
                    this.f42401y = new Wb.i(this);
                }
                hVar = this.f42401y;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Wb.j P() {
        Wb.j jVar;
        if (this.f42400x != null) {
            return this.f42400x;
        }
        synchronized (this) {
            try {
                if (this.f42400x == null) {
                    this.f42400x = new Wb.k(this);
                }
                jVar = this.f42400x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Yb.b Q() {
        Yb.b bVar;
        if (this.f42382C != null) {
            return this.f42382C;
        }
        synchronized (this) {
            try {
                if (this.f42382C == null) {
                    this.f42382C = new Yb.d(this);
                }
                bVar = this.f42382C;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Zb.a R() {
        Zb.a aVar;
        if (this.f42380A != null) {
            return this.f42380A;
        }
        synchronized (this) {
            try {
                if (this.f42380A == null) {
                    this.f42380A = new Zb.b(this);
                }
                aVar = this.f42380A;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Xb.e S() {
        Xb.e eVar;
        if (this.f42381B != null) {
            return this.f42381B;
        }
        synchronized (this) {
            try {
                if (this.f42381B == null) {
                    this.f42381B = new Xb.g(this);
                }
                eVar = this.f42381B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Lb.b T() {
        Lb.b bVar;
        if (this.f42384E != null) {
            return this.f42384E;
        }
        synchronized (this) {
            try {
                if (this.f42384E == null) {
                    this.f42384E = new Lb.c(this);
                }
                bVar = this.f42384E;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public ac.c U() {
        ac.c cVar;
        if (this.f42386G != null) {
            return this.f42386G;
        }
        synchronized (this) {
            try {
                if (this.f42386G == null) {
                    this.f42386G = new ac.d(this);
                }
                cVar = this.f42386G;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public ac.e V() {
        ac.e eVar;
        if (this.f42387H != null) {
            return this.f42387H;
        }
        synchronized (this) {
            try {
                if (this.f42387H == null) {
                    this.f42387H = new ac.f(this);
                }
                eVar = this.f42387H;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Sb.b W() {
        Sb.b bVar;
        if (this.f42399w != null) {
            return this.f42399w;
        }
        synchronized (this) {
            try {
                if (this.f42399w == null) {
                    this.f42399w = new Sb.c(this);
                }
                bVar = this.f42399w;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public Tb.b X() {
        Tb.b bVar;
        if (this.f42398v != null) {
            return this.f42398v;
        }
        synchronized (this) {
            try {
                if (this.f42398v == null) {
                    this.f42398v = new Tb.c(this);
                }
                bVar = this.f42398v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // com.ui.wifiman.db.WifimanDB
    public InterfaceC4238b Y() {
        InterfaceC4238b interfaceC4238b;
        if (this.f42383D != null) {
            return this.f42383D;
        }
        synchronized (this) {
            try {
                if (this.f42383D == null) {
                    this.f42383D = new C4239c(this);
                }
                interfaceC4238b = this.f42383D;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC4238b;
    }

    @Override // m2.q
    protected androidx.room.c g() {
        return new androidx.room.c(this, new HashMap(0), new HashMap(0), "speedTestServer", "settings", "session", "discoveryListUiState", "deviceInformation", "wifiScan", "wizardState", "appReviewState", "speedTestId", "speedTestEnv", "speedTestMeasurement", "bluetoothListUiState", "signalMapperPlaces", "signalMapperPlaceName", "signalMapperUiState", "speedtestSettings", "teleportWizardState", "ssoAccount", "wifimanWizardAdoption", "console", "cloudConsoles", "discoveryHome", "favoriteHost", "floorplanRecord", "floorplanGpx", "directConsoleConnectionPopup", "wifiNetworkDetail");
    }

    @Override // m2.q
    protected SupportSQLiteOpenHelper h(C6748f c6748f) {
        return c6748f.f53015c.create(SupportSQLiteOpenHelper.Configuration.a(c6748f.f53013a).c(c6748f.f53014b).b(new m2.s(c6748f, new a(69), "ef3df847d6d240519519ee77ffcabe3b", "b3126cbb2544e031699805839aaab9eb")).a());
    }

    @Override // m2.q
    public List j(Map map) {
        return new ArrayList();
    }

    @Override // m2.q
    public Set o() {
        return new HashSet();
    }

    @Override // m2.q
    protected Map p() {
        HashMap map = new HashMap();
        map.put(Vb.a.class, Vb.b.l());
        map.put(Ub.a.class, Ub.b.l());
        map.put(AbstractC4082a.class, C4083b.l());
        map.put(Mb.a.class, Mb.b.l());
        map.put(Ob.a.class, Ob.b.e());
        map.put(Tb.b.class, Tb.c.l());
        map.put(Sb.b.class, Sb.c.l());
        map.put(Wb.j.class, Wb.k.k());
        map.put(Wb.h.class, Wb.i.l());
        map.put(Wb.a.class, Wb.b.m());
        map.put(Zb.a.class, Zb.b.l());
        map.put(Xb.e.class, Xb.g.B());
        map.put(Yb.b.class, Yb.d.e());
        map.put(InterfaceC4238b.class, C4239c.f());
        map.put(Lb.b.class, Lb.c.i());
        map.put(Nb.e.class, Nb.f.f());
        map.put(ac.c.class, ac.d.l());
        map.put(ac.e.class, ac.f.f());
        map.put(Pb.c.class, Pb.d.l());
        map.put(Pb.e.class, Pb.f.l());
        map.put(Pb.a.class, Pb.b.l());
        map.put(Rb.a.class, Rb.b.g());
        map.put(Nb.a.class, Nb.b.i());
        return map;
    }
}
