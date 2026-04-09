package com.ui.wifiman.db;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import jh.AbstractC6329b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import n2.AbstractC6867a;

/* loaded from: classes3.dex */
public abstract class B {

    public static final class A extends AbstractC6867a {
        A() {
            super(34, 35);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `signalMapperUiState` (`id` INTEGER NOT NULL, `tutorialShown` INTEGER NOT NULL, `section` TEXT NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$B, reason: collision with other inner class name */
    public static final class C1377B extends AbstractC6867a {
        C1377B() {
            super(35, 36);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestId ADD COLUMN unifiControllerId TEXT");
        }
    }

    public static final class C extends AbstractC6867a {
        C() {
            super(36, 37);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `speedtestSettings` (`id` INTEGER NOT NULL, `uispReportEnabled` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    public static final class D extends AbstractC6867a {
        D() {
            super(37, 38);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
        }
    }

    public static final class E extends AbstractC6867a {
        E() {
            super(38, 39);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS deviceInformation (`hwAddrId` TEXT NOT NULL, `mac` TEXT NOT NULL, `favorite` INTEGER NOT NULL, `customName` TEXT, `updated` INTEGER NOT NULL, PRIMARY KEY(`hwAddrId`))");
        }
    }

    public static final class F extends AbstractC6867a {
        F() {
            super(39, 40);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS teleportWizardState (`id` INTEGER NOT NULL, `dataCollectionApproved` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    public static final class G extends AbstractC6867a {
        G() {
            super(3, 4);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `settings` (`id` INTEGER NOT NULL, `themeId` TEXT NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    public static final class H extends AbstractC6867a {
        H() {
            super(40, 41);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS wifimanWizardAdoption (`id` INTEGER NOT NULL, `mac` TEXT NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    public static final class I extends AbstractC6867a {
        I() {
            super(41, 42);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE wizardState ADD COLUMN bluetoothScanHandled INTEGER");
        }
    }

    public static final class J extends AbstractC6867a {
        J() {
            super(42, 43);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS ssoAccount (`uuid` TEXT NOT NULL, `username` TEXT NOT NULL, `first_name` TEXT, `last_name` TEXT, `email` TEXT NOT NULL, `avatarUrl` TEXT, `verified` INTEGER, `privacy_revision` TEXT, `terms_revision` TEXT, `isPrimary` INTEGER NOT NULL, `updated` INTEGER NOT NULL, PRIMARY KEY(`uuid`))");
        }
    }

    public static final class K extends AbstractC6867a {
        K() {
            super(43, 44);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("DROP TABLE IF EXISTS speedTestContest");
        }
    }

    public static final class L extends AbstractC6867a {
        L() {
            super(44, 45);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE teleportWizardState ADD COLUMN consoleSelectedId TEXT");
        }
    }

    public static final class M extends AbstractC6867a {
        M() {
            super(45, 46);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS console (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `network_name` TEXT, `wanIp` TEXT, `sku` TEXT, `imageId` INTEGER, `imageEngine` INTEGER, `latitude` REAL, `longitude` REAL, `location_text` TEXT, PRIMARY KEY(`id`))");
        }
    }

    public static final class N extends AbstractC6867a {
        N() {
            super(46, 47);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS cloudConsoles (`id` TEXT NOT NULL, `ssoAccountId` TEXT NOT NULL, `fw` TEXT, `name` TEXT, `locLon` REAL, `locLat` REAL, `locText` TEXT, `available` INTEGER, `model` TEXT, `product` TEXT, `owner` INTEGER, `network_version` TEXT, `network_teleportAvailability` TEXT, PRIMARY KEY(`id`))");
        }
    }

    public static final class O extends AbstractC6867a {
        O() {
            super(47, 48);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE wifimanWizardAdoption ADD COLUMN fw_recommended TEXT");
        }
    }

    public static final class P extends AbstractC6867a {
        P() {
            super(48, 49);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestMeasurement ADD COLUMN server_product_image_url TEXT");
            Cursor cursorQuery = db2.query("SELECT id, server_product_id FROM speedTestMeasurement");
            try {
                if (cursorQuery.moveToFirst()) {
                    int columnIndex = cursorQuery.getColumnIndex("id");
                    int columnIndex2 = cursorQuery.getColumnIndex("server_product_id");
                    do {
                        long j10 = cursorQuery.getLong(columnIndex);
                        Integer numValueOf = cursorQuery.isNull(columnIndex2) ? null : Integer.valueOf(cursorQuery.getInt(columnIndex2));
                        if (numValueOf != null) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("server_product_image_url", "https://static.ubnt.com/fingerprint/0/" + numValueOf + "_257x257.png");
                            Yg.J j11 = Yg.J.f24997a;
                            db2.update("speedTestMeasurement", 2, contentValues, "id = ?", new String[]{String.valueOf(j10)});
                        }
                    } while (cursorQuery.moveToNext());
                }
                Yg.J j12 = Yg.J.f24997a;
                AbstractC6329b.a(cursorQuery, null);
            } finally {
            }
        }
    }

    public static final class Q extends AbstractC6867a {
        Q() {
            super(49, 50);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE console ADD COLUMN imageIdStr TEXT");
            Cursor cursorQuery = db2.query("SELECT id, imageId FROM console");
            try {
                if (cursorQuery.moveToFirst()) {
                    int columnIndex = cursorQuery.getColumnIndex("id");
                    int columnIndex2 = cursorQuery.getColumnIndex("imageId");
                    do {
                        long j10 = cursorQuery.getLong(columnIndex);
                        Integer numValueOf = cursorQuery.isNull(columnIndex2) ? null : Integer.valueOf(cursorQuery.getInt(columnIndex2));
                        if (numValueOf != null) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("imageIdStr", numValueOf.toString());
                            Yg.J j11 = Yg.J.f24997a;
                            db2.update("console", 2, contentValues, "id = ?", new String[]{String.valueOf(j10)});
                        }
                    } while (cursorQuery.moveToNext());
                }
                Yg.J j12 = Yg.J.f24997a;
                AbstractC6329b.a(cursorQuery, null);
            } finally {
            }
        }
    }

    public static final class R extends AbstractC6867a {
        R() {
            super(4, 5);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE settings ADD COLUMN distanceUnitId TEXT NOT NULL default 'metric'");
            db2.execSQL("ALTER TABLE settings ADD COLUMN channelsShowFrequencies INTEGER NOT NULL default " + B.t0(false));
            db2.execSQL("ALTER TABLE settings ADD COLUMN discoveryKeepScreenOn INTEGER NOT NULL default " + B.t0(true));
            db2.execSQL("ALTER TABLE settings ADD COLUMN speedtestKeepScreenOn INTEGER NOT NULL default " + B.t0(true));
        }
    }

    public static final class S extends AbstractC6867a {
        S() {
            super(50, 51);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE bluetoothListUiState ADD COLUMN ubiquitiGrouped INTEGER NOT NULL default " + B.t0(true));
            db2.execSQL("CREATE TABLE IF NOT EXISTS discoveryHome (`id` INTEGER NOT NULL, `tab` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db2.execSQL("DROP TABLE IF EXISTS signalListUiState");
            db2.execSQL("DROP TABLE IF EXISTS wirelessHomeState");
            db2.execSQL("DROP TABLE IF EXISTS channelsUiState");
            db2.execSQL("DROP TABLE IF EXISTS permissionsUiState");
            db2.execSQL("DROP TABLE IF EXISTS wifiScan");
            db2.execSQL("CREATE TABLE IF NOT EXISTS wifiScan (`id` INTEGER NOT NULL, `chart_spectrum` TEXT NOT NULL, `linkedOnTop` INTEGER NOT NULL, `show_hidden` INTEGER NOT NULL, `sort_type` TEXT NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    public static final class T extends AbstractC6867a {
        T() {
            super(51, 52);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestMeasurement ADD COLUMN download_bits_history TEXT");
            db2.execSQL("ALTER TABLE speedTestMeasurement ADD COLUMN upload_bits_history TEXT");
            db2.execSQL("ALTER TABLE speedTestMeasurement ADD COLUMN server_provider_secondary TEXT");
        }
    }

    public static final class U extends AbstractC6867a {
        U() {
            super(52, 53);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS favoriteHost (`id` INTEGER NOT NULL, `host` TEXT NOT NULL, `priority` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            db2.execSQL("CREATE UNIQUE INDEX index_host ON favoriteHost (host)");
        }
    }

    public static final class V extends AbstractC6867a {
        V() {
            super(53, 54);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE signalMapperUiState ADD COLUMN tab TEXT NOT NULL default 'signal'");
        }
    }

    public static final class W extends AbstractC6867a {
        W() {
            super(54, 55);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE signalMapperPlaces ADD COLUMN signalCellSimPrimaryIndex INTEGER");
            db2.execSQL("ALTER TABLE signalMapperPlaces ADD COLUMN signalCellSim0 INTEGER");
            db2.execSQL("ALTER TABLE signalMapperPlaces ADD COLUMN signalCellSim0Type TEXT");
            db2.execSQL("ALTER TABLE signalMapperPlaces ADD COLUMN signalCellSim1 INTEGER");
            db2.execSQL("ALTER TABLE signalMapperPlaces ADD COLUMN signalCellSim1Type TEXT");
        }
    }

    public static final class X extends AbstractC6867a {
        X() {
            super(55, 56);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS floorplanRecord (`id` INTEGER NOT NULL, `name` TEXT, `ssid` TEXT, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            db2.execSQL("CREATE INDEX index_floorplan_record_timestamp ON floorplanRecord (timestamp)");
            db2.execSQL("CREATE INDEX index_floorplan_record_name ON floorplanRecord (name)");
            db2.execSQL("CREATE TABLE IF NOT EXISTS floorplanGpx (`id` INTEGER NOT NULL, `gpx` TEXT NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    public static final class Y extends AbstractC6867a {
        Y() {
            super(56, 57);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE cloudConsoles ADD COLUMN mac TEXT");
        }
    }

    public static final class Z extends AbstractC6867a {
        Z() {
            super(57, 58);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE wizardState ADD COLUMN notifPermHandled INTEGER");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$a, reason: case insensitive filesystem */
    public static final class C5133a extends AbstractC6867a {
        C5133a() {
            super(10, 11);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN server_provider_url TEXT");
        }
    }

    public static final class a0 extends AbstractC6867a {
        a0() {
            super(58, 59);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("DROP TABLE IF EXISTS wifiScan");
            db2.execSQL("CREATE TABLE IF NOT EXISTS wifiScan (`id` INTEGER NOT NULL, `chart_spectrum` TEXT NOT NULL, `sort_type` TEXT NOT NULL, `sort_type_quality` TEXT NOT NULL, `scan_feature` TEXT NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    public static final class b extends AbstractC6867a {
        b() {
            super(11, 12);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `wifiScan` (`id` INTEGER NOT NULL, `chart_spectrum` TEXT NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    public static final class b0 extends AbstractC6867a {
        b0() {
            super(59, 60);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = db2.query("SELECT id FROM console");
            try {
                if (cursorQuery.moveToFirst()) {
                    int columnIndex = cursorQuery.getColumnIndex("id");
                    do {
                        String string = cursorQuery.getString(columnIndex);
                        if (!B.s0(string)) {
                            arrayList.add(string);
                        }
                    } while (cursorQuery.moveToNext());
                }
                Yg.J j10 = Yg.J.f24997a;
                AbstractC6329b.a(cursorQuery, null);
                Z7.b.h("SSO Hotfix Migration - deleting " + arrayList.size() + " tunnel records", null, 2, null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    db2.execSQL("DELETE FROM console WHERE id='" + ((String) it.next()) + "'");
                }
            } finally {
            }
        }
    }

    /* renamed from: com.ui.wifiman.db.B$c, reason: case insensitive filesystem */
    public static final class C5134c extends AbstractC6867a {
        C5134c() {
            super(12, 13);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN connection_type TEXT");
            db2.execSQL("UPDATE speedTestResult SET connection_type = 'WiFi' WHERE ssid IS NOT NULL");
            db2.execSQL("UPDATE speedTestResult SET connection_type = 'Mobile.3G' WHERE ssid IS NULL");
        }
    }

    public static final class c0 extends AbstractC6867a {
        c0() {
            super(5, 6);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE settings ADD COLUMN channelsShowFrequencies_5ghz INTEGER NOT NULL default " + B.t0(false));
        }
    }

    /* renamed from: com.ui.wifiman.db.B$d, reason: case insensitive filesystem */
    public static final class C5135d extends AbstractC6867a {
        C5135d() {
            super(13, 14);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `speedTestServer` (`id` TEXT NOT NULL, `city` TEXT NOT NULL, `country` TEXT NOT NULL, `countryCode` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `provider` TEXT NOT NULL, `providerUrl` TEXT, `speedMbps` INTEGER NOT NULL, `url` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    public static final class d0 extends AbstractC6867a {
        d0() {
            super(60, 61);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedtestSettings ADD COLUMN advancedTestEnabled INTEGER NOT NULL default " + B.t0(false));
        }
    }

    /* renamed from: com.ui.wifiman.db.B$e, reason: case insensitive filesystem */
    public static final class C5136e extends AbstractC6867a {
        C5136e() {
            super(14, 15);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE settings ADD COLUMN dayNightId TEXT NOT NULL DEFAULT 'light'");
            db2.execSQL("UPDATE settings SET dayNightId = 'dark' WHERE themeId IS 'dark'");
            db2.execSQL("UPDATE settings SET themeId = 'default'");
        }
    }

    public static final class e0 extends AbstractC6867a {
        e0() {
            super(61, 62);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestMeasurement ADD COLUMN public_ip_provider TEXT");
            db2.execSQL("ALTER TABLE speedTestMeasurement ADD COLUMN public_ip_provider_image TEXT");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$f, reason: case insensitive filesystem */
    public static final class C5137f extends AbstractC6867a {
        C5137f() {
            super(15, 16);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE settings ADD COLUMN screen_orientation TEXT NOT NULL DEFAULT 'portrait'");
        }
    }

    public static final class f0 extends AbstractC6867a {
        f0() {
            super(62, 63);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE signalMapperUiState ADD COLUMN signalType TEXT NOT NULL default 'wifi'");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$g, reason: case insensitive filesystem */
    public static final class C5138g extends AbstractC6867a {
        C5138g() {
            super(16, 17);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE signalListUiState ADD COLUMN show_hidden INTEGER NOT NULL default " + B.t0(true));
        }
    }

    public static final class g0 extends AbstractC6867a {
        g0() {
            super(63, 64);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            String string;
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE teleportWizardState ADD COLUMN tunnelPrimaryId TEXT");
            Cursor cursorQuery = db2.query("SELECT * FROM teleportWizardState");
            try {
                if (cursorQuery.moveToFirst()) {
                    int columnIndex = cursorQuery.getColumnIndex("consoleSelectedId");
                    string = cursorQuery.isNull(columnIndex) ? null : cursorQuery.getString(columnIndex);
                }
                Yg.J j10 = Yg.J.f24997a;
                AbstractC6329b.a(cursorQuery, null);
                if (string != null && !kotlin.text.t.m0(string)) {
                    db2.execSQL("UPDATE teleportWizardState SET tunnelPrimaryId = '" + ((Object) string) + "'");
                }
                db2.execSQL("ALTER TABLE console ADD COLUMN consoleId TEXT NOT NULL default 'not_set'");
                db2.execSQL("ALTER TABLE console ADD COLUMN ssoAccountId TEXT");
                db2.execSQL("ALTER TABLE console ADD COLUMN publicSecret TEXT");
                cursorQuery = db2.query("SELECT id FROM console");
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex2 = cursorQuery.getColumnIndex("id");
                        do {
                            String string2 = cursorQuery.getString(columnIndex2);
                            if (B.s0(string2)) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("consoleId", "invitation-" + ((Object) string2));
                                contentValues.put("publicSecret", string2);
                                Yg.J j11 = Yg.J.f24997a;
                                db2.update("console", 2, contentValues, "id = ?", new String[]{string2});
                            } else {
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("consoleId", string2);
                                Yg.J j12 = Yg.J.f24997a;
                                db2.update("console", 2, contentValues2, "id = ?", new String[]{string2});
                            }
                        } while (cursorQuery.moveToNext());
                    }
                    AbstractC6329b.a(cursorQuery, null);
                    db2.execSQL("CREATE UNIQUE INDEX index_console_id ON console (consoleId)");
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    /* renamed from: com.ui.wifiman.db.B$h, reason: case insensitive filesystem */
    public static final class C5139h extends AbstractC6867a {
        C5139h() {
            super(17, 18);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00fe A[LOOP:0: B:66:0x0075->B:31:0x00fe, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00fd A[EDGE_INSN: B:68:0x00fd->B:30:0x00fd BREAK  A[LOOP:0: B:66:0x0075->B:31:0x00fe], SYNTHETIC] */
        @Override // n2.AbstractC6867a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(androidx.sqlite.db.SupportSQLiteDatabase r19) {
            /*
                Method dump skipped, instructions count: 372
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.db.B.C5139h.a(androidx.sqlite.db.SupportSQLiteDatabase):void");
        }
    }

    public static final class h0 extends AbstractC6867a {
        h0() {
            super(64, 65);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS directConsoleConnectionPopup (`consoleId` TEXT NOT NULL, `recommended` INTEGER NOT NULL, `cert` TEXT, PRIMARY KEY(`consoleId`))");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$i, reason: case insensitive filesystem */
    public static final class C5140i extends AbstractC6867a {
        C5140i() {
            super(18, 19);
        }

        /* JADX WARN: Removed duplicated region for block: B:158:0x0216 A[EDGE_INSN: B:158:0x0216->B:85:0x0216 BREAK  A[LOOP:0: B:136:0x00c2->B:86:0x0217], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0217 A[LOOP:0: B:136:0x00c2->B:86:0x0217, LOOP_END] */
        @Override // n2.AbstractC6867a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(androidx.sqlite.db.SupportSQLiteDatabase r36) {
            /*
                Method dump skipped, instructions count: 701
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.db.B.C5140i.a(androidx.sqlite.db.SupportSQLiteDatabase):void");
        }
    }

    public static final class i0 extends AbstractC6867a {
        i0() {
            super(65, 66);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE settings ADD COLUMN teleport_tile_service_added INTEGER NOT NULL default " + B.t0(false));
        }
    }

    /* renamed from: com.ui.wifiman.db.B$j, reason: case insensitive filesystem */
    public static final class C5141j extends AbstractC6867a {
        C5141j() {
            super(19, 20);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `wirelessHomeState` (`id` INTEGER NOT NULL, `section` TEXT NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    public static final class j0 extends AbstractC6867a {
        j0() {
            super(66, 67);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestEnv ADD COLUMN band_id TEXT");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$k, reason: case insensitive filesystem */
    public static final class C5142k extends AbstractC6867a {
        C5142k() {
            super(1, 2);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN downloadHistory TEXT");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN uploadHistory TEXT");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN speedTestServerIP TEXT");
        }
    }

    public static final class k0 extends AbstractC6867a {
        k0() {
            super(67, 68);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS wifiNetworkDetail (`sort_type_networks_ap` TEXT NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$l, reason: case insensitive filesystem */
    public static final class C5143l extends AbstractC6867a {
        C5143l() {
            super(20, 21);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN dns_servers TEXT");
        }
    }

    public static final class l0 extends AbstractC6867a {
        l0() {
            super(68, 69);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestMeasurement ADD COLUMN jitter INTEGER");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$m, reason: case insensitive filesystem */
    public static final class C5144m extends AbstractC6867a {
        C5144m() {
            super(21, 22);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `wizardState` (`id` INTEGER NOT NULL, `locationHandled` INTEGER, `localSpeedtestHandled` INTEGER, PRIMARY KEY(`id`))");
        }
    }

    public static final class m0 extends AbstractC6867a {
        m0() {
            super(6, 7);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `session` (`id` INTEGER NOT NULL, `sessionID` TEXT NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$n, reason: case insensitive filesystem */
    public static final class C5145n extends AbstractC6867a {
        C5145n() {
            super(22, 23);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `speedTestContest` (`id` INTEGER NOT NULL, `serverId` TEXT, `qualified` INTEGER NOT NULL, `connection_type` INTEGER NOT NULL, `notified` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    public static final class n0 extends AbstractC6867a {
        n0() {
            super(7, 8);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `discoveryListUiState` (`id` INTEGER NOT NULL, `sortType` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `signalListUiState` (`id` INTEGER NOT NULL, `mode` TEXT NOT NULL, `wifi_linkedOnTop` INTEGER NOT NULL, `wifi_sort_type` TEXT NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$o, reason: case insensitive filesystem */
    public static final class C5146o extends AbstractC6867a {
        C5146o() {
            super(23, 24);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN server_name TEXT");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN server_product_id INTEGER");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN server_product_image_engine INTEGER");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN server_product TEXT");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN server_wifi_experience INTEGER");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN server_a2a_device_type TEXT");
        }
    }

    public static final class o0 extends AbstractC6867a {
        o0() {
            super(8, 9);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `deviceInfo` (`mac` TEXT NOT NULL, `favorite` INTEGER NOT NULL, `customName` TEXT, `customIcon` TEXT, `updated` INTEGER NOT NULL, PRIMARY KEY(`mac`))");
            db2.execSQL("ALTER TABLE discoveryListUiState ADD COLUMN favoritesOnTop INTEGER NOT NULL default " + B.t0(true));
        }
    }

    /* renamed from: com.ui.wifiman.db.B$p, reason: case insensitive filesystem */
    public static final class C5147p extends AbstractC6867a {
        C5147p() {
            super(24, 25);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `appReviewState` (`id` INTEGER NOT NULL, `appLaunchedInDays` INTEGER NOT NULL, `lastAppLaunchedTimestamp` INTEGER, `appReviewFlowDisplayed` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    public static final class p0 extends AbstractC6867a {
        p0() {
            super(9, 10);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `permissionsUiState` (`id` INTEGER NOT NULL, `locationWifiList` INTEGER NOT NULL, `bluetoothBleList` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$q, reason: case insensitive filesystem */
    public static final class C5148q extends AbstractC6867a {
        C5148q() {
            super(25, 26);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN serverId TEXT");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$r, reason: case insensitive filesystem */
    public static final class C5149r extends AbstractC6867a {
        C5149r() {
            super(26, 27);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            Z7.b.h("DB Migration onto 27 started", null, 2, null);
            Z7.b.h("CREATED speedTestServertemp", null, 2, null);
            db2.execSQL("CREATE TABLE `speedTestServertemp` (`id` TEXT NOT NULL, `city` TEXT, `country` TEXT, `countryCode` TEXT, `latitude` REAL, `longitude` REAL, `provider` TEXT, `providerUrl` TEXT, `speedMbps` INTEGER, `url` TEXT, `timestamp` INTEGER NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`id`))");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATED ");
            sb2.append("speedTestServertemp");
            Z7.b.h(sb2.toString(), null, 2, null);
            db2.execSQL("DROP TABLE IF EXISTS speedTestServer");
            Z7.b.h("DB DROPPED table speedTestServer", null, 2, null);
            db2.execSQL("ALTER TABLE speedTestServertemp RENAME TO speedTestServer");
            Z7.b.h("DB RENAMED table speedTestServertemp to speedTestServer", null, 2, null);
            Cursor cursorQuery = db2.query("SELECT * FROM speedTestServer");
            try {
                cursorQuery.moveToFirst();
                AbstractC6329b.a(cursorQuery, null);
                Z7.b.h("DB Migration 27 finished", null, 2, null);
            } finally {
            }
        }
    }

    /* renamed from: com.ui.wifiman.db.B$s, reason: case insensitive filesystem */
    public static final class C5150s extends AbstractC6867a {
        C5150s() {
            super(27, 28);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN endpoint_type TEXT NOT NULL default 'tmp'");
            db2.execSQL("UPDATE speedTestResult SET endpoint_type = 'internet' WHERE speedtest_type = 'internet'");
            db2.execSQL("UPDATE speedTestResult SET endpoint_type = 'local' WHERE speedtest_type = 'localNetwork'");
            db2.execSQL("UPDATE speedTestResult SET endpoint_type = 'app2app' WHERE speedtest_type = 'local'");
            Cursor cursorQuery = db2.query("SELECT * FROM speedTestResult");
            try {
                cursorQuery.moveToFirst();
                AbstractC6329b.a(cursorQuery, null);
            } finally {
            }
        }
    }

    /* renamed from: com.ui.wifiman.db.B$t, reason: case insensitive filesystem */
    public static final class C5151t extends AbstractC6867a {
        C5151t() {
            super(28, 29);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE discoveryListUiState ADD COLUMN ubiquitiOnTop INTEGER NOT NULL default " + B.t0(true));
        }
    }

    /* renamed from: com.ui.wifiman.db.B$u, reason: case insensitive filesystem */
    public static final class C5152u extends AbstractC6867a {
        C5152u() {
            super(29, 30);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            SupportSQLiteDatabase supportSQLiteDatabase;
            int i10;
            String str;
            String str2;
            int i11;
            String str3;
            String str4;
            int i12;
            String str5;
            String str6;
            String str7;
            String str8;
            int i13;
            String str9;
            String str10;
            int i14;
            String str11;
            String str12;
            String str13;
            int i15;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            int i16;
            String str20;
            String str21;
            String str22;
            String str23;
            String str24;
            int i17;
            String str25;
            String str26;
            String str27;
            String str28;
            String str29;
            String str30 = "resultId";
            String str31 = "topology";
            String str32 = "timestamp";
            String str33 = "id";
            AbstractC6492s.i(db2, "db");
            long jCurrentTimeMillis = System.currentTimeMillis();
            db2.execSQL("CREATE TABLE IF NOT EXISTS `speedTestId` (`id` INTEGER NOT NULL, `serverId` TEXT, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            db2.execSQL("CREATE INDEX index_timestamp ON speedTestId (timestamp)");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `speedTestEnv` (`resultId` INTEGER NOT NULL, `connection_type` TEXT, `ssid` TEXT, `topology` TEXT, `ap_name` TEXT, `wifi_mode` TEXT, `signal` INTEGER, `channel` INTEGER, `channel_width` TEXT, `rate_download` INTEGER, `rate_upload` INTEGER, `wifi_experience` REAL, `dns_servers` TEXT, PRIMARY KEY(`resultId`))");
            db2.execSQL("CREATE INDEX index_connectionType ON speedTestEnv (connection_type)");
            db2.execSQL("CREATE INDEX index_ssid ON speedTestEnv (ssid)");
            db2.execSQL("CREATE INDEX index_connTypeAndSsid ON speedTestEnv (connection_type,ssid)");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `speedTestMeasurement` (`id` INTEGER NOT NULL, `resultId` INTEGER NOT NULL, `speedtest_type` TEXT NOT NULL, `latency` INTEGER, `downloadBits` INTEGER, `uploadBits` INTEGER, `endpoint_type` TEXT NOT NULL, `server_ip` TEXT NOT NULL, `server_name` TEXT, `server_provider` TEXT, `server_provider_url` TEXT, `server_location_city` TEXT, `server_location_country` TEXT, `server_product_id` INTEGER, `server_product_image_engine` INTEGER, `server_product` TEXT, `server_wifi_experience` INTEGER, `server_a2a_device_type` TEXT, PRIMARY KEY(`id`))");
            db2.execSQL("CREATE INDEX index_resultId ON speedTestMeasurement (resultId)");
            Cursor cursorQuery = db2.query("SELECT * FROM speedTestResult");
            try {
                if (cursorQuery.moveToFirst()) {
                    Z7.b.h("There is stuff to migrate", null, 2, null);
                    int columnIndex = cursorQuery.getColumnIndex("id");
                    int columnIndex2 = cursorQuery.getColumnIndex("ssid");
                    int columnIndex3 = cursorQuery.getColumnIndex("connection_type");
                    String str34 = "ssid";
                    int columnIndex4 = cursorQuery.getColumnIndex("speedTestServerIP");
                    int columnIndex5 = cursorQuery.getColumnIndex("server_provider");
                    String str35 = "server_provider";
                    int columnIndex6 = cursorQuery.getColumnIndex("server_provider_url");
                    String str36 = "server_provider_url";
                    int columnIndex7 = cursorQuery.getColumnIndex("server_location_city");
                    String str37 = "server_location_city";
                    int columnIndex8 = cursorQuery.getColumnIndex("server_location_country");
                    String str38 = "server_location_country";
                    int columnIndex9 = cursorQuery.getColumnIndex("latency");
                    int i18 = columnIndex8;
                    int columnIndex10 = cursorQuery.getColumnIndex("downloadBits");
                    int i19 = columnIndex7;
                    int columnIndex11 = cursorQuery.getColumnIndex("uploadBits");
                    int i20 = columnIndex6;
                    int columnIndex12 = cursorQuery.getColumnIndex("timestamp");
                    int i21 = columnIndex5;
                    int columnIndex13 = cursorQuery.getColumnIndex("topology");
                    String str39 = "uploadBits";
                    int i22 = columnIndex11;
                    int columnIndex14 = cursorQuery.getColumnIndex("ap_name");
                    String str40 = "downloadBits";
                    int i23 = columnIndex10;
                    int columnIndex15 = cursorQuery.getColumnIndex("wifi_mode");
                    String str41 = "latency";
                    int i24 = columnIndex9;
                    String str42 = "signal";
                    int columnIndex16 = cursorQuery.getColumnIndex("signal");
                    String str43 = "channel";
                    int columnIndex17 = cursorQuery.getColumnIndex("channel");
                    String str44 = "channel_width";
                    int columnIndex18 = cursorQuery.getColumnIndex("channel_width");
                    String str45 = "rate_download";
                    int columnIndex19 = cursorQuery.getColumnIndex("rate_download");
                    String str46 = "rate_upload";
                    int columnIndex20 = cursorQuery.getColumnIndex("rate_upload");
                    String str47 = "speedtest_type";
                    int columnIndex21 = cursorQuery.getColumnIndex("speedtest_type");
                    String str48 = "wifi_experience";
                    int columnIndex22 = cursorQuery.getColumnIndex("wifi_experience");
                    String str49 = "dns_servers";
                    int columnIndex23 = cursorQuery.getColumnIndex("dns_servers");
                    String str50 = "server_name";
                    int columnIndex24 = cursorQuery.getColumnIndex("server_name");
                    String str51 = "server_product_id";
                    int columnIndex25 = cursorQuery.getColumnIndex("server_product_id");
                    String str52 = "server_product_image_engine";
                    int columnIndex26 = cursorQuery.getColumnIndex("server_product_image_engine");
                    String str53 = "server_product";
                    int columnIndex27 = cursorQuery.getColumnIndex("server_product");
                    String str54 = "server_wifi_experience";
                    int columnIndex28 = cursorQuery.getColumnIndex("server_wifi_experience");
                    String str55 = "server_a2a_device_type";
                    int columnIndex29 = cursorQuery.getColumnIndex("server_a2a_device_type");
                    int columnIndex30 = cursorQuery.getColumnIndex("serverId");
                    String str56 = "wifi_mode";
                    String str57 = "endpoint_type";
                    int i25 = columnIndex15;
                    int columnIndex31 = cursorQuery.getColumnIndex(str57);
                    while (true) {
                        long j10 = cursorQuery.getLong(columnIndex);
                        int i26 = columnIndex;
                        String str58 = str57;
                        ContentValues contentValues = new ContentValues();
                        int i27 = columnIndex31;
                        contentValues.put(str33, Long.valueOf(j10));
                        if (!cursorQuery.isNull(columnIndex30)) {
                            contentValues.put("serverId", cursorQuery.getString(columnIndex30));
                        }
                        contentValues.put(str32, Long.valueOf(cursorQuery.getLong(columnIndex12)));
                        Yg.J j11 = Yg.J.f24997a;
                        supportSQLiteDatabase = db2;
                        String str59 = str33;
                        supportSQLiteDatabase.insert("speedTestId", 2, contentValues);
                        ContentValues contentValues2 = new ContentValues();
                        String str60 = str32;
                        String str61 = str30;
                        contentValues2.put(str61, Long.valueOf(j10));
                        if (!cursorQuery.isNull(columnIndex3)) {
                            contentValues2.put("connection_type", cursorQuery.getString(columnIndex3));
                        }
                        if (cursorQuery.isNull(columnIndex2)) {
                            i10 = columnIndex3;
                            str = str34;
                        } else {
                            i10 = columnIndex3;
                            str = str34;
                            contentValues2.put(str, cursorQuery.getString(columnIndex2));
                        }
                        if (!cursorQuery.isNull(columnIndex13)) {
                            contentValues2.put(str31, cursorQuery.getString(columnIndex13));
                        }
                        if (!cursorQuery.isNull(columnIndex14)) {
                            contentValues2.put("ap_name", cursorQuery.getString(columnIndex14));
                        }
                        int i28 = i25;
                        if (cursorQuery.isNull(i28)) {
                            str34 = str;
                            i25 = i28;
                            str2 = str56;
                        } else {
                            str34 = str;
                            String string = cursorQuery.getString(i28);
                            i25 = i28;
                            str2 = str56;
                            contentValues2.put(str2, string);
                        }
                        int i29 = columnIndex16;
                        if (cursorQuery.isNull(i29)) {
                            i11 = i29;
                            str3 = str2;
                            str4 = str42;
                        } else {
                            i11 = i29;
                            str3 = str2;
                            str4 = str42;
                            contentValues2.put(str4, Integer.valueOf(cursorQuery.getInt(i29)));
                        }
                        int i30 = columnIndex17;
                        if (cursorQuery.isNull(i30)) {
                            i12 = i30;
                            str5 = str4;
                            str6 = str43;
                        } else {
                            i12 = i30;
                            str5 = str4;
                            str6 = str43;
                            contentValues2.put(str6, Integer.valueOf(cursorQuery.getInt(i30)));
                        }
                        int i31 = columnIndex18;
                        if (cursorQuery.isNull(i31)) {
                            columnIndex18 = i31;
                            str43 = str6;
                            str7 = str44;
                        } else {
                            str43 = str6;
                            String string2 = cursorQuery.getString(i31);
                            columnIndex18 = i31;
                            str7 = str44;
                            contentValues2.put(str7, string2);
                        }
                        int i32 = columnIndex19;
                        if (cursorQuery.isNull(i32)) {
                            str44 = str7;
                            columnIndex19 = i32;
                            str8 = str45;
                        } else {
                            str44 = str7;
                            Integer numValueOf = Integer.valueOf(cursorQuery.getInt(i32));
                            columnIndex19 = i32;
                            str8 = str45;
                            contentValues2.put(str8, numValueOf);
                        }
                        int i33 = columnIndex20;
                        if (cursorQuery.isNull(i33)) {
                            i13 = i33;
                            str9 = str8;
                            str10 = str46;
                        } else {
                            i13 = i33;
                            str9 = str8;
                            str10 = str46;
                            contentValues2.put(str10, Integer.valueOf(cursorQuery.getInt(i33)));
                        }
                        int i34 = columnIndex22;
                        if (cursorQuery.isNull(i34)) {
                            i14 = i34;
                            str11 = str10;
                            str12 = str48;
                        } else {
                            i14 = i34;
                            str11 = str10;
                            str12 = str48;
                            contentValues2.put(str12, Float.valueOf(cursorQuery.getFloat(i34)));
                        }
                        int i35 = columnIndex23;
                        if (cursorQuery.isNull(i35)) {
                            columnIndex23 = i35;
                            str48 = str12;
                            str13 = str49;
                        } else {
                            str48 = str12;
                            String string3 = cursorQuery.getString(i35);
                            columnIndex23 = i35;
                            str13 = str49;
                            contentValues2.put(str13, string3);
                        }
                        supportSQLiteDatabase.insert("speedTestEnv", 2, contentValues2);
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put(str61, Long.valueOf(j10));
                        str49 = str13;
                        int i36 = columnIndex21;
                        int i37 = columnIndex2;
                        String str62 = str47;
                        contentValues3.put(str62, cursorQuery.getString(i36));
                        int i38 = i24;
                        if (cursorQuery.isNull(i38)) {
                            i15 = i38;
                            str14 = str62;
                            str15 = str41;
                        } else {
                            i15 = i38;
                            str14 = str62;
                            str15 = str41;
                            contentValues3.put(str15, Integer.valueOf(cursorQuery.getInt(i38)));
                        }
                        int i39 = i23;
                        if (cursorQuery.isNull(i39)) {
                            i23 = i39;
                            str41 = str15;
                            str16 = str40;
                        } else {
                            i23 = i39;
                            str41 = str15;
                            str16 = str40;
                            contentValues3.put(str16, Long.valueOf(cursorQuery.getLong(i39)));
                        }
                        int i40 = i22;
                        if (cursorQuery.isNull(i40)) {
                            i22 = i40;
                            str40 = str16;
                        } else {
                            i22 = i40;
                            str40 = str16;
                            String str63 = str39;
                            contentValues3.put(str63, Long.valueOf(cursorQuery.getLong(i40)));
                            str39 = str63;
                        }
                        contentValues3.put(str58, cursorQuery.getString(i27));
                        int i41 = columnIndex4;
                        if (cursorQuery.isNull(i41)) {
                            str17 = str58;
                            str18 = str31;
                        } else {
                            str17 = str58;
                            str18 = str31;
                            contentValues3.put("server_ip", cursorQuery.getString(i41));
                        }
                        int i42 = columnIndex24;
                        if (cursorQuery.isNull(i42)) {
                            columnIndex24 = i42;
                            str19 = str50;
                        } else {
                            String string4 = cursorQuery.getString(i42);
                            columnIndex24 = i42;
                            str19 = str50;
                            contentValues3.put(str19, string4);
                        }
                        int i43 = i21;
                        if (cursorQuery.isNull(i43)) {
                            str50 = str19;
                            i16 = i41;
                            str20 = str35;
                        } else {
                            str50 = str19;
                            i16 = i41;
                            str20 = str35;
                            contentValues3.put(str20, cursorQuery.getString(i43));
                        }
                        int i44 = i20;
                        if (cursorQuery.isNull(i44)) {
                            i20 = i44;
                            str35 = str20;
                            str21 = str36;
                        } else {
                            str35 = str20;
                            String string5 = cursorQuery.getString(i44);
                            i20 = i44;
                            str21 = str36;
                            contentValues3.put(str21, string5);
                        }
                        int i45 = i19;
                        if (cursorQuery.isNull(i45)) {
                            str36 = str21;
                            i19 = i45;
                            str22 = str37;
                        } else {
                            str36 = str21;
                            String string6 = cursorQuery.getString(i45);
                            i19 = i45;
                            str22 = str37;
                            contentValues3.put(str22, string6);
                        }
                        int i46 = i18;
                        if (cursorQuery.isNull(i46)) {
                            i18 = i46;
                            str37 = str22;
                            str23 = str38;
                        } else {
                            str37 = str22;
                            String string7 = cursorQuery.getString(i46);
                            i18 = i46;
                            str23 = str38;
                            contentValues3.put(str23, string7);
                        }
                        int i47 = columnIndex25;
                        if (cursorQuery.isNull(i47)) {
                            str38 = str23;
                            columnIndex25 = i47;
                            str24 = str51;
                        } else {
                            str38 = str23;
                            Integer numValueOf2 = Integer.valueOf(cursorQuery.getInt(i47));
                            columnIndex25 = i47;
                            str24 = str51;
                            contentValues3.put(str24, numValueOf2);
                        }
                        int i48 = columnIndex26;
                        if (cursorQuery.isNull(i48)) {
                            i17 = i48;
                            str25 = str24;
                            str26 = str52;
                        } else {
                            i17 = i48;
                            str25 = str24;
                            str26 = str52;
                            contentValues3.put(str26, Integer.valueOf(cursorQuery.getInt(i48)));
                        }
                        int i49 = columnIndex27;
                        if (cursorQuery.isNull(i49)) {
                            columnIndex27 = i49;
                            str52 = str26;
                            str27 = str53;
                        } else {
                            str52 = str26;
                            String string8 = cursorQuery.getString(i49);
                            columnIndex27 = i49;
                            str27 = str53;
                            contentValues3.put(str27, string8);
                        }
                        int i50 = columnIndex28;
                        if (cursorQuery.isNull(i50)) {
                            str53 = str27;
                            columnIndex28 = i50;
                            str28 = str54;
                        } else {
                            str53 = str27;
                            Float fValueOf = Float.valueOf(cursorQuery.getFloat(i50));
                            columnIndex28 = i50;
                            str28 = str54;
                            contentValues3.put(str28, fValueOf);
                        }
                        int i51 = columnIndex29;
                        if (cursorQuery.isNull(i51)) {
                            columnIndex29 = i51;
                            str54 = str28;
                            str29 = str55;
                        } else {
                            str54 = str28;
                            String string9 = cursorQuery.getString(i51);
                            columnIndex29 = i51;
                            str29 = str55;
                            contentValues3.put(str29, string9);
                        }
                        supportSQLiteDatabase.insert("speedTestMeasurement", 2, contentValues3);
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        str55 = str29;
                        columnIndex3 = i10;
                        columnIndex2 = i37;
                        str33 = str59;
                        columnIndex = i26;
                        columnIndex31 = i27;
                        str30 = str61;
                        columnIndex21 = i36;
                        str57 = str17;
                        str32 = str60;
                        int i52 = i16;
                        i21 = i43;
                        str31 = str18;
                        columnIndex4 = i52;
                        int i53 = i17;
                        str51 = str25;
                        columnIndex26 = i53;
                        int i54 = i14;
                        str46 = str11;
                        columnIndex22 = i54;
                        int i55 = i13;
                        str45 = str9;
                        columnIndex20 = i55;
                        int i56 = i12;
                        str42 = str5;
                        columnIndex17 = i56;
                        int i57 = i11;
                        str56 = str3;
                        columnIndex16 = i57;
                        int i58 = i15;
                        str47 = str14;
                        i24 = i58;
                    }
                } else {
                    supportSQLiteDatabase = db2;
                }
                Yg.J j12 = Yg.J.f24997a;
                AbstractC6329b.a(cursorQuery, null);
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS speedTestResult");
                Z7.b.h("DB DROPPED table speedTestResult", null, 2, null);
                Z7.b.h("Update to DB version 30 took " + (System.currentTimeMillis() - jCurrentTimeMillis), null, 2, null);
            } finally {
            }
        }
    }

    /* renamed from: com.ui.wifiman.db.B$v, reason: case insensitive filesystem */
    public static final class C5153v extends AbstractC6867a {
        C5153v() {
            super(2, 3);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN server_provider TEXT");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN server_location_city TEXT");
            db2.execSQL("ALTER TABLE speedTestResult ADD COLUMN server_location_country TEXT");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$w, reason: case insensitive filesystem */
    public static final class C5154w extends AbstractC6867a {
        C5154w() {
            super(30, 31);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE speedTestEnv ADD COLUMN signalAP INTEGER");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$x, reason: case insensitive filesystem */
    public static final class C5155x extends AbstractC6867a {
        C5155x() {
            super(31, 32);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("DROP TABLE IF EXISTS deviceInfo");
            db2.execSQL("CREATE TABLE IF NOT EXISTS deviceInfo (`hwAddrId` TEXT NOT NULL, `mac` TEXT NOT NULL, `favorite` INTEGER NOT NULL, `customName` TEXT, `updated` INTEGER NOT NULL, PRIMARY KEY(`hwAddrId`))");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$y, reason: case insensitive filesystem */
    public static final class C5156y extends AbstractC6867a {
        C5156y() {
            super(32, 33);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `bluetoothListUiState` (`id` INTEGER NOT NULL, `connectedOnTop` INTEGER NOT NULL, `sort_type` TEXT NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    /* renamed from: com.ui.wifiman.db.B$z, reason: case insensitive filesystem */
    public static final class C5157z extends AbstractC6867a {
        C5157z() {
            super(33, 34);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `signalMapperPlaces` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `ssid` TEXT, `bssid` TEXT, `apName` TEXT, `apModel` TEXT, `signal` INTEGER, `throughput` INTEGER, `latency` INTEGER, `latencyDns` INTEGER, `packetLoss` INTEGER, `wifiBand` TEXT, `ieeeMode` TEXT, `created` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            db2.execSQL("CREATE INDEX index_signal_mapper_place_name ON signalMapperPlaces (name)");
            db2.execSQL("CREATE INDEX index_signal_mapper_place_created ON signalMapperPlaces (created)");
            db2.execSQL("CREATE TABLE IF NOT EXISTS `signalMapperPlaceName` (`name` TEXT NOT NULL, `created` INTEGER NOT NULL, PRIMARY KEY(`name`))");
            db2.execSQL("CREATE INDEX index_signal_mapper_place_name_created ON signalMapperPlaceName (created)");
        }
    }

    public static final AbstractC6867a A() {
        return new C5156y();
    }

    public static final AbstractC6867a B() {
        return new C5157z();
    }

    public static final AbstractC6867a C() {
        return new A();
    }

    public static final AbstractC6867a D() {
        return new C1377B();
    }

    public static final AbstractC6867a E() {
        return new C();
    }

    public static final AbstractC6867a F() {
        return new D();
    }

    public static final AbstractC6867a G() {
        return new E();
    }

    public static final AbstractC6867a H() {
        return new F();
    }

    public static final AbstractC6867a I() {
        return new G();
    }

    public static final AbstractC6867a J() {
        return new H();
    }

    public static final AbstractC6867a K() {
        return new I();
    }

    public static final AbstractC6867a L() {
        return new J();
    }

    public static final AbstractC6867a M() {
        return new K();
    }

    public static final AbstractC6867a N() {
        return new L();
    }

    public static final AbstractC6867a O() {
        return new M();
    }

    public static final AbstractC6867a P() {
        return new N();
    }

    public static final AbstractC6867a Q() {
        return new O();
    }

    public static final AbstractC6867a R() {
        return new P();
    }

    public static final AbstractC6867a S() {
        return new Q();
    }

    public static final AbstractC6867a T() {
        return new R();
    }

    public static final AbstractC6867a U() {
        return new S();
    }

    public static final AbstractC6867a V() {
        return new T();
    }

    public static final AbstractC6867a W() {
        return new U();
    }

    public static final AbstractC6867a X() {
        return new V();
    }

    public static final AbstractC6867a Y() {
        return new W();
    }

    public static final AbstractC6867a Z() {
        return new X();
    }

    public static final AbstractC6867a a0() {
        return new Y();
    }

    public static final AbstractC6867a b0() {
        return new Z();
    }

    public static final AbstractC6867a c() {
        return new C5133a();
    }

    public static final AbstractC6867a c0() {
        return new a0();
    }

    public static final AbstractC6867a d() {
        return new b();
    }

    public static final AbstractC6867a d0() {
        return new b0();
    }

    public static final AbstractC6867a e() {
        return new C5134c();
    }

    public static final AbstractC6867a e0() {
        return new c0();
    }

    public static final AbstractC6867a f() {
        return new C5135d();
    }

    public static final AbstractC6867a f0() {
        return new d0();
    }

    public static final AbstractC6867a g() {
        return new C5136e();
    }

    public static final AbstractC6867a g0() {
        return new e0();
    }

    public static final AbstractC6867a h() {
        return new C5137f();
    }

    public static final AbstractC6867a h0() {
        return new f0();
    }

    public static final AbstractC6867a i() {
        return new C5138g();
    }

    public static final AbstractC6867a i0() {
        return new g0();
    }

    public static final AbstractC6867a j() {
        return new C5139h();
    }

    public static final AbstractC6867a j0() {
        return new h0();
    }

    public static final AbstractC6867a k() {
        return new C5140i();
    }

    public static final AbstractC6867a k0() {
        return new i0();
    }

    public static final AbstractC6867a l() {
        return new C5141j();
    }

    public static final AbstractC6867a l0() {
        return new j0();
    }

    public static final AbstractC6867a m() {
        return new C5142k();
    }

    public static final AbstractC6867a m0() {
        return new k0();
    }

    public static final AbstractC6867a n() {
        return new C5143l();
    }

    public static final AbstractC6867a n0() {
        return new l0();
    }

    public static final AbstractC6867a o() {
        return new C5144m();
    }

    public static final AbstractC6867a o0() {
        return new m0();
    }

    public static final AbstractC6867a p() {
        return new C5145n();
    }

    public static final AbstractC6867a p0() {
        return new n0();
    }

    public static final AbstractC6867a q() {
        return new C5146o();
    }

    public static final AbstractC6867a q0() {
        return new o0();
    }

    public static final AbstractC6867a r() {
        return new C5147p();
    }

    public static final AbstractC6867a r0() {
        return new p0();
    }

    public static final AbstractC6867a s() {
        return new C5148q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s0(String str) {
        try {
            UUID.fromString(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final AbstractC6867a t() {
        return new C5149r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t0(boolean z10) {
        if (z10) {
            return 1;
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        return 0;
    }

    public static final AbstractC6867a u() {
        return new C5150s();
    }

    public static final AbstractC6867a v() {
        return new C5151t();
    }

    public static final AbstractC6867a w() {
        return new C5152u();
    }

    public static final AbstractC6867a x() {
        return new C5153v();
    }

    public static final AbstractC6867a y() {
        return new C5154w();
    }

    public static final AbstractC6867a z() {
        return new C5155x();
    }
}
