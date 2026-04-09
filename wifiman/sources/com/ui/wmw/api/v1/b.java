package com.ui.wmw.api.v1;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final ApiV1BluetoothSettings f45422a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ApiV1BluetoothSettings settings) {
            super(null);
            AbstractC6492s.i(settings, "settings");
            this.f45422a = settings;
        }

        public final ApiV1BluetoothSettings a() {
            return this.f45422a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f45422a, ((a) obj).f45422a);
        }

        public int hashCode() {
            return this.f45422a.hashCode();
        }

        public String toString() {
            return "BluetoothSettingsChanges(settings=" + this.f45422a + ")";
        }
    }

    /* renamed from: com.ui.wmw.api.v1.b$b, reason: collision with other inner class name */
    public static final class C1673b extends b {

        /* renamed from: a, reason: collision with root package name */
        private final ApiV1Firmware f45423a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1673b(ApiV1Firmware fw) {
            super(null);
            AbstractC6492s.i(fw, "fw");
            this.f45423a = fw;
        }

        public final ApiV1Firmware a() {
            return this.f45423a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1673b) && AbstractC6492s.d(this.f45423a, ((C1673b) obj).f45423a);
        }

        public int hashCode() {
            return this.f45423a.hashCode();
        }

        public String toString() {
            return "FirmwareStateChanged(fw=" + this.f45423a + ")";
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f45424a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1381058387;
        }

        public String toString() {
            return "SettingsChanged";
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        private final ApiV1DeviceStatistics f45425a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ApiV1DeviceStatistics stats) {
            super(null);
            AbstractC6492s.i(stats, "stats");
            this.f45425a = stats;
        }

        public final ApiV1DeviceStatistics a() {
            return this.f45425a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC6492s.d(this.f45425a, ((d) obj).f45425a);
        }

        public int hashCode() {
            return this.f45425a.hashCode();
        }

        public String toString() {
            return "StatisticsChanged(stats=" + this.f45425a + ")";
        }
    }

    public static final class e extends b {

        /* renamed from: a, reason: collision with root package name */
        private final ApiV1WifiScanDone f45426a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ApiV1WifiScanDone info) {
            super(null);
            AbstractC6492s.i(info, "info");
            this.f45426a = info;
        }

        public final ApiV1WifiScanDone a() {
            return this.f45426a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC6492s.d(this.f45426a, ((e) obj).f45426a);
        }

        public int hashCode() {
            return this.f45426a.hashCode();
        }

        public String toString() {
            return "WifiScanDone(info=" + this.f45426a + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
